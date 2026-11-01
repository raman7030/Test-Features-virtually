package p067l;

import android.widget.CompoundButton;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܰ۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 05VZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15383 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9349 f43963;

    public C15383(C9349 c9349) {
        this.f43963 = c9349;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        C9349 c9349 = this.f43963;
        c9349.m9019((Serializable) boolValueOf);
        c9349.m51612(z);
    }
}
