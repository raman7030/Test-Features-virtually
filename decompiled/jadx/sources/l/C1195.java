package l;

import java.io.StringReader;
import java.util.List;

/* JADX INFO: renamed from: l.֨ܶۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38VW */
/* JADX INFO: loaded from: classes2.dex */
public final class C1195 extends AbstractC0489 {
    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ۧ */
    public final C1489 mo2160() {
        return C1489.f5329;
    }

    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ֫ */
    public final void mo2154(StringReader stringReader, String str, C10662 c10662) {
        super.mo2154(stringReader, str, c10662);
        this.f2112.add(this.f2109);
        C0056 c0056M2907 = this.f2109.m2907();
        c0056M2907.m977(EnumC19108.xml);
        c0056M2907.m976(EnumC2880.xhtml);
        c0056M2907.m978();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[LOOP:1: B:36:0x00db->B:41:0x00f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ec A[SYNTHETIC] */
    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2158(AbstractC2195 abstractC2195) {
        int size;
        C19814 c19814;
        C16430 c16430M10979;
        C19814 c19815 = null;
        switch (C5429.f16922[abstractC2195.f7214.ordinal()]) {
            case 1:
                C9251 c9251 = (C9251) abstractC2195;
                C16305 c16305M2152 = m2152(c9251.m22251(), this.f2103);
                if (c9251.m22252()) {
                    c9251.f26118.m36724(this.f2103);
                }
                C1489 c1489 = this.f2103;
                C15578 c15578 = c9251.f26118;
                c1489.m5154(c15578);
                C19814 c19816 = new C19814(c16305M2152, null, c15578);
                m2153().m45584(c19816);
                m2155((AbstractC11347) c19816, (AbstractC2195) c9251);
                if (!c9251.f26116) {
                    this.f2112.add(c19816);
                    return true;
                }
                if (!c16305M2152.m38360()) {
                    c16305M2152.m38364();
                }
                return true;
            case 2:
                C20540 c20540 = (C20540) abstractC2195;
                Object objM5156 = this.f2103.m5156(c20540.f26117);
                int size2 = this.f2112.size();
                int i = size2 + (-1) >= 256 ? size2 - 257 : 0;
                for (int size3 = this.f2112.size() - 1; size3 >= i; size3--) {
                    C19814 c19817 = (C19814) this.f2112.get(size3);
                    if (c19817.mo2915().equals(objM5156)) {
                        c19815 = c19817;
                        if (c19815 != null) {
                            for (size = this.f2112.size() - 1; size >= 0; size--) {
                                c19814 = (C19814) this.f2112.get(size);
                                this.f2112.remove(size);
                                if (c19814 == c19815) {
                                    m2156(c19814, (AbstractC2195) c20540);
                                    return true;
                                }
                            }
                        }
                        return true;
                    }
                }
                if (c19815 != null) {
                    while (size >= 0) {
                        c19814 = (C19814) this.f2112.get(size);
                        this.f2112.remove(size);
                        if (c19814 == c19815) {
                            m2156(c19814, (AbstractC2195) c20540);
                            return true;
                        }
                    }
                }
                return true;
            case 3:
                C14188 c14188 = (C14188) abstractC2195;
                C3585 c3585 = new C3585(c14188.m33849());
                if (c14188.f42827 && c3585.m10978() && (c16430M10979 = c3585.m10979()) != null) {
                    c3585 = c16430M10979;
                }
                m2153().m45584(c3585);
                m2155(c3585, c14188);
                return true;
            case 4:
                C17011 c17011 = (C17011) abstractC2195;
                String strM39895 = c17011.m39895();
                AbstractC11347 c2174 = c17011 instanceof C17717 ? new C2174(strM39895) : new C10787(strM39895);
                m2153().m45584(c2174);
                m2155(c2174, c17011);
                return true;
            case 5:
                C23361 c23361 = (C23361) abstractC2195;
                C7818 c7818 = new C7818(this.f2103.m5156(c23361.f75040.toString()), c23361.f75042.toString(), c23361.f75038.toString());
                c7818.m20902(c23361.f75039);
                m2153().m45584(c7818);
                m2155(c7818, c23361);
                return true;
            case 6:
                return true;
            default:
                throw new C14167("Unexpected token type: ".concat(String.valueOf(abstractC2195.f7214)));
        }
    }

    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ֫ */
    public final List mo2151(String str, C19814 c19814, String str2, C10662 c10662) {
        mo2154(new StringReader(str), str2, c10662);
        m2162();
        return this.f2109.m28097();
    }
}
