package l;

import android.graphics.Bitmap;
import bin.mt.plus.R;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes4.dex */
public final class C13350 extends C3695 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C13350 f39925 = new C13350();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C13350 m32325() {
        return f39925;
    }

    @Override // l.C3695
    /* JADX INFO: renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return m32324(((C12645) interfaceC17889).m30924());
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C19883 mo11258(InterfaceC17889 interfaceC17889) {
        C19883 c19883M9975 = C3256.m9975(interfaceC17889);
        if (c19883M9975 == C19883.f64193) {
            String lowerCase = interfaceC17889.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C19883.f64240;
            }
        }
        return c19883M9975;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (!interfaceC17889.mo36969()) {
            return 0;
        }
        C12645 c12645 = (C12645) interfaceC17889;
        if (c12645.mo25860()) {
            return 0;
        }
        String strMo36971 = c12645.mo36971();
        long size = c12645.getSize();
        if (strMo36971.equals("image/svg+xml")) {
            return size <= 819200 ? 2 : 0;
        }
        if (strMo36971.equals("text/xml")) {
            return size <= 153600 ? 3 : 0;
        }
        return (!strMo36971.startsWith("image/") || size > X931RNG.BLOCK128_RESEED_MAX) ? 0 : 1;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        final C7364 c7364;
        String strM32324;
        C11813 c11813M11250;
        C10738 c10738 = (C10738) abstractC16891;
        C12645 c12645 = (C12645) interfaceC17889;
        C7364 c7365 = null;
        try {
            String strM26937 = c10738.m26937();
            C18090 c18090M42168 = C18090.m42168(C16999.m39866(strM26937, new String[0]), c10738.m26940());
            try {
                c7364 = new C7364(c18090M42168.m42193(c12645.m30924(), (C19277) null));
                try {
                    c18090M42168.close();
                } catch (Throwable unused) {
                    c7365 = c7364;
                    c7364 = c7365;
                }
                strM32324 = m32324(c12645.m30924());
                if (i != 1 || i == 2) {
                    return C3695.m11250(strM32324, C19883.f64215, true, new C20407(c7364));
                }
                if (i == 3) {
                    final C12534 c12534M44386 = c10738.mo6020().m44386();
                    if (c12534M44386 != null && c7364 != null) {
                        c11813M11250 = C3695.m11250(strM32324, C19883.f64196, true, new InterfaceC4644(this) { // from class: l.ۙ᩶᩻
                            @Override // l.InterfaceC4644
                            /* JADX INFO: renamed from: ֫ */
                            public final Bitmap mo5660() {
                                return C17447.m40789(new C3473(c12534M44386, c7364));
                            }
                        });
                    } else {
                        c11813M11250 = C3695.m11250(strM32324, C19883.f64196, true, new C2949(4, c7364));
                    }
                    if (c11813M11250 != C19883.f64196.f64250) {
                        interfaceC17889.mo36975(R.id.MT_Protector, Boolean.TRUE);
                    }
                    return c11813M11250;
                }
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c18090M42168.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused2) {
            c7364 = c7365;
            strM32324 = m32324(c12645.m30924());
            if (i != 1) {
            }
            return C3695.m11250(strM32324, C19883.f64215, true, new C20407(c7364));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m32324(C3545 c3545) {
        return C14460.m34530("zip:" + Long.toHexString(c3545.m10791()) + c3545.getSize()).toLowerCase();
    }
}
