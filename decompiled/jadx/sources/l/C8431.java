package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۠᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C9Z9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8431 extends AbstractC22542 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final String f25825;

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2718(C8806 c8806) {
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2719(C8806 c8806) {
        return false;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2721() {
        return false;
    }

    public C8431(String str, EnumC5983 enumC5983, boolean z, int i, String str2) {
        super(str, EnumC11628.TYPE_PTR, enumC5983, z, i);
        this.f25825 = str2;
    }

    @Override // l.AbstractC13660
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo22112(AbstractC13660 abstractC13660) {
        return super.mo22112(abstractC13660) && (abstractC13660 instanceof C8431) && mo2720((C8431) abstractC13660);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final void mo2717(C17603 c17603) {
        c17603.m41143(this.f25825);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo2720(AbstractC22542 abstractC22542) {
        if (!(abstractC22542 instanceof C8431)) {
            return false;
        }
        String str = ((C8431) abstractC22542).f25825;
        String str2 = this.f25825;
        if (str2 != null || str == null) {
            return str2.equals(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final String m22113() {
        return this.f25825;
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C20095 mo2715(boolean z) {
        boolean zM32826 = m32826();
        String str = this.f25825;
        if (!zM32826) {
            EnumC12250 enumC12250 = EnumC12250.Domain;
            HashMap map = this.f40739;
            if (((String) map.get(enumC12250)).endsWith("in-addr.arpa") || ((String) map.get(enumC12250)).endsWith("ip6.arpa")) {
                return new C20095(C20195.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            if (m32834()) {
                return new C20095(C20195.unmodifiableMap(map), 0, 0, 0, z, null);
            }
            HashMap mapM13431 = C4572.m13431(str);
            EnumC12250 enumC12251 = EnumC12250.Subtype;
            mapM13431.put(enumC12251, (String) C20195.unmodifiableMap(map).get(enumC12251));
            return new C20095(str, mapM13431, z);
        }
        return new C20095(C4572.m13431(str), 0, 0, 0, z, null);
    }

    @Override // l.AbstractC22542
    /* JADX INFO: renamed from: ֫ */
    public final C15154 mo2714(C8806 c8806) {
        C20095 c20095Mo2715 = mo2715(false);
        c20095Mo2715.m46326(c8806);
        String strMo25446 = c20095Mo2715.mo25446();
        return new C15154(c8806, strMo25446, C8806.m22710(strMo25446, this.f25825), c20095Mo2715);
    }

    @Override // l.AbstractC22542, l.AbstractC13660
    /* JADX INFO: renamed from: ֫ */
    public final void mo2716(StringBuilder sb) {
        super.mo2716(sb);
        sb.append(" alias: '");
        String str = this.f25825;
        sb.append(str != null ? str.toString() : "null");
        sb.append('\'');
    }
}
