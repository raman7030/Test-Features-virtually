package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ۖ᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: F15V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5073 {

    /* JADX INFO: renamed from: ֫ */
    public final int f11878;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C6414 f11879;

    /* JADX INFO: renamed from: ܽ */
    public final int f11880;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f11881;

    /* JADX INFO: renamed from: ᩳ */
    public final int f11882;

    public C5073(C6414 c6414, int i, int i2, int i3, boolean z) {
        this.f11879 = c6414;
        this.f11878 = i;
        this.f11882 = i2;
        this.f11880 = i3;
        this.f11881 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10802(C20765 c20765, C3422 c3422, int i) {
        int i2 = this.f11880;
        if (i2 == -1) {
            throw new RuntimeException();
        }
        C6414.m14687(c20765, (InterfaceC7568) ((List) this.f11879.f16599.get(i2)).get(this.f11878), this.f11882, this.f11881, c3422, i);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m10803(C20765 c20765, C3422 c3422, int i) {
        int i2 = this.f11880;
        if (i2 == -1) {
            throw new RuntimeException();
        }
        C6414.m14687(c20765, (InterfaceC7568) this.f11879.f16608.get(i2), this.f11882, this.f11881, c3422, i);
    }
}
