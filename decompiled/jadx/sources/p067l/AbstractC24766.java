package p067l;

import android.database.DataSetObserver;

/* JADX INFO: renamed from: l.᩻۠ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KV */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24766 {
    /* JADX INFO: renamed from: ֫ */
    public static void m54438(AbstractC6465 abstractC6465, C2798 c2798) {
        C13045.m29867(abstractC6465, "baseDotsIndicator");
        C13045.m29867(c2798, "attachable");
        AbstractC13787 abstractC13787M4409 = c2798.m4409();
        if (abstractC13787M4409 == null) {
            throw new IllegalStateException("Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator");
        }
        abstractC13787M4409.m31439((DataSetObserver) new C11356(new C18731(abstractC6465)));
        abstractC6465.m14822(new C22085(c2798));
        abstractC6465.m14832();
    }
}
