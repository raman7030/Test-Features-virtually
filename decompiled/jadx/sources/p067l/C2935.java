package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes2.dex */
public final class C2935 {

    /* JADX INFO: renamed from: ֫ */
    public final C15919 f5095;

    /* JADX INFO: renamed from: ۜ */
    public C4848 f5096;

    /* JADX INFO: renamed from: ۡ */
    public C4848 f5097;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ C3606 f5098;

    /* JADX INFO: renamed from: ۧ */
    public final C4803 f5099;

    /* JADX INFO: renamed from: ܳ */
    public C4848 f5100;

    /* JADX INFO: renamed from: ܺ */
    public Set f5101;

    /* JADX INFO: renamed from: ܽ */
    public LinkedHashSet f5102;

    /* JADX INFO: renamed from: ܿ */
    public HashMap f5103;

    /* JADX INFO: renamed from: ᩳ */
    public final C7530 f5104;

    /* JADX INFO: renamed from: ᩷ */
    public C4848 f5105;

    /* JADX INFO: renamed from: ᩻ */
    public final int f5106;

    public C2935(C3606 c3606, int i, Set set, C7530 c7530) {
        this.f5098 = c3606;
        this.f5099 = new C4803(1);
        this.f5095 = new C15919(1);
        this.f5106 = i;
        if (i != 1) {
            C7530 c7531 = new C7530(c3606.f7409, null);
            this.f5104 = c7531;
            c3606.f7435.m15228(c7531);
        } else {
            C1446.m31699(c7530);
            this.f5104 = c7530;
        }
        this.f5097 = C4848.m10283();
        this.f5096 = C4848.m10283();
        this.f5100 = C4848.m10283();
        this.f5101 = set;
    }

    public C2935(C3606 c3606, C4848 c4848, C4848 c4849, Set set, C7530 c7530) {
        this(c3606, 1, set, c7530);
        this.f5105 = c4848;
        this.f5103 = new HashMap();
        this.f5097 = C3606.m6741(c3606, c4848).m10292(c4849.m10294());
        this.f5096 = C3606.m6727(c3606, c4848);
        C4848 c4848M10283 = C4848.m10283();
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            C3626 c3626 = (C3626) it.next();
            if (c3626.f7516.mo23288("module-info", EnumC18398.SOURCE) && c3626.f7509.m10293()) {
                for (AbstractC7257 abstractC7257 : c3626.f7509) {
                    if (!abstractC7257.m16617(EnumC19998.f60715)) {
                        if (!abstractC7257.m16617(EnumC19998.f60778)) {
                            break;
                        }
                        c4848M10283 = c4848M10283.m10290(c3626.f7510);
                        break;
                    }
                }
            }
        }
        this.f5100 = c4848M10283.m10294();
        m4816();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C2935 m4812(LinkedHashSet linkedHashSet, LinkedHashMap linkedHashMap) {
        int i = this.f5106 + 1;
        Set set = this.f5101;
        C3606 c3606 = this.f5098;
        C2935 c2935 = new C2935(c3606, i, set, null);
        m4811();
        HashMap map = this.f5103;
        c2935.f5103 = map;
        C4848 c4848M15217 = c3606.f7435.m15217((Set) linkedHashSet, true);
        C4848 c4848 = this.f5105;
        c4848.getClass();
        C4848 c4848M10292 = c4848M15217.m10292(c4848);
        c2935.f5105 = c4848M10292;
        if (c2935.m4817()) {
            c3606.f7435.m15232(C4848.m10283());
            return c2935;
        }
        c3606.f7435.m15232(c4848M10292);
        c2935.f5105 = c4848M10292;
        c2935.m4810(map);
        C4848<C15828> c4848M4810 = c2935.m4810(linkedHashMap);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            ((Map) C15525.computeIfAbsent(c2935.f5103, (C2417) entry.getKey(), new C9325(1))).putAll((Map) entry.getValue());
        }
        c2935.f5098.f7435.m15226(c2935.f5105);
        if (c2935.m4817()) {
            return c2935;
        }
        C4848 c4848M6741 = C3606.m6741(c3606, c4848M15217);
        C4848 c4848M10283 = C4848.m10283();
        for (C15828 c15828 : c4848M4810) {
            if (!c15828.f45854.mo23288("package-info", EnumC18398.CLASS) || c15828.m18008().f27062 != c15828) {
                c4848M10283 = c4848M10283.m10290(c15828);
            }
        }
        C4848 c4848M10294 = c4848M10283.m10294();
        c4848M6741.getClass();
        c2935.f5097 = c4848M10294.m10292(c4848M6741);
        C4848 c4848M6727 = C3606.m6727(c3606, c4848M15217);
        C4848 c4848M10284 = C4848.m10283();
        for (C15828 c15829 : c4848M4810) {
            if (c15829.f45854.mo23288("package-info", EnumC18398.CLASS) && c15829.m18008().f27062 == c15829) {
                c4848M10284 = c4848M10284.m10290((C9794) c15829.f20407);
            }
        }
        C4848 c4848M10295 = c4848M10284.m10294();
        c4848M6727.getClass();
        c2935.f5096 = c4848M10295.m10292(c4848M6727);
        c2935.f5100 = C4848.m10283();
        c2935.m4816();
        return c2935;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4813() {
        m4811();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m4817() {
        C3606 c3606 = this.f5098;
        if (c3606.f7422.f56731 > 0) {
            return true;
        }
        for (C18258 c18258 : (C20271) this.f5104.m17427()) {
            int i = C22383.f70611[c18258.mo31352().ordinal()];
            if (i == 1) {
                if (c3606.f7428) {
                    return true;
                }
            } else if (i == 2 && (c3606.f7415 || !c18258.m41582(EnumC21417.RECOVERABLE))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m4816() {
        C11654 c11654 = new C11654(this.f5098.f7424);
        this.f5102 = new LinkedHashSet();
        Iterator it = this.f5097.iterator();
        while (it.hasNext()) {
            c11654.m26788((InterfaceC13745) it.next(), (Set) this.f5102);
        }
        Iterator it2 = this.f5096.iterator();
        while (it2.hasNext()) {
            c11654.m26788((InterfaceC13745) it2.next(), (Set) this.f5102);
        }
        Iterator it3 = this.f5100.iterator();
        while (it3.hasNext()) {
            c11654.m26788((InterfaceC13745) it3.next(), (Set) this.f5102);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C4848 m4810(HashMap map) {
        C15828 c15828M49587;
        C4848 c4848M10283 = C4848.m10283();
        for (Map.Entry entry : map.entrySet()) {
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                C3606 c3606 = this.f5098;
                C8200 c8200 = c3606.f7432;
                AbstractC12224 abstractC12224M32717 = c8200.f21738.m32717((String) entry2.getKey());
                InterfaceC19740 interfaceC19740 = (InterfaceC19740) entry2.getValue();
                EnumC18398 enumC18398Mo23287 = interfaceC19740.mo23287();
                EnumC18398 enumC18398 = EnumC18398.CLASS;
                if (enumC18398Mo23287 != enumC18398) {
                    throw new AssertionError(interfaceC19740);
                }
                if (interfaceC19740.mo23288("package-info", enumC18398)) {
                    C9794 c9794M49593 = c3606.f7433.m49593((C2417) entry.getKey(), abstractC12224M32717.m28201(0, abstractC12224M32717.m28199((byte) 46)));
                    if (c9794M49593.f27062 == null) {
                        c9794M49593.f27062 = c3606.f7433.m49588((C2417) entry.getKey(), C14514.m33177(abstractC12224M32717), c9794M49593);
                    }
                    c15828M49587 = c9794M49593.f27062;
                    c15828M49587.m35949();
                    if (c15828M49587.f45854 == null) {
                        c15828M49587.f45854 = interfaceC19740;
                    }
                    c15828M49587.f20410 = c3606.f7426;
                } else {
                    c15828M49587 = c3606.f7433.m49587((C2417) entry.getKey(), abstractC12224M32717);
                    c15828M49587.m35949();
                    c15828M49587.f45854 = interfaceC19740;
                    c15828M49587.f20410 = c3606.f7426;
                    AbstractC7783 abstractC7783 = c15828M49587.f20407;
                    if (abstractC7783.f20405 == EnumC3600.f7351) {
                        abstractC7783.mo17983().mo28415(c15828M49587);
                    }
                }
                c4848M10283 = c4848M10283.m10290(c15828M49587);
            }
        }
        return c4848M10283.m10294();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4815(boolean z, boolean z2) {
        C7530 c7530 = this.f5104;
        C4848 c4848 = this.f5097;
        C3606 c3606 = this.f5098;
        boolean z3 = c3606.f7416;
        C23623 c23623 = c3606.f7409;
        if (z3 || c3606.f7418) {
            C4848 c4848M10283 = z ? C4848.m10283() : c4848;
            Object obj = z ? Collections.EMPTY_SET : this.f5102;
            c23623.m52458("x.print.rounds", Integer.valueOf(this.f5106), "{" + c4848M10283.m10285(", ") + C0249l.f1198d, obj, Boolean.valueOf(z));
        }
        if (!c3606.f7434.m53034()) {
            c3606.f7434.m53035(new C21925(EnumC8513.ANNOTATION_PROCESSING_ROUND));
        }
        try {
            if (z) {
                c3606.f7439.getClass();
                C10312 c10312 = new C10312(true, z2, Collections.EMPTY_SET, c3606);
                C17687 c17687 = c3606.f7425;
                c17687.getClass();
                for (C21042 c21042 : c17687.f52827) {
                    if (c21042.f66019) {
                        C3606.m6731(c17687.f52826, c21042.f66020, c10312);
                    }
                }
            } else {
                C3606.m6730(c3606, this.f5102, c4848, this.f5096, this.f5100);
            }
            if (c3606.f7434.m53034()) {
                return;
            }
            c3606.f7434.m53033(new C21925(EnumC8513.ANNOTATION_PROCESSING_ROUND));
        } catch (Throwable th) {
            try {
                c7530.m17428(new C15919(1));
                c23623.m52452(c7530);
                c3606.f7435.m15228((C7530) null);
                throw th;
            } catch (Throwable th2) {
                if (!c3606.f7434.m53034()) {
                    c3606.f7434.m53033(new C21925(EnumC8513.ANNOTATION_PROCESSING_ROUND));
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4814(boolean z) {
        Predicate predicate;
        if (z) {
            predicate = this.f5095;
        } else {
            predicate = this.f5099;
        }
        C7530 c7530 = this.f5104;
        c7530.m17428(predicate);
        C3606 c3606 = this.f5098;
        c3606.f7409.m52452(c7530);
        c3606.f7435.m15228((C7530) null);
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m4811() {
        Set set;
        C3606 c3606 = this.f5098;
        Iterator it = c3606.f7421.m35246().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            set = this.f5101;
            if (!zHasNext) {
                break;
            } else {
                set.add(((C4036) it.next()).f8851);
            }
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            c3606.f7407.mo12739((C3626) it2.next());
        }
        c3606.f7438.m38276();
        c3606.f7421.m35245();
        c3606.f7439.m41796();
        c3606.f7422.f56731 = 0;
        c3606.f7435.m15236();
        c3606.f7430.m12094();
        c3606.f7414.m19439();
        c3606.f7437.m34517();
        c3606.f7424.m50658();
        C22004 c22004 = c3606.f7433;
        c22004.getClass();
        Iterator itM52115 = C23428.m52115(c22004.f69199.values(), new C13026(5));
        while (itM52115.hasNext()) {
            if (((C15828) itM52115.next()).f20405 == EnumC3600.f7353) {
                C22004 c22005 = c3606.f7433;
                c22005.getClass();
                Iterator itM52116 = C23428.m52115(c22005.f69199.values(), new C13026(5));
                while (itM52116.hasNext()) {
                    C15828 c15828 = (C15828) itM52116.next();
                    if (c15828.f45854 != null || c15828.f20405 == EnumC3600.f7353) {
                        EnumC3600 enumC3600 = c15828.f20405;
                        c15828.m35949();
                        if (enumC3600 == EnumC3600.f7353) {
                            c15828.f20406 = new C21333(c15828, c15828.f20406.mo7201(), null);
                        }
                        if (c15828.f20410.mo9173()) {
                            c15828.f20410 = c3606.f7426;
                        }
                    }
                }
                return;
            }
        }
    }
}
