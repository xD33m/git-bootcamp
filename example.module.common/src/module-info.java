module example.module.common {
    requires javafx.base;


    exports example.module.common;
    opens example.module.common to javafx.base;
}