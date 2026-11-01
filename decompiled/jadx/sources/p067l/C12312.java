package p067l;

import com.umeng.analytics.pro.C0684bo;
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
public final class C12312 {
    /* JADX INFO: renamed from: ܽ */
    public static byte[] m28371(Object obj) throws C8288 {
        Class<?> cls = obj.getClass();
        InterfaceC23041 interfaceC23041 = (InterfaceC23041) C19668.m44678(cls);
        if (interfaceC23041 == null) {
            throw new C8288(cls.getName() + " not annotated with " + InterfaceC23041.class.getName());
        }
        EnumC4245 enumC4245Type = interfaceC23041.type();
        int i = C6947.f18074[enumC4245Type.ordinal()];
        if (i == 1) {
            return m28372(obj);
        }
        if (i == 2) {
            return m28361(obj, false);
        }
        if (i == 3) {
            return m28361(obj, true);
        }
        throw new C8288("Unsupported container type: " + enumC4245Type);
    }

    /* JADX INFO: renamed from: ܿ */
    public static byte[] m28372(Object obj) throws C8288 {
        Class<?> cls = obj.getClass();
        ArrayList<C5606> arrayListM28373 = m28373(obj);
        if (arrayListM28373.isEmpty()) {
            throw new C8288("No fields annotated with " + InterfaceC13653.class.getName() + " in CHOICE class " + cls.getName());
        }
        C5606 c5606 = null;
        for (C5606 c5607 : arrayListM28373) {
            if (m28367(c5607.m12415(), obj) != null) {
                if (c5606 != null) {
                    throw new C8288("Multiple non-null fields in CHOICE class " + cls.getName() + ": " + c5606.m12415().getName() + ", " + c5607.m12415().getName());
                }
                c5606 = c5607;
            }
        }
        if (c5606 == null) {
            throw new C8288("No non-null fields in CHOICE class ".concat(cls.getName()));
        }
        return c5606.m12416();
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m28369(Object obj) {
        return m28361(obj, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28361(Object obj, boolean z) throws C8288 {
        Class<?> cls = obj.getClass();
        ArrayList<C5606> arrayListM28373 = m28373(obj);
        Collections.sort(arrayListM28373, new C21700());
        if (arrayListM28373.size() > 1) {
            C5606 c5606 = null;
            for (C5606 c5607 : arrayListM28373) {
                if (c5606 != null && c5606.m12414().index() == c5607.m12414().index()) {
                    throw new C8288("Fields have the same index: " + cls.getName() + "." + c5606.m12415().getName() + " and ." + c5607.m12415().getName());
                }
                c5606 = c5607;
            }
        }
        ArrayList<byte[]> arrayList = new ArrayList(arrayListM28373.size());
        int length = 0;
        for (C5606 c5608 : arrayListM28373) {
            try {
                byte[] bArrM12416 = c5608.m12416();
                if (bArrM12416 != null) {
                    arrayList.add(bArrM12416);
                    length += bArrM12416.length;
                }
            } catch (C8288 e) {
                throw new C8288("Failed to encode " + cls.getName() + "." + c5608.m12415().getName(), e);
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
        return m28368(0, true, 16, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m28370(Collection collection, EnumC4245 enumC4245) {
        return m28365(collection, enumC4245, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28364(Collection collection, EnumC4245 enumC4245) {
        return m28365(collection, enumC4245, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28365(Collection collection, EnumC4245 enumC4245, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(C14323.m32893(it.next(), enumC4245, null));
        }
        if (z) {
            if (arrayList.size() > 1) {
                Collections.sort(arrayList, C14993.f42834);
            }
            i = 17;
        } else {
            i = 16;
        }
        return m28368(0, true, i, (byte[][]) arrayList.toArray(new byte[0][]));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static ArrayList m28373(Object obj) throws C8288 {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC13653 interfaceC13653 = (InterfaceC13653) field.getAnnotation(InterfaceC13653.class);
            if (interfaceC13653 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C8288(InterfaceC13653.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C5606(obj, field, interfaceC13653));
                } catch (C8288 e) {
                    throw new C8288("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28357(int i) {
        return m28368(0, false, 2, BigInteger.valueOf(i).toByteArray());
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28359(long j) {
        return m28368(0, false, 2, BigInteger.valueOf(j).toByteArray());
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28363(BigInteger bigInteger) {
        return m28368(0, false, 2, bigInteger.toByteArray());
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28366(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return m28368(0, false, 1, bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m28362(String str) throws C8288 {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length < 2) {
            throw new C8288("OBJECT IDENTIFIER must contain at least two nodes: ".concat(str));
        }
        try {
            int i = Integer.parseInt(strArrSplit[0]);
            if (i > 6 || i < 0) {
                throw new C8288(C20778.m46922(i, "Invalid value for node #1: "));
            }
            try {
                int i2 = Integer.parseInt(strArrSplit[1]);
                if (i2 >= 40 || i2 < 0) {
                    throw new C8288(C20778.m46922(i2, "Invalid value for node #2: "));
                }
                int i3 = (i * 40) + i2;
                if (i3 > 255) {
                    throw new C8288(C19768.m44907("First two nodes out of range: ", i, i2, "."));
                }
                byteArrayOutputStream.write(i3);
                for (int i4 = 2; i4 < strArrSplit.length; i4++) {
                    String str2 = strArrSplit[i4];
                    try {
                        int i5 = Integer.parseInt(str2);
                        if (i5 < 0) {
                            throw new C8288("Invalid value for node #" + (i4 + 1) + ": " + i5);
                        }
                        if (i5 <= 127) {
                            byteArrayOutputStream.write(i5);
                        } else if (i5 < 16384) {
                            byteArrayOutputStream.write((i5 >> 7) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        } else {
                            if (i5 >= 2097152) {
                                throw new C8288("Node #" + (i4 + 1) + " too large: " + i5);
                            }
                            byteArrayOutputStream.write((i5 >> 14) | 128);
                            byteArrayOutputStream.write((127 & (i5 >> 7)) | 128);
                            byteArrayOutputStream.write(i5 & 127);
                        }
                    } catch (NumberFormatException unused) {
                        throw new C8288("Node #" + (i4 + 1) + " not numeric: " + str2);
                    }
                }
                return m28368(0, false, 6, byteArrayOutputStream.toByteArray());
            } catch (NumberFormatException unused2) {
                throw new C8288("Node #2 not numeric: " + strArrSplit[1]);
            }
        } catch (NumberFormatException unused3) {
            throw new C8288("Node #1 not numeric: " + strArrSplit[0]);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m28367(Field field, Object obj) throws C8288 {
        try {
            return field.get(obj);
        } catch (Exception e) {
            throw new C8288("Failed to read " + obj.getClass().getName() + "." + field.getName(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m28368(int i, boolean z, int i2, byte[]... bArr) {
        byte[] bArr2;
        if (i2 >= 31) {
            throw new IllegalArgumentException(C20778.m46922(i2, "High tag numbers not supported: "));
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
                bArr4[1] = C0684bo.f2503h;
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
