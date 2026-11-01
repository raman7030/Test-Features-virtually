package p067l;

/* JADX INFO: renamed from: l.᩵ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: S9I7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20899 {

    /* JADX INFO: renamed from: ֫ */
    public EnumC6146 f65634;

    /* JADX INFO: renamed from: ۧ */
    public EnumC20228 f65635;

    /* JADX INFO: renamed from: ܽ */
    public EnumC4805 f65636;

    /* JADX INFO: renamed from: ᩳ */
    public int f65637;

    public C20899(EnumC6146 enumC6146, EnumC20228 enumC20228, EnumC4805 enumC4805) {
        this.f65634 = enumC6146;
        this.f65635 = enumC20228;
        this.f65637 = 7600;
        this.f65636 = enumC4805;
    }

    public C20899() {
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m47207(C14192 c14192) throws C14862 {
        this.f65634 = (EnumC6146) C16873.m38440(c14192.m28120(), EnumC6146.class, null);
        this.f65635 = (EnumC20228) C16873.m38440(c14192.m28120(), EnumC20228.class, null);
        this.f65637 = c14192.m28125();
        c14192.m28121(3);
        this.f65636 = (EnumC4805) C16873.m38440(c14192.m28120(), EnumC4805.class, null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m47208(C14192 c14192) {
        c14192.m28100((byte) this.f65634.f15428);
        c14192.m28100((byte) this.f65635.f62539);
        c14192.m28111(this.f65637);
        c14192.m28102(3, new byte[]{0, 0, 0});
        c14192.m28100((byte) this.f65636.getValue());
    }

    public final String toString() {
        return String.format("WindowsVersion[%s, %s, %d, %s]", this.f65634, this.f65635, Integer.valueOf(this.f65637), this.f65636);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20899.class == obj.getClass()) {
            C20899 c20899 = (C20899) obj;
            if (this.f65637 == c20899.f65637 && this.f65634 == c20899.f65634 && this.f65635 == c20899.f65635 && this.f65636 == c20899.f65636) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(this.f65634, this.f65635, Integer.valueOf(this.f65637), this.f65636);
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC4805 m47206() {
        return this.f65636;
    }
}
