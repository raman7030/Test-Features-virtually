package l;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;

/* JADX INFO: renamed from: l.ܶᩳᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB8H */
/* JADX INFO: loaded from: classes4.dex */
public final class C15399 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m36436(ByteBuffer byteBuffer, Class cls) throws C22456 {
        try {
            C17496 c17496M47861 = new C21025(byteBuffer).m47861();
            if (c17496M47861 == null) {
                throw new C22456("Empty input");
            }
            return m36449(c17496M47861, cls);
        } catch (C14673 e) {
            throw new C22456("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static ArrayList m36451(ByteBuffer byteBuffer) throws C22456 {
        try {
            C17496 c17496M47861 = new C21025(byteBuffer).m47861();
            if (c17496M47861 == null) {
                throw new C22456("Empty input");
            }
            return m36444(c17496M47861, C11852.class);
        } catch (C14673 e) {
            throw new C22456("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static Object m36448(C17496 c17496, Class cls) throws C22456 {
        ArrayList arrayListM36440 = m36440(cls);
        if (arrayListM36440.isEmpty()) {
            throw new C22456("No fields annotated with " + InterfaceC11873.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        while (i < arrayListM36440.size() - 1) {
            C5523 c5523 = (C5523) arrayListM36440.get(i);
            int iM15658 = c5523.m15658();
            int iM15657 = c5523.m15657();
            i++;
            for (int i2 = i; i2 < arrayListM36440.size(); i2++) {
                C5523 c5524 = (C5523) arrayListM36440.get(i2);
                int iM15659 = c5524.m15658();
                int iM156510 = c5524.m15657();
                if (iM15658 == iM15659 && iM15657 == iM156510) {
                    throw new C22456("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + c5523.m15660().getName() + " and ." + c5524.m15660().getName());
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            Iterator it = arrayListM36440.iterator();
            while (it.hasNext()) {
                try {
                    ((C5523) it.next()).m15656(c17496, objNewInstance);
                    return objNewInstance;
                } catch (C1289 unused) {
                }
            }
            throw new C22456("No options of CHOICE " + cls.getName() + " matched");
        } catch (Exception e) {
            throw new C22456("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m36442(C17496 c17496, Class cls) {
        return m36438(c17496, cls, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m36438(C17496 c17496, Class cls, boolean z) throws C22456 {
        C17496 c17496M47861;
        ArrayList<C5523> arrayListM36440 = m36440(cls);
        Collections.sort(arrayListM36440, new C19635());
        if (arrayListM36440.size() > 1) {
            C5523 c5523 = null;
            for (C5523 c5524 : arrayListM36440) {
                if (c5523 != null && c5523.m15655().index() == c5524.m15655().index()) {
                    throw new C22456("Fields have the same index: " + cls.getName() + "." + c5523.m15660().getName() + " and ." + c5524.m15660().getName());
                }
                c5523 = c5524;
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            C21025 c21025M40879 = c17496.m40879();
            int i = 0;
            while (i < arrayListM36440.size()) {
                if (z && i == 0) {
                    c17496M47861 = c17496;
                } else {
                    try {
                        c17496M47861 = c21025M40879.m47861();
                    } catch (C14673 e) {
                        throw new C22456("Malformed data value", e);
                    }
                }
                if (c17496M47861 == null) {
                    break;
                }
                for (int i2 = i; i2 < arrayListM36440.size(); i2++) {
                    C5523 c5525 = (C5523) arrayListM36440.get(i2);
                    try {
                        if (c5525.m15659()) {
                            try {
                                c5525.m15656(c17496M47861, objNewInstance);
                            } catch (C1289 unused) {
                            }
                        } else {
                            c5525.m15656(c17496M47861, objNewInstance);
                        }
                        i = i2 + 1;
                        break;
                    } catch (C22456 e2) {
                        throw new C22456("Failed to parse " + cls.getName() + "." + c5525.m15660().getName(), e2);
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e3) {
            throw new C22456("Failed to instantiate ".concat(cls.getName()), e3);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static ArrayList m36444(C17496 c17496, Class cls) throws C22456 {
        Object objM36449;
        ArrayList arrayList = new ArrayList();
        C21025 c21025M40879 = c17496.m40879();
        while (true) {
            try {
                C17496 c17496M47861 = c21025M40879.m47861();
                if (c17496M47861 == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(cls)) {
                    objM36449 = c17496M47861.m40881();
                } else if (C23161.class.equals(cls)) {
                    objM36449 = new C23161(c17496M47861.m40880());
                } else {
                    objM36449 = m36449(c17496M47861, cls);
                }
                arrayList.add(objM36449);
            } catch (C14673 e) {
                throw new C22456("Malformed data value", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static Object m36449(C17496 c17496, Class cls) throws C22456 {
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        InterfaceC21751 interfaceC21751 = (InterfaceC21751) C18202.m42417(cls);
        if (interfaceC21751 == null) {
            throw new C22456(cls.getName() + " is not annotated with " + InterfaceC21751.class.getName());
        }
        int[] iArr = C0583.f2307;
        int i = iArr[interfaceC21751.type().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C22456("Unsupported ASN.1 container annotation type: " + interfaceC21751.type());
        }
        EnumC1974 enumC1974Type = interfaceC21751.type();
        int i2 = iArr[enumC1974Type.ordinal()];
        if (i2 == 1) {
            return m36448(c17496, cls);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return m36438(c17496, cls, true);
            }
            throw new C22456("Parsing container " + enumC1974Type + " not supported");
        }
        int iM18705 = AbstractC6913.m18705(enumC1974Type);
        if (c17496.m40883() == 0 && c17496.m40882() == iM18705) {
            return m36438(c17496, cls, false);
        }
        throw new C1289("Unexpected data value read as " + cls.getName() + ". Expected " + AbstractC6913.m18708(0, iM18705) + ", but read: " + AbstractC6913.m18708(c17496.m40883(), c17496.m40882()));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static String m36450(ByteBuffer byteBuffer) throws C22456 {
        if (!byteBuffer.hasRemaining()) {
            throw new C22456("Empty OBJECT IDENTIFIER");
        }
        long jM36447 = m36447(byteBuffer);
        int iMin = (int) Math.min(jM36447 / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(iMin));
        sb.append('.');
        sb.append(Long.toString(jM36447 - ((long) (iMin * 40))));
        while (byteBuffer.hasRemaining()) {
            long jM36448 = m36447(byteBuffer);
            sb.append('.');
            sb.append(Long.toString(jM36448));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static long m36447(ByteBuffer byteBuffer) throws C22456 {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new C22456("Base-128 number too large");
            }
            byte b = byteBuffer.get();
            j = (j << 7) | ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw new C22456("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static BigInteger m36443(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new BigInteger(bArr);
        }
        return BigInteger.ZERO;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m36441(ByteBuffer byteBuffer) throws C22456 {
        BigInteger bigIntegerM36443 = m36443(byteBuffer);
        if (bigIntegerM36443.bitLength() <= 31) {
            return bigIntegerM36443.intValue();
        }
        throw new C22456(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerM36443));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static long m36445(ByteBuffer byteBuffer) throws C22456 {
        BigInteger bigIntegerM36443 = m36443(byteBuffer);
        if (bigIntegerM36443.bitLength() <= 63) {
            return bigIntegerM36443.longValue();
        }
        throw new C22456(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerM36443));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m36440(Class cls) throws C22456 {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC11873 interfaceC11873 = (InterfaceC11873) field.getAnnotation(InterfaceC11873.class);
            if (interfaceC11873 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C22456(InterfaceC11873.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C5523(field, interfaceC11873));
                } catch (C22456 e) {
                    throw new C22456("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }
}
