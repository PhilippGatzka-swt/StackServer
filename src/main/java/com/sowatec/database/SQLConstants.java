package com.sowatec.database;

public interface SQLConstants {


    String SELECT = "SELECT";
    String INSERT = "INSERT";
    String FROM = "FROM";
    String ALL = "ALL";
    String WHERE = "WHERE";
    String VALUES = "VALUES";

    String T_ANSWER = "t_answer";
    String T_ISSUE = "t_issue";
    String T_ISSUE_TAG = "t_issue_tag";
    String T_TAG = "t_tag";
    String T_USER = "t_user";
    String T_VOTE = "t_vote";

    static String buildSQL(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string).append(" ");
        }
        return builder.toString().trim();
    }
}
