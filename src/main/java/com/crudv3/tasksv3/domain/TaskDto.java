package com.crudv3.tasksv3.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TaskDto {

    private Long id;
    private String title;
    private String content;

}
