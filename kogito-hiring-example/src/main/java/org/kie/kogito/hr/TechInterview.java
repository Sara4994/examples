package org.kie.kogito.hr;

public class TechInterview {

    private boolean java;
    private boolean javaScript;
    private boolean react;
    private boolean kogito;
    private boolean quarkus;

    private String comments;
    private boolean hire;

    public TechInterview() {
    }

    public TechInterview(boolean java, boolean javaScript, boolean react, boolean kogito, boolean quarkus, String comments, boolean hire) {
        this.java = java;
        this.javaScript = javaScript;
        this.react = react;
        this.kogito = kogito;
        this.quarkus = quarkus;
        this.comments = comments;
        this.hire = hire;
    }

    public boolean isJava() {
        return java;
    }

    public void setJava(boolean java) {
        this.java = java;
    }

    public boolean isJavaScript() {
        return javaScript;
    }

    public void setJavaScript(boolean javaScript) {
        this.javaScript = javaScript;
    }

    public boolean isReact() {
        return react;
    }

    public void setReact(boolean react) {
        this.react = react;
    }

    public boolean isKogito() {
        return kogito;
    }

    public void setKogito(boolean kogito) {
        this.kogito = kogito;
    }

    public boolean isQuarkus() {
        return quarkus;
    }

    public void setQuarkus(boolean quarkus) {
        this.quarkus = quarkus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isHire() {
        return hire;
    }

    public void setHire(boolean hire) {
        this.hire = hire;
    }
}
