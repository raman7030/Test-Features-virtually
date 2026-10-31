package l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6222 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f19066;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f19067;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f19068;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f19069;

    public C6222(String str) {
        String strM28976;
        this.f19069 = str;
        boolean z = false;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        this.f19066 = i;
        String strSubstring = str.substring(i);
        strSubstring.getClass();
        switch (strSubstring) {
            case "B":
                strM28976 = ClassTransform.BYTE;
                z = true;
                break;
            case "C":
                strM28976 = ClassTransform.CHARACTER;
                z = true;
                break;
            case "D":
                strM28976 = ClassTransform.DOUBLE;
                z = true;
                break;
            case "F":
                strM28976 = ClassTransform.FLOAT;
                z = true;
                break;
            case "I":
                strM28976 = ClassTransform.INTEGER;
                z = true;
                break;
            case "J":
                strM28976 = ClassTransform.LONG;
                z = true;
                break;
            case "S":
                strM28976 = ClassTransform.SHORT;
                z = true;
                break;
            case "V":
                strM28976 = ClassTransform.VOID;
                z = true;
                break;
            case "Z":
                strM28976 = ClassTransform.BOOLEAN;
                z = true;
                break;
            default:
                strM28976 = C11867.m28976(strSubstring);
                try {
                    ClassLoader.getSystemClassLoader().loadClass(strM28976);
                    z = true;
                    break;
                } catch (Exception unused) {
                    break;
                }
                break;
        }
        this.f19067 = strM28976;
        this.f19068 = z;
    }
}
