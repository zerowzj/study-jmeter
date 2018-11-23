package study.test;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

public class MySampler extends AbstractJavaSamplerClient {

    /**
     * 测试，从cxt参数可以获得参数值
     */
    @Override
    public SampleResult runTest(JavaSamplerContext context) {
        SampleResult sr = new SampleResult();
        sr.setSampleLabel("");
        //TODO
        sr.sampleStart();
        try {

        } catch (Exception ex) {
            sr.setSuccessful(false);
        } finally {
            //TODO
            sr.sampleEnd();
        }
        return sr;
    }

    /**
     * 设置可用参数及的默认值
     */
    @Override
    public Arguments getDefaultParameters() {
        Arguments params = new Arguments();
        params.addArgument("num1", "");
        params.addArgument("num2", "");
        return params;
    }

    /**
     * 测试结束时调用
     */
    @Override
    public void teardownTest(JavaSamplerContext context) {

    }

    /**
     * 每个线程测试前执行一次，做一些初始化工作
     */
    @Override
    public void setupTest(JavaSamplerContext context) {

    }
}
