package l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۚᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes2.dex */
public final class C5523 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 f17088;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f17089;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f17090;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f17091;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Field f17092;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f17093;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final EnumC7639 f17094;

    public C5523(Field field, InterfaceC11873 interfaceC11873) throws C22456 {
        int iM18705;
        this.f17092 = field;
        this.f17088 = interfaceC11873;
        EnumC1974 enumC1974Type = interfaceC11873.type();
        this.f17093 = enumC1974Type;
        EnumC13988 enumC13988Cls = interfaceC11873.cls();
        if (enumC13988Cls == EnumC13988.AUTOMATIC) {
            if (interfaceC11873.tagNumber() != -1) {
                enumC13988Cls = EnumC13988.CONTEXT_SPECIFIC;
            } else {
                enumC13988Cls = EnumC13988.UNIVERSAL;
            }
        }
        this.f17089 = AbstractC6913.m18706(enumC13988Cls);
        if (interfaceC11873.tagNumber() != -1) {
            iM18705 = interfaceC11873.tagNumber();
        } else {
            iM18705 = (enumC1974Type == EnumC1974.CHOICE || enumC1974Type == EnumC1974.ANY) ? -1 : AbstractC6913.m18705(enumC1974Type);
        }
        this.f17091 = iM18705;
        EnumC7639 enumC7639Tagging = interfaceC11873.tagging();
        this.f17094 = enumC7639Tagging;
        if ((enumC7639Tagging == EnumC7639.EXPLICIT || enumC7639Tagging == EnumC7639.IMPLICIT) && interfaceC11873.tagNumber() == -1) {
            throw new C22456("Tag number must be specified when tagging mode is " + enumC7639Tagging);
        }
        this.f17090 = interfaceC11873.optional();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Field m15660() {
        return this.f17092;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 m15655() {
        return this.f17088;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m15659() {
        return this.f17090;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m15657() {
        return this.f17089;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m15658() {
        return this.f17091;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15656(C17496 c17496, Object obj) {
        int iM40883 = c17496.m40883();
        int i = this.f17089;
        int i2 = this.f17091;
        if (i2 != -1) {
            int iM40882 = c17496.m40882();
            if (iM40883 != i || iM40882 != i2) {
                throw new C1289("Tag mismatch. Expected: " + AbstractC6913.m18708(i, i2) + ", but found " + AbstractC6913.m18708(iM40883, iM40882));
            }
        } else if (iM40883 != i) {
            throw new C1289("Tag mismatch. Expected class: " + AbstractC6913.m18707(i) + ", but found " + AbstractC6913.m18707(iM40883));
        }
        if (this.f17094 == EnumC7639.EXPLICIT) {
            try {
                c17496 = c17496.m40879().m47861();
            } catch (C14673 e) {
                throw new C22456("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.f17092;
        InterfaceC11873 interfaceC11873 = this.f17088;
        EnumC1974 enumC1974 = this.f17093;
        try {
            int i3 = C0583.f2307[enumC1974.ordinal()];
            if (i3 == 4 || i3 == 5) {
                if (C23161.class.equals(field.getType())) {
                    field.set(obj, C8345.m21943(enumC1974, c17496, field.getType()));
                    return;
                } else {
                    if (interfaceC11873.listElementType() == Object.class) {
                        throw new RuntimeException(field.toString());
                    }
                    field.set(obj, C15399.m36444(c17496, interfaceC11873.listElementType()));
                    return;
                }
            }
            field.set(obj, C8345.m21943(enumC1974, c17496, field.getType()));
        } catch (Exception e2) {
            throw new C22456("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
