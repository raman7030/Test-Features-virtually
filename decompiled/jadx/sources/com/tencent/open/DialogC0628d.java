package com.tencent.open;

import android.os.Bundle;
import android.webkit.WebView;
import p067l.C11060;

/* JADX INFO: renamed from: com.tencent.open.d */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public class DialogC0628d extends AbstractDialogC0627c {
    @Override // com.tencent.open.AbstractDialogC0627c, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        getWindow().setSoftInputMode(16);
        getWindow().setSoftInputMode(1);
        throw null;
    }

    @Override // com.tencent.open.AbstractDialogC0627c
    /* JADX INFO: renamed from: ֫ */
    public final void mo2039(String str) {
        C11060.m25464("openSDK_LOG.PKDialog", "--onConsoleMessage--");
        try {
            this.f2139.mo26978((WebView) null, str);
        } catch (Exception unused) {
        }
    }
}
