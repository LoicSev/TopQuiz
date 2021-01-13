package fr.loicsevillano.topquiz.model;

import java.util.Collections;
import java.util.List;

/**
 * Created by Loic Sevillano on 05/01/2021.
 */
public class QuestionBank {

    private List<Question> mQuestionList;
    private int mNextQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;
        Collections.shuffle(mQuestionList);
        mNextQuestionIndex = 0;
    }

    public Question getQuestion() {
        if (mNextQuestionIndex == mQuestionList.size()){
            mNextQuestionIndex = 0;
        }
        return mQuestionList.get(mNextQuestionIndex++);
    }
}
