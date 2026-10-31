package l;

import java.util.AbstractCollection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ۢۡᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 41WV */
/* JADX INFO: loaded from: classes4.dex */
public final class C9489 extends AbstractC16543 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13273 f28824;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C4754 f28825;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C10927 f28826;

    @Override // l.AbstractC23599
    /* JADX INFO: renamed from: ֫ */
    public final String mo1729() {
        return "NewStringBytes";
    }

    public C9489(C17249 c17249, InterfaceC5276 interfaceC5276) {
        super(c17249, interfaceC5276);
        this.f28824 = new C13273("Ljava/lang/String;", "<init>", "V", Collections.singletonList("[B"));
        this.f28825 = new C4754(c17249);
        this.f50835 = EnumC11810.DIRECT;
        this.f50828 = false;
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫ */
    public final List mo3535(C17249 c17249) {
        return Collections.singletonList(this.f28824);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫ */
    public final String mo3534(C1032 c1032, C15152 c15152, C23098 c23098, int i) {
        C10927 c10927;
        int iM51289 = c23098.m51289();
        int iM51288 = c23098.m51288();
        C4754 c4754 = this.f28825;
        if (c4754.m13902(c15152, i, iM51288)) {
            List list = c15152.f46302;
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(iM51289));
            while (true) {
                if (i >= 0) {
                    AbstractC7479 abstractC7479 = (AbstractC7479) list.get(i);
                    if (C4570.m13424(abstractC7479)) {
                        if (abstractC7479.mo3975() == EnumC0841.f3221) {
                            if (hashSet.contains(Integer.valueOf(((InterfaceC1779) abstractC7479).mo1790())) && ((InterfaceC21699) ((InterfaceC10952) abstractC7479).getReference()).getType().equals("Ljava/lang/String;")) {
                                c10927 = (C10927) abstractC7479;
                                break;
                            }
                        } else {
                            if (!C4570.m13428(abstractC7479)) {
                                C12836.m31223(abstractC7479, false, new C20778(hashSet));
                            } else if (hashSet.contains(Integer.valueOf(((InterfaceC1779) abstractC7479).mo1790()))) {
                                hashSet.add(Integer.valueOf(((InterfaceC23651) abstractC7479).mo7930()));
                            }
                            if (hashSet.isEmpty() || !((AbstractCollection) abstractC7479.m20099().m37705()).isEmpty()) {
                            }
                        }
                        i--;
                    }
                }
                c10927 = null;
                break;
            }
            this.f28826 = c10927;
            if (c10927 == null) {
                C11003.toString(c1032);
                return null;
            }
            return new String(c4754.m13903());
        }
        C11003.toString(c1032);
        return null;
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int mo24326(C13925 c13925) {
        return this.f28826.mo1790();
    }

    @Override // l.AbstractC16543
    /* JADX INFO: renamed from: ֫ */
    public final void mo3536(C15152 c15152, C0336 c0336, C23098 c23098, C13925 c13925) {
        int iM37704 = this.f28826.m20099().m37704();
        C1109 c1109 = c15152.f46301;
        c1109.m3814(iM37704, c0336);
        c1109.m3815(c23098.m51283());
        this.f28825.m13901(c15152);
    }
}
