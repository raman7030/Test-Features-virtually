package p067l;

import java.util.Collection;

/* JADX INFO: renamed from: l.ۛܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8NU */
/* JADX INFO: loaded from: classes2.dex */
public final class C8243 {

    /* JADX INFO: renamed from: ᩳ */
    public static final C8243 f21835 = new C8243(new C15020[0]);

    /* JADX INFO: renamed from: ֫ */
    public int f21836;

    /* JADX INFO: renamed from: ۧ */
    public final int f21837;

    /* JADX INFO: renamed from: ܽ */
    public final AbstractC16192 f21838;

    static {
        C5792.m13032(0);
    }

    public C8243(C15020... c15020Arr) {
        AbstractC16192 abstractC16192M36882 = AbstractC16192.m36882(c15020Arr);
        this.f21838 = abstractC16192M36882;
        this.f21837 = c15020Arr.length;
        int i = 0;
        while (i < abstractC16192M36882.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < abstractC16192M36882.size(); i3++) {
                if (((C15020) abstractC16192M36882.get(i)).equals(abstractC16192M36882.get(i3))) {
                    C21334.m48348("", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15020 m19034(int i) {
        return (C15020) this.f21838.get(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m19033(C15020 c15020) {
        int iIndexOf = this.f21838.indexOf(c15020);
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC16192 m19035() {
        return AbstractC16192.copyOf((Collection) C9468.m21989(this.f21838, new C17520(6)));
    }

    public final int hashCode() {
        if (this.f21836 == 0) {
            this.f21836 = this.f21838.hashCode();
        }
        return this.f21836;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8243.class == obj.getClass()) {
            C8243 c8243 = (C8243) obj;
            if (this.f21837 == c8243.f21837 && this.f21838.equals(c8243.f21838)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f21838.toString();
    }
}
