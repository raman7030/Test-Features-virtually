package p067l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۗܰ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5473 extends AbstractC2562 {

    /* JADX INFO: renamed from: ֫֫ */
    public static final C17542 f13060 = new C17542(0);

    /* JADX INFO: renamed from: ֡ */
    public boolean f13061;

    /* JADX INFO: renamed from: ֨ */
    public final AbstractC12224 f13062;

    /* JADX INFO: renamed from: ֫ */
    public LinkedHashMap f13063;

    /* JADX INFO: renamed from: ۗ */
    public final C8200 f13065;

    /* JADX INFO: renamed from: ۙ */
    public final boolean f13067;

    /* JADX INFO: renamed from: ۚ */
    public final AbstractC12224 f13068;

    /* JADX INFO: renamed from: ۛ */
    public final C22004 f13069;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f13070;

    /* JADX INFO: renamed from: ۠ */
    public final String f13072;

    /* JADX INFO: renamed from: ۡ */
    public C2417 f13073;

    /* JADX INFO: renamed from: ۢ */
    public final C16852 f13074;

    /* JADX INFO: renamed from: ۤ */
    public final EnumC17840 f13075;

    /* JADX INFO: renamed from: ۧ */
    public final String f13076;

    /* JADX INFO: renamed from: ۨ */
    public final EnumC12720 f13077;

    /* JADX INFO: renamed from: ܰ */
    public final C8374 f13080;

    /* JADX INFO: renamed from: ܳ */
    public LinkedHashSet f13081;

    /* JADX INFO: renamed from: ܶ */
    public final boolean f13082;

    /* JADX INFO: renamed from: ܺ */
    public final C19694 f13083;

    /* JADX INFO: renamed from: ܽ */
    public final String f13084;

    /* JADX INFO: renamed from: ܿ */
    public final String f13085;

    /* JADX INFO: renamed from: ᩳ */
    public LinkedHashMap f13086;

    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC13035 f13087;

    /* JADX INFO: renamed from: ᩵ */
    public C15795 f13088;

    /* JADX INFO: renamed from: ᩶ */
    public final C8294 f13089;

    /* JADX INFO: renamed from: ᩷ */
    public final C11216 f13090;

    /* JADX INFO: renamed from: ᩸ */
    public final C23623 f13091;

    /* JADX INFO: renamed from: ᩺ */
    public final C18318 f13093;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f13094;

    /* JADX INFO: renamed from: ۖ */
    public final HashSet f13064 = new HashSet();

    /* JADX INFO: renamed from: ۘ */
    public final HashSet f13066 = new HashSet();

    /* JADX INFO: renamed from: ۫ */
    public Set f13078 = null;

    /* JADX INFO: renamed from: ۟ */
    public final HashSet f13071 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC8453 f13092 = new C10167(this);

    /* JADX INFO: renamed from: ۬ */
    public final HashMap f13079 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public static void m12075(C5473 c5473, AbstractC7783 abstractC7783) {
        c5473.getClass();
        C2417 c2417 = (C2417) abstractC7783;
        c2417.mo18020();
        C4036 c4036M41755 = c5473.f13093.m41755(c2417);
        C6814 c6814 = new C6814(c5473, c2417, c4036M41755);
        C23623 c23623 = c5473.f13091;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036M41755.f8851.f7516);
        C5777 c5777M6848 = c4036M41755.f8851.m6848();
        C19694 c19694 = c5473.f13083;
        c5777M6848.getClass();
        InterfaceC5323 interfaceC5323M44730 = c19694.m44730((InterfaceC5323) c5777M6848);
        try {
            c6814.mo3788(c5777M6848);
        } finally {
            c23623.m9363(interfaceC19740M9363);
            c19694.m44730(interfaceC5323M44730);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m12078(C5473 c5473, C2417 c2417) {
        c5473.getClass();
        c2417.mo18020();
        return !c2417.f20408.m28205(c5473.f13068) && C7480.stream(c2417.f3697).anyMatch(new C10838());
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5473 m12055(C5127 c5127) {
        C5473 c5473 = (C5473) c5127.m10904(C5473.class);
        return c5473 == null ? new C5473(c5127) : c5473;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12091(String... strArr) {
        this.f13064.addAll(Arrays.asList(strArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12090(C4848 c4848) {
        C1446.m31704(!this.f13061);
        try {
            this.f13061 = true;
            C1446.m31706(this.f13078);
            m12067(c4848, new C19555(0, this), (C15828) null);
        } finally {
            this.f13061 = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX INFO: renamed from: ֫ */
    public static void m12060(final C5473 c5473, Set set) {
        InterfaceC19157 interfaceC19157Filter;
        ?? r3;
        Predicate c22726;
        Predicate c15637;
        C1446.m31706(c5473.f13078);
        C1446.m31706(c5473.f13081);
        c5473.f13078 = set;
        HashSet hashSet = c5473.f13064;
        String str = c5473.f13084;
        C23623 c23623 = c5473.f13091;
        HashSet hashSet2 = c5473.f13066;
        C8200 c8200 = c5473.f13065;
        C22004 c22004 = c5473.f13069;
        C1446.m31699(set);
        C1446.m31706(c5473.f13081);
        String str2 = c5473.f13072;
        int i = 0;
        final LinkedHashSet linkedHashSetM12054 = null;
        if (str2 != null || !hashSet2.isEmpty()) {
            HashSet<C2417> hashSet3 = new HashSet();
            if (str2 != null) {
                for (String str3 : str2.split(",")) {
                    if (c5473.m12066(str3)) {
                        hashSet3.add(c22004.m49585(c8200.f21738.m32717(str3)));
                    }
                }
            }
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                hashSet3.add(c22004.m49585(c8200.f21738.m32717((String) it.next())));
            }
            linkedHashSetM12054 = c5473.m12054(hashSet3, c5473.f13078, (LinkedHashSet) null);
            linkedHashSetM12054.addAll(c5473.f13078);
            if (c5473.f13082) {
                for (C2417 c2417 : hashSet3) {
                    if (!linkedHashSetM12054.contains(c2417)) {
                        c23623.m9361(EnumC21706.OPTIONS, C15675.m35721(EnumC2483.f3920, c2417));
                    }
                }
            }
        }
        Predicate predicate = new Predicate() { // from class: l.᩵ܰ֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return C20697.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m47201or(Predicate predicate2) {
                return C20697.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C5473.m12068(this.f65612, linkedHashSetM12054, (C2417) obj);
            }
        };
        C2790 c2790 = new C2790(i);
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (c5473.f13078.contains(c22004.f69129)) {
            int i2 = 3;
            if (c5473.f13077.m29248()) {
                c22726 = new C24355(i2);
            } else {
                C2417 c2417M49596 = c22004.m49596(c5473.f13062);
                if (c2417M49596 != null && (linkedHashSetM12054 == null || linkedHashSetM12054.contains(c2417M49596))) {
                    c15637 = new C15637(2, c5473);
                    linkedHashSet.add(c2417M49596);
                } else {
                    c22726 = new C22726(i2);
                }
                for (C2417 c2418 : new HashSet(c22004.m49584())) {
                    try {
                        if (!c2790.test(c2418) && predicate.test(c2418) && c15637.test(c2418)) {
                            c2418.mo18020();
                            if (!c2418.f3691.contains(EnumC20524.DO_NOT_RESOLVE_BY_DEFAULT)) {
                                linkedHashSet.add(c2418);
                            }
                        }
                    } catch (C21865 e) {
                        c5473.f13074.m38271((InterfaceC5323) null, e);
                    }
                }
            }
            c15637 = c22726;
            while (r9.hasNext()) {
                if (!c2790.test(c2418)) {
                }
            }
        }
        linkedHashSet.addAll(c5473.f13078);
        if (str != null || !hashSet.isEmpty()) {
            HashSet<String> hashSet4 = new HashSet();
            hashSet4.addAll(hashSet);
            if (str != null) {
                hashSet4.addAll(Arrays.asList(str.split(",")));
            }
            for (String str4 : hashSet4) {
                str4.getClass();
                if (str4.equals("ALL-SYSTEM")) {
                    interfaceC19157Filter = C7480.stream(new HashSet(c22004.m49584())).filter(c2790.and(predicate));
                } else if (str4.equals("ALL-MODULE-PATH")) {
                    interfaceC19157Filter = C7480.stream(new HashSet(c22004.m49584())).filter(c2790.mo55838negate().and(predicate));
                } else if (c5473.m12066(str4)) {
                    AbstractC14235 abstractC14235 = c8200.f21738;
                    abstractC14235.getClass();
                    char[] charArray = str4.toCharArray();
                    interfaceC19157Filter = C18486.m42023of(c22004.m49585(abstractC14235.mo17848(charArray, charArray.length)));
                }
                interfaceC19157Filter.forEach(new Consumer() { // from class: l.ۚܰ֨
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C24719.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void m45213n(Object obj) {
                        C2417 c2419 = (C2417) obj;
                        linkedHashSet.add(c2419);
                        Set set2 = linkedHashSetM12054;
                        if (set2 != null) {
                            set2.add(c2419);
                        }
                    }
                });
            }
        }
        LinkedHashSet linkedHashSetM12055 = c5473.m12054(linkedHashSet, c5473.f13078, linkedHashSetM12054);
        linkedHashSetM12055.add(c22004.f69129);
        InterfaceC19157 interfaceC19157Stream = C7480.stream(linkedHashSetM12055);
        C17542 c17542 = f13060;
        if (interfaceC19157Stream.anyMatch(c17542)) {
            r3 = 0;
            C7480.stream(c22004.m49584()).filter(c17542).forEach(new C3461(0 == true ? 1 : 0, linkedHashSetM12055));
        } else {
            r3 = 0;
        }
        String str5 = (String) C7480.stream(linkedHashSetM12055).filter(new C18884(r3)).map(new C16201(r3)).collect(C24205.joining(","));
        if (!str5.isEmpty()) {
            C12895 c12895 = C15675.f45417;
            Object[] objArr = new Object[1];
            objArr[r3] = str5;
            c23623.m9354(new C12895("compiler", "incubating.modules", objArr));
        }
        c5473.f13081 = linkedHashSetM12055;
        c5473.f13061 = r3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12093(C15828 c15828, C4848 c4848) {
        C1446.m31704((this.f13078 == null && !this.f13061 && this.f13070) ? false : true);
        return m12067(c4848, new C24919(), c15828);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m12067(C4848 c4848, Consumer consumer, C15828 c15828) {
        if (!this.f13070) {
            Iterator it = c4848.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C22004 c22004 = this.f13069;
                if (zHasNext) {
                    ((C3626) it.next()).f7510 = c22004.f69147;
                } else {
                    this.f13073 = c22004.f69147;
                    return true;
                }
            }
        } else {
            C23623 c23623 = this.f13091;
            int i = c23623.f75180;
            try {
                LinkedHashSet linkedHashSetM12072 = m12072(c15828, c4848);
                m12059(c4848, linkedHashSetM12072, c15828);
                consumer.m45213n(linkedHashSetM12072);
                Iterator it2 = linkedHashSetM12072.iterator();
                while (it2.hasNext()) {
                    ((C2417) it2.next()).mo18020();
                }
            } catch (C21865 e) {
                this.f13074.m38271((InterfaceC5323) null, e);
            }
            return c23623.f75180 == i;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC8453 m12096() {
        return this.f13092;
    }

    /* JADX INFO: renamed from: ܳ */
    public final C2417 m12095() {
        return this.f13073;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m12098() {
        return this.f13081 != null;
    }

    /* JADX INFO: renamed from: ۧ */
    private LinkedHashSet m12072(C15828 c15828, C4848 c4848) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C3626 c3626 = (C3626) it.next();
            InterfaceC19740 interfaceC19740 = c3626.f7516;
            C23623 c23623 = this.f13091;
            InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
            try {
                m12058(c3626, c15828, linkedHashSet);
                c23623.m9363(interfaceC19740M9363);
            } catch (Throwable th) {
                c23623.m9363(interfaceC19740M9363);
                throw th;
            }
        }
        return linkedHashSet;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫ */
    private void m12058(C3626 c3626, C15828 c15828, LinkedHashSet linkedHashSet) {
        AbstractC7257 abstractC7257;
        C2417 c2417M49585;
        boolean zMo23288 = c3626.f7516.mo23288("module-info", EnumC18398.SOURCE);
        C5777 c5777M6848 = c3626.m6848();
        boolean z = this.f13067;
        C23623 c23623 = this.f13091;
        if (c5777M6848 == null) {
            if (zMo23288 && z) {
                if (!c3626.f7509.isEmpty()) {
                    abstractC7257 = c3626;
                    abstractC7257 = (AbstractC7257) c3626.f7509.f11034;
                }
                abstractC7257 = c3626;
                abstractC7257.getClass();
                c23623.m9352(abstractC7257, C8300.f22015);
                return;
            }
            return;
        }
        C5777 c5777M6849 = c3626.m6848();
        if (!zMo23288) {
            c5777M6849.getClass();
            c23623.m9352(c5777M6849, C8300.f22114);
        }
        AbstractC12224 abstractC12224M21418 = C9268.m21418(c5777M6849.f14183);
        if (c15828 != null) {
            c2417M49585 = (C2417) c15828.f20407;
            C1446.m31699(c2417M49585.f20408);
            AbstractC12224 abstractC12224M21419 = C9268.m21418(c5777M6849.f14183);
            AbstractC12224 abstractC12224 = c2417M49585.f20408;
            if (abstractC12224 != abstractC12224M21419) {
                C14040 c14040 = C8300.f21997;
                c23623.m9352(c5777M6849, new C14040("compiler", "module.name.mismatch", abstractC12224M21418, abstractC12224));
            }
        } else {
            c2417M49585 = this.f13069.m49585(abstractC12224M21418);
            InterfaceC19740 interfaceC19740 = c2417M49585.f3687.f45858;
            if (interfaceC19740 != null && interfaceC19740 != c3626.f7516) {
                C14040 c14041 = C8300.f21997;
                c23623.m9352(c5777M6849, new C14040("compiler", "duplicate.module", c2417M49585));
                return;
            }
        }
        c2417M49585.f20410 = new C16871(this, c3626);
        c2417M49585.f3687.f45858 = c3626.f7516;
        c5777M6849.f14182 = c2417M49585;
        if (z || linkedHashSet.isEmpty()) {
            linkedHashSet.add(c2417M49585);
        } else {
            c23623.m9352(c3626, C8300.f22088);
        }
        C4036 c4036 = new C4036(c5777M6849, null);
        c4036.f8851 = c3626;
        this.f13093.m41757(c2417M49585, c4036);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0224  */
    /* JADX WARN: Code duplicated, block: B:175:0x0388  */
    /* JADX WARN: Code duplicated, block: B:68:0x0163 A[Catch: all -> 0x00a3, IOException -> 0x00a6, TryCatch #4 {IOException -> 0x00a6, blocks: (B:11:0x0038, B:13:0x0044, B:16:0x0052, B:20:0x0074, B:22:0x0077, B:24:0x0083, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c5, B:40:0x00ca, B:42:0x00da, B:44:0x00e2, B:51:0x0117, B:53:0x011b, B:55:0x0123, B:56:0x012f, B:58:0x0137, B:60:0x0145, B:61:0x0148, B:62:0x014a, B:47:0x0104, B:49:0x010e, B:50:0x0113, B:65:0x0156, B:67:0x0160, B:68:0x0163, B:70:0x0169, B:72:0x0174, B:71:0x016f), top: B:190:0x0038, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0169 A[Catch: all -> 0x00a3, IOException -> 0x00a6, TryCatch #4 {IOException -> 0x00a6, blocks: (B:11:0x0038, B:13:0x0044, B:16:0x0052, B:20:0x0074, B:22:0x0077, B:24:0x0083, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c5, B:40:0x00ca, B:42:0x00da, B:44:0x00e2, B:51:0x0117, B:53:0x011b, B:55:0x0123, B:56:0x012f, B:58:0x0137, B:60:0x0145, B:61:0x0148, B:62:0x014a, B:47:0x0104, B:49:0x010e, B:50:0x0113, B:65:0x0156, B:67:0x0160, B:68:0x0163, B:70:0x0169, B:72:0x0174, B:71:0x016f), top: B:190:0x0038, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x016f A[Catch: all -> 0x00a3, IOException -> 0x00a6, TryCatch #4 {IOException -> 0x00a6, blocks: (B:11:0x0038, B:13:0x0044, B:16:0x0052, B:20:0x0074, B:22:0x0077, B:24:0x0083, B:33:0x00ad, B:35:0x00b3, B:37:0x00bd, B:39:0x00c5, B:40:0x00ca, B:42:0x00da, B:44:0x00e2, B:51:0x0117, B:53:0x011b, B:55:0x0123, B:56:0x012f, B:58:0x0137, B:60:0x0145, B:61:0x0148, B:62:0x014a, B:47:0x0104, B:49:0x010e, B:50:0x0113, B:65:0x0156, B:67:0x0160, B:68:0x0163, B:70:0x0169, B:72:0x0174, B:71:0x016f), top: B:190:0x0038, outer: #2 }] */
    /* JADX INFO: renamed from: ֫ */
    private void m12059(C4848 c4848, LinkedHashSet linkedHashSet, C15828 c15828) {
        C8294 c8294;
        InterfaceC4317 interfaceC4317;
        InterfaceC19740 interfaceC19740M9363;
        String str;
        C5473 c5473;
        char c;
        InterfaceC4317 interfaceC4317Mo4113;
        C2417 c2417M49585;
        InterfaceC19740 interfaceC19740Mo4105;
        AbstractC12224 abstractC12224M32717;
        C5473 c5474 = this;
        boolean z = c5474.f13067;
        C8294 c8295 = c5474.f13089;
        C8200 c8200 = c5474.f13065;
        C23623 c23623 = c5474.f13091;
        C22004 c22004 = c5474.f13069;
        InterfaceC13035 interfaceC13035 = c5474.f13087;
        if (z) {
            Iterator it = c4848.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                C3626 c3626 = (C3626) it.next();
                if (c3626.f7509.isEmpty()) {
                    c3626.f7510 = c22004.f69129;
                } else {
                    InterfaceC19740 interfaceC19740M9364 = c23623.m9363(c3626.f7516);
                    try {
                        try {
                            InterfaceC4317 interfaceC4317M12073 = c5474.m12073(c3626);
                            EnumC22423 enumC22423 = EnumC22423.PATCH_MODULE_PATH;
                            if (interfaceC13035.mo4108(enumC22423)) {
                                c = 0;
                                interfaceC4317Mo4113 = interfaceC13035.mo4113(enumC22423, c3626.f7516);
                            } else {
                                c = 0;
                                interfaceC4317Mo4113 = null;
                            }
                            if (interfaceC4317Mo4113 != null) {
                                AbstractC12224 abstractC12224M32718 = c8200.f21738.m32717(interfaceC13035.mo4115(interfaceC4317Mo4113));
                                C2417 c2417M19107 = c8295.m19107(abstractC12224M32718);
                                c3626.f7510 = c2417M19107;
                                linkedHashSet.add(c2417M19107);
                                z2 |= (c2417M19107.f20409 & 4503599627370496L) != 0;
                                if (interfaceC4317M12073 != null && abstractC12224M32718 != (abstractC12224M32717 = c8200.f21738.m32717(interfaceC13035.mo4115(interfaceC4317M12073)))) {
                                    C14040 c14040 = C8300.f21997;
                                    Object[] objArr = new Object[2];
                                    objArr[c] = abstractC12224M32718;
                                    objArr[1] = abstractC12224M32717;
                                    c23623.m9352(c3626, new C14040("compiler", "file.patched.and.msp", objArr));
                                }
                                c8295 = c8295;
                                c8200 = c8200;
                            } else {
                                it = it;
                                if (interfaceC4317M12073 != null) {
                                    if (c3626.m6848() != null && ((interfaceC19740Mo4105 = interfaceC13035.mo4105(interfaceC4317M12073, "module-info", EnumC18398.SOURCE)) == null || !interfaceC13035.mo4110(interfaceC19740Mo4105, c3626.f7516))) {
                                        c23623.m9352(c3626, C8300.f22126);
                                    }
                                    AbstractC12224 abstractC12224M32719 = c8200.f21738.m32717(interfaceC13035.mo4115(interfaceC4317M12073));
                                    C5777 c5777M6848 = c3626.m6848();
                                    if (c5777M6848 != null) {
                                        C2417 c2417 = c5777M6848.f14182;
                                        AbstractC12224 abstractC12224 = c2417.f20408;
                                        if (abstractC12224 != abstractC12224M32719) {
                                            AbstractC14355 abstractC14355 = c5777M6848.f14183;
                                            C14040 c14041 = C8300.f21997;
                                            Object[] objArr2 = new Object[2];
                                            objArr2[c] = abstractC12224;
                                            objArr2[1] = abstractC12224M32719;
                                            c23623.m9352(abstractC14355, new C14040("compiler", "module.name.mismatch", objArr2));
                                        }
                                        c2417M49585 = c2417;
                                    } else {
                                        c8295 = c8295;
                                        if (c3626.m6851() == null) {
                                            c23623.m9352(c3626, C8300.f22039);
                                        }
                                        c2417M49585 = c22004.m49585(abstractC12224M32719);
                                    }
                                    if (c2417M49585.f3703 == null) {
                                        c2417M49585.f3703 = interfaceC4317M12073;
                                        if (interfaceC13035.mo4108(enumC22423)) {
                                            c2417M49585.f3700 = interfaceC13035.mo4112(enumC22423, c2417M49585.f20408.toString());
                                        }
                                        EnumC22423 enumC22424 = EnumC22423.CLASS_OUTPUT;
                                        if (interfaceC13035.mo4108(enumC22424)) {
                                            InterfaceC4317 interfaceC4317Mo4112 = interfaceC13035.mo4112(enumC22424, c2417M49585.f20408.toString());
                                            if (c2417M49585.f3700 == null) {
                                                c2417M49585.f3690 = interfaceC4317Mo4112;
                                            } else {
                                                c2417M49585.f3702 = interfaceC4317Mo4112;
                                            }
                                        }
                                    }
                                    c3626.f7510 = c2417M49585;
                                    linkedHashSet.add(c2417M49585);
                                } else {
                                    c8295 = c8295;
                                    c8200 = c8200;
                                    if (c15828 != null) {
                                        C2417 c2418 = c15828.m18008().f27063;
                                        C2417 c2419 = c22004.f69129;
                                        if (c2418 == c2419) {
                                            c3626.f7510 = c2419;
                                        } else {
                                            if (c3626.m6848() != null) {
                                                c23623.m9352(c3626, C8300.f22126);
                                            } else {
                                                c23623.m9352(c3626, C8300.f22155);
                                            }
                                            c3626.f7510 = c22004.f69202;
                                        }
                                    } else {
                                        if (c3626.m6848() != null) {
                                            c23623.m9352(c3626, C8300.f22126);
                                        } else {
                                            c23623.m9352(c3626, C8300.f22155);
                                        }
                                        c3626.f7510 = c22004.f69202;
                                    }
                                }
                            }
                            c23623.m9363(interfaceC19740M9364);
                            c5474 = this;
                            it = it;
                            c8200 = c8200;
                            c8295 = c8295;
                        } catch (Throwable th) {
                            c23623.m9363(interfaceC19740M9364);
                            throw th;
                        }
                    } catch (IOException e) {
                        throw new Error(e);
                    }
                }
            }
            C8294 c8296 = c8295;
            if (!z2) {
                m12088();
            }
            C2417 c24110 = c22004.f69129;
            C2417 c24111 = c22004.f69129;
            if (c24110.f3703 == null) {
                c8296.m19108();
                c5473 = this;
                c24110.f20410 = new C22908(c5473);
                c24111.f3703 = EnumC22423.SOURCE_PATH;
                c24111.f3690 = EnumC22423.CLASS_PATH;
            } else {
                c5473 = this;
            }
            c5473.f13073 = c24111;
            return;
        }
        C2417 c24112 = null;
        if (c5474.f13073 == null) {
            if (interfaceC13035.mo4108(EnumC22423.PATCH_MODULE_PATH)) {
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it2 = c4848.iterator();
                while (it2.hasNext()) {
                    try {
                        InterfaceC4317 interfaceC4317Mo4114 = interfaceC13035.mo4113(EnumC22423.PATCH_MODULE_PATH, ((C3626) it2.next()).f7516);
                        if (interfaceC4317Mo4114 != null) {
                            linkedHashSet2.add(interfaceC13035.mo4115(interfaceC4317Mo4114));
                        }
                    } catch (IOException e2) {
                        throw new Error(e2);
                    }
                }
                int size = linkedHashSet2.size();
                if (size == 0) {
                    str = null;
                } else if (size != 1) {
                    C14040 c14042 = C8300.f21997;
                    c23623.m9355(new C14040("compiler", "too.many.patched.modules", linkedHashSet2));
                    str = null;
                } else {
                    str = (String) linkedHashSet2.iterator().next();
                }
            } else {
                str = null;
            }
            int size2 = linkedHashSet.size();
            if (size2 == 0) {
                try {
                    c5474.f13073 = c8295.m19110();
                } catch (C21865 e3) {
                    c5474.f13074.m38271((InterfaceC5323) null, e3);
                    c5474.f13073 = c22004.f69129;
                }
                C2417 c24113 = c5474.f13073;
                if (c24113 != c22004.f69129) {
                    c8294 = c8295;
                    m12088();
                    c5474.f13073.mo18020();
                    C2417 c24114 = c5474.f13073;
                    c24114.f20410 = new C24868(c5474);
                    c24114.f3703 = EnumC22423.SOURCE_PATH;
                } else if (str != null) {
                    AbstractC14235 abstractC14235 = c8200.f21738;
                    abstractC14235.getClass();
                    char[] charArray = str.toCharArray();
                    AbstractC12224 abstractC12224Mo17848 = abstractC14235.mo17848(charArray, charArray.length);
                    c8294 = c8295;
                    C2417 c2417M19108 = c8294.m19107(abstractC12224Mo17848);
                    c5474.f13073 = c2417M19108;
                    c2417M19108.f3702 = EnumC22423.CLASS_OUTPUT;
                    if ((4503599627370496L & c2417M19108.f20409) == 0) {
                        m12088();
                    }
                } else {
                    c8294 = c8295;
                    c8294.m19108();
                    c24113.f20410 = new C22908(c5474);
                    C2417 c24115 = c5474.f13073;
                    c24115.f3703 = EnumC22423.SOURCE_PATH;
                    c24115.f3690 = EnumC22423.CLASS_PATH;
                }
                linkedHashSet.add(c5474.f13073);
            } else {
                if (size2 != 1) {
                    C1446.m31702("too many modules");
                    throw null;
                }
                m12088();
                C2417 c24116 = (C2417) linkedHashSet.iterator().next();
                c5474.f13073 = c24116;
                c24116.f3703 = EnumC22423.SOURCE_PATH;
                EnumC22423 enumC22425 = EnumC22423.PATCH_MODULE_PATH;
                if (interfaceC13035.mo4108(enumC22425)) {
                    try {
                        C2417 c24117 = c5474.f13073;
                        c24117.f3700 = interfaceC13035.mo4112(enumC22425, c24117.f20408.toString());
                    } catch (IOException e4) {
                        throw new Error(e4);
                    }
                }
                C2417 c24118 = c5474.f13073;
                if (c24118.f3700 == null) {
                    c24118.f3690 = EnumC22423.CLASS_OUTPUT;
                } else {
                    c24118.f3702 = EnumC22423.CLASS_OUTPUT;
                }
                c8294 = c8295;
            }
        } else {
            c8294 = c8295;
            if (linkedHashSet.size() == 1) {
                c24112 = (C2417) linkedHashSet.iterator().next();
                c24112.mo18020();
                c24112.f20410 = new C4444(8, c5474);
            } else {
                C1446.m31704(linkedHashSet.isEmpty());
                C1446.m31699(c15828);
                c24112 = c15828.m18008().f27063;
                linkedHashSet.add(c24112);
            }
        }
        C2417 c24119 = c5474.f13073;
        C2417 c24120 = c22004.f69129;
        C2417 c24121 = c22004.f69129;
        if (c24119 != c24120) {
            c8294.m19108();
            c24120.f20410 = new C22908(c5474);
            c24121.f3690 = EnumC22423.CLASS_PATH;
        }
        if (c24112 == null) {
            c24112 = c5474.f13073;
        }
        Iterator it3 = c4848.iterator();
        while (it3.hasNext()) {
            C3626 c3627 = (C3626) it3.next();
            C2417 c24122 = c5474.f13073;
            if (c24122 != c24121) {
                InterfaceC4317 interfaceC4318 = c24122.f3703;
                EnumC22423 enumC22426 = EnumC22423.SOURCE_PATH;
                if (interfaceC4318 == enumC22426 && interfaceC13035.mo4108(enumC22426)) {
                    try {
                        InterfaceC19740 interfaceC19740 = c3627.f7516;
                        if (!interfaceC13035.mo4109(c24112.f3703, (InterfaceC9741) interfaceC19740) && ((interfaceC4317 = c24112.f3700) == null || !interfaceC13035.mo4109(interfaceC4317, (InterfaceC9741) interfaceC19740))) {
                            EnumC22423 enumC22427 = EnumC22423.SOURCE_OUTPUT;
                            if (interfaceC13035.mo4108(enumC22427)) {
                                if (!interfaceC13035.mo4109((InterfaceC4317) enumC22427, (InterfaceC9741) interfaceC19740)) {
                                    interfaceC19740M9363 = c23623.m9363(c3627.f7516);
                                    try {
                                        c23623.m9352(c3627, C8300.f21988);
                                        c23623.m9363(interfaceC19740M9363);
                                    } catch (Throwable th2) {
                                        c23623.m9363(interfaceC19740M9363);
                                        throw th2;
                                    }
                                }
                            } else if (interfaceC13035.mo4109((InterfaceC4317) EnumC22423.CLASS_OUTPUT, (InterfaceC9741) interfaceC19740)) {
                                continue;
                            } else {
                                interfaceC19740M9363 = c23623.m9363(c3627.f7516);
                                c23623.m9352(c3627, C8300.f21988);
                                c23623.m9363(interfaceC19740M9363);
                            }
                        }
                    } catch (IOException e5) {
                        throw new Error(e5);
                    }
                }
            }
            c3627.f7510 = c24112;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private InterfaceC4317 m12073(C3626 c3626) {
        InterfaceC19740 interfaceC19740 = c3626.f7516;
        EnumC22423 enumC22423 = EnumC22423.MODULE_SOURCE_PATH;
        InterfaceC13035 interfaceC13035 = this.f13087;
        InterfaceC4317 interfaceC4317Mo4113 = interfaceC13035.mo4113(enumC22423, interfaceC19740);
        if (interfaceC4317Mo4113 != null) {
            return interfaceC4317Mo4113;
        }
        EnumC22423 enumC22424 = EnumC22423.SOURCE_OUTPUT;
        if (!interfaceC13035.mo4108(enumC22424)) {
            enumC22424 = EnumC22423.CLASS_OUTPUT;
        }
        return interfaceC13035.mo4113(enumC22424, interfaceC19740);
    }

    /* JADX INFO: renamed from: ᩷ */
    private void m12088() {
        String str = this.f13084;
        if (str == null || !Arrays.asList(str.split(",")).contains("ALL-MODULE-PATH")) {
            return;
        }
        this.f13091.m9355(C8300.f22068);
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m12086(C5473 c5473, C2417 c2417) {
        InterfaceC13035 interfaceC13035 = c5473.f13087;
        try {
            C20271 c20271 = new C20271();
            C20271 c20272 = new C20271();
            HashSet hashSet = new HashSet();
            Iterator it = interfaceC13035.mo4100(c2417.f3690, "", (Set) EnumSet.of(EnumC18398.CLASS), true).iterator();
            while (it.hasNext()) {
                String strMo4101 = interfaceC13035.mo4101(c2417.f3690, (InterfaceC19740) it.next());
                String strSubstring = strMo4101.lastIndexOf(46) != -1 ? strMo4101.substring(0, strMo4101.lastIndexOf(46)) : "";
                if (hashSet.add(strSubstring)) {
                    C19023 c19023 = new C19023(c5473.f13069.m49593(c2417, c5473.f13065.f21738.m32717(strSubstring)), null);
                    c20271.m45777(c19023);
                    c20272.m45777(c19023);
                }
            }
            c2417.f3697 = c20272.m45783();
            c2417.f3701 = C4848.m10283();
            c2417.f3705 = C4848.m10283();
            c2417.f3693 = C4848.m10283();
            c2417.f3696 = c20271.m45783();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Set m12097() {
        C1446.m31699(this.f13081);
        return this.f13081;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ boolean m12068(C5473 c5473, Set set, C2417 c2417) {
        if (set == null) {
            c5473.f13089.m19109(c2417);
            return c2417.f20405 != EnumC3600.f7353;
        }
        c5473.getClass();
        return set.contains(c2417);
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ boolean m12076(C2417 c2417) {
        c2417.mo18020();
        return C7480.stream(c2417.f3697).anyMatch(new C4803(0));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m12092(C2417 c2417) {
        LinkedHashSet linkedHashSet = this.f13081;
        return linkedHashSet == null || linkedHashSet.contains(c2417);
    }

    /* JADX INFO: renamed from: ֫ */
    private LinkedHashSet m12054(HashSet hashSet, Set set, LinkedHashSet linkedHashSet) {
        C2417 c2417;
        boolean z;
        C4848 c4848M10283 = C4848.m10283();
        C4848 c4848M10284 = C4848.m10283();
        for (Object obj : hashSet) {
            if (set.contains(obj)) {
                c4848M10283 = c4848M10283.m10290(obj);
            } else {
                c4848M10284 = c4848M10284.m10290(obj);
            }
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        C22004 c22004 = this.f13069;
        linkedHashSet2.add(c22004.f69191);
        C4848 c4848M10290 = c4848M10284;
        C4848 c4848M10291 = c4848M10283;
        while (true) {
            if (!c4848M10291.m10293() && !c4848M10290.m10293()) {
                return linkedHashSet2;
            }
            try {
                if (c4848M10291.m10293()) {
                    c2417 = (C2417) c4848M10291.f11034;
                    c4848M10291 = c4848M10291.f11035;
                    z = true;
                } else {
                    c2417 = (C2417) c4848M10290.f11034;
                    c4848M10290 = c4848M10290.f11035;
                    z = false;
                }
                if ((linkedHashSet == null || linkedHashSet.contains(c2417)) && linkedHashSet2.add(c2417) && c2417 != c22004.f69129 && (c2417.f20409 & 4503599627370496L) == 0) {
                    c2417.mo18020();
                    if (c2417.f20405 == EnumC3600.f7353) {
                        if (!z) {
                            try {
                                if (hashSet.contains(c2417)) {
                                }
                            } catch (C21865 e) {
                                e = e;
                                this.f13074.m38271((InterfaceC5323) null, e);
                            }
                        }
                        if (this.f13071.add(c2417)) {
                            C23623 c23623 = this.f13091;
                            C14040 c14040 = C8300.f21997;
                            c23623.m9355(new C14040("compiler", "module.not.found", c2417));
                        }
                    }
                    for (C11648 c11648 : c2417.f3705) {
                        if (c11648.f32494 != c22004.f69191) {
                            if ((c11648.f32493.contains(EnumC10977.TRANSITIVE) && z) || set.contains(c2417)) {
                                c4848M10291 = c4848M10291.m10290(c11648.f32494);
                            } else {
                                c4848M10290 = c4848M10290.m10290(c11648.f32494);
                            }
                        }
                    }
                }
            } catch (C21865 e2) {
                e = e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x011e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0129  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x013a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:58:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX INFO: renamed from: ܽ */
    public void m12081(final C2417 c2417) {
        HashMap map;
        Object obj;
        String[] strArrSplit;
        int length;
        int i;
        String str;
        String[] strArr;
        C2417 c2417M49585;
        if (this.f13061) {
            c2417.f20410 = new InterfaceC8453() { // from class: l.ᩴܰ֨
                @Override // p067l.InterfaceC8453
                /* JADX INFO: renamed from: ֫ */
                public final void mo9171(AbstractC7783 abstractC7783) {
                    this.f62529.m12081(c2417);
                }

                @Override // p067l.InterfaceC8453
                /* JADX INFO: renamed from: ܽ */
                public final /* synthetic */ boolean mo9173() {
                    return false;
                }
            };
            return;
        }
        long j = c2417.f20409 & 4503599627370496L;
        C22004 c22004 = this.f13069;
        if (j != 0) {
            C20271 c20271 = new C20271();
            c20271.addAll(c2417.f3696);
            C20271 c20272 = new C20271();
            for (C2417 c2418 : m12097()) {
                if (c2418 != c22004.f69129 && c2418 != c2417) {
                    C11648 c11648 = new C11648(c2418, (c2418.f20409 & 4503599627370496L) != 0 ? EnumSet.of(EnumC10977.TRANSITIVE) : EnumSet.noneOf(EnumC10977.class));
                    c20271.m45777(c11648);
                    c20272.m45777(c11648);
                }
            }
            C11648 c11649 = new C11648(c22004.f69129, EnumSet.noneOf(EnumC10977.class));
            c20271.m45777(c11649);
            c20272.m45777(c11649);
            c2417.f3705 = c20272.m45783();
            c2417.f3696 = c20271.m45783();
        }
        C1446.m31699(c2417.f3705);
        LinkedHashMap linkedHashMap = this.f13086;
        int i2 = 1;
        C23623 c23623 = this.f13091;
        if (linkedHashMap == null) {
            this.f13086 = new LinkedHashMap();
            String str2 = this.f13085;
            if (str2 != null) {
                Pattern patternCompile = Pattern.compile("([^=]+)=(.*)");
                String[] strArrSplit2 = str2.split("\u0000+");
                int length2 = strArrSplit2.length;
                int i3 = 0;
                while (i3 < length2) {
                    String str3 = strArrSplit2[i3];
                    if (!str3.isEmpty()) {
                        Matcher matcher = patternCompile.matcher(str3);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(i2);
                            String strGroup2 = matcher.group(2);
                            if (m12066(strGroup)) {
                                C8200 c8200 = this.f13065;
                                C2417 c2417M49586 = c22004.m49585(c8200.f21738.m32717(strGroup));
                                boolean zContains = this.f13081.contains(c2417M49586);
                                boolean z = this.f13082;
                                if (zContains) {
                                    if (this.f13094) {
                                        strArrSplit = strGroup2.split("[ ,]+", -1);
                                        length = strArrSplit.length;
                                        i = 0;
                                        while (i < length) {
                                            str = strArrSplit[i];
                                            String[] strArr2 = strArrSplit2;
                                            if (str.equals("ALL-UNNAMED")) {
                                                c2417M49585 = c22004.f69129;
                                                strArr = strArrSplit;
                                            } else {
                                                if (m12066(str)) {
                                                    AbstractC14235 abstractC14235 = c8200.f21738;
                                                    abstractC14235.getClass();
                                                    char[] charArray = str.toCharArray();
                                                    strArr = strArrSplit;
                                                    c2417M49585 = c22004.m49585(abstractC14235.mo17848(charArray, charArray.length));
                                                    if (!this.f13081.contains(c2417M49585)) {
                                                        if (z) {
                                                            c23623.m9361(EnumC21706.OPTIONS, C15675.m35721(EnumC2483.f3938, c2417M49585));
                                                        }
                                                    }
                                                    i++;
                                                    strArrSplit2 = strArr2;
                                                    strArrSplit = strArr;
                                                    c8200 = c8200;
                                                } else {
                                                    strArr = strArrSplit;
                                                }
                                                i++;
                                                strArrSplit2 = strArr2;
                                                strArrSplit = strArr;
                                                c8200 = c8200;
                                            }
                                            ((Set) C15525.computeIfAbsent(this.f13086, c2417M49586, new C8826(0))).add(new C11648(c2417M49585, EnumSet.of(EnumC10977.EXTRA)));
                                            i++;
                                            strArrSplit2 = strArr2;
                                            strArrSplit = strArr;
                                            c8200 = c8200;
                                        }
                                    } else {
                                        int i4 = i2;
                                        if ((c2417M49586.f20409 & 9007199254740992L) != 0) {
                                            C14040 c14040 = C8300.f21997;
                                            Object[] objArr = new Object[i4];
                                            objArr[0] = c2417M49586;
                                            c23623.m9355(new C14040("compiler", "add.reads.with.release", objArr));
                                        } else {
                                            strArrSplit = strGroup2.split("[ ,]+", -1);
                                            length = strArrSplit.length;
                                            i = 0;
                                            while (i < length) {
                                                str = strArrSplit[i];
                                                String[] strArr3 = strArrSplit2;
                                                if (str.equals("ALL-UNNAMED")) {
                                                    c2417M49585 = c22004.f69129;
                                                    strArr = strArrSplit;
                                                } else {
                                                    if (m12066(str)) {
                                                        strArr = strArrSplit;
                                                    } else {
                                                        AbstractC14235 abstractC14236 = c8200.f21738;
                                                        abstractC14236.getClass();
                                                        char[] charArray2 = str.toCharArray();
                                                        strArr = strArrSplit;
                                                        c2417M49585 = c22004.m49585(abstractC14236.mo17848(charArray2, charArray2.length));
                                                        if (!this.f13081.contains(c2417M49585)) {
                                                            if (z) {
                                                                c23623.m9361(EnumC21706.OPTIONS, C15675.m35721(EnumC2483.f3938, c2417M49585));
                                                            }
                                                        }
                                                        i++;
                                                        strArrSplit2 = strArr3;
                                                        strArrSplit = strArr;
                                                        c8200 = c8200;
                                                    }
                                                    i++;
                                                    strArrSplit2 = strArr3;
                                                    strArrSplit = strArr;
                                                    c8200 = c8200;
                                                }
                                                ((Set) C15525.computeIfAbsent(this.f13086, c2417M49586, new C8826(0))).add(new C11648(c2417M49585, EnumSet.of(EnumC10977.EXTRA)));
                                                i++;
                                                strArrSplit2 = strArr3;
                                                strArrSplit = strArr;
                                                c8200 = c8200;
                                            }
                                        }
                                    }
                                } else if (z) {
                                    c23623.m9354(C15675.m35721(EnumC2483.f3938, c2417M49586));
                                }
                            }
                        }
                    }
                    i3++;
                    i2 = 1;
                    strArrSplit2 = strArrSplit2;
                }
            }
        }
        C4848 c4848 = c2417.f3705;
        C4848 c4848M10279 = C4848.m10279((Iterable) C15525.getOrDefault(this.f13086, c2417, Collections.EMPTY_SET));
        c4848.getClass();
        C4848 c4848M10292 = c4848M10279.m10292(c4848);
        c2417.f3705 = c4848M10292;
        while (c4848M10292.m10293()) {
            if (!m12097().contains(((C11648) c4848M10292.f11034).f32494)) {
                C4036 c4036M41755 = this.f13093.m41755(c2417);
                if (c4036M41755 != null) {
                    InterfaceC19740 interfaceC19740M9363 = c23623.m9363(c4036M41755.f8851.f7516);
                    try {
                        AbstractC7257 abstractC7257 = c4036M41755.f8850;
                        C2417 c2419 = ((C11648) c4848M10292.f11034).f32494;
                        C14040 c14041 = C8300.f21997;
                        c23623.m9352(abstractC7257, new C14040("compiler", "module.not.found", c2419));
                        c23623.m9363(interfaceC19740M9363);
                    } catch (Throwable th) {
                        c23623.m9363(interfaceC19740M9363);
                        throw th;
                    }
                } else {
                    C1446.m31704((c2417.f20409 & 4503599627370496L) == 0);
                }
                c2417.f3705 = C4848.m10281((C11648) c4848M10292.f11034, c2417.f3705);
            }
            c4848M10292 = c4848M10292.f11035;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        Iterator it = c2417.f3705.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map = this.f13079;
            if (!zHasNext) {
                break;
            }
            C11648 c116410 = (C11648) it.next();
            final C2417 c24110 = c116410.f32494;
            c24110.mo18020();
            linkedHashSet.add(c24110);
            Set set = (Set) map.get(c24110);
            if (set == null) {
                obj = set;
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                C4848 c4848M10276of = C4848.m10276of((Object) c24110);
                while (c4848M10276of.m10293()) {
                    final C2417 c24111 = (C2417) c4848M10276of.f11034;
                    c4848M10276of = c4848M10276of.f11035;
                    if (hashSet3.add(c24111)) {
                        hashSet2.add(c24111);
                        c24111.mo18020();
                        if (c24111 != c22004.f69129) {
                            C1446.m31700(c24111.f3705, new Supplier() { // from class: l.᩷ܰ֨
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return c24111 + ".requires == null; " + c24110;
                                }
                            });
                            for (C11648 c116411 : c24111.f3705) {
                                if (c116411.f32493.contains(EnumC10977.TRANSITIVE)) {
                                    c4848M10276of = c4848M10276of.m10290(c116411.f32494);
                                }
                            }
                        } else {
                            Iterator it2 = m12097().iterator();
                            while (it2.hasNext()) {
                                c4848M10276of = c4848M10276of.m10290((C2417) it2.next());
                            }
                        }
                    }
                }
                hashSet2.remove(c24110);
                obj = hashSet2;
            }
            obj = set;
            linkedHashSet.addAll(obj);
            if (c116410.f32493.contains(EnumC10977.TRANSITIVE)) {
                hashSet.add(c24110);
                hashSet.addAll(obj);
            }
        }
        map.put(c2417, hashSet);
        m12057(c2417, linkedHashSet);
        Iterator it3 = c2417.f3697.iterator();
        while (it3.hasNext()) {
            C9794 c9794 = ((C19023) it3.next()).f56714;
            if (c9794 != null) {
                c9794.f27063 = c2417;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m12062(C5473 c5473, C2417 c2417, HashMap map, C2417 c2418, Set set) {
        if (c2417.f3698.contains(c2418)) {
            c5473.m12056(c2417, map, c2418, set);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12056(C2417 c2417, HashMap map, C2417 c2418, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C19023 c19023 = (C19023) it.next();
            C4848 c4848 = c19023.f56713;
            C9794 c9794 = c19023.f56714;
            if (c4848 == null || c4848.contains(c2417)) {
                AbstractC12224 abstractC12224 = c9794.f27059;
                C2417 c2419 = (C2417) map.get(abstractC12224);
                if (c2419 != null && c2419 != c2418) {
                    C4036 c4036M41755 = this.f13093.m41755(c2417);
                    AbstractC7257 abstractC7257 = null;
                    C23623 c23623 = this.f13091;
                    InterfaceC19740 interfaceC19740M9363 = c4036M41755 != null ? c23623.m9363(c4036M41755.f8851.f7516) : null;
                    if (c4036M41755 != null) {
                        abstractC7257 = c4036M41755.f8850;
                        abstractC7257.getClass();
                    }
                    try {
                        if (c2417.m3349()) {
                            C14040 c14040 = C8300.f21997;
                            c23623.m9352(abstractC7257, new C14040("compiler", "package.clash.from.requires.in.unnamed", abstractC12224, c2419, c2418));
                        } else {
                            C14040 c14041 = C8300.f21997;
                            c23623.m9352(abstractC7257, new C14040("compiler", "package.clash.from.requires", c2417, abstractC12224, c2419, c2418));
                        }
                        if (c4036M41755 != null) {
                            c23623.m9363(interfaceC19740M9363);
                        }
                    } catch (Throwable th) {
                        if (c4036M41755 != null) {
                            c23623.m9363(interfaceC19740M9363);
                        }
                        throw th;
                    }
                } else {
                    map.put(abstractC12224, c2418);
                    c2417.f3689.put(c9794.f27059, c9794);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX INFO: renamed from: ֫ */
    public void m12057(final C2417 c2417, HashSet hashSet) {
        String[] strArr;
        C2417 c2417M49585;
        LinkedHashMap linkedHashMap = this.f13063;
        C22004 c22004 = this.f13069;
        if (linkedHashMap == null) {
            this.f13063 = new LinkedHashMap();
            HashSet hashSet2 = new HashSet();
            String str = this.f13076;
            if (str != null) {
                Pattern patternCompile = Pattern.compile("([^/]+)/([^=]+)=(.*)");
                String[] strArrSplit = str.split("\u0000+");
                int length = strArrSplit.length;
                char c = 0;
                int i = 0;
                while (i < length) {
                    String str2 = strArrSplit[i];
                    if (str2.isEmpty()) {
                        strArr = strArrSplit;
                    } else {
                        Matcher matcher = patternCompile.matcher(str2);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            String strGroup2 = matcher.group(2);
                            String strGroup3 = matcher.group(3);
                            if (m12066(strGroup)) {
                                AbstractC14235 abstractC14235 = this.f13065.f21738;
                                C2417 c2417M49586 = c22004.m49585(abstractC14235.m32717(strGroup));
                                if (!m12077(c2417M49586, hashSet2) || !m12066(strGroup2)) {
                                    strArr = strArrSplit;
                                } else if (!this.f13094 && (c2417M49586.f20409 & 9007199254740992L) != 0) {
                                    C14040 c14040 = C8300.f21997;
                                    Object[] objArr = new Object[1];
                                    objArr[c] = c2417M49586;
                                    this.f13091.m9355(new C14040("compiler", "add.exports.with.release", objArr));
                                    strArr = strArrSplit;
                                } else {
                                    C9794 c9794M49593 = c22004.m49593(c2417M49586, abstractC14235.m32717(strGroup2));
                                    c9794M49593.f27063 = c2417M49586;
                                    C4848 c4848M10283 = C4848.m10283();
                                    String[] strArrSplit2 = strGroup3.split("[ ,]+");
                                    int length2 = strArrSplit2.length;
                                    int i2 = 0;
                                    while (i2 < length2) {
                                        String str3 = strArrSplit2[i2];
                                        String[] strArr2 = strArrSplit;
                                        if (str3.equals("ALL-UNNAMED")) {
                                            c2417M49585 = c22004.f69129;
                                        } else {
                                            if (m12066(str3)) {
                                                char[] charArray = str3.toCharArray();
                                                c2417M49585 = c22004.m49585(abstractC14235.mo17848(charArray, charArray.length));
                                                if (!m12077(c2417M49585, hashSet2)) {
                                                }
                                            }
                                            i2++;
                                            strArrSplit = strArr2;
                                        }
                                        c4848M10283 = c4848M10283.m10290(c2417M49585);
                                        i2++;
                                        strArrSplit = strArr2;
                                    }
                                    strArr = strArrSplit;
                                    ((Set) C15525.computeIfAbsent(this.f13063, c2417M49586, new C15868(6))).add(new C19023(c9794M49593, c4848M10283));
                                }
                            } else {
                                strArr = strArrSplit;
                            }
                        } else {
                            strArr = strArrSplit;
                        }
                    }
                    i++;
                    c = 0;
                    strArrSplit = strArr;
                }
            }
        }
        c2417.f3689 = new LinkedHashMap();
        c2417.f3698 = new HashSet(hashSet);
        final HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C2417 c2418 = (C2417) it.next();
            if (c2418 != c22004.f69129) {
                m12056(c2417, map, c2418, c2418.f3697);
            }
        }
        C15525.forEach(this.f13063, new BiConsumer() { // from class: l.ۢܰ֨
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                C5473.m12062(this.f32114, c2417, map, (C2417) obj, (Set) obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return C19355.$default$andThen(this, biConsumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m12077(C2417 c2417, HashSet hashSet) {
        if (this.f13081.contains(c2417)) {
            return true;
        }
        if (hashSet.contains(c2417)) {
            return false;
        }
        if (this.f13082) {
            this.f13091.m9361(EnumC21706.OPTIONS, C15675.m35721(EnumC2483.f3948, c2417));
        }
        hashSet.add(c2417);
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m12064(C5473 c5473, C5777 c5777) {
        for (AbstractC23743 abstractC23743 : c5777.f14181) {
            if (abstractC23743.m16617(EnumC19998.f60730)) {
                C13824 c13824 = (C13824) abstractC23743;
                if (c13824.f39062 != null) {
                    HashSet hashSet = new HashSet();
                    C4848 c4848M10276of = C4848.m10276of((Object) c13824.f39062.f32494);
                    while (c4848M10276of.m10293()) {
                        final C2417 c2417 = (C2417) c4848M10276of.f11034;
                        c4848M10276of = c4848M10276of.f11035;
                        if (hashSet.add(c2417)) {
                            c2417.mo18020();
                            if ((c2417.f20409 & 4503599627370496L) == 0) {
                                C1446.m31700(c2417.f3705, new Supplier() { // from class: l.ۘܰ֨
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return c2417.toString();
                                    }
                                });
                                for (C11648 c11648 : c2417.f3705) {
                                    if (!c11648.f32493.contains(EnumC10977.EXTRA)) {
                                        c4848M10276of = c4848M10276of.m10290(c11648.f32494);
                                    }
                                }
                            }
                        }
                    }
                    if (hashSet.contains(c5777.f14182)) {
                        C23623 c23623 = c5473.f13091;
                        AbstractC14355 abstractC14355 = c13824.f39063;
                        abstractC14355.getClass();
                        C2417 c2418 = c13824.f39062.f32494;
                        C14040 c14040 = C8300.f21997;
                        c23623.m9352(abstractC14355, new C14040("compiler", "cyclic.requires", c2418));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m12066(String str) {
        return EnumC5698.m12687(str, EnumC17840.m40513(this.f13075));
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m12094() {
        this.f13081 = null;
        this.f13078 = null;
        this.f13073 = null;
        this.f13071.clear();
    }

    public C5473(C5127 c5127) {
        c5127.m10906(C5473.class, this);
        this.f13091 = C23623.m52439(c5127);
        C8200 c8200M18988 = C8200.m18988(c5127);
        this.f13065 = c8200M18988;
        this.f13069 = C22004.m49577(c5127);
        this.f13090 = C11216.m25910(c5127);
        this.f13074 = C16852.m38215(c5127);
        this.f13083 = C19694.m44728(c5127);
        this.f13093 = C18318.m41754(c5127);
        this.f13089 = C8294.m19100(c5127);
        this.f13080 = C8374.m19396(c5127);
        InterfaceC13035 interfaceC13035 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        this.f13087 = interfaceC13035;
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f13075 = enumC17840M40515;
        this.f13077 = EnumC12720.m29246(c5127);
        this.f13070 = EnumC12477.f34980.m28726(enumC17840M40515);
        C13565 c13565M30871 = C13565.m30871(c5127);
        this.f13094 = c13565M30871.m30884(EnumC2483.f3969);
        this.f13082 = c13565M30871.m30881(EnumC2483.f3953, "-" + EnumC21706.OPTIONS.f68387);
        boolean zMo4108 = interfaceC13035.mo4108(EnumC22423.MODULE_SOURCE_PATH);
        this.f13067 = zMo4108;
        C18418.m41935(c5127).f55009 = zMo4108;
        C10728.m24667(c5127).f29717 = zMo4108;
        AbstractC14235 abstractC14235 = c8200M18988.f21738;
        abstractC14235.getClass();
        char[] charArray = "java.se".toCharArray();
        this.f13062 = abstractC14235.mo17848(charArray, charArray.length);
        char[] charArray2 = "java.".toCharArray();
        this.f13068 = abstractC14235.mo17848(charArray2, charArray2.length);
        this.f13076 = c13565M30871.m30873(EnumC2483.f3948);
        this.f13085 = c13565M30871.m30873(EnumC2483.f3938);
        this.f13084 = c13565M30871.m30873(EnumC2483.f3925);
        this.f13072 = c13565M30871.m30873(EnumC2483.f3920);
    }
}
