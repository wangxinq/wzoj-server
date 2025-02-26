package com.wangxq.zzjudgeservice.judge.codesandbox;

import com.wangxq.zzmodel.model.codesandbox.ExecuteCodeRequest;
import com.wangxq.zzmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
