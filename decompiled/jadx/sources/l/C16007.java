package l;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ܺܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16007 extends AbstractC4203 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public C18837 f49381;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f49382;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18837 f49385;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f49384 = new HashSet();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashMap f49383 = new HashMap();

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2141(C5138 c5138, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.ARRAY)) {
            return null;
        }
        C6319 c6319 = this.f49382;
        m37818(c6319.m17515(c5138), c6319.m17515(abstractC4308));
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        AbstractC19810 abstractC19810 = c8541.f13890;
        HashMap map = this.f49383;
        AbstractC4308 abstractC4309 = (AbstractC4308) map.get(abstractC19810);
        if (abstractC4309 != null) {
            boolean zMo12924 = abstractC4309.mo12924();
            C6319 c6319 = this.f49382;
            if (zMo12924 && abstractC4308.mo12924()) {
                if (!c6319.m17546(c6319.m17513(abstractC4309), c6319.m17513(abstractC4308), true)) {
                    abstractC4308 = abstractC4309;
                }
            } else {
                if (abstractC4309.mo12922() && abstractC4308.mo12922()) {
                    if (c6319.m17546(c6319.m17511(abstractC4309), c6319.m17511(abstractC4308), true)) {
                    }
                } else if (!c6319.m17550(abstractC4309, abstractC4308)) {
                    throw new C8953();
                }
                abstractC4308 = abstractC4309;
            }
        } else {
            this.f49385.m43511(c8541);
            this.f49381.m43511(abstractC4308);
        }
        map.put(c8541.f13890, abstractC4308);
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        boolean zMo12922 = c19831.mo12922();
        C6319 c6319 = this.f49382;
        if (zMo12922) {
            m37818(c6319.m17511(c19831), c6319.m17511(abstractC4308));
            return null;
        }
        if (!c19831.mo12924()) {
            return null;
        }
        m37818(c6319.m17513(c19831), c6319.m17513(abstractC4308));
        return null;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (!abstractC4308.m12913(EnumC9454.CLASS)) {
            return null;
        }
        C2609 c2609Mo12934 = c19955.mo12934();
        C2609 c2609Mo12935 = abstractC4308.mo12934();
        if (c2609Mo12934.m8245() != c2609Mo12935.m8245()) {
            return null;
        }
        while (c2609Mo12934.m8249()) {
            m37818((AbstractC4308) c2609Mo12934.f8240, (AbstractC4308) c2609Mo12935.f8240);
            c2609Mo12934 = c2609Mo12934.f8241;
            c2609Mo12935 = c2609Mo12935.f8241;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m37818(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C8436 c8436 = new C8436(abstractC4308, abstractC4309, this.f49382);
        HashSet hashSet = this.f49384;
        if (hashSet.add(c8436)) {
            try {
                abstractC4308.mo2962(this, abstractC4309);
            } finally {
                hashSet.remove(c8436);
            }
        }
    }

    public C16007(C6319 c6319, C18837 c18837, C18837 c18838) {
        this.f49382 = c6319;
        this.f49385 = c18837;
        this.f49381 = c18838;
    }
}
