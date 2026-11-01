package p067l;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAVZ */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC19904 {

    /* JADX INFO: renamed from: ֫ */
    public final Class f60445;

    /* JADX INFO: renamed from: ۧ */
    public long[] f60446;

    /* JADX INFO: renamed from: ܽ */
    public Enum[] f60447;

    /* JADX INFO: renamed from: ᩳ */
    public final C17476 f60448;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo19780(C13351 c13351, Object obj, Type type, Map map);

    public AbstractC19904(Class cls, C17476 c17476) {
        this.f60445 = cls;
        this.f60448 = c17476;
        if (c17476 == null) {
            return;
        }
        Class cls2 = c17476.f52254;
        if (cls2.isEnum()) {
            Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
            int length = enumArr.length;
            long[] jArr = new long[length];
            this.f60446 = new long[enumArr.length];
            for (int i = 0; i < enumArr.length; i++) {
                String strName = enumArr[i].name();
                long jCharAt = -3750763034362895579L;
                for (int i2 = 0; i2 < strName.length(); i2++) {
                    jCharAt = (jCharAt ^ ((long) strName.charAt(i2))) * 1099511628211L;
                }
                jArr[i] = jCharAt;
                this.f60446[i] = jCharAt;
            }
            Arrays.sort(this.f60446);
            this.f60447 = new Enum[enumArr.length];
            for (int i3 = 0; i3 < this.f60446.length; i3++) {
                for (int i4 = 0; i4 < length; i4++) {
                    if (this.f60446[i3] == jArr[i4]) {
                        this.f60447[i3] = enumArr[i4];
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final Enum m45210(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f60447;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f60446, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo19779(Object obj, Object obj2) {
        C17476 c17476 = this.f60448;
        if (obj2 == null && c17476.f52254.isPrimitive()) {
            return;
        }
        Field field = c17476.f52264;
        Method method = c17476.f52267;
        try {
            if (c17476.f52255) {
                if (c17476.f52256) {
                    if (Map.class.isAssignableFrom(c17476.f52254)) {
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
            if (c17476.f52256) {
                if (Map.class.isAssignableFrom(c17476.f52254)) {
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
            throw new C16702("set property error, " + c17476.f52263, (Throwable) e);
        }
    }
}
