package l;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩴۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P43R */
/* JADX INFO: loaded from: classes4.dex */
public final class C18653 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m43256(C2609 c2609) throws C3836, IOException {
        ArrayList<String> arrayList = new ArrayList();
        String str = System.getenv("JDK_JAVAC_OPTIONS");
        if (str != null && !str.trim().isEmpty()) {
            int length = str.length();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            char c = 0;
            loop0: while (i < length) {
                char cCharAt = str.charAt(i);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    if (cCharAt == '\"' || cCharAt == '\'') {
                        if (c == 0) {
                            c = cCharAt;
                        } else if (c == cCharAt) {
                            c = 0;
                        } else {
                            sb.append(cCharAt);
                        }
                    }
                    i++;
                } else if (c == 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                    while (true) {
                        if (cCharAt != '\f' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != ' ') {
                            break;
                        }
                        i++;
                        if (i >= length) {
                            break loop0;
                        }
                        cCharAt = str.charAt(i);
                    }
                }
                sb.append(cCharAt);
                i++;
            }
            if (sb.length() != 0) {
                arrayList.add(sb.toString());
            }
            if (c != 0) {
                throw new C3836();
            }
        }
        arrayList.addAll(c2609);
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : arrayList) {
            if (str2.length() > 1 && str2.charAt(0) == '@') {
                String strSubstring = str2.substring(1);
                if (strSubstring.charAt(0) == '@') {
                    arrayList2.add(strSubstring);
                } else {
                    BufferedReader bufferedReaderNewBufferedReader = C17229.newBufferedReader(C8763.get(strSubstring, new String[0]), Charset.defaultCharset());
                    try {
                        C2425 c2425 = new C2425(bufferedReaderNewBufferedReader);
                        while (true) {
                            String strM7856 = c2425.m7856();
                            if (strM7856 == null) {
                                break;
                            }
                            arrayList2.add(strM7856);
                        }
                        bufferedReaderNewBufferedReader.close();
                    } catch (Throwable th) {
                        if (bufferedReaderNewBufferedReader != null) {
                            try {
                                bufferedReaderNewBufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                }
            } else {
                arrayList2.add(str2);
            }
        }
        return arrayList2;
    }
}
