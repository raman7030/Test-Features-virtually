package l;

import com.umeng.analytics.pro.bo;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B7K */
/* JADX INFO: loaded from: classes3.dex */
public final class C10462 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m26341(Object obj) throws C6228 {
        Class<?> cls = obj.getClass();
        InterfaceC21751 interfaceC21751 = (InterfaceC21751) C18202.m42417(cls);
        if (interfaceC21751 == null) {
            throw new C6228(cls.getName() + " not annotated with " + InterfaceC21751.class.getName());
        }
        EnumC1974 enumC1974Type = interfaceC21751.type();
        int i = C4817.f15241[enumC1974Type.ordinal()];
        if (i == 1) {
            return m26342(obj);
        }
        if (i == 2) {
            return m26331(obj, false);
        }
        if (i == 3) {
            return m26331(obj, true);
        }
        throw new C6228("Unsupported container type: " + enumC1974Type);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static byte[] m26342(Object obj) throws C6228 {
        Class<?> cls = obj.getClass();
        ArrayList<C3406> arrayListM26343 = m26343(obj);
        if (arrayListM26343.isEmpty()) {
            throw new C6228("No fields annotated with " + InterfaceC11873.class.getName() + " in CHOICE class " + cls.getName());
        }
        C3406 c3406 = null;
        for (C3406 c3407 : arrayListM26343) {
            if (m26337(c3407.m10376(), obj) != null) {
                if (c3406 != null) {
                    throw new C6228("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + c3406.m10376().getName() + ", " + c3407.m10376().getName());
                }
                c3406 = c3407;
            }
        }
        if (c3406 == null) {
            throw new C6228("No non-null fields in CHOICE class ".concat(cls.getName()));
        }
        return c3406.m10377();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m26339(Object obj) {
        return m26331(obj, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26331(Object obj, boolean z) throws C6228 {
        Class<?> cls = obj.getClass();
        ArrayList<C3406> arrayListM26343 = m26343(obj);
        Collections.sort(arrayListM26343, new C20340());
        if (arrayListM26343.size() > 1) {
            C3406 c3406 = null;
            for (C3406 c3407 : arrayListM26343) {
                if (c3406 != null && c3406.m10375().index() == c3407.m10375().index()) {
                    throw new C6228("Fields have the same index: " + cls.getName() + "." + c3406.m10376().getName() + " and ." + c3407.m10376().getName());
                }
                c3406 = c3407;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(arrayListM26343.size());
        int length = 0;
        for (C3406 c3408 : arrayListM26343) {
            try {
                byte[] bArrM10377 = c3408.m10377();
                if (bArrM10377 != null) {
                    arrayList.add(bArrM10377);
                    length += bArrM10377.length;
                }
            } catch (C6228 e) {
                throw new C6228("Failed to encode " + cls.getName() + "." + c3408.m10376().getName(), e);
            }
        }
        if (z) {
            byte[] bArr = new byte[length];
            int length2 = 0;
            for (byte[] bArr2 : arrayList) {
                System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                length2 += bArr2.length;
            }
            return bArr;
        }
        return m26338(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m26340(Collection collection, EnumC1974 enumC1974) {
        return m26335(collection, enumC1974, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26334(Collection collection, EnumC1974 enumC1974) {
        return m26335(collection, enumC1974, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26335(Collection collection, EnumC1974 enumC1974, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C12578.m30818(it.next(), enumC1974, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, C13283.f39769);
            }
            i = 17;
        } else {
            i = 16;
        }
        return m26338(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m26343(Object obj) throws C6228 {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC11873 interfaceC11873 = (InterfaceC11873) field.getAnnotation(InterfaceC11873.class);
            if (interfaceC11873 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C6228(InterfaceC11873.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C3406(obj, field, interfaceC11873));
                } catch (C6228 e) {
                    throw new C6228("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26327(int i) {
        return m26338(0, false, 2, BigInteger.valueOf(i).toByteArray());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26329(long j) {
        return m26338(0, false, 2, BigInteger.valueOf(j).toByteArray());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26333(BigInteger bigInteger) {
        return m26338(0, false, 2, bigInteger.toByteArray());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26336(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return m26338(0, false, 1, bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m26332(String str) throws C6228 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            throw new C6228("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 6 || i < 0) {
                throw new C6228(C19370.m44628(i, "Invalid value for node #1: "));
            }
            try {
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i2 >= 40 || i2 < 0) {
                    throw new C6228(C19370.m44628(i2, "Invalid value for node #2: "));
                }
                int i3 = (i * 40) + i2;
                if (i3 > 255) {
                    throw new C6228(C18307.m42646("First two nodes out of range: ", i, i2, "."));
                }
                byteArrayOutputStream.write(i3);
                for (int i4 = 2; i4 < strArrSplit.length; i4++) {
                    String str2 = strArrSplit[i4];
                    try {
                        int i5 = Integer.parseInt(str2);
                        if (i5 < 0) {
                            throw new C6228("Invalid value for node #" + (i4 + 1) + ": " + i5);
                        }
                        if (i5 <= 127) {
                            byteArrayOutputStream.write(i5);
                        } else if (i5 < 16384) {
                            byteArrayOutputStream.write((i5 >> 7) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        } else {
                            if (i5 >= 2097152) {
                                throw new C6228("Node #" + (i4 + 1) + " too large: " + i5);
                            }
                            byteArrayOutputStream.write((i5 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (i5 >> 7)) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new C6228("Node #" + (i4 + 1) + " not numeric: " + str2);
                    }
                }
                return m26338(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new C6228("Node #2 not numeric: " + strArrSplit[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new C6228("Node #1 not numeric: " + strArrSplit[0]);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m26337(Field field, Object obj) throws C6228 {
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new C6228("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static byte[] m26338(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            throw new IllegalArgumentException(C19370.m44628(i2, "High tag numbers not supported: "));
        }
        int i3 = 6;
        byte b = (byte) ((i << 6) | (z ? 32 : 0) | i2);
        int length = 0;
        for (byte[] bArr3 : bArr) {
            length += bArr3.length;
        }
        int length2 = 2;
        if (length < 128) {
            bArr2 = new byte[length + 2];
            bArr2[0] = b;
            bArr2[1] = (byte) length;
        } else {
            if (length <= 255) {
                bArr2 = new byte[length + 3];
                bArr2[1] = -127;
                bArr2[2] = (byte) length;
                i3 = 3;
            } else if (length <= 65535) {
                byte[] bArr4 = new byte[length + 4];
                bArr4[1] = bo.h;
                bArr4[2] = (byte) (length >> 8);
                bArr4[3] = (byte) (length & 255);
                bArr2 = bArr4;
                i3 = 4;
            } else if (length <= 16777215) {
                byte[] bArr5 = new byte[length + 5];
                bArr5[1] = -125;
                bArr5[2] = (byte) (length >> 16);
                bArr5[3] = (byte) ((length >> 8) & 255);
                bArr5[4] = (byte) (length & 255);
                bArr2 = bArr5;
                i3 = 5;
            } else {
                byte[] bArr6 = new byte[length + 6];
                bArr6[1] = -124;
                bArr6[2] = (byte) (length >> 24);
                bArr6[3] = (byte) ((length >> 16) & 255);
                bArr6[4] = (byte) ((length >> 8) & 255);
                bArr6[5] = (byte) (length & 255);
                bArr2 = bArr6;
            }
            bArr2[0] = b;
            length2 = i3;
        }
        for (byte[] bArr7 : bArr) {
            System.arraycopy(bArr7, 0, bArr2, length2, bArr7.length);
            length2 += bArr7.length;
        }
        return bArr2;
    }
}
