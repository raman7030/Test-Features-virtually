package l;

import java.nio.file.attribute.FileAttribute;

/* JADX INFO: renamed from: l.᩷ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C20963 implements InterfaceC22168 {
    public final /* synthetic */ FileAttribute a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttribute fileAttribute = this.a;
        if (obj instanceof C20963) {
            obj = ((C20963) obj).a;
        }
        return fileAttribute.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22168
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // l.InterfaceC22168
    public final /* synthetic */ Object value() {
        return this.a.value();
    }
}
