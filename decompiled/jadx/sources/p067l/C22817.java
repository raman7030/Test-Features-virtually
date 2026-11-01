package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.᩸ۤۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C22817 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final C3844 f71873;

    /* JADX INFO: renamed from: ۧ */
    public final CharSequence f71874;

    /* JADX INFO: renamed from: ܽ */
    public final C6723 f71875;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC23487 f71876;

    public C22817(EnumC23487 enumC23487, CharSequence charSequence, C6723 c6723, C3844 c3844) {
        this.f71876 = enumC23487;
        this.f71874 = charSequence;
        this.f71875 = c6723;
        this.f71873 = c3844;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22817)) {
            return false;
        }
        C22817 c22817 = (C22817) obj;
        return C12826.equals(this.f71876, c22817.f71876) && C12826.equals(this.f71874, c22817.f71874) && C12826.equals(this.f71875, c22817.f71875) && C12826.equals(this.f71873, c22817.f71873);
    }

    public final int hashCode() {
        return C12826.hashCode(this.f71873) + ((C12826.hashCode(this.f71875) + ((C12826.hashCode(this.f71874) + (C12826.hashCode(this.f71876) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f71876, this.f71874, this.f71875, this.f71873};
        String[] strArrSplit = "type;title;trackOption;subtitleMatch".length() == 0 ? new String[0] : "type;title;trackOption;subtitleMatch".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C22817.class, sb, "[");
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
    public final C3844 m51019() {
        return this.f71873;
    }

    /* JADX INFO: renamed from: ܳ */
    public final EnumC23487 m51020() {
        return this.f71876;
    }

    /* JADX INFO: renamed from: ܽ */
    public final CharSequence m51021() {
        return this.f71874;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final C6723 m51022() {
        return this.f71875;
    }
}
