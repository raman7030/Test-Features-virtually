package p067l;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܰܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC15584 {

    /* JADX INFO: renamed from: a */
    public static final C18546 f44520a;

    static {
        EnumC14719 enumC14719 = EnumC14719.OWNER_READ;
        EnumC14719 enumC147110 = EnumC14719.OWNER_WRITE;
        HashSet hashSet = new HashSet(EnumSet.of(enumC14719, enumC147110));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((EnumC14719) it.next()).getClass();
        }
        f44520a = new C18546(4, hashSet);
        HashSet hashSet2 = new HashSet(EnumSet.of(enumC14719, enumC147110, EnumC14719.OWNER_EXECUTE));
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            ((EnumC14719) it2.next()).getClass();
        }
        new C18546(4, hashSet2);
    }
}
