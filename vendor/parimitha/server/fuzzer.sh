#!/bin/bash

rm -rf fuzzer.log

java -cp ../../../target/tlsbunny-1.0-SNAPSHOT-all.jar \
    com.gypsyengineer.tlsbunny.tls13.client.fuzzer.DeepHandshakeFuzzyClient 2>&1 \
        | tee fuzzer.log
