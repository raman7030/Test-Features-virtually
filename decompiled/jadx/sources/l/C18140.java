package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

/* JADX INFO: renamed from: l.ᩳܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18140 implements InterfaceC15111 {
    public final /* synthetic */ BasicFileAttributes a;

    public /* synthetic */ C18140(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC15111 a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        if (basicFileAttributes instanceof C17434) {
            return ((C17434) basicFileAttributes).a;
        }
        if (basicFileAttributes instanceof DosFileAttributes) {
            return new C6851((DosFileAttributes) basicFileAttributes);
        }
        if (!(basicFileAttributes instanceof PosixFileAttributes)) {
            return new C18140(basicFileAttributes);
        }
        PosixFileAttributes posixFileAttributes = (PosixFileAttributes) basicFileAttributes;
        return posixFileAttributes instanceof C21668 ? ((C21668) posixFileAttributes).a : new C15316(posixFileAttributes);
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ C4529 creationTime() {
        return AbstractC22791.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C18140) {
            obj = ((C18140) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ C4529 lastAccessTime() {
        return AbstractC22791.m(this.a.lastAccessTime());
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ C4529 lastModifiedTime() {
        return AbstractC22791.m(this.a.lastModifiedTime());
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
