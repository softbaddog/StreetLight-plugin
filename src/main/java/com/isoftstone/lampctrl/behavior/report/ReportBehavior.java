package com.isoftstone.lampctrl.behavior.report;

import com.fasterxml.jackson.databind.node.ArrayNode;

/**
 * ClassName: TaskBehavior
 * Package: com.isoftstone.lampctl.taskbehavior
 * Description:
 *
 * @Date: 2019/11/26 14:21
 * @Author: softbaddog@sina.com
 */
public interface ReportBehavior {
    ArrayNode report(String[] dataArray);

    ArrayNode passthroughReport(String data);
}
