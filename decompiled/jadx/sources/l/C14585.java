package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C14585 implements Iterable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final HashMap f44660 = new HashMap();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ArrayList f44661 = new ArrayList();

    public C14585(HashMap map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(l.b)) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    this.f44660.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f44660.keySet().iterator();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34835(C8236 c8236) {
        Iterator it = this.f44661.iterator();
        while (it.hasNext()) {
            ((C17408) it.next()).getClass();
            c8236.m21805("Set-Cookie", "null=null; expires=null");
        }
    }
}
