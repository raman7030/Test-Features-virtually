package p067l;

/* JADX INFO: renamed from: l.֫᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes2.dex */
public final class C4416 {

    /* JADX INFO: renamed from: ֫ */
    public int f9921;

    /* JADX INFO: renamed from: ۧ */
    public int f9922;

    public C4416() {
        this.f9922 = -1;
        this.f9921 = -1;
    }

    public C4416(int i, int i2) {
        this.f9922 = i;
        this.f9921 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m9207(C4416 c4416) {
        if (c4416 == null) {
            return;
        }
        int i = this.f9922;
        if (i == -1) {
            this.f9922 = c4416.f9922;
        } else {
            int i2 = c4416.f9922;
            if (i2 != -1) {
                if (i >= i2) {
                    i = i2;
                }
                this.f9922 = i;
            }
        }
        int i3 = this.f9921;
        if (i3 == -1) {
            this.f9921 = c4416.f9921;
            return;
        }
        int i4 = c4416.f9921;
        if (i4 != -1) {
            if (i3 <= i4) {
                i3 = i4;
            }
            this.f9921 = i3;
        }
    }
}
