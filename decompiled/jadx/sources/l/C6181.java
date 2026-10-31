package l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۛܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8NU */
/* JADX INFO: loaded from: classes2.dex */
public final class C6181 {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C6181 f18976 = new C6181(new C13312[0]);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f18977;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f18978;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 f18979;

    static {
        C3603.m11056(0);
    }

    public C6181(C13312... c13312Arr) {
        AbstractC14545 abstractC14545M34733 = AbstractC14545.m34733(c13312Arr);
        this.f18979 = abstractC14545M34733;
        this.f18978 = c13312Arr.length;
        int i = 0;
        while (i < abstractC14545M34733.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < abstractC14545M34733.size(); i3++) {
                if (((C13312) abstractC14545M34733.get(i)).equals(abstractC14545M34733.get(i3))) {
                    C19956.m46034("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13312 m17102(int i) {
        return (C13312) this.f18979.get(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m17101(C13312 c13312) {
        int iIndexOf = this.f18979.indexOf(c13312);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC14545 m17103() {
        return AbstractC14545.copyOf((Collection) C7470.m20014(this.f18979, new C15942(6)));
    }

    public final int hashCode() {
        if (this.f18977 == 0) {
            this.f18977 = this.f18979.hashCode();
        }
        return this.f18977;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6181.class == obj.getClass()) {
            C6181 c6181 = (C6181) obj;
            if (this.f18978 == c6181.f18978 && this.f18979.equals(c6181.f18979)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f18979.toString();
    }
}
