package p067l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S5T9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7733 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3709 f20273;

    public C7733(C3709 c3709) {
        this.f20273 = c3709;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C3709 c3709 = this.f20273;
        c3709.m9019((Serializable) boolValueOf);
        c3709.m51612(z);
    }
}
