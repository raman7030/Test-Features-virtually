package p067l;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡᩳ */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public class C1290 implements InterfaceC18749 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ String f30340;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ AbstractC1920 f30341;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ AbstractC1815 f30342;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC1885 f30343;

    public C1290(AbstractC1815 abstractC1815, String str, InterfaceC1885 interfaceC1885, AbstractC1920 abstractC1920) {
        this.f30342 = abstractC1815;
        this.f30340 = str;
        this.f30343 = interfaceC1885;
        this.f30341 = abstractC1920;
    }

    @Override // p067l.InterfaceC18749
    /* JADX INFO: renamed from: ֫ */
    public final void mo4562(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        AbstractC1815 abstractC1815 = this.f30342;
        Bundle bundle = abstractC1815.f65962;
        HashMap map = abstractC1815.f65960;
        HashMap map2 = abstractC1815.f65964;
        boolean zEquals = EnumC24133.ON_START.equals(enumC24133);
        String str = this.f30340;
        if (zEquals) {
            AbstractC1920 abstractC1920 = this.f30341;
            InterfaceC1885 interfaceC1885 = this.f30343;
            map.put(str, new C1045(abstractC1920, interfaceC1885));
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                interfaceC1885.mo7780(obj);
            }
            C1185 c1185 = (C1185) bundle.getParcelable(str);
            if (c1185 != null) {
                bundle.remove(str);
                interfaceC1885.mo7780(abstractC1920.mo5144(c1185.m20658(), c1185.m20659()));
                return;
            }
            return;
        }
        if (EnumC24133.ON_STOP.equals(enumC24133)) {
            map.remove(str);
        } else if (EnumC24133.ON_DESTROY.equals(enumC24133)) {
            abstractC1815.m47356(str);
        }
    }
}
