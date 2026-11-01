package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۢۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11225 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C24104.m53360(ApplicationC21448.f67649, "enable_auto_signature", z);
        if (ApplicationC21448.f67649.getBoolean("show_auto_settings_tip", true)) {
            C22682.m50799(R.string.MT_Protector);
        }
    }
}
