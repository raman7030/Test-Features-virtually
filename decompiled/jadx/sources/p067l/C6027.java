package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۘۢ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 87IM */
/* JADX INFO: loaded from: classes2.dex */
public final class C6027 extends IOException implements Iterable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f15090 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final List f15091;

    /* JADX WARN: Illegal instructions before constructor call */
    public C6027(String str, List list) {
        if (str == null) {
            str = String.format("%,d exception(s): %s", Integer.valueOf(list != null ? list.size() : 0), list);
        }
        super(str, (list != null ? list.size() : 0) == 0 ? null : (Throwable) list.get(0));
        this.f15091 = list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ArrayList(this.f15091).iterator();
    }
}
