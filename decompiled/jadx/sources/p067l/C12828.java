package p067l;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1K5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12828 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ۙ */
    public final C12828 f36096;

    /* JADX INFO: renamed from: ᩶ */
    public String f36097;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractC17043 f36098;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC17043 f36099;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f36097.compareTo(((C12828) obj).f36097);
    }

    public C12828(AbstractC17043 abstractC17043) {
        this.f36096 = null;
        this.f36097 = abstractC17043.mo25505();
        this.f36098 = abstractC17043;
    }

    public C12828(C12828 c12828, String str) {
        C12826.requireNonNull(c12828);
        this.f36096 = c12828;
        this.f36097 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29393(AbstractC17043 abstractC17043) {
        C1446.m31706(this.f36096);
        this.f36097 = abstractC17043.mo25505();
        this.f36098 = abstractC17043;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC17043 m29402() {
        AbstractC17043 abstractC17043 = this.f36098;
        C12828 c12828 = this.f36096;
        if (c12828 == null) {
            return abstractC17043;
        }
        if (abstractC17043 != null && c12828.m29402().equals(this.f36099)) {
            return abstractC17043;
        }
        AbstractC17043 abstractC17043M29402 = c12828.m29402();
        this.f36099 = abstractC17043M29402;
        AbstractC17043 abstractC17043M38684 = abstractC17043M29402.m38684(this.f36097);
        this.f36098 = abstractC17043M38684;
        return abstractC17043M38684;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC17043 m29392(String str) {
        return m29402().m38684(str);
    }

    public final String getName() {
        return m29402().getName();
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m29401() {
        return m29402().mo25505();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m29398() {
        return m29402().mo25094();
    }

    /* JADX INFO: renamed from: ۢ */
    public final C12828[] m29397() {
        List listMo29992 = m29402().mo29992();
        if (listMo29992.isEmpty()) {
            return null;
        }
        int size = listMo29992.size();
        C12828[] c12828Arr = new C12828[size];
        for (int i = 0; i < size; i++) {
            c12828Arr[i] = new C12828(this, (String) listMo29992.get(i));
        }
        return c12828Arr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12828 m29391(C12828 c12828, AbstractC17043 abstractC17043) {
        String strM29401 = c12828.m29401();
        String strMo25505 = abstractC17043.mo25505();
        if (strM29401.equals(strMo25505)) {
            return c12828;
        }
        if (strMo25505.startsWith(strM29401.concat("/"))) {
            return new C12828(c12828, strMo25505.substring(strM29401.length() + 1));
        }
        throw new RuntimeException(C24104.m53357(strM29401, " > ", strMo25505));
    }

    /* JADX INFO: renamed from: ۡ */
    public final InputStream m29396() {
        return m29402().mo29987();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m29395() {
        return m29402().mo25503();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m29400() {
        m29402().mo37342();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29394(byte[] bArr) {
        m29402().m38660(bArr);
    }

    /* JADX INFO: renamed from: ܺ */
    public final byte[] m29399() {
        return m29402().m38664();
    }
}
