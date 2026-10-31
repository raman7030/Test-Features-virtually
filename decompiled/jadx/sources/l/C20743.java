package l;

import java.util.EnumMap;

/* JADX INFO: renamed from: l.᩷۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7L9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20743 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C20743 f66779 = new C20743();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumMap f66780;

    public C20743() {
        this.f66780 = new EnumMap(EnumC23564.class);
    }

    public C20743(C14391 c14391) {
        this();
        this.f66780.put(EnumC23564.ANNOTATIONS, c14391);
    }

    public C20743(C20743 c20743) {
        this.f66780 = c20743.f66780.clone();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20743 m47376(C14391 c14391) {
        C20743 c20743 = new C20743(this);
        EnumC23564 enumC23564 = EnumC23564.ANNOTATIONS;
        EnumMap enumMap = this.f66780;
        boolean zContainsKey = enumMap.containsKey(enumC23564);
        EnumMap enumMap2 = c20743.f66780;
        if (zContainsKey) {
            enumMap2.put(enumC23564, ((InterfaceC6631) enumMap.get(enumC23564)).mo18159(c14391));
            return c20743;
        }
        enumMap2.put(enumC23564, c14391);
        return c20743;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20743 m47377(EnumC23564 enumC23564) {
        C20743 c20743 = f66779;
        if (this == c20743 || this.f66780.get(enumC23564) == null) {
            return this;
        }
        C20743 c20744 = new C20743(this);
        EnumMap enumMap = c20744.f66780;
        enumMap.remove(enumC23564);
        return enumMap.isEmpty() ? c20743 : c20744;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC6631 m47375(EnumC23564 enumC23564) {
        return (InterfaceC6631) this.f66780.get(enumC23564);
    }
}
