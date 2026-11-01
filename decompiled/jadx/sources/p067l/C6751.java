package p067l;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۙۧᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 819Z */
/* JADX INFO: loaded from: classes2.dex */
public final class C6751 {

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 f17509;

    /* JADX INFO: renamed from: ۧ */
    public final byte[] f17510;

    /* JADX INFO: renamed from: ܳ */
    public C23515 f17511;

    /* JADX INFO: renamed from: ܽ */
    public final byte[] f17512;

    /* JADX INFO: renamed from: ܿ */
    public final byte[] f17513;

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] f17514;

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C23515 m15416(InterfaceC18588 interfaceC18588) {
        C23515 c23515 = this.f17511;
        if (c23515 != null) {
            return c23515;
        }
        try {
            C23515 c23515M15415 = m15415(C17917.m40721(interfaceC18588));
            this.f17511 = c23515M15415;
            return c23515M15415;
        } catch (IOException e) {
            this.f17511 = new C23515();
            throw e;
        }
    }

    public C6751(AbstractC17043 abstractC17043, boolean z) throws IOException {
        byte[] bArr;
        this.f17509 = abstractC17043;
        byte[] bArrM54988 = null;
        if (z) {
            C24618 c24618M38671 = abstractC17043.m38671("r");
            try {
                C20359 c20359 = new C20359(c24618M38671);
                byte[] bArrM50221 = C22371.m50221(c20359, (byte[]) null);
                this.f17512 = bArrM50221;
                byte[] bArrM15414 = bArrM50221 != null ? null : m15414(C17675.m40204(c20359, false, (byte[]) null));
                this.f17513 = bArrM15414;
                byte[] bArrM15415 = (bArrM50221 == null && bArrM15414 == null) ? m15414(C17675.m40204(c20359, true, (byte[]) null)) : null;
                this.f17514 = bArrM15415;
                c24618M38671.close();
                if (bArrM50221 == null && bArrM15414 == null && bArrM15415 == null) {
                    bArrM54988 = C25052.m54988(abstractC17043);
                }
                this.f17510 = bArrM54988;
                return;
            } catch (Throwable th) {
                try {
                    c24618M38671.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] bArrM54989 = C25052.m54988(abstractC17043);
        this.f17510 = bArrM54989;
        C24618 c24618M38672 = abstractC17043.m38671("r");
        try {
            C20359 c203510 = new C20359(c24618M38672);
            byte[] bArrM50222 = C22371.m50221(c203510, bArrM54989);
            this.f17512 = bArrM50222;
            byte[][] bArr2 = {bArrM50222, bArrM54989};
            int i = 0;
            while (true) {
                if (i >= 2) {
                    bArr = null;
                    break;
                }
                bArr = bArr2[i];
                if (bArr != null) {
                    break;
                } else {
                    i++;
                }
            }
            byte[] bArrM15416 = m15414(C17675.m40204(c203510, false, bArr));
            this.f17513 = bArrM15416;
            byte[][] bArr3 = {bArrM15416, bArrM50222, bArrM54989};
            for (int i2 = 0; i2 < 3; i2++) {
                byte[] bArr4 = bArr3[i2];
                if (bArr4 != null) {
                    bArrM54988 = bArr4;
                    break;
                }
            }
            this.f17514 = m15414(C17675.m40204(c203510, true, bArrM54988));
            c24618M38672.close();
        } catch (Throwable th3) {
            try {
                c24618M38672.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m15414(C1349 c1349) {
        if (c1349 == null) {
            return null;
        }
        Object obj = c1349.f33658;
        byte[] bArr = this.f17510;
        if (bArr == null) {
            bArr = this.f17512;
        }
        if (bArr == null) {
            return (byte[]) obj;
        }
        try {
            C23001 c23001 = (C23001) c1349.f33659;
            if (c23001 == null) {
                return (byte[]) obj;
            }
            if (c23001.m51391((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).m51390() == 1) {
                return bArr;
            }
            return (byte[]) obj;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m15426() {
        return (this.f17510 == null && this.f17512 == null && this.f17513 == null && this.f17514 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m15418() {
        byte[] bArr = this.f17514;
        byte[] bArr2 = this.f17513;
        byte[] bArr3 = this.f17512;
        byte[] bArr4 = this.f17510;
        if (bArr4 != null) {
            if (bArr3 != null && !Arrays.equals(bArr4, bArr3)) {
                return true;
            }
            if (bArr2 != null && !Arrays.equals(bArr4, bArr2)) {
                return true;
            }
            if (bArr != null && !Arrays.equals(bArr4, bArr)) {
                return true;
            }
        }
        if (bArr3 != null) {
            if (bArr2 != null && !Arrays.equals(bArr3, bArr2)) {
                return true;
            }
            if (bArr != null && !Arrays.equals(bArr3, bArr)) {
                return true;
            }
        }
        return (bArr2 == null || bArr == null || Arrays.equals(bArr2, bArr)) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public final byte[] m15421() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (bArr3 = this.f17514) != null) {
            return bArr3;
        }
        if (i >= 28 && (bArr2 = this.f17513) != null) {
            return bArr2;
        }
        if (i >= 24 && (bArr = this.f17512) != null) {
            return bArr;
        }
        byte[] bArr4 = this.f17510;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m15417() {
        byte[] bArr = this.f17514;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f17513;
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArr3 = this.f17512;
        if (bArr3 != null) {
            return bArr3;
        }
        byte[] bArr4 = this.f17510;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m15422() {
        return this.f17514;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final byte[] m15427() {
        return this.f17513;
    }

    /* JADX INFO: renamed from: ܿ */
    public final byte[] m15424() {
        return this.f17512;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final byte[] m15425() {
        return this.f17510;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m15423() {
        boolean z = this.f17510 != null;
        boolean z2 = this.f17512 != null;
        boolean z3 = this.f17513 != null;
        boolean z4 = this.f17514 != null;
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add("V1");
        }
        if (z2) {
            arrayList.add("V2");
        }
        if (z3) {
            arrayList.add("V3");
        }
        if (z4) {
            arrayList.add("V3.1");
        }
        return arrayList.isEmpty() ? "NULL" : C11567.m26623(arrayList, " + ");
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m15419() {
        return this.f17511 != null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m15420() {
        return m15419() && this.f17511.f74929;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX INFO: renamed from: ۧ */
    private C23515 m15415(InterfaceC18588 interfaceC18588) throws IOException {
        EnumC21504 enumC21504;
        C23515 c23515 = new C23515();
        byte[] bArr = this.f17514;
        byte[] bArr2 = this.f17513;
        byte[] bArr3 = this.f17512;
        byte[] bArr4 = this.f17510;
        if (bArr4 == null && bArr3 == null && bArr2 == null && bArr == null) {
            return c23515;
        }
        AbstractC17043 abstractC17043 = this.f17509;
        C24618 c24618M38671 = abstractC17043.m38671("r");
        try {
            C20359 c20359 = new C20359(c24618M38671);
            C16808 c16808 = c23515.f74934;
            if (bArr3 != null) {
                if (C22371.m50218(c20359, interfaceC18588)) {
                    c16808.f49535 = EnumC22845.SUCCESS;
                } else {
                    c16808.f49535 = EnumC22845.FAIL;
                }
            }
            Boolean bool = null;
            if (!interfaceC18588.mo3924()) {
                C16808 c16809 = c23515.f74933;
                if (bArr2 != null) {
                    if (C17675.m40205(c20359, false, interfaceC18588)) {
                        c16809.f49535 = EnumC22845.SUCCESS;
                    } else {
                        c16809.f49535 = EnumC22845.FAIL;
                    }
                }
                if (!interfaceC18588.mo3924()) {
                    C16808 c168010 = c23515.f74931;
                    if (bArr != null) {
                        if (C17675.m40205(c20359, true, interfaceC18588)) {
                            c168010.f49535 = EnumC22845.SUCCESS;
                        } else {
                            c168010.f49535 = EnumC22845.FAIL;
                        }
                    }
                    if (interfaceC18588.mo3924()) {
                        c24618M38671.close();
                        return null;
                    }
                    c24618M38671.close();
                    C16808 c168011 = c23515.f74932;
                    if (bArr4 != null) {
                        if (C25052.m54986(abstractC17043, c23515, interfaceC18588)) {
                            c168011.f49535 = EnumC22845.SUCCESS;
                        } else {
                            c168011.f49535 = EnumC22845.FAIL;
                        }
                    }
                    if (interfaceC18588.mo3924()) {
                        return null;
                    }
                    if (!c168010.f49534) {
                        enumC21504 = null;
                    } else if (c168010.f49535.m51052()) {
                        bool = Boolean.TRUE;
                        enumC21504 = null;
                    } else if (c168010.f49535.m51049()) {
                        bool = Boolean.FALSE;
                        if (c23515.m52295()) {
                            enumC21504 = EnumC21504.FAIL;
                        } else if (c168010.f49535.m51053()) {
                            enumC21504 = EnumC21504.FAIL_MISSING_V31;
                        } else {
                            enumC21504 = EnumC21504.FAIL_V31;
                        }
                    } else {
                        enumC21504 = null;
                    }
                    if (bool == null && c16809.f49534) {
                        if (c16809.f49535.m51052()) {
                            bool = Boolean.TRUE;
                        } else if (c16809.f49535.m51049()) {
                            bool = Boolean.FALSE;
                            if (c23515.m52295()) {
                                enumC21504 = EnumC21504.FAIL;
                            } else if (c16809.f49535.m51053()) {
                                enumC21504 = EnumC21504.FAIL_MISSING_V3;
                            } else {
                                enumC21504 = EnumC21504.FAIL_V3;
                            }
                        }
                    }
                    if (bool == null && c16808.f49534) {
                        if (c16808.f49535.m51052()) {
                            bool = Boolean.TRUE;
                        } else if (c16808.f49535.m51049()) {
                            bool = Boolean.FALSE;
                            if (c23515.m52295()) {
                                enumC21504 = EnumC21504.FAIL;
                            } else if (c16808.f49535.m51053()) {
                                enumC21504 = EnumC21504.FAIL_MISSING_V2;
                            } else {
                                enumC21504 = EnumC21504.FAIL_V2;
                            }
                        }
                    }
                    if (bool == null) {
                        if (c168011.f49535.m51052()) {
                            if (c168010.f49534 && c168010.f49535.m51051()) {
                                enumC21504 = EnumC21504.FAIL_MISSING_V31;
                                bool = Boolean.FALSE;
                            } else if (c16809.f49534 && c16809.f49535.m51051()) {
                                enumC21504 = EnumC21504.FAIL_MISSING_V3;
                                bool = Boolean.FALSE;
                            } else if (c16808.f49534 && c16808.f49535.m51051()) {
                                enumC21504 = EnumC21504.FAIL_MISSING_V2;
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                            if (c23515.m52295()) {
                                enumC21504 = EnumC21504.FAIL;
                            } else if (c168011.f49535.m51053()) {
                                enumC21504 = EnumC21504.FAIL_MISSING_V1;
                            } else {
                                enumC21504 = EnumC21504.FAIL_V1;
                            }
                        }
                    }
                    if (enumC21504 == null) {
                        if (c168011.f49535.m51049()) {
                            enumC21504 = EnumC21504.FAIL_V1;
                        } else if (c16808.f49535.m51049()) {
                            enumC21504 = EnumC21504.FAIL_V2;
                        } else if (c16809.f49535.m51049()) {
                            enumC21504 = EnumC21504.FAIL_V3;
                        } else if (c168010.f49535.m51049()) {
                            enumC21504 = EnumC21504.FAIL_V31;
                        } else if (c16808.f49535.m51051()) {
                            enumC21504 = EnumC21504.FAIL_MISSING_V2;
                        } else if (c16809.f49535.m51051()) {
                            enumC21504 = EnumC21504.FAIL_MISSING_V3;
                        } else if (c168010.f49535.m51051()) {
                            enumC21504 = EnumC21504.FAIL_MISSING_V31;
                        } else if (m15413(bArr4, bArr3)) {
                            enumC21504 = EnumC21504.FAIL_DIFFERENT_V1_V2;
                        } else if (m15413(bArr4, bArr2)) {
                            enumC21504 = EnumC21504.FAIL_DIFFERENT_V1_V3;
                        } else if (m15413(bArr4, bArr)) {
                            enumC21504 = EnumC21504.FAIL_DIFFERENT_V1_V31;
                        } else if (m15413(bArr3, bArr2)) {
                            enumC21504 = EnumC21504.FAIL_DIFFERENT_V2_V3;
                        } else if (m15413(bArr3, bArr)) {
                            enumC21504 = EnumC21504.FAIL_DIFFERENT_V2_V31;
                        } else if (m15413(bArr2, bArr)) {
                            enumC21504 = EnumC21504.FAIL_DIFFERENT_V3_V31;
                        } else if (bool.booleanValue()) {
                            enumC21504 = EnumC21504.SUCCESS;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    c23515.f74929 = bool.booleanValue();
                    c23515.f74930 = enumC21504;
                    return c23515;
                }
                c24618M38671.close();
                return null;
            }
            c24618M38671.close();
            return null;
        } catch (Throwable th) {
            try {
                c24618M38671.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m15413(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || Arrays.equals(bArr, bArr2)) ? false : true;
    }
}
