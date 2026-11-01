package p067l;

import java.io.IOException;
import java.nio.file.attribute.BasicFileAttributeView;

/* JADX INFO: renamed from: l.۟۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9355 implements InterfaceC18267 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasicFileAttributeView f25482a;

    public /* synthetic */ C9355(BasicFileAttributeView basicFileAttributeView) {
        this.f25482a = basicFileAttributeView;
    }

    @Override // p067l.InterfaceC18267
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo21481a(C6673 c6673, C6673 c6674, C6673 c6675) throws IOException {
        this.f25482a.setTimes(AbstractC24029.m53246o(c6673), AbstractC24029.m53246o(c6674), AbstractC24029.m53246o(c6675));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.f25482a;
        if (obj instanceof C9355) {
            obj = ((C9355) obj).f25482a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f25482a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f25482a.name();
    }

    @Override // p067l.InterfaceC18267
    public final /* synthetic */ InterfaceC16730 readAttributes() {
        return C19609.m44513a(this.f25482a.readAttributes());
    }
}
