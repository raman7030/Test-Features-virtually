package p067l;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۚۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C7268 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫ */
    public final AbstractC15599 f18941;

    /* JADX INFO: renamed from: ۗ */
    public final String f18942;

    /* JADX INFO: renamed from: ۛ */
    public final boolean f18944;

    /* JADX INFO: renamed from: ۟ */
    public final String f18945;

    /* JADX INFO: renamed from: ۧ֫ */
    public final String f18947;

    /* JADX INFO: renamed from: ۨ */
    public final String f18948;

    /* JADX INFO: renamed from: ۫ */
    public volatile String f18949;

    /* JADX INFO: renamed from: ۬ */
    public final boolean f18950;

    /* JADX INFO: renamed from: ᩸ */
    public volatile boolean f18953;

    /* JADX INFO: renamed from: ᩹ */
    public final boolean f18954;

    /* JADX INFO: renamed from: ᩺ */
    public final AbstractC17043 f18955;

    /* JADX INFO: renamed from: ܰ */
    public List f18951 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۤ */
    public int f18946 = -1;

    /* JADX INFO: renamed from: ۙ */
    public final String f18943 = "preview-" + UUID.randomUUID() + ".appassets.androidplatform.net";

    /* JADX INFO: renamed from: ᩶ */
    public final String f18952 = UUID.randomUUID().toString();

    public C7268(AbstractC15599 abstractC15599, String str, String str2, String str3, String str4, boolean z, boolean z2, AbstractC17043 abstractC17043, boolean z3) {
        this.f18941 = abstractC15599;
        this.f18948 = str;
        this.f18942 = str2;
        this.f18947 = str3;
        this.f18945 = str4;
        this.f18950 = z;
        this.f18944 = z2;
        this.f18955 = abstractC17043;
        this.f18954 = z3;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C20680 c20680 = ActivityC3244.f6292;
        Object obj = this.f18941;
        if (obj instanceof AutoCloseable) {
            try {
                C7470.m17251((AutoCloseable) obj);
            } catch (Exception unused) {
            }
        }
        Iterator it = this.f18951.iterator();
        while (it.hasNext()) {
            AbstractC18422.m41967(((Long) it.next()).longValue());
        }
        AbstractC17043 abstractC17043 = this.f18955;
        if (abstractC17043 != null) {
            abstractC17043.mo25503();
        }
    }
}
