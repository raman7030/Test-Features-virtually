package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: IAUY */
/* JADX INFO: loaded from: classes4.dex */
public final class C18720 implements ParameterizedType {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Type f59183;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Type[] f59184;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final Type f59185;

    public C18720(Type[] typeArr, Type type, Type type2) {
        this.f59184 = typeArr;
        this.f59185 = type;
        this.f59183 = type2;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f59184;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f59185;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f59183;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C18720.class == obj.getClass()) {
            C18720 c18720 = (C18720) obj;
            Type type = c18720.f59183;
            Type type2 = c18720.f59185;
            if (!Arrays.equals(this.f59184, c18720.f59184)) {
                return false;
            }
            Type type3 = this.f59185;
            if (type3 == null ? type2 != null : !type3.equals(type2)) {
                return false;
            }
            Type type4 = this.f59183;
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
        Type[] typeArr = this.f59184;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f59185;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f59183;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
