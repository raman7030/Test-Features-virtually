package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C3631 implements InterfaceC7655 {

    /* JADX INFO: renamed from: ֫ */
    public int f7552;

    /* JADX INFO: renamed from: ۧ */
    public int f7553;

    /* JADX INFO: renamed from: ܽ */
    public boolean f7554;

    /* JADX INFO: renamed from: ܿ */
    public String f7555;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f7556;

    public C3631(String str, int i, int i2, boolean z, boolean z2) {
        this.f7552 = i;
        this.f7553 = i2;
        this.f7554 = z;
        this.f7556 = z2;
        this.f7555 = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // p067l.InterfaceC7655
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo6894(AbstractC20674 abstractC20674) {
        int i;
        int i2;
        boolean z = this.f7556;
        String strMo3870 = this.f7555;
        if (z && strMo3870 == null) {
            strMo3870 = abstractC20674.mo3870();
        }
        InterfaceC5921 interfaceC5921 = abstractC20674.f18930;
        if (interfaceC5921 != null) {
            Iterator it = interfaceC5921.getChildren().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                AbstractC20674 abstractC20675 = (AbstractC20674) ((C7262) it.next());
                if (abstractC20675 == abstractC20674) {
                    i = i2;
                }
                if (strMo3870 == null || abstractC20675.mo3870().equals(strMo3870)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.f7554 ? i + 1 : i2 - i;
        int i4 = this.f7552;
        int i5 = this.f7553;
        if (i4 == 0) {
            if (i3 == i5) {
                return true;
            }
            return false;
        }
        int i6 = i3 - i5;
        if (i6 % i4 == 0 && (Integer.signum(i6) == 0 || Integer.signum(i6) == Integer.signum(i4))) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = this.f7554 ? "" : "last-";
        boolean z = this.f7556;
        int i = this.f7553;
        int i2 = this.f7552;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.f7555) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
