package com.amazonaws.logging;

/* JADX INFO: loaded from: classes.dex */
public final class ConsoleLog implements Log {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f225;

    public ConsoleLog(String str) {
        this.f225 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m301(LogFactory.Level level, Object obj, Exception exc) {
        System.out.printf("%s/%s: %s\n", this.f225, level.name(), obj);
        if (exc != null) {
            System.out.println(exc.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final void mo291(String str) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.ERROR, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final void mo292(String str, Exception exc) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.DEBUG, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo293() {
        int i = LogFactory.f226;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final void mo294(String str) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.DEBUG, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final void mo295(String str, Exception exc) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.ERROR, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo296() {
        int i = LogFactory.f226;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ */
    public final void mo297(String str) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.INFO, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ */
    public final void mo298(String str, Exception exc) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.WARN, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܿ */
    public final void mo299(String str) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.TRACE, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩳ */
    public final void mo300(String str) {
        int i = LogFactory.f226;
        m301(LogFactory.Level.WARN, str, null);
    }
}
