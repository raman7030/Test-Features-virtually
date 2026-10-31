package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.media.AudioFormat;
import android.os.Build;

/* JADX INFO: renamed from: l.ۧۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8S0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10929 implements InterfaceC14455 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f32842;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Boolean f32843;

    public C10929(ContextWrapper contextWrapper) {
        this.f32842 = contextWrapper.getApplicationContext();
    }

    @Override // l.InterfaceC14455
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C15927 mo27246(C18231 c18231, C8353 c8353) {
        boolean zBooleanValue;
        c8353.getClass();
        int i = c8353.f25624;
        c18231.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return C15927.f49192;
        }
        Boolean bool = this.f32843;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            Context context = this.f32842;
            if (context != null) {
                String parameters = C2171.m7181(context).getParameters("offloadVariableRateSupported");
                this.f32843 = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f32843 = Boolean.FALSE;
            }
            zBooleanValue = this.f32843.booleanValue();
        }
        String str = c8353.f25614;
        str.getClass();
        int iM24805 = C9786.m24805(str, c8353.f25619);
        if (iM24805 == 0 || i2 < C3603.m10998(iM24805)) {
            return C15927.f49192;
        }
        int iM11035 = C3603.m11035(c8353.f25625);
        if (iM11035 == 0) {
            return C15927.f49192;
        }
        try {
            AudioFormat audioFormatM11040 = C3603.m11040(i, iM11035, iM24805);
            if (i2 >= 31) {
                return C1756.m5878(audioFormatM11040, c18231.m42474().f51620, zBooleanValue);
            }
            return C7461.m19985(audioFormatM11040, c18231.m42474().f51620, zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return C15927.f49192;
        }
    }
}
