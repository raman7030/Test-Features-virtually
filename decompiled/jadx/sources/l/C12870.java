package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۬ۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 76ZW */
/* JADX INFO: loaded from: classes3.dex */
public final class C12870 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38641;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38642;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f38643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f38644;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f38645;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f38646;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12165 f38647;

    public C12870(C12165 c12165) {
        this.f38647 = c12165;
        this.f38643 = new int[c12165.f36284.length];
        this.f38644 = new int[Math.min(16, c12165.f36284.length)];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4404 m31305(C14986 c14986) {
        C11003.requireNonNull(c14986);
        int iM35507 = c14986.m35507();
        C12165 c12165 = this.f38647;
        if (iM35507 != c12165.f36290) {
            throw new IllegalArgumentException("Index and change set lengths differ");
        }
        this.f38646 = 0;
        this.f38642 = 0;
        this.f38645 = -1;
        if (this.f38641 == Integer.MAX_VALUE) {
            Arrays.fill(this.f38643, 0);
            this.f38641 = 0;
        }
        boolean z = true;
        this.f38641++;
        if (c14986.m35506()) {
            return C4404.f14096;
        }
        for (int i = 0; i < c14986.m35504(); i++) {
            int iM35508 = c14986.m35508(i);
            int iM35510 = c14986.m35510(i);
            m31304(0, c12165.f36289.length, iM35508, iM35510, iM35510 - iM35508 != c14986.m35502(i) - c14986.m35505(i));
        }
        if (c14986.m35500()) {
            for (int i2 : c12165.f36288) {
                m31303(i2);
            }
        }
        for (int i3 : c12165.f36283) {
            m31303(i3);
        }
        Arrays.sort(this.f38644, 0, this.f38642);
        if (c12165.f36282 == EnumC21338.COMPLETE && c12165.f36283.length == 0) {
            z = false;
        }
        return new C4404(Arrays.copyOf(this.f38644, this.f38642), z, this.f38645, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31304(int i, int i2, int i3, int i4, boolean z) {
        if (i == i2) {
            return;
        }
        int i5 = (i + i2) >>> 1;
        this.f38646++;
        C12165 c12165 = this.f38647;
        if (c12165.f36285[i5] < i3 || C12165.m29621(c12165, c12165.f36289[i]) > i4) {
            return;
        }
        m31304(i, i5, i3, i4, z);
        int i6 = c12165.f36289[i5];
        if (c12165.f36284[i6].m45893(i3, i4) || (z && C12165.m29621(c12165, i6) <= i4 && i3 <= C12165.m29618(c12165, i6))) {
            this.f38645 = Math.max(this.f38645, c12165.f36287[i6]);
            m31303(i6);
        }
        m31304(i5 + 1, i2, i3, i4, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m31303(int i) {
        int[] iArr = this.f38643;
        int i2 = iArr[i];
        int i3 = this.f38641;
        if (i2 == i3) {
            return;
        }
        iArr[i] = i3;
        if (this.f38642 == this.f38644.length) {
            int length = this.f38647.f36284.length;
            int i4 = this.f38642;
            this.f38644 = Arrays.copyOf(this.f38644, Math.min(length, Math.max(16, i4 + (i4 >>> 1))));
        }
        int[] iArr2 = this.f38644;
        int i5 = this.f38642;
        this.f38642 = i5 + 1;
        iArr2[i5] = i;
    }
}
