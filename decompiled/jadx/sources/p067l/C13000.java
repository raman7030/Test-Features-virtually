package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes3.dex */
public final class C13000 {

    /* JADX INFO: renamed from: ֫ */
    public final byte[] f36576;

    /* JADX INFO: renamed from: ۧ */
    public final int f36577;

    public C13000(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException("end < start");
        }
        if (length > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f36576 = bArr;
        this.f36577 = length;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29810() {
        return this.f36577;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13000 m29812(int i, int i2) {
        m29808(i, i2);
        return new C13000(Arrays.copyOfRange(this.f36576, i, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m29811(int i) {
        m29808(i, i + 1);
        return this.f36576[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m29818(int i) {
        m29808(i, i + 2);
        return m29809(i + 1) | (this.f36576[i] << 8);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m29814(int i) {
        m29808(i, i + 4);
        return m29809(i + 3) | (this.f36576[i] << 24) | (m29809(i + 1) << 16) | (m29809(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m29816(int i) {
        m29808(i, i + 8);
        byte[] bArr = this.f36576;
        int iM29809 = (bArr[i] << 24) | (m29809(i + 1) << 16) | (m29809(i + 2) << 8) | m29809(i + 3);
        return (((long) iM29809) << 32) | (((long) (m29809(i + 7) | (bArr[i + 4] << 24) | (m29809(i + 5) << 16) | (m29809(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m29817(int i) {
        m29808(i, i + 1);
        return m29809(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m29815(int i) {
        m29808(i, i + 2);
        return m29809(i + 1) | (m29809(i) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29813(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f36577;
        if (length < i2) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f36576, 0, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m29808(int i, int i2) {
        int i3 = this.f36577;
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM49005 = C21720.m49005("bad range: ", i, "..", "; actual size ", i2);
            sbM49005.append(i3);
            throw new IllegalArgumentException(sbM49005.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public int m29809(int i) {
        return this.f36576[i] & 255;
    }
}
