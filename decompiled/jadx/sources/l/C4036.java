package l;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W1GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4036 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f12804 = C1913.m6274((Object[]) new Class[]{Application.class, C11092.class});

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final List f12805 = C1913.m6273(C11092.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Constructor m12130(Class cls, List list) {
        C11233.m27805(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        C11233.m27803(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C11233.m27803(parameterTypes, "constructor.parameterTypes");
            List listM50971 = C22874.m50971(parameterTypes);
            if (list.equals(listM50971)) {
                return constructor;
            }
            if (list.size() == listM50971.size() && listM50971.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC5447 m12132(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC5447) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(C21639.m48905(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
