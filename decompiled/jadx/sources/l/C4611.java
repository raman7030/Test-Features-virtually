package l;

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
public final class C4611 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f14681;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] f14682;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C22250 f14683;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] f14684;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] f14685;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] f14686;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C22250 m13527(InterfaceC17066 interfaceC17066) {
        C22250 c22250 = this.f14683;
        if (c22250 != null) {
            return c22250;
        }
        try {
            C22250 c22250M13526 = m13526(C16360.m38504(interfaceC17066));
            this.f14683 = c22250M13526;
            return c22250M13526;
        } catch (IOException e) {
            this.f14683 = new C22250();
            throw e;
        }
    }

    public C4611(AbstractC15440 abstractC15440, boolean z) throws IOException {
        byte[] bArr;
        this.f14681 = abstractC15440;
        byte[] bArrM52579 = null;
        if (z) {
            C23411 c23411M36513 = abstractC15440.m36513("r");
            try {
                C18929 c18929 = new C18929(c23411M36513);
                byte[] bArrM47891 = C21046.m47891(c18929, (byte[]) null);
                this.f14684 = bArrM47891;
                byte[] bArrM13525 = bArrM47891 != null ? null : m13525(C16105.m38013(c18929, false, (byte[]) null));
                this.f14685 = bArrM13525;
                byte[] bArrM13526 = (bArrM47891 == null && bArrM13525 == null) ? m13525(C16105.m38013(c18929, true, (byte[]) null)) : null;
                this.f14686 = bArrM13526;
                c23411M36513.close();
                if (bArrM47891 == null && bArrM13525 == null && bArrM13526 == null) {
                    bArrM52579 = C23867.m52579(abstractC15440);
                }
                this.f14682 = bArrM52579;
                return;
            } catch (Throwable th) {
                try {
                    c23411M36513.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] bArrM525710 = C23867.m52579(abstractC15440);
        this.f14682 = bArrM525710;
        C23411 c23411M36514 = abstractC15440.m36513("r");
        try {
            C18929 c189210 = new C18929(c23411M36514);
            byte[] bArrM47892 = C21046.m47891(c189210, bArrM525710);
            this.f14684 = bArrM47892;
            byte[][] bArr2 = {bArrM47892, bArrM525710};
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
            byte[] bArrM13527 = m13525(C16105.m38013(c189210, false, bArr));
            this.f14685 = bArrM13527;
            byte[][] bArr3 = {bArrM13527, bArrM47892, bArrM525710};
            for (int i2 = 0; i2 < 3; i2++) {
                byte[] bArr4 = bArr3[i2];
                if (bArr4 != null) {
                    bArrM52579 = bArr4;
                    break;
                }
            }
            this.f14686 = m13525(C16105.m38013(c189210, true, bArrM52579));
            c23411M36514.close();
        } catch (Throwable th3) {
            try {
                c23411M36514.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m13525(C10220 c10220) {
        if (c10220 == null) {
            return null;
        }
        Object obj = c10220.f30697;
        byte[] bArr = this.f14682;
        if (bArr == null) {
            bArr = this.f14684;
        }
        if (bArr == null) {
            return (byte[]) obj;
        }
        try {
            C21709 c21709 = (C21709) c10220.f30698;
            if (c21709 == null) {
                return (byte[]) obj;
            }
            if (c21709.m49042((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).m49041() == 1) {
                return bArr;
            }
            return (byte[]) obj;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13537() {
        return (this.f14682 == null && this.f14684 == null && this.f14685 == null && this.f14686 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m13529() {
        byte[] bArr = this.f14686;
        byte[] bArr2 = this.f14685;
        byte[] bArr3 = this.f14684;
        byte[] bArr4 = this.f14682;
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

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final byte[] m13532() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 && (bArr3 = this.f14686) != null) {
            return bArr3;
        }
        if (i >= 28 && (bArr2 = this.f14685) != null) {
            return bArr2;
        }
        if (i >= 24 && (bArr = this.f14684) != null) {
            return bArr;
        }
        byte[] bArr4 = this.f14682;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m13528() {
        byte[] bArr = this.f14686;
        if (bArr != null) {
            return bArr;
        }
        byte[] bArr2 = this.f14685;
        if (bArr2 != null) {
            return bArr2;
        }
        byte[] bArr3 = this.f14684;
        if (bArr3 != null) {
            return bArr3;
        }
        byte[] bArr4 = this.f14682;
        if (bArr4 != null) {
            return bArr4;
        }
        return null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m13533() {
        return this.f14686;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final byte[] m13538() {
        return this.f14685;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final byte[] m13535() {
        return this.f14684;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final byte[] m13536() {
        return this.f14682;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m13534() {
        boolean z = this.f14682 != null;
        boolean z2 = this.f14684 != null;
        boolean z3 = this.f14685 != null;
        boolean z4 = this.f14686 != null;
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
        return arrayList.isEmpty() ? "NULL" : C9679.m24609(arrayList, " + ");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m13530() {
        return this.f14683 != null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m13531() {
        return m13530() && this.f14683.f72204;
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00cd  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C22250 m13526(InterfaceC17066 interfaceC17066) throws IOException {
        EnumC20134 enumC20134;
        C22250 c22250 = new C22250();
        byte[] bArr = this.f14686;
        byte[] bArr2 = this.f14685;
        byte[] bArr3 = this.f14684;
        byte[] bArr4 = this.f14682;
        if (bArr4 == null && bArr3 == null && bArr2 == null && bArr == null) {
            return c22250;
        }
        AbstractC15440 abstractC15440 = this.f14681;
        C23411 c23411M36513 = abstractC15440.m36513("r");
        try {
            C18929 c18929 = new C18929(c23411M36513);
            C15193 c15193 = c22250.f72209;
            if (bArr3 != null) {
                if (C21046.m47888(c18929, interfaceC17066)) {
                    c15193.f46410 = EnumC21545.SUCCESS;
                } else {
                    c15193.f46410 = EnumC21545.FAIL;
                }
            }
            Boolean bool = null;
            if (!interfaceC17066.mo1526()) {
                C15193 c15194 = c22250.f72208;
                if (bArr2 != null) {
                    if (C16105.m38014(c18929, false, interfaceC17066)) {
                        c15194.f46410 = EnumC21545.SUCCESS;
                    } else {
                        c15194.f46410 = EnumC21545.FAIL;
                    }
                }
                if (!interfaceC17066.mo1526()) {
                    C15193 c15195 = c22250.f72206;
                    if (bArr != null) {
                        if (C16105.m38014(c18929, true, interfaceC17066)) {
                            c15195.f46410 = EnumC21545.SUCCESS;
                        } else {
                            c15195.f46410 = EnumC21545.FAIL;
                        }
                    }
                    if (interfaceC17066.mo1526()) {
                        c23411M36513.close();
                        return null;
                    }
                    c23411M36513.close();
                    C15193 c15196 = c22250.f72207;
                    if (bArr4 != null) {
                        if (C23867.m52577(abstractC15440, c22250, interfaceC17066)) {
                            c15196.f46410 = EnumC21545.SUCCESS;
                        } else {
                            c15196.f46410 = EnumC21545.FAIL;
                        }
                    }
                    if (interfaceC17066.mo1526()) {
                        return null;
                    }
                    if (!c15195.f46409) {
                        enumC20134 = null;
                    } else if (c15195.f46410.m48707()) {
                        bool = Boolean.TRUE;
                        enumC20134 = null;
                    } else if (c15195.f46410.m48704()) {
                        bool = Boolean.FALSE;
                        if (c22250.m49967()) {
                            enumC20134 = EnumC20134.FAIL;
                        } else if (c15195.f46410.m48708()) {
                            enumC20134 = EnumC20134.FAIL_MISSING_V31;
                        } else {
                            enumC20134 = EnumC20134.FAIL_V31;
                        }
                    } else {
                        enumC20134 = null;
                    }
                    if (bool == null && c15194.f46409) {
                        if (c15194.f46410.m48707()) {
                            bool = Boolean.TRUE;
                        } else if (c15194.f46410.m48704()) {
                            bool = Boolean.FALSE;
                            if (c22250.m49967()) {
                                enumC20134 = EnumC20134.FAIL;
                            } else if (c15194.f46410.m48708()) {
                                enumC20134 = EnumC20134.FAIL_MISSING_V3;
                            } else {
                                enumC20134 = EnumC20134.FAIL_V3;
                            }
                        }
                    }
                    if (bool == null && c15193.f46409) {
                        if (c15193.f46410.m48707()) {
                            bool = Boolean.TRUE;
                        } else if (c15193.f46410.m48704()) {
                            bool = Boolean.FALSE;
                            if (c22250.m49967()) {
                                enumC20134 = EnumC20134.FAIL;
                            } else if (c15193.f46410.m48708()) {
                                enumC20134 = EnumC20134.FAIL_MISSING_V2;
                            } else {
                                enumC20134 = EnumC20134.FAIL_V2;
                            }
                        }
                    }
                    if (bool == null) {
                        if (c15196.f46410.m48707()) {
                            if (c15195.f46409 && c15195.f46410.m48706()) {
                                enumC20134 = EnumC20134.FAIL_MISSING_V31;
                                bool = Boolean.FALSE;
                            } else if (c15194.f46409 && c15194.f46410.m48706()) {
                                enumC20134 = EnumC20134.FAIL_MISSING_V3;
                                bool = Boolean.FALSE;
                            } else if (c15193.f46409 && c15193.f46410.m48706()) {
                                enumC20134 = EnumC20134.FAIL_MISSING_V2;
                                bool = Boolean.FALSE;
                            } else {
                                bool = Boolean.TRUE;
                            }
                        } else {
                            bool = Boolean.FALSE;
                            if (c22250.m49967()) {
                                enumC20134 = EnumC20134.FAIL;
                            } else if (c15196.f46410.m48708()) {
                                enumC20134 = EnumC20134.FAIL_MISSING_V1;
                            } else {
                                enumC20134 = EnumC20134.FAIL_V1;
                            }
                        }
                    }
                    if (enumC20134 == null) {
                        if (c15196.f46410.m48704()) {
                            enumC20134 = EnumC20134.FAIL_V1;
                        } else if (c15193.f46410.m48704()) {
                            enumC20134 = EnumC20134.FAIL_V2;
                        } else if (c15194.f46410.m48704()) {
                            enumC20134 = EnumC20134.FAIL_V3;
                        } else if (c15195.f46410.m48704()) {
                            enumC20134 = EnumC20134.FAIL_V31;
                        } else if (c15193.f46410.m48706()) {
                            enumC20134 = EnumC20134.FAIL_MISSING_V2;
                        } else if (c15194.f46410.m48706()) {
                            enumC20134 = EnumC20134.FAIL_MISSING_V3;
                        } else if (c15195.f46410.m48706()) {
                            enumC20134 = EnumC20134.FAIL_MISSING_V31;
                        } else if (m13524(bArr4, bArr3)) {
                            enumC20134 = EnumC20134.FAIL_DIFFERENT_V1_V2;
                        } else if (m13524(bArr4, bArr2)) {
                            enumC20134 = EnumC20134.FAIL_DIFFERENT_V1_V3;
                        } else if (m13524(bArr4, bArr)) {
                            enumC20134 = EnumC20134.FAIL_DIFFERENT_V1_V31;
                        } else if (m13524(bArr3, bArr2)) {
                            enumC20134 = EnumC20134.FAIL_DIFFERENT_V2_V3;
                        } else if (m13524(bArr3, bArr)) {
                            enumC20134 = EnumC20134.FAIL_DIFFERENT_V2_V31;
                        } else if (m13524(bArr2, bArr)) {
                            enumC20134 = EnumC20134.FAIL_DIFFERENT_V3_V31;
                        } else if (bool.booleanValue()) {
                            enumC20134 = EnumC20134.SUCCESS;
                        } else {
                            throw new RuntimeException();
                        }
                    }
                    c22250.f72204 = bool.booleanValue();
                    c22250.f72205 = enumC20134;
                    return c22250;
                }
                c23411M36513.close();
                return null;
            }
            c23411M36513.close();
            return null;
        } catch (Throwable th) {
            try {
                c23411M36513.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m13524(byte[] bArr, byte[] bArr2) {
        return (bArr == null || bArr2 == null || Arrays.equals(bArr, bArr2)) ? false : true;
    }
}
