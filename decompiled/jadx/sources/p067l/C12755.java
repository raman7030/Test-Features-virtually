package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioFormat;
import android.os.Build;

/* JADX INFO: renamed from: l.ۧۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12755 implements InterfaceC16106 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f35820;

    /* JADX INFO: renamed from: ۧ */
    public Boolean f35821;

    public C12755(ContextWrapper contextWrapper) {
        this.f35820 = contextWrapper.getApplicationContext();
    }

    @Override // p067l.InterfaceC16106
    /* JADX INFO: renamed from: ֫ */
    public final C17505 mo29290(C19695 c19695, C10307 c10307) {
        boolean zBooleanValue;
        c10307.getClass();
        int i = c10307.f28538;
        c19695.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C17505.f52339;
        }
        Boolean bool = this.f35821;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f35820;
            if (context != null) {
                String parameters = C4431.m9260(context).getParameters("offloadVariableRateSupported");
                this.f35821 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f35821 = Boolean.FALSE;
            }
            zBooleanValue = this.f35821.booleanValue();
        }
        String str = c10307.f28528;
        str.getClass();
        int iM26820 = C11669.m26820(str, c10307.f28533);
        if (iM26820 == 0 || i2 < C5792.m12974(iM26820)) {
            return C17505.f52339;
        }
        int iM13011 = C5792.m13011(c10307.f28539);
        if (iM13011 == 0) {
            return C17505.f52339;
        }
        try {
            AudioFormat audioFormatM13016 = C5792.m13016(i, iM13011, iM26820);
            if (i2 >= 31) {
                return C4037.m8088(audioFormatM13016, c19695.m44733().f54801, zBooleanValue);
            }
            return C9459.m21960(audioFormatM13016, c19695.m44733().f54801, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C17505.f52339;
        }
    }
}
