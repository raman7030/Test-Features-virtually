package l;

import android.os.Bundle;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YB7L */
/* JADX INFO: loaded from: classes4.dex */
public class C9035 implements InterfaceC17236 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f27403;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC21735 f27404;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC19619 f27405;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21030 f27406;

    public C9035(AbstractC19619 abstractC19619, String str, InterfaceC21030 interfaceC21030, AbstractC21735 abstractC21735) {
        this.f27405 = abstractC19619;
        this.f27403 = str;
        this.f27406 = interfaceC21030;
        this.f27404 = abstractC21735;
    }

    @Override // l.InterfaceC17236
    /* JADX INFO: renamed from: ֫ */
    public final void mo2195(InterfaceC23586 interfaceC23586, EnumC22901 enumC22901) {
        AbstractC19619 abstractC19619 = this.f27405;
        Bundle bundle = abstractC19619.f63341;
        HashMap map = abstractC19619.f63339;
        HashMap map2 = abstractC19619.f63343;
        boolean zEquals = EnumC22901.ON_START.equals(enumC22901);
        String str = this.f27403;
        if (zEquals) {
            AbstractC21735 abstractC21735 = this.f27404;
            InterfaceC21030 interfaceC21030 = this.f27406;
            map.put(str, new C4096(abstractC21735, interfaceC21030));
            if (map2.containsKey(str)) {
                Object obj = map2.get(str);
                map2.remove(str);
                interfaceC21030.mo5550(obj);
            }
            C6918 c6918 = (C6918) bundle.getParcelable(str);
            if (c6918 != null) {
                bundle.remove(str);
                interfaceC21030.mo5550(abstractC21735.mo2799(c6918.m18709(), c6918.m18710()));
                return;
            }
            return;
        }
        if (EnumC22901.ON_STOP.equals(enumC22901)) {
            map.remove(str);
        } else if (EnumC22901.ON_DESTROY.equals(enumC22901)) {
            abstractC19619.m45060(str);
        }
    }
}
