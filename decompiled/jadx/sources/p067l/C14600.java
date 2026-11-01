package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C14600 {

    /* JADX INFO: renamed from: ֫ */
    public int f41685;

    /* JADX INFO: renamed from: ۧ */
    public int f41686;

    /* JADX INFO: renamed from: ܳ */
    public final int[] f41687;

    /* JADX INFO: renamed from: ܽ */
    public int[] f41688;

    /* JADX INFO: renamed from: ܿ */
    public int f41689;

    /* JADX INFO: renamed from: ᩳ */
    public int f41690;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ C13930 f41691;

    public C14600(C13930 c13930) {
        this.f41691 = c13930;
        this.f41687 = new int[c13930.f39295.length];
        this.f41688 = new int[Math.min(16, c13930.f39295.length)];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6554 m33391(C16611 c16611) {
        C12826.requireNonNull(c16611);
        int iM37663 = c16611.m37663();
        C13930 c13930 = this.f41691;
        if (iM37663 != c13930.f39301) {
            throw new IllegalArgumentException("Index and change set lengths differ");
        }
        this.f41690 = 0;
        this.f41686 = 0;
        this.f41689 = -1;
        if (this.f41685 == Integer.MAX_VALUE) {
            Arrays.fill(this.f41687, 0);
            this.f41685 = 0;
        }
        boolean z = true;
        this.f41685++;
        if (c16611.m37662()) {
            return C6554.f16912;
        }
        for (int i = 0; i < c16611.m37660(); i++) {
            int iM37664 = c16611.m37664(i);
            int iM37666 = c16611.m37666(i);
            m33390(0, c13930.f39300.length, iM37664, iM37666, iM37666 - iM37664 != c16611.m37658(i) - c16611.m37661(i));
        }
        if (c16611.m37656()) {
            for (int i2 : c13930.f39299) {
                m33389(i2);
            }
        }
        for (int i3 : c13930.f39294) {
            m33389(i3);
        }
        Arrays.sort(this.f41688, 0, this.f41686);
        if (c13930.f39293 == EnumC22648.COMPLETE && c13930.f39294.length == 0) {
            z = false;
        }
        return new C6554(Arrays.copyOf(this.f41688, this.f41686), z, this.f41689, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33390(int i, int i2, int i3, int i4, boolean z) {
        if (i == i2) {
            return;
        }
        int i5 = (i + i2) >>> 1;
        this.f41690++;
        C13930 c13930 = this.f41691;
        if (c13930.f39296[i5] < i3 || C13930.m31683(c13930, c13930.f39300[i]) > i4) {
            return;
        }
        m33390(i, i5, i3, i4, z);
        int i6 = c13930.f39300[i5];
        if (c13930.f39295[i6].m48206(i3, i4) || (z && C13930.m31683(c13930, i6) <= i4 && i3 <= C13930.m31680(c13930, i6))) {
            this.f41689 = Math.max(this.f41689, c13930.f39298[i6]);
            m33389(i6);
        }
        m33390(i5 + 1, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m33389(int i) {
        int[] iArr = this.f41687;
        int i2 = iArr[i];
        int i3 = this.f41685;
        if (i2 == i3) {
            return;
        }
        iArr[i] = i3;
        if (this.f41686 == this.f41688.length) {
            int length = this.f41691.f39295.length;
            int i4 = this.f41686;
            this.f41688 = Arrays.copyOf(this.f41688, Math.min(length, Math.max(16, i4 + (i4 >>> 1))));
        }
        int[] iArr2 = this.f41688;
        int i5 = this.f41686;
        this.f41686 = i5 + 1;
        iArr2[i5] = i;
    }
}
