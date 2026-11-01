package p067l;

/* JADX INFO: renamed from: l.ᩳ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKK */
/* JADX INFO: loaded from: classes5.dex */
public final class C19750 implements InterfaceC14445 {

    /* JADX INFO: renamed from: ֫ */
    public final Class f60076;

    public C19750(Class cls) {
        C13045.m29867(cls, "jClass");
        this.f60076 = cls;
    }

    public final int hashCode() {
        return this.f60076.hashCode();
    }

    @Override // p067l.InterfaceC14445
    /* JADX INFO: renamed from: ֫ */
    public final Class mo19593() {
        return this.f60076;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C19750) {
            return C13045.m29864(this.f60076, ((C19750) obj).f60076);
        }
        return false;
    }

    public final String toString() {
        return this.f60076.toString() + " (Kotlin reflection is not available)";
    }
}
