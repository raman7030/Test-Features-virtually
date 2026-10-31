package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܺۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15680 implements Comparable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f48256;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Field f48257;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Class f48258;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final EnumC0864 f48259;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C12755 f48260;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Field f48261;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Class f48262;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Object f48263;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f48264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC12587 f48265;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Field f48266;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f48267;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f48268;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f48256 - ((C15680) obj).f48256;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36922(Field field, int i, EnumC0864 enumC0864, boolean z) {
        m36923(i);
        C13997.m33482(field, "field");
        C13997.m33482(enumC0864, "fieldType");
        if (enumC0864 == EnumC0864.f3361 || enumC0864 == EnumC0864.f3398) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C15680(field, i, enumC0864, null, null, 0, false, z, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36918(Field field, int i, EnumC0864 enumC0864, Field field2) {
        m36923(i);
        C13997.m33482(field, "field");
        C13997.m33482(enumC0864, "fieldType");
        if (enumC0864 == EnumC0864.f3361 || enumC0864 == EnumC0864.f3398) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C15680(field, i, enumC0864, null, null, 0, false, false, null, null, null, null, field2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36917(Field field, int i, EnumC0864 enumC0864, Class cls) {
        m36923(i);
        C13997.m33482(field, "field");
        C13997.m33482(enumC0864, "fieldType");
        C13997.m33482(cls, "messageClass");
        return new C15680(field, i, enumC0864, cls, null, 0, false, false, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36920(Field field, int i, EnumC0864 enumC0864, InterfaceC12587 interfaceC12587) {
        m36923(i);
        C13997.m33482(field, "field");
        return new C15680(field, i, enumC0864, null, null, 0, false, false, null, null, null, interfaceC12587, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36921(Field field, int i, EnumC0864 enumC0864, InterfaceC12587 interfaceC12587, Field field2) {
        m36923(i);
        C13997.m33482(field, "field");
        return new C15680(field, i, enumC0864, null, null, 0, false, false, null, null, null, interfaceC12587, field2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36919(Field field, int i, EnumC0864 enumC0864, Field field2, int i2, boolean z, InterfaceC12587 interfaceC12587) {
        m36923(i);
        C13997.m33482(field, "field");
        C13997.m33482(enumC0864, "fieldType");
        C13997.m33482(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C19370.m44628(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C15680(field, i, enumC0864, null, field2, i2, false, z, null, null, null, interfaceC12587, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36915(int i, EnumC0864 enumC0864, C12755 c12755, Class cls, boolean z, InterfaceC12587 interfaceC12587) {
        m36923(i);
        C13997.m33482(cls, "oneofStoredType");
        if (!enumC0864.m3181()) {
            throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + enumC0864);
        }
        return new C15680(null, i, enumC0864, null, null, 0, false, z, c12755, cls, null, interfaceC12587, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36923(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C19370.m44628(i, "fieldNumber must be positive: "));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C15680 m36924(Field field, int i, EnumC0864 enumC0864, Field field2, int i2, boolean z, InterfaceC12587 interfaceC12587) {
        m36923(i);
        C13997.m33482(field, "field");
        C13997.m33482(enumC0864, "fieldType");
        C13997.m33482(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C19370.m44628(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C15680(field, i, enumC0864, null, field2, i2, true, z, null, null, null, interfaceC12587, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C15680 m36916(Field field, int i, Object obj, InterfaceC12587 interfaceC12587) {
        C13997.m33482(obj, "mapDefaultEntry");
        m36923(i);
        C13997.m33482(field, "field");
        return new C15680(field, i, EnumC0864.f3403, null, null, 0, false, true, null, null, obj, interfaceC12587, null);
    }

    public C15680(Field field, int i, EnumC0864 enumC0864, Class cls, Field field2, int i2, boolean z, boolean z2, C12755 c12755, Class cls2, Object obj, InterfaceC12587 interfaceC12587, Field field3) {
        this.f48257 = field;
        this.f48259 = enumC0864;
        this.f48262 = cls;
        this.f48256 = i;
        this.f48261 = field2;
        this.f48268 = i2;
        this.f48264 = z;
        this.f48267 = z2;
        this.f48260 = c12755;
        this.f48258 = cls2;
        this.f48263 = obj;
        this.f48265 = interfaceC12587;
        this.f48266 = field3;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m36935() {
        return this.f48256;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Field m36932() {
        return this.f48257;
    }

    public final EnumC0864 getType() {
        return this.f48259;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C12755 m36928() {
        return this.f48260;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12587 m36930() {
        return this.f48265;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Field m36931() {
        return this.f48261;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m36934() {
        return this.f48263;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m36933() {
        return this.f48268;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m36927() {
        return this.f48264;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean m36925() {
        return this.f48267;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Field m36926() {
        return this.f48266;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final Class m36929() {
        int i = C8626.f26343[this.f48259.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f48257;
            return field != null ? field.getType() : this.f48258;
        }
        if (i == 3 || i == 4) {
            return this.f48262;
        }
        return null;
    }
}
