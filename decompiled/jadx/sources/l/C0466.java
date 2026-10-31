package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes3.dex */
public final class C0466 extends AbstractC2584 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final HashMap f2035;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f2036;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Constructor f2037;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object[] f2038;

    @Override // l.AbstractC2584
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo2057(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f2037;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            int i = C13438.f40152;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + C13438.m32464(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + C13438.m32464(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + C13438.m32464(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // l.AbstractC2584
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo2058(Object obj, C17175 c17175, AbstractC3995 abstractC3995) {
        Object[] objArr = (Object[]) obj;
        String str = abstractC3995.f12663;
        Integer num = (Integer) this.f2036.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + C13438.m32464(this.f2037) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        abstractC3995.mo12039(c17175, num.intValue(), objArr);
    }

    public C0466(Class cls, C19518 c19518, boolean z) {
        super(c19518);
        this.f2036 = new HashMap();
        Constructor constructorM32466 = C13438.m32466(cls);
        this.f2037 = constructorM32466;
        if (z) {
            C5406.m15476((Object) null, constructorM32466);
        } else {
            C13438.m32468((AccessibleObject) constructorM32466);
        }
        String[] strArrM32471 = C13438.m32471(cls);
        for (int i = 0; i < strArrM32471.length; i++) {
            this.f2036.put(strArrM32471[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f2037.getParameterTypes();
        this.f2038 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f2038[i2] = f2035.get(parameterTypes[i2]);
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        f2035 = map;
    }

    @Override // l.AbstractC2584
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo2059() {
        return (Object[]) this.f2038.clone();
    }
}
