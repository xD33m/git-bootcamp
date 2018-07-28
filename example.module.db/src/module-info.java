module example.module.db {
    exports example.module.db;

    requires transitive example.module.common;
    requires sqlite.jdbc;
    requires java.sql;
}