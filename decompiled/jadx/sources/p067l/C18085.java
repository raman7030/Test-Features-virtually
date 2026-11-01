package p067l;

import android.widget.CompoundButton;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ܽۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18085 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            compoundButton.setChecked(false);
            C22682.m50793(R.string.MT_Protector);
        }
    }
}
