package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.֨۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: GAQ7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3429 {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ int f6841;

    /* JADX INFO: renamed from: ۧ */
    public Object f6842;

    /* JADX INFO: renamed from: ֫ */
    public synchronized void m6084(ArrayList arrayList) {
        if (arrayList.size() < 4096 && ((C2582) this.f6842).m3889()) {
            arrayList.clear();
            ((C2582) this.f6842).m3890(arrayList);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public synchronized ArrayList m6085() {
        ArrayList arrayList;
        arrayList = (ArrayList) ((C2582) this.f6842).m3892();
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f6841) {
            case 1:
                return String.valueOf(this.f6842);
            default:
                return super.toString();
        }
    }

    public C3429() {
        this.f6841 = 0;
        this.f6842 = new C2582();
    }

    public C3429(C8177 c8177) {
        this.f6841 = 1;
        this.f6842 = c8177;
    }

    /* JADX INFO: renamed from: ֫ */
    public Object m6083() {
        return this.f6842;
    }
}
