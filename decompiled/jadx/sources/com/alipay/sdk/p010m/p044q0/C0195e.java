package com.alipay.sdk.p010m.p044q0;

/* JADX INFO: renamed from: com.alipay.sdk.m.q0.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0195e {

    /* JADX INFO: renamed from: com.alipay.sdk.m.q0.e$b */
    /* JADX INFO: compiled from: N673 */
    public class b {

        /* JADX INFO: renamed from: a */
        public int[] f914a;

        /* JADX INFO: renamed from: b */
        public int f915b;

        /* JADX INFO: renamed from: c */
        public int f916c;

        public b() {
            this.f914a = new int[256];
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m945a(byte[] bArr) {
        b bVarM944a;
        if (bArr == null || (bVarM944a = m944a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return m946a(bArr, bVarM944a);
    }

    /* JADX INFO: renamed from: a */
    public static b m944a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int i = 0; i < 256; i++) {
            bVar.f914a[i] = i;
        }
        bVar.f915b = 0;
        bVar.f916c = 0;
        int length = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            try {
                char cCharAt = str.charAt(length);
                int[] iArr = bVar.f914a;
                int i4 = iArr[i3];
                i2 = ((cCharAt + i4) + i2) % 256;
                iArr[i3] = iArr[i2];
                iArr[i2] = i4;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m946a(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int i = bVar.f915b;
        int i2 = bVar.f916c;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            i = (i + 1) % 256;
            int[] iArr = bVar.f914a;
            int i4 = iArr[i];
            i2 = (i2 + i4) % 256;
            iArr[i] = iArr[i2];
            iArr[i2] = i4;
            int i5 = (iArr[i] + i4) % 256;
            bArr[i3] = (byte) (iArr[i5] ^ bArr[i3]);
        }
        bVar.f915b = i;
        bVar.f916c = i2;
        return bArr;
    }
}
