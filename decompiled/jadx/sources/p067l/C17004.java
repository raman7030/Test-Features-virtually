package p067l;

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
public final class C17004 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m38594(ByteBuffer byteBuffer, Class cls) throws C23711 {
        try {
            C18997 c18997M50191 = new C22351(byteBuffer).m50191();
            if (c18997M50191 == null) {
                throw new C23711("Empty input");
            }
            return m38607(c18997M50191, cls);
        } catch (C16314 e) {
            throw new C23711("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public static ArrayList m38609(ByteBuffer byteBuffer) throws C23711 {
        try {
            C18997 c18997M50191 = new C22351(byteBuffer).m50191();
            if (c18997M50191 == null) {
                throw new C23711("Empty input");
            }
            return m38602(c18997M50191, C13633.class);
        } catch (C16314 e) {
            throw new C23711("Failed to decode top-level data value", e);
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static Object m38606(C18997 c18997, Class cls) throws C23711 {
        ArrayList arrayListM38598 = m38598(cls);
        if (arrayListM38598.isEmpty()) {
            throw new C23711("No fields annotated with " + InterfaceC13653.class.getName() + " in CHOICE class " + cls.getName());
        }
        int i = 0;
        while (i < arrayListM38598.size() - 1) {
            C7618 c7618 = (C7618) arrayListM38598.get(i);
            int iM17573 = c7618.m17573();
            int iM17572 = c7618.m17572();
            i++;
            for (int i2 = i; i2 < arrayListM38598.size(); i2++) {
                C7618 c7619 = (C7618) arrayListM38598.get(i2);
                int iM17574 = c7619.m17573();
                int iM17575 = c7619.m17572();
                if (iM17573 == iM17574 && iM17572 == iM17575) {
                    throw new C23711("CHOICE fields are indistinguishable because they have the same tag class and number: " + cls.getName() + "." + c7618.m17575().getName() + " and ." + c7619.m17575().getName());
                }
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            Iterator it = arrayListM38598.iterator();
            while (it.hasNext()) {
                try {
                    ((C7618) it.next()).m17571(c18997, objNewInstance);
                    return objNewInstance;
                } catch (C3594 unused) {
                }
            }
            throw new C23711("No options of CHOICE " + cls.getName() + " matched");
        } catch (Exception e) {
            throw new C23711("Failed to instantiate ".concat(cls.getName()), e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static Object m38600(C18997 c18997, Class cls) {
        return m38596(c18997, cls, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m38596(C18997 c18997, Class cls, boolean z) throws C23711 {
        C18997 c18997M50191;
        ArrayList<C7618> arrayListM38598 = m38598(cls);
        Collections.sort(arrayListM38598, new C21030());
        if (arrayListM38598.size() > 1) {
            C7618 c7618 = null;
            for (C7618 c7619 : arrayListM38598) {
                if (c7618 != null && c7618.m17570().index() == c7619.m17570().index()) {
                    throw new C23711("Fields have the same index: " + cls.getName() + "." + c7618.m17575().getName() + " and ." + c7619.m17575().getName());
                }
                c7618 = c7619;
            }
        }
        try {
            Object objNewInstance = cls.getConstructor(null).newInstance(null);
            C22351 c22351M43137 = c18997.m43137();
            int i = 0;
            while (i < arrayListM38598.size()) {
                if (z && i == 0) {
                    c18997M50191 = c18997;
                } else {
                    try {
                        c18997M50191 = c22351M43137.m50191();
                    } catch (C16314 e) {
                        throw new C23711("Malformed data value", e);
                    }
                }
                if (c18997M50191 == null) {
                    break;
                }
                for (int i2 = i; i2 < arrayListM38598.size(); i2++) {
                    C7618 c76110 = (C7618) arrayListM38598.get(i2);
                    try {
                        if (c76110.m17574()) {
                            try {
                                c76110.m17571(c18997M50191, objNewInstance);
                            } catch (C3594 unused) {
                            }
                        } else {
                            c76110.m17571(c18997M50191, objNewInstance);
                        }
                        i = i2 + 1;
                        break;
                    } catch (C23711 e2) {
                        throw new C23711("Failed to parse " + cls.getName() + "." + c76110.m17575().getName(), e2);
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e3) {
            throw new C23711("Failed to instantiate ".concat(cls.getName()), e3);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public static ArrayList m38602(C18997 c18997, Class cls) throws C23711 {
        Object objM38607;
        ArrayList arrayList = new ArrayList();
        C22351 c22351M43137 = c18997.m43137();
        while (true) {
            try {
                C18997 c18997M50191 = c22351M43137.m50191();
                if (c18997M50191 == null) {
                    return arrayList;
                }
                if (ByteBuffer.class.equals(cls)) {
                    objM38607 = c18997M50191.m43139();
                } else if (C24381.class.equals(cls)) {
                    objM38607 = new C24381(c18997M50191.m43138());
                } else {
                    objM38607 = m38607(c18997M50191, cls);
                }
                arrayList.add(objM38607);
            } catch (C16314 e) {
                throw new C23711("Malformed data value", e);
            }
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static Object m38607(C18997 c18997, Class cls) throws C23711 {
        if (cls == null) {
            throw new NullPointerException("containerClass == null");
        }
        InterfaceC23041 interfaceC23041 = (InterfaceC23041) C19668.m44678(cls);
        if (interfaceC23041 == null) {
            throw new C23711(cls.getName() + " is not annotated with " + InterfaceC23041.class.getName());
        }
        int[] iArr = C2923.f5082;
        int i = iArr[interfaceC23041.type().ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            throw new C23711("Unsupported ASN.1 container annotation type: " + interfaceC23041.type());
        }
        EnumC4245 enumC4245Type = interfaceC23041.type();
        int i2 = iArr[enumC4245Type.ordinal()];
        if (i2 == 1) {
            return m38606(c18997, cls);
        }
        if (i2 != 2) {
            if (i2 == 3) {
                return m38596(c18997, cls, true);
            }
            throw new C23711("Parsing container " + enumC4245Type + " not supported");
        }
        int iM20654 = AbstractC8939.m20654(enumC4245Type);
        if (c18997.m43141() == 0 && c18997.m43140() == iM20654) {
            return m38596(c18997, cls, false);
        }
        throw new C3594("Unexpected data value read as " + cls.getName() + ". Expected " + AbstractC8939.m20657(0, iM20654) + ", but read: " + AbstractC8939.m20657(c18997.m43141(), c18997.m43140()));
    }

    /* JADX INFO: renamed from: ᩳ */
    public static String m38608(ByteBuffer byteBuffer) throws C23711 {
        if (!byteBuffer.hasRemaining()) {
            throw new C23711("Empty OBJECT IDENTIFIER");
        }
        long jM38605 = m38605(byteBuffer);
        int iMin = (int) Math.min(jM38605 / 40, 2L);
        StringBuilder sb = new StringBuilder();
        sb.append(Long.toString(iMin));
        sb.append('.');
        sb.append(Long.toString(jM38605 - ((long) (iMin * 40))));
        while (byteBuffer.hasRemaining()) {
            long jM38606 = m38605(byteBuffer);
            sb.append('.');
            sb.append(Long.toString(jM38606));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܿ */
    public static long m38605(ByteBuffer byteBuffer) throws C23711 {
        long j = 0;
        if (!byteBuffer.hasRemaining()) {
            return 0L;
        }
        while (byteBuffer.hasRemaining()) {
            if (j > 72057594037927935L) {
                throw new C23711("Base-128 number too large");
            }
            byte b = byteBuffer.get();
            j = (j << 7) | ((long) (b & ColorResourcesTableCreator.APPLICATION_PACKAGE_ID));
            if ((b & GCMSIVBlockCipher.MASK) == 0) {
                return j;
            }
        }
        throw new C23711("Truncated base-128 encoded input: missing terminating byte, with highest bit not set");
    }

    /* JADX INFO: renamed from: ܳ */
    public static BigInteger m38601(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new BigInteger(bArr);
        }
        return BigInteger.ZERO;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m38599(ByteBuffer byteBuffer) throws C23711 {
        BigInteger bigIntegerM38601 = m38601(byteBuffer);
        if (bigIntegerM38601.bitLength() <= 31) {
            return bigIntegerM38601.intValue();
        }
        throw new C23711(String.format("INTEGER cannot be represented as int: %1$d (0x%1$x)", bigIntegerM38601));
    }

    /* JADX INFO: renamed from: ܽ */
    public static long m38603(ByteBuffer byteBuffer) throws C23711 {
        BigInteger bigIntegerM38601 = m38601(byteBuffer);
        if (bigIntegerM38601.bitLength() <= 63) {
            return bigIntegerM38601.longValue();
        }
        throw new C23711(String.format("INTEGER cannot be represented as long: %1$d (0x%1$x)", bigIntegerM38601));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m38598(Class cls) throws C23711 {
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            InterfaceC13653 interfaceC13653 = (InterfaceC13653) field.getAnnotation(InterfaceC13653.class);
            if (interfaceC13653 != null) {
                if (Modifier.isStatic(field.getModifiers())) {
                    throw new C23711(InterfaceC13653.class.getName() + " used on a static field: " + cls.getName() + "." + field.getName());
                }
                try {
                    arrayList.add(new C7618(field, interfaceC13653));
                } catch (C23711 e) {
                    throw new C23711("Invalid ASN.1 annotation on " + cls.getName() + "." + field.getName(), e);
                }
            }
        }
        return arrayList;
    }
}
