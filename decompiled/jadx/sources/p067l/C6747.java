package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ۙۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6747 extends AbstractC15010 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f17499;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f17500;

    /* JADX INFO: renamed from: ܽ */
    public final int f17501;

    /* JADX INFO: renamed from: ᩳ */
    public final int f17502;

    public C6747(int i, int i2, boolean z, boolean z2) {
        this.f17502 = i;
        this.f17501 = i2;
        this.f17500 = z;
        this.f17499 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6747)) {
            return false;
        }
        C6747 c6747 = (C6747) obj;
        return this.f17500 == c6747.f17500 && this.f17499 == c6747.f17499 && this.f17502 == c6747.f17502 && this.f17501 == c6747.f17501;
    }

    public final int hashCode() {
        return ((((((this.f17500 ? 1231 : 1237) * 31) + (this.f17499 ? 1231 : 1237)) * 31) + this.f17502) * 31) + this.f17501;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f17502), Integer.valueOf(this.f17501), Boolean.valueOf(this.f17500), Boolean.valueOf(this.f17499)};
        String[] strArrSplit = "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".length() == 0 ? new String[0] : "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".split(C0249l.f1196b);
        StringBuilder sb = new StringBuilder();
        C6406.m14673(C6747.class, sb, "[");
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
    public final boolean m15406() {
        return this.f17499;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m15407() {
        return this.f17502;
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m15408() {
        return this.f17500;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m15409() {
        return this.f17501;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15405(C6747 c6747, int i) {
        int i2 = c6747.f17501;
        int i3 = c6747.f17502;
        if (c6747.f17499) {
            if (i == 0 || i3 < 0 || i2 < i3 || i2 >= i) {
                throw new IllegalArgumentException("Invalid history range selection");
            }
            return;
        }
        if (i3 < 0 || i3 != i2 || i3 > i || (i3 == i && !c6747.f17500)) {
            throw new IllegalArgumentException("Invalid history cursor selection");
        }
    }
}
