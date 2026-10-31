package l;

/* JADX INFO: renamed from: l.֨ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0823 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile C5969 f2992;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC0823 f2993;

    public abstract String getName();

    /* JADX INFO: renamed from: ۡ */
    public void mo1131() {
    }

    /* JADX INFO: renamed from: ۢ */
    public abstract InterfaceC23338 mo1132();

    /* JADX INFO: renamed from: ۧ */
    public abstract C5057 mo1134();

    /* JADX INFO: renamed from: ܿ */
    public abstract String mo1141();

    /* JADX INFO: renamed from: ᩻ */
    public boolean mo1150() {
        return false;
    }

    public /* synthetic */ AbstractC0823(int i) {
        this();
    }

    public AbstractC0823() {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m3070(C5969 c5969) {
        C0324 builder;
        if (this.f2993 != null && c5969.equals(C5969.getDefaultInstance()) && !mo1150()) {
            this.f2992 = this.f2993.f2992;
            mo1131();
            return;
        }
        boolean z = false;
        boolean z2 = false;
        for (C0117 c0117 : c5969.m29575().keySet()) {
            int number = c0117.getNumber();
            C16114 c16114 = C23897.f77257;
            if (number == c16114.mo16212().getNumber() && c0117 != c16114.mo16212()) {
                z2 = true;
            }
        }
        if (!c5969.getUnknownFields().m23741().isEmpty() && c5969.getUnknownFields().m23744(C23897.f77257.mo16212().getNumber())) {
            z = true;
        }
        if (z2 || z) {
            C1570 c1570M5384 = C1570.m5384();
            c1570M5384.m5386(C23897.f77257);
            try {
                c5969 = C5969.m16711(c5969.toByteString(), c1570M5384);
            } catch (C2025 e) {
                throw new C6468(this, "Failed to parse features with Java feature extension registry.", e);
            }
        }
        AbstractC0823 abstractC0823 = this.f2993;
        if (abstractC0823 == null) {
            builder = C21991.m49474(mo1134().m14583()).toBuilder();
        } else {
            builder = abstractC0823.f2992.toBuilder();
        }
        builder.m1732(mo1146());
        builder.m1732(c5969);
        this.f2992 = C21991.m49475(builder.build());
        mo1131();
    }

    /* JADX INFO: renamed from: ᩷ */
    public C5969 mo1146() {
        return C5969.getDefaultInstance();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5969 m3069() {
        if (this.f2992 == null && (mo1134().m14583() == EnumC3478.EDITION_PROTO2 || mo1134().m14583() == EnumC3478.EDITION_PROTO3)) {
            mo1134().m14584();
        }
        return this.f2992;
    }
}
