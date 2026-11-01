package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes.dex */
public final class C24959 extends C18924 {

    /* JADX INFO: renamed from: ۗ */
    public final Uri f79692;

    /* JADX INFO: renamed from: ۙ */
    public final Map f79693;

    /* JADX INFO: renamed from: ۬ */
    public final int f79694;

    public C24959(int i, C23423 c23423, Map map, byte[] bArr, Uri uri) throws CloneNotSupportedException {
        super(2004, c23423, C20778.m46922(i, "Response code: "));
        this.f79694 = i;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            map2.put((String) entry.getKey(), list == null ? Collections.EMPTY_LIST : C21562.unmodifiableList(new ArrayList(list)));
        }
        this.f79693 = C21562.unmodifiableMap(map2);
        bArr.clone();
        this.f79692 = uri;
    }
}
