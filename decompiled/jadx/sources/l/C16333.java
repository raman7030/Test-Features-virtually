package l;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܽ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: WATP */
/* JADX INFO: loaded from: classes4.dex */
public final class C16333 implements InterfaceC19157 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C16333 f50290 = new C16333();

    @Override // l.InterfaceC19157
    /* JADX INFO: renamed from: ֫ */
    public final Object mo5204(C11556 c11556, Type type, Object obj) {
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof TypeVariable) {
                genericComponentType = ((TypeVariable) genericComponentType).getBounds()[0];
            }
            ArrayList arrayList = new ArrayList();
            c11556.m28439(genericComponentType, arrayList, (Object) null);
            if (genericComponentType instanceof Class) {
                Object[] objArr = (Object[]) Array.newInstance((Class<?>) genericComponentType, arrayList.size());
                arrayList.toArray(objArr);
                return objArr;
            }
            return arrayList.toArray();
        }
        return c11556.m28434(obj);
    }
}
