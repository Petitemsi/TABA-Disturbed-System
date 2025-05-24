package com.example.sum;

import io.grpc.stub.StreamObserver;

public class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {

    @Override
    public void calculateSum(SumRequest request, StreamObserver<SumResponse> responseObserver) {
        int sum = request.getNumbersList().stream().mapToInt(Integer::intValue).sum();
        SumResponse response = SumResponse.newBuilder().setSum(sum).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
