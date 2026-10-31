package l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAVZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18451 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Class f57227;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long[] f57228;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Enum[] f57229;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15896 f57230;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo17833(C11556 c11556, Object obj, Type type, Map map);

    public AbstractC18451(Class cls, C15896 c15896) {
        this.f57227 = cls;
        this.f57230 = c15896;
        if (c15896 == null) {
            return;
        }
        Class cls2 = c15896.f49114;
        if (cls2.isEnum()) {
            Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
            int length = enumArr.length;
            long[] jArr = new long[length];
            this.f57228 = new long[enumArr.length];
            for (int i = 0; i < enumArr.length; i++) {
                String strName = enumArr[i].name();
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strName.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
                }
                jArr[i] = jCharAt;
                this.f57228[i] = jCharAt;
            }
            Arrays.sort(this.f57228);
            this.f57229 = new Enum[enumArr.length];
            for (int i3 = 0; i3 < this.f57228.length; i3++) {
                for (int i4 = 0; i4 < length; i4++) {
                    if (this.f57228[i3] == jArr[i4]) {
                        this.f57229[i3] = enumArr[i4];
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Enum m42937(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f57229;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f57228, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo17832(Object obj, Object obj2) {
        C15896 c15896 = this.f57230;
        if (obj2 == null && c15896.f49114.isPrimitive()) {
            return;
        }
        Field field = c15896.f49124;
        Method method = c15896.f49127;
        try {
            if (c15896.f49115) {
                if (c15896.f49116) {
                    if (Map.class.isAssignableFrom(c15896.f49114)) {
                        Map map = (Map) field.get(obj);
                        if (map != null) {
                            map.putAll((Map) obj2);
                            return;
                        }
                        return;
                    }
                    Collection collection = (Collection) field.get(obj);
                    if (collection != null) {
                        collection.addAll((Collection) obj2);
                        return;
                    }
                    return;
                }
                field.set(obj, obj2);
                return;
            }
            if (c15896.f49116) {
                if (Map.class.isAssignableFrom(c15896.f49114)) {
                    Map map2 = (Map) method.invoke(obj, null);
                    if (map2 != null) {
                        map2.putAll((Map) obj2);
                        return;
                    }
                    return;
                }
                Collection collection2 = (Collection) method.invoke(obj, null);
                if (collection2 != null) {
                    collection2.addAll((Collection) obj2);
                    return;
                }
                return;
            }
            method.invoke(obj, obj2);
        } catch (Exception e) {
            throw new C15082("set property error, " + c15896.f49123, (Throwable) e);
        }
    }
}
