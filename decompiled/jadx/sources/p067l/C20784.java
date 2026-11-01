package p067l;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Vector;

/* JADX INFO: renamed from: l.᩵ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7YQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20784 implements InterfaceC20428 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC3348 f65330;

    /* JADX INFO: renamed from: ۧ */
    public C21769 f65331;

    /* JADX INFO: renamed from: ܽ */
    public Vector f65332;

    public C20784(C21769 c21769) {
        this.f65332 = null;
        this.f65331 = c21769;
        if (this.f65330 == null) {
            String strM49091 = C21769.m49091("hmac-sha1");
            try {
                this.f65330 = (InterfaceC3348) Class.forName(strM49091).asSubclass(InterfaceC3348.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                this.f65331.m49100().getClass();
                throw new IllegalArgumentException(C6988.m16053("instantiation of ", strM49091, " lead to an error"), e);
            }
        }
        this.f65332 = new Vector();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m46933(String str, byte[] bArr) {
        if (str == null) {
            return 1;
        }
        try {
            C6346 c6346 = new C6346(str, 0, bArr);
            synchronized (this.f65332) {
                int i = 1;
                for (int i2 = 0; i2 < this.f65332.size(); i2++) {
                    C6346 c6347 = (C6346) this.f65332.elementAt(i2);
                    if (c6347.mo14506(str) && c6347.f16449 == c6346.f16449) {
                        if (C20764.m46885(c6347.f16447, bArr)) {
                            return 0;
                        }
                        i = 2;
                    }
                }
                return (i == 1 && str.startsWith("[") && str.indexOf("]:") > 1) ? m46933(str.substring(1, str.indexOf("]:")), bArr) : i;
            }
        } catch (Exception unused) {
            this.f65331.m49100().getClass();
            return 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46934(C6346 c6346, InterfaceC20093 interfaceC20093) {
        int i = c6346.f16449;
        String str = c6346.f16446;
        synchronized (this.f65332) {
            for (int i2 = 0; i2 < this.f65332.size(); i2++) {
                ((C6346) this.f65332.elementAt(i2)).mo14506(str);
            }
        }
        this.f65332.addElement(c6346);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6346[] m46935(String str, String str2) {
        C6346[] c6346Arr;
        synchronized (this.f65332) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f65332.size(); i++) {
                C6346 c6346 = (C6346) this.f65332.elementAt(i);
                if (c6346.f16449 != -1 && (str == null || (c6346.mo14506(str) && (str2 == null || c6346.m14505().equals(str2))))) {
                    arrayList.add(c6346);
                }
            }
            int size = arrayList.size();
            c6346Arr = new C6346[size];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                c6346Arr[i2] = (C6346) arrayList.get(i2);
            }
            if (str != null && str.startsWith("[") && str.indexOf("]:") > 1) {
                C6346[] c6346ArrM46935 = m46935(str.substring(1, str.indexOf("]:")), str2);
                if (c6346ArrM46935.length > 0) {
                    C6346[] c6346Arr2 = new C6346[c6346ArrM46935.length + size];
                    System.arraycopy(c6346Arr, 0, c6346Arr2, 0, size);
                    System.arraycopy(c6346ArrM46935, 0, c6346Arr2, size, c6346ArrM46935.length);
                    c6346Arr = c6346Arr2;
                }
            }
        }
        return c6346Arr;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46936(String str, String str2) {
        synchronized (this.f65332) {
            int i = 0;
            while (i < this.f65332.size()) {
                C6346 c6346 = (C6346) this.f65332.elementAt(i);
                if (str == null || (c6346.mo14506(str) && (str2 == null || c6346.m14505().equals(str2)))) {
                    String strSubstring = c6346.f16446;
                    if (str == null || strSubstring.equals(str) || ((c6346 instanceof C20113) && ((C20113) c6346).m45555())) {
                        this.f65332.removeElement(c6346);
                        i--;
                    } else {
                        int length = str.length();
                        int length2 = strSubstring.length();
                        int i2 = 0;
                        while (true) {
                            if (i2 < length2) {
                                int iIndexOf = strSubstring.indexOf(44, i2);
                                if (iIndexOf != -1) {
                                    if (str.equals(strSubstring.substring(i2, iIndexOf))) {
                                        strSubstring = strSubstring.substring(0, i2) + strSubstring.substring(iIndexOf + 1);
                                    } else {
                                        i2 = iIndexOf + 1;
                                    }
                                }
                                c6346.f16446 = strSubstring;
                            }
                            if (strSubstring.endsWith(str) && length2 - i2 == length) {
                                strSubstring = strSubstring.substring(0, length == length2 ? 0 : (length2 - length) - 1);
                            }
                            c6346.f16446 = strSubstring;
                        }
                    }
                }
                i++;
            }
        }
    }

    static {
        byte[] bArr = C20764.f65273;
        C20764.m46886("\n", StandardCharsets.UTF_8);
    }
}
