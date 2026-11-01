package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8A0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7924 extends AbstractC9936 {

    /* JADX INFO: renamed from: ۧ */
    public final long f20785;

    /* JADX INFO: renamed from: ܽ */
    public final Long f20786;

    /* JADX INFO: renamed from: ᩳ */
    public final C24569 f20787;

    /* JADX INFO: renamed from: ֫ */
    public final void m18297(C4572 c4572) throws IOException {
        C24569 c24569 = this.f20787;
        if (c24569 != null) {
            c4572.m9646();
            c24569.m19739(c4572);
            c24569.m19738(c4572);
            c24569.m19737(c4572);
            c4572.m9649(EnumC5913.FOUR);
        } else {
            c4572.m9651(0);
        }
        EnumC15299 enumC15299 = EnumC15299.SHARE_INFO_1_CONTAINER;
        c4572.m9651(enumC15299.m34834());
        c4572.m9651(enumC15299.m34834());
        c4572.m9646();
        c4572.m9651(0);
        c4572.m9651(0);
        c4572.m9651((int) this.f20785);
        Long l2 = this.f20786;
        if (l2 != null) {
            c4572.m9646();
            c4572.m9651((int) l2.longValue());
        } else {
            c4572.m9651(0);
        }
    }

    public AbstractC7924(C24569 c24569, Long l2) {
        super(EnumC13959.NetrShareEnum.m31731());
        this.f20787 = c24569;
        this.f20785 = 4294967295L;
        this.f20786 = l2;
    }
}
