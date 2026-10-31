package l;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;

/* JADX INFO: renamed from: l.ۢ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W9NV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9815 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f29669 = {KeyFactorySpi.Ed25519_type, 114, KeyFactorySpi.x448_type, 0};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f29670 = {KeyFactorySpi.Ed25519_type, 114, 109, 0};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m24879(String str, byte[] bArr, String str2) {
        byte[] bArr2 = C18987.f59862;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C18987.f59864;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return C9045.m23341(C5368.m15339(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24881(ByteArrayOutputStream byteArrayOutputStream, C10583 c10583, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C6349.m17625(byteArrayOutputStream, str.getBytes(charset).length);
        C6349.m17625(byteArrayOutputStream, c10583.f31768);
        C6349.m17626(byteArrayOutputStream, c10583.f31769, 4);
        C6349.m17626(byteArrayOutputStream, c10583.f31772, 4);
        C6349.m17626(byteArrayOutputStream, c10583.f31773, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24882(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C10583[] c10583Arr) throws IOException {
        int length;
        byte[] bArr2 = C18987.f59865;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C18987.f59861;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM24883 = m24883(c10583Arr, bArr3);
                C6349.m17626(byteArrayOutputStream, c10583Arr.length, 1);
                C6349.m17626(byteArrayOutputStream, bArrM24883.length, 4);
                byte[] bArrM17629 = C6349.m17629(bArrM24883);
                C6349.m17626(byteArrayOutputStream, bArrM17629.length, 4);
                byteArrayOutputStream.write(bArrM17629);
                return true;
            }
            byte[] bArr4 = C18987.f59864;
            if (Arrays.equals(bArr, bArr4)) {
                C6349.m17626(byteArrayOutputStream, c10583Arr.length, 1);
                for (C10583 c10583 : c10583Arr) {
                    int size = c10583.f31767.size() * 4;
                    String strM24879 = m24879(c10583.f31766, bArr4, c10583.f31771);
                    Charset charset = StandardCharsets.UTF_8;
                    C6349.m17625(byteArrayOutputStream, strM24879.getBytes(charset).length);
                    C6349.m17625(byteArrayOutputStream, c10583.f31770.length);
                    C6349.m17626(byteArrayOutputStream, size, 4);
                    C6349.m17626(byteArrayOutputStream, c10583.f31772, 4);
                    byteArrayOutputStream.write(strM24879.getBytes(charset));
                    Iterator it = c10583.f31767.keySet().iterator();
                    while (it.hasNext()) {
                        C6349.m17625(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        C6349.m17625(byteArrayOutputStream, 0);
                    }
                    for (int i : c10583.f31770) {
                        C6349.m17625(byteArrayOutputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr5 = C18987.f59863;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM24884 = m24883(c10583Arr, bArr5);
                C6349.m17626(byteArrayOutputStream, c10583Arr.length, 1);
                C6349.m17626(byteArrayOutputStream, bArrM24884.length, 4);
                byte[] bArrM176210 = C6349.m17629(bArrM24884);
                C6349.m17626(byteArrayOutputStream, bArrM176210.length, 4);
                byteArrayOutputStream.write(bArrM176210);
                return true;
            }
            byte[] bArr6 = C18987.f59862;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C6349.m17625(byteArrayOutputStream, c10583Arr.length);
            for (C10583 c10584 : c10583Arr) {
                String str = c10584.f31766;
                TreeMap treeMap = c10584.f31767;
                String strM248710 = m24879(str, bArr6, c10584.f31771);
                Charset charset2 = StandardCharsets.UTF_8;
                C6349.m17625(byteArrayOutputStream, strM248710.getBytes(charset2).length);
                C6349.m17625(byteArrayOutputStream, treeMap.size());
                C6349.m17625(byteArrayOutputStream, c10584.f31770.length);
                C6349.m17626(byteArrayOutputStream, c10584.f31772, 4);
                byteArrayOutputStream.write(strM248710.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C6349.m17625(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i2 : c10584.f31770) {
                    C6349.m17625(byteArrayOutputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C6349.m17625(byteArrayOutputStream2, c10583Arr.length);
            int i3 = 2;
            for (C10583 c10585 : c10583Arr) {
                C6349.m17626(byteArrayOutputStream2, c10585.f31772, 4);
                C6349.m17626(byteArrayOutputStream2, c10585.f31774, 4);
                C6349.m17626(byteArrayOutputStream2, c10585.f31773, 4);
                String strM248711 = m24879(c10585.f31766, bArr2, c10585.f31771);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM248711.getBytes(charset3).length;
                C6349.m17625(byteArrayOutputStream2, length2);
                i3 = i3 + 14 + length2;
                byteArrayOutputStream2.write(strM248711.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i3 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            }
            C19693 c19693 = new C19693(EnumC11994.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c19693);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i4 = 0;
            for (int i5 = 0; i5 < c10583Arr.length; i5++) {
                try {
                    C10583 c10586 = c10583Arr[i5];
                    C6349.m17625(byteArrayOutputStream3, i5);
                    C6349.m17625(byteArrayOutputStream3, c10586.f31768);
                    i4 = i4 + 4 + (c10586.f31768 * 2);
                    int[] iArr = c10586.f31770;
                    int length3 = iArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        int i8 = iArr[i6];
                        C6349.m17625(byteArrayOutputStream3, i8 - i7);
                        i6++;
                        i7 = i8;
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i4 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i4 + ", does not match actual size " + byteArray2.length);
            }
            C19693 c19694 = new C19693(EnumC11994.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c19694);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < c10583Arr.length; i10++) {
                try {
                    C10583 c10587 = c10583Arr[i10];
                    Iterator it3 = c10587.f31767.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m24880(byteArrayOutputStream5, c10587);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m24890(byteArrayOutputStream6, c10587);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            C6349.m17625(byteArrayOutputStream4, i10);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i11 = i9 + 6;
                            C6349.m17626(byteArrayOutputStream4, length4, 4);
                            C6349.m17625(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i9 = i11 + length4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                    }
                    throw th7;
                }
            }
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i9 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray5.length);
            }
            C19693 c19695 = new C19693(EnumC11994.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(c19695);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList.size() * 16));
            C6349.m17626(byteArrayOutputStream, arrayList.size(), 4);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                C19693 c19696 = (C19693) arrayList.get(i12);
                EnumC11994 enumC11994 = c19696.f63624;
                byte[] bArr7 = c19696.f63622;
                C6349.m17626(byteArrayOutputStream, enumC11994.getValue(), 4);
                C6349.m17626(byteArrayOutputStream, size2, 4);
                if (c19696.f63623) {
                    long length5 = bArr7.length;
                    byte[] bArrM176211 = C6349.m17629(bArr7);
                    arrayList2.add(bArrM176211);
                    C6349.m17626(byteArrayOutputStream, bArrM176211.length, 4);
                    C6349.m17626(byteArrayOutputStream, length5, 4);
                    length = bArrM176211.length;
                } else {
                    arrayList2.add(bArr7);
                    C6349.m17626(byteArrayOutputStream, bArr7.length, 4);
                    C6349.m17626(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i13));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
            }
            throw th9;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24883(C10583[] c10583Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C10583 c10583 : c10583Arr) {
            length += ((((c10583.f31773 * 2) + 7) & (-8)) / 8) + (c10583.f31768 * 2) + m24879(c10583.f31766, bArr, c10583.f31771).getBytes(StandardCharsets.UTF_8).length + 16 + c10583.f31769;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C18987.f59863)) {
            for (C10583 c10584 : c10583Arr) {
                m24881(byteArrayOutputStream, c10584, m24879(c10584.f31766, bArr, c10584.f31771));
                m24890(byteArrayOutputStream, c10584);
                int[] iArr = c10584.f31770;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    C6349.m17625(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m24880(byteArrayOutputStream, c10584);
            }
        } else {
            for (C10583 c10585 : c10583Arr) {
                m24881(byteArrayOutputStream, c10585, m24879(c10585.f31766, bArr, c10585.f31771));
            }
            for (C10583 c10586 : c10583Arr) {
                m24890(byteArrayOutputStream, c10586);
                int[] iArr2 = c10586.f31770;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    C6349.m17625(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m24880(byteArrayOutputStream, c10586);
            }
        }
        if (byteArrayOutputStream.size() != length) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m24890(ByteArrayOutputStream byteArrayOutputStream, C10583 c10583) throws IOException {
        int i = 0;
        for (Map.Entry entry : c10583.f31767.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C6349.m17625(byteArrayOutputStream, iIntValue - i);
                C6349.m17625(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24880(ByteArrayOutputStream byteArrayOutputStream, C10583 c10583) throws IOException {
        byte[] bArr = new byte[(((c10583.f31773 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c10583.f31767.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c10583.f31773;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24888(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C18987.f59861)) {
            int iM17630 = (int) C6349.m17630(fileInputStream, 1);
            byte[] bArrM17627 = C6349.m17627(fileInputStream, (int) C6349.m17630(fileInputStream, 4), (int) C6349.m17630(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM17627);
            try {
                C10583[] c10583ArrM24886 = m24886(byteArrayInputStream, str, iM17630);
                byteArrayInputStream.close();
                return c10583ArrM24886;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new IllegalStateException("Unsupported version");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24889(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C10583[] c10583Arr) throws IOException {
        byte[] bArr3 = C18987.f59859;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C18987.f59860)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM17630 = (int) C6349.m17630(fileInputStream, 2);
            byte[] bArrM17627 = C6349.m17627(fileInputStream, (int) C6349.m17630(fileInputStream, 4), (int) C6349.m17630(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM17627);
            try {
                C10583[] c10583ArrM24887 = m24887(byteArrayInputStream, bArr2, iM17630, c10583Arr);
                byteArrayInputStream.close();
                return c10583ArrM24887;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C18987.f59865, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM17631 = (int) C6349.m17630(fileInputStream, 1);
        byte[] bArrM17628 = C6349.m17627(fileInputStream, (int) C6349.m17630(fileInputStream, 4), (int) C6349.m17630(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM17628);
        try {
            C10583[] c10583ArrM24885 = m24885(byteArrayInputStream2, iM17631, c10583Arr);
            byteArrayInputStream2.close();
            return c10583ArrM24885;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24887(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C10583[] c10583Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C10583[0];
        }
        if (i != c10583Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C6349.m17630(byteArrayInputStream, 2);
            String str = new String(C6349.m17628(byteArrayInputStream, (int) C6349.m17630(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM17630 = C6349.m17630(byteArrayInputStream, 4);
            int iM17630 = (int) C6349.m17630(byteArrayInputStream, 2);
            C10583 c10583 = null;
            if (c10583Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c10583Arr.length; i3++) {
                    if (c10583Arr[i3].f31771.equals(strSubstring)) {
                        c10583 = c10583Arr[i3];
                        break;
                    }
                }
            }
            if (c10583 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c10583.f31774 = jM17630;
            int[] iArrM24884 = m24884(byteArrayInputStream, iM17630);
            if (Arrays.equals(bArr, C18987.f59862)) {
                c10583.f31768 = iM17630;
                c10583.f31770 = iArrM24884;
            }
        }
        return c10583Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24885(ByteArrayInputStream byteArrayInputStream, int i, C10583[] c10583Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C10583[0];
        }
        if (i != c10583Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM17630 = (int) C6349.m17630(byteArrayInputStream, 2);
            iArr[i2] = (int) C6349.m17630(byteArrayInputStream, 2);
            strArr[i2] = new String(C6349.m17628(byteArrayInputStream, iM17630), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C10583 c10583 = c10583Arr[i3];
            if (!c10583.f31771.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c10583.f31768 = i4;
            c10583.f31770 = m24884(byteArrayInputStream, i4);
        }
        return c10583Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10583[] m24886(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2;
        if (byteArrayInputStream.available() == 0) {
            return new C10583[0];
        }
        C10583[] c10583Arr = new C10583[i];
        int i3 = 0;
        while (true) {
            i2 = 2;
            if (i3 >= i) {
                break;
            }
            int iM17630 = (int) C6349.m17630(byteArrayInputStream, 2);
            int iM17631 = (int) C6349.m17630(byteArrayInputStream, 2);
            c10583Arr[i3] = new C10583(str, new String(C6349.m17628(byteArrayInputStream, iM17630), StandardCharsets.UTF_8), C6349.m17630(byteArrayInputStream, 4), iM17631, (int) C6349.m17630(byteArrayInputStream, 4), (int) C6349.m17630(byteArrayInputStream, 4), new int[iM17631], new TreeMap());
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C10583 c10583 = c10583Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c10583.f31769;
            int i6 = c10583.f31773;
            TreeMap treeMap = c10583.f31767;
            int i7 = iAvailable - i5;
            int iM17632 = 0;
            while (byteArrayInputStream.available() > i7) {
                iM17632 += (int) C6349.m17630(byteArrayInputStream, i2);
                treeMap.put(Integer.valueOf(iM17632), 1);
                int iM17633 = (int) C6349.m17630(byteArrayInputStream, i2);
                while (iM17633 > 0) {
                    C6349.m17630(byteArrayInputStream, i2);
                    int iM17634 = (int) C6349.m17630(byteArrayInputStream, 1);
                    if (iM17634 != 6 && iM17634 != 7) {
                        while (iM17634 > 0) {
                            C6349.m17630(byteArrayInputStream, 1);
                            C10583 c10584 = c10583;
                            for (int iM17635 = (int) C6349.m17630(byteArrayInputStream, 1); iM17635 > 0; iM17635--) {
                                C6349.m17630(byteArrayInputStream, 2);
                            }
                            i2 = 2;
                            iM17634--;
                            c10583 = c10584;
                        }
                    }
                    iM17633--;
                    c10583 = c10583;
                }
            }
            C10583 c10585 = c10583;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c10585.f31770 = m24884(byteArrayInputStream, c10585.f31768);
            BitSet bitSetValueOf = BitSet.valueOf(C6349.m17628(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = bitSetValueOf.get(i8) ? 2 : 0;
                if (bitSetValueOf.get(i8 + i6)) {
                    i9 |= 4;
                }
                if (i9 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i8));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i8), Integer.valueOf(i9 | num.intValue()));
                }
            }
        }
        return c10583Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m24884(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM17630 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM17630 += (int) C6349.m17630(byteArrayInputStream, 2);
            iArr[i2] = iM17630;
        }
        return iArr;
    }
}
