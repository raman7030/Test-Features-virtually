package l;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: M9PM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19001 implements InterfaceC20517 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f59885 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C2773 f59886;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final HashSet f59887;

    static {
        new C19001();
        f59887 = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        f59886 = new C2773();
    }

    @Override // l.InterfaceC20517
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4612(Class cls) {
        return AbstractC4121.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [l.۫ᩴۖ] */
    /* JADX WARN: Type inference failed for: r15v2, types: [l.۫ᩴۖ] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // l.InterfaceC20517
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6405 mo4611(Class cls) {
        C4184 c4184;
        C15680 c15680M36920;
        ?? c21118;
        Class<?> returnType;
        if (!AbstractC4121.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        C17757 descriptorForType = m43846(cls).getDescriptorForType();
        List fields = descriptorForType.getFields();
        C22073 c22073 = new C22073(fields.size());
        c22073.m49663(m43846(cls));
        int i = C9829.f29686[descriptorForType.mo1134().m14583().ordinal()];
        c22073.m49661(i != 1 ? i != 2 ? EnumC5700.EDITIONS : EnumC5700.PROTO3 : EnumC5700.PROTO2);
        c22073.m49664(descriptorForType.m41593().m39380());
        C4184 c4185 = new C4184();
        Class<?>[] clsArr = null;
        Field fieldM43845 = null;
        boolean z = true;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < fields.size()) {
            C0117 c0117 = (C0117) fields.get(i2);
            boolean zM1149 = c0117.m1149();
            EnumC18463 enumC18463M1138 = c0117.m1138();
            EnumC18463 enumC18463 = EnumC18463.ENUM;
            ?? c7006 = (enumC18463M1138 == enumC18463 && c0117.m1135()) ? new C7006(c0117) : clsArr;
            if (c0117.m1148() != null) {
                C12755 c12755M12629 = c4185.m12629(cls, c0117.m1139());
                EnumC0864 enumC0864M43843 = m43843(c0117);
                switch (C9829.f29688[enumC0864M43843.m3179().ordinal()]) {
                    case 1:
                        returnType = Boolean.class;
                        break;
                    case 2:
                        returnType = AbstractC5886.class;
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
                            returnType = cls.getDeclaredMethod(m43844(c0117.getType() == EnumC19169.f60403 ? c0117.m1147().getName() : c0117.getName()), clsArr).getReturnType();
                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid type for oneof: " + enumC0864M43843);
                }
                c22073.m49662(C15680.m36915(c0117.getNumber(), enumC0864M43843, c12755M12629, returnType, zM1149, c7006));
                c4184 = c4185;
            } else {
                EnumC19169 type = c0117.getType();
                EnumC19169 enumC19169 = EnumC19169.f60403;
                String name = type == enumC19169 ? c0117.m1147().getName() : c0117.getName();
                c4184 = c4185;
                Field fieldM43846 = m43845(cls, C9045.m23341(new StringBuilder(), m43841(name, false), f59887.contains(m43841(name, z)) ? "__" : "_"));
                int number = c0117.getNumber();
                EnumC0864 enumC0864M43844 = m43843(c0117);
                if (c0117.m1145()) {
                    if (fieldM43845 == null) {
                        fieldM43845 = m43845(cls, C18307.m42645(i3, "bitField", "_"));
                    }
                    c22073.m49662(c0117.m1128() ? C15680.m36924(fieldM43846, number, enumC0864M43844, fieldM43845, i4, zM1149, c7006) : C15680.m36919(fieldM43846, number, enumC0864M43844, fieldM43845, i4, zM1149, c7006));
                    int i5 = i4 << 1;
                    if (i5 == 0) {
                        i3++;
                        fieldM43845 = null;
                        i4 = 1;
                    } else {
                        i4 = i5;
                    }
                } else {
                    if (c0117.m1137()) {
                        C0117 c0117M41590 = c0117.m1147().m41590(2);
                        if (c0117M41590.m1138() == enumC18463 && c0117M41590.m1135()) {
                            c21118 = c7006;
                            c21118 = c7006;
                            c21118 = new C21118(c0117M41590);
                        }
                        c21118 = c7006;
                        c21118 = c7006;
                        c21118 = c7006;
                        String name2 = c0117.getName();
                        int i6 = C8668.f26436;
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
                            c15680M36920 = C15680.m36916(fieldM43846, number, C21244.m48221(declaredFields[0]), (InterfaceC12587) c21118);
                        } catch (Throwable th) {
                            throw new RuntimeException(th);
                        }
                    } else if (c0117.mo1129() && c0117.m1138() == EnumC18463.MESSAGE) {
                        try {
                            c15680M36920 = C15680.m36917(fieldM43846, number, enumC0864M43844, cls.getDeclaredMethod(m43844(c0117.getType() == enumC19169 ? c0117.m1147().getName() : c0117.getName()), Integer.TYPE).getReturnType());
                        } catch (Exception e2) {
                            throw new RuntimeException(e2);
                        }
                    } else if (c0117.mo1143()) {
                        c15680M36920 = c7006 != 0 ? C15680.m36921(fieldM43846, number, enumC0864M43844, c7006, m43845(cls, C9045.m23341(new StringBuilder(), m43841(c0117.getName(), false), "MemoizedSerializedSize"))) : C15680.m36918(fieldM43846, number, enumC0864M43844, m43845(cls, C9045.m23341(new StringBuilder(), m43841(c0117.getName(), false), "MemoizedSerializedSize")));
                    } else {
                        c15680M36920 = c7006 != 0 ? C15680.m36920(fieldM43846, number, enumC0864M43844, (InterfaceC12587) c7006) : C15680.m36922(fieldM43846, number, enumC0864M43844, zM1149);
                    }
                    c22073.m49662(c15680M36920);
                }
            }
            i2++;
            z = true;
            clsArr = null;
            c4185 = c4184;
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < fields.size(); i8++) {
            C0117 c0118 = (C0117) fields.get(i8);
            if (c0118.m1128() || (c0118.m1138() == EnumC18463.MESSAGE && f59886.m8570(c0118.m1147()))) {
                arrayList.add(Integer.valueOf(c0118.getNumber()));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            iArr[i9] = ((Integer) arrayList.get(i9)).intValue();
        }
        if (size > 0) {
            c22073.m49665(iArr);
        }
        return c22073.m49660();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23338 m43846(Class cls) {
        try {
            return (InterfaceC23338) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0864 m43843(C0117 c0117) {
        switch (C9829.f29687[c0117.getType().ordinal()]) {
            case 1:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3363 : EnumC0864.f3374;
                }
                return EnumC0864.f3380;
            case 2:
                return c0117.mo1129() ? EnumC0864.f3404 : EnumC0864.f3378;
            case 3:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3356 : EnumC0864.f3367;
                }
                return EnumC0864.f3384;
            case 4:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3393 : EnumC0864.f3395;
                }
                return EnumC0864.f3391;
            case 5:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3365 : EnumC0864.f3406;
                }
                return EnumC0864.f3386;
            case 6:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3370 : EnumC0864.f3372;
                }
                return EnumC0864.f3400;
            case 7:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3360 : EnumC0864.f3358;
                }
                return EnumC0864.f3389;
            case 8:
                return c0117.mo1129() ? EnumC0864.f3398 : EnumC0864.f3397;
            case 9:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3355 : EnumC0864.f3362;
                }
                return EnumC0864.f3354;
            case 10:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3402 : EnumC0864.f3388;
                }
                return EnumC0864.f3369;
            case 11:
                if (c0117.m1137()) {
                    return EnumC0864.f3403;
                }
                return c0117.mo1129() ? EnumC0864.f3361 : EnumC0864.f3399;
            case 12:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3381 : EnumC0864.f3383;
                }
                return EnumC0864.f3359;
            case 13:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3379 : EnumC0864.f3364;
                }
                return EnumC0864.f3375;
            case 14:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3368 : EnumC0864.f3385;
                }
                return EnumC0864.f3405;
            case 15:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3392 : EnumC0864.f3377;
                }
                return EnumC0864.f3357;
            case 16:
                return c0117.mo1129() ? EnumC0864.f3394 : EnumC0864.f3396;
            case 17:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3366 : EnumC0864.f3407;
                }
                return EnumC0864.f3387;
            case 18:
                if (c0117.mo1129()) {
                    return c0117.mo1143() ? EnumC0864.f3371 : EnumC0864.f3373;
                }
                return EnumC0864.f3401;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + c0117.getType());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Field m43845(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbM9834 = C3200.m9834("Unable to find field ", str, " in message class ");
            sbM9834.append(cls.getName());
            throw new IllegalArgumentException(sbM9834.toString());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43840(String str) {
        return m43841(str, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m43844(String str) {
        String strM43841 = m43841(str, false);
        return "get" + Character.toUpperCase(strM43841.charAt(0)) + strM43841.substring(1, strM43841.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m43841(String str, boolean z) {
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
