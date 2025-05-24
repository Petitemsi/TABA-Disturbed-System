package com.example.sum;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        SumServiceGrpc.SumServiceBlockingStub stub = SumServiceGrpc.newBlockingStub(channel);

        SumRequest request = SumRequest.newBuilder()
                                       .addAllNumbers(Arrays.asList(5, 10, 15))
                                       .build();

        SumResponse response = stub.calculateSum(request);
        System.out.println(" Sum from server: " + response.getSum());

        channel.shutdown();
    }
}
