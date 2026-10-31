package l;

/* JADX INFO: renamed from: l.ۨۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A9E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11656 extends AbstractC22944 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f34753 = C11321.m27961(C11656.class);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C9540 f34754;

    public C11656(C9540 c9540) {
        this.f34754 = c9540;
    }

    @Override // l.AbstractC22944
    /* JADX INFO: renamed from: ֫ */
    public final void mo16824(C18026 c18026) {
        long jM52201 = ((C23670) c18026.m21061()).m52201();
        if (this.f34754.m24411(Long.valueOf(jM52201)) == null && !c18026.m42076()) {
            f34753.mo7079(Long.valueOf(jM52201), "Received response with unknown sequence number << {} >>");
            this.f14665.m13513(new C0221(c18026.m21061()));
            return;
        }
        this.f14665.m13513(c18026);
    }
}
