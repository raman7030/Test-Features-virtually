package l;

import android.content.Context;
import android.util.Xml;
import com.alipay.sdk.m.w.a;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: l.ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C9N6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15509 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object f47403 = new Object();

    /* JADX WARN: Code duplicated, block: B:45:0x004d A[EXC_TOP_SPLITTER, PHI: r1
      0x004d: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:26:0x004b, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36578(Context context) {
        String attributeValue;
        synchronized (f47403) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                        xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, a.D);
                        int depth = xmlPullParserNewPullParser.getDepth();
                        while (true) {
                            int next = xmlPullParserNewPullParser.next();
                            if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                    attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException | XmlPullParserException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    } catch (Throwable th) {
                        if (fileInputStreamOpenFileInput != null) {
                            try {
                                fileInputStreamOpenFileInput.close();
                            } catch (IOException unused3) {
                            }
                        }
                        throw th;
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m36579(Context context, String str) {
        synchronized (f47403) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument(a.D, Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused) {
                        }
                    }
                } catch (Exception unused2) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                } catch (Throwable th) {
                    if (fileOutputStreamOpenFileOutput != null) {
                        try {
                            fileOutputStreamOpenFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }
}
