package p067l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛ֡ */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C1125 extends AbstractC1552 {

    /* JADX INFO: renamed from: ᩻ */
    public boolean f20403;

    @Override // p067l.AbstractC1552
    /* JADX INFO: renamed from: ֫ */
    public final void mo7704(float f, View view) {
        Method method;
        if (view instanceof C1342) {
            ((C1342) view).m27340(m36265(f));
            return;
        }
        if (this.f20403) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f20403 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m36265(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
