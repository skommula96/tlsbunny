package com.gypsyengineer.tlsbunny.tls13.connection.action.simple;

import com.gypsyengineer.tlsbunny.tls13.connection.action.AbstractAction;
import com.gypsyengineer.tlsbunny.tls13.connection.action.Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.nio.ByteBuffer;

public class IncomingData extends AbstractAction {

    private static final Logger logger = LogManager.getLogger(IncomingData.class);

    @Override
    public String name() {
        return String.format("incoming data");
    }

    @Override
    public Action run() {
        out = ByteBuffer.allocate(in.remaining());
        out.put(in);
        out.position(0);
        logger.info("received %d bytes", out.remaining());

        return this;
    }

}
