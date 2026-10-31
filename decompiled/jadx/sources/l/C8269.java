package l;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: l.۠ܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V627 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8269 extends C22380 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static C8269 f25429;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC13912 f25430 = C1213.f4363;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Application f25431;

    public C8269(Application application, int i) {
        this.f25431 = application;
    }

    public C8269() {
        this(null, 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8269(Application application) {
        this(application, 0);
        C11233.m27805(application, "application");
    }

    @Override // l.C22380, l.InterfaceC15323
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5447 mo5214(Class cls, C16344 c16344) {
        if (this.f25431 != null) {
            return mo5213(cls);
        }
        Application application = (Application) c16344.m20277().get(C1213.f4363);
        if (application != null) {
            return m21865(cls, application);
        }
        if (C18669.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.mo5213(cls);
    }

    @Override // l.C22380, l.InterfaceC15323
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC5447 mo5213(Class cls) {
        Application application = this.f25431;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        return m21865(cls, application);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final AbstractC5447 m21865(Class cls, Application application) {
        if (C18669.class.isAssignableFrom(cls)) {
            try {
                AbstractC5447 abstractC5447 = (AbstractC5447) cls.getConstructor(Application.class).newInstance(application);
                C11233.m27803(abstractC5447, "{\n                try {\n…          }\n            }");
                return abstractC5447;
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
        return super.mo5213(cls);
    }
}
