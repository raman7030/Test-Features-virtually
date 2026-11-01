package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC10022 implements Iterator {

    /* JADX INFO: renamed from: ᩸ */
    public String f27729;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC3316 f27730 = EnumC3316.NOT_READY;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC13375 abstractC13375;
        EnumC3316 enumC3316 = this.f27730;
        EnumC3316 enumC3317 = EnumC3316.FAILED;
        C6194.m14036(enumC3316 != enumC3317);
        int iOrdinal = this.f27730.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f27730 = enumC3317;
            AbstractC21617 abstractC21617 = (AbstractC21617) this;
            int i = abstractC21617.f68134;
            while (true) {
                int i2 = abstractC21617.f68134;
                if (i2 == -1) {
                    abstractC21617.f27730 = EnumC3316.DONE;
                    string = null;
                    break;
                }
                int iMo38498 = abstractC21617.mo38498(i2);
                CharSequence charSequence = abstractC21617.f68136;
                if (iMo38498 == -1) {
                    iMo38498 = charSequence.length();
                    abstractC21617.f68134 = -1;
                } else {
                    abstractC21617.f68134 = abstractC21617.mo38497(iMo38498);
                }
                int i3 = abstractC21617.f68134;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    abstractC21617.f68134 = i4;
                    if (i4 > charSequence.length()) {
                        abstractC21617.f68134 = -1;
                    }
                } else {
                    while (true) {
                        abstractC13375 = abstractC21617.f68135;
                        if (i >= iMo38498 || !abstractC13375.mo15183(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iMo38498 > i && abstractC13375.mo15183(charSequence.charAt(iMo38498 - 1))) {
                        iMo38498--;
                    }
                    if (abstractC21617.f68133 && i == iMo38498) {
                        i = abstractC21617.f68134;
                    } else {
                        int i5 = abstractC21617.f68137;
                        if (i5 == 1) {
                            iMo38498 = charSequence.length();
                            abstractC21617.f68134 = -1;
                            while (iMo38498 > i && abstractC13375.mo15183(charSequence.charAt(iMo38498 - 1))) {
                                iMo38498--;
                            }
                        } else {
                            abstractC21617.f68137 = i5 - 1;
                        }
                        string = charSequence.subSequence(i, iMo38498).toString();
                        break;
                    }
                }
            }
            this.f27729 = string;
            if (this.f27730 != EnumC3316.DONE) {
                this.f27730 = EnumC3316.READY;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f27730 = EnumC3316.NOT_READY;
        String str = this.f27729;
        this.f27729 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
