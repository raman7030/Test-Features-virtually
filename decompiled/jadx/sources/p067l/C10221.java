package p067l;

import java.io.IOException;
import java.nio.file.attribute.PosixFileAttributeView;

/* JADX INFO: renamed from: l.۠ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10221 implements InterfaceC18267, InterfaceC20951 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PosixFileAttributeView f28336a;

    public /* synthetic */ C10221(PosixFileAttributeView posixFileAttributeView) {
        this.f28336a = posixFileAttributeView;
    }

    @Override // p067l.InterfaceC18267
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo21481a(C6673 c6673, C6673 c6674, C6673 c6675) throws IOException {
        this.f28336a.setTimes(AbstractC24029.m53246o(c6673), AbstractC24029.m53246o(c6674), AbstractC24029.m53246o(c6675));
    }

    @Override // p067l.InterfaceC20951
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo14047b(InterfaceC13379 interfaceC13379) throws IOException {
        this.f28336a.setOwner(C12038.m27552a(interfaceC13379));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        PosixFileAttributeView posixFileAttributeView = this.f28336a;
        if (obj instanceof C10221) {
            obj = ((C10221) obj).f28336a;
        }
        return posixFileAttributeView.equals(obj);
    }

    @Override // p067l.InterfaceC20951
    public final /* synthetic */ InterfaceC13379 getOwner() {
        return C21621.m48825a(this.f28336a.getOwner());
    }

    public final /* synthetic */ int hashCode() {
        return this.f28336a.hashCode();
    }

    @Override // p067l.InterfaceC24107
    public final /* synthetic */ String name() {
        return this.f28336a.name();
    }

    @Override // p067l.InterfaceC18267
    public final /* synthetic */ InterfaceC16730 readAttributes() {
        return C19609.m44513a(this.f28336a.readAttributes());
    }
}
