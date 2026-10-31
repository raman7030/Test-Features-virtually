package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8847 extends AbstractC21279 {
    @Override // l.AbstractC21279
    public final AbstractC21279 e(InterfaceC15234 interfaceC15234) {
        return new C8847(this.b, interfaceC15234, this.a);
    }

    @Override // l.AbstractC21279
    public final void d() {
        C20215 c20215 = new C20215();
        this.h = c20215;
        C11003.requireNonNull(c20215);
        this.e = this.b.g0(new C7167(c20215, 0));
        this.f = new C17022(19, this);
    }

    @Override // l.InterfaceC15234
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        C11003.requireNonNull(consumer);
        boolean zA = a();
        if (!zA) {
            return zA;
        }
        C20215 c20215 = (C20215) this.h;
        long j = this.g;
        if (c20215.c != 0) {
            if (j >= c20215.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c20215.c; i++) {
                long j2 = c20215.d[i];
                Object[] objArr = c20215.f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < c20215.b) {
            obj = c20215.e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.n(obj);
        return zA;
    }

    @Override // l.InterfaceC15234
    public final void forEachRemaining(Consumer consumer) {
        if (this.h == null && !this.i) {
            C11003.requireNonNull(consumer);
            c();
            C11003.requireNonNull(consumer);
            C7167 c7167 = new C7167(consumer, 1);
            this.b.f0(this.d, c7167);
            this.i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
