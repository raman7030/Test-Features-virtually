package p067l;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.֨᩶ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q64S */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3651 extends AbstractC21520 {

    /* JADX INFO: renamed from: ᩸ */
    public Object f7669;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC7675 f7670 = EnumC7675.NOT_READY;

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo4282();

    /* JADX INFO: renamed from: ۧ */
    public final void m6947() {
        this.f7670 = EnumC7675.DONE;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC7675 enumC7675 = this.f7670;
        EnumC7675 enumC7676 = EnumC7675.FAILED;
        C6194.m14036(enumC7675 != enumC7676);
        int iOrdinal = this.f7670.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.f7670 = enumC7676;
            this.f7669 = mo4282();
            if (this.f7670 != EnumC7675.DONE) {
                this.f7670 = EnumC7675.READY;
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
        this.f7670 = EnumC7675.NOT_READY;
        Object obj = this.f7669;
        this.f7669 = null;
        return obj;
    }
}
