package study.test;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class C extends AbstractJavaSamplerClient {

    @Override
    public SampleResult runTest(JavaSamplerContext cxt) {
        return null;
    }

    @Override
    public Arguments getDefaultParameters() {
        Arguments arg = new Arguments();
        arg.addArgument("", "");
        return arg;
    }
}
