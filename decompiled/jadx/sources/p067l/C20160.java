package p067l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAUY */
/* JADX INFO: loaded from: classes4.dex */
public final class C20160 implements ParameterizedType {

    /* JADX INFO: renamed from: ᩶ */
    public final Type f62407;

    /* JADX INFO: renamed from: ᩸ */
    public final Type[] f62408;

    /* JADX INFO: renamed from: ᩹ */
    public final Type f62409;

    public C20160(Type[] typeArr, Type type, Type type2) {
        this.f62408 = typeArr;
        this.f62409 = type;
        this.f62407 = type2;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f62408;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f62409;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f62407;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20160.class == obj.getClass()) {
            C20160 c20160 = (C20160) obj;
            Type type = c20160.f62407;
            Type type2 = c20160.f62409;
            if (!Arrays.equals(this.f62408, c20160.f62408)) {
                return false;
            }
            Type type3 = this.f62409;
            if (type3 == null ? type2 != null : !type3.equals(type2)) {
                return false;
            }
            Type type4 = this.f62407;
            if (type4 != null) {
                return type4.equals(type);
            }
            if (type == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Type[] typeArr = this.f62408;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f62409;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f62407;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
