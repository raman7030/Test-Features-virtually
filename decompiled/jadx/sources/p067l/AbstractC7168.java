package p067l;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: renamed from: l.ۚ֫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7168 implements InterfaceC16847 {

    /* JADX INFO: renamed from: a */
    public InterfaceC7324 f18714a;

    /* JADX INFO: renamed from: b */
    public int f18715b;

    /* JADX INFO: renamed from: c */
    public InterfaceC16847 f18716c;

    /* JADX INFO: renamed from: d */
    public InterfaceC16847 f18717d;

    /* JADX INFO: renamed from: e */
    public Deque f18718e;

    @Override // p067l.InterfaceC16847
    public final int characteristics() {
        return 64;
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ Comparator getComparator() {
        return C4779.$default$getComparator(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ long getExactSizeIfKnown() {
        return C4779.$default$getExactSizeIfKnown(this);
    }

    @Override // p067l.InterfaceC16847
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return C4779.$default$hasCharacteristics(this, i);
    }

    public AbstractC7168(InterfaceC7324 interfaceC7324) {
        this.f18714a = interfaceC7324;
    }

    /* JADX INFO: renamed from: b */
    public final Deque m16476b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iMo3500o = this.f18714a.mo3500o();
        while (true) {
            iMo3500o--;
            if (iMo3500o < this.f18715b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f18714a.mo3496a(iMo3500o));
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC7324 m16475a(Deque deque) {
        while (true) {
            ArrayDeque arrayDeque = (ArrayDeque) deque;
            InterfaceC7324 interfaceC7324 = (InterfaceC7324) arrayDeque.pollFirst();
            if (interfaceC7324 == null) {
                return null;
            }
            if (interfaceC7324.mo3500o() != 0) {
                int iMo3500o = interfaceC7324.mo3500o();
                while (true) {
                    iMo3500o--;
                    if (iMo3500o >= 0) {
                        arrayDeque.addFirst(interfaceC7324.mo3496a(iMo3500o));
                    }
                }
            } else if (interfaceC7324.count() > 0) {
                return interfaceC7324;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16477c() {
        if (this.f18714a == null) {
            return false;
        }
        if (this.f18717d != null) {
            return true;
        }
        InterfaceC16847 interfaceC16847 = this.f18716c;
        if (interfaceC16847 == null) {
            Deque dequeM16476b = m16476b();
            this.f18718e = dequeM16476b;
            InterfaceC7324 interfaceC7324M16475a = m16475a(dequeM16476b);
            if (interfaceC7324M16475a != null) {
                this.f18717d = interfaceC7324M16475a.spliterator();
                return true;
            }
            this.f18714a = null;
            return false;
        }
        this.f18717d = interfaceC16847;
        return true;
    }

    @Override // p067l.InterfaceC16847
    public final InterfaceC16847 trySplit() {
        InterfaceC7324 interfaceC7324 = this.f18714a;
        if (interfaceC7324 == null || this.f18717d != null) {
            return null;
        }
        InterfaceC16847 interfaceC16847 = this.f18716c;
        if (interfaceC16847 != null) {
            return interfaceC16847.trySplit();
        }
        if (this.f18715b < interfaceC7324.mo3500o() - 1) {
            InterfaceC7324 interfaceC7325 = this.f18714a;
            int i = this.f18715b;
            this.f18715b = i + 1;
            return interfaceC7325.mo3496a(i).spliterator();
        }
        InterfaceC7324 interfaceC7324Mo3496a = this.f18714a.mo3496a(this.f18715b);
        this.f18714a = interfaceC7324Mo3496a;
        if (interfaceC7324Mo3496a.mo3500o() == 0) {
            InterfaceC16847 interfaceC16847Spliterator = this.f18714a.spliterator();
            this.f18716c = interfaceC16847Spliterator;
            return interfaceC16847Spliterator.trySplit();
        }
        InterfaceC7324 interfaceC7326 = this.f18714a;
        this.f18715b = 1;
        return interfaceC7326.mo3496a(0).spliterator();
    }

    @Override // p067l.InterfaceC16847
    public final long estimateSize() {
        long jCount = 0;
        if (this.f18714a == null) {
            return 0L;
        }
        InterfaceC16847 interfaceC16847 = this.f18716c;
        if (interfaceC16847 != null) {
            return interfaceC16847.estimateSize();
        }
        for (int i = this.f18715b; i < this.f18714a.mo3500o(); i++) {
            jCount += this.f18714a.mo3496a(i).count();
        }
        return jCount;
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC3437 trySplit() {
        return (InterfaceC3437) trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC20202 trySplit() {
        return (InterfaceC20202) trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC2766 trySplit() {
        return (InterfaceC2766) trySplit();
    }

    @Override // p067l.InterfaceC16847
    public /* bridge */ /* synthetic */ InterfaceC10124 trySplit() {
        return (InterfaceC10124) trySplit();
    }
}
