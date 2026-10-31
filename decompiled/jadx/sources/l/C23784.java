package l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.᩻ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23784 implements DosFileAttributeView {
    public final /* synthetic */ InterfaceC21463 a;

    public /* synthetic */ C23784(InterfaceC21463 interfaceC21463) {
        this.a = interfaceC21463;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC21463 interfaceC21463 = this.a;
        if (obj instanceof C23784) {
            obj = ((C23784) obj).a;
        }
        return interfaceC21463.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C17434.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() {
        C6851 attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes.a;
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) {
        this.a.setArchive(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) {
        this.a.setHidden(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) {
        this.a.setReadOnly(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) {
        this.a.setSystem(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(AbstractC22791.m(fileTime), AbstractC22791.m(fileTime2), AbstractC22791.m(fileTime3));
    }
}
