package p067l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘۗۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31TZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C5857 {

    /* JADX INFO: renamed from: ֫ */
    public final Object f14408;

    /* JADX INFO: renamed from: ۧ */
    public final Object f14409;

    public C5857(int i) {
        switch (i) {
            case 1:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f14409 = byteArrayOutputStream;
                this.f14408 = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.f14409 = new HashMap();
                this.f14408 = new HashMap();
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void m13141(C4516 c4516) {
        C4516 c4517 = (C4516) ((HashMap) this.f14409).put(c4516.m9551(), c4516);
        C4516 c4518 = (C4516) ((HashMap) this.f14408).put(c4516.m9545(), c4516);
        if (c4517 != null) {
            throw new RuntimeException("Old Name conflict: " + c4516.m9551() + ", [" + c4516.m9551() + ", " + c4516.m9545() + "], [" + c4517.m9551() + ", " + c4517.m9545() + "]");
        }
        if (c4518 == null) {
            return;
        }
        throw new RuntimeException("New Name conflict: " + c4516.m9545() + ", [" + c4516.m9551() + ", " + c4516.m9545() + "], [" + c4518.m9551() + ", " + c4518.m9545() + "]");
    }

    /* JADX INFO: renamed from: ۧ */
    public C4516 m13144(String str) {
        if (str.length() == 1) {
            return null;
        }
        return (C4516) ((HashMap) this.f14409).get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public byte[] m13143(C21440 c21440) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.f14408;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f14409;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(c21440.f67639);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(c21440.f67637);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(c21440.f67635);
            dataOutputStream.writeLong(c21440.f67638);
            dataOutputStream.write(c21440.f67640);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public boolean m13142(String str) {
        return ((HashMap) this.f14409).containsKey(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public String m13140(String str, String str2) {
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
        C4516 c4516M13144 = m13144(str);
        if (c4516M13144 != null) {
            if (strSubstring == null) {
                return c4516M13144.m9545();
            }
            StringBuilder sbM17248 = C7470.m17248(strSubstring);
            sbM17248.append(c4516M13144.m9545());
            return sbM17248.toString();
        }
        return str2;
    }
}
