package p067l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.ܺܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17596 implements InterfaceC21426 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttributeView f52589a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.f52589a;
        if (obj instanceof C17596) {
            obj = ((C17596) obj).f52589a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f52589a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f52589a.name();
    }
}
