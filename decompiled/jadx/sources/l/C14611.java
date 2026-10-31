package l;

import java.io.IOException;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

/* JADX INFO: renamed from: l.ܳܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C14611 implements InterfaceC21463 {
    public final /* synthetic */ DosFileAttributeView a;

    public /* synthetic */ C14611(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ void a(C4529 c4529, C4529 c45210, C4529 c45211) throws IOException {
        this.a.setTimes(AbstractC22791.o(c4529), AbstractC22791.o(c45210), AbstractC22791.o(c45211));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C14611) {
            obj = ((C14611) obj).a;
        }
        return dosFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22873
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC21463, l.InterfaceC16728
    public final /* synthetic */ C6851 readAttributes() throws IOException {
        DosFileAttributes attributes = this.a.readAttributes();
        if (attributes == null) {
            return null;
        }
        return new C6851(attributes);
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ InterfaceC15111 readAttributes() {
        return C18140.a(this.a.readAttributes());
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setArchive(boolean z) throws IOException {
        this.a.setArchive(z);
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setHidden(boolean z) throws IOException {
        this.a.setHidden(z);
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setReadOnly(boolean z) throws IOException {
        this.a.setReadOnly(z);
    }

    @Override // l.InterfaceC21463
    public final /* synthetic */ void setSystem(boolean z) throws IOException {
        this.a.setSystem(z);
    }
}
