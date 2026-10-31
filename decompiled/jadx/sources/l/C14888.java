package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14888 extends AbstractC5717 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f45439;

    @Override // l.AbstractC5717
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo1019(float f, long j, View view, C14867 c14867) {
        Method method;
        if (view instanceof C10075) {
            ((C10075) view).m25321(m16150(f, j, view, c14867));
        } else {
            if (this.f45439) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f45439 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m16150(f, j, view, c14867)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
        return this.f17634;
    }
}
