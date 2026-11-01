package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.ۘܳۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: YBJ2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6170 {

    /* JADX INFO: renamed from: ֫ */
    public final C11535 f15492;

    public C6170(C11535 c11535) {
        this.f15492 = c11535;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m13975(C4829 c4829, String str) {
        StringBuilder sb = new StringBuilder(1024);
        sb.append('<');
        sb.append(c4829.m10244());
        String str2 = str + this.f15492.m26593();
        boolean z = true;
        if (c4829.m10239() == 1) {
            C10864 c10864M10240 = c4829.m10240(0);
            String str3 = c10864M10240.m25028() + "=" + c10864M10240.m25029() + c10864M10240.m25030() + c10864M10240.m25029();
            if (str3.length() > 80) {
                sb.append("\n");
                sb.append(str2);
            } else {
                sb.append(" ");
            }
            sb.append(str3);
        } else {
            for (int i = 0; i < c4829.m10239(); i++) {
                C10864 c10864M10241 = c4829.m10240(i);
                String strM25028 = c10864M10241.m25028();
                if (strM25028.startsWith("xmlns:") || strM25028.equals("xmlns")) {
                    if (z) {
                        sb.append(" ");
                        z = false;
                    } else {
                        sb.append("\n");
                        sb.append(str2);
                    }
                    sb.append(c10864M10241.m25028());
                    sb.append(C0184a.f880h);
                    sb.append(c10864M10241.m25029());
                    sb.append(c10864M10241.m25030());
                    sb.append(c10864M10241.m25029());
                }
            }
            for (int i2 = 0; i2 < c4829.m10239(); i2++) {
                C10864 c10864M10242 = c4829.m10240(i2);
                String strM25029 = c10864M10242.m25028();
                if (!strM25029.startsWith("xmlns:") && !strM25029.equals("xmlns")) {
                    sb.append("\n");
                    sb.append(str2);
                    sb.append(c10864M10242.m25028());
                    sb.append(C0184a.f880h);
                    sb.append(c10864M10242.m25029());
                    sb.append(c10864M10242.m25030());
                    sb.append(c10864M10242.m25029());
                }
            }
        }
        if (c4829.m10245()) {
            sb.append(" /");
        }
        sb.append('>');
        return sb.toString();
    }
}
