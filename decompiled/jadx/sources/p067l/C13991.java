package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AAYE */
/* JADX INFO: loaded from: classes3.dex */
public class C13991 {
    public volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC11980[] f39489;

    /* JADX INFO: renamed from: ۧ */
    public final void m31790(AbstractRunnableC6140 abstractRunnableC6140) {
        synchronized (this) {
            if (abstractRunnableC6140.m13930() != null) {
                m31788(abstractRunnableC6140.m13933());
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC11980 m31792() {
        InterfaceC11980 interfaceC11980M31787;
        synchronized (this) {
            interfaceC11980M31787 = m31787();
        }
        return interfaceC11980M31787;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC11980 m31793() {
        InterfaceC11980 interfaceC11980M31788;
        synchronized (this) {
            interfaceC11980M31788 = this._size > 0 ? m31788(0) : null;
        }
        return interfaceC11980M31788;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m31791() {
        return this._size == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11980 m31787() {
        InterfaceC11980[] interfaceC11980Arr = this.f39489;
        if (interfaceC11980Arr != null) {
            return interfaceC11980Arr[0];
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x005a  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e A[LOOP:0: B:9:0x0033->B:21:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x0073 A[EDGE_INSN: B:24:0x0073->B:22:0x0073 BREAK  A[LOOP:0: B:9:0x0033->B:21:0x006e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0073 A[EDGE_INSN: B:25:0x0073->B:22:0x0073 BREAK  A[LOOP:0: B:9:0x0033->B:21:0x006e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11980 m31788(int i) {
        int i2;
        int i3;
        InterfaceC11980[] interfaceC11980Arr;
        int i4;
        InterfaceC11980 interfaceC11980;
        InterfaceC11980 interfaceC11981;
        InterfaceC11980 interfaceC11982;
        InterfaceC11980 interfaceC11983;
        InterfaceC11980[] interfaceC11980Arr2 = this.f39489;
        C13045.m29861(interfaceC11980Arr2);
        this._size--;
        if (i < this._size) {
            m31785(i, this._size);
            int i5 = (i - 1) / 2;
            if (i > 0) {
                InterfaceC11980 interfaceC11984 = interfaceC11980Arr2[i];
                C13045.m29861(interfaceC11984);
                InterfaceC11980 interfaceC11985 = interfaceC11980Arr2[i5];
                C13045.m29861(interfaceC11985);
                if (((Comparable) interfaceC11984).compareTo(interfaceC11985) < 0) {
                    m31785(i, i5);
                    m31786(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= this._size) {
                            break;
                        }
                        interfaceC11980Arr = this.f39489;
                        C13045.m29861(interfaceC11980Arr);
                        i4 = i2 + 2;
                        if (i4 < this._size) {
                            interfaceC11982 = interfaceC11980Arr[i4];
                            C13045.m29861(interfaceC11982);
                            interfaceC11983 = interfaceC11980Arr[i3];
                            C13045.m29861(interfaceC11983);
                            if (((Comparable) interfaceC11982).compareTo(interfaceC11983) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        interfaceC11980 = interfaceC11980Arr[i];
                        C13045.m29861(interfaceC11980);
                        interfaceC11981 = interfaceC11980Arr[i4];
                        C13045.m29861(interfaceC11981);
                        if (((Comparable) interfaceC11980).compareTo(interfaceC11981) <= 0) {
                            break;
                        }
                        m31785(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= this._size) {
                        break;
                        break;
                    }
                    interfaceC11980Arr = this.f39489;
                    C13045.m29861(interfaceC11980Arr);
                    i4 = i2 + 2;
                    if (i4 < this._size) {
                        interfaceC11982 = interfaceC11980Arr[i4];
                        C13045.m29861(interfaceC11982);
                        interfaceC11983 = interfaceC11980Arr[i3];
                        C13045.m29861(interfaceC11983);
                        if (((Comparable) interfaceC11982).compareTo(interfaceC11983) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    interfaceC11980 = interfaceC11980Arr[i];
                    C13045.m29861(interfaceC11980);
                    interfaceC11981 = interfaceC11980Arr[i4];
                    C13045.m29861(interfaceC11981);
                    if (((Comparable) interfaceC11980).compareTo(interfaceC11981) <= 0) {
                        break;
                        break;
                    }
                    m31785(i, i4);
                    i = i4;
                }
            }
        }
        InterfaceC11980 interfaceC11986 = interfaceC11980Arr2[this._size];
        C13045.m29861(interfaceC11986);
        interfaceC11986.mo13932((C13991) null);
        interfaceC11986.mo13931(-1);
        interfaceC11980Arr2[this._size] = null;
        return interfaceC11986;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31789(AbstractRunnableC6140 abstractRunnableC6140) {
        abstractRunnableC6140.mo13932(this);
        InterfaceC11980[] interfaceC11980Arr = this.f39489;
        if (interfaceC11980Arr == null) {
            interfaceC11980Arr = new InterfaceC11980[4];
            this.f39489 = interfaceC11980Arr;
        } else if (this._size >= interfaceC11980Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(interfaceC11980Arr, this._size * 2);
            C13045.m29865(objArrCopyOf, "copyOf(this, newSize)");
            interfaceC11980Arr = (InterfaceC11980[]) objArrCopyOf;
            this.f39489 = interfaceC11980Arr;
        }
        int i = this._size;
        this._size = i + 1;
        interfaceC11980Arr[i] = abstractRunnableC6140;
        abstractRunnableC6140.mo13931(i);
        m31786(i);
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m31786(int i) {
        while (i > 0) {
            InterfaceC11980[] interfaceC11980Arr = this.f39489;
            C13045.m29861(interfaceC11980Arr);
            int i2 = (i - 1) / 2;
            InterfaceC11980 interfaceC11980 = interfaceC11980Arr[i2];
            C13045.m29861(interfaceC11980);
            InterfaceC11980 interfaceC11981 = interfaceC11980Arr[i];
            C13045.m29861(interfaceC11981);
            if (((Comparable) interfaceC11980).compareTo(interfaceC11981) <= 0) {
                return;
            }
            m31785(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m31785(int i, int i2) {
        InterfaceC11980[] interfaceC11980Arr = this.f39489;
        C13045.m29861(interfaceC11980Arr);
        InterfaceC11980 interfaceC11980 = interfaceC11980Arr[i2];
        C13045.m29861(interfaceC11980);
        InterfaceC11980 interfaceC11981 = interfaceC11980Arr[i];
        C13045.m29861(interfaceC11981);
        interfaceC11980Arr[i] = interfaceC11980;
        interfaceC11980Arr[i2] = interfaceC11981;
        interfaceC11980.mo13931(i);
        interfaceC11981.mo13931(i2);
    }
}
