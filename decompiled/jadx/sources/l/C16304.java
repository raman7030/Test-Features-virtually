package l;

/* JADX INFO: renamed from: l.ܽ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q89H */
/* JADX INFO: loaded from: classes5.dex */
public final class C16304 extends C10661 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C23360 f50148;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f50149;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m38356() {
        return this.f50149;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C23360 m38355() {
        return this.f50148;
    }

    @Override // l.C17716, l.InterfaceC18547
    /* JADX INFO: renamed from: ۧ */
    public final void mo5151(C15723 c15723) {
        super.mo5151(c15723);
        this.f50149 = (int) c15723.m37112();
        if (c15723.m37111() != 0) {
            this.f50148 = new C23360();
        } else {
            this.f50148 = null;
        }
    }

    @Override // l.C17716, l.InterfaceC18547
    /* JADX INFO: renamed from: ֫ */
    public final void mo5150(C15723 c15723) {
        super.mo5150(c15723);
        C23360 c23360 = this.f50148;
        if (c23360 != null) {
            c15723.m37108(c23360);
        }
    }

    @Override // l.C17716
    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f50149), this.f50148) + (super.hashCode() * 31);
    }

    @Override // l.C17716
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16304)) {
            return false;
        }
        C16304 c16304 = (C16304) obj;
        return super.equals(obj) && this.f50149 == c16304.f50149 && C11003.equals(this.f50148, c16304.f50148);
    }

    public final String toString() {
        return String.format("SHARE_INFO_1{shi1_netname: %s, shi1_type: %d, shi1_remark: %s}", m41495(), Integer.valueOf(this.f50149), this.f50148);
    }
}
