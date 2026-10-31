package l;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import bin.mt.plus.Main;
import com.google.android.material.datepicker.MaterialDatePicker;

/* JADX INFO: renamed from: l.ۚ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 19AV */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC5021 implements View.OnClickListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15812;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f15813;

    public /* synthetic */ ViewOnClickListenerC5021(int i, Object obj) {
        this.f15812 = i;
        this.f15813 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15812;
        Object obj = this.f15813;
        switch (i) {
            case 0:
                Main main = (Main) obj;
                try {
                    Intent launchIntentForPackage = main.getPackageManager().getLaunchIntentForPackage("moe.shizuku.privileged.api");
                    if (launchIntentForPackage != null) {
                        main.startActivity(launchIntentForPackage);
                    }
                } catch (Exception e) {
                    main.m10223(e, (DialogInterface.OnDismissListener) null);
                    return;
                }
                break;
            case 1:
                int i2 = ActivityC6372.f19707;
                ((ActivityC6372) obj).finish();
                break;
            case 2:
                ((ActivityC0814) obj).m3058();
                break;
            default:
                ((MaterialDatePicker) obj).lambda$initHeaderToggle$0(view);
                break;
        }
    }
}
