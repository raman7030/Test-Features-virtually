package p067l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: renamed from: l.ᩳܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19609 implements InterfaceC16730 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributes f59646a;

    public /* synthetic */ C19609(BasicFileAttributes basicFileAttributes) {
        this.f59646a = basicFileAttributes;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC16730 m44513a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C18938) {
            return ((C18938) basicFileAttributes).f56477a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return new C8880((DosFileAttributes) basicFileAttributes);
        }
        if (!(basicFileAttributes instanceof PosixFileAttributes)) {
            return new C19609(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
        return posixFileAttributes instanceof C22962 ? ((C22962) posixFileAttributes).f72229a : new C16925(posixFileAttributes);
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 creationTime() {
        return AbstractC24029.m53244m(this.f59646a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.f59646a;
        if (obj instanceof C19609) {
            obj = ((C19609) obj).f59646a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ Object fileKey() {
        return this.f59646a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f59646a.hashCode();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isDirectory() {
        return this.f59646a.isDirectory();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isOther() {
        return this.f59646a.isOther();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isRegularFile() {
        return this.f59646a.isRegularFile();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f59646a.isSymbolicLink();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 lastAccessTime() {
        return AbstractC24029.m53244m(this.f59646a.lastAccessTime());
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 lastModifiedTime() {
        return AbstractC24029.m53244m(this.f59646a.lastModifiedTime());
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ long size() {
        return this.f59646a.size();
    }
}
