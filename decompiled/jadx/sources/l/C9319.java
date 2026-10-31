package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۗܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9319 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C22870.m50970(ApplicationC20075.f65008, "enable_auto_signature", z);
        if (ApplicationC20075.f65008.getBoolean("show_auto_settings_tip", true)) {
            C21374.m48463(R.string.MT_Protector);
        }
    }
}
