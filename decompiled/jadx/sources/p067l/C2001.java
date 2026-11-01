package p067l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩻֨ */
/* JADX INFO: compiled from: H1CY */
/* JADX INFO: loaded from: classes.dex */
public final class C2001 extends AbstractC1791 {

    /* JADX INFO: renamed from: ܳ */
    public boolean f77781;

    @Override // p067l.AbstractC1791
    /* JADX INFO: renamed from: ֫ */
    public final void mo7386(float f, View view) {
        Method method;
        if (view instanceof C1342) {
            ((C1342) view).m27340(m46440(f));
            return;
        }
        if (this.f77781) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f77781 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m46440(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
