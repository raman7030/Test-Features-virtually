package p067l;

/* JADX INFO: renamed from: l.֫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3794 implements InterfaceC16730 {

    /* JADX INFO: renamed from: a */
    public final C6673 f8125a;

    /* JADX INFO: renamed from: b */
    public final C6673 f8126b;

    /* JADX INFO: renamed from: c */
    public final C6673 f8127c;

    /* JADX INFO: renamed from: d */
    public final boolean f8128d;

    /* JADX INFO: renamed from: e */
    public final boolean f8129e;

    /* JADX INFO: renamed from: f */
    public final boolean f8130f;

    /* JADX INFO: renamed from: g */
    public final boolean f8131g;

    /* JADX INFO: renamed from: h */
    public final long f8132h;

    /* JADX INFO: renamed from: i */
    public final Object f8133i;

    public C3794(C6673 c6673, C6673 c6674, C6673 c6675, boolean z, boolean z2, boolean z3, boolean z4, long j, Object obj) {
        this.f8125a = c6673;
        this.f8126b = c6674;
        this.f8127c = c6675;
        this.f8128d = z;
        this.f8129e = z2;
        this.f8130f = z3;
        this.f8131g = z4;
        this.f8132h = j;
        this.f8133i = obj;
    }

    @Override // p067l.InterfaceC16730
    public final C6673 lastModifiedTime() {
        return this.f8125a;
    }

    @Override // p067l.InterfaceC16730
    public final C6673 lastAccessTime() {
        return this.f8126b;
    }

    @Override // p067l.InterfaceC16730
    public final C6673 creationTime() {
        return this.f8127c;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isRegularFile() {
        return this.f8128d;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isDirectory() {
        return this.f8129e;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isSymbolicLink() {
        return this.f8130f;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isOther() {
        return this.f8131g;
    }

    @Override // p067l.InterfaceC16730
    public final long size() {
        return this.f8132h;
    }

    @Override // p067l.InterfaceC16730
    public final Object fileKey() {
        return this.f8133i;
    }
}
