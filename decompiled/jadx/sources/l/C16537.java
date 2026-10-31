package l;

import android.widget.CompoundButton;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۡۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16537 implements CompoundButton.OnCheckedChangeListener {
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (z) {
            compoundButton.setChecked(false);
            C21374.m48457(R.string.MT_Protector);
        }
    }
}
