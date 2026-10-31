package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۜ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: C420 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7031 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashMap f21676 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18998(AbstractC5698 abstractC5698) {
        AbstractC10370 abstractC10370Mo960 = abstractC5698.mo960();
        HashMap map = this.f21676;
        C2609 c2609M8239 = (C2609) map.get(abstractC10370Mo960);
        if (c2609M8239 == null) {
            c2609M8239 = C2609.m8239();
        }
        if (c2609M8239.contains(abstractC5698)) {
            return;
        }
        map.put(abstractC10370Mo960, c2609M8239.m8242(abstractC5698));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m18999(AbstractC5698 abstractC5698) {
        C2609 c2609;
        String string = abstractC5698.mo16076().toString();
        if (abstractC5698.f17560.mo5146() || abstractC5698.f17560.mo12941() || !((c2609 = (C2609) this.f21676.get(abstractC5698.mo960())) == null || (c2609.m8245() == 1 && c2609.contains(abstractC5698)))) {
            return string;
        }
        C2609 c2609M8239 = C2609.m8239();
        while (true) {
            AbstractC4308 abstractC4308 = abstractC5698.f17560;
            EnumC9454 enumC9454 = EnumC9454.CLASS;
            if (!abstractC4308.m12913(enumC9454) || !abstractC5698.f17560.mo4958().m12913(enumC9454) || abstractC5698.f17561.f17559 != EnumC1296.f4582) {
                break;
            }
            AbstractC10370 abstractC10370Mo960 = abstractC5698.mo960();
            c2609M8239.getClass();
            C2609 c26010 = new C2609(abstractC10370Mo960, c2609M8239);
            abstractC5698 = abstractC5698.f17561;
            c2609M8239 = c26010;
        }
        AbstractC10370 abstractC10370Mo961 = abstractC5698.mo960();
        c2609M8239.getClass();
        C2609<AbstractC10370> c26011 = new C2609(abstractC10370Mo961, c2609M8239);
        StringBuilder sb = new StringBuilder();
        String str = "";
        for (AbstractC10370 abstractC10370 : c26011) {
            sb.append(str);
            sb.append((CharSequence) abstractC10370);
            str = ".";
        }
        return sb.toString();
    }
}
