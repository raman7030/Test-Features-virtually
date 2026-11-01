package p067l;

/* JADX INFO: renamed from: l.ܽۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59UK */
/* JADX INFO: loaded from: classes5.dex */
public final class C17995 extends AbstractC19337 {

    /* JADX INFO: renamed from: ۛ */
    public static final InterfaceC4410 f53742 = C13128.m30022(C17995.class);

    /* JADX INFO: renamed from: ۤ */
    public C19730 f53743;

    /* JADX INFO: renamed from: ۫ */
    public byte[] f53744;

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo29045() {
        return false;
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ᩻ */
    public final InterfaceC15983[] mo29049() {
        InterfaceC15983[] interfaceC15983ArrM44858 = this.f53743.m44858();
        return interfaceC15983ArrM44858 == null ? new InterfaceC15983[0] : interfaceC15983ArrM44858;
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ۘ */
    public final InterfaceC15983 mo29046() throws C5255 {
        C5807 c5807M44073 = m44073();
        C4307 c4307 = new C4307(((C14642) m44074()).f41801.m43775(), c5807M44073.m13070());
        c4307.m8758(1);
        c4307.m8759(129);
        C18388 c18388 = new C18388(c5807M44073.m13070(), C12334.f34417);
        c18388.m41863("*");
        c4307.mo12477(c18388);
        try {
            this.f53744 = ((C13025) c5807M44073.m13063(c4307, null, new EnumC2572[0])).m29842();
            this.f53743 = (C19730) c18388.mo7658();
            InterfaceC15983 interfaceC15983M44071 = m44071(false);
            if (interfaceC15983M44071 == null) {
                m44072();
            }
            return interfaceC15983M44071;
        } catch (C5255 e) {
            C13025 c13025 = (C13025) c4307.mo7658();
            if (c13025 != null && c13025.mo30257() && c13025.m12485() == 0) {
                try {
                    c5807M44073.m13063(new C15685(c5807M44073.m13070(), c13025.m29842()), null, new EnumC2572[0]);
                } catch (C5255 e2) {
                    e.addSuppressed(e2);
                }
            }
            C19730 c19730 = (C19730) c18388.mo7658();
            if (c19730 != null && c19730.mo30257() && c19730.m12485() == -1073741809) {
                m44072();
                return null;
            }
            throw e;
        }
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ᩳ */
    public final boolean mo29048() throws C5255 {
        InterfaceC15983[] interfaceC15983ArrM44858 = this.f53743.m44858();
        C5807 c5807M44073 = m44073();
        C18388 c18388 = new C18388(c5807M44073.m13070(), this.f53744);
        c18388.m41863("*");
        c18388.m41864(interfaceC15983ArrM44858[interfaceC15983ArrM44858.length - 1].mo5427());
        c18388.m41862();
        try {
            C19730 c19730 = (C19730) c5807M44073.m13063(c18388, null, new EnumC2572[0]);
            if (c19730.m12485() == -2147483642) {
                return false;
            }
            this.f53743 = c19730;
            return true;
        } catch (C5255 e) {
            if (e.m11333() == -2147483642) {
                f53742.mo9176("End of listing", (Exception) e);
                return false;
            }
            throw e;
        }
    }

    @Override // p067l.AbstractC19337
    /* JADX INFO: renamed from: ܽ */
    public final void mo29047() {
        try {
            C5807 c5807M44073 = m44073();
            if (this.f53744 != null && c5807M44073.m13071()) {
                c5807M44073.m13063(new C15685(c5807M44073.m13070(), this.f53744), null, new EnumC2572[0]);
            }
        } finally {
            this.f53744 = null;
        }
    }
}
