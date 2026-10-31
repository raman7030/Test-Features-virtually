package l;

import java.nio.file.attribute.FileAttributeView;

/* JADX INFO: renamed from: l.ܺܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C16022 implements InterfaceC20052 {
    public final /* synthetic */ FileAttributeView a;

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof C16022) {
            obj = ((C16022) obj).a;
        }
        return fileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22873
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
