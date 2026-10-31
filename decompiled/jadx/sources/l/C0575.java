package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes2.dex */
public final class C0575 extends AbstractC0204 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f2265;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0052 f2266;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC5515 f2267;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f2268;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2609 f2269 = C2609.m8239();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f2270;

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1379(AbstractC5144 abstractC5144) {
        this.f2270 = this.f2267.f17073.f33440.f66457;
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        if (!c7673.f16086.m12913(EnumC9454.ERROR)) {
            this.f2270 = c7673.f16086;
        } else {
            this.f2270 = m2350(c7673.f23696, this.f2266.f918).f17560;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        if (!c6262.f16086.m12913(EnumC9454.ERROR)) {
            this.f2270 = c6262.f16086;
            return;
        }
        boolean z = this.f2265;
        try {
            this.f2265 = false;
            c6262.f19397.mo988(this);
            AbstractC4308 abstractC4308 = this.f2270;
            this.f2265 = z;
            this.f2270 = m2350(c6262.f19395, abstractC4308.f13890).f17560;
        } catch (Throwable th) {
            this.f2265 = z;
            throw th;
        }
    }

    @Override // l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1411(C16432 c16432) {
        if (!c16432.f16086.m12913(EnumC9454.ERROR)) {
            this.f2270 = c16432.f16086;
            return;
        }
        c16432.f50542.mo988(this);
        C19955 c19955 = (C19955) this.f2270;
        if (this.f2269.contains(c19955.f13890)) {
            C14163 c14163 = (C14163) c19955.f13890;
            int iM8245 = c16432.f50541.m8245();
            C11139 c11139 = this.f2267.f17073;
            C19955 c19956 = (C19955) c14163.f17560;
            C12171.m29642(c19956.f64616.isEmpty());
            if (iM8245 == 1) {
                AbstractC12486 abstractC12486 = c11139.f33438.f18880;
                abstractC12486.getClass();
                char[] charArray = "T".toCharArray();
                c19956.f64616 = c19956.f64616.m8246(new C8541(c14163, c11139.f33440.f66522, abstractC12486.mo15927(charArray, charArray.length)));
            } else {
                while (iM8245 > 0) {
                    c19956.f64616 = c19956.f64616.m8246(new C8541(c14163, c11139.f33440.f66522, c11139.f33438.f18880.m30652(C19370.m44628(iM8245, "T"))));
                    iM8245--;
                }
            }
        }
        C2609 c2609 = c16432.f50541;
        C18837 c18837 = new C18837();
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            ((AbstractC5144) it.next()).mo988(this);
            c18837.m43511(this.f2270);
        }
        this.f2270 = new C18921(c19955.f13890, c16432.f16086, c18837.m43517());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14163 m2350(AbstractC10370 abstractC10370, AbstractC5698 abstractC5698) {
        C14163 c14163 = new C14163(this.f2265 ? 512 : 0, abstractC10370, abstractC5698);
        c14163.f42762 = new C23895(c14163);
        c14163.f17560 = new C19627(this.f2268, c14163);
        this.f2269 = this.f2269.m8246(c14163);
        return c14163;
    }

    public C0575(AbstractC5515 abstractC5515, C0052 c0052, AbstractC4308 abstractC4308, boolean z) {
        this.f2267 = abstractC5515;
        this.f2266 = c0052;
        this.f2268 = abstractC4308;
        this.f2265 = z;
    }
}
