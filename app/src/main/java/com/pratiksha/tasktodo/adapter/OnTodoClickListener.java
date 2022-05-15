package com.pratiksha.tasktodo.adapter;

import com.pratiksha.tasktodo.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
