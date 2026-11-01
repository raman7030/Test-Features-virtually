package p067l;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13167 {

    /* JADX INFO: renamed from: ܽ */
    public static final Map f36999 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ֫ */
    public final StringBuilder f37000;

    /* JADX INFO: renamed from: ۧ */
    public char f37001 = 0;

    public C13167(StringBuilder sb) {
        this.f37000 = sb;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m30164(String str) {
        m30162(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m30166(String str) {
        m30162(C13817.m31480(str));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m30165(String str) {
        m30163(str, f36999, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30163(String str, Map map, boolean z) {
        m30162("<");
        m30162(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                m30162(" ");
                m30162(C13817.m31480((String) entry.getKey()));
                if (entry.getValue() != null) {
                    m30162("=\"");
                    m30162(C13817.m31480((String) entry.getValue()));
                    m30162("\"");
                }
            }
        }
        if (z) {
            m30162(" /");
        }
        m30162(">");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30161() {
        char c = this.f37001;
        if (c == 0 || c == '\n') {
            return;
        }
        m30162("\n");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30162(String str) {
        try {
            this.f37000.append((CharSequence) str);
            int length = str.length();
            if (length != 0) {
                this.f37001 = str.charAt(length - 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
