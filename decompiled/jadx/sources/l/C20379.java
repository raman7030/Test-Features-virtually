package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes5.dex */
public final class C20379 implements InterfaceC5562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f65778;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f65779;

    public C20379(boolean z, String str) {
        this.f65778 = z;
        this.f65779 = str;
    }

    @Override // l.InterfaceC5562
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4662(AbstractC19261 abstractC19261) {
        int i;
        boolean z = this.f65778;
        String strMo1457 = this.f65779;
        if (z && strMo1457 == null) {
            strMo1457 = abstractC19261.mo1457();
        }
        InterfaceC3738 interfaceC3738 = abstractC19261.f16091;
        if (interfaceC3738 != null) {
            Iterator it = interfaceC3738.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC19261 abstractC19262 = (AbstractC19261) ((C5149) it.next());
                if (strMo1457 == null || abstractC19262.mo1457().equals(strMo1457)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f65778 ? C4860.m14172("only-of-type <", this.f65779, ">") : "only-child";
    }
}
