package l;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15316 implements InterfaceC3118 {
    public final /* synthetic */ PosixFileAttributes a;

    public /* synthetic */ C15316(PosixFileAttributes posixFileAttributes) {
        this.a = posixFileAttributes;
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ C4529 creationTime() {
        return AbstractC22791.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.a;
        if (obj instanceof C15316) {
            obj = ((C15316) obj).a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    @Override // l.InterfaceC3118
    public final /* synthetic */ C1206 group() {
        return C1206.a(this.a.group());
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

    @Override // l.InterfaceC3118
    public final /* synthetic */ InterfaceC11585 owner() {
        return C20257.a(this.a.owner());
    }

    @Override // l.InterfaceC3118
    public final /* synthetic */ Set permissions() {
        return AbstractC22791.v(this.a.permissions());
    }

    @Override // l.InterfaceC15111
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
