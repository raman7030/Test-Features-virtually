package p067l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5I3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14728 extends AbstractC10147 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC6227 f41979;

    public C14728(InterfaceC6227 interfaceC6227) {
        this.f41979 = interfaceC6227;
    }

    @Override // p067l.InterfaceC21650
    public final List getValue() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C6682(this));
        InterfaceC6227 interfaceC6227 = this.f41979;
        arrayList.add(new C7588(interfaceC6227.mo14104()));
        arrayList.add(new C5341(this));
        arrayList.addAll(interfaceC6227.mo14102());
        return arrayList;
    }
}
