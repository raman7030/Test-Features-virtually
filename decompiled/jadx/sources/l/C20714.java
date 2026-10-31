package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4LO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20714 extends AbstractC11145 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f66704;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC21023 f66705;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f66706;

    public C20714(AbstractC21023 abstractC21023, String str, int[] iArr) {
        str.getClass();
        this.f66705 = abstractC21023;
        this.f66704 = str;
        this.f66706 = iArr;
    }

    @Override // l.InterfaceC3571
    public final String getValue() {
        return this.f66704;
    }

    @Override // l.InterfaceC3571
    public final int[] getStyle() {
        return this.f66706;
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ᩶֫ */
    public final C21916[] mo10322() {
        int[] iArr = this.f66706;
        if (iArr == null) {
            return null;
        }
        int length = iArr.length / 3;
        C21916[] c21916Arr = new C21916[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            c21916Arr[i] = new C21916(this.f66705.m47858(iArr[i2]), iArr[i2 + 1], iArr[i2 + 2] + 1);
        }
        return c21916Arr;
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ܰ֫ */
    public final C21916[] mo10320() {
        int[] iArr = this.f66706;
        if (iArr == null || iArr.length % 3 != 0) {
            return null;
        }
        int length = iArr.length / 3;
        C21916[] c21916Arr = new C21916[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 3;
            try {
                c21916Arr[i] = new C21916(this.f66705.mo3389(iArr[i2]).getValue(), iArr[i2 + 1], iArr[i2 + 2] + 1);
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return m27656(c21916Arr);
    }

    @Override // l.InterfaceC3571
    /* JADX INFO: renamed from: ᩺֫ */
    public final boolean mo10323() {
        return this.f66706 != null;
    }

    @Override // l.AbstractC11145
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20714.class == obj.getClass()) {
            C20714 c20714 = (C20714) obj;
            if (this.f66704.equals(c20714.f66704) && Arrays.equals(this.f66706, c20714.f66706)) {
                return true;
            }
        }
        return false;
    }
}
