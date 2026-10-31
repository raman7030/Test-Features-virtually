package l;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: l.ۚۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5155 implements AutoCloseable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final AbstractC13921 f16102;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f16103;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean f16105;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final String f16106;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final String f16108;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16109;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile String f16110;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f16111;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f16114;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f16115;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 f16116;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public List f16112 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f16107 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16104 = "preview-" + UUID.randomUUID() + ".appassets.androidplatform.net";

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final String f16113 = UUID.randomUUID().toString();

    public C5155(AbstractC13921 abstractC13921, String str, String str2, String str3, String str4, boolean z, boolean z2, AbstractC15440 abstractC15440, boolean z3) {
        this.f16102 = abstractC13921;
        this.f16109 = str;
        this.f16103 = str2;
        this.f16108 = str3;
        this.f16106 = str4;
        this.f16111 = z;
        this.f16105 = z2;
        this.f16116 = abstractC15440;
        this.f16115 = z3;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C19267 c19267 = ActivityC0921.f3517;
        Object obj = this.f16102;
        if (obj instanceof AutoCloseable) {
            try {
                C5368.m15342((AutoCloseable) obj);
            } catch (Exception unused) {
            }
        }
        Iterator it = this.f16112.iterator();
        while (it.hasNext()) {
            AbstractC16891.m39726(((Long) it.next()).longValue());
        }
        AbstractC15440 abstractC15440 = this.f16116;
        if (abstractC15440 != null) {
            abstractC15440.mo23552();
        }
    }
}
