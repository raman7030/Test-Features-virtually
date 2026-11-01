package p067l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8AH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15851 implements InterfaceC19995 {

    /* JADX INFO: renamed from: ֫ */
    public C19205[] f45911;

    /* JADX INFO: renamed from: ֫ */
    public abstract C17863 mo35976();

    /* JADX INFO: renamed from: ֫ */
    public abstract C19205[] mo35977(int i);

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ܽ */
    public final void mo7394(C17311 c17311) {
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19205[] m35978() {
        return this.f45911;
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ۧ */
    public final void mo7393(C17311 c17311) throws C10607 {
        c17311.m39276(EnumC5913.FOUR);
        long jM39281 = c17311.m39281();
        if (jM39281 <= 2147483647L) {
            int i = (int) jM39281;
            if (c17311.m39280() == 0) {
                this.f45911 = null;
                return;
            } else {
                if (i < 0) {
                    throw new C10607(String.format("Expected entriesRead >= 0, got: %d", Integer.valueOf(i)));
                }
                this.f45911 = mo35977(i);
                return;
            }
        }
        throw new C10607(String.format("%s %d > %d", "EntriesRead", Long.valueOf(jM39281), Integer.MAX_VALUE));
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ֫ */
    public final void mo7392(C17311 c17311) throws EOFException {
        C19205[] c19205Arr;
        if (this.f45911 != null) {
            c17311.m39276(EnumC5913.FOUR);
            c17311.m39275(4);
            int i = 0;
            while (true) {
                c19205Arr = this.f45911;
                if (i >= c19205Arr.length) {
                    break;
                }
                c19205Arr[i] = mo35976();
                this.f45911[i].getClass();
                i++;
            }
            for (C19205 c19205 : c19205Arr) {
                c19205.mo7393(c17311);
            }
            for (C19205 c19206 : this.f45911) {
                c19206.mo7392(c17311);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f45911);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC15851) {
            return Arrays.equals(this.f45911, ((AbstractC15851) obj).f45911);
        }
        return false;
    }
}
