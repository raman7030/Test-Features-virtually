package l;

import java.io.InputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ۫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: J1K5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11005 implements Serializable, Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11005 f33102;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f33103;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f33104;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f33105;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f33103.compareTo(((C11005) obj).f33103);
    }

    public C11005(AbstractC15440 abstractC15440) {
        this.f33102 = null;
        this.f33103 = abstractC15440.mo23554();
        this.f33104 = abstractC15440;
    }

    public C11005(C11005 c11005, String str) {
        C11003.requireNonNull(c11005);
        this.f33102 = c11005;
        this.f33103 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27331(AbstractC15440 abstractC15440) {
        C12171.m29644(this.f33102);
        this.f33103 = abstractC15440.mo23554();
        this.f33104 = abstractC15440;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m27340() {
        AbstractC15440 abstractC15440 = this.f33104;
        C11005 c11005 = this.f33102;
        if (c11005 == null) {
            return abstractC15440;
        }
        if (abstractC15440 != null && c11005.m27340().equals(this.f33105)) {
            return abstractC15440;
        }
        AbstractC15440 abstractC15440M27340 = c11005.m27340();
        this.f33105 = abstractC15440M27340;
        AbstractC15440 abstractC15440M36526 = abstractC15440M27340.m36526(this.f33103);
        this.f33104 = abstractC15440M36526;
        return abstractC15440M36526;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC15440 m27330(String str) {
        return m27340().m36526(str);
    }

    public final String getName() {
        return m27340().getName();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m27339() {
        return m27340().mo23554();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m27336() {
        return m27340().mo23120();
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C11005[] m27335() {
        List listMo27931 = m27340().mo27931();
        if (listMo27931.isEmpty()) {
            return null;
        }
        int size = listMo27931.size();
        C11005[] c11005Arr = new C11005[size];
        for (int i = 0; i < size; i++) {
            c11005Arr[i] = new C11005(this, (String) listMo27931.get(i));
        }
        return c11005Arr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11005 m27329(C11005 c11005, AbstractC15440 abstractC15440) {
        String strM27339 = c11005.m27339();
        String strMo23554 = abstractC15440.mo23554();
        if (strM27339.equals(strMo23554)) {
            return c11005;
        }
        if (strMo23554.startsWith(strM27339.concat("/"))) {
            return new C11005(c11005, strMo23554.substring(strM27339.length() + 1));
        }
        throw new RuntimeException(C22870.m50967(strM27339, " > ", strMo23554));
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InputStream m27334() {
        return m27340().mo27926();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m27333() {
        return m27340().mo23552();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m27338() {
        m27340().mo35195();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27332(byte[] bArr) {
        m27340().m36502(bArr);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final byte[] m27337() {
        return m27340().m36506();
    }
}
