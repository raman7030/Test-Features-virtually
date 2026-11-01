package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: l.ᩴۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 55PX */
/* JADX INFO: loaded from: classes5.dex */
public class C19912 extends AbstractC17899 {
    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("VMS", "d-MMM-yyyy HH:mm:ss", null);
    }

    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        String strNextToken;
        String strNextToken2 = null;
        if (!m40709(str)) {
            return null;
        }
        C12237 c12237 = new C12237();
        c12237.m28227(str);
        String strM40708 = m40708(1);
        String strM40709 = m40708(2);
        String str2 = m40708(3) + " " + m40708(4);
        String strM407010 = m40708(5);
        String[] strArr = {m40708(9), m40708(10), m40708(11)};
        try {
            c12237.m28214(m40710(str2));
        } catch (ParseException unused) {
        }
        StringTokenizer stringTokenizer = new StringTokenizer(strM407010, ",");
        int iCountTokens = stringTokenizer.countTokens();
        if (iCountTokens == 1) {
            strNextToken = stringTokenizer.nextToken();
        } else if (iCountTokens != 2) {
            strNextToken = null;
        } else {
            strNextToken2 = stringTokenizer.nextToken();
            strNextToken = stringTokenizer.nextToken();
        }
        if (strM40708.lastIndexOf(".DIR") != -1) {
            c12237.m28210(1);
        } else {
            c12237.m28210(0);
        }
        c12237.m28223(strM40708);
        c12237.m28212(Long.parseLong(strM40709) * 512);
        c12237.m28213(strNextToken2);
        c12237.m28225(strNextToken);
        for (int i = 0; i < 3; i++) {
            String str3 = strArr[i];
            c12237.m28211(i, 0, str3.indexOf(82) >= 0);
            c12237.m28211(i, 1, str3.indexOf(87) >= 0);
            c12237.m28211(i, 2, str3.indexOf(69) >= 0);
        }
        return c12237;
    }

    @Override // p067l.AbstractC13578, p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final String mo18996(BufferedReader bufferedReader) throws IOException {
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
