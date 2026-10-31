package l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1506 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ArrayList f5360 = new ArrayList();

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5187(C17028 c17028) {
        this.f5360.add(c17028);
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ArrayList<C17028> arrayList = this.f5360;
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882(arrayList.size());
        for (C17028 c17028 : arrayList) {
            c6053.m16882(c17028.m39990());
            c6053.m16882(c17028.m39989());
        }
    }

    @Override // l.InterfaceC1800
    public final int getLength() {
        return (this.f5360.size() * 2) + 1;
    }

    public final String toString() {
        ArrayList arrayList = this.f5360;
        return arrayList.size() > 0 ? C9045.m23341(new StringBuilder("{ "), (String) C5378.stream(arrayList).map(new C7320(0)).collect(C22976.joining(", ")), " }") : "";
    }
}
