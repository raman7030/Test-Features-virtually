package p067l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ܶ֨ */
/* JADX INFO: compiled from: V1D4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1581 extends AbstractC1126 {

    /* JADX INFO: renamed from: ۡ */
    public boolean f48554;

    @Override // p067l.AbstractC1126
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo3415(float f, long j, View view, C1580 c1580) {
        Method method;
        if (view instanceof C1342) {
            ((C1342) view).m27340(m18069(f, j, view, c1580));
        } else {
            if (this.f48554) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f48554 = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(m18069(f, j, view, c1580)));
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            }
        }
        return this.f20479;
    }
}
