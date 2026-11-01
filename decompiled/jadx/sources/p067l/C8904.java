package p067l;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.ۜܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8904 {

    /* JADX INFO: renamed from: ֫ */
    public final Method f24127;

    /* JADX INFO: renamed from: ۧ */
    public final Method f24128;

    /* JADX INFO: renamed from: ܽ */
    public final Method f24129;

    public C8904(Method method, Method method2, Method method3) {
        this.f24127 = method;
        this.f24128 = method2;
        this.f24129 = method3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m20567() {
        Method method = this.f24127;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                this.f24128.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m20568(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            this.f24129.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
