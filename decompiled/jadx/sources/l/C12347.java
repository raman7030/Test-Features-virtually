package l;

import bin.mt.plus.R;
import java.util.Arrays;
import net.sf.sevenzipjbinding.ExtractOperationResult;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۫ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB5W */
/* JADX INFO: loaded from: classes4.dex */
public final class C12347 extends C3695 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C12347 f36981 = new C12347();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C12347 m29966() {
        return f36981;
    }

    @Override // l.C3695
    /* JADX INFO: renamed from: ֫ */
    public final String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return m29964(((C10231) interfaceC17889).m25859());
    }

    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ */
    public final int mo9351(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969()) {
            return m29965(((C10231) interfaceC17889).m25859());
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m29965(C4007 c4007) {
        if (!c4007.m12076() && !c4007.m12075()) {
            String strM7304 = C2204.m7304(c4007.m12085());
            long jM12074 = c4007.m12074();
            if (strM7304.equals("image/svg+xml")) {
                return jM12074 <= 819200 ? 2 : 0;
            }
            if (strM7304.equals("text/xml")) {
                return jM12074 <= 153600 ? 3 : 0;
            }
            if (strM7304.startsWith("image/") && jM12074 <= X931RNG.BLOCK128_RESEED_MAX) {
                return 1;
            }
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [net.sf.sevenzipjbinding.IInArchive] */
    /* JADX WARN: Type inference failed for: r7v1, types: [l.ۚۛܳ] */
    @Override // l.C3695, l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public final C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        ?? M14825;
        C7364 c7364;
        ?? r7 = (C5168) abstractC16891;
        C10231 c10231 = (C10231) interfaceC17889;
        C7364 c7365 = null;
        ?? r1 = 0;
        try {
            M14825 = r7.m14825();
            try {
                C20488 c20488 = new C20488((int) c10231.m25859().m12074());
                if (M14825.extractSlow(c10231.m25859().m12080(), c20488) == ExtractOperationResult.OK) {
                    r7.m14823(M14825);
                    c7364 = new C7364(c20488.m46943());
                } else {
                    c7364 = null;
                    r1 = M14825;
                }
                C0349.m1793(r1);
                c7365 = c7364;
            } catch (Throwable unused) {
                C0349.m1793(M14825);
            }
        } catch (Throwable unused2) {
            M14825 = null;
        }
        String strM29964 = m29964(c10231.m25859());
        if (i == 1 || i == 2) {
            return C3695.m11250(strM29964, C19883.f64215, true, new C6576(c7365));
        }
        if (i == 3) {
            C19883 c19883 = C19883.f64196;
            C11813 c11813M11250 = C3695.m11250(strM29964, c19883, true, new C20378(c7365));
            if (c11813M11250 != c19883.f64250) {
                interfaceC17889.mo36975(R.id.MT_Protector, Boolean.TRUE);
            }
            return c11813M11250;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m29964(C4007 c4007) {
        int iHashCode;
        Integer numM12077 = c4007.m12077();
        if (numM12077 != null) {
            iHashCode = numM12077.intValue();
        } else {
            iHashCode = Arrays.hashCode(new long[]{c4007.m12072(), c4007.m12084(), c4007.m12082().hashCode()});
        }
        return C14460.m34530("archive:" + Long.toHexString(((long) iHashCode) & 4294967295L) + c4007.m12074()).toLowerCase();
    }
}
