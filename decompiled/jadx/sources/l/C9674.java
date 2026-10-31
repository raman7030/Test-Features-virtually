package l;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: l.ۢܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C9674 implements FileAttribute {
    public final /* synthetic */ InterfaceC22168 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC22168 interfaceC22168 = this.a;
        if (obj instanceof C9674) {
            obj = ((C9674) obj).a;
        }
        return interfaceC22168.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
