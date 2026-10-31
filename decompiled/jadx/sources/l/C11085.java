package l;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: renamed from: l.ۧܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11085 implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC16728 a;

    public /* synthetic */ C11085(InterfaceC16728 interfaceC16728) {
        this.a = interfaceC16728;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC16728 interfaceC16728 = this.a;
        if (obj instanceof C11085) {
            obj = ((C11085) obj).a;
        }
        return interfaceC16728.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C17434.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(AbstractC22791.m(fileTime), AbstractC22791.m(fileTime2), AbstractC22791.m(fileTime3));
    }
}
