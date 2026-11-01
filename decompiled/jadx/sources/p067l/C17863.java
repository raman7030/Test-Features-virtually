package p067l;

/* JADX INFO: renamed from: l.ܽ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q89H */
/* JADX INFO: loaded from: classes5.dex */
public final class C17863 extends C12500 {

    /* JADX INFO: renamed from: ۧ */
    public C24569 f53315;

    /* JADX INFO: renamed from: ܽ */
    public int f53316;

    /* JADX INFO: renamed from: ܽ */
    public final int m40571() {
        return this.f53316;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C24569 m40570() {
        return this.f53315;
    }

    @Override // p067l.C19205, p067l.InterfaceC19995
    /* JADX INFO: renamed from: ۧ */
    public final void mo7393(C17311 c17311) {
        super.mo7393(c17311);
        this.f53316 = (int) c17311.m39281();
        if (c17311.m39280() != 0) {
            this.f53315 = new C24569();
        } else {
            this.f53315 = null;
        }
    }

    @Override // p067l.C19205, p067l.InterfaceC19995
    /* JADX INFO: renamed from: ֫ */
    public final void mo7392(C17311 c17311) {
        super.mo7392(c17311);
        C24569 c24569 = this.f53315;
        if (c24569 != null) {
            c17311.m39277(c24569);
        }
    }

    @Override // p067l.C19205
    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f53316), this.f53315) + (super.hashCode() * 31);
    }

    @Override // p067l.C19205
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17863)) {
            return false;
        }
        C17863 c17863 = (C17863) obj;
        return super.equals(obj) && this.f53316 == c17863.f53316 && C12826.equals(this.f53315, c17863.f53315);
    }

    public final String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", m43741(), Integer.valueOf(this.f53316), this.f53315);
    }
}
