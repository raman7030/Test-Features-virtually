package p067l;

import java.nio.file.attribute.PosixFileAttributes;
import java.util.Set;

/* JADX INFO: renamed from: l.ܶܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16925 implements InterfaceC5332 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PosixFileAttributes f50096a;

    public /* synthetic */ C16925(PosixFileAttributes posixFileAttributes) {
        this.f50096a = posixFileAttributes;
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 creationTime() {
        return AbstractC24029.m53244m(this.f50096a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributes posixFileAttributes = this.f50096a;
        if (obj instanceof C16925) {
            obj = ((C16925) obj).f50096a;
        }
        return posixFileAttributes.equals(obj);
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ Object fileKey() {
        return this.f50096a.fileKey();
    }

    @Override // p067l.InterfaceC5332
    public final /* synthetic */ C3515 group() {
        return C3515.m6292a(this.f50096a.group());
    }

    public final /* synthetic */ int hashCode() {
        return this.f50096a.hashCode();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isDirectory() {
        return this.f50096a.isDirectory();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isOther() {
        return this.f50096a.isOther();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isRegularFile() {
        return this.f50096a.isRegularFile();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.f50096a.isSymbolicLink();
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 lastAccessTime() {
        return AbstractC24029.m53244m(this.f50096a.lastAccessTime());
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ C6673 lastModifiedTime() {
        return AbstractC24029.m53244m(this.f50096a.lastModifiedTime());
    }

    @Override // p067l.InterfaceC5332
    public final /* synthetic */ InterfaceC13379 owner() {
        return C21621.m48825a(this.f50096a.owner());
    }

    @Override // p067l.InterfaceC5332
    public final /* synthetic */ Set permissions() {
        return AbstractC24029.m53253v(this.f50096a.permissions());
    }

    @Override // p067l.InterfaceC16730
    public final /* synthetic */ long size() {
        return this.f50096a.size();
    }
}
