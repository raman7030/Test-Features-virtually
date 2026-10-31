package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۘܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4000 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9645 f12676;

    public C4000(C9645 c9645) {
        this.f12676 = c9645;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m12055(C2589 c2589, String str) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append('<');
        sb.append(c2589.m8205());
        String str2 = str + this.f12676.m24579();
        boolean z = true;
        if (c2589.m8200() == 1) {
            C8939 c8939M8201 = c2589.m8201(0);
            String str3 = c8939M8201.m23054() + "=" + c8939M8201.m23055() + c8939M8201.m23056() + c8939M8201.m23055();
            if (str3.length() > 80) {
                sb.append("\n");
                sb.append(str2);
            } else {
                sb.append(" ");
            }
            sb.append(str3);
        } else {
            for (int i = 0; i < c2589.m8200(); i++) {
                C8939 c8939M8202 = c2589.m8201(i);
                String strM23054 = c8939M8202.m23054();
                if (strM23054.startsWith("xmlns:") || strM23054.equals("xmlns")) {
                    if (z) {
                        sb.append(" ");
                        z = false;
                    } else {
                        sb.append("\n");
                        sb.append(str2);
                    }
                    sb.append(c8939M8202.m23054());
                    sb.append(a.h);
                    sb.append(c8939M8202.m23055());
                    sb.append(c8939M8202.m23056());
                    sb.append(c8939M8202.m23055());
                }
            }
            for (int i2 = 0; i2 < c2589.m8200(); i2++) {
                C8939 c8939M8203 = c2589.m8201(i2);
                String strM23055 = c8939M8203.m23054();
                if (!strM23055.startsWith("xmlns:") && !strM23055.equals("xmlns")) {
                    sb.append("\n");
                    sb.append(str2);
                    sb.append(c8939M8203.m23054());
                    sb.append(a.h);
                    sb.append(c8939M8203.m23055());
                    sb.append(c8939M8203.m23056());
                    sb.append(c8939M8203.m23055());
                }
            }
        }
        if (c2589.m8206()) {
            sb.append(" /");
        }
        sb.append('>');
        return sb.toString();
    }
}
