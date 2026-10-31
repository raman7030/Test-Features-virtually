package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ܶ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: W8NJ */
/* JADX INFO: loaded from: classes.dex */
public final class C23770 extends C17420 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Uri f76939;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f76940;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f76941;

    public C23770(int i, C22154 c22154, Map map, byte[] bArr, Uri uri) throws CloneNotSupportedException {
        super(2004, c22154, C19370.m44628(i, "Response code: "));
        this.f76941 = i;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            List list = (List) entry.getValue();
            map2.put((String) entry.getKey(), list == null ? Collections.EMPTY_LIST : C20195.unmodifiableList(new ArrayList(list)));
        }
        this.f76940 = C20195.unmodifiableMap(map2);
        bArr.clone();
        this.f76939 = uri;
    }
}
