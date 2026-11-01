package com.alipay.sdk.p010m.p016c0;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p058y.C0244g;

/* JADX INFO: renamed from: com.alipay.sdk.m.c0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0092b {

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.b$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements DialogInterface.OnKeyListener {
        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Dialog m498a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builderM497a = m497a(context, str, str3, onClickListener, str4, onClickListener2);
        builderM497a.setTitle(str);
        builderM497a.setMessage(str2);
        AlertDialog alertDialogCreate = builderM497a.create();
        alertDialogCreate.setCanceledOnTouchOutside(false);
        alertDialogCreate.setOnKeyListener(new a());
        try {
            alertDialogCreate.show();
            return alertDialogCreate;
        } catch (Throwable th) {
            C0244g.m1198a(C0170a.f659B, "showDialog ", th);
            return alertDialogCreate;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AlertDialog.Builder m497a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
            builder.setPositiveButton(str3, onClickListener2);
        }
        if (!TextUtils.isEmpty(str2) && onClickListener != null) {
            builder.setNegativeButton(str2, onClickListener);
        }
        return builder;
    }
}
