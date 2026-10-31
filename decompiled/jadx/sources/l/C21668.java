package l;

import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C21668 implements PosixFileAttributes {
    public final /* synthetic */ InterfaceC3118 a;

    public /* synthetic */ C21668(InterfaceC3118 interfaceC3118) {
        this.a = interfaceC3118;
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC22791.o(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC3118 interfaceC3118 = this.a;
        if (obj instanceof C21668) {
            obj = ((C21668) obj).a;
        }
        return interfaceC3118.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ GroupPrincipal group() {
        C1206 c1206Group = this.a.group();
        if (c1206Group == null) {
            return null;
        }
        return c1206Group.a;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC22791.o(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC22791.o(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ UserPrincipal owner() {
        return C10174.a(this.a.owner());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ Set permissions() {
        return AbstractC22791.v(this.a.permissions());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
