package l;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨ֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R6M7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11363 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map f34002 = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final StringBuilder f34003;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public char f34004 = 0;

    public C11363(StringBuilder sb) {
        this.f34003 = sb;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m28120(String str) {
        m28118(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m28122(String str) {
        m28118(C12047.m29418(str));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m28121(String str) {
        m28119(str, f34002, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28119(String str, Map map, boolean z) {
        m28118("<");
        m28118(str);
        if (map != null && !map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                m28118(" ");
                m28118(C12047.m29418((String) entry.getKey()));
                if (entry.getValue() != null) {
                    m28118("=\"");
                    m28118(C12047.m29418((String) entry.getValue()));
                    m28118("\"");
                }
            }
        }
        if (z) {
            m28118(" /");
        }
        m28118(">");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28117() {
        char c = this.f34004;
        if (c == 0 || c == '\n') {
            return;
        }
        m28118("\n");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m28118(String str) {
        try {
            this.f34003.append((CharSequence) str);
            int length = str.length();
            if (length != 0) {
                this.f34004 = str.charAt(length - 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
