package p067l;

import bin.p000mt.plus.R;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۛܶ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8212 extends C5880 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C8212 f21784 = new C8212();

    /* JADX INFO: renamed from: ۧ */
    public static C8212 m18995() {
        return f21784;
    }

    @Override // p067l.C5880
    /* JADX INFO: renamed from: ֫ */
    public final String mo11391(InterfaceC19370 interfaceC19370, int i) {
        return m18994(((C13577) interfaceC19370).m30900());
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public final int mo11393(InterfaceC19370 interfaceC19370) {
        if (!interfaceC19370.mo39135()) {
            return 0;
        }
        String strMo39137 = ((C13577) interfaceC19370).mo39137();
        if (strMo39137.equals("image/svg+xml")) {
            return 2;
        }
        if (strMo39137.equals("text/xml")) {
            return 3;
        }
        return strMo39137.startsWith("image/") ? 1 : 0;
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C13596 mo11392(AbstractC18422 abstractC18422, InterfaceC19370 interfaceC19370, int i) {
        C11075 c11075 = (C11075) abstractC18422;
        C3659 c3659M30900 = ((C13577) interfaceC19370).m30900();
        try {
            C12377 c12377M28481 = C12377.m28481(C18524.m42109(c11075.m25519(), new String[0]));
            try {
                String strM18994 = m18994(c3659M30900);
                C12236 c12236 = new C12236(c12377M28481, c3659M30900);
                if (i == 1 || i == 2) {
                    C13596 c13596M13196 = C5880.m13196(strM18994, C21265.f66851, true, new C18758(2, c12236));
                    c12377M28481.close();
                    return c13596M13196;
                }
                if (i == 3) {
                    C21265 c21265 = C21265.f66832;
                    C13596 c13596M13197 = C5880.m13196(strM18994, c21265, true, new C8047(1, c12236));
                    if (c13596M13197 != c21265.f66886) {
                        interfaceC19370.mo39141(R.id.MT_Protector, Boolean.TRUE);
                    }
                    c12377M28481.close();
                    return c13596M13197;
                }
                c12377M28481.close();
                throw new RuntimeException();
            } catch (Throwable th) {
                try {
                    c12377M28481.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m18994(C3659 c3659) {
        return C16111.m36664("tar:" + Long.toHexString(((long) Arrays.hashCode(new long[]{c3659.m7003(), c3659.m6996().getTime(), c3659.m6979().hashCode()})) & 4294967295L) + c3659.m6967()).toLowerCase();
    }
}
