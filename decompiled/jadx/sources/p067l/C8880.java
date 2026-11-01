package p067l;

import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.ۜܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8880 implements InterfaceC16730 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DosFileAttributes f24077a;

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 creationTime() {
        return AbstractC24029.m53244m(this.f24077a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributes dosFileAttributes = this.f24077a;
        if (obj instanceof C8880) {
            obj = ((C8880) obj).f24077a;
        }
        return dosFileAttributes.equals(obj);
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ Object fileKey() {
        return this.f24077a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.f24077a.hashCode();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isDirectory() {
        return this.f24077a.isDirectory();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isOther() {
        return this.f24077a.isOther();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isRegularFile() {
        return this.f24077a.isRegularFile();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f24077a.isSymbolicLink();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 lastAccessTime() {
        return AbstractC24029.m53244m(this.f24077a.lastAccessTime());
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 lastModifiedTime() {
        return AbstractC24029.m53244m(this.f24077a.lastModifiedTime());
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ long size() {
        return this.f24077a.size();
    }
}
