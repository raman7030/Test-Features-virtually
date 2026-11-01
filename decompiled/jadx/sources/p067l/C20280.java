package p067l;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* JADX INFO: renamed from: l.ᩴܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C20280 implements FileOwnerAttributeView {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC20951 f62671a;

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC20951 interfaceC20951 = this.f62671a;
        if (obj instanceof C20280) {
            obj = ((C20280) obj).f62671a;
        }
        return interfaceC20951.equals(obj);
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ UserPrincipal getOwner() {
        return C12038.m27552a(this.f62671a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f62671a.hashCode();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.f62671a.name();
    }

    @Override // java.nio.file.attribute.FileOwnerAttributeView
    public final /* synthetic */ void setOwner(UserPrincipal userPrincipal) {
        this.f62671a.mo14047b(C21621.m48825a(userPrincipal));
    }
}
