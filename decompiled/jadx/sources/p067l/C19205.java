package p067l;

/* JADX INFO: renamed from: l.ᩳ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: V89H */
/* JADX INFO: loaded from: classes5.dex */
public class C19205 implements InterfaceC19995 {

    /* JADX INFO: renamed from: ֫ */
    public C24569 f57395;

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ܽ */
    public final void mo7394(C17311 c17311) {
    }

    /* JADX INFO: renamed from: ֫ */
    public final C24569 m43741() {
        return this.f57395;
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ۧ */
    public void mo7393(C17311 c17311) {
        c17311.m39276(EnumC5913.FOUR);
        if (c17311.m39280() != 0) {
            this.f57395 = new C24569();
        } else {
            this.f57395 = null;
        }
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ֫ */
    public void mo7392(C17311 c17311) {
        C24569 c24569 = this.f57395;
        if (c24569 != null) {
            c17311.m39277(c24569);
        }
    }

    public int hashCode() {
        return C12826.hash(this.f57395);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19205) {
            return C12826.equals(this.f57395, ((C19205) obj).f57395);
        }
        return false;
    }
}
