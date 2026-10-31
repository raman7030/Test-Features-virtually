package l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.ۖܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2618 implements FileAttributeView {
    public final /* synthetic */ InterfaceC20052 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20052 interfaceC20052 = this.a;
        if (obj instanceof C2618) {
            obj = ((C2618) obj).a;
        }
        return interfaceC20052.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
