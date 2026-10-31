package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5UK */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC21630 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Method f69438;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Context f69439;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final View f69440;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f69441;

    public ViewOnClickListenerC21630(View view, String str) {
        this.f69440 = view;
        this.f69441 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f69438 != null) {
            break;
        }
        View view2 = this.f69440;
        Context context = view2.getContext();
        while (true) {
            String str2 = this.f69441;
            if (context == null) {
                int id = view2.getId();
                if (id == -1) {
                    str = "";
                } else {
                    str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                }
                StringBuilder sbM9834 = C3200.m9834("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                sbM9834.append(view2.getClass());
                sbM9834.append(str);
                throw new IllegalStateException(sbM9834.toString());
            }
            try {
                if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                    this.f69438 = method;
                    this.f69439 = context;
                    break;
                }
            } catch (NoSuchMethodException unused) {
            }
            context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
        }
        try {
            this.f69438.invoke(this.f69439, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
