package p067l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: renamed from: l.ۤ۟ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAVC */
/* JADX INFO: loaded from: classes3.dex */
public final class C12010 extends AbstractC19904 {

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC20575 f33484;

    public C12010() {
        throw null;
    }

    @Override // p067l.AbstractC19904
    /* JADX INFO: renamed from: ֫ */
    public final void mo19780(C13351 c13351, Object obj, Type type, Map map) {
        Object objMo7431;
        Class cls;
        C24597 c24597 = c13351.f37492;
        InterfaceC20575 interfaceC20575 = this.f33484;
        C17476 c17476 = this.f60448;
        if (interfaceC20575 == null) {
            this.f33484 = c24597.m54234(c17476.f52254, c17476.f52261);
        }
        Type c20160 = c17476.f52261;
        String str = c17476.f52263;
        boolean z = type instanceof ParameterizedType;
        if (z) {
            c20160 = C17476.m39843(this.f60445, type, c20160);
            this.f33484 = c24597.m54235(c20160);
        }
        if ((c20160 instanceof ParameterizedType) && z) {
            ParameterizedType parameterizedType = (ParameterizedType) c20160;
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type rawType = parameterizedType2.getRawType();
            if ((rawType instanceof Class) && C20831.m47038(actualTypeArguments, ((Class) rawType).getTypeParameters(), parameterizedType2.getActualTypeArguments())) {
                c20160 = new C20160(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
            }
        }
        String str2 = c17476.f52258;
        if (str2 != null && (this.f33484 instanceof C21246)) {
            objMo7431 = C21246.m47997(c13351, c20160, str2);
        } else {
            objMo7431 = this.f33484.mo7431(c13351, c20160, str);
        }
        if (c13351.f37487 == 1) {
            C7986 c7986M30495 = c13351.m30495();
            c7986M30495.f20997 = this;
            c7986M30495.f20998 = c13351.f37493;
            c13351.f37487 = 0;
            return;
        }
        if (obj == null) {
            map.put(str, objMo7431);
            return;
        }
        if (objMo7431 == null && ((cls = c17476.f52254) == Byte.TYPE || cls == Short.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
            return;
        }
        mo19779(obj, objMo7431);
    }
}
