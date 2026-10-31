package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠۠ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8053 implements Iterator {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f24816;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC0997 f24817 = EnumC0997.NOT_READY;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC11581 abstractC11581;
        EnumC0997 enumC0997 = this.f24817;
        EnumC0997 enumC0998 = EnumC0997.FAILED;
        C4025.m12116(enumC0997 != enumC0998);
        int iOrdinal = this.f24817.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f24817 = enumC0998;
            AbstractC20253 abstractC20253 = (AbstractC20253) this;
            int i = abstractC20253.f65485;
            while (true) {
                int i2 = abstractC20253.f65485;
                if (i2 == -1) {
                    abstractC20253.f24817 = EnumC0997.DONE;
                    string = null;
                    break;
                }
                int iMo36336 = abstractC20253.mo36336(i2);
                CharSequence charSequence = abstractC20253.f65487;
                if (iMo36336 == -1) {
                    iMo36336 = charSequence.length();
                    abstractC20253.f65485 = -1;
                } else {
                    abstractC20253.f65485 = abstractC20253.mo36335(iMo36336);
                }
                int i3 = abstractC20253.f65485;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    abstractC20253.f65485 = i4;
                    if (i4 > charSequence.length()) {
                        abstractC20253.f65485 = -1;
                    }
                } else {
                    while (true) {
                        abstractC11581 = abstractC20253.f65486;
                        if (i >= iMo36336 || !abstractC11581.mo13300(charSequence.charAt(i))) {
                            break;
                        }
                        i++;
                    }
                    while (iMo36336 > i && abstractC11581.mo13300(charSequence.charAt(iMo36336 - 1))) {
                        iMo36336--;
                    }
                    if (abstractC20253.f65484 && i == iMo36336) {
                        i = abstractC20253.f65485;
                    } else {
                        int i5 = abstractC20253.f65488;
                        if (i5 == 1) {
                            iMo36336 = charSequence.length();
                            abstractC20253.f65485 = -1;
                            while (iMo36336 > i && abstractC11581.mo13300(charSequence.charAt(iMo36336 - 1))) {
                                iMo36336--;
                            }
                        } else {
                            abstractC20253.f65488 = i5 - 1;
                        }
                        string = charSequence.subSequence(i, iMo36336).toString();
                        break;
                    }
                }
            }
            this.f24816 = string;
            if (this.f24817 != EnumC0997.DONE) {
                this.f24817 = EnumC0997.READY;
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
        this.f24817 = EnumC0997.NOT_READY;
        String str = this.f24816;
        this.f24816 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
