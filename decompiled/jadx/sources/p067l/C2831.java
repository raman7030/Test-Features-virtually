package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.֡ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YS */
/* JADX INFO: loaded from: classes2.dex */
public final class C2831 {

    /* JADX INFO: renamed from: ֫ */
    public int f4867;

    /* JADX INFO: renamed from: ۧ */
    public C2831 f4868;

    /* JADX INFO: renamed from: ܳ */
    public final String f4869;

    /* JADX INFO: renamed from: ܽ */
    public C9342 f4870;

    /* JADX INFO: renamed from: ܿ */
    public HashSet f4871 = null;

    /* JADX INFO: renamed from: ᩳ */
    public String f4872;

    public C2831(String str) {
        this.f4869 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4516(C2831 c2831) {
        if (this.f4871 == null) {
            this.f4871 = new HashSet();
        }
        this.f4871.add(c2831);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2831.class != obj.getClass()) {
            return false;
        }
        String str = ((C2831) obj).f4869;
        String str2 = this.f4869;
        if (str2 == null) {
            return str == null;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        String str = this.f4869;
        return (str == null ? 0 : str.hashCode()) + 31;
    }

    public final String toString() {
        return "" + this.f4869;
    }
}
