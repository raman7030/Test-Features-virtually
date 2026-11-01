package p067l;

import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.UserPrincipal;
import java.util.Set;

/* JADX INFO: renamed from: l.᩸ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C22962 implements PosixFileAttributes {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5332 f72229a;

    public /* synthetic */ C22962(InterfaceC5332 interfaceC5332) {
        this.f72229a = interfaceC5332;
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC24029.m53246o(this.f72229a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC5332 interfaceC5332 = this.f72229a;
        if (obj instanceof C22962) {
            obj = ((C22962) obj).f72229a;
        }
        return interfaceC5332.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.f72229a.fileKey();
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ GroupPrincipal group() {
        C3515 c3515Group = this.f72229a.group();
        if (c3515Group == null) {
            return null;
        }
        return c3515Group.f7124a;
    }

    public final /* synthetic */ int hashCode() {
        return this.f72229a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.f72229a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.f72229a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.f72229a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f72229a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return AbstractC24029.m53246o(this.f72229a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return AbstractC24029.m53246o(this.f72229a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ UserPrincipal owner() {
        return C12038.m27552a(this.f72229a.owner());
    }

    @Override // java.nio.file.attribute.PosixFileAttributes
    public final /* synthetic */ Set permissions() {
        return AbstractC24029.m53253v(this.f72229a.permissions());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.f72229a.size();
    }
}
