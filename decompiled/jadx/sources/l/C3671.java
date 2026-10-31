package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3671 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object f11604;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object f11605;

    public C3671(int i) {
        switch (i) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f11605 = byteArrayOutputStream;
                this.f11604 = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.f11605 = new HashMap();
                this.f11604 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m11181(C2260 c2260) {
        C2260 c2261 = (C2260) ((HashMap) this.f11605).put(c2260.m7469(), c2260);
        C2260 c2262 = (C2260) ((HashMap) this.f11604).put(c2260.m7463(), c2260);
        if (c2261 != null) {
            throw new RuntimeException("Old Name conflict: " + c2260.m7469() + ", [" + c2260.m7469() + ", " + c2260.m7463() + "], [" + c2261.m7469() + ", " + c2261.m7463() + "]");
        }
        if (c2262 == null) {
            return;
        }
        throw new RuntimeException("New Name conflict: " + c2260.m7463() + ", [" + c2260.m7469() + ", " + c2260.m7463() + "], [" + c2262.m7469() + ", " + c2262.m7463() + "]");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C2260 m11184(String str) {
        if (str.length() == 1) {
            return null;
        }
        return (C2260) ((HashMap) this.f11605).get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] m11183(C20067 c20067) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f11604;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f11605;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(c20067.f64998);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(c20067.f64996);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c20067.f64994);
            dataOutputStream.writeLong(c20067.f64997);
            dataOutputStream.write(c20067.f64999);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m11182(String str) {
        return ((HashMap) this.f11605).containsKey(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m11180(String str, String str2) {
        String strSubstring;
        if (str.charAt(0) == '[') {
            int iIndexOf = str.indexOf(76);
            if (iIndexOf != -1) {
                strSubstring = str.substring(0, iIndexOf);
                str = str.substring(iIndexOf);
            }
            return str2;
        }
        strSubstring = null;
        C2260 c2260M11184 = m11184(str);
        if (c2260M11184 != null) {
            if (strSubstring == null) {
                return c2260M11184.m7463();
            }
            StringBuilder sbM15339 = C5368.m15339(strSubstring);
            sbM15339.append(c2260M11184.m7463());
            return sbM15339.toString();
        }
        return str2;
    }
}
