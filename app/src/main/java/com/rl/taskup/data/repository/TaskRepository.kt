package com.rl.taskup.data.repository

import com.rl.taskup.data.local.dao.TaskDao
import com.rl.taskup.data.model.Task
import kotlinx.coroutines.flow.Flow

class TaskRepository(private val taskDao: TaskDao) {

    val tasks: Flow<List<Task>> = taskDao.getTasks()


    suspend fun addTask(task: Task) {
        taskDao.insert(task)
    }

    suspend fun updateTask(task: Task) {
        taskDao.update(task)
    }

    suspend fun deleteTask(task: Task) {
        taskDao.delete(task)
    }
}