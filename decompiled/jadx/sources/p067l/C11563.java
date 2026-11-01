package p067l;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: l.ۢܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11563 implements FileAttribute {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC23437 f32227a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC23437 interfaceC23437 = this.f32227a;
        if (obj instanceof C11563) {
            obj = ((C11563) obj).f32227a;
        }
        return interfaceC23437.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f32227a.hashCode();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ String name() {
        return this.f32227a.name();
    }

    @Override // java.nio.file.attribute.FileAttribute
    public final /* synthetic */ Object value() {
        return this.f32227a.value();
    }
}
