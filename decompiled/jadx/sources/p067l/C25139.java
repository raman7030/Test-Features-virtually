package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X72G */
/* JADX INFO: loaded from: classes.dex */
public final class C25139 {

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f80470 = new HashMap();

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f80471 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public static void m55192(C25139 c25139, Uri uri) {
        if (uri == null) {
            c25139.m55195("exo_redir");
        } else {
            c25139.m55190((Object) uri.toString(), "exo_redir");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55196(String str, String str2) {
        m55190((Object) str2, str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m55191(C25139 c25139, long j) {
        c25139.m55190(Long.valueOf(j), "exo_len");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55194(long j, String str) {
        m55190(Long.valueOf(j), str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m55195(String str) {
        this.f80471.add(str);
        this.f80470.remove(str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m55197() {
        return C21562.unmodifiableList(new ArrayList(this.f80471));
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m55193() {
        HashMap map = new HashMap(this.f80470);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr, bArr.length));
            }
        }
        return C21562.unmodifiableMap(map);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m55190(Object obj, String str) {
        obj.getClass();
        this.f80470.put(str, obj);
        this.f80471.remove(str);
    }
}
