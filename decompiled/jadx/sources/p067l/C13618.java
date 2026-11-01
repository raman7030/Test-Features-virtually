package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۨܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M6NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C13618 implements InterfaceC24346 {

    /* JADX INFO: renamed from: ֫ */
    public int f38316;

    /* JADX INFO: renamed from: ۧ */
    public int f38317;

    /* JADX INFO: renamed from: ܳ */
    public final CharSequence f38318;

    /* JADX INFO: renamed from: ܽ */
    public int[] f38319;

    /* JADX INFO: renamed from: ܿ */
    public final int f38320;

    /* JADX INFO: renamed from: ᩳ */
    public int f38321;

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final int mo8402() {
        return -1;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ܽ */
    public final void mo8409(int i) {
    }

    public C13618(CharSequence charSequence, Runnable runnable) {
        int i;
        C12826.requireNonNull(charSequence);
        this.f38318 = charSequence;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = i3 + 1;
            if ((i3 & 1023) == 0) {
                runnable.run();
            }
            if (Character.isHighSurrogate(charSequence.charAt(i2)) && (i = i2 + 1) < length && Character.isLowSurrogate(charSequence.charAt(i))) {
                int[] iArr = this.f38319;
                if (iArr == null) {
                    this.f38319 = new int[16];
                } else {
                    int i5 = this.f38317;
                    if (i5 == iArr.length) {
                        this.f38319 = Arrays.copyOf(iArr, i5 * 2);
                    }
                }
                int[] iArr2 = this.f38319;
                int i6 = this.f38317;
                iArr2[i6] = i2 - i6;
                this.f38317 = i6 + 1;
                i2 = i;
            }
            i2++;
            i3 = i4;
        }
        runnable.run();
        this.f38320 = length - this.f38317;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final void mo8406() {
        if (this.f38321 >= this.f38320) {
            throw new IllegalStateException("Cannot consume EOF");
        }
        int i = this.f38316;
        this.f38316 = Character.charCount(Character.codePointAt(this.f38318, i)) + i;
        this.f38321++;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ۧ */
    public final int mo8405(int i) {
        if (i == 0) {
            return 0;
        }
        int i2 = this.f38321;
        long j = i2;
        if (i > 0) {
            i--;
        }
        long j2 = j + ((long) i);
        if (j2 < 0 || j2 >= this.f38320) {
            return -1;
        }
        return Character.codePointAt(this.f38318, j2 == ((long) i2) ? this.f38316 : m30972((int) j2));
    }

    /* JADX INFO: renamed from: ᩳ */
    private int m30972(int i) {
        int i2 = 0;
        int i3 = this.f38317;
        while (i2 < i3) {
            int i4 = (i2 + i3) >>> 1;
            if (this.f38319[i4] < i) {
                i2 = i4 + 1;
            } else {
                i3 = i4;
            }
        }
        return i + i2;
    }

    @Override // p067l.InterfaceC16219
    public final int index() {
        return this.f38321;
    }

    @Override // p067l.InterfaceC16219
    public final int size() {
        return this.f38320;
    }

    @Override // p067l.InterfaceC16219
    /* JADX INFO: renamed from: ֫ */
    public final void mo8403(int i) {
        if (i < 0 || i > this.f38320) {
            throw new IndexOutOfBoundsException(C20778.m46922(i, "Index: "));
        }
        this.f38321 = i;
        this.f38316 = m30972(i);
    }

    @Override // p067l.InterfaceC24346
    /* JADX INFO: renamed from: ֫ */
    public final String mo13949(C16399 c16399) {
        int i = c16399.f48195;
        int i2 = this.f38320;
        int iMin = Math.min(i, i2);
        int iMin2 = (int) Math.min(((long) c16399.f48196) + 1, i2);
        if (iMin < 0 || iMin2 < iMin) {
            throw new IndexOutOfBoundsException("Interval: " + c16399);
        }
        int iM30972 = m30972(iMin);
        int iM30973 = m30972(iMin2);
        CharSequence charSequence = this.f38318;
        if (charSequence instanceof String) {
            return ((String) charSequence).substring(iM30972, iM30973);
        }
        if (iM30972 == iM30973) {
            return "";
        }
        int i3 = iM30973 - iM30972;
        char[] cArr = new char[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            cArr[i4] = charSequence.charAt(iM30972 + i4);
        }
        return new String(cArr);
    }

    public final String toString() {
        return mo13949(C16399.m37214(0, this.f38320 - 1));
    }
}
