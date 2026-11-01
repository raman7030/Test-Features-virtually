package p067l;

import bin.p000mt.plus.R;
import java.util.Arrays;
import net.p069sf.sevenzipjbinding.ExtractOperationResult;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.۫ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB5W */
/* JADX INFO: loaded from: classes4.dex */
public final class C14103 extends C5880 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C14103 f39994 = new C14103();

    /* JADX INFO: renamed from: ۧ */
    public static C14103 m32026() {
        return f39994;
    }

    @Override // p067l.C5880
    /* JADX INFO: renamed from: ֫ */
    public final String mo11391(InterfaceC19370 interfaceC19370, int i) {
        return m32024(((C12092) interfaceC19370).m27881());
    }

    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public final int mo11393(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.mo39135()) {
            return m32025(((C12092) interfaceC19370).m27881());
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m32025(C6177 c6177) {
        if (!c6177.m13996() && !c6177.m13995()) {
            String strM9383 = C4463.m9383(c6177.m14005());
            long jM13994 = c6177.m13994();
            if (strM9383.equals("image/svg+xml")) {
                return jM13994 <= 819200 ? 2 : 0;
            }
            if (strM9383.equals("text/xml")) {
                return jM13994 <= 153600 ? 3 : 0;
            }
            if (strM9383.startsWith("image/") && jM13994 <= X931RNG.BLOCK128_RESEED_MAX) {
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
    @Override // p067l.C5880, p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public final C13596 mo11392(AbstractC18422 abstractC18422, InterfaceC19370 interfaceC19370, int i) {
        ?? M16733;
        C9367 c9367;
        ?? r7 = (C7280) abstractC18422;
        C12092 c12092 = (C12092) interfaceC19370;
        C9367 c9368 = null;
        ?? r1 = 0;
        try {
            M16733 = r7.m16733();
            try {
                C21841 c21841 = new C21841((int) c12092.m27881().m13994());
                if (M16733.extractSlow(c12092.m27881().m14000(), c21841) == ExtractOperationResult.OK) {
                    r7.m16731(M16733);
                    c9367 = new C9367(c21841.m49266());
                } else {
                    c9367 = null;
                    r1 = M16733;
                }
                C2700.m4192(r1);
                c9368 = c9367;
            } catch (Throwable unused) {
                C2700.m4192(M16733);
            }
        } catch (Throwable unused2) {
            M16733 = null;
        }
        String strM32024 = m32024(c12092.m27881());
        if (i == 1 || i == 2) {
            return C5880.m13196(strM32024, C21265.f66851, true, new C8618(c9368));
        }
        if (i == 3) {
            C21265 c21265 = C21265.f66832;
            C13596 c13596M13196 = C5880.m13196(strM32024, c21265, true, new C21736(c9368));
            if (c13596M13196 != c21265.f66886) {
                interfaceC19370.mo39141(R.id.MT_Protector, Boolean.TRUE);
            }
            return c13596M13196;
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m32024(C6177 c6177) {
        int iHashCode;
        Integer numM13997 = c6177.m13997();
        if (numM13997 != null) {
            iHashCode = numM13997.intValue();
        } else {
            iHashCode = Arrays.hashCode(new long[]{c6177.m13992(), c6177.m14004(), c6177.m14002().hashCode()});
        }
        return C16111.m36664("archive:" + Long.toHexString(((long) iHashCode) & 4294967295L) + c6177.m13994()).toLowerCase();
    }
}
