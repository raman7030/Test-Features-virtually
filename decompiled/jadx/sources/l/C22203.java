package l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes.dex */
public final class C22203 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map f72040;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C22203 m49881(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return new C22203();
        }
        InputStream inputStreamMo27926 = C16999.m39866(str, new String[0]).mo27926();
        try {
            C22203 c22203 = new C22203(inputStreamMo27926);
            if (inputStreamMo27926 != null) {
                inputStreamMo27926.close();
            }
            return c22203;
        } catch (Throwable th) {
            if (inputStreamMo27926 != null) {
                try {
                    inputStreamMo27926.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C22203(InputStream inputStream) {
        this.f72040 = C10480.m26371(inputStream).m26372();
    }

    public C22203() {
        this.f72040 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m49882(String str) {
        return (String) C13843.getOrDefault(this.f72040, str, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C5378.stream(this.f72040.entrySet()).sorted(new C15146()).forEach(new C21498(0, sb));
        return sb.toString();
    }
}
