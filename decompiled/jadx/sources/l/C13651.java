package l;

import bin.mt.plus.R;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܰۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z8WX */
/* JADX INFO: loaded from: classes3.dex */
public final class C13651 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC15440 f40718 = C16293.f50110.m36526("tc");

    static {
        C4925.m14315(new RunnableC22365(1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32801() {
        AbstractC15440 abstractC15440 = f40718;
        abstractC15440.m36526(am.aC).mo23552();
        abstractC15440.m36526("o").mo23552();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static ArrayList m32804(boolean z) throws C19401 {
        AbstractC15440 abstractC15440M36526 = f40718.m36526("o");
        byte[] bArrM52614 = null;
        if (!z && abstractC15440M36526.mo23120()) {
            try {
                C12951 c12951M36528 = abstractC15440M36526.m36528();
                if (Math.abs(System.currentTimeMillis() - c12951M36528.readLong()) < 3600000) {
                    bArrM52614 = c12951M36528.m31496();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM52614 == null) {
            C23881 c23881M42496 = C18237.m42480(4209).m42496();
            if (c23881M42496.m52607()) {
                bArrM52614 = c23881M42496.m52614();
                try {
                    C10130 c10130 = new C10130();
                    c10130.m25431(System.currentTimeMillis());
                    c10130.m25434(bArrM52614);
                    abstractC15440M36526.m36496(c10130);
                } catch (Exception unused2) {
                }
            } else {
                throw new C19401(C1575.m5392(c23881M42496, R.string.MT_Protector));
            }
        }
        C12951 c12951M31485 = C12951.m31485(bArrM52614);
        ArrayList arrayList = new ArrayList();
        int i = c12951M31485.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C2364(c12951M31485));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m32800(boolean z) throws C19401 {
        AbstractC15440 abstractC15440M36526 = f40718.m36526(am.aC);
        byte[] bArrM52614 = null;
        if (!z && abstractC15440M36526.mo23120()) {
            try {
                C12951 c12951M36528 = abstractC15440M36526.m36528();
                if (Math.abs(System.currentTimeMillis() - c12951M36528.readLong()) < 3600000) {
                    bArrM52614 = c12951M36528.m31496();
                }
            } catch (Exception unused) {
            }
        }
        if (bArrM52614 == null) {
            C18237 c18237M42480 = C18237.m42480(4199);
            C23881 c23881M42496 = C23196.m51460() ? c18237M42480.m42496() : c18237M42480.m42497();
            if (c23881M42496.m52607()) {
                bArrM52614 = c23881M42496.m52614();
                try {
                    C10130 c10130 = new C10130();
                    c10130.m25431(System.currentTimeMillis());
                    c10130.m25434(bArrM52614);
                    abstractC15440M36526.m36496(c10130);
                } catch (Exception unused2) {
                }
            } else {
                throw new C19401(C1575.m5392(c23881M42496, R.string.MT_Protector));
            }
        }
        C12951 c12951M31485 = C12951.m31485(bArrM52614);
        int i = c12951M31485.readInt();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new C18592(c12951M31485));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32803(int i, String str) {
        AbstractC15440 abstractC15440M36526 = f40718.m36526("d" + i);
        if (!abstractC15440M36526.mo23120()) {
            return null;
        }
        try {
            C12951 c12951M36528 = abstractC15440M36526.m36528();
            if (c12951M36528.m31506().equals(str)) {
                return c12951M36528.m31496();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m32802(int i) throws C19401 {
        AbstractC15440 abstractC15440M36526 = f40718.m36526("d" + i);
        C18237 c18237M42480 = C18237.m42480(4200);
        c18237M42480.m42490(i);
        C23881 c23881M42496 = C23196.m51460() ? c18237M42480.m42496() : c18237M42480.m42497();
        if (c23881M42496.m52607()) {
            String[] strArr = {c23881M42496.m52602(), c23881M42496.m52602()};
            byte[] bArrM11706 = C3878.m11706(strArr[0]);
            try {
                abstractC15440M36526.mo35195();
                C10130 c10130 = new C10130();
                c10130.m25439(strArr[1]);
                c10130.m25434(bArrM11706);
                abstractC15440M36526.m36496(c10130);
            } catch (Exception unused) {
            }
            return bArrM11706;
        }
        throw new C19401(C1575.m5392(c23881M42496, R.string.MT_Protector));
    }
}
