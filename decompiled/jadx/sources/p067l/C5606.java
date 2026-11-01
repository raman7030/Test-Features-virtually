package p067l;

import com.umeng.analytics.pro.C0684bo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۗᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes2.dex */
public final class C5606 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13653 f13583;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f13584;

    /* JADX INFO: renamed from: ۧ */
    public final EnumC4245 f13585;

    /* JADX INFO: renamed from: ܳ */
    public final Field f13586;

    /* JADX INFO: renamed from: ܽ */
    public final int f13587;

    /* JADX INFO: renamed from: ܿ */
    public final EnumC4245 f13588;

    /* JADX INFO: renamed from: ᩳ */
    public final int f13589;

    /* JADX INFO: renamed from: ᩷ */
    public final EnumC9629 f13590;

    /* JADX INFO: renamed from: ᩻ */
    public final Object f13591;

    public C5606(Object obj, Field field, InterfaceC13653 interfaceC13653) throws C8288 {
        int iM41760;
        this.f13591 = obj;
        this.f13586 = field;
        this.f13583 = interfaceC13653;
        EnumC4245 enumC4245Type = interfaceC13653.type();
        this.f13585 = enumC4245Type;
        this.f13588 = interfaceC13653.elementType();
        EnumC15663 enumC15663Cls = interfaceC13653.cls();
        if (enumC15663Cls == EnumC15663.AUTOMATIC) {
            if (interfaceC13653.tagNumber() != -1) {
                enumC15663Cls = EnumC15663.CONTEXT_SPECIFIC;
            } else {
                enumC15663Cls = EnumC15663.UNIVERSAL;
            }
        }
        int i = C12963.f36468[enumC15663Cls.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unsupported tag class: " + enumC15663Cls);
                    }
                    i2 = 0;
                }
            }
        }
        this.f13587 = i2;
        if (interfaceC13653.tagNumber() != -1) {
            iM41760 = interfaceC13653.tagNumber();
        } else {
            iM41760 = (enumC4245Type == EnumC4245.CHOICE || enumC4245Type == EnumC4245.ANY) ? -1 : AbstractC18326.m41760(enumC4245Type);
        }
        this.f13589 = iM41760;
        EnumC9629 enumC9629Tagging = interfaceC13653.tagging();
        this.f13590 = enumC9629Tagging;
        if ((enumC9629Tagging == EnumC9629.EXPLICIT || enumC9629Tagging == EnumC9629.IMPLICIT) && interfaceC13653.tagNumber() == -1) {
            throw new C8288("Tag number must be specified when tagging mode is " + enumC9629Tagging);
        }
        this.f13584 = interfaceC13653.optional();
    }

    /* JADX INFO: renamed from: ۧ */
    public final Field m12415() {
        return this.f13586;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC13653 m12414() {
        return this.f13583;
    }

    /* JADX INFO: renamed from: ܽ */
    public final byte[] m12416() {
        Object objM28367 = C12312.m28367(this.f13586, this.f13591);
        if (objM28367 == null) {
            if (this.f13584) {
                return null;
            }
            throw new C8288("Required field not set");
        }
        byte[] bArrM32893 = C14323.m32893(objM28367, this.f13585, this.f13588);
        int[] iArr = C6947.f18073;
        EnumC9629 enumC9629 = this.f13590;
        int i = iArr[enumC9629.ordinal()];
        if (i == 1) {
            return bArrM32893;
        }
        int i2 = this.f13587;
        int i3 = this.f13589;
        if (i == 2) {
            return C12312.m28368(i2, true, i3, bArrM32893);
        }
        if (i != 3) {
            throw new RuntimeException("Unknown tagging mode: " + enumC9629);
        }
        byte b = bArrM32893[0];
        if ((b & C0684bo.f2505j) == 31) {
            throw new C8288("High-tag-number form not supported");
        }
        if (i3 >= 31) {
            throw new C8288(C20778.m46922(i3, "Unsupported high tag number: "));
        }
        byte b2 = (byte) ((b & C0684bo.f2506k) | i3);
        bArrM32893[0] = b2;
        bArrM32893[0] = (byte) ((b2 & 63) | (i2 << 6));
        return bArrM32893;
    }
}
