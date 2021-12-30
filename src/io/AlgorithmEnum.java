package io;

public enum AlgorithmEnum {

    /**
     * 算法列表
     */
    SHA1("SHA1"),

    MD5("MD5"),
    ;


    /**
     * 算法名称
     */
    private String name;


    AlgorithmEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
