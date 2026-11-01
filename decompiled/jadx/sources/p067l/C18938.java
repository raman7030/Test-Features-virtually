package p067l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ܿܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18938 implements BasicFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC16730 f56477a;

    public /* synthetic */ C18938(InterfaceC16730 interfaceC16730) {
        this.f56477a = interfaceC16730;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BasicFileAttributes m43029a(InterfaceC16730 interfaceC16730) {
        if (interfaceC16730 == null) {
            return null;
        }
        if (interfaceC16730 instanceof C19609) {
            return ((C19609) interfaceC16730).f59646a;
        }
        if (interfaceC16730 instanceof C8880) {
            return ((C8880) interfaceC16730).f24077a;
        }
        if (!(interfaceC16730 instanceof InterfaceC5332)) {
            return new C18938(interfaceC16730);
        }
        InterfaceC5332 interfaceC5332 = (InterfaceC5332) interfaceC16730;
        return interfaceC5332 instanceof C16925 ? ((C16925) interfaceC5332).f50096a : new C22962(interfaceC5332);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC24029.m53246o(this.f56477a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC16730 interfaceC16730 = this.f56477a;
        if (obj instanceof C18938) {
            obj = ((C18938) obj).f56477a;
        }
        return interfaceC16730.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f56477a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f56477a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f56477a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f56477a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f56477a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f56477a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC24029.m53246o(this.f56477a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC24029.m53246o(this.f56477a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f56477a.size();
    }
}
