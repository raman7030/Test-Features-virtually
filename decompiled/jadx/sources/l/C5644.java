package l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5T9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5644 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1410 f17427;

    public C5644(C1410 c1410) {
        this.f17427 = c1410;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C1410 c1410 = this.f17427;
        c1410.m6893((Serializable) boolValueOf);
        c1410.m49260(z);
    }
}
