package l;

import java.nio.file.Watchable;

/* JADX INFO: renamed from: l.ܶ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15505 implements InterfaceC4923 {
    public final /* synthetic */ Watchable a;

    public /* synthetic */ C15505(Watchable watchable) {
        this.a = watchable;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Watchable watchable = this.a;
        if (obj instanceof C15505) {
            obj = ((C15505) obj).a;
        }
        return watchable.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC4923
    public final /* synthetic */ InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr) {
        return C2807.a(this.a.register(C1395.b(interfaceC5235), AbstractC22791.L(interfaceC18641Arr)));
    }

    @Override // l.InterfaceC4923
    public final /* synthetic */ InterfaceC0295 register(InterfaceC5235 interfaceC5235, InterfaceC18641[] interfaceC18641Arr, InterfaceC19347[] interfaceC19347Arr) {
        return C2807.a(this.a.register(C1395.b(interfaceC5235), AbstractC22791.L(interfaceC18641Arr), AbstractC22791.M(interfaceC19347Arr)));
    }
}
