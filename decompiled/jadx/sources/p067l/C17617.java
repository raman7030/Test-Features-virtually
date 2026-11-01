package p067l;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ܺܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D9YD */
/* JADX INFO: loaded from: classes4.dex */
public final class C17617 implements InterfaceC8901, AutoCloseable {

    /* JADX INFO: renamed from: ۛ */
    public static final AtomicInteger f52649 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ۤ */
    public static final /* synthetic */ int f52650 = 0;

    /* JADX INFO: renamed from: ۗ */
    public C13302 f52651;

    /* JADX INFO: renamed from: ۙ */
    public int f52652;

    /* JADX INFO: renamed from: ۫ */
    public InterfaceC20106 f52653;

    /* JADX INFO: renamed from: ۬ */
    public int f52654;

    /* JADX INFO: renamed from: ᩶ */
    public int f52655;

    /* JADX INFO: renamed from: ᩸ */
    public final C24994 f52656;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC15312 f52657;

    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    public C17617(String str, InterfaceC20106 interfaceC20106) throws C11584 {
        String strTrim;
        int iIndexOf;
        char[] charArray = str.toCharArray();
        int length = 0;
        char c = 0;
        int i = 0;
        String strTrim2 = null;
        C24994 c24994 = null;
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
                            if (c24994 != null) {
                                c24994.m54892(strTrim2, strTrim3);
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
                        c24994 = new C24994(str2, strTrim);
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
                        c24994 = new C24994(str2, strTrim);
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
        if (c24994 == null || c24994.m54891() == null) {
            throw new C11584("Invalid binding URL: ".concat(str));
        }
        this.f52652 = 4280;
        this.f52655 = 4280;
        this.f52654 = 0;
        this.f52653 = interfaceC20106;
        this.f52656 = c24994;
        String str3 = "smb://" + c24994.m54896() + "/IPC$/" + c24994.m54891().substring(6);
        String str4 = (String) c24994.m54890("server");
        String strConcat = str4 != null ? "&server=".concat(str4) : "";
        String str5 = (String) c24994.m54890("address");
        strConcat = str5 != null ? C24104.m53357(strConcat, "&address=", str5) : strConcat;
        C13302 c13302 = new C13302(strConcat.length() > 0 ? C21459.m48621(1, strConcat, C9179.m21133(str3, "?")) : str3, interfaceC20106);
        this.f52651 = c13302;
        InterfaceC15312 interfaceC15312M30372 = c13302.m30372();
        interfaceC15312M30372.mo34851();
        this.f52657 = interfaceC15312M30372;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40143(int i, int i2, byte[] bArr, byte[] bArr2) throws IOException {
        InterfaceC15312 interfaceC15312 = this.f52657;
        if (interfaceC15312.mo34850()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int iMo34848 = interfaceC15312.mo34848(i, bArr, i2, bArr2, this.f52655);
        short sM10970 = C5137.m10970(8, bArr2);
        if (sM10970 > this.f52655) {
            throw new IOException(C20778.m46922(sM10970, "Unexpected fragment length: "));
        }
        while (iMo34848 < sM10970) {
            int iMo34852 = interfaceC15312.mo34852(iMo34848, sM10970 - iMo34848, bArr2);
            if (iMo34852 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iMo34848 += iMo34852;
        }
        return iMo34848;
    }

    /* JADX INFO: renamed from: ֫ */
    private int m40140(AbstractC10913 abstractC10913, byte[] bArr, C14935 c14935) throws IOException {
        int i = c14935.f42649.f42652 - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            int i4 = i3 + 24;
            int i5 = this.f52652;
            if (i4 > i5) {
                abstractC10913.f30255 &= -3;
                i3 = i5 - 24;
            } else {
                abstractC10913.f30255 |= 2;
                abstractC10913.f30256 = i3;
            }
            abstractC10913.f30253 = i3 + 24;
            if (i2 > 0) {
                abstractC10913.f30255 &= -2;
            }
            if ((abstractC10913.f30255 & 3) != 3) {
                c14935.f42651 = i2;
                c14935.f42650 = i2;
                c14935.f42652 = 0;
                c14935.f42649 = c14935;
                abstractC10913.m25177(c14935);
                c14935.m34167(abstractC10913.f30256);
                c14935.m34165(0);
                c14935.m34165(abstractC10913.mo14092());
            }
            if ((abstractC10913.f30255 & 2) == 2) {
                return i2;
            }
            int i6 = abstractC10913.f30253;
            InterfaceC15312 interfaceC15312 = this.f52657;
            if (interfaceC15312.mo34850()) {
                throw new IOException("DCERPC pipe is no longer open");
            }
            interfaceC15312.mo34849(i2, i6, bArr);
            i2 += i3;
        }
        throw new IOException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40142() {
        return this.f52655;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C13302 c13302 = this.f52651;
        this.f52654 = 0;
        try {
            this.f52657.close();
        } finally {
            c13302.close();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m40145() {
        return this.f52652;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081 A[Catch: all -> 0x00a3, TryCatch #0 {all -> 0x00a3, blocks: (B:17:0x0032, B:19:0x0051, B:21:0x006d, B:26:0x0077, B:28:0x0086, B:27:0x0081), top: B:36:0x0032 }] */
    /* JADX INFO: renamed from: ֫ */
    public final void m40144(AbstractC10913 abstractC10913) throws C11584 {
        C14935 c14935;
        boolean z = true;
        if (this.f52654 == 0) {
            synchronized (this) {
                try {
                    try {
                        this.f52654 = 1;
                        m40144(new C16276(this.f52656, this));
                    } catch (IOException e) {
                        this.f52654 = 0;
                        throw e;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        byte[] bArrM27089 = this.f52653.mo29604().m27089();
        byte[] bArrM270810 = this.f52653.mo29604().m27089();
        try {
            C14935 c14936 = new C14935(bArrM270810, 0);
            abstractC10913.f30255 = 3;
            abstractC10913.f30257 = f52649.incrementAndGet();
            abstractC10913.mo4602(c14936);
            int iM40143 = m40143(m40140(abstractC10913, bArrM270810, c14936), abstractC10913.f30253, bArrM270810, bArrM27089);
            if (iM40143 != 0) {
                C14935 c14937 = new C14935(bArrM27089, 0);
                c14937.f42652 = 0;
                c14937.f42649 = c14937;
                c14937.f42650 = 8;
                c14937.f42649.f42652 = c14937.m34160();
                c14937.f42650 = 0;
                abstractC10913.m25176(c14937);
            }
            if (iM40143 != 0) {
                if ((abstractC10913.f30255 & 2) != 2) {
                    z = false;
                }
                if (!z) {
                    c14935 = new C14935(m40141(abstractC10913, bArrM27089), 0);
                } else {
                    c14935 = new C14935(bArrM27089, 0);
                }
            } else {
                c14935 = new C14935(bArrM27089, 0);
            }
            abstractC10913.mo4601(c14935);
            this.f52653.mo29604().m27088(bArrM27089);
            this.f52653.mo29604().m27088(bArrM270810);
            C11584 c11584Mo25175 = abstractC10913.mo25175();
            if (c11584Mo25175 != null) {
                throw c11584Mo25175;
            }
        } catch (Throwable th2) {
            this.f52653.mo29604().m27088(bArrM27089);
            this.f52653.mo29604().m27088(bArrM270810);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m40141(AbstractC10913 abstractC10913, byte[] bArr) throws IOException {
        int i = abstractC10913.f30252 == 2 ? abstractC10913.f30253 : 24;
        int i2 = this.f52655;
        byte[] bArr2 = new byte[i2];
        C14935 c14935 = new C14935(bArr2, 0);
        while ((abstractC10913.f30255 & 2) != 2) {
            InterfaceC15312 interfaceC15312 = this.f52657;
            int iMo34852 = interfaceC15312.mo34852(0, i2, bArr2);
            if (bArr2[0] != 5 || bArr2[1] != 0) {
                throw new IOException("Unexpected DCERPC PDU header");
            }
            short sM10970 = C5137.m10970(8, bArr2);
            if (sM10970 > i2) {
                throw new IOException(C20778.m46922(sM10970, "Unexpected fragment length: "));
            }
            while (iMo34852 < sM10970) {
                int iMo34853 = interfaceC15312.mo34852(iMo34852, sM10970 - iMo34852, bArr2);
                if (iMo34853 == 0) {
                    throw new IOException("Unexpected EOF");
                }
                iMo34852 += iMo34853;
            }
            c14935.f42652 = 0;
            c14935.f42649 = c14935;
            c14935.f42650 = 8;
            c14935.f42649.f42652 = c14935.m34160();
            c14935.f42650 = c14935.f42651;
            c14935.f42652 = 0;
            c14935.f42649 = c14935;
            abstractC10913.m25176(c14935);
            int i3 = abstractC10913.f30253 - 24;
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
        return this.f52656.toString();
    }
}
