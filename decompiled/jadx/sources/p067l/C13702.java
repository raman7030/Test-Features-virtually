package p067l;

/* JADX INFO: renamed from: l.ۨ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: AA3Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C13702 {

    /* JADX INFO: renamed from: ֫ */
    public final String f38652;

    /* JADX INFO: renamed from: ֫ */
    public static C13702 m31137(String str) {
        return new C13702(str);
    }

    public C13702(String str) {
        this.f38652 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m31138(InterfaceC15712 interfaceC15712) {
        return ((C9678) interfaceC15712).m22558(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final Object m31141(InterfaceC15712 interfaceC15712) {
        Object objM22558 = ((C9678) interfaceC15712).m22558(this);
        if (objM22558 != null) {
            return objM22558;
        }
        throw new NullPointerException(this.f38652);
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m31140(InterfaceC15712 interfaceC15712) {
        return ((C9678) interfaceC15712).m22560(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31139(InterfaceC15712 interfaceC15712, Object obj) {
        ((C9678) interfaceC15712).m22559(this, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13702.class != obj.getClass()) {
            return false;
        }
        return this.f38652.equals(((C13702) obj).f38652);
    }

    public final int hashCode() {
        return this.f38652.hashCode();
    }

    public final String toString() {
        return C10965.m25286(new StringBuilder("Prop{name='"), this.f38652, "'}");
    }
}
