package com.example.sum;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;

public class GrpcClientAsync {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        SumServiceGrpc.SumServiceStub asyncStub = SumServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        SumRequest request = SumRequest.newBuilder()
                .addAllNumbers(Arrays.asList(7, 8, 9))
                .build();

        asyncStub.calculateSum(request, new StreamObserver<SumResponse>() {
            @Override
            public void onNext(SumResponse response) {
                System.out.println(" Async sum from server: " + response.getSum());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error: " + t.getMessage());
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println (" Async call completed.");
                latch.countDown();
            }
        });

        latch.await();
        channel.shutdown();
    }
}
