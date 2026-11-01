package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۛ᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 473S */
/* JADX INFO: loaded from: classes3.dex */
public final class C8324 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final String f22266;

    /* JADX INFO: renamed from: ۧ */
    public final Exception f22267;

    /* JADX INFO: renamed from: ܽ */
    public final EnumC12487 f22268;

    public C8324(EnumC12487 enumC12487, String str, Exception exc) {
        this.f22268 = enumC12487;
        this.f22266 = str;
        this.f22267 = exc;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8324)) {
            return false;
        }
        C8324 c8324 = (C8324) obj;
        return C12826.equals(this.f22268, c8324.f22268) && C12826.equals(this.f22266, c8324.f22266) && C12826.equals(this.f22267, c8324.f22267);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f22267) + C21720.m49003(C12826.hashCode(this.f22268) * 31, 31, this.f22266);
    }

    public final String toString() {
        Object[] objArr = {this.f22268, this.f22266, this.f22267};
        String[] strArrSplit = "status;entryName;error".length() == 0 ? new String[0] : "status;entryName;error".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C8324.class, sb, "[");
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
    public final String m19212() {
        return this.f22266;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Exception m19213() {
        return this.f22267;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC12487 m19214() {
        return this.f22268;
    }
}
