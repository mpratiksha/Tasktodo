package com.pratiksha.tasktodo.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<Task> selectedItem = new MutableLiveData<>();

    private boolean isEdit;

    public void selectItem(Task task){
        selectedItem.setValue(task);
    }

    public LiveData<Task> getSelecetedItem(){
        return selectedItem;
    }
    public void setIsEdit(boolean isEdit){
        this.isEdit = isEdit;
    }
    public boolean getisEdit(){
        return isEdit;
    }
}
