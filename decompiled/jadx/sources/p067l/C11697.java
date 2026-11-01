package p067l;

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
public final class C11697 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f32620 = {KeyFactorySpi.Ed25519_type, 114, KeyFactorySpi.x448_type, 0};

    /* JADX INFO: renamed from: ۧ */
    public static final byte[] f32621 = {KeyFactorySpi.Ed25519_type, 114, 109, 0};

    /* JADX INFO: renamed from: ֫ */
    public static String m26894(String str, byte[] bArr, String str2) {
        byte[] bArr2 = C20414.f63090;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C20414.f63092;
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
                return C10965.m25286(C7470.m17248(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26896(ByteArrayOutputStream byteArrayOutputStream, C12427 c12427, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C8403.m19565(byteArrayOutputStream, str.getBytes(charset).length);
        C8403.m19565(byteArrayOutputStream, c12427.f34738);
        C8403.m19566(byteArrayOutputStream, c12427.f34739, 4);
        C8403.m19566(byteArrayOutputStream, c12427.f34742, 4);
        C8403.m19566(byteArrayOutputStream, c12427.f34743, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26897(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C12427[] c12427Arr) throws IOException {
        int length;
        byte[] bArr2 = C20414.f63093;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C20414.f63089;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrM26898 = m26898(c12427Arr, bArr3);
                C8403.m19566(byteArrayOutputStream, c12427Arr.length, 1);
                C8403.m19566(byteArrayOutputStream, bArrM26898.length, 4);
                byte[] bArrM19569 = C8403.m19569(bArrM26898);
                C8403.m19566(byteArrayOutputStream, bArrM19569.length, 4);
                byteArrayOutputStream.write(bArrM19569);
                return true;
            }
            byte[] bArr4 = C20414.f63092;
            if (Arrays.equals(bArr, bArr4)) {
                C8403.m19566(byteArrayOutputStream, c12427Arr.length, 1);
                for (C12427 c12427 : c12427Arr) {
                    int size = c12427.f34737.size() * 4;
                    String strM26894 = m26894(c12427.f34736, bArr4, c12427.f34741);
                    Charset charset = StandardCharsets.UTF_8;
                    C8403.m19565(byteArrayOutputStream, strM26894.getBytes(charset).length);
                    C8403.m19565(byteArrayOutputStream, c12427.f34740.length);
                    C8403.m19566(byteArrayOutputStream, size, 4);
                    C8403.m19566(byteArrayOutputStream, c12427.f34742, 4);
                    byteArrayOutputStream.write(strM26894.getBytes(charset));
                    Iterator it = c12427.f34737.keySet().iterator();
                    while (it.hasNext()) {
                        C8403.m19565(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        C8403.m19565(byteArrayOutputStream, 0);
                    }
                    for (int i : c12427.f34740) {
                        C8403.m19565(byteArrayOutputStream, i);
                    }
                }
                return true;
            }
            byte[] bArr5 = C20414.f63091;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrM26899 = m26898(c12427Arr, bArr5);
                C8403.m19566(byteArrayOutputStream, c12427Arr.length, 1);
                C8403.m19566(byteArrayOutputStream, bArrM26899.length, 4);
                byte[] bArrM195610 = C8403.m19569(bArrM26899);
                C8403.m19566(byteArrayOutputStream, bArrM195610.length, 4);
                byteArrayOutputStream.write(bArrM195610);
                return true;
            }
            byte[] bArr6 = C20414.f63090;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C8403.m19565(byteArrayOutputStream, c12427Arr.length);
            for (C12427 c12428 : c12427Arr) {
                String str = c12428.f34736;
                TreeMap treeMap = c12428.f34737;
                String strM26895 = m26894(str, bArr6, c12428.f34741);
                Charset charset2 = StandardCharsets.UTF_8;
                C8403.m19565(byteArrayOutputStream, strM26895.getBytes(charset2).length);
                C8403.m19565(byteArrayOutputStream, treeMap.size());
                C8403.m19565(byteArrayOutputStream, c12428.f34740.length);
                C8403.m19566(byteArrayOutputStream, c12428.f34742, 4);
                byteArrayOutputStream.write(strM26895.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C8403.m19565(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i2 : c12428.f34740) {
                    C8403.m19565(byteArrayOutputStream, i2);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C8403.m19565(byteArrayOutputStream2, c12427Arr.length);
            int i3 = 2;
            for (C12427 c12429 : c12427Arr) {
                C8403.m19566(byteArrayOutputStream2, c12429.f34742, 4);
                C8403.m19566(byteArrayOutputStream2, c12429.f34744, 4);
                C8403.m19566(byteArrayOutputStream2, c12429.f34743, 4);
                String strM26896 = m26894(c12429.f34736, bArr2, c12429.f34741);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strM26896.getBytes(charset3).length;
                C8403.m19565(byteArrayOutputStream2, length2);
                i3 = i3 + 14 + length2;
                byteArrayOutputStream2.write(strM26896.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i3 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
            }
            C21085 c21085 = new C21085(EnumC13768.DEX_FILES, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(c21085);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i4 = 0;
            for (int i5 = 0; i5 < c12427Arr.length; i5++) {
                try {
                    C12427 c124210 = c12427Arr[i5];
                    C8403.m19565(byteArrayOutputStream3, i5);
                    C8403.m19565(byteArrayOutputStream3, c124210.f34738);
                    i4 = i4 + 4 + (c124210.f34738 * 2);
                    int[] iArr = c124210.f34740;
                    int length3 = iArr.length;
                    int i6 = 0;
                    int i7 = 0;
                    while (i6 < length3) {
                        int i8 = iArr[i6];
                        C8403.m19565(byteArrayOutputStream3, i8 - i7);
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
            C21085 c21086 = new C21085(EnumC13768.CLASSES, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(c21086);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i9 = 0;
            for (int i10 = 0; i10 < c12427Arr.length; i10++) {
                try {
                    C12427 c124211 = c12427Arr[i10];
                    Iterator it3 = c124211.f34737.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        m26895(byteArrayOutputStream5, c124211);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            m26905(byteArrayOutputStream6, c124211);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            C8403.m19565(byteArrayOutputStream4, i10);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i11 = i9 + 6;
                            C8403.m19566(byteArrayOutputStream4, length4, 4);
                            C8403.m19565(byteArrayOutputStream4, iIntValue);
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
            C21085 c21087 = new C21085(EnumC13768.METHODS, byteArray5, true);
            byteArrayOutputStream4.close();
            arrayList.add(c21087);
            long j = 4;
            long size2 = j + j + 4 + ((long) (arrayList.size() * 16));
            C8403.m19566(byteArrayOutputStream, arrayList.size(), 4);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                C21085 c21088 = (C21085) arrayList.get(i12);
                EnumC13768 enumC13768 = c21088.f66245;
                byte[] bArr7 = c21088.f66243;
                C8403.m19566(byteArrayOutputStream, enumC13768.getValue(), 4);
                C8403.m19566(byteArrayOutputStream, size2, 4);
                if (c21088.f66244) {
                    long length5 = bArr7.length;
                    byte[] bArrM195611 = C8403.m19569(bArr7);
                    arrayList2.add(bArrM195611);
                    C8403.m19566(byteArrayOutputStream, bArrM195611.length, 4);
                    C8403.m19566(byteArrayOutputStream, length5, 4);
                    length = bArrM195611.length;
                } else {
                    arrayList2.add(bArr7);
                    C8403.m19566(byteArrayOutputStream, bArr7.length, 4);
                    C8403.m19566(byteArrayOutputStream, 0L, 4);
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26898(C12427[] c12427Arr, byte[] bArr) throws IOException {
        int length = 0;
        for (C12427 c12427 : c12427Arr) {
            length += ((((c12427.f34743 * 2) + 7) & (-8)) / 8) + (c12427.f34738 * 2) + m26894(c12427.f34736, bArr, c12427.f34741).getBytes(StandardCharsets.UTF_8).length + 16 + c12427.f34739;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C20414.f63091)) {
            for (C12427 c12428 : c12427Arr) {
                m26896(byteArrayOutputStream, c12428, m26894(c12428.f34736, bArr, c12428.f34741));
                m26905(byteArrayOutputStream, c12428);
                int[] iArr = c12428.f34740;
                int length2 = iArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length2) {
                    int i3 = iArr[i];
                    C8403.m19565(byteArrayOutputStream, i3 - i2);
                    i++;
                    i2 = i3;
                }
                m26895(byteArrayOutputStream, c12428);
            }
        } else {
            for (C12427 c12429 : c12427Arr) {
                m26896(byteArrayOutputStream, c12429, m26894(c12429.f34736, bArr, c12429.f34741));
            }
            for (C12427 c124210 : c12427Arr) {
                m26905(byteArrayOutputStream, c124210);
                int[] iArr2 = c124210.f34740;
                int length3 = iArr2.length;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length3) {
                    int i6 = iArr2[i4];
                    C8403.m19565(byteArrayOutputStream, i6 - i5);
                    i4++;
                    i5 = i6;
                }
                m26895(byteArrayOutputStream, c124210);
            }
        }
        if (byteArrayOutputStream.size() != length) {
            throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m26905(ByteArrayOutputStream byteArrayOutputStream, C12427 c12427) throws IOException {
        int i = 0;
        for (Map.Entry entry : c12427.f34737.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                C8403.m19565(byteArrayOutputStream, iIntValue - i);
                C8403.m19565(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m26895(ByteArrayOutputStream byteArrayOutputStream, C12427 c12427) throws IOException {
        byte[] bArr = new byte[(((c12427.f34743 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c12427.f34737.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i = iIntValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i2 = iIntValue + c12427.f34743;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12427[] m26903(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (Arrays.equals(bArr, C20414.f63089)) {
            int iM19570 = (int) C8403.m19570(fileInputStream, 1);
            byte[] bArrM19567 = C8403.m19567(fileInputStream, (int) C8403.m19570(fileInputStream, 4), (int) C8403.m19570(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM19567);
            try {
                C12427[] c12427ArrM26901 = m26901(byteArrayInputStream, str, iM19570);
                byteArrayInputStream.close();
                return c12427ArrM26901;
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

    /* JADX INFO: renamed from: ֫ */
    public static C12427[] m26904(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C12427[] c12427Arr) throws IOException {
        byte[] bArr3 = C20414.f63087;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C20414.f63088)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iM19570 = (int) C8403.m19570(fileInputStream, 2);
            byte[] bArrM19567 = C8403.m19567(fileInputStream, (int) C8403.m19570(fileInputStream, 4), (int) C8403.m19570(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM19567);
            try {
                C12427[] c12427ArrM26902 = m26902(byteArrayInputStream, bArr2, iM19570, c12427Arr);
                byteArrayInputStream.close();
                return c12427ArrM26902;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C20414.f63093, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iM19571 = (int) C8403.m19570(fileInputStream, 1);
        byte[] bArrM19568 = C8403.m19567(fileInputStream, (int) C8403.m19570(fileInputStream, 4), (int) C8403.m19570(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrM19568);
        try {
            C12427[] c12427ArrM26900 = m26900(byteArrayInputStream2, iM19571, c12427Arr);
            byteArrayInputStream2.close();
            return c12427ArrM26900;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12427[] m26902(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C12427[] c12427Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C12427[0];
        }
        if (i != c12427Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C8403.m19570(byteArrayInputStream, 2);
            String str = new String(C8403.m19568(byteArrayInputStream, (int) C8403.m19570(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jM19570 = C8403.m19570(byteArrayInputStream, 4);
            int iM19570 = (int) C8403.m19570(byteArrayInputStream, 2);
            C12427 c12427 = null;
            if (c12427Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                for (int i3 = 0; i3 < c12427Arr.length; i3++) {
                    if (c12427Arr[i3].f34741.equals(strSubstring)) {
                        c12427 = c12427Arr[i3];
                        break;
                    }
                }
            }
            if (c12427 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c12427.f34744 = jM19570;
            int[] iArrM26899 = m26899(byteArrayInputStream, iM19570);
            if (Arrays.equals(bArr, C20414.f63090)) {
                c12427.f34738 = iM19570;
                c12427.f34740 = iArrM26899;
            }
        }
        return c12427Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12427[] m26900(ByteArrayInputStream byteArrayInputStream, int i, C12427[] c12427Arr) {
        if (byteArrayInputStream.available() == 0) {
            return new C12427[0];
        }
        if (i != c12427Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iM19570 = (int) C8403.m19570(byteArrayInputStream, 2);
            iArr[i2] = (int) C8403.m19570(byteArrayInputStream, 2);
            strArr[i2] = new String(C8403.m19568(byteArrayInputStream, iM19570), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C12427 c12427 = c12427Arr[i3];
            if (!c12427.f34741.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c12427.f34738 = i4;
            c12427.f34740 = m26899(byteArrayInputStream, i4);
        }
        return c12427Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12427[] m26901(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2;
        if (byteArrayInputStream.available() == 0) {
            return new C12427[0];
        }
        C12427[] c12427Arr = new C12427[i];
        int i3 = 0;
        while (true) {
            i2 = 2;
            if (i3 >= i) {
                break;
            }
            int iM19570 = (int) C8403.m19570(byteArrayInputStream, 2);
            int iM19571 = (int) C8403.m19570(byteArrayInputStream, 2);
            c12427Arr[i3] = new C12427(str, new String(C8403.m19568(byteArrayInputStream, iM19570), StandardCharsets.UTF_8), C8403.m19570(byteArrayInputStream, 4), iM19571, (int) C8403.m19570(byteArrayInputStream, 4), (int) C8403.m19570(byteArrayInputStream, 4), new int[iM19571], new TreeMap());
            i3++;
        }
        for (int i4 = 0; i4 < i; i4++) {
            C12427 c12427 = c12427Arr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = c12427.f34739;
            int i6 = c12427.f34743;
            TreeMap treeMap = c12427.f34737;
            int i7 = iAvailable - i5;
            int iM19572 = 0;
            while (byteArrayInputStream.available() > i7) {
                iM19572 += (int) C8403.m19570(byteArrayInputStream, i2);
                treeMap.put(Integer.valueOf(iM19572), 1);
                int iM19573 = (int) C8403.m19570(byteArrayInputStream, i2);
                while (iM19573 > 0) {
                    C8403.m19570(byteArrayInputStream, i2);
                    int iM19574 = (int) C8403.m19570(byteArrayInputStream, 1);
                    if (iM19574 != 6 && iM19574 != 7) {
                        while (iM19574 > 0) {
                            C8403.m19570(byteArrayInputStream, 1);
                            C12427 c12428 = c12427;
                            for (int iM19575 = (int) C8403.m19570(byteArrayInputStream, 1); iM19575 > 0; iM19575--) {
                                C8403.m19570(byteArrayInputStream, 2);
                            }
                            i2 = 2;
                            iM19574--;
                            c12427 = c12428;
                        }
                    }
                    iM19573--;
                    c12427 = c12427;
                }
            }
            C12427 c12429 = c12427;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c12429.f34740 = m26899(byteArrayInputStream, c12429.f34738);
            BitSet bitSetValueOf = BitSet.valueOf(C8403.m19568(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
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
        return c12427Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m26899(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iM19570 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iM19570 += (int) C8403.m19570(byteArrayInputStream, 2);
            iArr[i2] = iM19570;
        }
        return iArr;
    }
}
