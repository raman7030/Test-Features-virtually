package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֨᩵ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: UB7S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1328 implements InterfaceC5562 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f4782;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f4783;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f4784;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f4785;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f4786;

    public C1328(String str, int i, int i2, boolean z, boolean z2) {
        this.f4782 = i;
        this.f4783 = i2;
        this.f4784 = z;
        this.f4786 = z2;
        this.f4785 = str;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0065 A[RETURN] */
    @Override // l.InterfaceC5562
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo4662(AbstractC19261 abstractC19261) {
        int i;
        int i2;
        boolean z = this.f4786;
        String strMo1457 = this.f4785;
        if (z && strMo1457 == null) {
            strMo1457 = abstractC19261.mo1457();
        }
        InterfaceC3738 interfaceC3738 = abstractC19261.f16091;
        if (interfaceC3738 != null) {
            Iterator it = interfaceC3738.getChildren().iterator();
            i = 0;
            i2 = 0;
            while (it.hasNext()) {
                AbstractC19261 abstractC19262 = (AbstractC19261) ((C5149) it.next());
                if (abstractC19262 == abstractC19261) {
                    i = i2;
                }
                if (strMo1457 == null || abstractC19262.mo1457().equals(strMo1457)) {
                    i2++;
                }
            }
        } else {
            i = 0;
            i2 = 1;
        }
        int i3 = this.f4784 ? i + 1 : i2 - i;
        int i4 = this.f4782;
        int i5 = this.f4783;
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
        String str = this.f4784 ? "" : "last-";
        boolean z = this.f4786;
        int i = this.f4783;
        int i2 = this.f4782;
        return z ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(i2), Integer.valueOf(i), this.f4785) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(i2), Integer.valueOf(i));
    }
}
