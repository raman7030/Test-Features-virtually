package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧۗۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C10726 extends AbstractC13301 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC17889 f32312;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f32313;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f32314;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f32315;

    public C10726(InterfaceC17889 interfaceC17889, String str, boolean z, int i) {
        this.f32312 = interfaceC17889;
        this.f32313 = str;
        this.f32315 = z;
        this.f32314 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10726)) {
            return false;
        }
        C10726 c10726 = (C10726) obj;
        return this.f32315 == c10726.f32315 && this.f32314 == c10726.f32314 && C11003.equals(this.f32312, c10726.f32312) && C11003.equals(this.f32313, c10726.f32313);
    }

    public final int hashCode() {
        return C11003.hashCode(this.f32313) + ((C11003.hashCode(this.f32312) + C4153.m12551(this.f32315 ? 1231 : 1237, 31, this.f32314, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f32312, this.f32313, Boolean.valueOf(this.f32315), Integer.valueOf(this.f32314)};
        String[] strArrSplit = "fileItem;mimeType;sameBaseName;priority".length() == 0 ? new String[0] : "fileItem;mimeType;sameBaseName;priority".split(l.b);
        StringBuilder sb = new StringBuilder();
        C4248.m12793(C10726.class, sb, "[");
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
    public final InterfaceC17889 m26911() {
        return this.f32312;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m26912() {
        return this.f32315;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m26913() {
        return this.f32313;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m26914() {
        return this.f32314;
    }
}
