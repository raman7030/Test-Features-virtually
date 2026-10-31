package l;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: renamed from: l.۠۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: HAZ0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8181 extends AbstractC4735 implements InterfaceC12147 {
    public volatile Object _preHandler;

    public C8181() {
        super(InterfaceC12147.f36250);
        this._preHandler = this;
    }

    @Override // l.InterfaceC12147
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo21673(Throwable th) {
        Method declaredMethod;
        int i = Build.VERSION.SDK_INT;
        if (26 > i || i >= 28) {
            return;
        }
        Object obj = this._preHandler;
        if (obj != this) {
            declaredMethod = (Method) obj;
        } else {
            try {
                declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
                if (!Modifier.isPublic(declaredMethod.getModifiers()) || !Modifier.isStatic(declaredMethod.getModifiers())) {
                    declaredMethod = null;
                }
            } catch (Throwable unused) {
            }
            this._preHandler = declaredMethod;
        }
        Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
