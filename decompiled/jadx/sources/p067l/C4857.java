package p067l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.ۖܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4857 implements FileAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC21426 f11045a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC21426 interfaceC21426 = this.f11045a;
        if (obj instanceof C4857) {
            obj = ((C4857) obj).f11045a;
        }
        return interfaceC21426.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f11045a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f11045a.name();
    }
}
