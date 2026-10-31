package l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܰ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13694 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7345 f40881;

    public C13694(C7345 c7345) {
        this.f40881 = c7345;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C7345 c7345 = this.f40881;
        c7345.m6893((Serializable) boolValueOf);
        c7345.m49260(z);
    }
}
