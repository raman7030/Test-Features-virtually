package l;

import java.util.IdentityHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14302 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f43125;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9365 f43127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9365 f43128;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f43126 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17831 f43129 = new C17831(0, this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C17125 f43130 = new Consumer() { // from class: l.ܿۙᩳ
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            this.f52474.m34124(obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return C23517.$default$andThen(this, consumer);
        }
    };

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m34128() {
        return this.f43125;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34129(C15713 c15713, C15713 c15714) {
        C9365 c9365 = this.f43127;
        C9365 c9366 = c15713.f48465;
        if (c9365 == c9366 && this.f43128 == c15714.f48465) {
            return;
        }
        m34127(c9366);
        m34127(c15714.f48465);
        m34124(this.f43127);
        m34124(this.f43128);
        this.f43127 = c15713.f48465;
        this.f43128 = c15714.f48465;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34130() {
        m34129(new C15713(), new C15713());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m34127(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f43126;
        Integer num = (Integer) identityHashMap.get(obj);
        if (num != null) {
            long jIntValue = ((long) num.intValue()) + ((long) 1);
            int i = (int) jIntValue;
            if (jIntValue != i) {
                throw new ArithmeticException();
            }
            identityHashMap.put(obj, Integer.valueOf(i));
            return;
        }
        identityHashMap.put(obj, 1);
        this.f43125 += m34121(obj);
        boolean z = obj instanceof C8199;
        if ((z || (obj instanceof C11002)) && !z) {
            ((C11002) obj).m27312();
        }
        m34122(obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m34124(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f43126;
        Integer num = (Integer) identityHashMap.get(obj);
        if (num == null) {
            throw new IllegalStateException("Unbalanced history budget release");
        }
        if (num.intValue() > 1) {
            identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
            return;
        }
        identityHashMap.remove(obj);
        this.f43125 -= m34121(obj);
        boolean z = obj instanceof C8199;
        if ((z || (obj instanceof C11002)) && !z) {
            ((C11002) obj).m27312();
        }
        m34122(obj, false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m34125(Object obj, boolean z) {
        if (z) {
            m34127(obj);
        } else {
            m34124(obj);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m34122(Object obj, boolean z) {
        if (obj instanceof C9365) {
            C9365 c9365 = (C9365) obj;
            Object obj2 = c9365.f28439;
            if (obj2 != null) {
                m34125(obj2, z);
                return;
            } else {
                m34125(c9365.f28441, z);
                m34125(c9365.f28440, z);
                return;
            }
        }
        if (obj instanceof C8905) {
            m34125(((C8905) obj).f27081.f48465, z);
            return;
        }
        if (obj instanceof C23224) {
            C23224 c23224 = (C23224) obj;
            m34125(c23224.f74643, z);
            m34125(c23224.f74639, z);
            m34125(c23224.f74636, z);
            return;
        }
        C4238.m12764(obj, z ? this.f43129 : this.f43130);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m34121(Object obj) {
        if (obj instanceof C5089) {
            return 72L;
        }
        if (obj instanceof C23224) {
            return 128L;
        }
        if ((obj instanceof C8905) || (obj instanceof C9365)) {
            return 104L;
        }
        return C4238.m12763(obj);
    }
}
