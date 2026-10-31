package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5846 extends AbstractC7963 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f17933;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Long f17934;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23360 f17935;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16372(C2319 c2319) throws IOException {
        C23360 c23360 = this.f17935;
        if (c23360 != null) {
            c2319.m7576();
            c23360.m17792(c2319);
            c23360.m17791(c2319);
            c23360.m17790(c2319);
            c2319.m7579(EnumC3730.FOUR);
        } else {
            c2319.m7581(0);
        }
        EnumC13606 enumC13606 = EnumC13606.SHARE_INFO_1_CONTAINER;
        c2319.m7581(enumC13606.m32722());
        c2319.m7581(enumC13606.m32722());
        c2319.m7576();
        c2319.m7581(0);
        c2319.m7581(0);
        c2319.m7581((int) this.f17933);
        Long l2 = this.f17934;
        if (l2 != null) {
            c2319.m7576();
            c2319.m7581((int) l2.longValue());
        } else {
            c2319.m7581(0);
        }
    }

    public AbstractC5846(C23360 c23360, Long l2) {
        super(EnumC12196.NetrShareEnum.m29669());
        this.f17935 = c23360;
        this.f17933 = 4294967295L;
        this.f17934 = l2;
    }
}
