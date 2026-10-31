package l;

/* JADX INFO: renamed from: l.ᩳ᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AKK */
/* JADX INFO: loaded from: classes5.dex */
public final class C18288 implements InterfaceC12706 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class f56858;

    public C18288(Class cls) {
        C11233.m27805(cls, "jClass");
        this.f56858 = cls;
    }

    public final int hashCode() {
        return this.f56858.hashCode();
    }

    @Override // l.InterfaceC12706
    /* JADX INFO: renamed from: ֫ */
    public final Class mo17650() {
        return this.f56858;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C18288) {
            return C11233.m27802(this.f56858, ((C18288) obj).f56858);
        }
        return false;
    }

    public final String toString() {
        return this.f56858.toString() + " (Kotlin reflection is not available)";
    }
}
