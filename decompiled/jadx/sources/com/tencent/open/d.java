package com.tencent.open;

import android.os.Bundle;
import android.webkit.WebView;
import l.C9145;

/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class d extends c {
    @Override // com.tencent.open.c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        throw null;
    }

    @Override // com.tencent.open.c
    /* JADX INFO: renamed from: ֫ */
    public final void mo924(String str) {
        C9145.m23513("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f905.mo24963((WebView) null, str);
        } catch (Exception unused) {
        }
    }
}
