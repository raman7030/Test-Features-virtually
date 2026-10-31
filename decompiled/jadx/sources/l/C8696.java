package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAIH */
/* JADX INFO: loaded from: classes3.dex */
public final class C8696 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f26482;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f26483;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f26484;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f26485;

    public C8696(AbstractC15440 abstractC15440, boolean z, long j, long j2) {
        this.f26482 = abstractC15440;
        this.f26485 = z;
        this.f26484 = j;
        this.f26483 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8696)) {
            return false;
        }
        C8696 c8696 = (C8696) obj;
        return this.f26485 == c8696.f26485 && this.f26484 == c8696.f26484 && this.f26483 == c8696.f26483 && C11003.equals(this.f26482, c8696.f26482);
    }

    public final int hashCode() {
        int i = this.f26485 ? 1231 : 1237;
        long j = this.f26484;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f26483;
        return C11003.hashCode(this.f26482) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final long length() {
        return this.f26484;
    }

    public final String toString() {
        Object[] objArr = {this.f26482, Boolean.valueOf(this.f26485), Long.valueOf(this.f26484), Long.valueOf(this.f26483)};
        String[] strArrSplit = "file;regularFile;length;lastModified".length() == 0 ? new String[0] : "file;regularFile;length;lastModified".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C8696.class, sb, "[");
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
    public final AbstractC15440 m22478() {
        return this.f26482;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long m22479() {
        return this.f26483;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m22480() {
        return this.f26485;
    }
}
