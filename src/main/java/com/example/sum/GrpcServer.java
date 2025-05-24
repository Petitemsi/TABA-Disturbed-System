package com.example.sum;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
                                     .addService(new SumServiceImpl())
                                     .build();
        System.out.println(" gRPC Server started on port 9090");
        server.start();
        server.awaitTermination();
    }
}
