package p067l;

import java.util.IdentityHashMap;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ܳۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6U1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15961 {

    /* JADX INFO: renamed from: ֫ */
    public long f46217;

    /* JADX INFO: renamed from: ܳ */
    public C11269 f46219;

    /* JADX INFO: renamed from: ܽ */
    public C11269 f46220;

    /* JADX INFO: renamed from: ۧ */
    public final IdentityHashMap f46218 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܿ */
    public final C19315 f46221 = new C19315(0, this);

    /* JADX INFO: renamed from: ᩳ */
    public final C18644 f46222 = new Consumer() { // from class: l.ܿۙᩳ
        @Override // java.util.function.Consumer
        public final void accept(Object obj) {
            this.f55656.m36257(obj);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return C24719.$default$andThen(this, consumer);
        }
    };

    /* JADX INFO: renamed from: ֫ */
    public final long m36261() {
        return this.f46217;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36262(C17302 c17302, C17302 c17303) {
        C11269 c11269 = this.f46219;
        C11269 c112610 = c17302.f51603;
        if (c11269 == c112610 && this.f46220 == c17303.f51603) {
            return;
        }
        m36260(c112610);
        m36260(c17303.f51603);
        m36257(this.f46219);
        m36257(this.f46220);
        this.f46219 = c17302.f51603;
        this.f46220 = c17303.f51603;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36263() {
        m36262(new C17302(), new C17302());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m36260(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f46218;
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
        this.f46217 += m36254(obj);
        boolean z = obj instanceof C10161;
        if ((z || (obj instanceof C12825)) && !z) {
            ((C12825) obj).m29374();
        }
        m36255(obj, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m36257(Object obj) {
        if (obj == null) {
            return;
        }
        IdentityHashMap identityHashMap = this.f46218;
        Integer num = (Integer) identityHashMap.get(obj);
        if (num == null) {
            throw new IllegalStateException("Unbalanced history budget release");
        }
        if (num.intValue() > 1) {
            identityHashMap.put(obj, Integer.valueOf(num.intValue() - 1));
            return;
        }
        identityHashMap.remove(obj);
        this.f46217 -= m36254(obj);
        boolean z = obj instanceof C10161;
        if ((z || (obj instanceof C12825)) && !z) {
            ((C12825) obj).m29374();
        }
        m36255(obj, false);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m36258(Object obj, boolean z) {
        if (z) {
            m36260(obj);
        } else {
            m36257(obj);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m36255(Object obj, boolean z) {
        if (obj instanceof C11269) {
            C11269 c11269 = (C11269) obj;
            Object obj2 = c11269.f31388;
            if (obj2 != null) {
                m36258(obj2, z);
                return;
            } else {
                m36258(c11269.f31390, z);
                m36258(c11269.f31389, z);
                return;
            }
        }
        if (obj instanceof C10832) {
            m36258(((C10832) obj).f30004.f51603, z);
            return;
        }
        if (obj instanceof C24441) {
            C24441 c24441 = (C24441) obj;
            m36258(c24441.f77386, z);
            m36258(c24441.f77382, z);
            m36258(c24441.f77379, z);
            return;
        }
        C6397.m14639(obj, z ? this.f46221 : this.f46222);
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m36254(Object obj) {
        if (obj instanceof C7205) {
            return 72L;
        }
        if (obj instanceof C24441) {
            return 128L;
        }
        if ((obj instanceof C10832) || (obj instanceof C11269)) {
            return 104L;
        }
        return C6397.m14638(obj);
    }
}
