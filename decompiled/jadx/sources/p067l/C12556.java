package p067l;

import com.google.android.material.color.ColorResourcesTableCreator;

/* JADX INFO: renamed from: l.ۧۗ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N5SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12556 {

    /* JADX INFO: renamed from: ֫ */
    public int f35277;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f35278;

    public C12556(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data == null");
        }
        this.f35278 = bArr;
        this.f35277 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m28938() {
        return this.f35277;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m28945(int i) {
        if (i < 0 || i >= this.f35278.length) {
            throw new IndexOutOfBoundsException("The provided cursor value is not within the bounds of this instance's data array");
        }
        this.f35277 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte m28941() {
        int i = this.f35277;
        this.f35277 = i + 1;
        return this.f35278[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m28947() {
        int i = this.f35277;
        byte[] bArr = this.f35278;
        int i2 = bArr[i] & 255;
        int i3 = i2 + ((bArr[i + 1] & 255) << 8);
        this.f35277 = i + 2;
        return i3;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m28944() {
        int i = this.f35277;
        byte[] bArr = this.f35278;
        int i2 = (bArr[i] & 255) + ((bArr[i + 1] & 255) << 8) + ((bArr[i + 2] & 255) << 16);
        int i3 = i2 + ((bArr[i + 3] & 255) << 24);
        this.f35277 = i + 4;
        return i3;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m28948() {
        int i = this.f35277;
        int i2 = i + 1;
        byte[] bArr = this.f35278;
        byte b = bArr[i];
        int i3 = b & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte b2 = bArr[i2];
            int i5 = b2 & 255;
            int i6 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte b3 = bArr[i4];
                int i8 = b3 & 255;
                i6 |= (b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14;
                if (i8 > 127) {
                    i4 = i + 4;
                    byte b4 = bArr[i7];
                    int i9 = b4 & 255;
                    i6 |= (b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        int i11 = bArr[i4] & 255;
                        if (i11 > 15) {
                            throw new RuntimeException("invalid LEB128 integer encountered");
                        }
                        i6 |= i11 << 28;
                        i4 = i10;
                    }
                } else {
                    i4 = i7;
                }
            }
            this.f35277 = i4;
            return bArr[i4 + (-1)] == 0 ? ~i6 : i6;
        }
        this.f35277 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m28943() {
        int i = this.f35277;
        int i2 = i + 1;
        byte[] bArr = this.f35278;
        byte b = bArr[i];
        int i3 = b & 255;
        if (i3 > 127) {
            int i4 = i + 2;
            byte b2 = bArr[i2];
            int i5 = b2 & 255;
            int i6 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i5 > 127) {
                int i7 = i + 3;
                byte b3 = bArr[i4];
                int i8 = b3 & 255;
                i3 = ((b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14) | i6;
                if (i8 > 127) {
                    i2 = i + 4;
                    byte b4 = bArr[i7];
                    int i9 = b4 & 255;
                    i3 |= (b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21;
                    if (i9 > 127) {
                        int i10 = i + 5;
                        int i11 = bArr[i2] & 255;
                        if (i11 > 15) {
                            throw new RuntimeException("invalid LEB128 integer encountered");
                        }
                        i3 |= i11 << 28;
                        i2 = i10;
                    }
                } else {
                    i2 = i7;
                }
            } else {
                i3 = i6;
                i2 = i4;
            }
        }
        this.f35277 = i2;
        return i3;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m28946() {
        int i;
        int i2 = this.f35277;
        int i3 = i2 + 1;
        byte[] bArr = this.f35278;
        byte b = bArr[i2];
        int i4 = b & 255;
        if (i4 <= 127) {
            i = (i4 << 25) >> 25;
        } else {
            int i5 = i2 + 2;
            byte b2 = bArr[i3];
            int i6 = b2 & 255;
            int i7 = ((b2 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 7) | (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID);
            if (i6 <= 127) {
                i = (i7 << 18) >> 18;
            } else {
                int i8 = i2 + 3;
                byte b3 = bArr[i5];
                int i9 = b3 & 255;
                int i10 = i7 | ((b3 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 14);
                if (i9 <= 127) {
                    i = (i10 << 11) >> 11;
                    i3 = i8;
                } else {
                    i5 = i2 + 4;
                    byte b4 = bArr[i8];
                    int i11 = b4 & 255;
                    int i12 = i10 | ((b4 & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID) << 21);
                    if (i11 <= 127) {
                        i = (i12 << 4) >> 4;
                    } else {
                        int i13 = i2 + 5;
                        int i14 = bArr[i5] & 255;
                        if (i14 > 15) {
                            throw new RuntimeException("invalid LEB128 integer encountered");
                        }
                        int i15 = i12 | (i14 << 28);
                        i3 = i13;
                        i = i15;
                    }
                }
            }
            i3 = i5;
        }
        this.f35277 = i3;
        return i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m28942(int i) {
        int i2 = this.f35277;
        int i3 = i2 + i;
        byte[] bArr = this.f35278;
        if (i3 <= bArr.length) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, i2, bArr2, 0, i);
            this.f35277 = i3;
            return bArr2;
        }
        throw new IndexOutOfBoundsException("attempt to read past the end");
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m28940() {
        int i = this.f35277;
        while (true) {
            int i2 = this.f35277;
            byte[] bArr = this.f35278;
            if (bArr[i2] != 0) {
                this.f35277 = i2 + 1;
            } else {
                int i3 = i2 - i;
                this.f35277 = i2 + 1;
                return C6458.m14756(i, i3, bArr);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28939(int i) {
        int i2 = i - 1;
        this.f35277 = (~i2) & (this.f35277 + i2);
    }
}
