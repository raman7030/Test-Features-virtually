package l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16048 implements InvocationHandler {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49499;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f49500;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f49501;

    public C16048(ArrayList arrayList) {
        this.f49500 = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = C20032.f64896;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f49499 = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f49500;
        if (zEquals && objArr.length == 0) {
            return arrayList;
        }
        if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
            Object obj2 = objArr[0];
            if (obj2 instanceof List) {
                List list = (List) obj2;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.contains(list.get(i))) {
                        String str = (String) list.get(i);
                        this.f49501 = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f49501 = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.f49501 = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
