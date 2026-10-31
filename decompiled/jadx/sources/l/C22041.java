package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹ۘܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: VB9Q */
/* JADX INFO: loaded from: classes.dex */
public final class C22041 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f70654;

    public C22041(int i) {
        InterfaceC9775 c4130;
        this.f70654 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList = this.f70654;
            if (i <= 3072) {
                c4130 = new C22746(i);
            } else {
                c4130 = new C4130();
            }
            arrayList.add(c4130);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49588(int i, int i2) {
        InterfaceC9775 c4130;
        int iMax = Math.max(i, i2) + 1;
        ArrayList arrayList = this.f70654;
        arrayList.ensureCapacity(iMax);
        for (int size = arrayList.size(); size < iMax; size++) {
            if (iMax <= 3072) {
                c4130 = new C22746(iMax);
            } else {
                c4130 = new C4130();
            }
            arrayList.add(c4130);
        }
        ((InterfaceC9775) arrayList.get(i)).add(i2);
        ((InterfaceC9775) arrayList.get(i2)).add(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49589(int i, InterfaceC9775 interfaceC9775) {
        ArrayList arrayList = this.f70654;
        if (i < arrayList.size()) {
            interfaceC9775.mo12405((InterfaceC9775) arrayList.get(i));
        }
    }
}
