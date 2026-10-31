package l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ᩴۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 55PX */
/* JADX INFO: loaded from: classes5.dex */
public class C18460 extends AbstractC16342 {
    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        String strNextToken;
        String strNextToken2 = null;
        if (!m38493(str)) {
            return null;
        }
        C10384 c10384 = new C10384();
        c10384.m26198(str);
        String strM38492 = m38492(1);
        String strM38493 = m38492(2);
        String str2 = m38492(3) + " " + m38492(4);
        String strM38494 = m38492(5);
        String[] strArr = {m38492(9), m38492(10), m38492(11)};
        try {
            c10384.m26185(m38494(str2));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strM38494, ",");
        int iCountTokens = stringTokenizer.countTokens();
        if (iCountTokens == 1) {
            strNextToken = stringTokenizer.nextToken();
        } else if (iCountTokens != 2) {
            strNextToken = null;
        } else {
            strNextToken2 = stringTokenizer.nextToken();
            strNextToken = stringTokenizer.nextToken();
        }
        if (strM38492.lastIndexOf(".DIR") != -1) {
            c10384.m26181(1);
        } else {
            c10384.m26181(0);
        }
        c10384.m26194(strM38492);
        c10384.m26183(Long.parseLong(strM38493) * 512);
        c10384.m26184(strNextToken2);
        c10384.m26196(strNextToken);
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            c10384.m26182(i, 0, str3.indexOf(82) >= 0);
            c10384.m26182(i, 1, str3.indexOf(87) >= 0);
            c10384.m26182(i, 2, str3.indexOf(69) >= 0);
        }
        return c10384;
    }

    @Override // l.AbstractC11795, l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final String mo17064(BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        StringBuilder sb = new StringBuilder();
        while (line != null) {
            if (line.startsWith("Directory") || line.startsWith("Total")) {
                line = bufferedReader.readLine();
            } else {
                sb.append(line);
                if (line.trim().endsWith(MotionUtils.EASING_TYPE_FORMAT_END)) {
                    break;
                }
                line = bufferedReader.readLine();
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
