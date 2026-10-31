package l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1349 extends AbstractC20151 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object f4899;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public EnumC5583 f4900 = EnumC5583.NOT_READY;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo1890();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m4715() {
        this.f4900 = EnumC5583.DONE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC5583 enumC5583 = this.f4900;
        EnumC5583 enumC5584 = EnumC5583.FAILED;
        C4025.m12116(enumC5583 != enumC5584);
        int iOrdinal = this.f4900.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f4900 = enumC5584;
            this.f4899 = mo1890();
            if (this.f4900 != EnumC5583.DONE) {
                this.f4900 = EnumC5583.READY;
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
        this.f4900 = EnumC5583.NOT_READY;
        Object obj = this.f4899;
        this.f4899 = null;
        return obj;
    }
}
