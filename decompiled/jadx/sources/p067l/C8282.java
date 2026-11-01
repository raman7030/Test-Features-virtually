package p067l;

import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۛᩳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8G3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8282 {

    /* JADX INFO: renamed from: ֫ */
    public final int f21929;

    /* JADX INFO: renamed from: ۧ */
    public final String f21930;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f21931;

    /* JADX INFO: renamed from: ᩳ */
    public final String f21932;

    public C8282(String str) {
        String strM31027;
        this.f21932 = str;
        boolean z = false;
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        this.f21929 = i;
        String strSubstring = str.substring(i);
        strSubstring.getClass();
        switch (strSubstring) {
            case "B":
                strM31027 = ClassTransform.BYTE;
                z = true;
                break;
            case "C":
                strM31027 = ClassTransform.CHARACTER;
                z = true;
                break;
            case "D":
                strM31027 = ClassTransform.DOUBLE;
                z = true;
                break;
            case "F":
                strM31027 = ClassTransform.FLOAT;
                z = true;
                break;
            case "I":
                strM31027 = ClassTransform.INTEGER;
                z = true;
                break;
            case "J":
                strM31027 = ClassTransform.LONG;
                z = true;
                break;
            case "S":
                strM31027 = ClassTransform.SHORT;
                z = true;
                break;
            case "V":
                strM31027 = ClassTransform.VOID;
                z = true;
                break;
            case "Z":
                strM31027 = ClassTransform.BOOLEAN;
                z = true;
                break;
            default:
                strM31027 = C13647.m31027(strSubstring);
                try {
                    ClassLoader.getSystemClassLoader().loadClass(strM31027);
                    z = true;
                    break;
                } catch (Exception unused) {
                    break;
                }
                break;
        }
        this.f21930 = strM31027;
        this.f21931 = z;
    }
}
