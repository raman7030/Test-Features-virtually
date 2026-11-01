package p067l;

import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.ܶ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C17105 implements InterfaceC7048 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Watchable f50530a;

    public /* synthetic */ C17105(Watchable watchable) {
        this.f50530a = watchable;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.f50530a;
        if (obj instanceof C17105) {
            obj = ((C17105) obj).f50530a;
        }
        return watchable.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f50530a.hashCode();
    }

    @Override // p067l.InterfaceC7048
    public final /* synthetic */ InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr) {
        return C5037.m10742a(this.f50530a.register(C3695.m7126b(interfaceC7344), AbstractC24029.m53222L(interfaceC20085Arr)));
    }

    @Override // p067l.InterfaceC7048
    public final /* synthetic */ InterfaceC2649 register(InterfaceC7344 interfaceC7344, InterfaceC20085[] interfaceC20085Arr, InterfaceC20756[] interfaceC20756Arr) {
        return C5037.m10742a(this.f50530a.register(C3695.m7126b(interfaceC7344), AbstractC24029.m53222L(interfaceC20085Arr), AbstractC24029.m53223M(interfaceC20756Arr)));
    }
}
