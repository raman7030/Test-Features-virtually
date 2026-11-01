package p067l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩸ۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1XI */
/* JADX INFO: loaded from: classes4.dex */
public final class C22682 {

    /* JADX INFO: renamed from: ۧ */
    public static WeakReference f71553;

    /* JADX INFO: renamed from: ֫ */
    public final Toast f71554;

    public C22682(Toast toast) {
        this.f71554 = toast;
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new HandlerC16645((Handler) declaredField2.get(obj)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22682 m50795(CharSequence charSequence) {
        C22682 c22682M50794 = m50794(0, charSequence);
        c22682M50794.m50804();
        return c22682M50794;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: ֫ */
    public static void m50796(String str) {
        int i;
        int i2 = 0;
        while (Pattern.compile("\\w").matcher(str).find()) {
            i2++;
        }
        if (i2 <= 40) {
            int i3 = 0;
            while (Pattern.compile("[\\u4e00-\\u9fa5]").matcher(str).find()) {
                i3++;
            }
            i = (i3 > 40 || str.length() > 60) ? 1 : 0;
        }
        m50794(i, str).m50804();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22682 m50793(int i) {
        C22682 c22682M50798 = m50798(i, 0);
        c22682M50798.m50804();
        return c22682M50798;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50800(CharSequence charSequence) {
        m50794(1, charSequence).m50804();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m50799(int i) {
        m50798(i, 1).m50804();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22682 m50794(int i, CharSequence charSequence) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C7050.m16232(), "", i);
            toastMakeText.setText(charSequence);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C7050.m16232(), charSequence, i);
        }
        return new C22682(toastMakeText);
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22682 m50798(int i, int i2) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C7050.m16232(), "", i2);
            toastMakeText.setText(i);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C7050.m16232(), i, i2);
        }
        return new C22682(toastMakeText);
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m50801() {
        WeakReference weakReference = f71553;
        Toast toast = null;
        if (weakReference != null) {
            Toast toast2 = (Toast) weakReference.get();
            f71553 = null;
            toast = toast2;
        }
        if (toast != null) {
            try {
                toast.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m50804() {
        RunnableC9941 runnableC9941 = new RunnableC9941(0, this);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC9941.run();
        } else {
            C7050.m16212(runnableC9941);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m50797(C22682 c22682) {
        Toast toast = c22682.f71554;
        m50801();
        try {
            toast.show();
            f71553 = new WeakReference(toast);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50803(int i, int i2) {
        this.f71554.setGravity(i, 0, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m50802() {
        try {
            this.f71554.cancel();
        } catch (Throwable unused) {
        }
    }
}
