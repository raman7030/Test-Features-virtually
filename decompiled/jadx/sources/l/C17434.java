package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ܿܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17434 implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC15111 a;

    public /* synthetic */ C17434(InterfaceC15111 interfaceC15111) {
        this.a = interfaceC15111;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC15111 interfaceC15111) {
        if (interfaceC15111 == null) {
            return null;
        }
        if (interfaceC15111 instanceof C18140) {
            return ((C18140) interfaceC15111).a;
        }
        if (interfaceC15111 instanceof C6851) {
            return ((C6851) interfaceC15111).a;
        }
        if (!(interfaceC15111 instanceof InterfaceC3118)) {
            return new C17434(interfaceC15111);
        }
        InterfaceC3118 interfaceC3118 = (InterfaceC3118) interfaceC15111;
        return interfaceC3118 instanceof C15316 ? ((C15316) interfaceC3118).a : new C21668(interfaceC3118);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return AbstractC22791.o(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC15111 interfaceC15111 = this.a;
        if (obj instanceof C17434) {
            obj = ((C17434) obj).a;
        }
        return interfaceC15111.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
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

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
