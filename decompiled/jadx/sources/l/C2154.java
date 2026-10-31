package l;

/* JADX INFO: renamed from: l.֫᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: E43E */
/* JADX INFO: loaded from: classes2.dex */
public final class C2154 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f7135;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f7136;

    public C2154() {
        this.f7136 = -1;
        this.f7135 = -1;
    }

    public C2154(int i, int i2) {
        this.f7136 = i;
        this.f7135 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m7112(C2154 c2154) {
        if (c2154 == null) {
            return;
        }
        int i = this.f7136;
        if (i == -1) {
            this.f7136 = c2154.f7136;
        } else {
            int i2 = c2154.f7136;
            if (i2 != -1) {
                if (i >= i2) {
                    i = i2;
                }
                this.f7136 = i;
            }
        }
        int i3 = this.f7135;
        if (i3 == -1) {
            this.f7135 = c2154.f7135;
            return;
        }
        int i4 = c2154.f7135;
        if (i4 != -1) {
            if (i3 <= i4) {
                i3 = i4;
            }
            this.f7135 = i3;
        }
    }
}
