package p067l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21145 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C3038 f66448;

    public C21145(C3038 c3038) {
        this.f66448 = c3038;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C3038 c3038 = this.f66448;
        c3038.m9019((Serializable) boolValueOf);
        c3038.m51612(z);
    }
}
