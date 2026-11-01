package p067l;

/* JADX INFO: renamed from: l.۬ۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes3.dex */
public final class C14803 {

    /* JADX INFO: renamed from: ֫ */
    public int f42225;

    /* JADX INFO: renamed from: ۧ */
    public final C5771 f42226;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C11097 f42227;

    /* JADX INFO: renamed from: ᩳ */
    public final AbstractC7257 f42228;

    public C14803(C11097 c11097, C5771 c5771, C4968 c4968) {
        this.f42227 = c11097;
        this.f42226 = c5771;
        this.f42228 = c4968;
    }

    public final int hashCode() {
        int i = this.f42225;
        if (i != 0) {
            return i;
        }
        int iM43155 = C19009.m43155(this.f42228, this.f42226.m12939());
        this.f42225 = iM43155;
        return iM43155;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14803)) {
            return false;
        }
        C14803 c14803 = (C14803) obj;
        C5771 c5771 = c14803.f42226;
        C8374 c8374 = this.f42227.f30760;
        C5771 c5772 = this.f42226;
        return c8374.m19490(c5772.f20406, c5771.f20406) && new C18338(c5772.m12939(), c5771.m12939()).m41774(this.f42228, c14803.f42228);
    }
}
