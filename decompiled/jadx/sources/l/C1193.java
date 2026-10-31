package l;

import com.alipay.sdk.m.u0.b;
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
public class C1193 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final HashSet f4308 = new HashSet(Arrays.asList("decode_J", "decode_I", "decode_S", "decode_B"));

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Comparator f4309 = new C19539();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12175 f4321 = new C12175();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1550 f4317 = new C1550();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C6489 f4313 = new C6489();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15660 f4322 = new C15660();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C4414 f4315 = new C4414();

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C22012 f4314 = new C22012();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22053 f4316 = new C22053();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20889 f4319 = new C20889();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2297 f4310 = new C2297();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C10018 f4318 = new C10018();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22717 f4312 = new C22717();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11429 f4311 = new C11429();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14249 f4323 = new C14249();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C5825 f4320 = new C5825();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m4023(int i) {
        int i2 = i & (-33);
        if ((i & 2) != 0) {
            return i & (-38);
        }
        return (i & 4) != 0 ? i & (-34) : i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m4033(int i) {
        int i2 = i & 7;
        if ((i2 & (i2 - 1)) != 0) {
            i ^= 7;
        }
        return i & (~((i & 256) != 0 ? 512 : 32));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m4026(String str) {
        return C11926.m29091(str).m29103();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4030(List list, AbstractC14104 abstractC14104) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2088 c2088 = (C2088) it.next();
            m4031(abstractC14104, c2088.f6964, c2088.f6965);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m4031(AbstractC14104 abstractC14104, String str, Object obj) {
        if (obj instanceof Object[]) {
            AbstractC14104 abstractC14104Mo20788 = abstractC14104.mo20788(str);
            if (abstractC14104Mo20788 != null) {
                for (Object obj2 : (Object[]) obj) {
                    m4031(abstractC14104Mo20788, (String) null, obj2);
                }
                abstractC14104Mo20788.mo20790();
                return;
            }
            return;
        }
        if (obj instanceof C11261) {
            C11261 c11261 = (C11261) obj;
            AbstractC14104 abstractC14104Mo20789 = abstractC14104.mo20789(str, c11261.f33752);
            if (abstractC14104Mo20789 != null) {
                for (C2088 c2088 : c11261.f33751) {
                    m4031(abstractC14104Mo20789, c2088.f6964, c2088.f6965);
                }
                abstractC14104Mo20789.mo20790();
                return;
            }
            return;
        }
        if (obj instanceof C13687) {
            C13687 c13687 = (C13687) obj;
            abstractC14104.mo20793(str, c13687.m32934(), c13687.m32932());
        } else {
            if (obj instanceof C22860) {
                abstractC14104.mo20792(C11926.m29091(((C22860) obj).f73758), str);
                return;
            }
            if (obj instanceof C7338) {
                System.err.println("WARN: ignored method annotation value");
            } else if (obj == null) {
                System.err.println("WARN: ignored null annotation value");
            } else {
                abstractC14104.mo20792(obj, str);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4035(l.C4205 r20, l.C16904 r21, l.InterfaceC16009 r22, java.util.HashMap r23) {
        /*
            Method dump skipped, instruction units count: 1926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C1193.m4035(l.ۘ᩸ۖ, l.ܽ᩸ۖ, l.ܺܶۖ, java.util.HashMap):void");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4034(final C4205 c4205, final InterfaceC16009 interfaceC16009, final C19277 c19277) {
        ArrayList<C16904> arrayList = c4205.f13672;
        if (arrayList != null) {
            final HashMap map = new HashMap();
            for (C16904 c16904 : arrayList) {
                C0487 c0487M4028 = m4028(map, c16904.f51963);
                c0487M4028.f2095 = (c0487M4028.f2095 & (-1537)) | c16904.f51964;
                ArrayList<C11261> arrayList2 = c16904.f51965;
                if (arrayList2 != null) {
                    for (C11261 c11261 : arrayList2) {
                        if (c11261.f33753 == EnumC16715.SYSTEM) {
                            String str = c11261.f33752;
                            str.getClass();
                            switch (str) {
                                case "Ldalvik/annotation/InnerClass;":
                                    for (C2088 c2088 : c11261.f33751) {
                                        String str2 = c2088.f6964;
                                        Object obj = c2088.f6965;
                                        if ("accessFlags".equals(str2)) {
                                            c0487M4028.f2095 |= ((Integer) obj).intValue() & (-1537);
                                        } else if ("name".equals(c2088.f6964)) {
                                            c0487M4028.f2100 = (String) obj;
                                        }
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingClass;":
                                    C0487 c0487M4029 = m4028(map, ((C22860) m4025(c11261, b.d)).f73758);
                                    c0487M4028.f2096 = c0487M4029;
                                    c0487M4029.m2149(c0487M4028);
                                    break;
                                case "Ldalvik/annotation/MemberClasses;":
                                    for (Object obj2 : (Object[]) m4025(c11261, b.d)) {
                                        C0487 c0487M40210 = m4028(map, ((C22860) obj2).f73758);
                                        c0487M4028.m2149(c0487M40210);
                                        c0487M40210.f2096 = c0487M4028;
                                    }
                                    break;
                                case "Ldalvik/annotation/EnclosingMethod;":
                                    C7338 c7338 = (C7338) m4025(c11261, b.d);
                                    C0487 c0487M40211 = m4028(map, c7338.m19702());
                                    c0487M4028.f2096 = c0487M40211;
                                    c0487M4028.f2098 = c7338;
                                    c0487M40211.m2149(c0487M4028);
                                    break;
                            }
                        }
                    }
                }
            }
            ArrayList<Future> arrayList3 = new ArrayList(arrayList.size());
            final AtomicReference atomicReference = new AtomicReference();
            for (final C16904 c16905 : arrayList) {
                arrayList3.add(C1802.f6207.submit(new Runnable() { // from class: l.ۖܶۖ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1193 c1193 = this.f8231;
                        C4205 c4206 = c4205;
                        C16904 c16906 = c16905;
                        InterfaceC16009 interfaceC160010 = interfaceC16009;
                        HashMap map2 = map;
                        C19277 c19278 = c19277;
                        if (c19278.m44462()) {
                            return;
                        }
                        AtomicReference atomicReference2 = atomicReference;
                        if (atomicReference2.get() != null) {
                            return;
                        }
                        c19278.m44460(1);
                        try {
                            c1193.m4035(c4206, c16906, interfaceC160010, map2);
                        } catch (Throwable th) {
                            atomicReference2.set(th);
                            throw th;
                        }
                    }
                }));
            }
            for (Future future : arrayList3) {
                if (c19277.m44462()) {
                    future.cancel(true);
                } else {
                    while (true) {
                        try {
                            try {
                                future.get(500L, TimeUnit.MILLISECONDS);
                                break;
                            } catch (TimeoutException unused) {
                                if (c19277.m44462()) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m4032(String str, boolean z) {
        if (str == null) {
            return false;
        }
        try {
            C6532 c6532 = new C6532(str);
            C9355 c9355 = new C9355();
            if (z) {
                c6532.m18040(c9355);
                return false;
            }
            c6532.m18039(c9355);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m4024(Object obj) {
        if (obj instanceof C22860) {
            return C11926.m29091(((C22860) obj).f73758);
        }
        if (obj instanceof C1899) {
            return m4029((C1899) obj);
        }
        return obj instanceof C11072 ? C11926.m29096(((C11072) obj).m27467()) : obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0636 m4029(C1899 c1899) {
        switch (c1899.m6250()) {
            case 0:
                return new C0636(4, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 1:
                return new C0636(2, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 2:
                return new C0636(3, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 3:
                return new C0636(1, m4026(c1899.m6248().m32933()), c1899.m6248().m32932(), c1899.m6248().m32934(), false);
            case 4:
                return new C0636(6, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 5:
                return new C0636(5, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 6:
                return new C0636(8, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 7:
                return new C0636(7, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), false);
            case 8:
                return new C0636(9, m4026(c1899.m6249().m19702()), c1899.m6249().m19700(), c1899.m6249().m19699(), true);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4038(C19728 c19728, AbstractC15452 abstractC15452, C5427 c5427) {
        C5637 c5637M47765 = new C20950().m47765((c19728.f63749 & 8) != 0, c19728.f63747, c19728.f63748);
        mo4036(c5637M47765);
        mo4037(c5637M47765, abstractC15452, c5427);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m4025(C11261 c11261, String str) {
        for (C2088 c2088 : c11261.f33751) {
            if (c2088.f6964.equals(str)) {
                return c2088.f6965;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C0487 m4028(HashMap map, String str) {
        C0487 c0487 = (C0487) map.get(str);
        if (c0487 != null) {
            return c0487;
        }
        C0487 c0488 = new C0487(str);
        map.put(str, c0488);
        return c0488;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4037(C5637 c5637, AbstractC15452 abstractC15452, C5427 c5427) {
        C8955 c8955 = new C8955();
        c8955.m23087(c5427);
        c8955.m23088(c5637);
        c8955.m23089(abstractC15452);
        c8955.m23086();
        abstractC15452.mo28294(-1, -1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo4036(C5637 c5637) {
        C21348.m48379(c5637);
        this.f4316.getClass();
        C22053.m49615(c5637);
        C15660 c15660 = this.f4322;
        c15660.m36872(c5637);
        C6489 c6489 = this.f4313;
        c6489.m17919(c5637);
        this.f4312.m50753(c5637);
        if (this.f4323.m33898(c5637)) {
            C22053.m49615(c5637);
            c15660.m36872(c5637);
            c6489.m17919(c5637);
        }
        this.f4317.getClass();
        C1550.m5309(c5637);
        this.f4319.m47720(c5637);
        this.f4310.m7562(c5637);
        this.f4320.m16331(c5637);
        this.f4311.m28242(c5637);
        C22053.m49615(c5637);
        c15660.m36872(c5637);
        c6489.m17919(c5637);
        this.f4314.getClass();
        C22012.m49532(c5637);
        this.f4318.getClass();
        C10018.m25188(c5637);
        this.f4315.getClass();
        C4414.m13138(c5637);
        this.f4321.m29652(c5637);
    }
}
