package l;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳ֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8AH */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14187 implements InterfaceC18547 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C17716[] f42824;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C16304 mo33844();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C17716[] mo33845(int i);

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ܽ */
    public final void mo5152(C15723 c15723) {
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17716[] m33846() {
        return this.f42824;
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ۧ */
    public final void mo5151(C15723 c15723) throws C8669 {
        c15723.m37107(EnumC3730.FOUR);
        long jM37112 = c15723.m37112();
        if (jM37112 <= 2147483647L) {
            int i = (int) jM37112;
            if (c15723.m37111() == 0) {
                this.f42824 = null;
                return;
            } else {
                if (i < 0) {
                    throw new C8669(String.format("Expected entriesRead >= 0, got: %d", Integer.valueOf(i)));
                }
                this.f42824 = mo33845(i);
                return;
            }
        }
        throw new C8669(String.format("%s %d > %d", "EntriesRead", Long.valueOf(jM37112), Integer.MAX_VALUE));
    }

    @Override // l.InterfaceC18547
    /* JADX INFO: renamed from: ֫ */
    public final void mo5150(C15723 c15723) throws EOFException {
        C17716[] c17716Arr;
        if (this.f42824 != null) {
            c15723.m37107(EnumC3730.FOUR);
            c15723.m37106(4);
            int i = 0;
            while (true) {
                c17716Arr = this.f42824;
                if (i >= c17716Arr.length) {
                    break;
                }
                c17716Arr[i] = mo33844();
                this.f42824[i].getClass();
                i++;
            }
            for (C17716 c17716 : c17716Arr) {
                c17716.mo5151(c15723);
            }
            for (C17716 c17717 : this.f42824) {
                c17717.mo5150(c15723);
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f42824);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbstractC14187) {
            return Arrays.equals(this.f42824, ((AbstractC14187) obj).f42824);
        }
        return false;
    }
}
