package p067l;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ۧܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12904 implements BasicFileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC18267 f36281a;

    public /* synthetic */ C12904(InterfaceC18267 interfaceC18267) {
        this.f36281a = interfaceC18267;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC18267 interfaceC18267 = this.f36281a;
        if (obj instanceof C12904) {
            obj = ((C12904) obj).f36281a;
        }
        return interfaceC18267.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f36281a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f36281a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C18938.m43029a(this.f36281a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.f36281a.mo21481a(AbstractC24029.m53244m(fileTime), AbstractC24029.m53244m(fileTime2), AbstractC24029.m53244m(fileTime3));
    }
}
