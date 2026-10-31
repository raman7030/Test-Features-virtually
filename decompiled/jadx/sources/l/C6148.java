package l;

import bin.mt.plus.R;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6148 extends C3695 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C6148 f18925 = new C6148();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C6148 m17063() {
        return f18925;
    }

    @Override // l.C3695
    /* JADX INFO: renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return m17062(((C11793) interfaceC17889).m28851());
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (!interfaceC17889.mo36969()) {
            return 0;
        }
        String strMo36971 = ((C11793) interfaceC17889).mo36971();
        if (strMo36971.equals("image/svg+xml")) {
            return 2;
        }
        if (strMo36971.equals("text/xml")) {
            return 3;
        }
        return strMo36971.startsWith("image/") ? 1 : 0;
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        C9160 c9160 = (C9160) abstractC16891;
        C1358 c1358M28851 = ((C11793) interfaceC17889).m28851();
        try {
            C10531 c10531M26448 = C10531.m26448(C16999.m39866(c9160.m23568(), new String[0]));
            try {
                String strM17062 = m17062(c1358M28851);
                C10382 c10382 = new C10382(c10531M26448, c1358M28851);
                if (i == 1 || i == 2) {
                    C11813 c11813M11250 = C3695.m11250(strM17062, C19883.f64215, true, new C17245(2, c10382));
                    c10531M26448.close();
                    return c11813M11250;
                }
                if (i == 3) {
                    C19883 c19883 = C19883.f64196;
                    C11813 c11813M11251 = C3695.m11250(strM17062, c19883, true, new C5975(1, c10382));
                    if (c11813M11251 != c19883.f64250) {
                        interfaceC17889.mo36975(R.id.MT_Protector, Boolean.TRUE);
                    }
                    c10531M26448.close();
                    return c11813M11251;
                }
                c10531M26448.close();
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c10531M26448.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17062(C1358 c1358) {
        return C14460.m34530("tar:" + Long.toHexString(((long) Arrays.hashCode(new long[]{c1358.m4765(), c1358.m4758().getTime(), c1358.m4741().hashCode()})) & 4294967295L) + c1358.m4729()).toLowerCase();
    }
}
