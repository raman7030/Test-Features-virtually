package l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩵᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZR */
/* JADX INFO: loaded from: classes4.dex */
public final class C19756 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0704 f63813;

    public C19756(C0704 c0704) {
        this.f63813 = c0704;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C0704 c0704 = this.f63813;
        c0704.m6893((Serializable) boolValueOf);
        c0704.m49260(z);
    }
}
