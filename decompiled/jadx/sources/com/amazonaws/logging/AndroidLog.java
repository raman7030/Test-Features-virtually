package com.amazonaws.logging;

/* JADX INFO: loaded from: classes.dex */
public class AndroidLog implements Log {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f224;

    public AndroidLog(String str) {
        this.f224 = str;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo293() {
        if (!android.util.Log.isLoggable(this.f224, 3)) {
            return false;
        }
        int i = LogFactory.f226;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean mo296() {
        if (!android.util.Log.isLoggable(this.f224, 6)) {
            return false;
        }
        int i = LogFactory.f226;
        return true;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo291(String str) {
        int i = LogFactory.f226;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo292(String str, Exception exc) {
        int i = LogFactory.f226;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo294(String str) {
        int i = LogFactory.f226;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo295(String str, Exception exc) {
        int i = LogFactory.f226;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo297(String str) {
        int i = LogFactory.f226;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo298(String str, Exception exc) {
        int i = LogFactory.f226;
        str.getClass();
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo299(String str) {
        int i = LogFactory.f226;
    }

    @Override // com.amazonaws.logging.Log
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo300(String str) {
        int i = LogFactory.f226;
        str.getClass();
    }
}
