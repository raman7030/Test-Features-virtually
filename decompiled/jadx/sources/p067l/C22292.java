package p067l;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: l.᩷ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C22292 implements InterfaceC23437 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileAttribute f70425a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.f70425a;
        if (obj instanceof C22292) {
            obj = ((C22292) obj).f70425a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f70425a.hashCode();
    }

    @Override // p067l.InterfaceC23437
    public final /* synthetic */ String name() {
        return this.f70425a.name();
    }

    @Override // p067l.InterfaceC23437
    public final /* synthetic */ Object value() {
        return this.f70425a.value();
    }
}
