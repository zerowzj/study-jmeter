package study.test;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySampler extends AbstractJavaSamplerClient {

    Logger LOGGER = LoggerFactory.getLogger(MySampler.class);

    /**
     * 测试，从cxt参数可以获得参数值
     */
    @Override
    public SampleResult runTest(JavaSamplerContext context) {
        SampleResult sr = new SampleResult();
        sr.setSampleLabel("LabelLabelLabelLabelLabelLabelLabelLabel");
        //TODO
        sr.sampleStart();
        try {
            String num1 = context.getParameter("num1");
            String num2 = context.getParameter("num2");
            System.out.println("num1=" + num1 + "num2=" + num2);
            LOGGER.info("num1=" + num1 + "num2=" + num2);
            sr.setSuccessful(true);
            sr.setResponseData(num1 + num2, "UTF-8");
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
