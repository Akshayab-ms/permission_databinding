package com.example.databinding.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.databinding.models.Employee;

public class ViewModelData extends AndroidViewModel {
    Employee employee;
    public ViewModelData(@NonNull Application application) {
        super(application);
        employee=new Employee("ll");
    }

    public Employee getEmployee() {
        return this.employee;
    }
}
