package p067l;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.᩹ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes.dex */
public class C23638 implements InterfaceC16931 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f75252 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static C23638 f75253;

    @Override // p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7545 mo7442(Class cls, C17901 c17901) {
        return mo7441(cls);
    }

    @Override // p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public AbstractC7545 mo7441(Class cls) throws InvocationTargetException {
        try {
            Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            C13045.m29865(objNewInstance, "{\n                modelC…wInstance()\n            }");
            return (AbstractC7545) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
