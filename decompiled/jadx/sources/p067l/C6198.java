package p067l;

import java.io.IOException;
import java.nio.file.attribute.FileOwnerAttributeView;

/* JADX INFO: renamed from: l.ۘܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6198 implements InterfaceC20951 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FileOwnerAttributeView f15613a;

    @Override // p067l.InterfaceC20951
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo14047b(InterfaceC13379 interfaceC13379) throws IOException {
        this.f15613a.setOwner(C12038.m27552a(interfaceC13379));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileOwnerAttributeView fileOwnerAttributeView = this.f15613a;
        if (obj instanceof C6198) {
            obj = ((C6198) obj).f15613a;
        }
        return fileOwnerAttributeView.equals(obj);
    }

    @Override // p067l.InterfaceC20951
    public final /* synthetic */ InterfaceC13379 getOwner() {
        return C21621.m48825a(this.f15613a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f15613a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f15613a.name();
    }
}
