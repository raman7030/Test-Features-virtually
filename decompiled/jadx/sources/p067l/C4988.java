package p067l;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ۖ᩶۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R7K0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4988 implements InterfaceC16730 {

    /* JADX INFO: renamed from: ֫ */
    public final C5738 f11361;

    /* JADX INFO: renamed from: ۧ */
    public final C6673 f11362;

    @Override // p067l.InterfaceC16730
    public final Object fileKey() {
        return null;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isOther() {
        return false;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isSymbolicLink() {
        return false;
    }

    public C4988(C5738 c5738) {
        this.f11361 = c5738;
        this.f11362 = C6673.from(c5738.getTime(), TimeUnit.MILLISECONDS);
    }

    @Override // p067l.InterfaceC16730
    public final C6673 lastModifiedTime() {
        return this.f11362;
    }

    @Override // p067l.InterfaceC16730
    public final C6673 lastAccessTime() {
        return this.f11362;
    }

    @Override // p067l.InterfaceC16730
    public final C6673 creationTime() {
        return this.f11362;
    }

    @Override // p067l.InterfaceC16730
    public final boolean isRegularFile() {
        return !this.f11361.isDirectory();
    }

    @Override // p067l.InterfaceC16730
    public final boolean isDirectory() {
        return this.f11361.isDirectory();
    }

    @Override // p067l.InterfaceC16730
    public final long size() {
        return this.f11361.getSize();
    }
}
