package p067l;

/* JADX INFO: renamed from: l.ۜۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes2.dex */
public final class C8719 {

    /* JADX INFO: renamed from: ֫ */
    public final C10731 f23641;

    /* JADX INFO: renamed from: ۧ */
    public final C10731 f23642;

    public C8719(C10731 c10731, C10731 c10732) {
        this.f23641 = c10731;
        this.f23642 = c10732;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C10731 c10731 = this.f23641;
        sb.append(c10731);
        C10731 c10732 = this.f23642;
        if (c10731.equals(c10732)) {
            str = "";
        } else {
            str = ", " + c10732;
        }
        return C10965.m25286(sb, str, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8719.class == obj.getClass()) {
            C8719 c8719 = (C8719) obj;
            if (this.f23641.equals(c8719.f23641) && this.f23642.equals(c8719.f23642)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23642.hashCode() + (this.f23641.hashCode() * 31);
    }
}
