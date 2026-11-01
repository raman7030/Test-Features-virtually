package p067l;

import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;

/* JADX INFO: renamed from: l.ۙ᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P50M */
/* JADX INFO: loaded from: classes2.dex */
public final class C7055 {

    /* JADX INFO: renamed from: ֫ */
    public C15041 f18391;

    /* JADX INFO: renamed from: ۧ */
    public C15041[] f18392;

    /* JADX INFO: renamed from: ܽ */
    public C15041 f18393;

    /* JADX INFO: renamed from: ᩳ */
    public String[] f18394;

    public C7055() {
    }

    public C7055(C15041 c15041, C15041 c15042, C15041[] c15041Arr, String[] strArr) {
        this.f18393 = c15041;
        this.f18391 = c15042;
        this.f18392 = c15041Arr;
        this.f18394 = strArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7055 m16269(C3702 c3702) {
        int length = this.f18392.length;
        C15041[] c15041Arr = new C15041[length];
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            c15041Arr[i] = this.f18392[i].mo7667(c3702);
            strArr[i] = this.f18394[i];
        }
        return new C7055(this.f18393.mo7667(c3702), this.f18391.mo7667(c3702), c15041Arr, strArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C21459.m48622(".catch ", this.f18393.m34416(), " - ", this.f18391.m34416(), " : "));
        for (int i = 0; i < this.f18392.length; i++) {
            String str = this.f18394[i];
            if (str == null) {
                str = ProviderConfigurationPermission.ALL_STR;
            }
            sb.append(str);
            sb.append(" > ");
            sb.append(this.f18392[i].m34416());
            sb.append(",");
        }
        return sb.toString();
    }
}
