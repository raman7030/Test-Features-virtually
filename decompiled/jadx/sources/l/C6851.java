package l;

import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.ۜܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6851 implements InterfaceC15111 {
    public final /* synthetic */ DosFileAttributes a;

    @Override // l.InterfaceC15111
    public final /* synthetic */ C4529 creationTime() {
        return AbstractC22791.m(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.a;
        if (obj instanceof C6851) {
            obj = ((C6851) obj).a;
        }
        return dosFileAttributes.equals(obj);
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
