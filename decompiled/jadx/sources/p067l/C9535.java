package p067l;

import com.tencent.p062mm.opensdk.constants.ConstantsAPI;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes3.dex */
public final class C9535 {

    /* JADX INFO: renamed from: ֫ */
    public WeakHashMap f26218 = new WeakHashMap();

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C8374 f26219;

    public C9535(C8374 c8374) {
        this.f26219 = c8374;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C5771 m22233(C5771 c5771, AbstractC21195 abstractC21195, boolean z, Predicate predicate) {
        WeakHashMap weakHashMap = this.f26218;
        SoftReference softReference = (SoftReference) weakHashMap.get(c5771);
        C5771 c5772 = null;
        Map map = softReference != null ? (Map) softReference.get() : null;
        if (map == null) {
            map = new HashMap();
            weakHashMap.put(c5771, new SoftReference(map));
        }
        C15569 c15569 = (C15569) map.get(abstractC21195);
        AbstractC6462 abstractC6462 = abstractC21195.f20406;
        C8374 c8374 = this.f26219;
        C19043 c19043M19438 = c8374.m19438(abstractC6462, true);
        if (c15569 != null) {
            int iMo29925 = c19043M19438.mo29925();
            if (c15569.f44488 == predicate && c15569.f44487 == z && c15569.f44489 == iMo29925) {
                return c15569.f44486;
            }
        }
        AbstractC6462 abstractC6462M19502 = abstractC21195.f20406;
        while (true) {
            if (!abstractC6462M19502.m14777(EnumC11353.CLASS) && !abstractC6462M19502.m14777(EnumC11353.TYPEVAR)) {
                break;
            }
            AbstractC6462 abstractC6462M19466 = c8374.m19466(abstractC6462M19502, false);
            AbstractC15689 abstractC15689Mo17983 = abstractC6462M19466.f16705.mo17983();
            AbstractC12224 abstractC12224 = c5771.f20408;
            abstractC15689Mo17983.getClass();
            AbstractC7783 abstractC7783 = null;
            for (AbstractC7783 abstractC7784 : abstractC15689Mo17983.mo22457(abstractC12224, predicate, EnumC3620.RECURSIVE)) {
                if (abstractC7784 != null && abstractC7784.mo12938(c5771, abstractC21195, c8374, z)) {
                    if ((abstractC7784.mo18003() & ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLS) == 0) {
                        abstractC7783 = abstractC7784;
                        break;
                    }
                    abstractC7783 = abstractC7784;
                }
            }
            if (abstractC7783 == null) {
                abstractC6462M19502 = c8374.m19502(abstractC6462M19466);
            } else {
                c5772 = (C5771) abstractC7783;
                break;
            }
        }
        map.put(abstractC21195, new C15569(c5772, predicate, z, c19043M19438.mo29925()));
        return c5772;
    }
}
