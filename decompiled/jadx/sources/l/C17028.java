package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17028 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC10679 f52201;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f52202;

    public C17028(int i, int i2) {
        this.f52201 = EnumC10679.values()[i];
        this.f52202 = i2;
    }

    public C17028(EnumC10679 enumC10679, int i) {
        this.f52201 = enumC10679;
        this.f52202 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m39990() {
        return this.f52201.m26809();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m39989() {
        return this.f52202;
    }

    public final String toString() {
        String strM9831;
        StringBuilder sb = new StringBuilder();
        EnumC10679 enumC10679 = this.f52201;
        sb.append(enumC10679.m26808());
        if (enumC10679.f32152 == 3) {
            strM9831 = C3200.m9831(this.f52202, l.d, new StringBuilder("{"));
        } else {
            strM9831 = "";
        }
        sb.append(strM9831);
        return sb.toString();
    }
}
