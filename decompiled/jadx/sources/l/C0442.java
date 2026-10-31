package l;

import android.view.WindowInsets;

/* JADX INFO: renamed from: l.֡ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4Z7 */
/* JADX INFO: loaded from: classes3.dex */
public class C0442 extends C19494 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C11007 f1933;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C11007 f1934;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C11007 f1935;

    @Override // l.C18788, l.C1148
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1998(C11007 c11007) {
    }

    public C0442(C21610 c21610, WindowInsets windowInsets) {
        super(c21610, windowInsets);
        this.f1934 = null;
        this.f1933 = null;
        this.f1935 = null;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11007 mo2001() {
        if (this.f1934 == null) {
            this.f1934 = C11007.m27342(this.f12605.getSystemGestureInsets());
        }
        return this.f1934;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C11007 mo1999() {
        if (this.f1933 == null) {
            this.f1933 = C11007.m27342(this.f12605.getMandatorySystemGestureInsets());
        }
        return this.f1933;
    }

    @Override // l.C1148
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C11007 mo2000() {
        if (this.f1935 == null) {
            this.f1935 = C11007.m27342(this.f12605.getTappableElementInsets());
        }
        return this.f1935;
    }

    @Override // l.C3971, l.C1148
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21610 mo1997(int i, int i2, int i3, int i4) {
        return C21610.m48814(null, this.f12605.inset(i, i2, i3, i4));
    }
}
