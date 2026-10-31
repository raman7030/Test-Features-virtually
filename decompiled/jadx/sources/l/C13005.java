package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5I3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13005 extends AbstractC8185 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4060 f38932;

    public C13005(InterfaceC4060 interfaceC4060) {
        this.f38932 = interfaceC4060;
    }

    @Override // l.InterfaceC20288
    public final List getValue() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C4539(this));
        InterfaceC4060 interfaceC4060 = this.f38932;
        arrayList.add(new C5492(interfaceC4060.mo12183()));
        arrayList.add(new C3128(this));
        arrayList.addAll(interfaceC4060.mo12181());
        return arrayList;
    }
}
