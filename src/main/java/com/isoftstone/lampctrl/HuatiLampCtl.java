package com.isoftstone.lampctrl;

import com.isoftstone.lampctrl.behavior.ack.HuatiAck;
import com.isoftstone.lampctrl.behavior.control.HuatiControl;
import com.isoftstone.lampctrl.behavior.passthrough.HuatiPassthrough;
import com.isoftstone.lampctrl.behavior.query.HuatiQuery;
import com.isoftstone.lampctrl.behavior.report.HuatiReport;
import com.isoftstone.lampctrl.behavior.task.NoTask;

/**
 * ClassName: HuatiLampCtl
 * Package: com.isoftstone.lampctl.streetlight.huati
 * Description:
 *
 * @Date: 2019/11/26 11:51
 * @Author: softbaddog@sina.com
 */
public class HuatiLampCtl extends LampCtl {

    private static HuatiLampCtl instance = null;

    private HuatiLampCtl() {
        controlBehavior = new HuatiControl();
        queryBehavior = new HuatiQuery();
        taskBehavior = new NoTask();
        reportBehavior = new HuatiReport();
        ackBehavior = new HuatiAck();
        passthroughBehavior = new HuatiPassthrough();
    }

    public static HuatiLampCtl getInstance() {
        if (instance == null) {
            instance = new HuatiLampCtl();
        }
        return instance;
    }

    @Override
    public void display() {
        System.out.println("****Huati****");
    }
}
