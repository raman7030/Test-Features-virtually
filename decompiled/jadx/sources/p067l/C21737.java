package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes5.dex */
public final class C21737 implements InterfaceC7655 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f68454;

    /* JADX INFO: renamed from: ۧ */
    public String f68455;

    public C21737(boolean z, String str) {
        this.f68454 = z;
        this.f68455 = str;
    }

    @Override // p067l.InterfaceC7655
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6894(AbstractC20674 abstractC20674) {
        int i;
        boolean z = this.f68454;
        String strMo3870 = this.f68455;
        if (z && strMo3870 == null) {
            strMo3870 = abstractC20674.mo3870();
        }
        InterfaceC5921 interfaceC5921 = abstractC20674.f18930;
        if (interfaceC5921 != null) {
            Iterator it = interfaceC5921.getChildren().iterator();
            i = 0;
            while (it.hasNext()) {
                AbstractC20674 abstractC20675 = (AbstractC20674) ((C7262) it.next());
                if (strMo3870 == null || abstractC20675.mo3870().equals(strMo3870)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.f68454 ? C6988.m16053("only-of-type <", this.f68455, ">") : "only-child";
    }
}
