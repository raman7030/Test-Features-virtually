package p067l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֡ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes3.dex */
public final class C2811 extends AbstractC4824 {

    /* JADX INFO: renamed from: ܿ */
    public static final HashMap f4810;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f4811;

    /* JADX INFO: renamed from: ܽ */
    public final Constructor f4812;

    /* JADX INFO: renamed from: ᩳ */
    public final Object[] f4813;

    @Override // p067l.AbstractC4824
    /* JADX INFO: renamed from: ֫ */
    public final Object mo4437(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.f4812;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            int i = C15140.f43223;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + C15140.m34566(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + C15140.m34566(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + C15140.m34566(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // p067l.AbstractC4824
    /* JADX INFO: renamed from: ֫ */
    public final void mo4438(Object obj, C18691 c18691, AbstractC6165 abstractC6165) {
        Object[] objArr = (Object[]) obj;
        String str = abstractC6165.f15479;
        Integer num = (Integer) this.f4811.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + C15140.m34566(this.f4812) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        abstractC6165.mo13959(c18691, num.intValue(), objArr);
    }

    public C2811(Class cls, C20918 c20918, boolean z) {
        super(c20918);
        this.f4811 = new HashMap();
        Constructor constructorM34568 = C15140.m34568(cls);
        this.f4812 = constructorM34568;
        if (z) {
            C7506.m17387((Object) null, constructorM34568);
        } else {
            C15140.m34570((AccessibleObject) constructorM34568);
        }
        String[] strArrM34573 = C15140.m34573(cls);
        for (int i = 0; i < strArrM34573.length; i++) {
            this.f4811.put(strArrM34573[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.f4812.getParameterTypes();
        this.f4813 = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.f4813[i2] = f4810.get(parameterTypes[i2]);
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
        f4810 = map;
    }

    @Override // p067l.AbstractC4824
    /* JADX INFO: renamed from: ۧ */
    public final Object mo4439() {
        return (Object[]) this.f4813.clone();
    }
}
