package p067l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ܺۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAVQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C17270 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public final int f51394;

    /* JADX INFO: renamed from: ۙ */
    public final Field f51395;

    /* JADX INFO: renamed from: ۛ */
    public final Class f51396;

    /* JADX INFO: renamed from: ۟ */
    public final EnumC3189 f51397;

    /* JADX INFO: renamed from: ۤ */
    public final C14490 f51398;

    /* JADX INFO: renamed from: ۨ */
    public final Field f51399;

    /* JADX INFO: renamed from: ۫ */
    public final Class f51400;

    /* JADX INFO: renamed from: ۬ */
    public final Object f51401;

    /* JADX INFO: renamed from: ܰ */
    public final boolean f51402;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC14331 f51403;

    /* JADX INFO: renamed from: ᩸ */
    public final Field f51404;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f51405;

    /* JADX INFO: renamed from: ᩺ */
    public final int f51406;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f51394 - ((C17270) obj).f51394;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39088(Field field, int i, EnumC3189 enumC3189, boolean z) {
        m39089(i);
        C15671.m35602(field, "field");
        C15671.m35602(enumC3189, "fieldType");
        if (enumC3189 == EnumC3189.f6134 || enumC3189 == EnumC3189.f6171) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C17270(field, i, enumC3189, null, null, 0, false, z, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39084(Field field, int i, EnumC3189 enumC3189, Field field2) {
        m39089(i);
        C15671.m35602(field, "field");
        C15671.m35602(enumC3189, "fieldType");
        if (enumC3189 == EnumC3189.f6134 || enumC3189 == EnumC3189.f6171) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new C17270(field, i, enumC3189, null, null, 0, false, false, null, null, null, null, field2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39083(Field field, int i, EnumC3189 enumC3189, Class cls) {
        m39089(i);
        C15671.m35602(field, "field");
        C15671.m35602(enumC3189, "fieldType");
        C15671.m35602(cls, "messageClass");
        return new C17270(field, i, enumC3189, cls, null, 0, false, false, null, null, null, null, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39086(Field field, int i, EnumC3189 enumC3189, InterfaceC14331 interfaceC14331) {
        m39089(i);
        C15671.m35602(field, "field");
        return new C17270(field, i, enumC3189, null, null, 0, false, false, null, null, null, interfaceC14331, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39087(Field field, int i, EnumC3189 enumC3189, InterfaceC14331 interfaceC14331, Field field2) {
        m39089(i);
        C15671.m35602(field, "field");
        return new C17270(field, i, enumC3189, null, null, 0, false, false, null, null, null, interfaceC14331, field2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39085(Field field, int i, EnumC3189 enumC3189, Field field2, int i2, boolean z, InterfaceC14331 interfaceC14331) {
        m39089(i);
        C15671.m35602(field, "field");
        C15671.m35602(enumC3189, "fieldType");
        C15671.m35602(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C20778.m46922(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C17270(field, i, enumC3189, null, field2, i2, false, z, null, null, null, interfaceC14331, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39081(int i, EnumC3189 enumC3189, C14490 c14490, Class cls, boolean z, InterfaceC14331 interfaceC14331) {
        m39089(i);
        C15671.m35602(cls, "oneofStoredType");
        if (!enumC3189.m5495()) {
            throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + enumC3189);
        }
        return new C17270(null, i, enumC3189, null, null, 0, false, z, c14490, cls, null, interfaceC14331, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m39089(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(C20778.m46922(i, "fieldNumber must be positive: "));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C17270 m39090(Field field, int i, EnumC3189 enumC3189, Field field2, int i2, boolean z, InterfaceC14331 interfaceC14331) {
        m39089(i);
        C15671.m35602(field, "field");
        C15671.m35602(enumC3189, "fieldType");
        C15671.m35602(field2, "presenceField");
        if (i2 == 0 || ((i2 - 1) & i2) != 0) {
            throw new IllegalArgumentException(C20778.m46922(i2, "presenceMask must have exactly one bit set: "));
        }
        return new C17270(field, i, enumC3189, null, field2, i2, true, z, null, null, null, interfaceC14331, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17270 m39082(Field field, int i, Object obj, InterfaceC14331 interfaceC14331) {
        C15671.m35602(obj, "mapDefaultEntry");
        m39089(i);
        C15671.m35602(field, "field");
        return new C17270(field, i, EnumC3189.f6176, null, null, 0, false, true, null, null, obj, interfaceC14331, null);
    }

    public C17270(Field field, int i, EnumC3189 enumC3189, Class cls, Field field2, int i2, boolean z, boolean z2, C14490 c14490, Class cls2, Object obj, InterfaceC14331 interfaceC14331, Field field3) {
        this.f51395 = field;
        this.f51397 = enumC3189;
        this.f51400 = cls;
        this.f51394 = i;
        this.f51399 = field2;
        this.f51406 = i2;
        this.f51402 = z;
        this.f51405 = z2;
        this.f51398 = c14490;
        this.f51396 = cls2;
        this.f51401 = obj;
        this.f51403 = interfaceC14331;
        this.f51404 = field3;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m39101() {
        return this.f51394;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Field m39098() {
        return this.f51395;
    }

    public final EnumC3189 getType() {
        return this.f51397;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C14490 m39094() {
        return this.f51398;
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC14331 m39096() {
        return this.f51403;
    }

    /* JADX INFO: renamed from: ܺ */
    public final Field m39097() {
        return this.f51399;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final Object m39100() {
        return this.f51401;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final int m39099() {
        return this.f51406;
    }

    /* JADX INFO: renamed from: ۚ */
    public final boolean m39093() {
        return this.f51402;
    }

    /* JADX INFO: renamed from: ֡ */
    public final boolean m39091() {
        return this.f51405;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Field m39092() {
        return this.f51404;
    }

    /* JADX INFO: renamed from: ۢ */
    public final Class m39095() {
        int i = C10566.f29261[this.f51397.ordinal()];
        if (i == 1 || i == 2) {
            Field field = this.f51395;
            return field != null ? field.getType() : this.f51396;
        }
        if (i == 3 || i == 4) {
            return this.f51400;
        }
        return null;
    }
}
