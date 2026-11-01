package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB9Q */
/* JADX INFO: loaded from: classes.dex */
public final class C23316 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f73371;

    public C23316(int i) {
        InterfaceC11659 c6294;
        this.f73371 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.f73371;
            if (i <= 3072) {
                c6294 = new C23986(i);
            } else {
                c6294 = new C6294();
            }
            arrayList.add(c6294);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51924(int i, int i2) {
        InterfaceC11659 c6294;
        int iMax = Math.max(i, i2) + 1;
        ArrayList arrayList = this.f73371;
        arrayList.ensureCapacity(iMax);
        for (int size = arrayList.size(); size < iMax; size++) {
            if (iMax <= 3072) {
                c6294 = new C23986(iMax);
            } else {
                c6294 = new C6294();
            }
            arrayList.add(c6294);
        }
        ((InterfaceC11659) arrayList.get(i)).add(i2);
        ((InterfaceC11659) arrayList.get(i2)).add(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51925(int i, InterfaceC11659 interfaceC11659) {
        ArrayList arrayList = this.f73371;
        if (i < arrayList.size()) {
            interfaceC11659.mo14295((InterfaceC11659) arrayList.get(i));
        }
    }
}
