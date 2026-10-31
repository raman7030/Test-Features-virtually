package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧᩴܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 439X */
/* JADX INFO: loaded from: classes3.dex */
public final class C11186 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] f33576;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f33577;

    public C11186(byte[] bArr) {
        int length = bArr.length;
        if (length < 0) {
            throw new IllegalArgumentException("end < start");
        }
        if (length > bArr.length) {
            throw new IllegalArgumentException("end > bytes.length");
        }
        this.f33576 = bArr;
        this.f33577 = length;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27748() {
        return this.f33577;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11186 m27750(int i, int i2) {
        m27746(i, i2);
        return new C11186(Arrays.copyOfRange(this.f33576, i, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m27749(int i) {
        m27746(i, i + 1);
        return this.f33576[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m27756(int i) {
        m27746(i, i + 2);
        return m27747(i + 1) | (this.f33576[i] << 8);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m27752(int i) {
        m27746(i, i + 4);
        return m27747(i + 3) | (this.f33576[i] << 24) | (m27747(i + 1) << 16) | (m27747(i + 2) << 8);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m27754(int i) {
        m27746(i, i + 8);
        byte[] bArr = this.f33576;
        int iM27747 = (bArr[i] << 24) | (m27747(i + 1) << 16) | (m27747(i + 2) << 8) | m27747(i + 3);
        return (((long) iM27747) << 32) | (((long) (m27747(i + 7) | (bArr[i + 4] << 24) | (m27747(i + 5) << 16) | (m27747(i + 6) << 8))) & 4294967295L);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m27755(int i) {
        m27746(i, i + 1);
        return m27747(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m27753(int i) {
        m27746(i, i + 2);
        return m27747(i + 1) | (m27747(i) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27751(int i, byte[] bArr) {
        int length = bArr.length - i;
        int i2 = this.f33577;
        if (length < i2) {
            throw new IndexOutOfBoundsException("(out.length - offset) < size()");
        }
        System.arraycopy(this.f33576, 0, bArr, i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m27746(int i, int i2) {
        int i3 = this.f33577;
        if (i < 0 || i2 < i || i2 > i3) {
            StringBuilder sbM46682 = C20361.m46682("bad range: ", i, "..", "; actual size ", i2);
            sbM46682.append(i3);
            throw new IllegalArgumentException(sbM46682.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int m27747(int i) {
        return this.f33576[i] & 255;
    }
}
