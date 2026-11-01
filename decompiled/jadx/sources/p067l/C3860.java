package p067l;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: l.֫ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes2.dex */
public class C3860 extends C19283 {

    /* JADX INFO: renamed from: ۜ */
    public static final C3860 f8347 = new C3860(0);

    /* JADX INFO: renamed from: ܳ */
    public final Map f8348;

    /* JADX INFO: renamed from: ܿ */
    public final Map f8349;

    /* JADX INFO: renamed from: ᩳ */
    public final Map f8350;

    /* JADX INFO: renamed from: ᩻ */
    public final Map f8351;

    /* JADX INFO: renamed from: ۧ */
    public static C3860 m7613() {
        return new C3860();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C9186 m7614(C19244 c19244, int i) {
        return (C9186) this.f8349.get(new C15220(c19244, i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7615(C17683 c17683) {
        C9186 c9186;
        Map map;
        Map map2;
        if (c17683.m40210() == EnumC11869.IMMUTABLE || c17683.m40210() == EnumC11869.MUTABLE) {
            if (c17683.mo18131().m3539() == EnumC19915.MESSAGE) {
                if (c17683.mo18132() == null) {
                    throw new IllegalStateException("Registered message-type extension had null default instance: " + c17683.mo18131().mo3542());
                }
                c9186 = new C9186(c17683.mo18131(), c17683.mo18132());
            } else {
                c9186 = new C9186(c17683.mo18131(), null);
            }
            EnumC11869 enumC11869M40210 = c17683.m40210();
            C2479 c2479 = c9186.f24852;
            if (!c2479.m3527()) {
                throw new IllegalArgumentException("ExtensionRegistry.add() was given a FieldDescriptor for a regular (non-extension) field.");
            }
            int i = C23938.f76059[enumC11869M40210.ordinal()];
            if (i == 1) {
                map = this.f8350;
                map2 = this.f8349;
            } else {
                if (i != 2) {
                    return;
                }
                map = this.f8348;
                map2 = this.f8351;
            }
            map.put(c2479.mo3542(), c9186);
            map2.put(new C15220(c2479.m3545(), c2479.getNumber()), c9186);
            if (c2479.m3545().m43838().m41616() && c2479.getType() == EnumC20586.f63631 && c2479.m3537() && c2479.m3524() == c2479.m3548()) {
                map.put(c2479.m3548().mo3542(), c9186);
            }
        }
    }

    public C3860() {
        this.f8350 = new HashMap();
        this.f8348 = new HashMap();
        this.f8349 = new HashMap();
        this.f8351 = new HashMap();
    }

    public C3860(int i) {
        super(C19283.f57615);
        Map map = Collections.EMPTY_MAP;
        this.f8350 = map;
        this.f8348 = map;
        this.f8349 = map;
        this.f8351 = map;
    }
}
