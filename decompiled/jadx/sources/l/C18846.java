package l;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* JADX INFO: renamed from: l.ᩴܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18846 implements FileOwnerAttributeView {
    public final /* synthetic */ InterfaceC19552 a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC19552 interfaceC19552 = this.a;
        if (obj instanceof C18846) {
            obj = ((C18846) obj).a;
        }
        return interfaceC19552.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C10174.a(this.a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.a.b(C20257.a(userPrincipal));
    }
}
