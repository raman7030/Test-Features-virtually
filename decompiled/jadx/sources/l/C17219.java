package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿ۠ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final class C17219 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f52825;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC20541 f52826;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14396 f52827;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C14396 f52828;

    public C17219(EnumC20541 enumC20541, C14396 c14396, C14396 c14397, String str) {
        this.f52826 = enumC20541;
        this.f52827 = c14396;
        this.f52828 = c14397;
        this.f52825 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17219)) {
            return false;
        }
        C17219 c17219 = (C17219) obj;
        return C11003.equals(this.f52826, c17219.f52826) && C11003.equals(this.f52827, c17219.f52827) && C11003.equals(this.f52828, c17219.f52828) && C11003.equals(this.f52825, c17219.f52825);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f52825) + ((C11003.hashCode(this.f52828) + ((C11003.hashCode(this.f52827) + (C11003.hashCode(this.f52826) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f52826, this.f52827, this.f52828, this.f52825};
        String[] strArrSplit = "containerType;initialization;media;bitmapCacheKey".length() == 0 ? new String[0] : "containerType;initialization;media;bitmapCacheKey".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C17219.class, sb, "[");
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
}
