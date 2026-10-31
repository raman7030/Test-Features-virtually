package l;

/* JADX INFO: renamed from: l.᩵ܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IBF1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19611 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15375[] f63328;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15375[] f63329;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15375[] f63330;

    public C19611(C13012 c13012) {
        int iM38023 = c13012.m31591().m38023();
        this.f63330 = new C15375[iM38023];
        this.f63329 = new C15375[iM38023];
        this.f63328 = new C15375[iM38023];
        C17246 c17246M31591 = c13012.m31591();
        int size = c17246M31591.size();
        for (int i = 0; i < size; i++) {
            C16540 c16540M41002get = c17246M31591.m41002get(i);
            int iMo2269 = c16540M41002get.mo2269();
            this.f63330[iMo2269] = new C15375(c16540M41002get.m38916().m41001get(0).m37480(), false);
            C10191 c10191M37480 = c16540M41002get.m38915().m37480();
            this.f63329[iMo2269] = new C15375(c10191M37480, false);
            this.f63328[iMo2269] = new C15375(c10191M37480, false);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C15375 m45054(C16540 c16540) {
        return this.f63330[c16540.mo2269()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15375 m45051(int i) {
        return this.f63330[i];
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C15375 m45053(C16540 c16540) {
        return this.f63329[c16540.mo2269()];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15375 m45052(C16540 c16540) {
        return this.f63328[c16540.mo2269()];
    }
}
