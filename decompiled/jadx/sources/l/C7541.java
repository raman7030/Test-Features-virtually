package l;

import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C7541 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakHashMap f23305 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f23306;

    public C7541(C6319 c6319) {
        this.f23306 = c6319;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3581 m20257(C3581 c3581, AbstractC19810 abstractC19810, boolean z, Predicate predicate) {
        WeakHashMap weakHashMap = this.f23305;
        SoftReference softReference = (SoftReference) weakHashMap.get(c3581);
        C3581 c3582 = null;
        Map map = softReference != null ? (Map) softReference.get() : null;
        if (map == null) {
            map = new HashMap();
            weakHashMap.put(c3581, new SoftReference(map));
        }
        C13890 c13890 = (C13890) map.get(abstractC19810);
        AbstractC4308 abstractC4308 = abstractC19810.f17560;
        C6319 c6319 = this.f23306;
        C17545 c17545M17498 = c6319.m17498(abstractC4308, true);
        if (c13890 != null) {
            int iMo27864 = c17545M17498.mo27864();
            if (c13890.f41407 == predicate && c13890.f41406 == z && c13890.f41408 == iMo27864) {
                return c13890.f41405;
            }
        }
        AbstractC4308 abstractC4308M17562 = abstractC19810.f17560;
        while (true) {
            if (!abstractC4308M17562.m12913(EnumC9454.CLASS) && !abstractC4308M17562.m12913(EnumC9454.TYPEVAR)) {
                break;
            }
            AbstractC4308 abstractC4308M17526 = c6319.m17526(abstractC4308M17562, false);
            AbstractC14016 abstractC14016Mo16064 = abstractC4308M17526.f13890.mo16064();
            AbstractC10370 abstractC10370 = c3581.f17562;
            abstractC14016Mo16064.getClass();
            AbstractC5698 abstractC5698 = null;
            for (AbstractC5698 abstractC5699 : abstractC14016Mo16064.mo20477(abstractC10370, predicate, EnumC1317.RECURSIVE)) {
                if (abstractC5699 != null && abstractC5699.mo10962(c3581, abstractC19810, c6319, z)) {
                    if ((abstractC5699.mo16084() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                        abstractC5698 = abstractC5699;
                        break;
                    }
                    abstractC5698 = abstractC5699;
                }
            }
            if (abstractC5698 == null) {
                abstractC4308M17562 = c6319.m17562(abstractC4308M17526);
            } else {
                c3582 = (C3581) abstractC5698;
                break;
            }
        }
        map.put(abstractC19810, new C13890(c3582, predicate, z, c17545M17498.mo27864()));
        return c3582;
    }
}
