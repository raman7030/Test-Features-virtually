package p067l;

import android.graphics.Bitmap;
import bin.p000mt.plus.R;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۬᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y20N */
/* JADX INFO: loaded from: classes4.dex */
public final class C15057 extends C5880 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C15057 f42992 = new C15057();

    /* JADX INFO: renamed from: ۧ */
    public static C15057 m34426() {
        return f42992;
    }

    @Override // p067l.C5880
    /* JADX INFO: renamed from: ֫ */
    public final String mo11391(InterfaceC19370 interfaceC19370, int i) {
        return m34425(((C14387) interfaceC19370).m33002());
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C21265 mo13204(InterfaceC19370 interfaceC19370) {
        C21265 c21265M12008 = C5463.m12008(interfaceC19370);
        if (c21265M12008 == C21265.f66829) {
            String lowerCase = interfaceC19370.getName().toLowerCase();
            if (lowerCase.startsWith("mapping") && lowerCase.endsWith(".bin")) {
                return C21265.f66876;
            }
        }
        return c21265M12008;
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public final int mo11393(InterfaceC19370 interfaceC19370) {
        if (!interfaceC19370.mo39135()) {
            return 0;
        }
        C14387 c14387 = (C14387) interfaceC19370;
        if (c14387.mo27882()) {
            return 0;
        }
        String strMo39137 = c14387.mo39137();
        long size = c14387.getSize();
        if (strMo39137.equals("image/svg+xml")) {
            return size <= 819200 ? 2 : 0;
        }
        if (strMo39137.equals("text/xml")) {
            return size <= 153600 ? 3 : 0;
        }
        return (!strMo39137.startsWith("image/") || size > X931RNG.BLOCK128_RESEED_MAX) ? 0 : 1;
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C13596 mo11392(AbstractC18422 abstractC18422, InterfaceC19370 interfaceC19370, int i) {
        final C9367 c9367;
        String strM34425;
        C13596 c13596M13196;
        C12574 c12574 = (C12574) abstractC18422;
        C14387 c14387 = (C14387) interfaceC19370;
        C9367 c9368 = null;
        try {
            String strM28981 = c12574.m28981();
            C19561 c19561M44427 = C19561.m44427(C18524.m42109(strM28981, new String[0]), c12574.m28984());
            try {
                c9367 = new C9367(c19561M44427.m44452(c14387.m33002(), (C20689) null));
                try {
                    c19561M44427.close();
                } catch (Throwable unused) {
                    c9368 = c9367;
                    c9367 = c9368;
                }
                strM34425 = m34425(c14387.m33002());
                if (i != 1 || i == 2) {
                    return C5880.m13196(strM34425, C21265.f66851, true, new C21764(c9367));
                }
                if (i == 3) {
                    final C14281 c14281M46680 = c12574.mo8217().m46680();
                    if (c14281M46680 != null && c9367 != null) {
                        c13596M13196 = C5880.m13196(strM34425, C21265.f66832, true, new InterfaceC6782(this) { // from class: l.ۙ᩶᩻
                            @Override // p067l.InterfaceC6782
                            /* JADX INFO: renamed from: ֫ */
                            public final Bitmap mo7890() {
                                return C18950.m43047(new C5670(c14281M46680, c9367));
                            }
                        });
                    } else {
                        c13596M13196 = C5880.m13196(strM34425, C21265.f66832, true, new C5171(4, c9367));
                    }
                    if (c13596M13196 != C21265.f66832.f66886) {
                        interfaceC19370.mo39141(R.id.MT_Protector, Boolean.TRUE);
                    }
                    return c13596M13196;
                }
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c19561M44427.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused2) {
            c9367 = c9368;
            strM34425 = m34425(c14387.m33002());
            if (i != 1) {
            }
            return C5880.m13196(strM34425, C21265.f66851, true, new C21764(c9367));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m34425(C5738 c5738) {
        return C16111.m36664("zip:" + Long.toHexString(c5738.m12772()) + c5738.getSize()).toLowerCase();
    }
}
