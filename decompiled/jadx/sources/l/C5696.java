package l;

import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 71DP */
/* JADX INFO: loaded from: classes3.dex */
public final class C5696 extends AbstractC14307 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f17557;

    @Override // l.AbstractC14307
    /* JADX INFO: renamed from: ֫ */
    public final void mo5474(float f, View view) {
        Method method;
        if (view instanceof C10075) {
            ((C10075) view).m25321(m34132(f));
            return;
        }
        if (this.f17557) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f17557 = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(m34132(f)));
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
    }
}
