package l;

/* JADX INFO: renamed from: l.ۧ᩷ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes4.dex */
public final class C11249 extends AbstractC8718 {
    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ۧ */
    public final int mo3385() {
        return 4;
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final EnumC3779 mo2862() {
        return EnumC3779.TYPE_TYPE_ID_ITEM;
    }

    @Override // l.AbstractC8718, l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo2863(C1662 c1662) {
        c1662.m5631().m6832(m22521().m30697());
    }

    @Override // l.AbstractC2368
    /* JADX INFO: renamed from: ֫ */
    public final void mo3384(C1662 c1662, C18241 c18241) {
        C13217 c13217M30697 = m22521().m30697();
        int iM6830 = c1662.m5631().m6830(c13217M30697);
        if (c18241.m42506()) {
            c18241.m42501(0, m37189() + ' ' + c13217M30697.mo2463());
            c18241.m42501(4, "  descriptor_idx: ".concat(C14712.m35008(iM6830)));
        }
        c18241.m42514(iM6830);
    }
}
