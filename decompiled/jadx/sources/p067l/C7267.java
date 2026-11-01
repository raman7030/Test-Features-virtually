package p067l;

import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ۚۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 49VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7267 extends C13595 {

    /* JADX INFO: renamed from: ᩻ */
    public static final InterfaceC4410 f18938 = C13128.m30022(C7267.class);

    /* JADX INFO: renamed from: ܳ */
    public String f18939 = null;

    /* JADX INFO: renamed from: ܿ */
    public String f18940 = null;

    static {
        try {
            new C7267("S-1-1-0");
            new C7267("S-1-3-0");
            new C7267("S-1-5-18");
        } catch (C5255 e) {
            f18938.mo9186("Failed to create builtin SIDs", (Throwable) e);
        }
    }

    public C7267(byte[] bArr, int i) {
        this.f38234 = bArr[i];
        this.f38236 = bArr[i + 1];
        byte[] bArr2 = new byte[6];
        this.f38233 = bArr2;
        System.arraycopy(bArr, i + 2, bArr2, 0, 6);
        int i2 = i + 8;
        int i3 = this.f38236;
        if (i3 > 100) {
            throw new C14740("Invalid SID sub_authority_count");
        }
        this.f38235 = new int[i3];
        for (int i4 = 0; i4 < this.f38236; i4++) {
            this.f38235[i4] = C3775.m7365(i2, bArr);
            i2 += 4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7267(String str) throws C5255 {
        long j;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        if (stringTokenizer.countTokens() < 3 || !stringTokenizer.nextToken().equals("S")) {
            throw new C5255("Bad textual SID format: ".concat(str));
        }
        this.f38234 = Byte.parseByte(stringTokenizer.nextToken());
        String strNextToken = stringTokenizer.nextToken();
        if (strNextToken.startsWith("0x")) {
            j = Long.parseLong(strNextToken.substring(2), 16);
        } else {
            j = Long.parseLong(strNextToken);
        }
        this.f38233 = new byte[6];
        int i = 5;
        while (j > 0) {
            this.f38233[i] = (byte) (j % 256);
            j >>= 8;
            i--;
        }
        int iCountTokens = (byte) stringTokenizer.countTokens();
        this.f38236 = iCountTokens;
        if (iCountTokens > 0) {
            this.f38235 = new int[iCountTokens];
            for (int i2 = 0; i2 < this.f38236; i2++) {
                this.f38235[i2] = (int) (Long.parseLong(stringTokenizer.nextToken()) & 4294967295L);
            }
        }
    }

    public final int hashCode() {
        int i = this.f38233[5];
        for (int i2 = 0; i2 < this.f38236; i2++) {
            i += this.f38235[i2] * 65599;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7267) {
            C7267 c7267 = (C7267) obj;
            if (c7267 == this) {
                return true;
            }
            byte b = c7267.f38236;
            int i = this.f38236;
            if (b == i) {
                while (true) {
                    int i2 = i - 1;
                    if (i > 0) {
                        if (c7267.f38235[i2] != this.f38235[i2]) {
                            return false;
                        }
                        i = i2;
                    } else {
                        for (int i3 = 0; i3 < 6; i3++) {
                            if (c7267.f38233[i3] != this.f38233[i3]) {
                                return false;
                            }
                        }
                        if (c7267.f38234 == this.f38234) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String string;
        String strM11876 = C5410.m11876(this.f38234 & 255, "-", new StringBuilder("S-"));
        byte[] bArr = this.f38233;
        if (bArr[0] == 0 && bArr[1] == 0) {
            long j = 0;
            long j2 = 0;
            for (int i = 5; i > 1; i--) {
                j += (((long) this.f38233[i]) & 255) << ((int) j2);
                j2 += 8;
            }
            string = strM11876 + j;
        } else {
            StringBuilder sbM17248 = C7470.m17248(C17588.m40053(strM11876, "0x"));
            sbM17248.append(C13854.m31530(this.f38233, 0, 6));
            string = sbM17248.toString();
        }
        for (int i2 = 0; i2 < this.f38236; i2++) {
            StringBuilder sbM21133 = C9179.m21133(string, "-");
            sbM21133.append(((long) this.f38235[i2]) & 4294967295L);
            string = sbM21133.toString();
        }
        return string;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m16620() {
        String str = this.f18939;
        if (str != null) {
            if (str.equals("BUILTIN")) {
                return this.f18940;
            }
            return this.f18939 + "\\" + this.f18940;
        }
        return toString();
    }
}
