package l;

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
public final class C21374 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static WeakReference f68858;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Toast f68859;

    public C21374(Toast toast) {
        this.f68859 = toast;
        if (Build.VERSION.SDK_INT == 25) {
            try {
                Field declaredField = Toast.class.getDeclaredField("mTN");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(toast);
                Field declaredField2 = obj.getClass().getDeclaredField("mHandler");
                declaredField2.setAccessible(true);
                declaredField2.set(obj, new HandlerC15022((Handler) declaredField2.get(obj)));
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21374 m48459(CharSequence charSequence) {
        C21374 c21374M48458 = m48458(0, charSequence);
        c21374M48458.m48468();
        return c21374M48458;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48460(String str) {
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
        m48458(i, str).m48468();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21374 m48457(int i) {
        C21374 c21374M48462 = m48462(i, 0);
        c21374M48462.m48468();
        return c21374M48462;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48464(CharSequence charSequence) {
        m48458(1, charSequence).m48468();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m48463(int i) {
        m48462(i, 1).m48468();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21374 m48458(int i, CharSequence charSequence) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C4925.m14335(), "", i);
            toastMakeText.setText(charSequence);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C4925.m14335(), charSequence, i);
        }
        return new C21374(toastMakeText);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21374 m48462(int i, int i2) {
        Toast toastMakeText;
        try {
            toastMakeText = Toast.makeText(C4925.m14335(), "", i2);
            toastMakeText.setText(i);
        } catch (RuntimeException unused) {
            toastMakeText = Toast.makeText(C4925.m14335(), i, i2);
        }
        return new C21374(toastMakeText);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m48465() {
        WeakReference weakReference = f68858;
        Toast toast = null;
        if (weakReference != null) {
            Toast toast2 = (Toast) weakReference.get();
            f68858 = null;
            toast = toast2;
        }
        if (toast != null) {
            try {
                toast.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m48468() {
        RunnableC7968 runnableC7968 = new RunnableC7968(0, this);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnableC7968.run();
        } else {
            C4925.m14315(runnableC7968);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m48461(C21374 c21374) {
        Toast toast = c21374.f68859;
        m48465();
        try {
            toast.show();
            f68858 = new WeakReference(toast);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48467(int i, int i2) {
        this.f68859.setGravity(i, 0, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48466() {
        try {
            this.f68859.cancel();
        } catch (Throwable unused) {
        }
    }
}
