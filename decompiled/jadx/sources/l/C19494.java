package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.᩵ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes5.dex */
public class C19494 extends C18788 {
    public C19494(C21610 c21610, WindowInsets windowInsets) {
        super(c21610, windowInsets);
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ᩳ */
    public C5157 mo3945() {
        return C5157.m14740(this.f12605.getDisplayCutout());
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ֫ */
    public C21610 mo3933() {
        return C21610.m48814(null, this.f12605.consumeDisplayCutout());
    }

    @Override // l.C3971, l.C1148
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19494)) {
            return false;
        }
        C19494 c19494 = (C19494) obj;
        return C11003.equals(this.f12605, c19494.f12605) && C11003.equals(this.f12604, c19494.f12604);
    }

    @Override // l.C1148
    public int hashCode() {
        return this.f12605.hashCode();
    }
}
