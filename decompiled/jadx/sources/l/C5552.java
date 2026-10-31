package l;

/* JADX INFO: renamed from: l.ۚ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 98OO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5552 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f17166;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f17167;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17168;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f17169;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f17170;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f17171;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11197 f17172;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f17173;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f17174;

    public C5552(Object obj, int i, C11197 c11197, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f17173 = obj;
        this.f17171 = i;
        this.f17172 = c11197;
        this.f17174 = obj2;
        this.f17169 = i2;
        this.f17167 = j;
        this.f17170 = j2;
        this.f17166 = i3;
        this.f17168 = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5552.class == obj.getClass()) {
            C5552 c5552 = (C5552) obj;
            if (this.f17171 == c5552.f17171 && this.f17169 == c5552.f17169 && this.f17167 == c5552.f17167 && this.f17170 == c5552.f17170 && this.f17166 == c5552.f17166 && this.f17168 == c5552.f17168 && C11003.equals(this.f17172, c5552.f17172) && C11003.equals(this.f17173, c5552.f17173) && C11003.equals(this.f17174, c5552.f17174)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(this.f17173, Integer.valueOf(this.f17171), this.f17172, this.f17174, Integer.valueOf(this.f17169), Long.valueOf(this.f17167), Long.valueOf(this.f17170), Integer.valueOf(this.f17166), Integer.valueOf(this.f17168));
    }

    public final String toString() {
        String str = "mediaItem=" + this.f17171 + ", period=" + this.f17169 + ", pos=" + this.f17167;
        int i = this.f17166;
        if (i == -1) {
            return str;
        }
        StringBuilder sbM19190 = C7166.m19190(str, ", contentPos=");
        sbM19190.append(this.f17170);
        sbM19190.append(", adGroup=");
        sbM19190.append(i);
        sbM19190.append(", ad=");
        sbM19190.append(this.f17168);
        return sbM19190.toString();
    }

    static {
        C5368.m15341(0, 1, 2, 3, 4);
        C3603.m11056(5);
        C3603.m11056(6);
    }
}
