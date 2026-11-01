package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;
import p067l.AbstractC17043;
import p067l.ActivityC2822;
import p067l.ApplicationC21448;
import p067l.C10199;
import p067l.C18524;
import p067l.C1914;
import p067l.C20671;
import p067l.C21796;
import p067l.C22682;
import p067l.DialogInterfaceOnClickListenerC6472;
import p067l.InterfaceC13696;
import p067l.InterfaceC1583;
import p067l.InterfaceC1666;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H5PayActivity$$ExternalSyntheticLambda0 implements InterfaceC13696, InterfaceC1583, InterfaceC1666 {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ H5PayActivity$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // p067l.InterfaceC1666
    public C1914 onApplyWindowInsets(View view, C1914 c1914) {
        return H5PayActivity.m401a((View) this.f$0, view, c1914);
    }

    @Override // p067l.InterfaceC13696
    public /* synthetic */ void onCanceled() {
    }

    @Override // p067l.InterfaceC1583
    public boolean onMenuItemClick(MenuItem menuItem) {
        C21796.m49160((C21796) this.f$0, menuItem);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int[], java.io.Serializable] */
    @Override // p067l.InterfaceC13696
    public void onGetPath(Bundle bundle, String str) {
        final ActivityC2822 activityC2822 = (ActivityC2822) this.f$0;
        int i = ActivityC2822.f4836;
        final AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        ApplicationC21448.f67649.edit().putString("tfdp", str).apply();
        if (bundle.getBoolean("export")) {
            try {
                C10199.m23787(abstractC17043M42109, bundle.getIntegerArrayList("indices"));
                C22682.m50793(R.string.MT_Protector);
                return;
            } catch (Exception e) {
                activityC2822.m12259(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        final ?? r7 = {0};
        C20671 c20671BuildDialog = activityC2822.buildDialog();
        c20671BuildDialog.m46727(R.string.MT_Protector);
        c20671BuildDialog.m46711(R.array.MT_Protector, r7[0], new DialogInterfaceOnClickListenerC6472(1, r7));
        c20671BuildDialog.m46736(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܿܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC2822.m4476(activityC2822, abstractC17043M42109, r7);
            }
        });
        c20671BuildDialog.m46728(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c20671BuildDialog.m46732();
    }
}
