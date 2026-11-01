package p067l;

/* JADX INFO: renamed from: l.֨ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3150 {

    /* JADX INFO: renamed from: ᩸ */
    public volatile C8041 f5766;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC3150 f5767;

    public abstract String getName();

    /* JADX INFO: renamed from: ۡ */
    public void mo3532() {
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract InterfaceC24548 mo3533();

    /* JADX INFO: renamed from: ۧ */
    public abstract C7174 mo3535();

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo3542();

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo3551() {
        return false;
    }

    public /* synthetic */ AbstractC3150(int i) {
        this();
    }

    public AbstractC3150() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m5384(C8041 c8041) {
        C2676 builder;
        if (this.f5767 != null && c8041.equals(C8041.getDefaultInstance()) && !mo3551()) {
            this.f5766 = this.f5767.f5766;
            mo3532();
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C2479 c2479 : c8041.m31640().keySet()) {
            int number = c2479.getNumber();
            C17683 c17683 = C25080.f80008;
            if (number == c17683.mo18131().getNumber() && c2479 != c17683.mo18131()) {
                z2 = true;
            }
        }
        if (!c8041.getUnknownFields().m25742().isEmpty() && c8041.getUnknownFields().m25745(C25080.f80008.mo18131().getNumber())) {
            z = true;
        }
        if (z2 || z) {
            C3860 c3860M7613 = C3860.m7613();
            c3860M7613.m7615(C25080.f80008);
            try {
                c8041 = C8041.m18637(c8041.toByteString(), c3860M7613);
            } catch (C4293 e) {
                throw new C8515(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        AbstractC3150 abstractC3150 = this.f5767;
        if (abstractC3150 == null) {
            builder = C23268.m51809(mo3535().m16490()).toBuilder();
        } else {
            builder = abstractC3150.f5766.toBuilder();
        }
        builder.m4130(mo3547());
        builder.m4130(c8041);
        this.f5766 = C23268.m51810(builder.build());
        mo3532();
    }

    /* JADX INFO: renamed from: ᩷ */
    public C8041 mo3547() {
        return C8041.getDefaultInstance();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8041 m5383() {
        if (this.f5766 == null && (mo3535().m16490() == EnumC5674.EDITION_PROTO2 || mo3535().m16490() == EnumC5674.EDITION_PROTO3)) {
            mo3535().m16491();
        }
        return this.f5766;
    }
}
