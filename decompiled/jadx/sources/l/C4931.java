package l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۙ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P50M */
/* JADX INFO: loaded from: classes2.dex */
public final class C4931 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13334 f15559;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C13334[] f15560;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C13334 f15561;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String[] f15562;

    public C4931() {
    }

    public C4931(C13334 c13334, C13334 c13335, C13334[] c13334Arr, String[] strArr) {
        this.f15561 = c13334;
        this.f15559 = c13335;
        this.f15560 = c13334Arr;
        this.f15562 = strArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C4931 m14372(C1403 c1403) {
        int length = this.f15560.length;
        C13334[] c13334Arr = new C13334[length];
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            c13334Arr[i] = this.f15560[i].mo5437(c1403);
            strArr[i] = this.f15562[i];
        }
        return new C4931(this.f15561.mo5437(c1403), this.f15559.mo5437(c1403), c13334Arr, strArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C20087.m46306(".catch ", this.f15561.m32315(), " - ", this.f15559.m32315(), " : "));
        for (int i = 0; i < this.f15560.length; i++) {
            String str = this.f15562[i];
            if (str == null) {
                str = ProviderConfigurationPermission.ALL_STR;
            }
            sb.append(str);
            sb.append(" > ");
            sb.append(this.f15560[i].m32315());
            sb.append(",");
        }
        return sb.toString();
    }
}
