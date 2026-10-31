package l;

/* JADX INFO: renamed from: l.֫֨ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1500 implements InterfaceC15111 {
    public final C4529 a;
    public final C4529 b;
    public final C4529 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final Object i;

    public C1500(C4529 c4529, C4529 c45210, C4529 c45211, boolean z, boolean z2, boolean z3, boolean z4, long j, Object obj) {
        this.a = c4529;
        this.b = c45210;
        this.c = c45211;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = j;
        this.i = obj;
    }

    @Override // l.InterfaceC15111
    public final C4529 lastModifiedTime() {
        return this.a;
    }

    @Override // l.InterfaceC15111
    public final C4529 lastAccessTime() {
        return this.b;
    }

    @Override // l.InterfaceC15111
    public final C4529 creationTime() {
        return this.c;
    }

    @Override // l.InterfaceC15111
    public final boolean isRegularFile() {
        return this.d;
    }

    @Override // l.InterfaceC15111
    public final boolean isDirectory() {
        return this.e;
    }

    @Override // l.InterfaceC15111
    public final boolean isSymbolicLink() {
        return this.f;
    }

    @Override // l.InterfaceC15111
    public final boolean isOther() {
        return this.g;
    }

    @Override // l.InterfaceC15111
    public final long size() {
        return this.h;
    }

    @Override // l.InterfaceC15111
    public final Object fileKey() {
        return this.i;
    }
}
