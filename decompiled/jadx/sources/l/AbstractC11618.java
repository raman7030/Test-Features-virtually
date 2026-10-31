package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۨۢ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G7LX */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11618 extends AbstractC1719 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo28512(AbstractC0764 abstractC0764, C2609 c2609, boolean z, AbstractC4308 abstractC4308);

    @Override // l.AbstractC1719
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7715 mo5771(C9791 c9791) {
        AbstractC12612 abstractC12612 = c9791.f29619;
        AbstractC12612 abstractC12613 = c9791.f29618;
        C2609 c2609M8239 = C2609.m8239();
        C2609 c2609M5768 = AbstractC1719.m5768(abstractC12612);
        c2609M8239.getClass();
        C2609 c2609M8248 = c2609M5768.m8248(c2609M8239);
        C2609 c2609M5769 = AbstractC1719.m5768(abstractC12613);
        c2609M8248.getClass();
        C2609 c2609M8249 = c2609M5769.m8248(c2609M8248);
        AbstractC12612 abstractC12614 = c9791.f29619;
        AbstractC7715 abstractC7715M32350 = this.f5949.m32350(abstractC12614.f16086, abstractC12614);
        abstractC7715M32350.mo17361();
        abstractC7715M32350.mo5817();
        mo28512(c9791, c2609M8249, false, c9791.f16086);
        return abstractC7715M32350;
    }

    @Override // l.AbstractC1719
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7715 mo5770(C9085 c9085) {
        AbstractC12612 abstractC12612 = c9085.f27533;
        AbstractC12612 abstractC12613 = c9085.f27532;
        C2609 c2609M8239 = C2609.m8239();
        C2609 c2609M5768 = AbstractC1719.m5768(abstractC12612);
        c2609M8239.getClass();
        C2609 c2609M8248 = c2609M5768.m8248(c2609M8239);
        C2609 c2609M5769 = AbstractC1719.m5768(abstractC12613);
        c2609M8248.getClass();
        mo28512(c9085, c2609M5769.m8248(c2609M8248), true, c9085.f16086);
        return this.f5949.m32366().m34468(this.f5951.f66533);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2609 m28511(C2609 c2609) {
        C18837 c18837 = new C18837();
        C18837 c18838 = new C18837();
        Iterator it = c2609.iterator();
        int i = 0;
        while (it.hasNext()) {
            AbstractC5144 abstractC5144 = (AbstractC5144) it.next();
            int i2 = (abstractC5144.f16086.mo3258() == EnumC9454.LONG || abstractC5144.f16086.mo3258() == EnumC9454.DOUBLE) ? 2 : 1;
            if (i + i2 >= 200) {
                c18837.m43511((Object) c18838.m43517());
                c18838.clear();
                i = 0;
            }
            c18838.m43511(abstractC5144);
            i += i2;
        }
        if (!c18838.isEmpty()) {
            c18837.m43511((Object) c18838.m43517());
        }
        return c18837.m43517();
    }
}
