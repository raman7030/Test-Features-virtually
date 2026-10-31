package l;

/* JADX INFO: renamed from: l.ۜۢۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8NG */
/* JADX INFO: loaded from: classes2.dex */
public final class C6682 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8799 f20766;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8799 f20767;

    public C6682(C8799 c8799, C8799 c87910) {
        this.f20766 = c8799;
        this.f20767 = c87910;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("[");
        C8799 c8799 = this.f20766;
        sb.append(c8799);
        C8799 c87910 = this.f20767;
        if (c8799.equals(c87910)) {
            str = "";
        } else {
            str = ", " + c87910;
        }
        return C9045.m23341(sb, str, "]");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C6682.class == obj.getClass()) {
            C6682 c6682 = (C6682) obj;
            if (this.f20766.equals(c6682.f20766) && this.f20767.equals(c6682.f20767)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20767.hashCode() + (this.f20766.hashCode() * 31);
    }
}
