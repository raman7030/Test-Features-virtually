package p067l;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.᩶ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 49EX */
/* JADX INFO: loaded from: classes4.dex */
public final class C21649 implements Iterator {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ C6896 f68207;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC22144 f68208;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC20132 f68209 = C15989.m36337();

    /* JADX INFO: renamed from: ᩸ */
    public byte[] f68210;

    /* JADX INFO: renamed from: ᩹ */
    public Iterator f68211;

    public C21649(C6896 c6896) {
        AbstractC22144 abstractC22144;
        this.f68207 = c6896;
        m48865(true);
        while (true) {
            Iterator it = this.f68211;
            if (it == null) {
                abstractC22144 = null;
                break;
            } else {
                if (it.hasNext()) {
                    abstractC22144 = (AbstractC22144) this.f68211.next();
                    break;
                }
                m48865(false);
            }
        }
        this.f68208 = abstractC22144;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f68208 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        AbstractC22144 abstractC22144;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        AbstractC22144 abstractC22145 = this.f68208;
        while (true) {
            Iterator it = this.f68211;
            if (it == null) {
                abstractC22144 = null;
                break;
            }
            if (it.hasNext()) {
                abstractC22144 = (AbstractC22144) this.f68211.next();
                break;
            }
            m48865(false);
        }
        this.f68208 = abstractC22144;
        return abstractC22145;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m48865(boolean z) {
        EnumSet enumSetNoneOf;
        byte[] bArr;
        C6896 c6896 = this.f68207;
        C15612 c15612 = c6896.f13421;
        if (z) {
            enumSetNoneOf = EnumSet.of(EnumC15475.SMB2_RESTART_SCANS);
        } else {
            enumSetNoneOf = EnumSet.noneOf(EnumC15475.class);
        }
        InterfaceC20132 interfaceC20132 = this.f68209;
        C4393 c4393M10456 = c15612.m10456(c6896.f13423, enumSetNoneOf, interfaceC20132.mo5892());
        long jM54605 = ((C24864) c4393M10456.mo5341()).m54605();
        byte[] bArrM9144 = c4393M10456.m9144();
        if (jM54605 == EnumC9460.STATUS_NO_MORE_FILES.getValue() || jM54605 == EnumC9460.STATUS_NO_SUCH_FILE.getValue() || ((bArr = this.f68210) != null && Arrays.equals(bArr, bArrM9144))) {
            this.f68211 = null;
            this.f68210 = null;
        } else {
            this.f68210 = bArrM9144;
            this.f68211 = C15989.m36336(bArrM9144, interfaceC20132);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
