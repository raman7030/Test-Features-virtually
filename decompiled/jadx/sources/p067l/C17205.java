package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: l.ܺ֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09UO */
/* JADX INFO: loaded from: classes4.dex */
public final class C17205 implements InterfaceC13400 {

    /* JADX INFO: renamed from: ܿ */
    public static final InterfaceC4410 f51213 = C13128.m30022(C17205.class);

    /* JADX INFO: renamed from: ֫ */
    public final LinkedList f51214 = new LinkedList();

    /* JADX INFO: renamed from: ܽ */
    public final LinkedList f51216 = new LinkedList();

    /* JADX INFO: renamed from: ᩳ */
    public final ConcurrentLinkedQueue f51217 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ۧ */
    public final ConcurrentMapC12768 f51215 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public final C21901 m38961(InterfaceC20106 interfaceC20106, C2433 c2433, int i, boolean z, boolean z2) {
        C21901 c21901M38958;
        interfaceC20106.mo29602().getClass();
        interfaceC20106.mo29602().getClass();
        int i2 = i <= 0 ? 445 : i;
        synchronized (this.f51214) {
            try {
                m38959();
                InterfaceC4410 interfaceC4410 = f51213;
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9196("Exclusive " + z + " enforced signing " + z2);
                }
                if (!z && ((C15410) interfaceC20106.mo29602()).m35099() != 1 && (c21901M38958 = m38958(interfaceC20106, c2433, i2, null, z2, false)) != null) {
                    return c21901M38958;
                }
                C21901 c21901 = new C21901(interfaceC20106, c2433, i2, z2);
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("New transport connection " + c21901);
                }
                if (z) {
                    this.f51216.add(c21901);
                } else {
                    this.f51214.add(0, c21901);
                }
                return c21901;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C21901 m38958(InterfaceC20106 interfaceC20106, InterfaceC6024 interfaceC6024, int i, String str, boolean z, boolean z2) {
        InterfaceC4410 interfaceC4410 = f51213;
        for (C21901 c21901 : this.f51214) {
            if (c21901.m49429(interfaceC6024, i, str) && (((C15410) interfaceC20106.mo29602()).m35099() == 0 || c21901.m49442() < ((C15410) interfaceC20106.mo29602()).m35099())) {
                try {
                    if (!c21901.mo21115() && (!z2 || !c21901.mo21123())) {
                        if (z && !c21901.m49434()) {
                            if (interfaceC4410.mo9194()) {
                                interfaceC4410.mo9183("Cannot reuse, signing enforced but connection does not have it enabled " + c21901);
                            }
                        } else {
                            if (!z) {
                                interfaceC20106.mo29602().getClass();
                                if (c21901.m49434() && !c21901.m49441().mo12563()) {
                                    if (interfaceC4410.mo9194()) {
                                        interfaceC4410.mo9183("Cannot reuse, signing enforced on connection " + c21901);
                                    }
                                }
                            }
                            if (!c21901.m49441().mo12561(interfaceC20106)) {
                                if (interfaceC4410.mo9194()) {
                                    interfaceC4410.mo9196("Cannot reuse, different config " + c21901);
                                }
                            } else {
                                if (interfaceC4410.mo9194()) {
                                    interfaceC4410.mo9196("Reusing transport connection " + c21901);
                                }
                                c21901.m21107();
                                return c21901;
                            }
                        }
                    }
                } catch (C20777 e) {
                    interfaceC4410.mo9176("Error while checking for reuse", (Exception) e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11172 m38960(InterfaceC20106 interfaceC20106, String str, int i, boolean z, boolean z2) throws IOException {
        C2433[] c2433ArrM25703 = ((RunnableC11152) interfaceC20106.mo29601()).m25703(str, true);
        if (c2433ArrM25703.length == 0) {
            throw new UnknownHostException(str);
        }
        Arrays.sort(c2433ArrM25703, new C10501(this));
        synchronized (this.f51214) {
            for (C2433 c2433 : c2433ArrM25703) {
                interfaceC20106.mo29602().getClass();
                interfaceC20106.mo29602().getClass();
                C21901 c21901M38958 = m38958(interfaceC20106, c2433, i, str, z2, true);
                if (c21901M38958 != null) {
                    return c21901M38958;
                }
            }
            IOException e = null;
            for (C2433 c2434 : c2433ArrM25703) {
                InterfaceC4410 interfaceC4410 = f51213;
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9195(c2434, "Trying address {}");
                }
                try {
                    C21901 c21901M38961 = m38961(interfaceC20106, c2434, i, z, z2);
                    c21901M38961.m49425(C21901.class);
                    try {
                        try {
                            c21901M38961.m49438();
                            c21901M38961.m21107();
                            c21901M38961.m21114();
                            return c21901M38961;
                        } catch (IOException e2) {
                            m38962(c21901M38961);
                            throw e2;
                        }
                    } catch (Throwable th) {
                        try {
                            c21901M38961.m21114();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    String strMo3408 = c2434.mo3408();
                    Integer num = (Integer) this.f51215.get(strMo3408);
                    if (num == null) {
                        this.f51215.put(strMo3408, 1);
                    } else {
                        this.f51215.put(strMo3408, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            if (e != null) {
                throw e;
            }
            throw new C3992("All connection attempts failed");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38962(InterfaceC11172 interfaceC11172) {
        InterfaceC4410 interfaceC4410 = f51213;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Scheduling transport connection for removal " + interfaceC11172 + " (" + System.identityHashCode(interfaceC11172) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f51217.add((C21901) interfaceC11172);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m38959() {
        synchronized (this.f51214) {
            while (true) {
                C21901 c21901 = (C21901) this.f51217.poll();
                if (c21901 != null) {
                    InterfaceC4410 interfaceC4410 = f51213;
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Removing transport connection " + c21901 + " (" + System.identityHashCode(c21901) + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    this.f51214.remove(c21901);
                    this.f51216.remove(c21901);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m38963() {
        LinkedList linkedList;
        synchronized (this.f51214) {
            m38959();
            f51213.mo9183("Closing pool");
            linkedList = new LinkedList(this.f51214);
            linkedList.addAll(this.f51216);
            this.f51214.clear();
            this.f51216.clear();
        }
        Iterator it = linkedList.iterator();
        boolean zM21112 = false;
        while (it.hasNext()) {
            try {
                zM21112 |= ((C21901) it.next()).m21112(false, false);
            } catch (IOException e) {
                f51213.mo9178("Failed to close connection", (Throwable) e);
            }
        }
        synchronized (this.f51214) {
            m38959();
        }
        return zM21112;
    }
}
