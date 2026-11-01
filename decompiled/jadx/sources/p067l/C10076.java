package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.۠ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C10076 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 f27968;

    /* JADX INFO: renamed from: ۧ */
    public final C13010 f27969;

    /* JADX INFO: renamed from: ܳ */
    public final long f27970;

    /* JADX INFO: renamed from: ܽ */
    public final String f27971;

    /* JADX INFO: renamed from: ܿ */
    public final boolean f27972;

    /* JADX INFO: renamed from: ᩳ */
    public final int f27973;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC15599 f27974;

    public C10076(int i, C13010 c13010, InterfaceC19370 interfaceC19370, long j, String str, boolean z, AbstractC15599 abstractC15599) {
        this.f27973 = i;
        this.f27969 = c13010;
        this.f27968 = interfaceC19370;
        this.f27970 = j;
        this.f27971 = str;
        this.f27972 = z;
        this.f27974 = abstractC15599;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10076)) {
            return false;
        }
        C10076 c10076 = (C10076) obj;
        return this.f27972 == c10076.f27972 && this.f27973 == c10076.f27973 && this.f27970 == c10076.f27970 && C12826.equals(this.f27969, c10076.f27969) && C12826.equals(this.f27968, c10076.f27968) && C12826.equals(this.f27971, c10076.f27971) && C12826.equals(this.f27974, c10076.f27974);
    }

    public final int hashCode() {
        int iM14441 = C6316.m14441(this.f27972 ? 1231 : 1237, 31, this.f27973, 31);
        long j = this.f27970;
        return C12826.hashCode(this.f27974) + C21720.m49003((C12826.hashCode(this.f27968) + ((C12826.hashCode(this.f27969) + ((iM14441 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31, 31, this.f27971);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f27973), this.f27969, this.f27968, Long.valueOf(this.f27970), this.f27971, Boolean.valueOf(this.f27972), this.f27974};
        String[] strArrSplit = "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".length() == 0 ? new String[0] : "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C10076.class, sb, "[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC19370 m23536() {
        return this.f27968;
    }

    /* JADX INFO: renamed from: ۖ */
    public final AbstractC15599 m23537() {
        return this.f27974;
    }

    /* JADX INFO: renamed from: ۜ */
    public final long m23538() {
        return this.f27970;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m23539() {
        return this.f27973;
    }

    /* JADX INFO: renamed from: ܽ */
    public final C13010 m23540() {
        return this.f27969;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m23541() {
        return this.f27971;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m23542() {
        return this.f27972;
    }
}
