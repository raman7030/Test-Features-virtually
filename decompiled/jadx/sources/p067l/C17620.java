package p067l;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܺܽ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J4EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17620 implements InvocationHandler {

    /* JADX INFO: renamed from: ᩶ */
    public boolean f52662;

    /* JADX INFO: renamed from: ᩸ */
    public final ArrayList f52663;

    /* JADX INFO: renamed from: ᩹ */
    public String f52664;

    public C17620(ArrayList arrayList) {
        this.f52663 = arrayList;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        String name = method.getName();
        Class<?> returnType = method.getReturnType();
        if (objArr == null) {
            objArr = C21407.f67538;
        }
        if (name.equals("supports") && Boolean.TYPE == returnType) {
            return Boolean.TRUE;
        }
        if (name.equals("unsupported") && Void.TYPE == returnType) {
            this.f52662 = true;
            return null;
        }
        boolean zEquals = name.equals("protocols");
        ArrayList arrayList = this.f52663;
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
                        this.f52664 = str;
                        return str;
                    }
                }
                String str2 = (String) arrayList.get(0);
                this.f52664 = str2;
                return str2;
            }
        }
        if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
            this.f52664 = (String) objArr[0];
            return null;
        }
        return method.invoke(this, objArr);
    }
}
