package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 31KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15800 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f48734;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f48742;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public EnumC8746 f48744;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f48743 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48738 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f48737 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f48739 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float[] f48736 = new float[9];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float[] f48741 = new float[9];

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C10863[] f48745 = new C10863[16];

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f48735 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f48740 = 0;

    public C15800(EnumC8746 enumC8746) {
        this.f48744 = enumC8746;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37437(C10863 c10863) {
        int i = 0;
        while (true) {
            int i2 = this.f48735;
            if (i < i2) {
                if (this.f48745[i] == c10863) {
                    return;
                } else {
                    i++;
                }
            } else {
                C10863[] c10863Arr = this.f48745;
                if (i2 >= c10863Arr.length) {
                    this.f48745 = (C10863[]) Arrays.copyOf(c10863Arr, c10863Arr.length * 2);
                }
                C10863[] c10863Arr2 = this.f48745;
                int i3 = this.f48735;
                c10863Arr2[i3] = c10863;
                this.f48735 = i3 + 1;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37440(C10863 c10863) {
        int i = this.f48735;
        int i2 = 0;
        while (i2 < i) {
            if (this.f48745[i2] == c10863) {
                while (i2 < i - 1) {
                    C10863[] c10863Arr = this.f48745;
                    int i3 = i2 + 1;
                    c10863Arr[i2] = c10863Arr[i3];
                    i2 = i3;
                }
                this.f48735--;
                return;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37439(C17212 c17212, C10863 c10863) {
        int i = this.f48735;
        for (int i2 = 0; i2 < i; i2++) {
            this.f48745[i2].mo24287(c17212, c10863, false);
        }
        this.f48735 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37438(C17212 c17212, float f) {
        this.f48734 = f;
        this.f48739 = true;
        int i = this.f48735;
        this.f48738 = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f48745[i2].m27162(c17212, this, false);
        }
        this.f48735 = 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37436() {
        this.f48744 = EnumC8746.UNKNOWN;
        this.f48737 = 0;
        this.f48743 = -1;
        this.f48738 = -1;
        this.f48734 = 0.0f;
        this.f48739 = false;
        int i = this.f48735;
        for (int i2 = 0; i2 < i; i2++) {
            this.f48745[i2] = null;
        }
        this.f48735 = 0;
        this.f48740 = 0;
        this.f48742 = false;
        Arrays.fill(this.f48741, 0.0f);
    }

    public final String toString() {
        return "" + this.f48743;
    }
}
