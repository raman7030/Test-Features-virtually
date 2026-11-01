package p067l;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WATP */
/* JADX INFO: loaded from: classes4.dex */
public final class C17891 implements InterfaceC20575 {

    /* JADX INFO: renamed from: ֫ */
    public static final C17891 f53462 = new C17891();

    @Override // p067l.InterfaceC20575
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7431(C13351 c13351, Type type, Object obj) {
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof TypeVariable) {
                genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
            }
            ArrayList arrayList = new ArrayList();
            c13351.m30485(genericComponentType, arrayList, (Object) null);
            if (genericComponentType instanceof Class) {
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size());
                arrayList.toArray(objArr);
                return objArr;
            }
            return arrayList.toArray();
        }
        return c13351.m30480(obj);
    }
}
