package p067l;

import java.lang.reflect.Method;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C14232 {
    /* JADX INFO: renamed from: ֫ */
    public final void m32703(String str, List list, C14902 c14902) {
        Method method;
        String string;
        Object objInvoke;
        Method[] declaredMethods = getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                method = null;
                break;
            }
            method = declaredMethods[i];
            if (method.getName().equals(str) && method.getParameterTypes().length == list.size()) {
                break;
            } else {
                i++;
            }
        }
        if (method == null) {
            c14902.mo25527();
            return;
        }
        try {
            int size = list.size();
            if (size != 0) {
                if (size == 1) {
                    objInvoke = method.invoke(this, list.get(0));
                } else if (size == 2) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1));
                } else if (size == 3) {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2));
                } else if (size != 4) {
                    objInvoke = size != 5 ? method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5)) : method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
                } else {
                    objInvoke = method.invoke(this, list.get(0), list.get(1), list.get(2), list.get(3));
                }
                string = null;
            } else {
                string = null;
                objInvoke = method.invoke(this, null);
            }
            Class<?> returnType = method.getReturnType();
            C11060.m25464("openSDK_LOG.JsBridge", "-->call, result: " + objInvoke + " | ReturnType: " + returnType.getName());
            try {
                if (!ClassTransform.VOID.equals(returnType.getName()) && returnType != Void.class) {
                    if (this instanceof C9068) {
                        if (objInvoke != null) {
                            string = objInvoke.toString();
                        }
                        c14902.mo25526(string);
                        return;
                    }
                    return;
                    C11060.m25465("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e);
                    c14902.mo25527();
                    return;
                }
                c14902.mo25525();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
