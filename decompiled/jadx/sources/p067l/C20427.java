package p067l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20427 implements InterfaceC21867 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f63114 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static C5004 f63115;

    /* JADX INFO: renamed from: ܽ */
    public static final HashSet f63116;

    static {
        new C20427();
        f63116 = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        f63115 = new C5004();
    }

    @Override // p067l.InterfaceC21867
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6844(Class cls) {
        return AbstractC6285.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.۫ᩴۖ] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l.۫ᩴۖ] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // p067l.InterfaceC21867
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC8455 mo6843(Class cls) {
        C6345 c6345;
        C17270 c17270M39086;
        ?? c22439;
        Class<?> returnType;
        if (!AbstractC6285.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        C19244 descriptorForType = m46114(cls).getDescriptorForType();
        List fields = descriptorForType.getFields();
        C23346 c23346 = new C23346(fields.size());
        c23346.m52001(m46114(cls));
        int i = C11710.f32639[descriptorForType.mo3535().m16490().ordinal()];
        c23346.m51999(i != 1 ? i != 2 ? EnumC7785.EDITIONS : EnumC7785.PROTO3 : EnumC7785.PROTO2);
        c23346.m52002(descriptorForType.m43838().m41616());
        C6345 c6346 = new C6345();
        Class<?>[] clsArr = null;
        Field fieldM46113 = null;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < fields.size()) {
            C2479 c2479 = (C2479) fields.get(i2);
            boolean zM3550 = c2479.m3550();
            EnumC19915 enumC19915M3539 = c2479.m3539();
            EnumC19915 enumC19915 = EnumC19915.ENUM;
            ?? c9027 = (enumC19915M3539 == enumC19915 && c2479.m3536()) ? new C9027(c2479) : clsArr;
            if (c2479.m3549() != null) {
                C14490 c14490M14504 = c6346.m14504(cls, c2479.m3540());
                EnumC3189 enumC3189M46111 = m46111(c2479);
                switch (C11710.f32641[enumC3189M46111.m5493().ordinal()]) {
                    case 1:
                        returnType = Boolean.class;
                        break;
                    case 2:
                        returnType = AbstractC7962.class;
                        break;
                    case 3:
                        returnType = Double.class;
                        break;
                    case 4:
                        returnType = Float.class;
                        break;
                    case 5:
                    case 6:
                        returnType = Integer.class;
                        break;
                    case 7:
                        returnType = Long.class;
                        break;
                    case 8:
                        returnType = String.class;
                        break;
                    case 9:
                        try {
                            returnType = cls.getDeclaredMethod(m46112(c2479.getType() == EnumC20586.f63634 ? c2479.m3548().getName() : c2479.getName()), clsArr).getReturnType();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid type for oneof: " + enumC3189M46111);
                }
                c23346.m52000(C17270.m39081(c2479.getNumber(), enumC3189M46111, c14490M14504, returnType, zM3550, c9027));
                c6345 = c6346;
            } else {
                EnumC20586 type = c2479.getType();
                EnumC20586 enumC20586 = EnumC20586.f63634;
                String name = type == enumC20586 ? c2479.m3548().getName() : c2479.getName();
                c6345 = c6346;
                Field fieldM46114 = m46113(cls, C10965.m25286(new StringBuilder(), m46109(name, false), f63116.contains(m46109(name, z)) ? "__" : "_"));
                int number = c2479.getNumber();
                EnumC3189 enumC3189M46112 = m46111(c2479);
                if (c2479.m3546()) {
                    if (fieldM46113 == null) {
                        fieldM46113 = m46113(cls, C19768.m44906(i3, "bitField", "_"));
                    }
                    c23346.m52000(c2479.m3529() ? C17270.m39090(fieldM46114, number, enumC3189M46112, fieldM46113, i4, zM3550, c9027) : C17270.m39085(fieldM46114, number, enumC3189M46112, fieldM46113, i4, zM3550, c9027));
                    int i5 = i4 << 1;
                    if (i5 == 0) {
                        i3++;
                        fieldM46113 = null;
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                } else {
                    if (c2479.m3538()) {
                        C2479 c2479M43835 = c2479.m3548().m43835(2);
                        if (c2479M43835.m3539() == enumC19915 && c2479M43835.m3536()) {
                            c22439 = c9027;
                            c22439 = c9027;
                            c22439 = new C22439(c2479M43835);
                        }
                        c22439 = c9027;
                        c22439 = c9027;
                        c22439 = c9027;
                        String name2 = c2479.getName();
                        int i6 = C10606.f29361;
                        try {
                            StringBuilder sb = new StringBuilder();
                            sb.append(cls.getName());
                            sb.append("$");
                            StringBuilder sb2 = new StringBuilder();
                            boolean z2 = true;
                            for (int i7 = 0; i7 < name2.length(); i7++) {
                                char cCharAt = name2.charAt(i7);
                                if ('a' > cCharAt || cCharAt > 'z') {
                                    if ('A' > cCharAt || cCharAt > 'Z') {
                                        if ('0' <= cCharAt && cCharAt <= '9') {
                                            sb2.append(cCharAt);
                                        }
                                        z2 = true;
                                    } else if (i7 != 0 || z2) {
                                        sb2.append(cCharAt);
                                    } else {
                                        sb2.append((char) (cCharAt + ' '));
                                    }
                                } else if (z2) {
                                    sb2.append((char) (cCharAt - ' '));
                                } else {
                                    sb2.append(cCharAt);
                                }
                                z2 = false;
                            }
                            sb.append(sb2.toString());
                            sb.append("DefaultEntryHolder");
                            Field[] declaredFields = Class.forName(sb.toString()).getDeclaredFields();
                            if (declaredFields.length != 1) {
                                throw new IllegalStateException("Unable to look up map field default entry holder class for " + name2 + " in " + cls.getName());
                            }
                            c17270M39086 = C17270.m39082(fieldM46114, number, C22558.m50552(declaredFields[0]), (InterfaceC14331) c22439);
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    } else if (c2479.mo3530() && c2479.m3539() == EnumC19915.MESSAGE) {
                        try {
                            c17270M39086 = C17270.m39083(fieldM46114, number, enumC3189M46112, cls.getDeclaredMethod(m46112(c2479.getType() == enumC20586 ? c2479.m3548().getName() : c2479.getName()), Integer.TYPE).getReturnType());
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (c2479.mo3544()) {
                        c17270M39086 = c9027 != 0 ? C17270.m39087(fieldM46114, number, enumC3189M46112, c9027, m46113(cls, C10965.m25286(new StringBuilder(), m46109(c2479.getName(), false), "MemoizedSerializedSize"))) : C17270.m39084(fieldM46114, number, enumC3189M46112, m46113(cls, C10965.m25286(new StringBuilder(), m46109(c2479.getName(), false), "MemoizedSerializedSize")));
                    } else {
                        c17270M39086 = c9027 != 0 ? C17270.m39086(fieldM46114, number, enumC3189M46112, (InterfaceC14331) c9027) : C17270.m39088(fieldM46114, number, enumC3189M46112, zM3550);
                    }
                    c23346.m52000(c17270M39086);
                }
            }
            i2++;
            z = true;
            clsArr = null;
            c6346 = c6345;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < fields.size(); i8++) {
            C2479 c24710 = (C2479) fields.get(i8);
            if (c24710.m3529() || (c24710.m3539() == EnumC19915.MESSAGE && f63115.m10633(c24710.m3548()))) {
                arrayList.add(Integer.valueOf(c24710.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        if (size > 0) {
            c23346.m52003(iArr);
        }
        return c23346.m51998();
    }

    /* JADX INFO: renamed from: ܽ */
    public static InterfaceC24548 m46114(Class cls) {
        try {
            return (InterfaceC24548) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC3189 m46111(C2479 c2479) {
        switch (C11710.f32640[c2479.getType().ordinal()]) {
            case 1:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6136 : EnumC3189.f6147;
                }
                return EnumC3189.f6153;
            case 2:
                return c2479.mo3530() ? EnumC3189.f6177 : EnumC3189.f6151;
            case 3:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6129 : EnumC3189.f6140;
                }
                return EnumC3189.f6157;
            case 4:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6166 : EnumC3189.f6168;
                }
                return EnumC3189.f6164;
            case 5:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6138 : EnumC3189.f6179;
                }
                return EnumC3189.f6159;
            case 6:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6143 : EnumC3189.f6145;
                }
                return EnumC3189.f6173;
            case 7:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6133 : EnumC3189.f6131;
                }
                return EnumC3189.f6162;
            case 8:
                return c2479.mo3530() ? EnumC3189.f6171 : EnumC3189.f6170;
            case 9:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6128 : EnumC3189.f6135;
                }
                return EnumC3189.f6127;
            case 10:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6175 : EnumC3189.f6161;
                }
                return EnumC3189.f6142;
            case 11:
                if (c2479.m3538()) {
                    return EnumC3189.f6176;
                }
                return c2479.mo3530() ? EnumC3189.f6134 : EnumC3189.f6172;
            case 12:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6154 : EnumC3189.f6156;
                }
                return EnumC3189.f6132;
            case 13:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6152 : EnumC3189.f6137;
                }
                return EnumC3189.f6148;
            case 14:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6141 : EnumC3189.f6158;
                }
                return EnumC3189.f6178;
            case 15:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6165 : EnumC3189.f6150;
                }
                return EnumC3189.f6130;
            case 16:
                return c2479.mo3530() ? EnumC3189.f6167 : EnumC3189.f6169;
            case 17:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6139 : EnumC3189.f6180;
                }
                return EnumC3189.f6160;
            case 18:
                if (c2479.mo3530()) {
                    return c2479.mo3544() ? EnumC3189.f6144 : EnumC3189.f6146;
                }
                return EnumC3189.f6174;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + c2479.getType());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Field m46113(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbM11879 = C5410.m11879("Unable to find field ", str, " in message class ");
            sbM11879.append(cls.getName());
            throw new IllegalArgumentException(sbM11879.toString());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46108(String str) {
        return m46109(str, false);
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m46112(String str) {
        String strM46109 = m46109(str, false);
        return "get" + Character.toUpperCase(strM46109.charAt(0)) + strM46109.substring(1, strM46109.length());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46109(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '_') {
                z = true;
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
                z = true;
            } else if (z) {
                sb.append(Character.toUpperCase(cCharAt));
                z = false;
            } else if (i == 0) {
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
