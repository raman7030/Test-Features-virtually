package l;

import com.umeng.commonsdk.statistics.b;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9512 extends AbstractMap implements Cloneable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashSet f28882 = new HashSet();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f28883;

    public C9512(String str) {
        this.f28883 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m24372() {
        return this.f28883;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f28882;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24373(String str) {
        if (str == null || containsKey(str.toLowerCase())) {
            return;
        }
        this.f28882.add(new C20801(str));
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C9512 c9512 = new C9512(this.f28883);
        Iterator it = this.f28882.iterator();
        while (it.hasNext()) {
            c9512.m24373((String) ((Map.Entry) it.next()).getValue());
        }
        return c9512;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        if (isEmpty()) {
            sb.append(b.f);
        } else {
            Iterator it = values().iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append(", ");
            }
            sb.setLength(sb.length() - 2);
        }
        return sb.toString();
    }
}
