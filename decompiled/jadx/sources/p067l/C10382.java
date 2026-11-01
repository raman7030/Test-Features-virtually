package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10382 extends AbstractC23793 {

    /* JADX INFO: renamed from: ۘ */
    public final String f28738;

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo5057(C10738 c10738) {
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5058(C10738 c10738) {
        return false;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo5060() {
        return false;
    }

    public C10382(String str, EnumC8055 enumC8055, boolean z, int i, String str2) {
        super(str, EnumC13420.TYPE_PTR, enumC8055, z, i);
        this.f28738 = str2;
    }

    @Override // p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo24081(AbstractC15351 abstractC15351) {
        return super.mo24081(abstractC15351) && (abstractC15351 instanceof C10382) && mo5059((C10382) abstractC15351);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final void mo5056(C19099 c19099) {
        c19099.m43389(this.f28738);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo5059(AbstractC23793 abstractC23793) {
        if (!(abstractC23793 instanceof C10382)) {
            return false;
        }
        String str = ((C10382) abstractC23793).f28738;
        String str2 = this.f28738;
        if (str2 != null || str == null) {
            return str2.equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final String m24082() {
        return this.f28738;
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C21467 mo5054(boolean z) {
        boolean zM34941 = m34941();
        String str = this.f28738;
        if (!zM34941) {
            EnumC14011 enumC14011 = EnumC14011.Domain;
            HashMap map = this.f43820;
            if (((String) map.get(enumC14011)).endsWith("in-addr.arpa") || ((String) map.get(enumC14011)).endsWith("ip6.arpa")) {
                return new C21467(C21562.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            if (m34949()) {
                return new C21467(C21562.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            HashMap mapM15319 = C6714.m15319(str);
            EnumC14011 enumC14012 = EnumC14011.Subtype;
            mapM15319.put(enumC14012, (String) C21562.unmodifiableMap(map).get(enumC14012));
            return new C21467(str, mapM15319, z);
        }
        return new C21467(C6714.m15319(str), 0, 0, 0, z, null);
    }

    @Override // p067l.AbstractC23793
    /* JADX INFO: renamed from: ֫ */
    public final C16771 mo5053(C10738 c10738) {
        C21467 c21467Mo5054 = mo5054(false);
        c21467Mo5054.m48642(c10738);
        String strMo27466 = c21467Mo5054.mo27466();
        return new C16771(c10738, strMo27466, C10738.m24680(strMo27466, this.f28738), c21467Mo5054);
    }

    @Override // p067l.AbstractC23793, p067l.AbstractC15351
    /* JADX INFO: renamed from: ֫ */
    public final void mo5055(StringBuilder sb) {
        super.mo5055(sb);
        sb.append(" alias: '");
        String str = this.f28738;
        sb.append(str != null ? str.toString() : "null");
        sb.append('\'');
    }
}
