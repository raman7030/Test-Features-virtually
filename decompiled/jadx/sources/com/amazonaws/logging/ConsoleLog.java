package com.amazonaws.logging;

/* JADX INFO: loaded from: classes.dex */
public final class ConsoleLog implements Log {

    /* JADX INFO: renamed from: ֫ */
    public final String f1385;

    public ConsoleLog(String str) {
        this.f1385 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m1467(LogFactory.Level level, Object obj, Exception exc) {
        System.out.printf("%s/%s: %s\n", this.f1385, level.name(), obj);
        if (exc != null) {
            System.out.println(exc.toString());
        }
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final void mo1457(String str) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.ERROR, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final void mo1458(String str, Exception exc) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.DEBUG, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1459() {
        int i = LogFactory.f1386;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final void mo1460(String str) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.DEBUG, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final void mo1461(String str, Exception exc) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.ERROR, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1462() {
        int i = LogFactory.f1386;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ */
    public final void mo1463(String str) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.INFO, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ */
    public final void mo1464(String str, Exception exc) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.WARN, str, exc);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܿ */
    public final void mo1465(String str) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.TRACE, str, null);
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1466(String str) {
        int i = LogFactory.f1386;
        m1467(LogFactory.Level.WARN, str, null);
    }
}
