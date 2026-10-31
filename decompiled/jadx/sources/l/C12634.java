package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۫᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12634 extends AbstractC0890 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final char[] f38057;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final HashMap f38058;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C12634 f38059;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f38060;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f38061;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C13339 f38062;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final StringBuilder f38063;

    static {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            sb.append(c);
        }
        f38057 = sb.toString().toCharArray();
    }

    public C12634() {
        this.f38063 = new StringBuilder();
        this.f38062 = new C13339(null);
        this.f38058 = new HashMap();
        this.f38059 = null;
        this.f38060 = false;
    }

    public C12634(C12634 c12634) {
        this.f38063 = new StringBuilder();
        this.f38062 = new C13339(null);
        this.f38058 = new HashMap();
        this.f38060 = false;
        this.f38059 = c12634;
    }

    @Override // l.AbstractC0890
    /* JADX INFO: renamed from: ܽ */
    public final void mo3241() {
        this.f38060 = true;
    }

    @Override // l.AbstractC0890
    /* JADX INFO: renamed from: ۧ */
    public final void mo3240() {
        this.f38059 = null;
        this.f38061 = 0;
    }

    @Override // l.AbstractC0890
    /* JADX INFO: renamed from: ֫ */
    public final String mo3239() {
        StringBuilder sbM30895 = m30895();
        if (this.f38060) {
            sbM30895.insert(0, '_');
        }
        m30894();
        C13339 c13339 = this.f38062;
        c13339.m32317(sbM30895);
        HashMap map = this.f38058;
        String str = (String) map.get(c13339);
        if (str != null) {
            return str;
        }
        String string = sbM30895.toString();
        map.put(new C13339(string), string);
        return string;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private StringBuilder m30895() {
        StringBuilder sbM30895;
        int i = this.f38061;
        C12634 c12634 = this.f38059;
        if (c12634 == null) {
            sbM30895 = this.f38063;
            C11003.requireNonNull(sbM30895);
            sbM30895.setLength(0);
        } else {
            sbM30895 = c12634.m30895();
        }
        sbM30895.append(f38057[i]);
        return sbM30895;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m30894() {
        int i = this.f38061 + 1;
        this.f38061 = i;
        if (i == f38057.length) {
            this.f38061 = 0;
            C12634 c12634 = this.f38059;
            if (c12634 == null) {
                this.f38059 = new C12634(null);
            } else {
                c12634.m30894();
            }
        }
    }
}
