package p067l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.۫᩶ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: V1UX */
/* JADX INFO: loaded from: classes4.dex */
public final class C14376 extends AbstractC3214 {

    /* JADX INFO: renamed from: ᩻ */
    public static final char[] f41083;

    /* JADX INFO: renamed from: ֫ */
    public final HashMap f41084;

    /* JADX INFO: renamed from: ۧ */
    public C14376 f41085;

    /* JADX INFO: renamed from: ܳ */
    public boolean f41086;

    /* JADX INFO: renamed from: ܽ */
    public int f41087;

    /* JADX INFO: renamed from: ܿ */
    public final C15046 f41088;

    /* JADX INFO: renamed from: ᩳ */
    public final StringBuilder f41089;

    static {
        StringBuilder sb = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c = (char) (c + 1)) {
            sb.append(c);
        }
        f41083 = sb.toString().toCharArray();
    }

    public C14376() {
        this.f41089 = new StringBuilder();
        this.f41088 = new C15046(null);
        this.f41084 = new HashMap();
        this.f41085 = null;
        this.f41086 = false;
    }

    public C14376(C14376 c14376) {
        this.f41089 = new StringBuilder();
        this.f41088 = new C15046(null);
        this.f41084 = new HashMap();
        this.f41086 = false;
        this.f41085 = c14376;
    }

    @Override // p067l.AbstractC3214
    /* JADX INFO: renamed from: ܽ */
    public final void mo5555() {
        this.f41086 = true;
    }

    @Override // p067l.AbstractC3214
    /* JADX INFO: renamed from: ۧ */
    public final void mo5554() {
        this.f41085 = null;
        this.f41087 = 0;
    }

    @Override // p067l.AbstractC3214
    /* JADX INFO: renamed from: ֫ */
    public final String mo5553() {
        StringBuilder sbM32973 = m32973();
        if (this.f41086) {
            sbM32973.insert(0, '_');
        }
        m32972();
        C15046 c15046 = this.f41088;
        c15046.m34418(sbM32973);
        HashMap map = this.f41084;
        String str = (String) map.get(c15046);
        if (str != null) {
            return str;
        }
        String string = sbM32973.toString();
        map.put(new C15046(string), string);
        return string;
    }

    /* JADX INFO: renamed from: ܿ */
    private StringBuilder m32973() {
        StringBuilder sbM32973;
        int i = this.f41087;
        C14376 c14376 = this.f41085;
        if (c14376 == null) {
            sbM32973 = this.f41089;
            C12826.requireNonNull(sbM32973);
            sbM32973.setLength(0);
        } else {
            sbM32973 = c14376.m32973();
        }
        sbM32973.append(f41083[i]);
        return sbM32973;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m32972() {
        int i = this.f41087 + 1;
        this.f41087 = i;
        if (i == f41083.length) {
            this.f41087 = 0;
            C14376 c14376 = this.f41085;
            if (c14376 == null) {
                this.f41085 = new C14376(null);
            } else {
                c14376.m32972();
            }
        }
    }
}
