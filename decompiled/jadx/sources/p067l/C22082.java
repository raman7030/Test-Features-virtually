package p067l;

import java.util.EnumMap;

/* JADX INFO: renamed from: l.᩷۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C22082 {

    /* JADX INFO: renamed from: ۧ */
    public static final C22082 f69463 = new C22082();

    /* JADX INFO: renamed from: ֫ */
    public final EnumMap f69464;

    public C22082() {
        this.f69464 = new EnumMap(EnumC24763.class);
    }

    public C22082(C16045 c16045) {
        this();
        this.f69464.put(EnumC24763.ANNOTATIONS, c16045);
    }

    public C22082(C22082 c22082) {
        this.f69464 = c22082.f69464.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C22082 m49703(C16045 c16045) {
        C22082 c22082 = new C22082(this);
        EnumC24763 enumC24763 = EnumC24763.ANNOTATIONS;
        EnumMap enumMap = this.f69464;
        boolean zContainsKey = enumMap.containsKey(enumC24763);
        EnumMap enumMap2 = c22082.f69464;
        if (zContainsKey) {
            enumMap2.put(enumC24763, ((InterfaceC8670) enumMap.get(enumC24763)).mo20111(c16045));
            return c22082;
        }
        enumMap2.put(enumC24763, c16045);
        return c22082;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C22082 m49704(EnumC24763 enumC24763) {
        C22082 c22082 = f69463;
        if (this == c22082 || this.f69464.get(enumC24763) == null) {
            return this;
        }
        C22082 c22083 = new C22082(this);
        EnumMap enumMap = c22083.f69464;
        enumMap.remove(enumC24763);
        return enumMap.isEmpty() ? c22082 : c22083;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8670 m49702(EnumC24763 enumC24763) {
        return (InterfaceC8670) this.f69464.get(enumC24763);
    }
}
