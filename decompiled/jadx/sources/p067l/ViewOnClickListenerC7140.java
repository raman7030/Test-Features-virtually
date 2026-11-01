package p067l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import bin.p000mt.plus.Main;
import com.google.android.material.datepicker.MaterialDatePicker;

/* JADX INFO: renamed from: l.ۚ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC7140 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ int f18644;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Object f18645;

    public /* synthetic */ ViewOnClickListenerC7140(int i, Object obj) {
        this.f18644 = i;
        this.f18645 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f18644;
        Object obj = this.f18645;
        switch (i) {
            case 0:
                Main main = (Main) obj;
                try {
                    Intent launchIntentForPackage = main.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                    if (launchIntentForPackage != null) {
                        main.startActivity(launchIntentForPackage);
                    }
                } catch (Exception e) {
                    main.m12259(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            case 1:
                int i2 = ActivityC8425.f22580;
                ((ActivityC8425) obj).finish();
                break;
            case 2:
                ((ActivityC3142) obj).m5371();
                break;
            default:
                ((MaterialDatePicker) obj).lambda$initHeaderToggle$0(view);
                break;
        }
    }
}
