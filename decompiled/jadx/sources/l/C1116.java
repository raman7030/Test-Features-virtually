package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAQ7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1116 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f4070;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f4071;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public synchronized void m3827(ArrayList arrayList) {
        if (arrayList.size() < 4096 && ((C0225) this.f4071).m1476()) {
            arrayList.clear();
            ((C0225) this.f4071).m1477(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public synchronized ArrayList m3828() {
        ArrayList arrayList;
        arrayList = (ArrayList) ((C0225) this.f4071).m1479();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f4070) {
            case 1:
                return String.valueOf(this.f4071);
            default:
                return super.toString();
        }
    }

    public C1116() {
        this.f4070 = 0;
        this.f4071 = new C0225();
    }

    public C1116(C6112 c6112) {
        this.f4070 = 1;
        this.f4071 = c6112;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Object m3826() {
        return this.f4071;
    }
}
