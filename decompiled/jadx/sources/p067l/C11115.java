package p067l;

import java.util.BitSet;
import java.util.HashSet;

/* JADX INFO: renamed from: l.ۡ᩻֡, reason: contains not printable characters */
/* JADX INFO: compiled from: KATI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11115 {

    /* JADX INFO: renamed from: ֫ */
    public final C22926 f30830;

    public C11115(C22926 c22926) {
        this.f30830 = c22926;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25636(AbstractC24266 abstractC24266, AbstractC18017 abstractC18017, C25117 c25117, HashSet hashSet, BitSet bitSet) {
        C25117 c25117M55122;
        C10642 c10642;
        C22926 c22926 = this.f30830;
        int i = c22926.f72151;
        if (hashSet.add(new C23596(abstractC24266, 0, abstractC18017))) {
            if (abstractC24266 == null) {
                if (abstractC18017 == null) {
                    c25117.m55125(-2);
                    return;
                } else if (abstractC18017.mo30021()) {
                    c25117.m55125(-1);
                    return;
                }
            }
            if (abstractC24266 instanceof C11313) {
                if (abstractC18017 == null) {
                    c25117.m55125(-2);
                    return;
                }
                if (abstractC18017.mo30021()) {
                    c25117.m55125(-1);
                    return;
                }
                if (abstractC18017 != C22515.f71002) {
                    boolean z = bitSet.get(abstractC24266.f76896);
                    try {
                        bitSet.clear(abstractC24266.f76896);
                        for (int i2 = 0; i2 < abstractC18017.mo23283(); i2++) {
                            m25636((AbstractC24266) c22926.f72152.get(abstractC18017.mo23282(i2)), abstractC18017.mo23281(i2), c25117, hashSet, bitSet);
                        }
                        if (z) {
                            bitSet.set(abstractC24266.f76896);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            bitSet.set(abstractC24266.f76896);
                        }
                        throw th;
                    }
                }
            }
            int size = abstractC24266.f76893.size();
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC14664 abstractC14664M53604 = abstractC24266.m53604(i3);
                if (abstractC14664M53604.getClass() == C10642.class) {
                    C10642 c10643 = (C10642) abstractC14664M53604;
                    if (!bitSet.get(c10643.f41850.f76896)) {
                        C9971 c9971M23280 = C9971.m23280(abstractC18017, c10643.f29431.f76895);
                        try {
                            bitSet.set(((C10642) abstractC14664M53604).f41850.f76896);
                            c10642 = c10643;
                            try {
                                m25636(abstractC14664M53604.f41850, c9971M23280, c25117, hashSet, bitSet);
                                bitSet.clear(c10642.f41850.f76896);
                            } catch (Throwable th2) {
                                th = th2;
                                bitSet.clear(c10642.f41850.f76896);
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c10642 = c10643;
                        }
                    }
                } else {
                    if ((abstractC14664M53604 instanceof AbstractC9514) || abstractC14664M53604.mo7776()) {
                        m25636(abstractC14664M53604.f41850, abstractC18017, c25117, hashSet, bitSet);
                    } else if (abstractC14664M53604.getClass() == C13994.class) {
                        C25117 c25118 = new C25117(new int[0]);
                        c25118.m55126(1, i);
                        c25117.m55127(c25118);
                    } else {
                        C25117 c25117Mo5684 = abstractC14664M53604.mo5684();
                        if (c25117Mo5684 != null) {
                            if (abstractC14664M53604 instanceof C14467) {
                                C25117 c25119 = new C25117(new int[0]);
                                c25119.m55126(1, i);
                                if (c25119.m55128()) {
                                    c25117M55122 = null;
                                } else if (c25117Mo5684.m55128()) {
                                    c25117Mo5684 = new C25117(c25119);
                                } else {
                                    c25117M55122 = C25117.m55122(c25119, c25117Mo5684);
                                }
                                c25117Mo5684 = c25117M55122;
                            }
                            c25117.m55127(c25117Mo5684);
                        }
                    }
                }
            }
        }
    }
}
