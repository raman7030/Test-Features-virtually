package l;

import java.lang.reflect.Method;
import java.util.List;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.۫ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C12483 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30638(String str, List list, C13188 c13188) {
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
            c13188.mo23576();
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
            C9145.m23513("openSDK_LOG.JsBridge", "-->call, result: " + objInvoke + " | ReturnType: " + returnType.getName());
            try {
                if (!ClassTransform.VOID.equals(returnType.getName()) && returnType != Void.class) {
                    if (this instanceof C7049) {
                        if (objInvoke != null) {
                            string = objInvoke.toString();
                        }
                        c13188.mo23575(string);
                        return;
                    }
                    return;
                    C9145.m23514("openSDK_LOG.JsBridge", "-->handler call mehtod ex. targetMethod: " + method, e);
                    c13188.mo23576();
                    return;
                }
                c13188.mo23574();
            } catch (Exception e) {
                e = e;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}
