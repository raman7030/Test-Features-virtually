package p067l;

import android.util.Xml;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.simpleframework.xml.stream.DocumentReader;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: l.᩷᩸ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C22464 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f70860;

    /* JADX INFO: renamed from: ۧ */
    public static final ArrayList f70861 = new ArrayList();

    static {
        m50426("png", "89 50 4E 47");
        m50426("jpg", "FF D8 FF");
        m50426("gif", "47 49 46 38");
        m50426("webp", "52 49 46 46 ?? ?? ?? ?? 57 45 42 50 56 50 38");
        m50426("bmp", "42 4D");
        m50426("bmp", "42 41");
        m50426("bmp", "43 49");
        m50426("bmp", "43 50");
        m50426("bmp", "49 43");
        m50426("bmp", "50 54");
        m50426("mp4", "00 00 00 ?? 66 74 79 70 69 73 6F 36");
        m50426("mp4", "00 00 00 ?? 66 74 79 70 6D 70 34 32");
        m50426("m4a", "00 00 00 ?? 66 74 79 70 4D 34 41 20");
        m50426("mp3", "49 44 33");
        m50426("ogg", "4F 67 67 53");
        m50426("wav", "52 49 46 46 ?? ?? ?? ?? 57 41 56 45");
        m50426("ttf", "00 01 00 00");
        m50426("ttc", "74 74 63 66");
        m50426("otf", "4F 54 54 4F");
        f70860 = Pattern.compile("\\s*<!doctype *(\\w+)[ >]", 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m50424(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50425(byte[] bArr) {
        String lowerCase = "plist";
        Iterator it = f70861.iterator();
        while (true) {
            if (it.hasNext()) {
                C25145 c25145 = (C25145) it.next();
                if (C25145.m55199(c25145, bArr)) {
                    lowerCase = c25145.f80475;
                    break;
                }
            } else {
                String str = new String(bArr, StandardCharsets.UTF_8);
                if (str.startsWith("-----BEGIN CERTIFICATE-----")) {
                    lowerCase = "cer";
                    break;
                }
                if (str.startsWith("-----BEGIN PRIVATE KEY-----")) {
                    lowerCase = "key";
                    break;
                }
                if (C11567.m26633("<html>", str)) {
                    lowerCase = "html";
                    break;
                }
                Matcher matcher = f70860.matcher(str);
                if (matcher.lookingAt()) {
                    lowerCase = matcher.group(1).toLowerCase();
                    break;
                }
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    Stack stack = new Stack();
                    C9052 c9052 = null;
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2) {
                            C9052 c9053 = new C9052(xmlPullParserNewPullParser.getName());
                            if (c9052 == null) {
                                c9052 = c9053;
                            } else {
                                ((C9052) stack.peek()).f24558.add(c9053);
                            }
                            stack.push(c9053);
                        } else if (next == 3) {
                            stack.pop();
                        }
                    }
                    if (c9052 != null) {
                        String str2 = c9052.f24559;
                        if (!str2.equals("svg")) {
                            if (!str2.equals("plist")) {
                                if (!str2.equals("kml") && ((!str2.equals("Placemark") || !c9052.m20959()) && (!str2.equals("Folder") || !c9052.m20957()))) {
                                    if (str2.equals("Document") && c9052.m20958("name")) {
                                        Iterator it2 = c9052.f24558.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                C9052 c9054 = (C9052) it2.next();
                                                if (!c9054.f24559.equals("Placemark") || !c9054.m20959()) {
                                                }
                                            }
                                        }
                                    }
                                    lowerCase = DocumentReader.RESERVED;
                                    break;
                                }
                                lowerCase = "kml";
                                break;
                            }
                            break;
                        }
                        lowerCase = "svg";
                        break;
                    }
                    try {
                        Object objNextValue = new JSONTokener(str).nextValue();
                        if (!(objNextValue instanceof JSONObject) && !(objNextValue instanceof JSONArray)) {
                            lowerCase = null;
                            break;
                        }
                        lowerCase = "json";
                        break;
                    } catch (Throwable unused) {
                    }
                } catch (Exception unused2) {
                }
            }
        }
        if (lowerCase != null && lowerCase.equals("png")) {
            int i = 8;
            while (bArr.length - i >= 8) {
                int iM50424 = m50424(i, bArr);
                int iM50425 = m50424(i + 4, bArr);
                int i2 = i + 8;
                if (iM50425 == 1852855395) {
                    return ".9.png";
                }
                i = i2 + iM50424 + 4;
            }
        }
        if (lowerCase != null) {
            return ".".concat(lowerCase);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50426(String str, String str2) {
        f70861.add(new C25145(str, str2));
    }
}
