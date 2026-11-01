package p067l;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6RX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2943 {

    /* JADX INFO: renamed from: ۧ */
    public final Bundle f5121 = new Bundle();

    /* JADX INFO: renamed from: ֫ */
    public final HashSet f5120 = new HashSet();

    /* JADX INFO: renamed from: ֫ */
    public final void m4837(Bundle bundle, String... strArr) {
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
            Bundle bundle3 = this.f5121;
            if (i >= length) {
                bundle3.putAll(bundle2);
                return;
            }
            String str2 = strArr[i];
            bundle3.remove(str2);
            this.f5120.add(str2);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4836(Bundle bundle) {
        Iterator it = this.f5120.iterator();
        while (it.hasNext()) {
            bundle.remove((String) it.next());
        }
        bundle.putAll(this.f5121);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4838(C2943 c2943) {
        Iterator it = c2943.f5120.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Bundle bundle = this.f5121;
            if (!zHasNext) {
                bundle.putAll(c2943.f5121);
                return;
            } else {
                String str = (String) it.next();
                this.f5120.add(str);
                bundle.remove(str);
            }
        }
    }
}
