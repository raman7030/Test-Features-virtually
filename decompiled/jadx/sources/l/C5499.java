package l;

/* JADX INFO: renamed from: l.ۚܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5499 extends C17535 implements Comparable {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final C5499 f17054 = new C5499(0);

    @Override // l.C17535, l.InterfaceC0601
    /* JADX INFO: renamed from: ֫ */
    public final String mo2463() {
        return m15635("", "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m15635(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            C0559 c0559 = (C0559) m40978(i);
            if (i != 0) {
                C20177.m46410(sb, ",\n", str, EnumC0121.f1143);
            }
            if (i == size - 1 && m15632()) {
                sb.append("<any>");
            } else {
                sb.append(c0559.m2307().mo2463());
            }
            sb.append(" -> ");
            int iM2305 = c0559.m2305();
            sb.append(iM2305 == ((char) iM2305) ? C14712.m35006(iM2305) : C14712.m35008(iM2305));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m15632() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return ((C0559) m40978(size - 1)).m2307().equals(C12512.f37597);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15634(int i, C12512 c12512, int i2) {
        m40981(i, new C0559(c12512, i2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C5499 c5499) {
        if (this == c5499) {
            return 0;
        }
        int size = size();
        int size2 = c5499.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C0559) m40978(i)).compareTo((C0559) c5499.m40978(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }
}
