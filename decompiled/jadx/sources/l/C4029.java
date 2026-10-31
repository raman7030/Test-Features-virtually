package l;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: renamed from: l.ۘܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4029 implements InterfaceC19552 {
    public final /* synthetic */ FileOwnerAttributeView a;

    @Override // l.InterfaceC19552
    public final /* synthetic */ void b(InterfaceC11585 interfaceC11585) throws IOException {
        this.a.setOwner(C10174.a(interfaceC11585));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.a;
        if (obj instanceof C4029) {
            obj = ((C4029) obj).a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // l.InterfaceC19552
    public final /* synthetic */ InterfaceC11585 getOwner() {
        return C20257.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC22873
    public final /* synthetic */ String name() {
        return this.a.name();
    }
}
