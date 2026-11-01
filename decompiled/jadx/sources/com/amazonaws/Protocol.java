package com.amazonaws;

import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;

/* JADX INFO: loaded from: classes.dex */
public enum Protocol {
    HTTP(C0170a.f680s),
    HTTPS(C0171b.f688a);


    /* JADX INFO: renamed from: ᩸ */
    public final String f1272;

    Protocol(String str) {
        this.f1272 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1272;
    }
}
