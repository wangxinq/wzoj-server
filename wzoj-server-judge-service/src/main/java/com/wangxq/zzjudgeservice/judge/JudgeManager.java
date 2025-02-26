package com.wangxq.zzjudgeservice.judge;

import com.wangxq.zzjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.wangxq.zzjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.wangxq.zzjudgeservice.judge.strategy.JudgeContext;
import com.wangxq.zzjudgeservice.judge.strategy.JudgeStrategy;
import com.wangxq.zzmodel.model.codesandbox.JudgeInfo;
import com.wangxq.zzmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
