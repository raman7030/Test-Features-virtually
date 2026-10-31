package l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R7K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2756 implements InterfaceC15111 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C3545 f8567;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4529 f8568;

    @Override // l.InterfaceC15111
    public final Object fileKey() {
        return null;
    }

    @Override // l.InterfaceC15111
    public final boolean isOther() {
        return false;
    }

    @Override // l.InterfaceC15111
    public final boolean isSymbolicLink() {
        return false;
    }

    public C2756(C3545 c3545) {
        this.f8567 = c3545;
        this.f8568 = C4529.from(c3545.getTime(), TimeUnit.MILLISECONDS);
    }

    @Override // l.InterfaceC15111
    public final C4529 lastModifiedTime() {
        return this.f8568;
    }

    @Override // l.InterfaceC15111
    public final C4529 lastAccessTime() {
        return this.f8568;
    }

    @Override // l.InterfaceC15111
    public final C4529 creationTime() {
        return this.f8568;
    }

    @Override // l.InterfaceC15111
    public final boolean isRegularFile() {
        return !this.f8567.isDirectory();
    }

    @Override // l.InterfaceC15111
    public final boolean isDirectory() {
        return this.f8567.isDirectory();
    }

    @Override // l.InterfaceC15111
    public final long size() {
        return this.f8567.getSize();
    }
}
