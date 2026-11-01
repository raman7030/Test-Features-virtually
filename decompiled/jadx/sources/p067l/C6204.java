package p067l;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.ۘܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W1GC */
/* JADX INFO: loaded from: classes2.dex */
public final class C6204 {

    /* JADX INFO: renamed from: ֫ */
    public static final List f15619 = C4187.m8476((Object[]) new Class[]{Application.class, C12910.class});

    /* JADX INFO: renamed from: ۧ */
    public static final List f15620 = C4187.m8475(C12910.class);

    /* JADX INFO: renamed from: ֫ */
    public static final Constructor m14051(Class cls, List list) {
        C13045.m29867(list, "signature");
        Constructor<?>[] constructors = cls.getConstructors();
        C13045.m29865(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            C13045.m29865(parameterTypes, "constructor.parameterTypes");
            List listM53361 = C24108.m53361(parameterTypes);
            if (list.equals(listM53361)) {
                return constructor;
            }
            if (list.size() == listM53361.size() && listM53361.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC7545 m14053(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (AbstractC7545) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(C22934.m51253(cls, "A ", " cannot be instantiated."), e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
        }
    }
}
