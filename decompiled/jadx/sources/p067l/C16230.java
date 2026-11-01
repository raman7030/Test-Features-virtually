package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27BS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16230 implements Iterable {

    /* JADX INFO: renamed from: ᩸ */
    public final HashMap f47768 = new HashMap();

    /* JADX INFO: renamed from: ᩹ */
    public final ArrayList f47769 = new ArrayList();

    public C16230(HashMap map) {
        String str = (String) map.get("cookie");
        if (str != null) {
            for (String str2 : str.split(C0249l.f1196b)) {
                String[] strArrSplit = str2.trim().split("=");
                if (strArrSplit.length == 2) {
                    this.f47768.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f47768.keySet().iterator();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36986(C10196 c10196) {
        Iterator it = this.f47769.iterator();
        while (it.hasNext()) {
            ((C18913) it.next()).getClass();
            c10196.m23774("Set-Cookie", "null=null; expires=null");
        }
    }
}
