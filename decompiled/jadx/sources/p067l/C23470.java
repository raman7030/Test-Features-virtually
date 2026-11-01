package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: EB82 */
/* JADX INFO: loaded from: classes.dex */
public final class C23470 {

    /* JADX INFO: renamed from: ֫ */
    public final Map f74761;

    /* JADX INFO: renamed from: ۧ */
    public static C23470 m52208(String str) throws IOException {
        if (str == null || str.isEmpty()) {
            return new C23470();
        }
        InputStream inputStreamMo29987 = C18524.m42109(str, new String[0]).mo29987();
        try {
            C23470 c23470 = new C23470(inputStreamMo29987);
            if (inputStreamMo29987 != null) {
                inputStreamMo29987.close();
            }
            return c23470;
        } catch (Throwable th) {
            if (inputStreamMo29987 != null) {
                try {
                    inputStreamMo29987.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public C23470(InputStream inputStream) {
        this.f74761 = C12329.m28403(inputStream).m28404();
    }

    public C23470() {
        this.f74761 = Collections.EMPTY_MAP;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52209(String str) {
        return (String) C15525.getOrDefault(this.f74761, str, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C7480.stream(this.f74761.entrySet()).sorted(new C16763()).forEach(new C22800(0, sb));
        return sb.toString();
    }
}
