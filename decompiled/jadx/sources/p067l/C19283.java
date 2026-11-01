package p067l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9OM */
/* JADX INFO: loaded from: classes4.dex */
public class C19283 {

    /* JADX INFO: renamed from: ۧ */
    public static final C19283 f57615 = new C19283(0);

    /* JADX INFO: renamed from: ܽ */
    public static volatile C19283 f57616;

    /* JADX INFO: renamed from: ֫ */
    public final Map f57617;

    /* JADX INFO: renamed from: ֫ */
    public static C19283 m43977() {
        C19283 c19283;
        C19283 c19284 = f57616;
        if (c19284 != null) {
            return c19284;
        }
        synchronized (C19283.class) {
            c19283 = f57616;
            if (c19283 == null) {
                Class cls = C12578.f35339;
                C19283 c19285 = null;
                if (cls != null) {
                    try {
                        c19285 = (C19283) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                c19283 = c19285 != null ? c19285 : f57615;
                f57616 = c19283;
            }
        }
        return c19283;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C3602 m43978(int i, InterfaceC10467 interfaceC10467) {
        return (C3602) this.f57617.get(new C17941(i, interfaceC10467));
    }

    public C19283() {
        this.f57617 = new HashMap();
    }

    public C19283(C19283 c19283) {
        if (c19283 == f57615) {
            this.f57617 = Collections.EMPTY_MAP;
        } else {
            this.f57617 = C21562.unmodifiableMap(c19283.f57617);
        }
    }

    public C19283(int i) {
        this.f57617 = Collections.EMPTY_MAP;
    }
}
