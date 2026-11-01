package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;

/* JADX INFO: renamed from: l.ܿ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes4.dex */
public final class C18551 {

    /* JADX INFO: renamed from: ֫ */
    public final EnumC12517 f55383;

    /* JADX INFO: renamed from: ۧ */
    public final int f55384;

    public C18551(int i, int i2) {
        this.f55383 = EnumC12517.values()[i];
        this.f55384 = i2;
    }

    public C18551(EnumC12517 enumC12517, int i) {
        this.f55383 = enumC12517;
        this.f55384 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m42235() {
        return this.f55383.m28848();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m42234() {
        return this.f55384;
    }

    public final String toString() {
        String strM11876;
        StringBuilder sb = new StringBuilder();
        EnumC12517 enumC12517 = this.f55383;
        sb.append(enumC12517.m28847());
        if (enumC12517.f35123 == 3) {
            strM11876 = C5410.m11876(this.f55384, C0249l.f1198d, new StringBuilder("{"));
        } else {
            strM11876 = "";
        }
        sb.append(strM11876);
        return sb.toString();
    }
}
