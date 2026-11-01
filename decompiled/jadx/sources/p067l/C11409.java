package p067l;

import com.umeng.commonsdk.statistics.C0795b;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ۢۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: QA30 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11409 extends AbstractMap implements Cloneable {

    /* JADX INFO: renamed from: ᩸ */
    public final HashSet f31829 = new HashSet();

    /* JADX INFO: renamed from: ᩹ */
    public final String f31830;

    public C11409(String str) {
        this.f31830 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m26382() {
        return this.f31830;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.f31829;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26383(String str) {
        if (str == null || containsKey(str.toLowerCase())) {
            return;
        }
        this.f31829.add(new C22138(str));
    }

    @Override // java.util.AbstractMap
    public final Object clone() {
        C11409 c11409 = new C11409(this.f31830);
        Iterator it = this.f31829.iterator();
        while (it.hasNext()) {
            c11409.m26383((String) ((Map.Entry) it.next()).getValue());
        }
        return c11409;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder(200);
        if (isEmpty()) {
            sb.append(C0795b.f3347f);
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
