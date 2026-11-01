package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: renamed from: l.ܿ᩹֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K8DD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19124 implements InterfaceC3669, InterfaceC11402 {

    /* JADX INFO: renamed from: ֫ */
    public int f57056;

    /* JADX INFO: renamed from: ۜ */
    public C19795 f57057;

    /* JADX INFO: renamed from: ۧ */
    public long f57058;

    /* JADX INFO: renamed from: ܳ */
    public int f57059;

    /* JADX INFO: renamed from: ᩳ */
    public long f57062;

    /* JADX INFO: renamed from: ܿ */
    public int f57061 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f57064 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public final PriorityQueue f57063 = new PriorityQueue();

    /* JADX INFO: renamed from: ܽ */
    public final C19203 f57060 = new C19203(512);

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return -9223372036854775807L;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        if (this.f57061 != 0) {
            throw new IllegalStateException();
        }
        C19795 c19795 = new C19795(interfaceC23116.mo5732(0, 1));
        this.f57057 = c19795;
        C3601 c3601 = new C3601();
        c3601.m6677("audio/midi");
        c3601.m6694("audio/midi");
        c3601.m6697("audio/x-exoplayer-midi");
        c19795.mo10503(c3601.m6672());
        interfaceC23116.mo5734();
        interfaceC23116.mo5733(this);
        this.f57061 = 1;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        C19203 c19203 = new C19203(4);
        ((C17750) interfaceC10375).mo24038(false, 0, 4, c19203.m43728());
        return c19203.m43739() == 1297377380;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        C23877.m52960(this.f57061 != 4);
        this.f57062 = j2;
        C19795 c19795 = this.f57057;
        if (c19795 != null) {
            c19795.m44995();
        }
        if (this.f57061 == 1) {
            this.f57060.m43730(0);
            this.f57056 = 0;
        } else {
            this.f57061 = 2;
        }
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        int i = this.f57061;
        ArrayList<C5043> arrayList = this.f57064;
        int i2 = -1;
        if (i == 1) {
            int iM34548 = C15129.m34548(interfaceC10375.getLength());
            C19203 c19203 = this.f57060;
            int length = c19203.m43728().length;
            if (this.f57056 == length) {
                if (iM34548 != -1) {
                    length = iM34548;
                }
                c19203.m43706((length * 3) / 2);
            }
            int i3 = interfaceC10375.read(c19203.m43728(), this.f57056, c19203.m43718() - this.f57056);
            if (i3 != -1) {
                int i4 = this.f57056 + i3;
                this.f57056 = i4;
                if (iM34548 == -1 || i4 != iM34548) {
                    return 0;
                }
            }
            c19203.m43732(this.f57056);
            if (c19203.m43703() < 14) {
                throw C10998.m25387((String) null, (Throwable) null);
            }
            if (c19203.m43739() != 1297377380) {
                throw C10998.m25387((String) null, (Throwable) null);
            }
            c19203.m43724(4);
            short sM43701 = c19203.m43701();
            short sM43702 = c19203.m43701();
            if (sM43702 <= 0) {
                throw C10998.m25387((String) null, (Throwable) null);
            }
            this.f57059 = c19203.m43701();
            for (int i5 = 0; i5 < sM43702; i5++) {
                if (c19203.m43703() < 8) {
                    throw C10998.m25387((String) null, (Throwable) null);
                }
                if (c19203.m43739() != 1297379947) {
                    throw C10998.m25387((String) null, (Throwable) null);
                }
                int iM43739 = c19203.m43739();
                if (iM43739 > 0) {
                    byte[] bArr = new byte[iM43739];
                    if (c19203.m43703() < iM43739) {
                        throw C10998.m25387((String) null, (Throwable) null);
                    }
                    c19203.m43707(0, iM43739, bArr);
                    arrayList.add(new C5043(sM43701, this.f57059, new C19203(bArr), new C8072(1, this)));
                } else {
                    throw C10998.m25387((String) null, (Throwable) null);
                }
            }
            this.f57061 = 2;
            return 0;
        }
        PriorityQueue priorityQueue = this.f57063;
        if (i != 2) {
            if (i == 3) {
                C5043 c5043 = (C5043) priorityQueue.poll();
                c5043.getClass();
                long jM10753 = c5043.m10753();
                if (jM10753 != -9223372036854775807L) {
                    long j = this.f57058 + 100000;
                    if (j < jM10753) {
                        this.f57058 = j;
                        C19795 c19795 = this.f57057;
                        C23877.m52958(c19795);
                        c19795.mo10502(this.f57058, 0, 0, 0, null);
                    } else {
                        this.f57058 = jM10753;
                        C19795 c19796 = this.f57057;
                        C23877.m52958(c19796);
                        c5043.m10754(c19796, false);
                        c5043.m10755();
                    }
                    i2 = 0;
                }
                priorityQueue.add(c5043);
                return i2;
            }
            throw new IllegalStateException();
        }
        priorityQueue.clear();
        for (C5043 c5044 : arrayList) {
            c5044.m10757();
            c5044.m10755();
        }
        priorityQueue.addAll(arrayList);
        long j2 = this.f57062;
        while (!priorityQueue.isEmpty()) {
            C5043 c5045 = (C5043) priorityQueue.poll();
            c5045.getClass();
            long jM10754 = c5045.m10753();
            if (jM10754 != -9223372036854775807L && jM10754 < j2) {
                C19795 c19797 = this.f57057;
                C23877.m52958(c19797);
                c5045.m10754(c19797, true);
                c5045.m10755();
                priorityQueue.add(c5045);
            }
        }
        priorityQueue.addAll(arrayList);
        this.f57058 = this.f57062;
        C5043 c5046 = (C5043) priorityQueue.peek();
        c5046.getClass();
        if (c5046.m10753() > this.f57058) {
            C19795 c19798 = this.f57057;
            C23877.m52958(c19798);
            c19798.mo10502(this.f57058, 0, 0, 0, null);
        }
        this.f57061 = 3;
        return 0;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
        this.f57064.clear();
        this.f57063.clear();
        byte[] bArr = C5792.f14227;
        C19203 c19203 = this.f57060;
        c19203.getClass();
        c19203.m43708(bArr.length, bArr);
        this.f57061 = 4;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        int i = this.f57061;
        if (i == 2 || i == 3) {
            C10731 c10731 = new C10731(j, 14L);
            return new C8719(c10731, c10731);
        }
        C10731 c10732 = C10731.f29727;
        return new C8719(c10732, c10732);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43466(C19124 c19124, int i, long j) {
        Iterator it = c19124.f57064.iterator();
        while (it.hasNext()) {
            ((C5043) it.next()).m10756(i, j);
        }
    }
}
