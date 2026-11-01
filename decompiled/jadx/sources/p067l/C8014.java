package p067l;

import java.io.IOException;
import java.nio.file.attribute.AclFileAttributeView;

/* JADX INFO: renamed from: l.ۛ۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8014 implements InterfaceC20951 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AclFileAttributeView f21090a;

    @Override // p067l.InterfaceC20951
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo14047b(InterfaceC13379 interfaceC13379) throws IOException {
        this.f21090a.setOwner(C12038.m27552a(interfaceC13379));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.f21090a;
        if (obj instanceof C8014) {
            obj = ((C8014) obj).f21090a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // p067l.InterfaceC20951
    public final /* synthetic */ InterfaceC13379 getOwner() {
        return C21621.m48825a(this.f21090a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f21090a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f21090a.name();
    }
}
