package p067l;

/* JADX INFO: renamed from: l.ۚܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBF2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7595 extends C19034 implements Comparable {

    /* JADX INFO: renamed from: ᩶ */
    public static final C7595 f19893 = new C7595(0);

    @Override // p067l.C19034, p067l.InterfaceC2940
    /* JADX INFO: renamed from: ֫ */
    public final String mo4819() {
        return m17546("", "");
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m17546(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < size; i++) {
            C2900 c2900 = (C2900) m43238(i);
            if (i != 0) {
                C21545.m48729(sb, ",\n", str, EnumC2483.f3919);
            }
            if (i == size - 1 && m17543()) {
                sb.append("<any>");
            } else {
                sb.append(c2900.m4675().mo4819());
            }
            sb.append(" -> ");
            int iM4673 = c2900.m4673();
            sb.append(iM4673 == ((char) iM4673) ? C16351.m37153(iM4673) : C16351.m37155(iM4673));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֨ */
    public final boolean m17543() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return ((C2900) m43238(size - 1)).m4675().equals(C14260.f40621);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17545(int i, C14260 c14260, int i2) {
        m43241(i, new C2900(c14260, i2));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C7595 c7595) {
        if (this == c7595) {
            return 0;
        }
        int size = size();
        int size2 = c7595.size();
        int iMin = Math.min(size, size2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C2900) m43238(i)).compareTo((C2900) c7595.m43238(i));
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
