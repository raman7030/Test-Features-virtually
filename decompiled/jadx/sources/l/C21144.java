package l;

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
public final class C21144 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f68178;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f68179 = new ArrayList();

    static {
        m48096("png", "89 50 4E 47");
        m48096("jpg", "FF D8 FF");
        m48096("gif", "47 49 46 38");
        m48096("webp", "52 49 46 46 ?? ?? ?? ?? 57 45 42 50 56 50 38");
        m48096("bmp", "42 4D");
        m48096("bmp", "42 41");
        m48096("bmp", "43 49");
        m48096("bmp", "43 50");
        m48096("bmp", "49 43");
        m48096("bmp", "50 54");
        m48096("mp4", "00 00 00 ?? 66 74 79 70 69 73 6F 36");
        m48096("mp4", "00 00 00 ?? 66 74 79 70 6D 70 34 32");
        m48096("m4a", "00 00 00 ?? 66 74 79 70 4D 34 41 20");
        m48096("mp3", "49 44 33");
        m48096("ogg", "4F 67 67 53");
        m48096("wav", "52 49 46 46 ?? ?? ?? ?? 57 41 56 45");
        m48096("ttf", "00 01 00 00");
        m48096("ttc", "74 74 63 66");
        m48096("otf", "4F 54 54 4F");
        f68178 = Pattern.compile("\\s*<!doctype *(\\w+)[ >]", 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m48094(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48095(byte[] bArr) {
        String lowerCase = "plist";
        Iterator it = f68179.iterator();
        while (true) {
            if (it.hasNext()) {
                C23965 c23965 = (C23965) it.next();
                if (C23965.m52793(c23965, bArr)) {
                    lowerCase = c23965.f77723;
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
                if (C9679.m24619("<html>", str)) {
                    lowerCase = "html";
                    break;
                }
                Matcher matcher = f68178.matcher(str);
                if (matcher.lookingAt()) {
                    lowerCase = matcher.group(1).toLowerCase();
                    break;
                }
                try {
                    XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                    xmlPullParserNewPullParser.setInput(new StringReader(str));
                    Stack stack = new Stack();
                    C7032 c7032 = null;
                    while (true) {
                        int next = xmlPullParserNewPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next == 2) {
                            C7032 c7033 = new C7032(xmlPullParserNewPullParser.getName());
                            if (c7032 == null) {
                                c7032 = c7033;
                            } else {
                                ((C7032) stack.peek()).f21677.add(c7033);
                            }
                            stack.push(c7033);
                        } else if (next == 3) {
                            stack.pop();
                        }
                    }
                    if (c7032 != null) {
                        String str2 = c7032.f21678;
                        if (!str2.equals("svg")) {
                            if (!str2.equals("plist")) {
                                if (!str2.equals("kml") && ((!str2.equals("Placemark") || !c7032.m19002()) && (!str2.equals("Folder") || !c7032.m19000()))) {
                                    if (str2.equals("Document") && c7032.m19001("name")) {
                                        Iterator it2 = c7032.f21677.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                C7032 c7034 = (C7032) it2.next();
                                                if (!c7034.f21678.equals("Placemark") || !c7034.m19002()) {
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
                int iM48094 = m48094(i, bArr);
                int iM48095 = m48094(i + 4, bArr);
                int i2 = i + 8;
                if (iM48095 == 1852855395) {
                    return ".9.png";
                }
                i = i2 + iM48094 + 4;
            }
        }
        if (lowerCase != null) {
            return ".".concat(lowerCase);
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48096(String str, String str2) {
        f68179.add(new C23965(str, str2));
    }
}
