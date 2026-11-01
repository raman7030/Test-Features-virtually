package p067l;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.۠ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10227 extends C23638 {

    /* JADX INFO: renamed from: ܿ */
    public static C10227 f28339;

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC15590 f28340 = C3521.f7133;

    /* JADX INFO: renamed from: ܽ */
    public final Application f28341;

    public C10227(Application application, int i) {
        this.f28341 = application;
    }

    public C10227() {
        this(null, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10227(Application application) {
        this(application, 0);
        C13045.m29867(application, "application");
    }

    @Override // p067l.C23638, p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 mo7442(Class cls, C17901 c17901) {
        if (this.f28341 != null) {
            return mo7441(cls);
        }
        Application application = (Application) c17901.m22254().get(C3521.f7133);
        if (application != null) {
            return m23835(cls, application);
        }
        if (C20111.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo7441(cls);
    }

    @Override // p067l.C23638, p067l.InterfaceC16931
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7545 mo7441(Class cls) {
        Application application = this.f28341;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return m23835(cls, application);
    }

    /* JADX INFO: renamed from: ֫ */
    private final AbstractC7545 m23835(Class cls, Application application) {
        if (C20111.class.isAssignableFrom(cls)) {
            try {
                AbstractC7545 abstractC7545 = (AbstractC7545) cls.getConstructor(Application.class).newInstance(application);
                C13045.m29865(abstractC7545, "{\n                try {\n…          }\n            }");
                return abstractC7545;
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Cannot create an instance of " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            }
        }
        return super.mo7441(cls);
    }
}
