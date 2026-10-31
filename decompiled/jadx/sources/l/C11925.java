package l;

/* JADX INFO: renamed from: l.ۨ᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: AA3Y */
/* JADX INFO: loaded from: classes3.dex */
public final class C11925 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f35643;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11925 m29084(String str) {
        return new C11925(str);
    }

    public C11925(String str) {
        this.f35643 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m29085(InterfaceC14040 interfaceC14040) {
        return ((C7691) interfaceC14040).m20578(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object m29088(InterfaceC14040 interfaceC14040) {
        Object objM20578 = ((C7691) interfaceC14040).m20578(this);
        if (objM20578 != null) {
            return objM20578;
        }
        throw new NullPointerException(this.f35643);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m29087(InterfaceC14040 interfaceC14040) {
        return ((C7691) interfaceC14040).m20580(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29086(InterfaceC14040 interfaceC14040, Object obj) {
        ((C7691) interfaceC14040).m20579(this, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11925.class != obj.getClass()) {
            return false;
        }
        return this.f35643.equals(((C11925) obj).f35643);
    }

    public final int hashCode() {
        return this.f35643.hashCode();
    }

    public final String toString() {
        return C9045.m23341(new StringBuilder("Prop{name='"), this.f35643, "'}");
    }
}
