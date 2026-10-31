package l;

/* JADX INFO: renamed from: l.ۤܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJ0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10438 extends AbstractC4793 {
    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ۧ */
    public final int mo2084() {
        return m13994().m32168().mo7129();
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ֫ */
    public final void mo2082(C18241 c18241) {
        m13994().m32168().mo7132(c18241, this);
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC4793 mo3994(int i) {
        return mo2081(m13993().m46259(i));
    }

    @Override // l.AbstractC4793
    /* JADX INFO: renamed from: ܺ */
    public final String mo2085() {
        AbstractC11849 abstractC11849M32168 = m13994().m32168();
        abstractC11849M32168.getClass();
        String strM32170 = m13994().m32170();
        String strMo7130 = abstractC11849M32168.mo7130(this);
        String strMo7133 = abstractC11849M32168.mo7133(this);
        StringBuilder sbM32307 = C13325.m32307(100, strM32170);
        if (strMo7130.length() != 0) {
            sbM32307.append(' ');
            sbM32307.append(strMo7130);
        }
        if (strMo7133.length() != 0) {
            sbM32307.append(" // ");
            sbM32307.append(strMo7133);
        }
        return sbM32307.toString();
    }
}
