package p067l;

import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۚᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes2.dex */
public final class C7618 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13653 f19929;

    /* JADX INFO: renamed from: ۧ */
    public final int f19930;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f19931;

    /* JADX INFO: renamed from: ܽ */
    public final int f19932;

    /* JADX INFO: renamed from: ܿ */
    public final Field f19933;

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC4245 f19934;

    /* JADX INFO: renamed from: ᩻ */
    public final EnumC9629 f19935;

    public C7618(Field field, InterfaceC13653 interfaceC13653) throws C23711 {
        int iM20654;
        this.f19933 = field;
        this.f19929 = interfaceC13653;
        EnumC4245 enumC4245Type = interfaceC13653.type();
        this.f19934 = enumC4245Type;
        EnumC15663 enumC15663Cls = interfaceC13653.cls();
        if (enumC15663Cls == EnumC15663.AUTOMATIC) {
            if (interfaceC13653.tagNumber() != -1) {
                enumC15663Cls = EnumC15663.CONTEXT_SPECIFIC;
            } else {
                enumC15663Cls = EnumC15663.UNIVERSAL;
            }
        }
        this.f19930 = AbstractC8939.m20655(enumC15663Cls);
        if (interfaceC13653.tagNumber() != -1) {
            iM20654 = interfaceC13653.tagNumber();
        } else {
            iM20654 = (enumC4245Type == EnumC4245.CHOICE || enumC4245Type == EnumC4245.ANY) ? -1 : AbstractC8939.m20654(enumC4245Type);
        }
        this.f19932 = iM20654;
        EnumC9629 enumC9629Tagging = interfaceC13653.tagging();
        this.f19935 = enumC9629Tagging;
        if ((enumC9629Tagging == EnumC9629.EXPLICIT || enumC9629Tagging == EnumC9629.IMPLICIT) && interfaceC13653.tagNumber() == -1) {
            throw new C23711("Tag number must be specified when tagging mode is " + enumC9629Tagging);
        }
        this.f19931 = interfaceC13653.optional();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Field m17575() {
        return this.f19933;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13653 m17570() {
        return this.f19929;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m17574() {
        return this.f19931;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m17572() {
        return this.f19930;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m17573() {
        return this.f19932;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17571(C18997 c18997, Object obj) {
        int iM43141 = c18997.m43141();
        int i = this.f19930;
        int i2 = this.f19932;
        if (i2 != -1) {
            int iM43140 = c18997.m43140();
            if (iM43141 != i || iM43140 != i2) {
                throw new C3594("Tag mismatch. Expected: " + AbstractC8939.m20657(i, i2) + ", but found " + AbstractC8939.m20657(iM43141, iM43140));
            }
        } else if (iM43141 != i) {
            throw new C3594("Tag mismatch. Expected class: " + AbstractC8939.m20656(i) + ", but found " + AbstractC8939.m20656(iM43141));
        }
        if (this.f19935 == EnumC9629.EXPLICIT) {
            try {
                c18997 = c18997.m43137().m50191();
            } catch (C16314 e) {
                throw new C23711("Failed to read contents of EXPLICIT data value", e);
            }
        }
        Field field = this.f19933;
        InterfaceC13653 interfaceC13653 = this.f19929;
        EnumC4245 enumC4245 = this.f19934;
        try {
            int i3 = C2923.f5082[enumC4245.ordinal()];
            if (i3 == 4 || i3 == 5) {
                if (C24381.class.equals(field.getType())) {
                    field.set(obj, C10300.m23913(enumC4245, c18997, field.getType()));
                    return;
                } else {
                    if (interfaceC13653.listElementType() == Object.class) {
                        throw new RuntimeException(field.toString());
                    }
                    field.set(obj, C17004.m38602(c18997, interfaceC13653.listElementType()));
                    return;
                }
            }
            field.set(obj, C10300.m23913(enumC4245, c18997, field.getType()));
        } catch (Exception e2) {
            throw new C23711("Failed to set value of " + obj.getClass().getName() + "." + field.getName(), e2);
        }
    }
}
