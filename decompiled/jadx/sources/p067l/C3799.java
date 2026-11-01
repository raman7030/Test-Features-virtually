package p067l;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.֫֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 47F8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3799 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public ArrayList f8141 = new ArrayList();

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7413(C18551 c18551) {
        this.f8141.add(c18551);
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        ArrayList<C18551> arrayList = this.f8141;
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811(arrayList.size());
        for (C18551 c18551 : arrayList) {
            c8121.m18811(c18551.m42235());
            c8121.m18811(c18551.m42234());
        }
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return (this.f8141.size() * 2) + 1;
    }

    public final String toString() {
        ArrayList arrayList = this.f8141;
        return arrayList.size() > 0 ? C10965.m25286(new StringBuilder("{ "), (String) C7480.stream(arrayList).map(new C9325(0)).collect(C24205.joining(", ")), " }") : "";
    }
}
