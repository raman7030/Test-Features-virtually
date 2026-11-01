package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* JADX INFO: renamed from: l.᩶ܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C650 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21625 {

    /* JADX INFO: renamed from: ֫ */
    public static final Properties f68174;

    /* JADX WARN: Code duplicated, block: B:19:0x002a A[Catch: IOException -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #4 {IOException -> 0x002d, blocks: (B:3:0x0005, B:19:0x002a), top: B:30:0x0005 }] */
    static {
        Properties properties;
        Throwable th;
        int i = C6872.f17857;
        Properties properties2 = null;
        try {
            InputStream resourceAsStream = C6872.class.getResourceAsStream("/systemType.properties");
            if (resourceAsStream != null) {
                try {
                    properties = new Properties();
                    try {
                        properties.load(resourceAsStream);
                        properties2 = properties;
                        if (resourceAsStream != null) {
                            resourceAsStream.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        } catch (IOException unused) {
                            properties2 = properties;
                        }
                    }
                } catch (Throwable th4) {
                    properties = null;
                    th = th4;
                }
            } else if (resourceAsStream != null) {
                resourceAsStream.close();
            }
        } catch (IOException unused2) {
        }
        f68174 = properties2;
    }
}
