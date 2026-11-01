package p067l;

import android.content.res.Resources;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: l.᩻ۨۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8ZS */
/* JADX INFO: loaded from: classes.dex */
public final class C24865 {

    /* JADX INFO: renamed from: ֫ */
    public C7431 f79430;

    /* JADX INFO: renamed from: ۧ */
    public ExecutorService f79431;

    /* JADX INFO: renamed from: ܽ */
    public boolean f79432;

    /* JADX INFO: renamed from: ܿ */
    public final HashMap f79433 = new HashMap(3);

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f79434 = new HashMap(3);

    public C24865() {
        m54621(C9442.m21951());
        m54621(new C19146());
        C16463 c16463M37391 = C16463.m37391();
        if (this.f79432) {
            throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
        }
        c16463M37391.getClass();
        Iterator it = Collections.singleton("image/svg+xml").iterator();
        while (it.hasNext()) {
            this.f79434.put((String) it.next(), c16463M37391);
        }
        if (AbstractC19817.m45062()) {
            C18475 c18475M42018 = C18475.m42018();
            if (this.f79432) {
                throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
            }
            c18475M42018.getClass();
            Iterator it2 = Collections.singleton("image/gif").iterator();
            while (it2.hasNext()) {
                this.f79434.put((String) it2.next(), c18475M42018);
            }
        }
        this.f79430 = new C7431(Resources.getSystem());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54621(AbstractC14136 abstractC14136) {
        if (!this.f79432) {
            Iterator it = abstractC14136.mo21952().iterator();
            while (it.hasNext()) {
                this.f79433.put((String) it.next(), abstractC14136);
            }
            return;
        }
        throw new IllegalStateException("ImagesPlugin has already been configured and cannot be modified any further");
    }
}
