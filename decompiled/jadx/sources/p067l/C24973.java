package p067l;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.᩻ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24973 implements DosFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC22767 f79746a;

    public /* synthetic */ C24973(InterfaceC22767 interfaceC22767) {
        this.f79746a = interfaceC22767;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC22767 interfaceC22767 = this.f79746a;
        if (obj instanceof C24973) {
            obj = ((C24973) obj).f79746a;
        }
        return interfaceC22767.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f79746a.hashCode();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f79746a.name();
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C18938.m43029a(this.f79746a.readAttributes());
    }

    @Override // java.nio.file.attribute.DosFileAttributeView, java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ DosFileAttributes readAttributes() {
        C8880 attributes = this.f79746a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return attributes.f24077a;
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setArchive(boolean z) {
        this.f79746a.setArchive(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setHidden(boolean z) {
        this.f79746a.setHidden(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setReadOnly(boolean z) {
        this.f79746a.setReadOnly(z);
    }

    @Override // java.nio.file.attribute.DosFileAttributeView
    public final /* synthetic */ void setSystem(boolean z) {
        this.f79746a.setSystem(z);
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.f79746a.mo21481a(AbstractC24029.m53244m(fileTime), AbstractC24029.m53244m(fileTime2), AbstractC24029.m53244m(fileTime3));
    }
}
