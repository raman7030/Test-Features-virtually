package p067l;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11387 extends AbstractC18091 {

    /* JADX INFO: renamed from: ۖ */
    public C14983 f31773;

    /* JADX INFO: renamed from: ۡ */
    public C6887 f31774;

    /* JADX INFO: renamed from: ܺ */
    public C12753 f31775;

    @Override // p067l.AbstractC24797
    /* JADX INFO: renamed from: ֫ */
    public final String mo4127() {
        return "NewStringBytes";
    }

    public C11387(C18762 c18762, InterfaceC7383 interfaceC7383) {
        super(c18762, interfaceC7383);
        this.f31773 = new C14983("Ljava/lang/String;", "<init>", "V", Collections.singletonList("[B"));
        this.f31774 = new C6887(c18762);
        this.f54013 = EnumC13593.DIRECT;
        this.f54006 = false;
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final List mo5822(C18762 c18762) {
        return Collections.singletonList(this.f31773);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final String mo5821(C3349 c3349, C16769 c16769, C24321 c24321, int i) {
        C12753 c12753;
        int iM53683 = c24321.m53683();
        int iM53682 = c24321.m53682();
        C6887 c6887 = this.f31774;
        if (c6887.m15782(c16769, i, iM53682)) {
            List list = c16769.f49421;
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(iM53683));
            while (true) {
                if (i >= 0) {
                    AbstractC9476 abstractC9476 = (AbstractC9476) list.get(i);
                    if (C6712.m15312(abstractC9476)) {
                        if (abstractC9476.mo6217() == EnumC3167.f5995) {
                            if (hashSet.contains(Integer.valueOf(((InterfaceC4059) abstractC9476).mo4189())) && ((InterfaceC22991) ((InterfaceC12777) abstractC9476).getReference()).getType().equals("Ljava/lang/String;")) {
                                c12753 = (C12753) abstractC9476;
                                break;
                            }
                        } else {
                            if (!C6712.m15316(abstractC9476)) {
                                C14567.m33309(abstractC9476, false, new C22116(hashSet));
                            } else if (hashSet.contains(Integer.valueOf(((InterfaceC4059) abstractC9476).mo4189()))) {
                                hashSet.add(Integer.valueOf(((InterfaceC24846) abstractC9476).mo9978()));
                            }
                            if (hashSet.isEmpty() || !((AbstractCollection) abstractC9476.m22075().m39880()).isEmpty()) {
                            }
                        }
                        i--;
                    }
                }
                c12753 = null;
                break;
            }
            this.f31775 = c12753;
            if (c12753 == null) {
                C12826.toString(c3349);
                return null;
            }
            return new String(c6887.m15783());
        }
        C12826.toString(c3349);
        return null;
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final int mo26336(C15603 c15603) {
        return this.f31775.mo4189();
    }

    @Override // p067l.AbstractC18091
    /* JADX INFO: renamed from: ֫ */
    public final void mo5823(C16769 c16769, C2688 c2688, C24321 c24321, C15603 c15603) {
        int iM39879 = this.f31775.m22075().m39879();
        C3422 c3422 = c16769.f49420;
        c3422.m6071(iM39879, c2688);
        c3422.m6072(c24321.m53677());
        this.f31774.m15781(c16769);
    }
}
