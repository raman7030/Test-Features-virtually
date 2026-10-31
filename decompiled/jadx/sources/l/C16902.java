package l;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽ᩸֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final class C16902 extends AbstractC4203 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6319 f51949;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17545 f51952;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public HashMap f51951 = new HashMap();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public HashSet f51950 = new HashSet();

    @Override // l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2140(Object obj, AbstractC4308 abstractC4308) {
        if (this.f51952 == null) {
            this.f51952 = new C17545(this.f51949.f19609.f66475);
        }
        return this.f51952;
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2142(C8541 c8541, Object obj) {
        return (C17545) c8541.mo12939().mo2962(this, (Object) null);
    }

    @Override // l.AbstractC8247, l.InterfaceC21242
    /* JADX INFO: renamed from: ֫ */
    public final Object mo2145(C19955 c19955, Object obj) {
        C6319 c6319 = this.f51949;
        HashMap map = this.f51951;
        AbstractC19810 abstractC19810 = c19955.f13890;
        HashSet hashSet = this.f51950;
        if (!hashSet.add(abstractC19810)) {
            return new C17545(c19955.f13890);
        }
        try {
            hashSet.add(c19955.f13890);
            C14163 c14163 = (C14163) c19955.f13890;
            C17545 c17545 = (C17545) map.get(c14163);
            if (c17545 == null) {
                c17545 = new C17545(c14163);
                Iterator it = c6319.m17510(c19955).iterator();
                while (it.hasNext()) {
                    c17545.m41026((AbstractC7667) ((AbstractC4308) it.next()).mo2962(this, (Object) null));
                }
                c17545.m41026((AbstractC7667) c6319.m17562(c19955).mo2962(this, (Object) null));
                c14163.mo16101();
                c17545.m41026(c14163.f42762);
                map.put(c14163, c17545);
            }
            return c17545;
        } finally {
            hashSet.remove(c19955.f13890);
        }
    }

    public C16902(C6319 c6319) {
        this.f51949 = c6319;
    }
}
