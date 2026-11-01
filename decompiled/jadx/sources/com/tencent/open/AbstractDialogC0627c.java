package com.tencent.open;

import android.R;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import p067l.C16423;
import p067l.C19106;

/* JADX INFO: renamed from: com.tencent.open.c */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractDialogC0627c extends Dialog {

    /* JADX INFO: renamed from: ᩸ */
    public C19106 f2139;

    /* JADX INFO: renamed from: ᩹ */
    @SuppressLint({"NewApi"})
    public final WebChromeClient f2140;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo2039(String str);

    public AbstractDialogC0627c(Context context) {
        super(context, R.style.Theme.Translucent.NoTitleBar);
        this.f2140 = new C16423(this);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2139 = new C19106();
    }
}
