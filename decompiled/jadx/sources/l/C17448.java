package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܿܺۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: B1PU */
/* JADX INFO: loaded from: classes4.dex */
public final class C17448 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m40800() {
        return C16293.m38327().m36526("protector/tasks/" + C23196.m51459().toLowerCase());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m40796(C16742 c16742) {
        return C16293.m38327().m36526("protector/export/" + C23196.m51459().toLowerCase() + "_" + c16742.f51390 + ".apk");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m40799(C16742 c16742) {
        c16742.f51390.getClass();
        return m40800().m36526(c16742.f51390);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40797(AbstractC15440 abstractC15440, C16742 c16742) {
        if (c16742.f51390.equals(abstractC15440.getName()) && c16742.f51391.equalsIgnoreCase(C23196.m51459())) {
            return c16742.f51387.equals(C20812.m47627(abstractC15440.m36526("packageLocal"), "MD5"));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m40795() {
        ArrayList arrayList = new ArrayList();
        for (AbstractC15440 abstractC15440 : m40800().mo23549(true)) {
            if (abstractC15440.mo23113()) {
                AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("info");
                AbstractC15440 abstractC15440M36527 = abstractC15440.m36526("packageLocal");
                AbstractC15440 abstractC15440M36528 = abstractC15440.m36526("packageUpload");
                if (abstractC15440M36526.mo23120() && abstractC15440M36527.mo23120() && abstractC15440M36528.mo23120()) {
                    try {
                        C16742 c16742M39383 = C16742.m39383(abstractC15440M36526.m36506());
                        if (!m40797(abstractC15440, c16742M39383)) {
                            throw new Exception();
                        }
                        if (ServiceC8982.m23217(c16742M39383.f51390)) {
                            c16742M39383.f51392 = -1;
                        } else if (ServiceC8982.f27297.contains(c16742M39383.f51390)) {
                            c16742M39383.f51392 = -2;
                        } else {
                            c16742M39383.f51392 = -3;
                        }
                        arrayList.add(c16742M39383);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static List m40798() {
        List<C16742> listM6343 = C1926.m6343();
        for (C16742 c16742 : listM6343) {
            AbstractC15440 abstractC15440M40799 = m40799(c16742);
            AbstractC15440 abstractC15440M36526 = abstractC15440M40799.m36526("info");
            AbstractC15440 abstractC15440M36527 = abstractC15440M40799.m36526("packageLocal");
            AbstractC15440 abstractC15440M36528 = abstractC15440M40799.m36526("packageUpload");
            if (!abstractC15440M36526.mo23120() || !abstractC15440M36527.mo23120()) {
                c16742.f51392 = -4;
            } else {
                if (abstractC15440M36528.mo23120()) {
                    abstractC15440M36528.mo23552();
                }
                try {
                    C16742 c16742M39383 = C16742.m39383(abstractC15440M36526.m36506());
                    if (c16742M39383.f51390.equals(c16742.f51390) && m40797(abstractC15440M40799, c16742M39383)) {
                        c16742.f51394 = c16742M39383.f51394;
                        c16742.f51387 = c16742M39383.f51387;
                        c16742.f51396 = c16742M39383.f51396;
                    } else {
                        c16742.f51392 = -4;
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(listM6343);
        return listM6343;
    }
}
