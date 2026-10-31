package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.۫ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AAYE */
/* JADX INFO: loaded from: classes3.dex */
public class C12229 {
    public volatile /* synthetic */ int _size = 0;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC10113[] f36472;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29728(AbstractRunnableC3968 abstractRunnableC3968) {
        synchronized (this) {
            if (abstractRunnableC3968.m12006() != null) {
                m29726(abstractRunnableC3968.m12009());
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29730() {
        InterfaceC10113 interfaceC10113M29725;
        synchronized (this) {
            interfaceC10113M29725 = m29725();
        }
        return interfaceC10113M29725;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29731() {
        InterfaceC10113 interfaceC10113M29726;
        synchronized (this) {
            interfaceC10113M29726 = this._size > 0 ? m29726(0) : null;
        }
        return interfaceC10113M29726;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m29729() {
        return this._size == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29725() {
        InterfaceC10113[] interfaceC10113Arr = this.f36472;
        if (interfaceC10113Arr != null) {
            return interfaceC10113Arr[0];
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10113 m29726(int i) {
        int i2;
        int i3;
        InterfaceC10113[] interfaceC10113Arr;
        int i4;
        InterfaceC10113 interfaceC10113;
        InterfaceC10113 interfaceC10114;
        InterfaceC10113 interfaceC10115;
        InterfaceC10113 interfaceC10116;
        InterfaceC10113[] interfaceC10113Arr2 = this.f36472;
        C11233.m27799(interfaceC10113Arr2);
        this._size--;
        if (i < this._size) {
            m29723(i, this._size);
            int i5 = (i - 1) / 2;
            if (i > 0) {
                InterfaceC10113 interfaceC10117 = interfaceC10113Arr2[i];
                C11233.m27799(interfaceC10117);
                InterfaceC10113 interfaceC10118 = interfaceC10113Arr2[i5];
                C11233.m27799(interfaceC10118);
                if (((Comparable) interfaceC10117).compareTo(interfaceC10118) < 0) {
                    m29723(i, i5);
                    m29724(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= this._size) {
                            break;
                        }
                        interfaceC10113Arr = this.f36472;
                        C11233.m27799(interfaceC10113Arr);
                        i4 = i2 + 2;
                        if (i4 < this._size) {
                            interfaceC10115 = interfaceC10113Arr[i4];
                            C11233.m27799(interfaceC10115);
                            interfaceC10116 = interfaceC10113Arr[i3];
                            C11233.m27799(interfaceC10116);
                            if (((Comparable) interfaceC10115).compareTo(interfaceC10116) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        interfaceC10113 = interfaceC10113Arr[i];
                        C11233.m27799(interfaceC10113);
                        interfaceC10114 = interfaceC10113Arr[i4];
                        C11233.m27799(interfaceC10114);
                        if (((Comparable) interfaceC10113).compareTo(interfaceC10114) <= 0) {
                            break;
                        }
                        m29723(i, i4);
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
                    interfaceC10113Arr = this.f36472;
                    C11233.m27799(interfaceC10113Arr);
                    i4 = i2 + 2;
                    if (i4 < this._size) {
                        interfaceC10115 = interfaceC10113Arr[i4];
                        C11233.m27799(interfaceC10115);
                        interfaceC10116 = interfaceC10113Arr[i3];
                        C11233.m27799(interfaceC10116);
                        if (((Comparable) interfaceC10115).compareTo(interfaceC10116) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    interfaceC10113 = interfaceC10113Arr[i];
                    C11233.m27799(interfaceC10113);
                    interfaceC10114 = interfaceC10113Arr[i4];
                    C11233.m27799(interfaceC10114);
                    if (((Comparable) interfaceC10113).compareTo(interfaceC10114) <= 0) {
                        break;
                        break;
                    }
                    m29723(i, i4);
                    i = i4;
                }
            }
        }
        InterfaceC10113 interfaceC10119 = interfaceC10113Arr2[this._size];
        C11233.m27799(interfaceC10119);
        interfaceC10119.mo12008((C12229) null);
        interfaceC10119.mo12007(-1);
        interfaceC10113Arr2[this._size] = null;
        return interfaceC10119;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29727(AbstractRunnableC3968 abstractRunnableC3968) {
        abstractRunnableC3968.mo12008(this);
        InterfaceC10113[] interfaceC10113Arr = this.f36472;
        if (interfaceC10113Arr == null) {
            interfaceC10113Arr = new InterfaceC10113[4];
            this.f36472 = interfaceC10113Arr;
        } else if (this._size >= interfaceC10113Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(interfaceC10113Arr, this._size * 2);
            C11233.m27803(objArrCopyOf, "copyOf(this, newSize)");
            interfaceC10113Arr = (InterfaceC10113[]) objArrCopyOf;
            this.f36472 = interfaceC10113Arr;
        }
        int i = this._size;
        this._size = i + 1;
        interfaceC10113Arr[i] = abstractRunnableC3968;
        abstractRunnableC3968.mo12007(i);
        m29724(i);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private final void m29724(int i) {
        while (i > 0) {
            InterfaceC10113[] interfaceC10113Arr = this.f36472;
            C11233.m27799(interfaceC10113Arr);
            int i2 = (i - 1) / 2;
            InterfaceC10113 interfaceC10113 = interfaceC10113Arr[i2];
            C11233.m27799(interfaceC10113);
            InterfaceC10113 interfaceC10114 = interfaceC10113Arr[i];
            C11233.m27799(interfaceC10114);
            if (((Comparable) interfaceC10113).compareTo(interfaceC10114) <= 0) {
                return;
            }
            m29723(i, i2);
            i = i2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private final void m29723(int i, int i2) {
        InterfaceC10113[] interfaceC10113Arr = this.f36472;
        C11233.m27799(interfaceC10113Arr);
        InterfaceC10113 interfaceC10113 = interfaceC10113Arr[i2];
        C11233.m27799(interfaceC10113);
        InterfaceC10113 interfaceC10114 = interfaceC10113Arr[i];
        C11233.m27799(interfaceC10114);
        interfaceC10113Arr[i] = interfaceC10113;
        interfaceC10113Arr[i2] = interfaceC10114;
        interfaceC10113.mo12007(i);
        interfaceC10114.mo12007(i2);
    }
}
