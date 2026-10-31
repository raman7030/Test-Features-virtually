package l;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: renamed from: l.۟۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7351 implements InterfaceC16728 {
    public final /* synthetic */ BasicFileAttributeView a;

    public /* synthetic */ C7351(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ void a(C4529 c4529, C4529 c45210, C4529 c45211) throws IOException {
        this.a.setTimes(AbstractC22791.o(c4529), AbstractC22791.o(c45210), AbstractC22791.o(c45211));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C7351) {
            obj = ((C7351) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22873
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC16728
    public final /* synthetic */ InterfaceC15111 readAttributes() {
        return C18140.a(this.a.readAttributes());
    }
}
