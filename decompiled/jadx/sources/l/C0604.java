package l;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6RX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0604 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle f2347 = new Bundle();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashSet f2346 = new HashSet();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2481(Bundle bundle, String... strArr) {
        Bundle bundle2 = new Bundle(bundle);
        HashSet hashSet = new HashSet(Arrays.asList(strArr));
        for (String str : new HashSet(bundle2.keySet())) {
            if (!hashSet.contains(str)) {
                bundle2.remove(str);
            }
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            Bundle bundle3 = this.f2347;
            if (i >= length) {
                bundle3.putAll(bundle2);
                return;
            }
            String str2 = strArr[i];
            bundle3.remove(str2);
            this.f2346.add(str2);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2480(Bundle bundle) {
        Iterator it = this.f2346.iterator();
        while (it.hasNext()) {
            bundle.remove((String) it.next());
        }
        bundle.putAll(this.f2347);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m2482(C0604 c0604) {
        Iterator it = c0604.f2346.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Bundle bundle = this.f2347;
            if (!zHasNext) {
                bundle.putAll(c0604.f2347);
                return;
            } else {
                String str = (String) it.next();
                this.f2346.add(str);
                bundle.remove(str);
            }
        }
    }
}
