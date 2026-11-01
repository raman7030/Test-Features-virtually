package p067l;

import com.alipay.sdk.p010m.p052u0.C0226b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֨ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes2.dex */
public class C3502 {

    /* JADX INFO: renamed from: ᩴ */
    public static final HashSet f7077 = new HashSet(Arrays.asList("decode_J", "decode_I", "decode_S", "decode_B"));

    /* JADX INFO: renamed from: ᩵ */
    public static final Comparator f7078 = new C20938();

    /* JADX INFO: renamed from: ᩳ */
    public final C13939 f7090 = new C13939();

    /* JADX INFO: renamed from: ܳ */
    public final C3841 f7086 = new C3841();

    /* JADX INFO: renamed from: ۜ */
    public final C8535 f7082 = new C8535();

    /* JADX INFO: renamed from: ᩷ */
    public final C17251 f7091 = new C17251();

    /* JADX INFO: renamed from: ۢ */
    public final C6563 f7084 = new C6563();

    /* JADX INFO: renamed from: ۡ */
    public final C23288 f7083 = new C23288();

    /* JADX INFO: renamed from: ۧ */
    public final C23327 f7085 = new C23327();

    /* JADX INFO: renamed from: ܽ */
    public final C22221 f7088 = new C22221();

    /* JADX INFO: renamed from: ֫ */
    public final C4551 f7079 = new C4551();

    /* JADX INFO: renamed from: ܺ */
    public final C11889 f7087 = new C11889();

    /* JADX INFO: renamed from: ۘ */
    public final C23958 f7081 = new C23958();

    /* JADX INFO: renamed from: ۖ */
    public final C13230 f7080 = new C13230();

    /* JADX INFO: renamed from: ᩻ */
    public final C15910 f7092 = new C15910();

    /* JADX INFO: renamed from: ܿ */
    public final C7904 f7089 = new C7904();

    /* JADX INFO: renamed from: ֫ */
    public static int m6265(int i) {
        int i2 = i & (-33);
        if ((i & 2) != 0) {
            return i & (-38);
        }
        return (i & 4) != 0 ? i & (-34) : i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m6275(int i) {
        int i2 = i & 7;
        if ((i2 & (i2 - 1)) != 0) {
            i ^= 7;
        }
        return i & (~((i & 256) != 0 ? 512 : 32));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m6268(String str) {
        return C13703.m31144(str).m31156();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6272(List list, AbstractC15773 abstractC15773) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4353 c4353 = (C4353) it.next();
            m6273(abstractC15773, c4353.f9748, c4353.f9749);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m6273(AbstractC15773 abstractC15773, String str, Object obj) {
        if (obj instanceof Object[]) {
            AbstractC15773 abstractC15773Mo22769 = abstractC15773.mo22769(str);
            if (abstractC15773Mo22769 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m6273(abstractC15773Mo22769, (String) null, obj2);
                }
                abstractC15773Mo22769.mo22771();
                return;
            }
            return;
        }
        if (obj instanceof C13071) {
            C13071 c13071 = (C13071) obj;
            AbstractC15773 abstractC15773Mo22770 = abstractC15773.mo22770(str, c13071.f36752);
            if (abstractC15773Mo22770 != null) {
                for (C4353 c4353 : c13071.f36751) {
                    m6273(abstractC15773Mo22770, c4353.f9748, c4353.f9749);
                }
                abstractC15773Mo22770.mo22771();
                return;
            }
            return;
        }
        if (obj instanceof C15376) {
            C15376 c15376 = (C15376) obj;
            abstractC15773.mo22774(str, c15376.m35049(), c15376.m35047());
        } else {
            if (obj instanceof C24094) {
                abstractC15773.mo22773(C13703.m31144(((C24094) obj).f76489), str);
                return;
            }
            if (obj instanceof C9342) {
                System.err.println("WARN: ignored method annotation value");
            } else if (obj == null) {
                System.err.println("WARN: ignored null annotation value");
            } else {
                abstractC15773.mo22773(obj, str);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:101:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:106:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:112:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:317:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x018f  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ad  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r9v46 l.￡ﾩﾵ￡ﾩﾸￛﾖ, still in use, count: 2, list:
          (r9v46 l.￡ﾩﾵ￡ﾩﾸￛﾖ) from 0x0139: IGET (r9v46 l.￡ﾩﾵ￡ﾩﾸￛﾖ) A[WRAPPED] (LINE:82) l.￡ﾩﾵ￡ﾩﾸￛﾖ.ￛﾙ l.ￛﾟￛﾠￛﾖ
          (r9v46 l.￡ﾩﾵ￡ﾩﾸￛﾖ) from 0x0149: PHI (r9 I:??) = (r9v37 l.￡ﾩﾵ￡ﾩﾸￛﾖ), (r9v46 l.￡ﾩﾵ￡ﾩﾸￛﾖ) binds: [B:73:0x0148, B:432:0x0149] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX INFO: renamed from: ֫ */
    public final void m6277(p067l.C6365 r20, p067l.C18434 r21, p067l.InterfaceC17583 r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instruction units count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p067l.C3502.m6277(l.ۘ᩸ۖ, l.ܽ᩸ۖ, l.ܺܶۖ, java.util.HashMap):void");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m6276(final C6365 c6365, final InterfaceC17583 interfaceC17583, final C20689 c20689) {
        ArrayList<C18434> arrayList = c6365.f16485;
        if (arrayList != null) {
            final HashMap map = new HashMap();
            for (C18434 c18434 : arrayList) {
                C2831 c2831M6270 = m6270(map, c18434.f55143);
                c2831M6270.f4867 = (c2831M6270.f4867 & (-1537)) | c18434.f55144;
                ArrayList<C13071> arrayList2 = c18434.f55145;
                if (arrayList2 != null) {
                    for (C13071 c13071 : arrayList2) {
                        if (c13071.f36753 == EnumC18254.SYSTEM) {
                            String str = c13071.f36752;
                            str.getClass();
                            switch (str) {
                                case "Ldalvik/annotation/InnerClass;":
                                    for (C4353 c4353 : c13071.f36751) {
                                        String str2 = c4353.f9748;
                                        Object obj = c4353.f9749;
                                        if ("accessFlags".equals(str2)) {
                                            c2831M6270.f4867 |= ((Integer) obj).intValue() & (-1537);
                                        } else if ("name".equals(c4353.f9748)) {
                                            c2831M6270.f4872 = (String) obj;
                                        }
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingClass;":
                                    C2831 c2831M6271 = m6270(map, ((C24094) m6267(c13071, C0226b.f1011d)).f76489);
                                    c2831M6270.f4868 = c2831M6271;
                                    c2831M6271.m4516(c2831M6270);
                                    break;
                                case "Ldalvik/annotation/MemberClasses;":
                                    for (Object obj2 : (Object[]) m6267(c13071, C0226b.f1011d)) {
                                        C2831 c2831M6272 = m6270(map, ((C24094) obj2).f76489);
                                        c2831M6270.m4516(c2831M6272);
                                        c2831M6272.f4868 = c2831M6270;
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingMethod;":
                                    C9342 c9342 = (C9342) m6267(c13071, C0226b.f1011d);
                                    C2831 c2831M6273 = m6270(map, c9342.m21675());
                                    c2831M6270.f4868 = c2831M6273;
                                    c2831M6270.f4870 = c9342;
                                    c2831M6273.m4516(c2831M6270);
                                    break;
                            }
                        }
                    }
                }
            }
            ArrayList<Future> arrayList3 = new ArrayList(arrayList.size());
            final AtomicReference atomicReference = new AtomicReference();
            for (final C18434 c18435 : arrayList) {
                arrayList3.add(C4081.f8986.submit(new Runnable() { // from class: l.ۖܶۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C3502 c3502 = this.f11025;
                        C6365 c6366 = c6365;
                        C18434 c18436 = c18435;
                        InterfaceC17583 interfaceC17584 = interfaceC17583;
                        HashMap map2 = map;
                        C20689 c206810 = c20689;
                        if (c206810.m46756()) {
                            return;
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        if (atomicReference2.get() != null) {
                            return;
                        }
                        c206810.m46754(1);
                        try {
                            c3502.m6277(c6366, c18436, interfaceC17584, map2);
                        } catch (Throwable th) {
                            atomicReference2.set(th);
                            throw th;
                        }
                    }
                }));
            }
            for (Future future : arrayList3) {
                if (c20689.m46756()) {
                    future.cancel(true);
                } else {
                    while (true) {
                        try {
                            try {
                                future.get(500L, TimeUnit.MILLISECONDS);
                                break;
                            } catch (TimeoutException unused) {
                                if (c20689.m46756()) {
                                    future.cancel(true);
                                    break;
                                }
                            }
                        } catch (InterruptedException unused2) {
                        } catch (ExecutionException e) {
                            Throwable cause = e.getCause();
                            if (cause instanceof RuntimeException) {
                                throw ((RuntimeException) cause);
                            }
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m6274(String str, boolean z) {
        if (str == null) {
            return false;
        }
        try {
            C8576 c8576 = new C8576(str);
            C11259 c11259 = new C11259();
            if (z) {
                c8576.m19990(c11259);
                return false;
            }
            c8576.m19989(c11259);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m6266(Object obj) {
        if (obj instanceof C24094) {
            return C13703.m31144(((C24094) obj).f76489);
        }
        if (obj instanceof C4173) {
            return m6271((C4173) obj);
        }
        return obj instanceof C12891 ? C13703.m31149(((C12891) obj).m29529()) : obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2973 m6271(C4173 c4173) {
        switch (c4173.m8452()) {
            case 0:
                return new C2973(4, m6268(c4173.m8450().m35048()), c4173.m8450().m35047(), c4173.m8450().m35049(), false);
            case 1:
                return new C2973(2, m6268(c4173.m8450().m35048()), c4173.m8450().m35047(), c4173.m8450().m35049(), false);
            case 2:
                return new C2973(3, m6268(c4173.m8450().m35048()), c4173.m8450().m35047(), c4173.m8450().m35049(), false);
            case 3:
                return new C2973(1, m6268(c4173.m8450().m35048()), c4173.m8450().m35047(), c4173.m8450().m35049(), false);
            case 4:
                return new C2973(6, m6268(c4173.m8451().m21675()), c4173.m8451().m21673(), c4173.m8451().m21672(), false);
            case 5:
                return new C2973(5, m6268(c4173.m8451().m21675()), c4173.m8451().m21673(), c4173.m8451().m21672(), false);
            case 6:
                return new C2973(8, m6268(c4173.m8451().m21675()), c4173.m8451().m21673(), c4173.m8451().m21672(), false);
            case 7:
                return new C2973(7, m6268(c4173.m8451().m21675()), c4173.m8451().m21673(), c4173.m8451().m21672(), false);
            case 8:
                return new C2973(9, m6268(c4173.m8451().m21675()), c4173.m8451().m21673(), c4173.m8451().m21672(), true);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6280(C21118 c21118, AbstractC17054 abstractC17054, C7526 c7526) {
        C7726 c7726M50095 = new C22279().m50095((c21118.f66380 & 8) != 0, c21118.f66378, c21118.f66379);
        mo6278(c7726M50095);
        mo6279(c7726M50095, abstractC17054, c7526);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m6267(C13071 c13071, String str) {
        for (C4353 c4353 : c13071.f36751) {
            if (c4353.f9748.equals(str)) {
                return c4353.f9749;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C2831 m6270(HashMap map, String str) {
        C2831 c2831 = (C2831) map.get(str);
        if (c2831 != null) {
            return c2831;
        }
        C2831 c2832 = new C2831(str);
        map.put(str, c2832);
        return c2832;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6279(C7726 c7726, AbstractC17054 abstractC17054, C7526 c7526) {
        C10879 c10879 = new C10879();
        c10879.m25061(c7526);
        c10879.m25062(c7726);
        c10879.m25063(abstractC17054);
        c10879.m25060();
        abstractC17054.mo30338(-1, -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo6278(C7726 c7726) {
        C22657.m50714(c7726);
        this.f7085.getClass();
        C23327.m51951(c7726);
        C17251 c17251 = this.f7091;
        c17251.m39038(c7726);
        C8535 c8535 = this.f7082;
        c8535.m19867(c7726);
        this.f7081.m53079(c7726);
        if (this.f7092.m36030(c7726)) {
            C23327.m51951(c7726);
            c17251.m39038(c7726);
            c8535.m19867(c7726);
        }
        this.f7086.getClass();
        C3841.m7538(c7726);
        this.f7088.m50050(c7726);
        this.f7079.m9630(c7726);
        this.f7089.m18256(c7726);
        this.f7080.m30286(c7726);
        C23327.m51951(c7726);
        c17251.m39038(c7726);
        c8535.m19867(c7726);
        this.f7083.getClass();
        C23288.m51868(c7726);
        this.f7087.getClass();
        C11889.m27205(c7726);
        this.f7084.getClass();
        C6563.m15002(c7726);
        this.f7090.m31714(c7726);
    }
}
