package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.۬᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final class C15099 {

    /* JADX INFO: renamed from: ᩹ */
    public static final C6468 f43092 = new C6468();

    /* JADX INFO: renamed from: ֨ */
    public final C18318 f43094;

    /* JADX INFO: renamed from: ۘ */
    public final C23663 f43097;

    /* JADX INFO: renamed from: ۚ */
    public final C15927 f43098;

    /* JADX INFO: renamed from: ۠ */
    public final C8374 f43100;

    /* JADX INFO: renamed from: ۡ */
    public final C18537 f43101;

    /* JADX INFO: renamed from: ۢ */
    public final C23623 f43102;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f43103;

    /* JADX INFO: renamed from: ܳ */
    public final C16852 f43104;

    /* JADX INFO: renamed from: ܺ */
    public final C8200 f43106;

    /* JADX INFO: renamed from: ܽ */
    public final C11216 f43107;

    /* JADX INFO: renamed from: ܿ */
    public final C6795 f43108;

    /* JADX INFO: renamed from: ᩳ */
    public int f43109;

    /* JADX INFO: renamed from: ᩴ */
    public final String f43110;

    /* JADX INFO: renamed from: ᩵ */
    public final C22004 f43111;

    /* JADX INFO: renamed from: ᩷ */
    public final C6953 f43112;

    /* JADX INFO: renamed from: ᩻ */
    public final C19694 f43114;

    /* JADX INFO: renamed from: ۖ */
    public C20271 f43096 = new C20271();

    /* JADX INFO: renamed from: ᩸ */
    public C20271 f43113 = new C20271();

    /* JADX INFO: renamed from: ۜ */
    public int f43099 = 0;

    /* JADX INFO: renamed from: ܶ */
    public C20271 f43105 = new C20271();

    /* JADX INFO: renamed from: ֫ */
    public C20271 f43095 = new C20271();

    /* JADX INFO: renamed from: ֡ */
    public InterfaceC10406 f43093 = new C3700(this);

    /* JADX INFO: renamed from: ֫ */
    public static C15099 m34493(C5127 c5127) {
        C15099 c15099 = (C15099) c5127.m10905(f43092);
        return c15099 == null ? new C15099(c5127) : c15099;
    }

    public C15099(C5127 c5127) {
        this.f43109 = 0;
        c5127.m10908(f43092, this);
        this.f43107 = C11216.m25910(c5127);
        this.f43104 = C16852.m38215(c5127);
        this.f43108 = C6795.m15513(c5127);
        this.f43114 = C19694.m44728(c5127);
        C15492.m35238(c5127);
        this.f43102 = C23623.m52439(c5127);
        this.f43112 = C6953.m15930(c5127);
        this.f43101 = C18537.m42139(c5127);
        this.f43106 = C8200.m18988(c5127);
        this.f43097 = C23663.m52629(c5127);
        C22004 c22004M49577 = C22004.m49577(c5127);
        this.f43111 = c22004M49577;
        this.f43094 = C18318.m41754(c5127);
        this.f43100 = C8374.m19396(c5127);
        this.f43098 = new C15927(c22004M49577.f69139);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f43103 = EnumC12477.f34947.m28726(enumC17840M40515);
        this.f43110 = enumC17840M40515.f53238;
        this.f43109 = 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34512() {
        this.f43109++;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m34516() {
        int i = this.f43109 - 1;
        this.f43109 = i;
        if (i == 0) {
            m34515();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m34514() {
        this.f43109--;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m34515() {
        int i;
        if (this.f43109 <= 0 && (i = this.f43099) <= 0) {
            this.f43099 = i + 1;
            while (this.f43096.m45784()) {
                try {
                    ((Runnable) this.f43096.m45782()).run();
                } catch (Throwable th) {
                    this.f43099--;
                    throw th;
                }
            }
            while (this.f43105.m45784()) {
                ((Runnable) this.f43105.m45782()).run();
            }
            while (this.f43095.m45784()) {
                ((Runnable) this.f43095.m45782()).run();
            }
            while (this.f43113.m45784()) {
                ((Runnable) this.f43113.m45782()).run();
            }
            this.f43099--;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C4848 m34491(C4848 c4848) {
        if (c4848.isEmpty()) {
            return C4848.m10283();
        }
        C20271 c20271 = new C20271();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C19049 c19049 = (C19049) it.next();
            C1446.m31699(c19049.f56842);
            c20271.m45777((C8552) c19049.f56842);
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34507(Runnable runnable) {
        this.f43096.m45777(runnable);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m34513(Runnable runnable) {
        this.f43113.m45777(runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34511(RunnableC15178 runnableC15178) {
        this.f43095.m45777(runnableC15178);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34508(final C4848 c4848, final C4036 c4036, final AbstractC7783 abstractC7783, final InterfaceC5323 interfaceC5323) {
        if (c4848.isEmpty()) {
            return;
        }
        abstractC7783.m18023();
        m34507(new Runnable() { // from class: l.᩵᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                C15099.m34501(this.f66427, abstractC7783, c4036, interfaceC5323, c4848);
            }
        });
        m34513(new RunnableC17591(this, c4036, c4848, abstractC7783, 1));
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34501(C15099 c15099, AbstractC7783 abstractC7783, C4036 c4036, InterfaceC5323 interfaceC5323, C4848 c4848) {
        InterfaceC5323 interfaceC5323M44729;
        C16852 c16852 = c15099.f43104;
        C19694 c19694 = c15099.f43114;
        C23623 c23623 = c15099.f43102;
        C1446.m31704(abstractC7783.f20405 == EnumC3600.f7351 || abstractC7783.m18007());
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
        if (interfaceC5323 != null) {
            interfaceC5323M44729 = c19694.m44730(interfaceC5323);
        } else {
            interfaceC5323M44729 = c19694.m44729();
        }
        InterfaceC5323 interfaceC5324 = interfaceC5323M44729;
        C6953 c6953M38273 = interfaceC5323 != null ? null : c16852.m38273(c15099.f43112);
        try {
            if (abstractC7783.m18014() && c4848.m10293()) {
                int i = ((C19049) c4848.f11034).f18924;
                EnumC10306 enumC10306M51425 = C23047.m51425(abstractC7783);
                C14040 c14040 = C8300.f21997;
                c23623.m9348(i, new C14040("compiler", "already.annotated", enumC10306M51425, abstractC7783));
            }
            c15099.m34496(abstractC7783, c4848, c4036, false, false);
        } finally {
            if (c6953M38273 != null) {
                c16852.m38273(c6953M38273);
            }
            c19694.m44730(interfaceC5324);
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m34498(C15099 c15099, C4036 c4036, C4848 c4848, AbstractC7783 abstractC7783) {
        C23623 c23623 = c15099.f43102;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
        try {
            c15099.f43104.m38306(abstractC7783, C9268.m21404(abstractC7783, c4036.f8850), c4848);
        } finally {
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34499(C15099 c15099, C4036 c4036, C10471 c10471, AbstractC14355 abstractC14355, C5771 c5771) {
        C23623 c23623 = c15099.f43102;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
        C19694 c19694 = c15099.f43114;
        InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c10471);
        try {
            c5771.f14175 = c15099.m34492(c5771.f20406.mo14787(), c4036, abstractC14355);
        } finally {
            c19694.m44730(interfaceC5323M44730);
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34500(C15099 c15099, C4036 c4036, AbstractC14355 abstractC14355) {
        C23623 c23623 = c15099.f43102;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
        try {
            C16852 c16852 = c15099.f43104;
            c16852.getClass();
            abstractC14355.mo3382(new C8807(c16852));
        } finally {
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x025e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0268  */
    /* JADX WARN: Code duplicated, block: B:107:0x026e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0270 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0275  */
    /* JADX WARN: Code duplicated, block: B:115:0x0299  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:120:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:131:0x0301  */
    /* JADX WARN: Code duplicated, block: B:134:0x0312  */
    /* JADX WARN: Code duplicated, block: B:136:0x0318  */
    /* JADX WARN: Code duplicated, block: B:139:0x0336  */
    /* JADX WARN: Code duplicated, block: B:142:0x033a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:92:0x020a  */
    /* JADX WARN: Code duplicated, block: B:93:0x021e  */
    /* JADX WARN: Code duplicated, block: B:95:0x022e  */
    /* JADX WARN: Code duplicated, block: B:96:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0245  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41, types: [l.ۛ֡֨] */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v47, types: [l.ۘ֡֨] */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r18v0, types: [l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r20v1, types: [l.ۤ֨֨] */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.Object, l.ۡۘ֨] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v45, types: [l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v74 */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3, types: [l.ۖܶ۠] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX INFO: renamed from: ֫ */
    private void m34496(AbstractC7783 abstractC7783, C4848 c4848, C4036 c4036, boolean z, boolean z2) throws Throwable {
        Iterator it;
        LinkedHashMap linkedHashMap;
        C15099 c15099;
        AbstractC7783 abstractC7784;
        boolean z3;
        ?? r2;
        int i;
        AbstractC7783 abstractC7785;
        C14040 c14040;
        LinkedHashMap linkedHashMap2;
        ?? M10290;
        C4848 c4849;
        boolean z4;
        C17939 c17939;
        AbstractC6462 abstractC6462;
        boolean z5;
        InterfaceC5323 interfaceC5323;
        ?? r23;
        AbstractC6462 abstractC6463;
        AbstractC21195 abstractC21195;
        C17939 c17939Mo38741;
        C4848 c48410;
        C4848 c48411;
        C24293 c24293;
        C4848 c48412;
        Object obj;
        AbstractC6462 abstractC6464;
        boolean z6;
        InterfaceC5323 interfaceC5324;
        Iterator it2;
        boolean z7;
        int i2;
        ?? r12;
        boolean z8;
        AbstractC6462 abstractC6462Mo14787;
        C7251 c7251M19418;
        ?? r6;
        AbstractC7783 abstractC7786;
        Iterator it3;
        Throwable th;
        C17939 c17939M34506;
        C15099 c150910 = this;
        AbstractC7783 abstractC7787 = abstractC7783;
        boolean z9 = z2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        HashMap map = new HashMap();
        C4848 c48413 = c4848;
        while (true) {
            boolean zIsEmpty = c48413.isEmpty();
            C23623 c23623 = c150910.f43102;
            C8200 c8200 = c150910.f43106;
            C8374 c8374 = c150910.f43100;
            if (!zIsEmpty) {
                C19049 c19049 = (C19049) c48413.f11034;
                C22004 c22004 = c150910.f43111;
                if (z) {
                    AbstractC6462 abstractC6465 = c22004.f69167;
                    C17939 c179310 = c19049.f56842;
                    if (c179310 == null || c19049.f18925 == null || !(c179310 instanceof C8552)) {
                        c17939M34506 = new C8552(c19049.f18925, c150910.m34503(c19049, abstractC6465, c4036), C11827.f33000);
                        c19049.f56842 = c17939M34506;
                    } else {
                        c17939M34506 = (C8552) c179310;
                    }
                    th = null;
                } else {
                    th = null;
                    c17939M34506 = c150910.m34506(c19049, c22004.f69167, c4036);
                }
                if (c17939M34506 == null) {
                    C1446.m31702("Failed to create annotation");
                    throw th;
                }
                AbstractC6462 abstractC6466 = c17939M34506.f29256;
                if (c19049.f18925.f16705.mo35946()) {
                    if (linkedHashMap3.containsKey(c19049.f18925.f16705)) {
                        if (!c150910.f43103) {
                            c23623.m9359(EnumC21417.SOURCE_LEVEL, c19049, EnumC12477.f34947.m28724(c150910.f43110));
                        }
                        C20271 c20271 = (C20271) linkedHashMap3.get(c19049.f18925.f16705);
                        c20271.m45777(c17939M34506);
                        linkedHashMap3.put(c19049.f18925.f16705, c20271);
                        map.put(c17939M34506, c19049);
                    } else {
                        AbstractC21195 abstractC21196 = c19049.f18925.f16705;
                        C20271 c20272 = new C20271();
                        c20272.m45777(c17939M34506);
                        linkedHashMap3.put(abstractC21196, c20272);
                        map.put(c17939M34506, c19049);
                    }
                }
                if (!abstractC6466.mo14812() && ((abstractC7787.f20405 == EnumC3600.f7340 || abstractC7787.f20407.f20405 != EnumC3600.f7343) && c8374.m19490(abstractC6466, c22004.f69130))) {
                    abstractC7787.f20409 |= 18014398509613056L;
                    if (c150910.m34502(c17939M34506.m40797(c8200.f21690))) {
                        abstractC7787.f20409 |= 36028797018963968L;
                    }
                }
                if (!abstractC6466.mo14812() && c8374.m19490(abstractC6466, c22004.f69173)) {
                    abstractC7787.f20409 |= 72057594037927936L;
                    if (c150910.m34502(c17939M34506.m40797(c8200.f21750))) {
                        abstractC7787.f20409 |= 288230376151711744L;
                    }
                }
                if (!abstractC6466.mo14812() && abstractC7787.f20405 == EnumC3600.f7354 && c8374.m19490(abstractC6466, c22004.f69132)) {
                    abstractC7787.f20409 |= 9007199254740992L;
                }
                c48413 = c48413.f11035;
            } else {
                AbstractC6462 abstractC6467 = null;
                C4848 c4848M10283 = C4848.m10283();
                Iterator it4 = linkedHashMap3.values().iterator();
                AbstractC7783 abstractC7788 = abstractC7787;
                C15099 c150911 = c150910;
                ?? r7 = c4848M10283;
                while (it4.hasNext()) {
                    C20271 c20273 = (C20271) it4.next();
                    if (c20273.size() == 1) {
                        M10290 = r7.m10290((C17939) c20273.first());
                        c15099 = c150911;
                        abstractC7784 = abstractC7787;
                        z3 = z9;
                        it = it4;
                        linkedHashMap2 = linkedHashMap3;
                    } else {
                        C1446.m31699(c4036);
                        C4848 c4848M45783 = c20273.m45783();
                        C17939 c179311 = (C17939) c4848M45783.f11034;
                        C4848 c4848M10284 = C4848.m10283();
                        C1446.m31704((c4848M45783.isEmpty() || c4848M45783.f11035.isEmpty()) ? false : true);
                        int i3 = 0;
                        C7251 c7251M19419 = abstractC6467;
                        C7251 c7251 = c7251M19419;
                        ?? r18 = r7;
                        it = it4;
                        C4848 c48414 = c4848M45783;
                        C7251 c7252 = c7251;
                        C7251 c7253 = c7252;
                        ?? r8 = c7252;
                        while (true) {
                            linkedHashMap = linkedHashMap3;
                            if (c48414.isEmpty()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            AbstractC6462 abstractC6468 = abstractC6467;
                            if (i4 <= 1) {
                                c4849 = c48414;
                                if (c4849.f11035.isEmpty()) {
                                    z4 = false;
                                }
                                C1446.m31704(z4);
                                c17939 = (C17939) c4849.f11034;
                                abstractC6462 = c17939.f29256;
                                if (c7251M19419 == null) {
                                    c7251M19419 = c8374.m19418(abstractC6462);
                                }
                                C7251 c7254 = c7251M19419;
                                if (i4 > 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                interfaceC5323 = (InterfaceC5323) map.get(c17939);
                                r23 = r8;
                                abstractC6463 = c17939.f29256;
                                abstractC21195 = abstractC6463.f16705;
                                C17939 c179312 = c179311;
                                c17939Mo38741 = abstractC21195.mo35948().mo38741();
                                if (c17939Mo38741 == null) {
                                    if (z5) {
                                        C14040 c14041 = C8300.f21997;
                                        c23623.m9352(interfaceC5323, new C14040("compiler", "duplicate.annotation.missing.container", abstractC6463));
                                    }
                                    c48412 = c4849;
                                    c48411 = c4848M45783;
                                } else {
                                    c48410 = c17939Mo38741.f53589;
                                    c48411 = c4848M45783;
                                    if (c48410.isEmpty()) {
                                        C14040 c14042 = C8300.f21997;
                                        c23623.m9352(interfaceC5323, new C14040("compiler", "invalid.repeatable.annotation", abstractC21195));
                                        c48412 = c4849;
                                    } else {
                                        c24293 = (C24293) c48410.f11034;
                                        c48412 = c4849;
                                        if (((C5771) c24293.f76952).f20408 != c8200.f21718) {
                                            C14040 c14043 = C8300.f21997;
                                            c23623.m9352(interfaceC5323, new C14040("compiler", "invalid.repeatable.annotation", abstractC21195));
                                        } else {
                                            obj = c24293.f76953;
                                            if (obj instanceof C12576) {
                                                abstractC6464 = ((C12576) obj).f35337;
                                            } else {
                                                C14040 c14044 = C8300.f21997;
                                                c23623.m9352(interfaceC5323, new C14040("compiler", "invalid.repeatable.annotation", abstractC21195));
                                            }
                                            if (abstractC6464 != null && c8374.m19490(abstractC6464, abstractC6463)) {
                                            }
                                            if (abstractC6464 == null) {
                                                r6 = r23;
                                            } else {
                                                if (c7253 != null || abstractC6464 == c7253) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                C1446.m31704(z6);
                                                interfaceC5324 = (InterfaceC5323) map.get(c17939);
                                                it2 = abstractC6464.f16705.mo17983().m22456(c8200.f21718).iterator();
                                                z7 = false;
                                                i2 = 0;
                                                r12 = abstractC6468;
                                                while (it2.hasNext()) {
                                                    abstractC7786 = (AbstractC7783) it2.next();
                                                    i2++;
                                                    if (i2 == 1) {
                                                        it3 = it2;
                                                        if (abstractC7786.f20405 == EnumC3600.f7343) {
                                                            r12 = (C5771) abstractC7786;
                                                        }
                                                        it2 = it3;
                                                        r12 = r12;
                                                    } else {
                                                        it3 = it2;
                                                    }
                                                    z7 = true;
                                                    it2 = it3;
                                                    r12 = r12;
                                                }
                                                if (z7) {
                                                    C14040 c14045 = C8300.f21997;
                                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC6464, Integer.valueOf(i2)));
                                                } else if (i2 == 0) {
                                                    C14040 c14046 = C8300.f21997;
                                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC6464));
                                                } else {
                                                    if (r12.f20405 != EnumC3600.f7343) {
                                                        C14040 c14047 = C8300.f21997;
                                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC6464));
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    abstractC6462Mo14787 = r12.f20406.mo14787();
                                                    c7251M19418 = c8374.m19418(abstractC6462);
                                                    if (c8374.m19452(abstractC6462Mo14787) || !c8374.m19490(c7251M19418, abstractC6462Mo14787)) {
                                                        C14040 c14048 = C8300.f21997;
                                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                                        z8 = true;
                                                    }
                                                    if (z8) {
                                                        r6 = r12;
                                                    }
                                                    if (r6 != 0) {
                                                        c4848M10284 = c4848M10284.m10290(c17939);
                                                    }
                                                    c7253 = abstractC6464;
                                                }
                                                r6 = abstractC6468;
                                                if (r6 != 0) {
                                                    c4848M10284 = c4848M10284.m10290(c17939);
                                                }
                                                c7253 = abstractC6464;
                                            }
                                            c7251M19419 = c7254;
                                            c48414 = c48412.f11035;
                                            c7251 = abstractC6462;
                                            abstractC6467 = abstractC6468;
                                            linkedHashMap3 = linkedHashMap;
                                            i3 = i4;
                                            c179311 = c179312;
                                            c4848M45783 = c48411;
                                            r8 = r6;
                                            c7253 = c7253;
                                        }
                                    }
                                    abstractC6464 = abstractC6468;
                                    if (abstractC6464 != null) {
                                    }
                                    if (abstractC6464 == null) {
                                        r6 = r23;
                                    } else {
                                        if (c7253 != null) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        C1446.m31704(z6);
                                        interfaceC5324 = (InterfaceC5323) map.get(c17939);
                                        it2 = abstractC6464.f16705.mo17983().m22456(c8200.f21718).iterator();
                                        z7 = false;
                                        i2 = 0;
                                        r12 = abstractC6468;
                                        while (it2.hasNext()) {
                                            abstractC7786 = (AbstractC7783) it2.next();
                                            i2++;
                                            if (i2 == 1) {
                                                it3 = it2;
                                                if (abstractC7786.f20405 == EnumC3600.f7343) {
                                                    r12 = (C5771) abstractC7786;
                                                }
                                                it2 = it3;
                                                r12 = r12;
                                            } else {
                                                it3 = it2;
                                            }
                                            z7 = true;
                                            it2 = it3;
                                            r12 = r12;
                                        }
                                        if (z7) {
                                            C14040 c14049 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC6464, Integer.valueOf(i2)));
                                        } else if (i2 == 0) {
                                            C14040 c140410 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC6464));
                                        } else {
                                            if (r12.f20405 != EnumC3600.f7343) {
                                                C14040 c140411 = C8300.f21997;
                                                c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC6464));
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            abstractC6462Mo14787 = r12.f20406.mo14787();
                                            c7251M19418 = c8374.m19418(abstractC6462);
                                            if (c8374.m19452(abstractC6462Mo14787)) {
                                                C14040 c140412 = C8300.f21997;
                                                c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                                z8 = true;
                                            } else {
                                                C14040 c140413 = C8300.f21997;
                                                c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                                z8 = true;
                                            }
                                            if (z8) {
                                                r6 = r12;
                                            }
                                            if (r6 != 0) {
                                                c4848M10284 = c4848M10284.m10290(c17939);
                                            }
                                            c7253 = abstractC6464;
                                        }
                                        r6 = abstractC6468;
                                        if (r6 != 0) {
                                            c4848M10284 = c4848M10284.m10290(c17939);
                                        }
                                        c7253 = abstractC6464;
                                    }
                                    c7251M19419 = c7254;
                                    c48414 = c48412.f11035;
                                    c7251 = abstractC6462;
                                    abstractC6467 = abstractC6468;
                                    linkedHashMap3 = linkedHashMap;
                                    i3 = i4;
                                    c179311 = c179312;
                                    c4848M45783 = c48411;
                                    r8 = r6;
                                    c7253 = c7253;
                                }
                                abstractC6464 = abstractC6468;
                                if (abstractC6464 == null) {
                                    r6 = r23;
                                } else {
                                    if (c7253 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C1446.m31704(z6);
                                    interfaceC5324 = (InterfaceC5323) map.get(c17939);
                                    it2 = abstractC6464.f16705.mo17983().m22456(c8200.f21718).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC6468;
                                    while (it2.hasNext()) {
                                        abstractC7786 = (AbstractC7783) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC7786.f20405 == EnumC3600.f7343) {
                                                r12 = (C5771) abstractC7786;
                                            }
                                            it2 = it3;
                                            r12 = r12;
                                        } else {
                                            it3 = it2;
                                        }
                                        z7 = true;
                                        it2 = it3;
                                        r12 = r12;
                                    }
                                    if (z7) {
                                        C14040 c140414 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC6464, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C14040 c140415 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC6464));
                                    } else {
                                        if (r12.f20405 != EnumC3600.f7343) {
                                            C14040 c140416 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC6464));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC6462Mo14787 = r12.f20406.mo14787();
                                        c7251M19418 = c8374.m19418(abstractC6462);
                                        if (c8374.m19452(abstractC6462Mo14787)) {
                                            C14040 c140417 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                            z8 = true;
                                        } else {
                                            C14040 c140418 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c4848M10284 = c4848M10284.m10290(c17939);
                                        }
                                        c7253 = abstractC6464;
                                    }
                                    r6 = abstractC6468;
                                    if (r6 != 0) {
                                        c4848M10284 = c4848M10284.m10290(c17939);
                                    }
                                    c7253 = abstractC6464;
                                }
                                c7251M19419 = c7254;
                                c48414 = c48412.f11035;
                                c7251 = abstractC6462;
                                abstractC6467 = abstractC6468;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c179311 = c179312;
                                c4848M45783 = c48411;
                                r8 = r6;
                                c7253 = c7253;
                            } else {
                                c4849 = c48414;
                            }
                            z4 = true;
                            C1446.m31704(z4);
                            c17939 = (C17939) c4849.f11034;
                            abstractC6462 = c17939.f29256;
                            if (c7251M19419 == null) {
                                c7251M19419 = c8374.m19418(abstractC6462);
                            }
                            C7251 c7255 = c7251M19419;
                            if (i4 > 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            interfaceC5323 = (InterfaceC5323) map.get(c17939);
                            r23 = r8;
                            abstractC6463 = c17939.f29256;
                            abstractC21195 = abstractC6463.f16705;
                            C17939 c179313 = c179311;
                            c17939Mo38741 = abstractC21195.mo35948().mo38741();
                            if (c17939Mo38741 == null) {
                                if (z5) {
                                    C14040 c140419 = C8300.f21997;
                                    c23623.m9352(interfaceC5323, new C14040("compiler", "duplicate.annotation.missing.container", abstractC6463));
                                }
                                c48412 = c4849;
                                c48411 = c4848M45783;
                            } else {
                                c48410 = c17939Mo38741.f53589;
                                c48411 = c4848M45783;
                                if (c48410.isEmpty()) {
                                    C14040 c140420 = C8300.f21997;
                                    c23623.m9352(interfaceC5323, new C14040("compiler", "invalid.repeatable.annotation", abstractC21195));
                                    c48412 = c4849;
                                } else {
                                    c24293 = (C24293) c48410.f11034;
                                    c48412 = c4849;
                                    if (((C5771) c24293.f76952).f20408 != c8200.f21718) {
                                        C14040 c140421 = C8300.f21997;
                                        c23623.m9352(interfaceC5323, new C14040("compiler", "invalid.repeatable.annotation", abstractC21195));
                                    } else {
                                        obj = c24293.f76953;
                                        if (obj instanceof C12576) {
                                            abstractC6464 = ((C12576) obj).f35337;
                                        } else {
                                            C14040 c140422 = C8300.f21997;
                                            c23623.m9352(interfaceC5323, new C14040("compiler", "invalid.repeatable.annotation", abstractC21195));
                                        }
                                        if (abstractC6464 != null) {
                                        }
                                        if (abstractC6464 == null) {
                                            r6 = r23;
                                        } else {
                                            if (c7253 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                            C1446.m31704(z6);
                                            interfaceC5324 = (InterfaceC5323) map.get(c17939);
                                            it2 = abstractC6464.f16705.mo17983().m22456(c8200.f21718).iterator();
                                            z7 = false;
                                            i2 = 0;
                                            r12 = abstractC6468;
                                            while (it2.hasNext()) {
                                                abstractC7786 = (AbstractC7783) it2.next();
                                                i2++;
                                                if (i2 == 1) {
                                                    it3 = it2;
                                                    if (abstractC7786.f20405 == EnumC3600.f7343) {
                                                        r12 = (C5771) abstractC7786;
                                                    }
                                                    it2 = it3;
                                                    r12 = r12;
                                                } else {
                                                    it3 = it2;
                                                }
                                                z7 = true;
                                                it2 = it3;
                                                r12 = r12;
                                            }
                                            if (z7) {
                                                C14040 c1404110 = C8300.f21997;
                                                c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC6464, Integer.valueOf(i2)));
                                            } else if (i2 == 0) {
                                                C14040 c1404111 = C8300.f21997;
                                                c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC6464));
                                            } else {
                                                if (r12.f20405 != EnumC3600.f7343) {
                                                    C14040 c1404112 = C8300.f21997;
                                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC6464));
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                abstractC6462Mo14787 = r12.f20406.mo14787();
                                                c7251M19418 = c8374.m19418(abstractC6462);
                                                if (c8374.m19452(abstractC6462Mo14787)) {
                                                    C14040 c1404113 = C8300.f21997;
                                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                                    z8 = true;
                                                } else {
                                                    C14040 c1404114 = C8300.f21997;
                                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                                    z8 = true;
                                                }
                                                if (z8) {
                                                    r6 = r12;
                                                }
                                                if (r6 != 0) {
                                                    c4848M10284 = c4848M10284.m10290(c17939);
                                                }
                                                c7253 = abstractC6464;
                                            }
                                            r6 = abstractC6468;
                                            if (r6 != 0) {
                                                c4848M10284 = c4848M10284.m10290(c17939);
                                            }
                                            c7253 = abstractC6464;
                                        }
                                        c7251M19419 = c7255;
                                        c48414 = c48412.f11035;
                                        c7251 = abstractC6462;
                                        abstractC6467 = abstractC6468;
                                        linkedHashMap3 = linkedHashMap;
                                        i3 = i4;
                                        c179311 = c179313;
                                        c4848M45783 = c48411;
                                        r8 = r6;
                                        c7253 = c7253;
                                    }
                                }
                                abstractC6464 = abstractC6468;
                                if (abstractC6464 != null) {
                                }
                                if (abstractC6464 == null) {
                                    r6 = r23;
                                } else {
                                    if (c7253 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C1446.m31704(z6);
                                    interfaceC5324 = (InterfaceC5323) map.get(c17939);
                                    it2 = abstractC6464.f16705.mo17983().m22456(c8200.f21718).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC6468;
                                    while (it2.hasNext()) {
                                        abstractC7786 = (AbstractC7783) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC7786.f20405 == EnumC3600.f7343) {
                                                r12 = (C5771) abstractC7786;
                                            }
                                            it2 = it3;
                                            r12 = r12;
                                        } else {
                                            it3 = it2;
                                        }
                                        z7 = true;
                                        it2 = it3;
                                        r12 = r12;
                                    }
                                    if (z7) {
                                        C14040 c1404115 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC6464, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C14040 c1404116 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC6464));
                                    } else {
                                        if (r12.f20405 != EnumC3600.f7343) {
                                            C14040 c1404117 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC6464));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC6462Mo14787 = r12.f20406.mo14787();
                                        c7251M19418 = c8374.m19418(abstractC6462);
                                        if (c8374.m19452(abstractC6462Mo14787)) {
                                            C14040 c1404118 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                            z8 = true;
                                        } else {
                                            C14040 c1404119 = C8300.f21997;
                                            c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c4848M10284 = c4848M10284.m10290(c17939);
                                        }
                                        c7253 = abstractC6464;
                                    }
                                    r6 = abstractC6468;
                                    if (r6 != 0) {
                                        c4848M10284 = c4848M10284.m10290(c17939);
                                    }
                                    c7253 = abstractC6464;
                                }
                                c7251M19419 = c7255;
                                c48414 = c48412.f11035;
                                c7251 = abstractC6462;
                                abstractC6467 = abstractC6468;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c179311 = c179313;
                                c4848M45783 = c48411;
                                r8 = r6;
                                c7253 = c7253;
                            }
                            abstractC6464 = abstractC6468;
                            if (abstractC6464 == null) {
                                r6 = r23;
                            } else {
                                if (c7253 != null) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                C1446.m31704(z6);
                                interfaceC5324 = (InterfaceC5323) map.get(c17939);
                                it2 = abstractC6464.f16705.mo17983().m22456(c8200.f21718).iterator();
                                z7 = false;
                                i2 = 0;
                                r12 = abstractC6468;
                                while (it2.hasNext()) {
                                    abstractC7786 = (AbstractC7783) it2.next();
                                    i2++;
                                    if (i2 == 1) {
                                        it3 = it2;
                                        if (abstractC7786.f20405 == EnumC3600.f7343) {
                                            r12 = (C5771) abstractC7786;
                                        }
                                        it2 = it3;
                                        r12 = r12;
                                    } else {
                                        it3 = it2;
                                    }
                                    z7 = true;
                                    it2 = it3;
                                    r12 = r12;
                                }
                                if (z7) {
                                    C14040 c14041110 = C8300.f21997;
                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.multiple.values", abstractC6464, Integer.valueOf(i2)));
                                } else if (i2 == 0) {
                                    C14040 c14041111 = C8300.f21997;
                                    c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.no.value", abstractC6464));
                                } else {
                                    if (r12.f20405 != EnumC3600.f7343) {
                                        C14040 c14041112 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.invalid.value", abstractC6464));
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    abstractC6462Mo14787 = r12.f20406.mo14787();
                                    c7251M19418 = c8374.m19418(abstractC6462);
                                    if (c8374.m19452(abstractC6462Mo14787)) {
                                        C14040 c14041113 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                        z8 = true;
                                    } else {
                                        C14040 c14041114 = C8300.f21997;
                                        c23623.m9352(interfaceC5324, new C14040("compiler", "invalid.repeatable.annotation.value.return", abstractC6464, abstractC6462Mo14787, c7251M19418));
                                        z8 = true;
                                    }
                                    if (z8) {
                                        r6 = r12;
                                    }
                                    if (r6 != 0) {
                                        c4848M10284 = c4848M10284.m10290(c17939);
                                    }
                                    c7253 = abstractC6464;
                                }
                                r6 = abstractC6468;
                                if (r6 != 0) {
                                    c4848M10284 = c4848M10284.m10290(c17939);
                                }
                                c7253 = abstractC6464;
                            }
                            c7251M19419 = c7255;
                            c48414 = c48412.f11035;
                            c7251 = abstractC6462;
                            abstractC6467 = abstractC6468;
                            linkedHashMap3 = linkedHashMap;
                            i3 = i4;
                            c179311 = c179313;
                            c4848M45783 = c48411;
                            r8 = r6;
                            c7253 = c7253;
                        }
                        ?? r20 = abstractC6467;
                        ?? r24 = r8;
                        C4848 c48415 = c4848M45783;
                        C17939 c179314 = c179311;
                        if (!c4848M10284.isEmpty() && c7253 == null) {
                            InterfaceC5323 interfaceC5325 = (InterfaceC5323) map.get(c48415.f11034);
                            C14040 c140423 = C8300.f21997;
                            c23623.m9352(interfaceC5325, new C14040("compiler", "duplicate.annotation.invalid.repeated", c7251));
                            c15099 = this;
                            abstractC7784 = abstractC7783;
                            z3 = z2;
                            r2 = r20;
                        } else if (c4848M10284.isEmpty()) {
                            c15099 = this;
                            abstractC7784 = abstractC7783;
                            z3 = z2;
                            r2 = 0;
                        } else {
                            C4848 c4848M10294 = c4848M10284.m10294();
                            InterfaceC5323 interfaceC5326 = (InterfaceC5323) map.get(c179314);
                            C15099 c150912 = this;
                            C18537 c18537 = c150912.f43101;
                            c18537.m42189(interfaceC5326);
                            C24293 c24294 = new C24293(r24, new C3858(c7251M19419, c4848M10294));
                            C16852 c16852 = c150912.f43104;
                            if (z) {
                                C8552 c8552 = new C8552(c7253, C4848.m10276of((Object) c24294), ((C8552) c48415.f11034).f53587);
                                C19049 c19049M42176 = c18537.m42176(c8552);
                                if (!c16852.m38328(c19049M42176)) {
                                    C14040 c140424 = C8300.f21997;
                                    c23623.m9352(c19049M42176, new C14040("compiler", "duplicate.annotation.invalid.repeated", c7251));
                                }
                                z3 = z2;
                                if (c16852.m38329(c19049M42176, z3)) {
                                    abstractC7785 = abstractC7783;
                                } else {
                                    if (z3) {
                                        C14040 c140425 = C8300.f21997;
                                        abstractC7785 = abstractC7783;
                                        c14040 = new C14040("compiler", "invalid.repeatable.annotation.not.applicable", c7253, abstractC7785);
                                    } else {
                                        abstractC7785 = abstractC7783;
                                        C14040 c140426 = C8300.f21997;
                                        c14040 = new C14040("compiler", "invalid.repeatable.annotation.not.applicable.in.context", c7253);
                                    }
                                    c23623.m9352(interfaceC5326, c14040);
                                }
                                c8552.m40798();
                                abstractC7784 = abstractC7785;
                                r2 = c8552;
                                c15099 = c150912;
                            } else {
                                abstractC7784 = abstractC7783;
                                z3 = z2;
                                C19049 c19049M42177 = c18537.m42177((AbstractC10564) new C17939(c7253, C4848.m10276of((Object) c24294), r20));
                                boolean z10 = (abstractC7784.f20409 & 2305843009213693952L) != 0 || (abstractC7783.m17990() != null && abstractC7783.m17990().m35942());
                                C18189 c18189M38275 = c16852.m38275(c19049M42177, abstractC7784);
                                if ((c18189M38275.isEmpty() || (c18189M38275.isPresent() && !((Set) c18189M38275.get()).isEmpty())) || (z10 && !(z10 && (abstractC7784.f20409 & 16777216) == 0))) {
                                    i = 1;
                                } else {
                                    C14040 c140427 = C8300.f21997;
                                    i = 1;
                                    c23623.m9352(c19049M42177, new C14040("compiler", "invalid.repeatable.annotation.not.applicable", c7253, abstractC7784));
                                }
                                if (!c16852.m38328(c19049M42177)) {
                                    C14040 c140428 = C8300.f21997;
                                    Object[] objArr = new Object[i];
                                    objArr[0] = c7251;
                                    c23623.m9352(c19049M42177, new C14040("compiler", "duplicate.annotation.invalid.repeated", objArr));
                                }
                                C17939 c17939M34507 = c150912.m34506(c19049M42177, c7253, c4036);
                                c17939M34507.m40798();
                                r2 = c17939M34507;
                                c15099 = c150912;
                            }
                        }
                        if (r2 != 0) {
                            linkedHashMap2 = linkedHashMap;
                            C20271 c20274 = (C20271) linkedHashMap2.get(r2.f29256.f16705);
                            if (c20274 != null) {
                                InterfaceC5323 interfaceC5327 = (InterfaceC5323) map.get(c20274.first());
                                AbstractC21195 abstractC21197 = ((C17939) c20274.first()).f29256.f16705;
                                C14040 c140429 = C8300.f21997;
                                c23623.m9352(interfaceC5327, new C14040("compiler", "invalid.repeatable.annotation.repeated.and.container.present", abstractC21197));
                            }
                        } else {
                            linkedHashMap2 = linkedHashMap;
                        }
                        if (r2 != 0) {
                            M10290 = r18.m10290(r2);
                            abstractC7788 = abstractC7784;
                        } else {
                            abstractC7788 = abstractC7784;
                            M10290 = r18;
                        }
                    }
                    abstractC7787 = abstractC7784;
                    c150911 = c15099;
                    linkedHashMap3 = linkedHashMap2;
                    it4 = it;
                    r7 = M10290;
                    abstractC6467 = null;
                    z9 = z3;
                }
                ?? r3 = r7;
                if (z) {
                    abstractC7788.m18016(r3.m10294());
                    return;
                }
                C4848 c4848M10295 = r3.m10294();
                abstractC7788.m18023();
                abstractC7788.m18005(c4848M10295);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m34502(AbstractC10564 abstractC10564) {
        if (!(abstractC10564 instanceof C19281)) {
            return false;
        }
        C19281 c19281 = (C19281) abstractC10564;
        return c19281.f29256 == this.f43111.f69151 && ((Integer) c19281.f57613).intValue() != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C17939 m34506(C19049 c19049, AbstractC6462 abstractC6462, C4036 c4036) {
        C17939 c17939 = c19049.f56842;
        if (c17939 != null && c19049.f18925 != null) {
            return c17939;
        }
        C17939 c179310 = new C17939(c19049.f18925, m34503(c19049, abstractC6462, c4036), null);
        c19049.f56842 = c179310;
        return c179310;
    }

    /* JADX INFO: renamed from: ۧ */
    private C4848 m34503(C19049 c19049, AbstractC6462 abstractC6462, C4036 c4036) {
        boolean z;
        boolean z2;
        AbstractC14355 abstractC14355;
        boolean z3;
        C4848 c4848;
        C24293 c24293;
        C19049 c190410 = c19049;
        AbstractC7257 abstractC7257 = c190410.f56840;
        AbstractC6462 abstractC6462M25963 = abstractC7257.f18925;
        if (abstractC6462M25963 == null) {
            C11216 c11216 = this.f43107;
            c11216.getClass();
            abstractC6462M25963 = c11216.m25963(abstractC7257, c4036, AbstractC6462.f16700);
        }
        AbstractC7257 abstractC7258 = c190410.f56840;
        abstractC7258.getClass();
        C16852 c16852 = this.f43104;
        AbstractC6462 abstractC6462M38267 = c16852.m38267(abstractC7258, abstractC6462M25963, abstractC6462, c16852.f49905);
        c190410.f18925 = abstractC6462M38267;
        boolean zMo14812 = abstractC6462M38267.mo14812();
        boolean zMo35946 = c190410.f18925.f16705.mo35946();
        C23623 c23623 = this.f43102;
        if (zMo35946 || zMo14812) {
            z = zMo14812;
        } else {
            AbstractC7257 abstractC7259 = c190410.f56840;
            abstractC7259.getClass();
            AbstractC6462 abstractC6463 = c190410.f18925;
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC7259, new C14040("compiler", "not.annotation.type", abstractC6463));
            z = true;
        }
        C4848 c4849 = c190410.f56843;
        if (c4849.m10289() != 1 || ((AbstractC14355) c4849.f11034).m16617(EnumC19998.f60746)) {
            z2 = false;
        } else {
            int i = ((AbstractC14355) c4849.f11034).f18924;
            C18537 c18537 = this.f43101;
            c18537.f55352 = i;
            c4849.f11034 = c18537.m42184((AbstractC14355) c18537.m42194(this.f43106.f21718), (AbstractC14355) c4849.f11034);
            z2 = true;
        }
        C20271 c20271 = new C20271();
        C4848 c48410 = c4849;
        while (c48410.m10293()) {
            AbstractC14355 abstractC14356 = (AbstractC14355) c48410.f11034;
            AbstractC6462 abstractC6464 = c190410.f18925;
            boolean zM16617 = abstractC14356.m16617(EnumC19998.f60746);
            C22004 c22004 = this.f43111;
            if (!zM16617) {
                c23623.m9352(abstractC14356, C8300.f22167);
                C13956 c13956 = c22004.f69139;
                abstractC14356.f18925 = c13956;
                m34492(c13956, c4036, abstractC14356);
            } else {
                C22403 c22403 = (C22403) abstractC14356;
                if (!c22403.f70670.m16617(EnumC19998.f60790)) {
                    c23623.m9352(abstractC14356, C8300.f22167);
                    C13956 c13957 = c22004.f69139;
                    abstractC14356.f18925 = c13957;
                    m34492(c13957, c4036, abstractC14356);
                } else {
                    C9661 c9661 = (C9661) c22403.f70670;
                    if (z2) {
                        AbstractC14355 abstractC14357 = c22403.f70671;
                        abstractC14357.getClass();
                        abstractC14355 = abstractC14357;
                    } else {
                        c9661.getClass();
                        abstractC14355 = c9661;
                    }
                    AbstractC12224 abstractC12224 = c9661.f26610;
                    C4848 c4848M10283 = C4848.m10283();
                    C23663 c23663 = this.f43097;
                    c23663.getClass();
                    z3 = z2;
                    c4848 = c48410;
                    AbstractC7783 abstractC7783M52653 = c23663.m52653(abstractC14355, c4036, abstractC6464.f16705, abstractC6464, abstractC12224, c4848M10283, (C4848) null);
                    c9661.f26611 = abstractC7783M52653;
                    c9661.f18925 = abstractC7783M52653.f20406;
                    if (abstractC7783M52653.f20407 != abstractC6464.f16705 && !z) {
                        AbstractC12224 abstractC12225 = c9661.f26610;
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(c9661, new C14040("compiler", "no.annotation.member", abstractC12225, abstractC6464));
                    }
                    AbstractC6462 abstractC6462Mo14787 = abstractC7783M52653.f20406.mo14787();
                    AbstractC10564 abstractC10564M34492 = m34492(abstractC6462Mo14787, c4036, c22403.f70671);
                    abstractC14356.f18925 = abstractC6462Mo14787;
                    c24293 = abstractC7783M52653.f20406.mo14812() ? null : new C24293((C5771) abstractC7783M52653, abstractC10564M34492);
                }
                if (c24293 == null && !((C5771) c24293.f76952).f20406.mo14812()) {
                    c20271.m45777(c24293);
                }
                c48410 = c4848.f11035;
                c190410 = c19049;
                z2 = z3;
            }
            c4848 = c48410;
            z3 = z2;
            if (c24293 == null) {
            }
            c48410 = c4848.f11035;
            c190410 = c19049;
            z2 = z3;
        }
        return c20271.m45783();
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC10564 m34492(AbstractC6462 abstractC6462, C4036 c4036, AbstractC14355 abstractC14355) {
        AbstractC21195 abstractC21195;
        AbstractC7783 abstractC7783M21438;
        EnumC3600 enumC3600;
        C22004 c22004 = this.f43111;
        C23623 c23623 = this.f43102;
        try {
            abstractC6462.f16705.mo18020();
        } catch (C21865 e) {
            abstractC14355.getClass();
            EnumC10306 enumC10306M51425 = C23047.m51425(e.f68780);
            AbstractC12224 abstractC12224Mo17995 = e.f68780.mo17995();
            C14040 c14040 = C8300.f21997;
            c23623.m9352(abstractC14355, new C14040("compiler", "cant.resolve", enumC10306M51425, abstractC12224Mo17995, null, null));
            abstractC6462 = c22004.f69139;
        }
        boolean zM14777 = abstractC6462.m14777(EnumC11353.ARRAY);
        C8374 c8374 = this.f43100;
        if (zM14777) {
            if (!abstractC14355.m16617(EnumC19998.f60741)) {
                int i = abstractC14355.f18924;
                C18537 c18537 = this.f43101;
                c18537.f55352 = i;
                abstractC14355 = c18537.m42201(null, C4848.m10283(), C4848.m10276of((Object) abstractC14355));
            }
            C19859 c19859 = (C19859) abstractC14355;
            AbstractC14355 abstractC14356 = c19859.f60358;
            if (abstractC14356 != null) {
                c23623.m9352(abstractC14356, C8300.f22038);
            }
            C20271 c20271 = new C20271();
            for (C4848 c4848 = c19859.f60359; c4848.m10293(); c4848 = c4848.f11035) {
                c20271.m45777(m34492(c8374.m19455(abstractC6462), c4036, (AbstractC14355) c4848.f11034));
            }
            c19859.f18925 = abstractC6462;
            return new C3858(abstractC6462, (AbstractC10564[]) c20271.toArray(new AbstractC10564[c20271.m45780()]));
        }
        if (abstractC14355.m16617(EnumC19998.f60741)) {
            if (!abstractC6462.mo14812()) {
                c23623.m9352(abstractC14355, C8300.f22035);
            }
            C19859 c198510 = (C19859) abstractC14355;
            AbstractC14355 abstractC14357 = c198510.f60358;
            if (abstractC14357 != null) {
                c23623.m9352(abstractC14357, C8300.f22038);
            }
            for (C4848 c4849 = c198510.f60359; c4849.m10293(); c4849 = c4849.f11035) {
                m34492(c22004.f69139, c4036, (AbstractC14355) c4849.f11034);
            }
            return new C15927(c22004.f69139);
        }
        if (abstractC6462.f16705.mo35946()) {
            if (abstractC14355.m16617(EnumC19998.f60714)) {
                return m34506((C19049) abstractC14355, abstractC6462, c4036);
            }
            c23623.m9352(abstractC14355, C8300.f22117);
            abstractC6462 = c22004.f69139;
        }
        if (abstractC14355.m16617(EnumC19998.f60714)) {
            if (!abstractC6462.mo14812()) {
                C14040 c14041 = C8300.f21997;
                c23623.m9352(abstractC14355, new C14040("compiler", "annotation.not.valid.for.type", abstractC6462));
            }
            C19049 c19049 = (C19049) abstractC14355;
            m34506(c19049, c22004.f69139, c4036);
            return new C15927(c19049.f56840.f18925);
        }
        C7724 c7724 = new C7724();
        abstractC14355.mo3382(c7724);
        if (!c7724.f36154) {
            c23623.m9352(abstractC14355, C8300.f22136);
            return new C15927(c22004.f69139);
        }
        boolean zMo14805 = abstractC6462.mo14805();
        C11216 c11216 = this.f43107;
        if (!zMo14805) {
            AbstractC6462 abstractC6463 = c22004.f69215;
            AbstractC6462 abstractC6464 = c22004.f69196;
            if (!c8374.m19490(abstractC6462, abstractC6463) || abstractC6462.m14777(EnumC11353.ERROR)) {
                if (abstractC6462.f16705 == abstractC6464.f16705) {
                    AbstractC6462 abstractC6462M25939 = c11216.m25939(abstractC14355, c4036, m34495(abstractC6462));
                    boolean zMo14812 = abstractC6462M25939.mo14812();
                    C8200 c8200 = this.f43106;
                    if (!zMo14812) {
                        if (C9268.m21428(abstractC14355) == c8200.f21752) {
                            return new C12576(((C8320) abstractC14355).f22261.f18925, c8374);
                        }
                        c23623.m9352(abstractC14355, C8300.f22094);
                        return new C15927(c22004.f69139);
                    }
                    if (C9268.m21428(abstractC14355) == c8200.f21752) {
                        C8320 c8320 = (C8320) abstractC14355;
                        if (c8320.f22261.f18925.mo14812()) {
                            C13956 c13956M19397 = C8374.m19397(c8320.f22261.f18925.f16705.mo18002(), c22004.f69198, abstractC6464);
                            C21964 c21964 = new C21964(abstractC6462);
                            c21964.f69020 = c13956M19397;
                            return c21964;
                        }
                    }
                    return new C15927(abstractC6462M25939.mo14811());
                }
                if (!abstractC6462.m14777(EnumC11353.CLASS) || (abstractC6462.f16705.mo18003() & 16384) == 0) {
                    if (!abstractC6462.mo14812()) {
                        c23623.m9352(abstractC14355, C8300.f22035);
                    }
                    return new C15927(c11216.m25938((AbstractC7257) abstractC14355, c4036, abstractC6462));
                }
                AbstractC6462 abstractC6462M259310 = c11216.m25939(abstractC14355, c4036, m34495(abstractC6462));
                AbstractC7783 abstractC7783M21439 = C9268.m21438(abstractC14355);
                if (abstractC7783M21439 != null) {
                    AbstractC7257 abstractC7257M21437 = C9268.m21437(abstractC14355);
                    if ((!abstractC7257M21437.m16617(EnumC19998.f60805) || ((abstractC7783M21438 = C9268.m21438(((C8320) abstractC7257M21437).f22261)) != null && ((enumC3600 = abstractC7783M21438.f20405) == EnumC3600.f7351 || enumC3600 == EnumC3600.f7354))) && abstractC7783M21439.f20405 == EnumC3600.f7339 && (16384 & abstractC7783M21439.mo18003()) != 0) {
                        return new C18610(abstractC6462, (C13818) abstractC7783M21439);
                    }
                }
                c23623.m9352(abstractC14355, C8300.f22124);
                return new C15927(abstractC6462M259310.mo14811());
            }
        }
        AbstractC6462 abstractC6462M259311 = c11216.m25939(abstractC14355, c4036, m34495(abstractC6462));
        if (abstractC6462M259311.mo14812()) {
            return new C15927(abstractC6462M259311.mo14811());
        }
        if (abstractC6462M259311.mo14779() == null) {
            c23623.m9352(abstractC14355, C8300.f22129);
            return new C15927(abstractC6462);
        }
        AbstractC6462 abstractC6465 = abstractC14355.f18925;
        if (abstractC6465 != null && (abstractC21195 = abstractC6465.f16705) != null) {
            m34510(abstractC14355, c4036, abstractC21195, abstractC14355);
        }
        return new C19281(this.f43108.m15516(abstractC6462M259311, abstractC6462).mo14779(), abstractC6462);
    }

    /* JADX INFO: renamed from: ֫ */
    private C24626 m34495(AbstractC6462 abstractC6462) {
        C24626 c24626 = this.f43107.f31177;
        return new C24626(c24626.f77964, c24626.f77963, abstractC6462, new C21806(c24626.f77961), c24626.f77962);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34509(C4848 c4848, C4036 c4036, AbstractC7783 abstractC7783, InterfaceC5323 interfaceC5323, boolean z) {
        if (abstractC7783 == null) {
            C1446.m31702("Symbol argument to actualEnterTypeAnnotations is nul/");
            throw null;
        }
        InterfaceC19740 interfaceC19740 = c4036.f8851.f7516;
        C23623 c23623 = this.f43102;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        C19694 c19694 = this.f43114;
        InterfaceC5323 interfaceC5323M44730 = interfaceC5323 != null ? c19694.m44730(interfaceC5323) : null;
        try {
            m34496(abstractC7783, c4848, c4036, true, z);
        } finally {
            if (interfaceC5323M44730 != null) {
                c19694.m44730(interfaceC5323M44730);
            }
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m34510(final AbstractC7257 abstractC7257, final C4036 c4036, final AbstractC7783 abstractC7783, final InterfaceC5323 interfaceC5323) {
        C1446.m31699(abstractC7783);
        m34507(new Runnable() { // from class: l.֡᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                abstractC7257.mo3382(new C5712(this.f5413, c4036, abstractC7783, interfaceC5323));
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC10406 m34505() {
        return this.f43093;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m34497(C15099 c15099, C4036 c4036) {
        C1446.m31703("Trying to annotation type complete a non-annotation type", ((C7650) c4036.f8850).f20027.mo35946());
        C23623 c23623 = c15099.f43102;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036.f8851.f7516);
        try {
            C7650 c7650 = (C7650) c4036.f8850;
            C23817 c23817 = new C23817(c15099, c15099.f43107, c15099.f43104, c15099.f43111, c15099.f43094);
            c23817.mo3617(c7650);
            c7650.f20027.mo35948().m51603(c23817.f75701);
            c7650.f20027.mo35948().m51604(c23817.f75698);
        } finally {
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C15927 m34518() {
        return this.f43098;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m34517() {
        this.f43109 = 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7053 m34504(C7053 c7053) {
        C7053 c7054 = new C7053(this.f43096, this.f43113, this.f43105, this.f43095);
        this.f43096 = c7053.f18370;
        this.f43105 = c7053.f18371;
        this.f43095 = c7053.f18369;
        this.f43113 = c7053.f18372;
        return c7054;
    }
}
