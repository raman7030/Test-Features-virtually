package l;

import com.umeng.analytics.pro.bo;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: l.ۗᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes2.dex */
public final class C3406 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 f10776;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f10777;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f10778;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Field f10779;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f10780;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC1974 f10781;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f10782;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC7639 f10783;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object f10784;

    public C3406(Object obj, Field field, InterfaceC11873 interfaceC11873) throws C6228 {
        int iM39524;
        this.f10784 = obj;
        this.f10779 = field;
        this.f10776 = interfaceC11873;
        EnumC1974 enumC1974Type = interfaceC11873.type();
        this.f10778 = enumC1974Type;
        this.f10781 = interfaceC11873.elementType();
        EnumC13988 enumC13988Cls = interfaceC11873.cls();
        if (enumC13988Cls == EnumC13988.AUTOMATIC) {
            if (interfaceC11873.tagNumber() != -1) {
                enumC13988Cls = EnumC13988.CONTEXT_SPECIFIC;
            } else {
                enumC13988Cls = EnumC13988.UNIVERSAL;
            }
        }
        int i = C11147.f33468[enumC13988Cls.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        throw new IllegalArgumentException("Unsupported tag class: " + enumC13988Cls);
                    }
                    i2 = 0;
                }
            }
        }
        this.f10780 = i2;
        if (interfaceC11873.tagNumber() != -1) {
            iM39524 = interfaceC11873.tagNumber();
        } else {
            iM39524 = (enumC1974Type == EnumC1974.CHOICE || enumC1974Type == EnumC1974.ANY) ? -1 : AbstractC16790.m39524(enumC1974Type);
        }
        this.f10782 = iM39524;
        EnumC7639 enumC7639Tagging = interfaceC11873.tagging();
        this.f10783 = enumC7639Tagging;
        if ((enumC7639Tagging == EnumC7639.EXPLICIT || enumC7639Tagging == EnumC7639.IMPLICIT) && interfaceC11873.tagNumber() == -1) {
            throw new C6228("Tag number must be specified when tagging mode is " + enumC7639Tagging);
        }
        this.f10777 = interfaceC11873.optional();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Field m10376() {
        return this.f10779;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC11873 m10375() {
        return this.f10776;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final byte[] m10377() {
        Object objM26337 = C10462.m26337(this.f10779, this.f10784);
        if (objM26337 == null) {
            if (this.f10777) {
                return null;
            }
            throw new C6228("Required field not set");
        }
        byte[] bArrM30818 = C12578.m30818(objM26337, this.f10778, this.f10781);
        int[] iArr = C4817.f15240;
        EnumC7639 enumC7639 = this.f10783;
        int i = iArr[enumC7639.ordinal()];
        if (i == 1) {
            return bArrM30818;
        }
        int i2 = this.f10780;
        int i3 = this.f10782;
        if (i == 2) {
            return C10462.m26338(i2, true, i3, bArrM30818);
        }
        if (i != 3) {
            throw new RuntimeException("Unknown tagging mode: " + enumC7639);
        }
        byte b = bArrM30818[0];
        if ((b & bo.j) == 31) {
            throw new C6228("High-tag-number form not supported");
        }
        if (i3 >= 31) {
            throw new C6228(C19370.m44628(i3, "Unsupported high tag number: "));
        }
        byte b2 = (byte) ((b & bo.k) | i3);
        bArrM30818[0] = b2;
        bArrM30818[0] = (byte) ((b2 & 63) | (i2 << 6));
        return bArrM30818;
    }
}
