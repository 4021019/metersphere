package io.metersphere.base.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiModule implements Serializable {
    private String id;

    private String projectId;

    private String name;

    private String parentId;

    private Integer level;

    private String protocol;

    private Long createTime;

    private Long updateTime;

    private static final long serialVersionUID = 1L;
}