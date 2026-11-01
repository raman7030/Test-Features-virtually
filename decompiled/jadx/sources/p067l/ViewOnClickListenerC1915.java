package p067l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸ܳ */
/* JADX INFO: compiled from: I5UK */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC1915 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ */
    public Method f72141;

    /* JADX INFO: renamed from: ᩶ */
    public Context f72142;

    /* JADX INFO: renamed from: ᩸ */
    public final View f72143;

    /* JADX INFO: renamed from: ᩹ */
    public final String f72144;

    public ViewOnClickListenerC1915(View view, String str) {
        this.f72143 = view;
        this.f72144 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f72141 != null) {
            break;
        }
        View view2 = this.f72143;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f72144;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM11879 = C5410.m11879("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM11879.append(view2.getClass());
                sbM11879.append(str);
                throw new IllegalStateException(sbM11879.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f72141 = method;
                    this.f72142 = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f72141.invoke(this.f72142, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
