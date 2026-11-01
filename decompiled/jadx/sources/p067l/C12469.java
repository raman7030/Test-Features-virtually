package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩻ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L99C */
/* JADX INFO: loaded from: classes4.dex */
public final class C12469 extends AbstractC22349 {

    /* JADX INFO: renamed from: ۖ */
    public int f34891;

    /* JADX INFO: renamed from: ۘ */
    public int f34892;

    /* JADX INFO: renamed from: ۜ */
    public final C24618 f34893;

    /* JADX INFO: renamed from: ۡ */
    public int f34894;

    /* JADX INFO: renamed from: ۢ */
    public C22055[] f34895;

    /* JADX INFO: renamed from: ܳ */
    public int f34896;

    /* JADX INFO: renamed from: ܺ */
    public int[] f34897;

    /* JADX INFO: renamed from: ܽ */
    public int f34898;

    /* JADX INFO: renamed from: ܿ */
    public final int f34899;

    /* JADX INFO: renamed from: ᩳ */
    public final int f34900;

    /* JADX INFO: renamed from: ᩴ */
    public int[] f34901;

    /* JADX INFO: renamed from: ᩷ */
    public int f34902;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f34903;

    /* JADX INFO: renamed from: ܿ */
    private synchronized int[] m28696(int i) {
        if (i >= 0) {
            try {
                if (i < this.f34891) {
                    this.f34893.seek(this.f34898 + this.f34892 + this.f34901[i]);
                    C17441 c17441 = new C17441();
                    while (true) {
                        try {
                            int i2 = this.f34893.readInt();
                            if (i2 == -1) {
                                return c17441.mo5873();
                            }
                            c17441.add(i2);
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            return null;
                        }
                    }
                }
            } catch (IOException e) {
                throw new C9587(e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩳ */
    private synchronized String m28697(int i) {
        int i2;
        if (i >= 0) {
            if (i < this.f34902) {
                int i3 = this.f34898 + this.f34894 + this.f34897[i];
                if (i3 >= this.f34899 && i3 < (i2 = this.f34900)) {
                    String strM50186 = m50186(this.f34893, i3, this.f34903, i2);
                    if (strM50186 == null) {
                        int iM28695 = m28695(i);
                        if (iM28695 != -1 && (strM50186 = m50186(this.f34893, iM28695, this.f34903, this.f34900)) != null) {
                            this.f34897[i] = (iM28695 - this.f34898) - this.f34894;
                        }
                        if (strM50186 == null) {
                            strM50186 = "";
                        }
                    }
                    if (strM50186.length() > 10000) {
                        strM50186 = InterfaceC14480.f41353;
                    }
                    return strM50186;
                }
                return InterfaceC14480.f41353;
            }
        }
        return C23669.m52683(i, this.f34902).toString();
    }

    /* JADX INFO: renamed from: ܽ */
    private synchronized int m28695(int i) {
        C23669.m52681("getPreviousStringEndOffset " + i);
        if (i == 0) {
            return this.f34898 + this.f34894;
        }
        int i2 = i - 1;
        int iM50180 = AbstractC22349.m50180(this.f34893, this.f34898 + this.f34894 + this.f34897[i2], this.f34903, this.f34900);
        C23669.m52681("new offset " + iM50180);
        if (iM50180 != -1) {
            return iM50180;
        }
        int iM28695 = m28695(i2);
        if (iM28695 == -1) {
            return -1;
        }
        return AbstractC22349.m50180(this.f34893, iM28695, this.f34903, this.f34900);
    }

    public C12469(C24618 c24618) throws IOException {
        this.f34893 = c24618;
        long filePointer = c24618.getFilePointer();
        int i = (int) filePointer;
        if (filePointer != i) {
            throw new ArithmeticException();
        }
        this.f34898 = i;
        C4263 c4263M8666 = C4263.m8666(c24618);
        if (c4263M8666.f9456 == 0) {
            c24618.skipBytes(c4263M8666.f9453 - 8);
            long filePointer2 = c24618.getFilePointer();
            int i2 = (int) filePointer2;
            if (filePointer2 != i2) {
                throw new ArithmeticException();
            }
            this.f34898 = i2;
            c4263M8666 = C4263.m8666(c24618);
        }
        int i3 = c4263M8666.f9453;
        int i4 = c4263M8666.f9454;
        c4263M8666.m8668(1);
        int i5 = c24618.readInt();
        int i6 = c24618.readInt();
        this.f34891 = i6;
        this.f34896 = c24618.readInt();
        int i7 = c24618.readInt();
        int i8 = c24618.readInt();
        this.f34892 = i8;
        if (i4 > 28) {
            c24618.skipBytes(i4 - 28);
        }
        i7 = i7 < i4 ? i4 : i7;
        if ((i6 == 0 || i8 == 0) && (i5 < 0 || (i5 * 4) + i4 > i7)) {
            this.f34891 = 0;
            this.f34892 = 0;
            i5 = (i7 - i4) / 4;
        }
        this.f34902 = i5;
        this.f34894 = i7;
        int i9 = this.f34891;
        if (i9 == 0) {
            this.f34892 = 0;
        }
        if (i5 > 16777216) {
            throw new IOException("Too many strings");
        }
        if (i9 > i5) {
            this.f34891 = i5;
        }
        int i10 = this.f34898;
        this.f34899 = i4 + i10;
        int i11 = this.f34892;
        long length = c24618.length();
        this.f34900 = AbstractC22349.m50172(i10, i7, i11, i3, length <= 0 ? 0 : length >= 2147483647L ? Integer.MAX_VALUE : (int) length);
        this.f34897 = new int[i5];
        for (int i12 = 0; i12 < i5; i12++) {
            this.f34897[i12] = c24618.readInt();
        }
        int i13 = this.f34891;
        if (i13 != 0) {
            this.f34901 = new int[i13];
            for (int i14 = 0; i14 < this.f34891; i14++) {
                this.f34901[i14] = c24618.readInt();
            }
        } else {
            this.f34901 = new int[0];
        }
        this.f34895 = new C22055[i5];
        this.f34903 = (this.f34896 & 256) != 0;
        c24618.seek(this.f34898 + i3);
    }

    @Override // p067l.InterfaceC14480
    public final int size() {
        return this.f34902;
    }

    @Override // p067l.InterfaceC14480
    public final C22055 getItem(int i) {
        C22055[] c22055Arr = this.f34895;
        if (c22055Arr != null && i >= 0 && i < this.f34902) {
            C22055 c22055 = c22055Arr[i];
            if (c22055 != null) {
                return c22055;
            }
            C22055 c22056 = new C22055(this, m28697(i), m28696(i));
            c22055Arr[i] = c22056;
            return c22056;
        }
        return new C22055(this, m28697(i), m28696(i));
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5763 mo5708(int i) {
        int i2 = this.f34902;
        if (i < 0 || i >= i2) {
            throw C23669.m52683(i, i2);
        }
        return getItem(i);
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5710() {
        return this.f34903;
    }
}
