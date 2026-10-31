package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: renamed from: l.۬᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 440F */
/* JADX INFO: loaded from: classes3.dex */
public final class C13395 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final C4314 f40022 = new C4314();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C16782 f40024;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C22406 f40027;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C14267 f40028;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C6319 f40030;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C17013 f40031;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C22364 f40032;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f40033;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C15240 f40034;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6136 f40036;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9310 f40037;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C4658 f40038;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40039;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f40040;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C20661 f40041;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C4824 f40042;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18230 f40044;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C18837 f40026 = new C18837();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18837 f40043 = new C18837();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f40029 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C18837 f40035 = new C18837();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18837 f40025 = new C18837();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC8457 f40023 = new C1401(this);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13395 m32391(C2903 c2903) {
        C13395 c13395 = (C13395) c2903.m8838(f40022);
        return c13395 == null ? new C13395(c2903) : c13395;
    }

    public C13395(C2903 c2903) {
        this.f40039 = 0;
        c2903.m8841(f40022, this);
        this.f40037 = C9310.m23901(c2903);
        this.f40034 = C15240.m36054(c2903);
        this.f40038 = C4658.m13638(c2903);
        this.f40044 = C18230.m42469(c2903);
        C13809.m33121(c2903);
        this.f40032 = C22364.m50099(c2903);
        this.f40042 = C4824.m14050(c2903);
        this.f40031 = C17013.m39896(c2903);
        this.f40036 = C6136.m17057(c2903);
        this.f40027 = C22406.m50289(c2903);
        C20661 c20661M47250 = C20661.m47250(c2903);
        this.f40041 = c20661M47250;
        this.f40024 = C16782.m39518(c2903);
        this.f40030 = C6319.m17456(c2903);
        this.f40028 = new C14267(c20661M47250.f66457);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f40033 = EnumC10637.f31976.m26686(enumC16280M38301);
        this.f40040 = enumC16280M38301.f50071;
        this.f40039 = 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32410() {
        this.f40039++;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m32414() {
        int i = this.f40039 - 1;
        this.f40039 = i;
        if (i == 0) {
            m32413();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m32412() {
        this.f40039--;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m32413() {
        int i;
        if (this.f40039 <= 0 && (i = this.f40029) <= 0) {
            this.f40029 = i + 1;
            while (this.f40026.m43518()) {
                try {
                    ((Runnable) this.f40026.m43516()).run();
                } catch (Throwable th) {
                    this.f40029--;
                    throw th;
                }
            }
            while (this.f40035.m43518()) {
                ((Runnable) this.f40035.m43516()).run();
            }
            while (this.f40025.m43518()) {
                ((Runnable) this.f40025.m43516()).run();
            }
            while (this.f40043.m43518()) {
                ((Runnable) this.f40043.m43516()).run();
            }
            this.f40029--;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m32389(C2609 c2609) {
        if (c2609.isEmpty()) {
            return C2609.m8239();
        }
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            C17551 c17551 = (C17551) it.next();
            C12171.m29637(c17551.f53652);
            c18837.m43511((C6507) c17551.f53652);
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32405(Runnable runnable) {
        this.f40026.m43511(runnable);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m32411(Runnable runnable) {
        this.f40043.m43511(runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32409(RunnableC13479 runnableC13479) {
        this.f40025.m43511(runnableC13479);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32406(final C2609 c2609, final C1755 c1755, final AbstractC5698 abstractC5698, final InterfaceC3109 interfaceC3109) {
        if (c2609.isEmpty()) {
            return;
        }
        abstractC5698.m16104();
        m32405(new Runnable() { // from class: l.᩵᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                C13395.m32399(this.f63792, abstractC5698, c1755, interfaceC3109, c2609);
            }
        });
        m32411(new RunnableC16017(this, c1755, c2609, abstractC5698, 1));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32399(C13395 c13395, AbstractC5698 abstractC5698, C1755 c1755, InterfaceC3109 interfaceC3109, C2609 c2609) {
        InterfaceC3109 interfaceC3109M42470;
        C15240 c15240 = c13395.f40034;
        C18230 c18230 = c13395.f40044;
        C22364 c22364 = c13395.f40032;
        C12171.m29642(abstractC5698.f17559 == EnumC1296.f4579 || abstractC5698.m16088());
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
        if (interfaceC3109 != null) {
            interfaceC3109M42470 = c18230.m42471(interfaceC3109);
        } else {
            interfaceC3109M42470 = c18230.m42470();
        }
        InterfaceC3109 interfaceC31010 = interfaceC3109M42470;
        C4824 c4824M36112 = interfaceC3109 != null ? null : c15240.m36112(c13395.f40042);
        try {
            if (abstractC5698.m16095() && c2609.m8249()) {
                int i = ((C17551) c2609.f8240).f16085;
                EnumC8352 enumC8352M49076 = C21758.m49076(abstractC5698);
                C12281 c12281 = C6241.f19132;
                c22364.m7269(i, new C12281("compiler", "already.annotated", enumC8352M49076, abstractC5698));
            }
            c13395.m32394(abstractC5698, c2609, c1755, false, false);
        } finally {
            if (c4824M36112 != null) {
                c15240.m36112(c4824M36112);
            }
            c18230.m42471(interfaceC31010);
            c22364.m7284(interfaceC18278M7284);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32396(C13395 c13395, C1755 c1755, C2609 c2609, AbstractC5698 abstractC5698) {
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
        try {
            c13395.f40034.m36145(abstractC5698, C7260.m19438(abstractC5698, c1755.f6074), c2609);
        } finally {
            c22364.m7284(interfaceC18278M7284);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32397(C13395 c13395, C1755 c1755, C8526 c8526, AbstractC12612 abstractC12612, C3581 c3581) {
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
        C18230 c18230 = c13395.f40044;
        InterfaceC3109 interfaceC3109M42471 = c18230.m42471((InterfaceC3109) c8526);
        try {
            c3581.f11370 = c13395.m32390(c3581.f17560.mo12923(), c1755, abstractC12612);
        } finally {
            c18230.m42471(interfaceC3109M42471);
            c22364.m7284(interfaceC18278M7284);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32398(C13395 c13395, C1755 c1755, AbstractC12612 abstractC12612) {
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
        try {
            C15240 c15240 = c13395.f40034;
            c15240.getClass();
            abstractC12612.mo988(new C6775(c15240));
        } finally {
            c22364.m7284(interfaceC18278M7284);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m32394(AbstractC5698 abstractC5698, C2609 c2609, C1755 c1755, boolean z, boolean z2) throws Throwable {
        Iterator it;
        LinkedHashMap linkedHashMap;
        C13395 c13395;
        AbstractC5698 abstractC5699;
        boolean z3;
        ?? r2;
        int i;
        AbstractC5698 abstractC56910;
        C12281 c12281;
        LinkedHashMap linkedHashMap2;
        ?? M8246;
        C2609 c26010;
        boolean z4;
        C16384 c16384;
        AbstractC4308 abstractC4308;
        boolean z5;
        InterfaceC3109 interfaceC3109;
        ?? r23;
        AbstractC4308 abstractC4309;
        AbstractC19810 abstractC19810;
        C16384 c16384Mo36582;
        C2609 c26011;
        C2609 c26012;
        C23069 c23069;
        C2609 c26013;
        Object obj;
        AbstractC4308 abstractC43010;
        boolean z6;
        InterfaceC3109 interfaceC31010;
        Iterator it2;
        boolean z7;
        int i2;
        ?? r12;
        boolean z8;
        AbstractC4308 abstractC4308Mo12923;
        C5138 c5138M17478;
        ?? r6;
        AbstractC5698 abstractC56911;
        Iterator it3;
        Throwable th;
        C16384 c16384M32404;
        C13395 c13396 = this;
        AbstractC5698 abstractC56912 = abstractC5698;
        boolean z9 = z2;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        HashMap map = new HashMap();
        C2609 c26014 = c2609;
        while (true) {
            boolean zIsEmpty = c26014.isEmpty();
            C22364 c22364 = c13396.f40032;
            C6136 c6136 = c13396.f40036;
            C6319 c6319 = c13396.f40030;
            if (!zIsEmpty) {
                C17551 c17551 = (C17551) c26014.f8240;
                C20661 c20661 = c13396.f40041;
                if (z) {
                    AbstractC4308 abstractC43011 = c20661.f66485;
                    C16384 c16385 = c17551.f53652;
                    if (c16385 == null || c17551.f16086 == null || !(c16385 instanceof C6507)) {
                        c16384M32404 = new C6507(c17551.f16086, c13396.m32401(c17551, abstractC43011, c1755), C9953.f30043);
                        c17551.f53652 = c16384M32404;
                    } else {
                        c16384M32404 = (C6507) c16385;
                    }
                    th = null;
                } else {
                    th = null;
                    c16384M32404 = c13396.m32404(c17551, c20661.f66485, c1755);
                }
                if (c16384M32404 == null) {
                    C12171.m29640("Failed to create annotation");
                    throw th;
                }
                AbstractC4308 abstractC43012 = c16384M32404.f26338;
                if (c17551.f16086.f13890.mo33814()) {
                    if (linkedHashMap3.containsKey(c17551.f16086.f13890)) {
                        if (!c13396.f40033) {
                            c22364.m7280(EnumC20043.SOURCE_LEVEL, c17551, EnumC10637.f31976.m26684(c13396.f40040));
                        }
                        C18837 c18837 = (C18837) linkedHashMap3.get(c17551.f16086.f13890);
                        c18837.m43511(c16384M32404);
                        linkedHashMap3.put(c17551.f16086.f13890, c18837);
                        map.put(c16384M32404, c17551);
                    } else {
                        AbstractC19810 abstractC19811 = c17551.f16086.f13890;
                        C18837 c18838 = new C18837();
                        c18838.m43511(c16384M32404);
                        linkedHashMap3.put(abstractC19811, c18838);
                        map.put(c16384M32404, c17551);
                    }
                }
                if (!abstractC43012.mo12948() && ((abstractC56912.f17559 == EnumC1296.f4568 || abstractC56912.f17561.f17559 != EnumC1296.f4571) && c6319.m17550(abstractC43012, c20661.f66448))) {
                    abstractC56912.f17563 |= 18014398509613056L;
                    if (c13396.m32400(c16384M32404.m38580(c6136.f18832))) {
                        abstractC56912.f17563 |= 36028797018963968L;
                    }
                }
                if (!abstractC43012.mo12948() && c6319.m17550(abstractC43012, c20661.f66491)) {
                    abstractC56912.f17563 |= 72057594037927936L;
                    if (c13396.m32400(c16384M32404.m38580(c6136.f18892))) {
                        abstractC56912.f17563 |= 288230376151711744L;
                    }
                }
                if (!abstractC43012.mo12948() && abstractC56912.f17559 == EnumC1296.f4582 && c6319.m17550(abstractC43012, c20661.f66450)) {
                    abstractC56912.f17563 |= 9007199254740992L;
                }
                c26014 = c26014.f8241;
            } else {
                AbstractC4308 abstractC43013 = null;
                C2609 c2609M8239 = C2609.m8239();
                Iterator it4 = linkedHashMap3.values().iterator();
                AbstractC5698 abstractC56913 = abstractC56912;
                C13395 c13397 = c13396;
                ?? r7 = c2609M8239;
                while (it4.hasNext()) {
                    C18837 c18839 = (C18837) it4.next();
                    if (c18839.size() == 1) {
                        M8246 = r7.m8246((C16384) c18839.first());
                        c13395 = c13397;
                        abstractC5699 = abstractC56912;
                        z3 = z9;
                        it = it4;
                        linkedHashMap2 = linkedHashMap3;
                    } else {
                        C12171.m29637(c1755);
                        C2609 c2609M43517 = c18839.m43517();
                        C16384 c16386 = (C16384) c2609M43517.f8240;
                        C2609 c2609M82310 = C2609.m8239();
                        C12171.m29642((c2609M43517.isEmpty() || c2609M43517.f8241.isEmpty()) ? false : true);
                        int i3 = 0;
                        C5138 c5138M17479 = abstractC43013;
                        C5138 c5138 = c5138M17479;
                        ?? r18 = r7;
                        it = it4;
                        C2609 c26015 = c2609M43517;
                        C5138 c5139 = c5138;
                        C5138 c51310 = c5139;
                        ?? r8 = c5139;
                        while (true) {
                            linkedHashMap = linkedHashMap3;
                            if (c26015.isEmpty()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            AbstractC4308 abstractC43014 = abstractC43013;
                            if (i4 <= 1) {
                                c26010 = c26015;
                                if (c26010.f8241.isEmpty()) {
                                    z4 = false;
                                }
                                C12171.m29642(z4);
                                c16384 = (C16384) c26010.f8240;
                                abstractC4308 = c16384.f26338;
                                if (c5138M17479 == null) {
                                    c5138M17479 = c6319.m17478(abstractC4308);
                                }
                                C5138 c51311 = c5138M17479;
                                if (i4 > 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                interfaceC3109 = (InterfaceC3109) map.get(c16384);
                                r23 = r8;
                                abstractC4309 = c16384.f26338;
                                abstractC19810 = abstractC4309.f13890;
                                C16384 c16387 = c16386;
                                c16384Mo36582 = abstractC19810.mo33816().mo36582();
                                if (c16384Mo36582 == null) {
                                    if (z5) {
                                        C12281 c12282 = C6241.f19132;
                                        c22364.m7273(interfaceC3109, new C12281("compiler", "duplicate.annotation.missing.container", abstractC4309));
                                    }
                                    c26013 = c26010;
                                    c26012 = c2609M43517;
                                } else {
                                    c26011 = c16384Mo36582.f50417;
                                    c26012 = c2609M43517;
                                    if (c26011.isEmpty()) {
                                        C12281 c12283 = C6241.f19132;
                                        c22364.m7273(interfaceC3109, new C12281("compiler", "invalid.repeatable.annotation", abstractC19810));
                                        c26013 = c26010;
                                    } else {
                                        c23069 = (C23069) c26011.f8240;
                                        c26013 = c26010;
                                        if (((C3581) c23069.f74207).f17562 != c6136.f18860) {
                                            C12281 c12284 = C6241.f19132;
                                            c22364.m7273(interfaceC3109, new C12281("compiler", "invalid.repeatable.annotation", abstractC19810));
                                        } else {
                                            obj = c23069.f74208;
                                            if (obj instanceof C10741) {
                                                abstractC43010 = ((C10741) obj).f32362;
                                            } else {
                                                C12281 c12285 = C6241.f19132;
                                                c22364.m7273(interfaceC3109, new C12281("compiler", "invalid.repeatable.annotation", abstractC19810));
                                            }
                                            if (abstractC43010 != null && c6319.m17550(abstractC43010, abstractC4309)) {
                                            }
                                            if (abstractC43010 == null) {
                                                r6 = r23;
                                            } else {
                                                if (c51310 != null || abstractC43010 == c51310) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                C12171.m29642(z6);
                                                interfaceC31010 = (InterfaceC3109) map.get(c16384);
                                                it2 = abstractC43010.f13890.mo16064().m20476(c6136.f18860).iterator();
                                                z7 = false;
                                                i2 = 0;
                                                r12 = abstractC43014;
                                                while (it2.hasNext()) {
                                                    abstractC56911 = (AbstractC5698) it2.next();
                                                    i2++;
                                                    if (i2 == 1) {
                                                        it3 = it2;
                                                        if (abstractC56911.f17559 == EnumC1296.f4571) {
                                                            r12 = (C3581) abstractC56911;
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
                                                    C12281 c12286 = C6241.f19132;
                                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.multiple.values", abstractC43010, Integer.valueOf(i2)));
                                                } else if (i2 == 0) {
                                                    C12281 c12287 = C6241.f19132;
                                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC43010));
                                                } else {
                                                    if (r12.f17559 != EnumC1296.f4571) {
                                                        C12281 c12288 = C6241.f19132;
                                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.invalid.value", abstractC43010));
                                                        z8 = true;
                                                    } else {
                                                        z8 = false;
                                                    }
                                                    abstractC4308Mo12923 = r12.f17560.mo12923();
                                                    c5138M17478 = c6319.m17478(abstractC4308);
                                                    if (c6319.m17512(abstractC4308Mo12923) || !c6319.m17550(c5138M17478, abstractC4308Mo12923)) {
                                                        C12281 c12289 = C6241.f19132;
                                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                                        z8 = true;
                                                    }
                                                    if (z8) {
                                                        r6 = r12;
                                                    }
                                                    if (r6 != 0) {
                                                        c2609M82310 = c2609M82310.m8246(c16384);
                                                    }
                                                    c51310 = abstractC43010;
                                                }
                                                r6 = abstractC43014;
                                                if (r6 != 0) {
                                                    c2609M82310 = c2609M82310.m8246(c16384);
                                                }
                                                c51310 = abstractC43010;
                                            }
                                            c5138M17479 = c51311;
                                            c26015 = c26013.f8241;
                                            c5138 = abstractC4308;
                                            abstractC43013 = abstractC43014;
                                            linkedHashMap3 = linkedHashMap;
                                            i3 = i4;
                                            c16386 = c16387;
                                            c2609M43517 = c26012;
                                            r8 = r6;
                                            c51310 = c51310;
                                        }
                                    }
                                    abstractC43010 = abstractC43014;
                                    if (abstractC43010 != null) {
                                    }
                                    if (abstractC43010 == null) {
                                        r6 = r23;
                                    } else {
                                        if (c51310 != null) {
                                            z6 = true;
                                        } else {
                                            z6 = true;
                                        }
                                        C12171.m29642(z6);
                                        interfaceC31010 = (InterfaceC3109) map.get(c16384);
                                        it2 = abstractC43010.f13890.mo16064().m20476(c6136.f18860).iterator();
                                        z7 = false;
                                        i2 = 0;
                                        r12 = abstractC43014;
                                        while (it2.hasNext()) {
                                            abstractC56911 = (AbstractC5698) it2.next();
                                            i2++;
                                            if (i2 == 1) {
                                                it3 = it2;
                                                if (abstractC56911.f17559 == EnumC1296.f4571) {
                                                    r12 = (C3581) abstractC56911;
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
                                            C12281 c122810 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.multiple.values", abstractC43010, Integer.valueOf(i2)));
                                        } else if (i2 == 0) {
                                            C12281 c122811 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC43010));
                                        } else {
                                            if (r12.f17559 != EnumC1296.f4571) {
                                                C12281 c122812 = C6241.f19132;
                                                c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.invalid.value", abstractC43010));
                                                z8 = true;
                                            } else {
                                                z8 = false;
                                            }
                                            abstractC4308Mo12923 = r12.f17560.mo12923();
                                            c5138M17478 = c6319.m17478(abstractC4308);
                                            if (c6319.m17512(abstractC4308Mo12923)) {
                                                C12281 c122813 = C6241.f19132;
                                                c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                                z8 = true;
                                            } else {
                                                C12281 c122814 = C6241.f19132;
                                                c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                                z8 = true;
                                            }
                                            if (z8) {
                                                r6 = r12;
                                            }
                                            if (r6 != 0) {
                                                c2609M82310 = c2609M82310.m8246(c16384);
                                            }
                                            c51310 = abstractC43010;
                                        }
                                        r6 = abstractC43014;
                                        if (r6 != 0) {
                                            c2609M82310 = c2609M82310.m8246(c16384);
                                        }
                                        c51310 = abstractC43010;
                                    }
                                    c5138M17479 = c51311;
                                    c26015 = c26013.f8241;
                                    c5138 = abstractC4308;
                                    abstractC43013 = abstractC43014;
                                    linkedHashMap3 = linkedHashMap;
                                    i3 = i4;
                                    c16386 = c16387;
                                    c2609M43517 = c26012;
                                    r8 = r6;
                                    c51310 = c51310;
                                }
                                abstractC43010 = abstractC43014;
                                if (abstractC43010 == null) {
                                    r6 = r23;
                                } else {
                                    if (c51310 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C12171.m29642(z6);
                                    interfaceC31010 = (InterfaceC3109) map.get(c16384);
                                    it2 = abstractC43010.f13890.mo16064().m20476(c6136.f18860).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC43014;
                                    while (it2.hasNext()) {
                                        abstractC56911 = (AbstractC5698) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC56911.f17559 == EnumC1296.f4571) {
                                                r12 = (C3581) abstractC56911;
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
                                        C12281 c122815 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.multiple.values", abstractC43010, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C12281 c122816 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC43010));
                                    } else {
                                        if (r12.f17559 != EnumC1296.f4571) {
                                            C12281 c122817 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.invalid.value", abstractC43010));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC4308Mo12923 = r12.f17560.mo12923();
                                        c5138M17478 = c6319.m17478(abstractC4308);
                                        if (c6319.m17512(abstractC4308Mo12923)) {
                                            C12281 c122818 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                            z8 = true;
                                        } else {
                                            C12281 c122819 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c2609M82310 = c2609M82310.m8246(c16384);
                                        }
                                        c51310 = abstractC43010;
                                    }
                                    r6 = abstractC43014;
                                    if (r6 != 0) {
                                        c2609M82310 = c2609M82310.m8246(c16384);
                                    }
                                    c51310 = abstractC43010;
                                }
                                c5138M17479 = c51311;
                                c26015 = c26013.f8241;
                                c5138 = abstractC4308;
                                abstractC43013 = abstractC43014;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c16386 = c16387;
                                c2609M43517 = c26012;
                                r8 = r6;
                                c51310 = c51310;
                            } else {
                                c26010 = c26015;
                            }
                            z4 = true;
                            C12171.m29642(z4);
                            c16384 = (C16384) c26010.f8240;
                            abstractC4308 = c16384.f26338;
                            if (c5138M17479 == null) {
                                c5138M17479 = c6319.m17478(abstractC4308);
                            }
                            C5138 c51312 = c5138M17479;
                            if (i4 > 1) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            interfaceC3109 = (InterfaceC3109) map.get(c16384);
                            r23 = r8;
                            abstractC4309 = c16384.f26338;
                            abstractC19810 = abstractC4309.f13890;
                            C16384 c16388 = c16386;
                            c16384Mo36582 = abstractC19810.mo33816().mo36582();
                            if (c16384Mo36582 == null) {
                                if (z5) {
                                    C12281 c122820 = C6241.f19132;
                                    c22364.m7273(interfaceC3109, new C12281("compiler", "duplicate.annotation.missing.container", abstractC4309));
                                }
                                c26013 = c26010;
                                c26012 = c2609M43517;
                            } else {
                                c26011 = c16384Mo36582.f50417;
                                c26012 = c2609M43517;
                                if (c26011.isEmpty()) {
                                    C12281 c122821 = C6241.f19132;
                                    c22364.m7273(interfaceC3109, new C12281("compiler", "invalid.repeatable.annotation", abstractC19810));
                                    c26013 = c26010;
                                } else {
                                    c23069 = (C23069) c26011.f8240;
                                    c26013 = c26010;
                                    if (((C3581) c23069.f74207).f17562 != c6136.f18860) {
                                        C12281 c122822 = C6241.f19132;
                                        c22364.m7273(interfaceC3109, new C12281("compiler", "invalid.repeatable.annotation", abstractC19810));
                                    } else {
                                        obj = c23069.f74208;
                                        if (obj instanceof C10741) {
                                            abstractC43010 = ((C10741) obj).f32362;
                                        } else {
                                            C12281 c122823 = C6241.f19132;
                                            c22364.m7273(interfaceC3109, new C12281("compiler", "invalid.repeatable.annotation", abstractC19810));
                                        }
                                        if (abstractC43010 != null) {
                                        }
                                        if (abstractC43010 == null) {
                                            r6 = r23;
                                        } else {
                                            if (c51310 != null) {
                                                z6 = true;
                                            } else {
                                                z6 = true;
                                            }
                                            C12171.m29642(z6);
                                            interfaceC31010 = (InterfaceC3109) map.get(c16384);
                                            it2 = abstractC43010.f13890.mo16064().m20476(c6136.f18860).iterator();
                                            z7 = false;
                                            i2 = 0;
                                            r12 = abstractC43014;
                                            while (it2.hasNext()) {
                                                abstractC56911 = (AbstractC5698) it2.next();
                                                i2++;
                                                if (i2 == 1) {
                                                    it3 = it2;
                                                    if (abstractC56911.f17559 == EnumC1296.f4571) {
                                                        r12 = (C3581) abstractC56911;
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
                                                C12281 c1228110 = C6241.f19132;
                                                c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.multiple.values", abstractC43010, Integer.valueOf(i2)));
                                            } else if (i2 == 0) {
                                                C12281 c1228111 = C6241.f19132;
                                                c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC43010));
                                            } else {
                                                if (r12.f17559 != EnumC1296.f4571) {
                                                    C12281 c1228112 = C6241.f19132;
                                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.invalid.value", abstractC43010));
                                                    z8 = true;
                                                } else {
                                                    z8 = false;
                                                }
                                                abstractC4308Mo12923 = r12.f17560.mo12923();
                                                c5138M17478 = c6319.m17478(abstractC4308);
                                                if (c6319.m17512(abstractC4308Mo12923)) {
                                                    C12281 c1228113 = C6241.f19132;
                                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                                    z8 = true;
                                                } else {
                                                    C12281 c1228114 = C6241.f19132;
                                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                                    z8 = true;
                                                }
                                                if (z8) {
                                                    r6 = r12;
                                                }
                                                if (r6 != 0) {
                                                    c2609M82310 = c2609M82310.m8246(c16384);
                                                }
                                                c51310 = abstractC43010;
                                            }
                                            r6 = abstractC43014;
                                            if (r6 != 0) {
                                                c2609M82310 = c2609M82310.m8246(c16384);
                                            }
                                            c51310 = abstractC43010;
                                        }
                                        c5138M17479 = c51312;
                                        c26015 = c26013.f8241;
                                        c5138 = abstractC4308;
                                        abstractC43013 = abstractC43014;
                                        linkedHashMap3 = linkedHashMap;
                                        i3 = i4;
                                        c16386 = c16388;
                                        c2609M43517 = c26012;
                                        r8 = r6;
                                        c51310 = c51310;
                                    }
                                }
                                abstractC43010 = abstractC43014;
                                if (abstractC43010 != null) {
                                }
                                if (abstractC43010 == null) {
                                    r6 = r23;
                                } else {
                                    if (c51310 != null) {
                                        z6 = true;
                                    } else {
                                        z6 = true;
                                    }
                                    C12171.m29642(z6);
                                    interfaceC31010 = (InterfaceC3109) map.get(c16384);
                                    it2 = abstractC43010.f13890.mo16064().m20476(c6136.f18860).iterator();
                                    z7 = false;
                                    i2 = 0;
                                    r12 = abstractC43014;
                                    while (it2.hasNext()) {
                                        abstractC56911 = (AbstractC5698) it2.next();
                                        i2++;
                                        if (i2 == 1) {
                                            it3 = it2;
                                            if (abstractC56911.f17559 == EnumC1296.f4571) {
                                                r12 = (C3581) abstractC56911;
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
                                        C12281 c1228115 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.multiple.values", abstractC43010, Integer.valueOf(i2)));
                                    } else if (i2 == 0) {
                                        C12281 c1228116 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC43010));
                                    } else {
                                        if (r12.f17559 != EnumC1296.f4571) {
                                            C12281 c1228117 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.invalid.value", abstractC43010));
                                            z8 = true;
                                        } else {
                                            z8 = false;
                                        }
                                        abstractC4308Mo12923 = r12.f17560.mo12923();
                                        c5138M17478 = c6319.m17478(abstractC4308);
                                        if (c6319.m17512(abstractC4308Mo12923)) {
                                            C12281 c1228118 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                            z8 = true;
                                        } else {
                                            C12281 c1228119 = C6241.f19132;
                                            c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                            z8 = true;
                                        }
                                        if (z8) {
                                            r6 = r12;
                                        }
                                        if (r6 != 0) {
                                            c2609M82310 = c2609M82310.m8246(c16384);
                                        }
                                        c51310 = abstractC43010;
                                    }
                                    r6 = abstractC43014;
                                    if (r6 != 0) {
                                        c2609M82310 = c2609M82310.m8246(c16384);
                                    }
                                    c51310 = abstractC43010;
                                }
                                c5138M17479 = c51312;
                                c26015 = c26013.f8241;
                                c5138 = abstractC4308;
                                abstractC43013 = abstractC43014;
                                linkedHashMap3 = linkedHashMap;
                                i3 = i4;
                                c16386 = c16388;
                                c2609M43517 = c26012;
                                r8 = r6;
                                c51310 = c51310;
                            }
                            abstractC43010 = abstractC43014;
                            if (abstractC43010 == null) {
                                r6 = r23;
                            } else {
                                if (c51310 != null) {
                                    z6 = true;
                                } else {
                                    z6 = true;
                                }
                                C12171.m29642(z6);
                                interfaceC31010 = (InterfaceC3109) map.get(c16384);
                                it2 = abstractC43010.f13890.mo16064().m20476(c6136.f18860).iterator();
                                z7 = false;
                                i2 = 0;
                                r12 = abstractC43014;
                                while (it2.hasNext()) {
                                    abstractC56911 = (AbstractC5698) it2.next();
                                    i2++;
                                    if (i2 == 1) {
                                        it3 = it2;
                                        if (abstractC56911.f17559 == EnumC1296.f4571) {
                                            r12 = (C3581) abstractC56911;
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
                                    C12281 c12281110 = C6241.f19132;
                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.multiple.values", abstractC43010, Integer.valueOf(i2)));
                                } else if (i2 == 0) {
                                    C12281 c12281111 = C6241.f19132;
                                    c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.no.value", abstractC43010));
                                } else {
                                    if (r12.f17559 != EnumC1296.f4571) {
                                        C12281 c12281112 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.invalid.value", abstractC43010));
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    abstractC4308Mo12923 = r12.f17560.mo12923();
                                    c5138M17478 = c6319.m17478(abstractC4308);
                                    if (c6319.m17512(abstractC4308Mo12923)) {
                                        C12281 c12281113 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                        z8 = true;
                                    } else {
                                        C12281 c12281114 = C6241.f19132;
                                        c22364.m7273(interfaceC31010, new C12281("compiler", "invalid.repeatable.annotation.value.return", abstractC43010, abstractC4308Mo12923, c5138M17478));
                                        z8 = true;
                                    }
                                    if (z8) {
                                        r6 = r12;
                                    }
                                    if (r6 != 0) {
                                        c2609M82310 = c2609M82310.m8246(c16384);
                                    }
                                    c51310 = abstractC43010;
                                }
                                r6 = abstractC43014;
                                if (r6 != 0) {
                                    c2609M82310 = c2609M82310.m8246(c16384);
                                }
                                c51310 = abstractC43010;
                            }
                            c5138M17479 = c51312;
                            c26015 = c26013.f8241;
                            c5138 = abstractC4308;
                            abstractC43013 = abstractC43014;
                            linkedHashMap3 = linkedHashMap;
                            i3 = i4;
                            c16386 = c16388;
                            c2609M43517 = c26012;
                            r8 = r6;
                            c51310 = c51310;
                        }
                        ?? r20 = abstractC43013;
                        ?? r24 = r8;
                        C2609 c26016 = c2609M43517;
                        C16384 c16389 = c16386;
                        if (!c2609M82310.isEmpty() && c51310 == null) {
                            InterfaceC3109 interfaceC31011 = (InterfaceC3109) map.get(c26016.f8240);
                            C12281 c122824 = C6241.f19132;
                            c22364.m7273(interfaceC31011, new C12281("compiler", "duplicate.annotation.invalid.repeated", c5138));
                            c13395 = this;
                            abstractC5699 = abstractC5698;
                            z3 = z2;
                            r2 = r20;
                        } else if (c2609M82310.isEmpty()) {
                            c13395 = this;
                            abstractC5699 = abstractC5698;
                            z3 = z2;
                            r2 = 0;
                        } else {
                            C2609 c2609M8250 = c2609M82310.m8250();
                            InterfaceC3109 interfaceC31012 = (InterfaceC3109) map.get(c16389);
                            C13395 c13398 = this;
                            C17013 c17013 = c13398.f40031;
                            c17013.m39946(interfaceC31012);
                            C23069 c230610 = new C23069(r24, new C1568(c5138M17479, c2609M8250));
                            C15240 c15240 = c13398.f40034;
                            if (z) {
                                C6507 c6507 = new C6507(c51310, C2609.of((Object) c230610), ((C6507) c26016.f8240).f50415);
                                C17551 c17551M39933 = c17013.m39933(c6507);
                                if (!c15240.m36167(c17551M39933)) {
                                    C12281 c122825 = C6241.f19132;
                                    c22364.m7273(c17551M39933, new C12281("compiler", "duplicate.annotation.invalid.repeated", c5138));
                                }
                                z3 = z2;
                                if (c15240.m36168(c17551M39933, z3)) {
                                    abstractC56910 = abstractC5698;
                                } else {
                                    if (z3) {
                                        C12281 c122826 = C6241.f19132;
                                        abstractC56910 = abstractC5698;
                                        c12281 = new C12281("compiler", "invalid.repeatable.annotation.not.applicable", c51310, abstractC56910);
                                    } else {
                                        abstractC56910 = abstractC5698;
                                        C12281 c122827 = C6241.f19132;
                                        c12281 = new C12281("compiler", "invalid.repeatable.annotation.not.applicable.in.context", c51310);
                                    }
                                    c22364.m7273(interfaceC31012, c12281);
                                }
                                c6507.m38581();
                                abstractC5699 = abstractC56910;
                                r2 = c6507;
                                c13395 = c13398;
                            } else {
                                abstractC5699 = abstractC5698;
                                z3 = z2;
                                C17551 c17551M39934 = c17013.m39934((AbstractC8624) new C16384(c51310, C2609.of((Object) c230610), r20));
                                boolean z10 = (abstractC5699.f17563 & 2305843009213693952L) != 0 || (abstractC5698.m16071() != null && abstractC5698.m16071().m33810());
                                C16646 c16646M36114 = c15240.m36114(c17551M39934, abstractC5699);
                                if ((c16646M36114.isEmpty() || (c16646M36114.isPresent() && !((Set) c16646M36114.get()).isEmpty())) || (z10 && !(z10 && (abstractC5699.f17563 & 16777216) == 0))) {
                                    i = 1;
                                } else {
                                    C12281 c122828 = C6241.f19132;
                                    i = 1;
                                    c22364.m7273(c17551M39934, new C12281("compiler", "invalid.repeatable.annotation.not.applicable", c51310, abstractC5699));
                                }
                                if (!c15240.m36167(c17551M39934)) {
                                    C12281 c122829 = C6241.f19132;
                                    Object[] objArr = new Object[i];
                                    objArr[0] = c5138;
                                    c22364.m7273(c17551M39934, new C12281("compiler", "duplicate.annotation.invalid.repeated", objArr));
                                }
                                C16384 c16384M32405 = c13398.m32404(c17551M39934, c51310, c1755);
                                c16384M32405.m38581();
                                r2 = c16384M32405;
                                c13395 = c13398;
                            }
                        }
                        if (r2 != 0) {
                            linkedHashMap2 = linkedHashMap;
                            C18837 c188310 = (C18837) linkedHashMap2.get(r2.f26338.f13890);
                            if (c188310 != null) {
                                InterfaceC3109 interfaceC31013 = (InterfaceC3109) map.get(c188310.first());
                                AbstractC19810 abstractC19812 = ((C16384) c188310.first()).f26338.f13890;
                                C12281 c122830 = C6241.f19132;
                                c22364.m7273(interfaceC31013, new C12281("compiler", "invalid.repeatable.annotation.repeated.and.container.present", abstractC19812));
                            }
                        } else {
                            linkedHashMap2 = linkedHashMap;
                        }
                        if (r2 != 0) {
                            M8246 = r18.m8246(r2);
                            abstractC56913 = abstractC5699;
                        } else {
                            abstractC56913 = abstractC5699;
                            M8246 = r18;
                        }
                    }
                    abstractC56912 = abstractC5699;
                    c13397 = c13395;
                    linkedHashMap3 = linkedHashMap2;
                    it4 = it;
                    r7 = M8246;
                    abstractC43013 = null;
                    z9 = z3;
                }
                ?? r3 = r7;
                if (z) {
                    abstractC56913.m16097(r3.m8250());
                    return;
                }
                C2609 c2609M8251 = r3.m8250();
                abstractC56913.m16104();
                abstractC56913.m16086(c2609M8251);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m32400(AbstractC8624 abstractC8624) {
        if (!(abstractC8624 instanceof C17796)) {
            return false;
        }
        C17796 c17796 = (C17796) abstractC8624;
        return c17796.f26338 == this.f40041.f66469 && ((Integer) c17796.f54417).intValue() != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16384 m32404(C17551 c17551, AbstractC4308 abstractC4308, C1755 c1755) {
        C16384 c16384 = c17551.f53652;
        if (c16384 != null && c17551.f16086 != null) {
            return c16384;
        }
        C16384 c16385 = new C16384(c17551.f16086, m32401(c17551, abstractC4308, c1755), null);
        c17551.f53652 = c16385;
        return c16385;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C2609 m32401(C17551 c17551, AbstractC4308 abstractC4308, C1755 c1755) {
        boolean z;
        boolean z2;
        AbstractC12612 abstractC12612;
        boolean z3;
        C2609 c2609;
        C23069 c23069;
        C17551 c17552 = c17551;
        AbstractC5144 abstractC5144 = c17552.f53650;
        AbstractC4308 abstractC4308M23954 = abstractC5144.f16086;
        if (abstractC4308M23954 == null) {
            C9310 c9310 = this.f40037;
            c9310.getClass();
            abstractC4308M23954 = c9310.m23954(abstractC5144, c1755, AbstractC4308.f13885);
        }
        AbstractC5144 abstractC5145 = c17552.f53650;
        abstractC5145.getClass();
        C15240 c15240 = this.f40034;
        AbstractC4308 abstractC4308M36106 = c15240.m36106(abstractC5145, abstractC4308M23954, abstractC4308, c15240.f46781);
        c17552.f16086 = abstractC4308M36106;
        boolean zMo12948 = abstractC4308M36106.mo12948();
        boolean zMo33814 = c17552.f16086.f13890.mo33814();
        C22364 c22364 = this.f40032;
        if (zMo33814 || zMo12948) {
            z = zMo12948;
        } else {
            AbstractC5144 abstractC5146 = c17552.f53650;
            abstractC5146.getClass();
            AbstractC4308 abstractC4309 = c17552.f16086;
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC5146, new C12281("compiler", "not.annotation.type", abstractC4309));
            z = true;
        }
        C2609 c26010 = c17552.f53653;
        if (c26010.m8245() != 1 || ((AbstractC12612) c26010.f8240).m14709(EnumC18550.f57522)) {
            z2 = false;
        } else {
            int i = ((AbstractC12612) c26010.f8240).f16085;
            C17013 c17013 = this.f40031;
            c17013.f52172 = i;
            c26010.f8240 = c17013.m39941((AbstractC12612) c17013.m39951(this.f40036.f18860), (AbstractC12612) c26010.f8240);
            z2 = true;
        }
        C18837 c18837 = new C18837();
        C2609 c26011 = c26010;
        while (c26011.m8249()) {
            AbstractC12612 abstractC12613 = (AbstractC12612) c26011.f8240;
            AbstractC4308 abstractC43010 = c17552.f16086;
            boolean zM14709 = abstractC12613.m14709(EnumC18550.f57522);
            C20661 c20661 = this.f40041;
            if (!zM14709) {
                c22364.m7273(abstractC12613, C6241.f19302);
                C12193 c12193 = c20661.f66457;
                abstractC12613.f16086 = c12193;
                m32390(c12193, c1755, abstractC12613);
            } else {
                C21080 c21080 = (C21080) abstractC12613;
                if (!c21080.f67987.m14709(EnumC18550.f57566)) {
                    c22364.m7273(abstractC12613, C6241.f19302);
                    C12193 c12194 = c20661.f66457;
                    abstractC12613.f16086 = c12194;
                    m32390(c12194, c1755, abstractC12613);
                } else {
                    C7673 c7673 = (C7673) c21080.f67987;
                    if (z2) {
                        AbstractC12612 abstractC12614 = c21080.f67988;
                        abstractC12614.getClass();
                        abstractC12612 = abstractC12614;
                    } else {
                        c7673.getClass();
                        abstractC12612 = c7673;
                    }
                    AbstractC10370 abstractC10370 = c7673.f23696;
                    C2609 c2609M8239 = C2609.m8239();
                    C22406 c22406 = this.f40027;
                    c22406.getClass();
                    z3 = z2;
                    c2609 = c26011;
                    AbstractC5698 abstractC5698M50313 = c22406.m50313(abstractC12612, c1755, abstractC43010.f13890, abstractC43010, abstractC10370, c2609M8239, (C2609) null);
                    c7673.f23697 = abstractC5698M50313;
                    c7673.f16086 = abstractC5698M50313.f17560;
                    if (abstractC5698M50313.f17561 != abstractC43010.f13890 && !z) {
                        AbstractC10370 abstractC10371 = c7673.f23696;
                        C12281 c12282 = C6241.f19132;
                        c22364.m7273(c7673, new C12281("compiler", "no.annotation.member", abstractC10371, abstractC43010));
                    }
                    AbstractC4308 abstractC4308Mo12923 = abstractC5698M50313.f17560.mo12923();
                    AbstractC8624 abstractC8624M32390 = m32390(abstractC4308Mo12923, c1755, c21080.f67988);
                    abstractC12613.f16086 = abstractC4308Mo12923;
                    c23069 = abstractC5698M50313.f17560.mo12948() ? null : new C23069((C3581) abstractC5698M50313, abstractC8624M32390);
                }
                if (c23069 == null && !((C3581) c23069.f74207).f17560.mo12948()) {
                    c18837.m43511(c23069);
                }
                c26011 = c2609.f8241;
                c17552 = c17551;
                z2 = z3;
            }
            c2609 = c26011;
            z3 = z2;
            if (c23069 == null) {
            }
            c26011 = c2609.f8241;
            c17552 = c17551;
            z2 = z3;
        }
        return c18837.m43517();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC8624 m32390(AbstractC4308 abstractC4308, C1755 c1755, AbstractC12612 abstractC12612) {
        AbstractC19810 abstractC19810;
        AbstractC5698 abstractC5698M19472;
        EnumC1296 enumC1296;
        C20661 c20661 = this.f40041;
        C22364 c22364 = this.f40032;
        try {
            abstractC4308.f13890.mo16101();
        } catch (C20515 e) {
            abstractC12612.getClass();
            EnumC8352 enumC8352M49076 = C21758.m49076(e.f66102);
            AbstractC10370 abstractC10370Mo16076 = e.f66102.mo16076();
            C12281 c12281 = C6241.f19132;
            c22364.m7273(abstractC12612, new C12281("compiler", "cant.resolve", enumC8352M49076, abstractC10370Mo16076, null, null));
            abstractC4308 = c20661.f66457;
        }
        boolean zM12913 = abstractC4308.m12913(EnumC9454.ARRAY);
        C6319 c6319 = this.f40030;
        if (zM12913) {
            if (!abstractC12612.m14709(EnumC18550.f57517)) {
                int i = abstractC12612.f16085;
                C17013 c17013 = this.f40031;
                c17013.f52172 = i;
                abstractC12612 = c17013.m39958(null, C2609.m8239(), C2609.of((Object) abstractC12612));
            }
            C18404 c18404 = (C18404) abstractC12612;
            AbstractC12612 abstractC12613 = c18404.f57138;
            if (abstractC12613 != null) {
                c22364.m7273(abstractC12613, C6241.f19173);
            }
            C18837 c18837 = new C18837();
            for (C2609 c2609 = c18404.f57139; c2609.m8249(); c2609 = c2609.f8241) {
                c18837.m43511(m32390(c6319.m17515(abstractC4308), c1755, (AbstractC12612) c2609.f8240));
            }
            c18404.f16086 = abstractC4308;
            return new C1568(abstractC4308, (AbstractC8624[]) c18837.toArray(new AbstractC8624[c18837.m43514()]));
        }
        if (abstractC12612.m14709(EnumC18550.f57517)) {
            if (!abstractC4308.mo12948()) {
                c22364.m7273(abstractC12612, C6241.f19170);
            }
            C18404 c18405 = (C18404) abstractC12612;
            AbstractC12612 abstractC12614 = c18405.f57138;
            if (abstractC12614 != null) {
                c22364.m7273(abstractC12614, C6241.f19173);
            }
            for (C2609 c26010 = c18405.f57139; c26010.m8249(); c26010 = c26010.f8241) {
                m32390(c20661.f66457, c1755, (AbstractC12612) c26010.f8240);
            }
            return new C14267(c20661.f66457);
        }
        if (abstractC4308.f13890.mo33814()) {
            if (abstractC12612.m14709(EnumC18550.f57490)) {
                return m32404((C17551) abstractC12612, abstractC4308, c1755);
            }
            c22364.m7273(abstractC12612, C6241.f19252);
            abstractC4308 = c20661.f66457;
        }
        if (abstractC12612.m14709(EnumC18550.f57490)) {
            if (!abstractC4308.mo12948()) {
                C12281 c12282 = C6241.f19132;
                c22364.m7273(abstractC12612, new C12281("compiler", "annotation.not.valid.for.type", abstractC4308));
            }
            C17551 c17551 = (C17551) abstractC12612;
            m32404(c17551, c20661.f66457, c1755);
            return new C14267(c17551.f53650.f16086);
        }
        C5635 c5635 = new C5635();
        abstractC12612.mo988(c5635);
        if (!c5635.f33159) {
            c22364.m7273(abstractC12612, C6241.f19271);
            return new C14267(c20661.f66457);
        }
        boolean zMo12941 = abstractC4308.mo12941();
        C9310 c9310 = this.f40037;
        if (!zMo12941) {
            AbstractC4308 abstractC4309 = c20661.f66533;
            AbstractC4308 abstractC43010 = c20661.f66514;
            if (!c6319.m17550(abstractC4308, abstractC4309) || abstractC4308.m12913(EnumC9454.ERROR)) {
                if (abstractC4308.f13890 == abstractC43010.f13890) {
                    AbstractC4308 abstractC4308M23930 = c9310.m23930(abstractC12612, c1755, m32393(abstractC4308));
                    boolean zMo12948 = abstractC4308M23930.mo12948();
                    C6136 c6136 = this.f40036;
                    if (!zMo12948) {
                        if (C7260.m19462(abstractC12612) == c6136.f18894) {
                            return new C10741(((C6262) abstractC12612).f19397.f16086, c6319);
                        }
                        c22364.m7273(abstractC12612, C6241.f19229);
                        return new C14267(c20661.f66457);
                    }
                    if (C7260.m19462(abstractC12612) == c6136.f18894) {
                        C6262 c6262 = (C6262) abstractC12612;
                        if (c6262.f19397.f16086.mo12948()) {
                            C12193 c12193M17457 = C6319.m17457(c6262.f19397.f16086.f13890.mo16083(), c20661.f66516, abstractC43010);
                            C20619 c20619 = new C20619(abstractC4308);
                            c20619.f66338 = c12193M17457;
                            return c20619;
                        }
                    }
                    return new C14267(abstractC4308M23930.mo12947());
                }
                if (!abstractC4308.m12913(EnumC9454.CLASS) || (abstractC4308.f13890.mo16084() & 16384) == 0) {
                    if (!abstractC4308.mo12948()) {
                        c22364.m7273(abstractC12612, C6241.f19170);
                    }
                    return new C14267(c9310.m23929((AbstractC5144) abstractC12612, c1755, abstractC4308));
                }
                AbstractC4308 abstractC4308M23931 = c9310.m23930(abstractC12612, c1755, m32393(abstractC4308));
                AbstractC5698 abstractC5698M19473 = C7260.m19472(abstractC12612);
                if (abstractC5698M19473 != null) {
                    AbstractC5144 abstractC5144M19471 = C7260.m19471(abstractC12612);
                    if ((!abstractC5144M19471.m14709(EnumC18550.f57581) || ((abstractC5698M19472 = C7260.m19472(((C6262) abstractC5144M19471).f19397)) != null && ((enumC1296 = abstractC5698M19472.f17559) == EnumC1296.f4579 || enumC1296 == EnumC1296.f4582))) && abstractC5698M19473.f17559 == EnumC1296.f4567 && (16384 & abstractC5698M19473.mo16084()) != 0) {
                        return new C17090(abstractC4308, (C12048) abstractC5698M19473);
                    }
                }
                c22364.m7273(abstractC12612, C6241.f19259);
                return new C14267(abstractC4308M23931.mo12947());
            }
        }
        AbstractC4308 abstractC4308M23932 = c9310.m23930(abstractC12612, c1755, m32393(abstractC4308));
        if (abstractC4308M23932.mo12948()) {
            return new C14267(abstractC4308M23932.mo12947());
        }
        if (abstractC4308M23932.mo12915() == null) {
            c22364.m7273(abstractC12612, C6241.f19264);
            return new C14267(abstractC4308);
        }
        AbstractC4308 abstractC43011 = abstractC12612.f16086;
        if (abstractC43011 != null && (abstractC19810 = abstractC43011.f13890) != null) {
            m32408(abstractC12612, c1755, abstractC19810, abstractC12612);
        }
        return new C17796(this.f40038.m13641(abstractC4308M23932, abstractC4308).mo12915(), abstractC4308);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23420 m32393(AbstractC4308 abstractC4308) {
        C23420 c23420 = this.f40037.f28228;
        return new C23420(c23420.f75218, c23420.f75217, abstractC4308, new C20452(c23420.f75215), c23420.f75216);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32407(C2609 c2609, C1755 c1755, AbstractC5698 abstractC5698, InterfaceC3109 interfaceC3109, boolean z) {
        if (abstractC5698 == null) {
            C12171.m29640("Symbol argument to actualEnterTypeAnnotations is nul/");
            throw null;
        }
        InterfaceC18278 interfaceC18278 = c1755.f6075.f4745;
        C22364 c22364 = this.f40032;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(interfaceC18278);
        C18230 c18230 = this.f40044;
        InterfaceC3109 interfaceC3109M42471 = interfaceC3109 != null ? c18230.m42471(interfaceC3109) : null;
        try {
            m32394(abstractC5698, c2609, c1755, true, z);
        } finally {
            if (interfaceC3109M42471 != null) {
                c18230.m42471(interfaceC3109M42471);
            }
            c22364.m7284(interfaceC18278M7284);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m32408(final AbstractC5144 abstractC5144, final C1755 c1755, final AbstractC5698 abstractC5698, final InterfaceC3109 interfaceC3109) {
        C12171.m29637(abstractC5698);
        m32405(new Runnable() { // from class: l.֡᩹֨
            @Override // java.lang.Runnable
            public final void run() {
                abstractC5144.mo988(new C3518(this.f2640, c1755, abstractC5698, interfaceC3109));
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC8457 m32403() {
        return this.f40023;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m32395(C13395 c13395, C1755 c1755) {
        C12171.m29641("Trying to annotation type complete a non-annotation type", ((C5557) c1755.f6074).f17186.mo33814());
        C22364 c22364 = c13395.f40032;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(c1755.f6075.f4745);
        try {
            C5557 c5557 = (C5557) c1755.f6074;
            C22568 c22568 = new C22568(c13395, c13395.f40037, c13395.f40034, c13395.f40041, c13395.f40024);
            c22568.mo1215(c5557);
            c5557.f17186.mo33816().m49252(c22568.f72974);
            c5557.f17186.mo33816().m49253(c22568.f72971);
        } finally {
            c22364.m7284(interfaceC18278M7284);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C14267 m32416() {
        return this.f40028;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m32415() {
        this.f40039 = 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4929 m32402(C4929 c4929) {
        C4929 c49210 = new C4929(this.f40026, this.f40043, this.f40035, this.f40025);
        this.f40026 = c4929.f15538;
        this.f40035 = c4929.f15539;
        this.f40025 = c4929.f15537;
        this.f40043 = c4929.f15540;
        return c49210;
    }
}
