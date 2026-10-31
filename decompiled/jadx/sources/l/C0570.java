package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.֡ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D97E */
/* JADX INFO: loaded from: classes2.dex */
public final class C0570 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m2338() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }
}
