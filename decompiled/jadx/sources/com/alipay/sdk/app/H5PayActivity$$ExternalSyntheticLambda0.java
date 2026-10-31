package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;
import l.AbstractC15440;
import l.ActivityC0477;
import l.ApplicationC20075;
import l.C16999;
import l.C19258;
import l.C20441;
import l.C21374;
import l.C21610;
import l.C8239;
import l.DialogInterfaceOnClickListenerC4318;
import l.InterfaceC11918;
import l.InterfaceC14930;
import l.InterfaceC16610;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class H5PayActivity$$ExternalSyntheticLambda0 implements InterfaceC11918, InterfaceC14930, InterfaceC16610 {
    public final /* synthetic */ Object f$0;

    public /* synthetic */ H5PayActivity$$ExternalSyntheticLambda0(Object obj) {
        this.f$0 = obj;
    }

    @Override // l.InterfaceC16610
    public C21610 onApplyWindowInsets(View view, C21610 c21610) {
        return H5PayActivity.a((View) this.f$0, view, c21610);
    }

    @Override // l.InterfaceC11918
    public /* synthetic */ void onCanceled() {
    }

    @Override // l.InterfaceC14930
    public boolean onMenuItemClick(MenuItem menuItem) {
        C20441.m46837((C20441) this.f$0, menuItem);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [int[], java.io.Serializable] */
    @Override // l.InterfaceC11918
    public void onGetPath(Bundle bundle, String str) {
        final ActivityC0477 activityC0477 = (ActivityC0477) this.f$0;
        int i = ActivityC0477.f2061;
        final AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        ApplicationC20075.f65008.edit().putString("tfdp", str).apply();
        if (bundle.getBoolean("export")) {
            try {
                C8239.m21818(abstractC15440M39866, bundle.getIntegerArrayList("indices"));
                C21374.m48457(R.string.MT_Protector);
                return;
            } catch (Exception e) {
                activityC0477.m10223(e, (DialogInterface.OnDismissListener) null);
                return;
            }
        }
        final ?? r7 = {0};
        C19258 c19258BuildDialog = activityC0477.buildDialog();
        c19258BuildDialog.m44433(R.string.MT_Protector);
        c19258BuildDialog.m44417(R.array.MT_Protector, r7[0], new DialogInterfaceOnClickListenerC4318(1, r7));
        c19258BuildDialog.m44442(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.᩷ܿܿ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ActivityC0477.m2095(activityC0477, abstractC15440M39866, r7);
            }
        });
        c19258BuildDialog.m44434(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        c19258BuildDialog.m44438();
    }
}
