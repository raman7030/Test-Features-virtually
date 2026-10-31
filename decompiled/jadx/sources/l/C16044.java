package l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܺܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9YD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16044 implements InterfaceC6873, AutoCloseable {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f49485 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f49486 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C11504 f49487;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49488;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC18663 f49489;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f49490;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49491;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23806 f49492;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC13619 f49493;

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    public C16044(String str, InterfaceC18663 interfaceC18663) throws C9696 {
        String strTrim;
        int iIndexOf;
        char[] charArray = str.toCharArray();
        int length = 0;
        char c = 0;
        int i = 0;
        String strTrim2 = null;
        C23806 c23806 = null;
        String str2 = null;
        do {
            char c2 = charArray[length];
            if (c != 0) {
                if (c != 1) {
                    if (c != 2) {
                        if (c != 5) {
                            length = charArray.length;
                        } else if (c2 == '=') {
                            strTrim2 = str.substring(i, length).trim();
                            i = length + 1;
                        } else if (c2 == ',' || c2 == ']') {
                            String strTrim3 = str.substring(i, length).trim();
                            int i2 = length + 1;
                            strTrim2 = strTrim2 == null ? "endpoint" : strTrim2;
                            if (c23806 != null) {
                                c23806.m52483(strTrim2, strTrim3);
                            }
                            strTrim2 = null;
                            i = i2;
                        }
                    } else if (c2 == '[') {
                        strTrim = str.substring(i, length).trim();
                        if (strTrim.length() == 0) {
                            iIndexOf = str.indexOf(91, length + 1);
                            int iIndexOf2 = str.indexOf(93, length);
                            if (iIndexOf >= 0 || iIndexOf2 < 0 || iIndexOf2 != iIndexOf - 1) {
                                strTrim = "127.0.0.1";
                            } else {
                                strTrim = str.substring(length, iIndexOf2 + 1);
                                length = iIndexOf;
                            }
                        }
                        c23806 = new C23806(str2, strTrim);
                        i = length + 1;
                        c = 5;
                    }
                } else if (c2 == '\\') {
                    i = length + 1;
                } else {
                    c = 2;
                    if (c2 == '[') {
                        strTrim = str.substring(i, length).trim();
                        if (strTrim.length() == 0) {
                            iIndexOf = str.indexOf(91, length + 1);
                            int iIndexOf3 = str.indexOf(93, length);
                            if (iIndexOf >= 0) {
                                strTrim = "127.0.0.1";
                            } else {
                                strTrim = "127.0.0.1";
                            }
                        }
                        c23806 = new C23806(str2, strTrim);
                        i = length + 1;
                        c = 5;
                    }
                }
            } else if (c2 == ':') {
                String strSubstring = str.substring(i, length);
                i = length + 1;
                str2 = strSubstring;
                c = 1;
            }
            length++;
        } while (length < charArray.length);
        if (c23806 == null || c23806.m52482() == null) {
            throw new C9696("Invalid binding URL: ".concat(str));
        }
        this.f49488 = 4280;
        this.f49491 = 4280;
        this.f49490 = 0;
        this.f49489 = interfaceC18663;
        this.f49492 = c23806;
        String str3 = "smb://" + c23806.m52487() + "/IPC$/" + c23806.m52482().substring(6);
        String str4 = (String) c23806.m52481("server");
        String strConcat = str4 != null ? "&server=".concat(str4) : "";
        String str5 = (String) c23806.m52481("address");
        strConcat = str5 != null ? C22870.m50967(strConcat, "&address=", str5) : strConcat;
        C11504 c11504 = new C11504(strConcat.length() > 0 ? C20087.m46305(1, strConcat, C7166.m19190(str3, "?")) : str3, interfaceC18663);
        this.f49487 = c11504;
        InterfaceC13619 interfaceC13619M28328 = c11504.m28328();
        interfaceC13619M28328.mo32737();
        this.f49493 = interfaceC13619M28328;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37956(int i, int i2, byte[] bArr, byte[] bArr2) throws IOException {
        InterfaceC13619 interfaceC13619 = this.f49493;
        if (interfaceC13619.mo32736()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int iMo32734 = interfaceC13619.mo32734(i, bArr, i2, bArr2, this.f49491);
        short sM8902 = C2913.m8902(8, bArr2);
        if (sM8902 > this.f49491) {
            throw new IOException(C19370.m44628(sM8902, "Unexpected fragment length: "));
        }
        while (iMo32734 < sM8902) {
            int iMo32738 = interfaceC13619.mo32738(iMo32734, sM8902 - iMo32734, bArr2);
            if (iMo32738 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iMo32734 += iMo32738;
        }
        return iMo32734;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m37953(AbstractC8990 abstractC8990, byte[] bArr, C13222 c13222) throws IOException {
        int i = c13222.f39585.f39588 - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int i4 = i3 + 24;
            int i5 = this.f49488;
            if (i4 > i5) {
                abstractC8990.f27321 &= -3;
                i3 = i5 - 24;
            } else {
                abstractC8990.f27321 |= 2;
                abstractC8990.f27322 = i3;
            }
            abstractC8990.f27319 = i3 + 24;
            if (i2 > 0) {
                abstractC8990.f27321 &= -2;
            }
            if ((abstractC8990.f27321 & 3) != 3) {
                c13222.f39587 = i2;
                c13222.f39586 = i2;
                c13222.f39588 = 0;
                c13222.f39585 = c13222;
                abstractC8990.m23233(c13222);
                c13222.m32069(abstractC8990.f27322);
                c13222.m32067(0);
                c13222.m32067(abstractC8990.mo12171());
            }
            if ((abstractC8990.f27321 & 2) == 2) {
                return i2;
            }
            int i6 = abstractC8990.f27319;
            InterfaceC13619 interfaceC13619 = this.f49493;
            if (interfaceC13619.mo32736()) {
                throw new IOException("DCERPC pipe is no longer open");
            }
            interfaceC13619.mo32735(i2, i6, bArr);
            i2 += i3;
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37955() {
        return this.f49491;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C11504 c11504 = this.f49487;
        this.f49490 = 0;
        try {
            this.f49493.close();
        } finally {
            c11504.close();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37958() {
        return this.f49488;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:17:0x0032, B:19:0x0051, B:21:0x006d, B:26:0x0077, B:28:0x0086, B:27:0x0081), top: B:36:0x0032 }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37957(AbstractC8990 abstractC8990) throws C9696 {
        C13222 c13222;
        boolean z = true;
        if (this.f49490 == 0) {
            synchronized (this) {
                try {
                    try {
                        this.f49490 = 1;
                        m37957(new C14633(this.f49492, this));
                    } catch (IOException e) {
                        this.f49490 = 0;
                        throw e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        byte[] bArrM25072 = this.f49489.mo27542().m25072();
        byte[] bArrM25073 = this.f49489.mo27542().m25072();
        try {
            C13222 c13223 = new C13222(bArrM25073, 0);
            abstractC8990.f27321 = 3;
            abstractC8990.f27323 = f49485.incrementAndGet();
            abstractC8990.mo2235(c13223);
            int iM37956 = m37956(m37953(abstractC8990, bArrM25073, c13223), abstractC8990.f27319, bArrM25073, bArrM25072);
            if (iM37956 != 0) {
                C13222 c13224 = new C13222(bArrM25072, 0);
                c13224.f39588 = 0;
                c13224.f39585 = c13224;
                c13224.f39586 = 8;
                c13224.f39585.f39588 = c13224.m32062();
                c13224.f39586 = 0;
                abstractC8990.m23232(c13224);
            }
            if (iM37956 != 0) {
                if ((abstractC8990.f27321 & 2) != 2) {
                    z = false;
                }
                if (!z) {
                    c13222 = new C13222(m37954(abstractC8990, bArrM25072), 0);
                } else {
                    c13222 = new C13222(bArrM25072, 0);
                }
            } else {
                c13222 = new C13222(bArrM25072, 0);
            }
            abstractC8990.mo2234(c13222);
            this.f49489.mo27542().m25071(bArrM25072);
            this.f49489.mo27542().m25071(bArrM25073);
            C9696 c9696Mo23231 = abstractC8990.mo23231();
            if (c9696Mo23231 != null) {
                throw c9696Mo23231;
            }
        } catch (Throwable th2) {
            this.f49489.mo27542().m25071(bArrM25072);
            this.f49489.mo27542().m25071(bArrM25073);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m37954(AbstractC8990 abstractC8990, byte[] bArr) throws IOException {
        int i = abstractC8990.f27318 == 2 ? abstractC8990.f27319 : 24;
        int i2 = this.f49491;
        byte[] bArr2 = new byte[i2];
        C13222 c13222 = new C13222(bArr2, 0);
        while ((abstractC8990.f27321 & 2) != 2) {
            InterfaceC13619 interfaceC13619 = this.f49493;
            int iMo32738 = interfaceC13619.mo32738(0, i2, bArr2);
            if (bArr2[0] != 5 || bArr2[1] != 0) {
                throw new IOException("Unexpected DCERPC PDU header");
            }
            short sM8902 = C2913.m8902(8, bArr2);
            if (sM8902 > i2) {
                throw new IOException(C19370.m44628(sM8902, "Unexpected fragment length: "));
            }
            while (iMo32738 < sM8902) {
                int iMo32739 = interfaceC13619.mo32738(iMo32738, sM8902 - iMo32738, bArr2);
                if (iMo32739 == 0) {
                    throw new IOException("Unexpected EOF");
                }
                iMo32738 += iMo32739;
            }
            c13222.f39588 = 0;
            c13222.f39585 = c13222;
            c13222.f39586 = 8;
            c13222.f39585.f39588 = c13222.m32062();
            c13222.f39586 = c13222.f39587;
            c13222.f39588 = 0;
            c13222.f39585 = c13222;
            abstractC8990.m23232(c13222);
            int i3 = abstractC8990.f27319 - 24;
            int i4 = i + i3;
            if (i4 > bArr.length) {
                byte[] bArr3 = new byte[i4];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                bArr = bArr3;
            }
            System.arraycopy(bArr2, 24, bArr, i, i3);
            i = i4;
        }
        return bArr;
    }

    public final String toString() {
        return this.f49492.toString();
    }
}
