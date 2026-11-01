package p067l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۡۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10777 extends AbstractC22592 {
    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: e */
    public final AbstractC22592 mo6603e(InterfaceC16847 interfaceC16847) {
        return new C10777(this.f71313b, interfaceC16847, this.f71312a);
    }

    @Override // p067l.AbstractC22592
    /* JADX INFO: renamed from: d */
    public final void mo6602d() {
        C21581 c21581 = new C21581();
        this.f71319h = c21581;
        C12826.requireNonNull(c21581);
        this.f71316e = this.f71313b.mo25630g0(new C9180(c21581, 0));
        this.f71317f = new C18546(19, this);
    }

    @Override // p067l.InterfaceC16847
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        C12826.requireNonNull(consumer);
        boolean zM50630a = m50630a();
        if (!zM50630a) {
            return zM50630a;
        }
        C21581 c21581 = (C21581) this.f71319h;
        long j = this.f71318g;
        if (c21581.f65670c != 0) {
            if (j >= c21581.count()) {
                throw new IndexOutOfBoundsException(Long.toString(j));
            }
            for (int i = 0; i <= c21581.f65670c; i++) {
                long j2 = c21581.f65671d[i];
                Object[] objArr = c21581.f68053f[i];
                if (j < ((long) objArr.length) + j2) {
                    obj = objArr[(int) (j - j2)];
                }
            }
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        if (j < c21581.f65669b) {
            obj = c21581.f68052e[(int) j];
        } else {
            throw new IndexOutOfBoundsException(Long.toString(j));
        }
        consumer.m45213n(obj);
        return zM50630a;
    }

    @Override // p067l.InterfaceC16847
    public final void forEachRemaining(Consumer consumer) {
        if (this.f71319h == null && !this.f71320i) {
            C12826.requireNonNull(consumer);
            m50632c();
            C12826.requireNonNull(consumer);
            C9180 c9180 = new C9180(consumer, 1);
            this.f71313b.mo25629f0(this.f71315d, c9180);
            this.f71320i = true;
            return;
        }
        while (tryAdvance(consumer)) {
        }
    }
}
