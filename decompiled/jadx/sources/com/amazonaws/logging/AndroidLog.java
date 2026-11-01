package com.amazonaws.logging;

/* JADX INFO: loaded from: classes.dex */
public class AndroidLog implements Log {

    /* JADX INFO: renamed from: ֫ */
    public final String f1384;

    public AndroidLog(String str) {
        this.f1384 = str;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo1459() {
        if (!android.util.Log.isLoggable(this.f1384, 3)) {
            return false;
        }
        int i = LogFactory.f1386;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1462() {
        if (!android.util.Log.isLoggable(this.f1384, 6)) {
            return false;
        }
        int i = LogFactory.f1386;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final void mo1457(String str) {
        int i = LogFactory.f1386;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫ */
    public final void mo1458(String str, Exception exc) {
        int i = LogFactory.f1386;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final void mo1460(String str) {
        int i = LogFactory.f1386;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ */
    public final void mo1461(String str, Exception exc) {
        int i = LogFactory.f1386;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ */
    public final void mo1463(String str) {
        int i = LogFactory.f1386;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ */
    public final void mo1464(String str, Exception exc) {
        int i = LogFactory.f1386;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܿ */
    public final void mo1465(String str) {
        int i = LogFactory.f1386;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩳ */
    public final void mo1466(String str) {
        int i = LogFactory.f1386;
        str.getClass();
    }
}
