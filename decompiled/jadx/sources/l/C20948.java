package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩷ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20948 extends AbstractC13374 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashSet f67708 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f67709;

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        AbstractC4308 abstractC4309 = (AbstractC4308) obj;
        if (abstractC4309.m12913(EnumC9454.WILDCARD)) {
            return (Boolean) m21837(abstractC4308, abstractC4309);
        }
        return Boolean.valueOf(m47762(abstractC4308, abstractC4309) || m47762(abstractC4309, abstractC4308));
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2144(C19831 c19831, Object obj) {
        boolean zM17545;
        AbstractC4308 abstractC4308 = (AbstractC4308) obj;
        if (c19831.mo12944()) {
            return Boolean.FALSE;
        }
        if (!abstractC4308.m12913(EnumC9454.WILDCARD)) {
            if (c19831.mo12922()) {
                return Boolean.valueOf(m47762(abstractC4308, c19831.f64066));
            }
            return Boolean.valueOf(m47762(c19831.f64066, abstractC4308));
        }
        if (abstractC4308.mo12944()) {
            return Boolean.FALSE;
        }
        boolean zMo12922 = c19831.mo12922();
        C6319 c6319 = this.f67709;
        if (zMo12922) {
            if (abstractC4308.mo12922()) {
                AbstractC4308 abstractC4309 = c19831.f64066;
                AbstractC4308 abstractC4308M17511 = c6319.m17511(abstractC4308);
                C8436 c8436 = new C8436(abstractC4309, abstractC4308M17511, c6319);
                HashSet hashSet = this.f67708;
                if (hashSet.add(c8436)) {
                    try {
                        zM17545 = c6319.m17545(abstractC4309, abstractC4308M17511, c6319.f19598);
                    } finally {
                        hashSet.remove(c8436);
                    }
                } else {
                    zM17545 = true;
                }
                return Boolean.valueOf(!zM17545);
            }
            if (abstractC4308.mo12924()) {
                return Boolean.valueOf(m47762(c6319.m17513(abstractC4308), c19831.f64066));
            }
        } else if (c19831.mo12924() && abstractC4308.mo12922()) {
            return Boolean.valueOf(m47762(c19831.f64066, c6319.m17511(abstractC4308)));
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m47762(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C6319 c6319 = this.f67709;
        C8436 c8436 = new C8436(abstractC4308, abstractC4309, c6319);
        HashSet hashSet = this.f67708;
        if (!hashSet.add(c8436)) {
            return false;
        }
        try {
            return c6319.m17566(abstractC4308, abstractC4309);
        } finally {
            hashSet.remove(c8436);
        }
    }

    public C20948(C6319 c6319) {
        this.f67709 = c6319;
    }
}
