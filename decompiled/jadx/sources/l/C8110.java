package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۠ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8110 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f25059;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11197 f25060;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f25061;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f25062;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean f25063;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f25064;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f25065;

    public C8110(int i, C11197 c11197, InterfaceC17889 interfaceC17889, long j, String str, boolean z, AbstractC13921 abstractC13921) {
        this.f25064 = i;
        this.f25060 = c11197;
        this.f25059 = interfaceC17889;
        this.f25061 = j;
        this.f25062 = str;
        this.f25063 = z;
        this.f25065 = abstractC13921;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8110)) {
            return false;
        }
        C8110 c8110 = (C8110) obj;
        return this.f25063 == c8110.f25063 && this.f25064 == c8110.f25064 && this.f25061 == c8110.f25061 && C11003.equals(this.f25060, c8110.f25060) && C11003.equals(this.f25059, c8110.f25059) && C11003.equals(this.f25062, c8110.f25062) && C11003.equals(this.f25065, c8110.f25065);
    }

    public final int hashCode() {
        int iM12551 = C4153.m12551(this.f25063 ? 1231 : 1237, 31, this.f25064, 31);
        long j = this.f25061;
        return C11003.hashCode(this.f25065) + C20361.m46680((C11003.hashCode(this.f25059) + ((C11003.hashCode(this.f25060) + ((iM12551 + ((int) (j ^ (j >>> 32)))) * 31)) * 31)) * 31, 31, this.f25062);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f25064), this.f25060, this.f25059, Long.valueOf(this.f25061), this.f25062, Boolean.valueOf(this.f25063), this.f25065};
        String[] strArrSplit = "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".length() == 0 ? new String[0] : "requestToken;mediaItem;fileItem;startPosition;playbackPositionKey;skipRememberedSubtitleFileRestore;subtitleVisitor".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8110.class, sb, "[");
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 m21568() {
        return this.f25059;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 m21569() {
        return this.f25065;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long m21570() {
        return this.f25061;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m21571() {
        return this.f25064;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C11197 m21572() {
        return this.f25060;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m21573() {
        return this.f25062;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m21574() {
        return this.f25063;
    }
}
