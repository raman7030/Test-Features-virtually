package p067l;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩺᩻ */
/* JADX INFO: compiled from: Y55F */
/* JADX INFO: loaded from: classes.dex */
public final class MenuItemOnMenuItemClickListenerC1998 implements MenuItem.OnMenuItemClickListener {

    /* JADX INFO: renamed from: ᩶ */
    public static final Class[] f77677 = {MenuItem.class};

    /* JADX INFO: renamed from: ᩸ */
    public Method f77678;

    /* JADX INFO: renamed from: ᩹ */
    public Object f77679;

    public MenuItemOnMenuItemClickListenerC1998(Object obj, String str) {
        this.f77679 = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f77678 = cls.getMethod(str, f77677);
        } catch (Exception e) {
            StringBuilder sbM11879 = C5410.m11879("Couldn't resolve menu item onClick handler ", str, " in class ");
            sbM11879.append(cls.getName());
            InflateException inflateException = new InflateException(sbM11879.toString());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f77678;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f77679;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
