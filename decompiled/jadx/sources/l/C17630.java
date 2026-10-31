package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ܿ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8DD */
/* JADX INFO: loaded from: classes5.dex */
public final class C17630 implements InterfaceC1368, InterfaceC9505 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f53863;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public C18336 f53864;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f53865;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f53866;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f53869;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f53868 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f53871 = new ArrayList();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final PriorityQueue f53870 = new PriorityQueue();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f53867 = new C17714(512);

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return -9223372036854775807L;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if (this.f53868 != 0) {
            throw new IllegalStateException();
        }
        C18336 c18336 = new C18336(interfaceC21830.mo3429(0, 1));
        this.f53864 = c18336;
        C1297 c1297 = new C1297();
        c1297.m4445("audio/midi");
        c1297.m4462("audio/midi");
        c1297.m4465("audio/x-exoplayer-midi");
        c18336.mo8456(c1297.m4440());
        interfaceC21830.mo3431();
        interfaceC21830.mo3430(this);
        this.f53868 = 1;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        C17714 c17714 = new C17714(4);
        ((C16184) interfaceC8424).mo22068(false, 0, 4, c17714.m41482());
        return c17714.m41493() == 1297377380;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        C22632.m50634(this.f53868 != 4);
        this.f53869 = j2;
        C18336 c18336 = this.f53864;
        if (c18336 != null) {
            c18336.m42733();
        }
        if (this.f53868 == 1) {
            this.f53867.m41484(0);
            this.f53863 = 0;
        } else {
            this.f53868 = 2;
        }
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        int i = this.f53868;
        ArrayList<C2814> arrayList = this.f53871;
        int i2 = -1;
        if (i == 1) {
            int iM32446 = C13426.m32446(interfaceC8424.getLength());
            C17714 c17714 = this.f53867;
            int length = c17714.m41482().length;
            if (this.f53863 == length) {
                if (iM32446 != -1) {
                    length = iM32446;
                }
                c17714.m41460((length * 3) / 2);
            }
            int i3 = interfaceC8424.read(c17714.m41482(), this.f53863, c17714.m41472() - this.f53863);
            if (i3 != -1) {
                int i4 = this.f53863 + i3;
                this.f53863 = i4;
                if (iM32446 == -1 || i4 != iM32446) {
                    return 0;
                }
            }
            c17714.m41486(this.f53863);
            if (c17714.m41457() < 14) {
                throw C9080.m23440((String) null, (Throwable) null);
            }
            if (c17714.m41493() != 1297377380) {
                throw C9080.m23440((String) null, (Throwable) null);
            }
            c17714.m41478(4);
            short sM41455 = c17714.m41455();
            short sM41456 = c17714.m41455();
            if (sM41456 <= 0) {
                throw C9080.m23440((String) null, (Throwable) null);
            }
            this.f53866 = c17714.m41455();
            for (int i5 = 0; i5 < sM41456; i5++) {
                if (c17714.m41457() < 8) {
                    throw C9080.m23440((String) null, (Throwable) null);
                }
                if (c17714.m41493() != 1297379947) {
                    throw C9080.m23440((String) null, (Throwable) null);
                }
                int iM41493 = c17714.m41493();
                if (iM41493 > 0) {
                    byte[] bArr = new byte[iM41493];
                    if (c17714.m41457() < iM41493) {
                        throw C9080.m23440((String) null, (Throwable) null);
                    }
                    c17714.m41461(0, iM41493, bArr);
                    arrayList.add(new C2814(sM41455, this.f53866, new C17714(bArr), new C6001(1, this)));
                } else {
                    throw C9080.m23440((String) null, (Throwable) null);
                }
            }
            this.f53868 = 2;
            return 0;
        }
        PriorityQueue priorityQueue = this.f53870;
        if (i != 2) {
            if (i == 3) {
                C2814 c2814 = (C2814) priorityQueue.poll();
                c2814.getClass();
                long jM8692 = c2814.m8692();
                if (jM8692 != -9223372036854775807L) {
                    long j = this.f53865 + 100000;
                    if (j < jM8692) {
                        this.f53865 = j;
                        C18336 c18336 = this.f53864;
                        C22632.m50632(c18336);
                        c18336.mo8455(this.f53865, 0, 0, 0, null);
                    } else {
                        this.f53865 = jM8692;
                        C18336 c18337 = this.f53864;
                        C22632.m50632(c18337);
                        c2814.m8693(c18337, false);
                        c2814.m8694();
                    }
                    i2 = 0;
                }
                priorityQueue.add(c2814);
                return i2;
            }
            throw new IllegalStateException();
        }
        priorityQueue.clear();
        for (C2814 c2815 : arrayList) {
            c2815.m8696();
            c2815.m8694();
        }
        priorityQueue.addAll(arrayList);
        long j2 = this.f53869;
        while (!priorityQueue.isEmpty()) {
            C2814 c2816 = (C2814) priorityQueue.poll();
            c2816.getClass();
            long jM8693 = c2816.m8692();
            if (jM8693 != -9223372036854775807L && jM8693 < j2) {
                C18336 c18338 = this.f53864;
                C22632.m50632(c18338);
                c2816.m8693(c18338, true);
                c2816.m8694();
                priorityQueue.add(c2816);
            }
        }
        priorityQueue.addAll(arrayList);
        this.f53865 = this.f53869;
        C2814 c2817 = (C2814) priorityQueue.peek();
        c2817.getClass();
        if (c2817.m8692() > this.f53865) {
            C18336 c18339 = this.f53864;
            C22632.m50632(c18339);
            c18339.mo8455(this.f53865, 0, 0, 0, null);
        }
        this.f53868 = 3;
        return 0;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
        this.f53871.clear();
        this.f53870.clear();
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f53867;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
        this.f53868 = 4;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        int i = this.f53868;
        if (i == 2 || i == 3) {
            C8799 c8799 = new C8799(j, 14L);
            return new C6682(c8799, c8799);
        }
        C8799 c87910 = C8799.f26802;
        return new C6682(c87910, c87910);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41220(C17630 c17630, int i, long j) {
        Iterator it = c17630.f53871.iterator();
        while (it.hasNext()) {
            ((C2814) it.next()).m8695(i, j);
        }
    }
}
