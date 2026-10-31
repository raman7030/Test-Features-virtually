package l;

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
public final class C15611 implements InterfaceC11607 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f48074 = C11321.m27961(C15611.class);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final LinkedList f48075 = new LinkedList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final LinkedList f48077 = new LinkedList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ConcurrentLinkedQueue f48078 = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC10942 f48076 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20552 m36795(InterfaceC18663 interfaceC18663, C0068 c0068, int i, boolean z, boolean z2) {
        C20552 c20552M36792;
        interfaceC18663.mo27540().getClass();
        interfaceC18663.mo27540().getClass();
        int i2 = i <= 0 ? 445 : i;
        synchronized (this.f48075) {
            try {
                m36793();
                InterfaceC2148 interfaceC2148 = f48074;
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101("Exclusive " + z + " enforced signing " + z2);
                }
                if (!z && ((C13722) interfaceC18663.mo27540()).m32985() != 1 && (c20552M36792 = m36792(interfaceC18663, c0068, i2, null, z2, false)) != null) {
                    return c20552M36792;
                }
                C20552 c20552 = new C20552(interfaceC18663, c0068, i2, z2);
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("New transport connection " + c20552);
                }
                if (z) {
                    this.f48077.add(c20552);
                } else {
                    this.f48075.add(0, c20552);
                }
                return c20552;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C20552 m36792(InterfaceC18663 interfaceC18663, InterfaceC3846 interfaceC3846, int i, String str, boolean z, boolean z2) {
        InterfaceC2148 interfaceC2148 = f48074;
        for (C20552 c20552 : this.f48075) {
            if (c20552.m47105(interfaceC3846, i, str) && (((C13722) interfaceC18663.mo27540()).m32985() == 0 || c20552.m47118() < ((C13722) interfaceC18663.mo27540()).m32985())) {
                try {
                    if (!c20552.mo19172() && (!z2 || !c20552.mo19180())) {
                        if (z && !c20552.m47110()) {
                            if (interfaceC2148.mo7099()) {
                                interfaceC2148.mo7088("Cannot reuse, signing enforced but connection does not have it enabled " + c20552);
                            }
                        } else {
                            if (!z) {
                                interfaceC18663.mo27540().getClass();
                                if (c20552.m47110() && !c20552.m47117().mo10539()) {
                                    if (interfaceC2148.mo7099()) {
                                        interfaceC2148.mo7088("Cannot reuse, signing enforced on connection " + c20552);
                                    }
                                }
                            }
                            if (!c20552.m47117().mo10537(interfaceC18663)) {
                                if (interfaceC2148.mo7099()) {
                                    interfaceC2148.mo7101("Cannot reuse, different config " + c20552);
                                }
                            } else {
                                if (interfaceC2148.mo7099()) {
                                    interfaceC2148.mo7101("Reusing transport connection " + c20552);
                                }
                                c20552.m19164();
                                return c20552;
                            }
                        }
                    }
                } catch (C19369 e) {
                    interfaceC2148.mo7081("Error while checking for reuse", (Exception) e);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9263 m36794(InterfaceC18663 interfaceC18663, String str, int i, boolean z, boolean z2) throws IOException {
        C0068[] c0068ArrM23703 = ((RunnableC9242) interfaceC18663.mo27539()).m23703(str, true);
        if (c0068ArrM23703.length == 0) {
            throw new UnknownHostException(str);
        }
        Arrays.sort(c0068ArrM23703, new C8557(this));
        synchronized (this.f48075) {
            for (C0068 c0068 : c0068ArrM23703) {
                interfaceC18663.mo27540().getClass();
                interfaceC18663.mo27540().getClass();
                C20552 c20552M36792 = m36792(interfaceC18663, c0068, i, str, z2, true);
                if (c20552M36792 != null) {
                    return c20552M36792;
                }
            }
            IOException e = null;
            for (C0068 c0069 : c0068ArrM23703) {
                InterfaceC2148 interfaceC2148 = f48074;
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7100(c0069, "Trying address {}");
                }
                try {
                    C20552 c20552M36795 = m36795(interfaceC18663, c0069, i, z, z2);
                    c20552M36795.m47101(C20552.class);
                    try {
                        try {
                            c20552M36795.m47114();
                            c20552M36795.m19164();
                            c20552M36795.m19171();
                            return c20552M36795;
                        } catch (IOException e2) {
                            m36796(c20552M36795);
                            throw e2;
                        }
                    } catch (Throwable th) {
                        try {
                            c20552M36795.m19171();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                    String strMo1012 = c0069.mo1012();
                    Integer num = (Integer) this.f48076.get(strMo1012);
                    if (num == null) {
                        this.f48076.put(strMo1012, 1);
                    } else {
                        this.f48076.put(strMo1012, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            if (e != null) {
                throw e;
            }
            throw new C1708("All connection attempts failed");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36796(InterfaceC9263 interfaceC9263) {
        InterfaceC2148 interfaceC2148 = f48074;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Scheduling transport connection for removal " + interfaceC9263 + " (" + System.identityHashCode(interfaceC9263) + MotionUtils.EASING_TYPE_FORMAT_END);
        }
        this.f48078.add((C20552) interfaceC9263);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36793() {
        synchronized (this.f48075) {
            while (true) {
                C20552 c20552 = (C20552) this.f48078.poll();
                if (c20552 != null) {
                    InterfaceC2148 interfaceC2148 = f48074;
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Removing transport connection " + c20552 + " (" + System.identityHashCode(c20552) + MotionUtils.EASING_TYPE_FORMAT_END);
                    }
                    this.f48075.remove(c20552);
                    this.f48077.remove(c20552);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m36797() {
        LinkedList linkedList;
        synchronized (this.f48075) {
            m36793();
            f48074.mo7088("Closing pool");
            linkedList = new LinkedList(this.f48075);
            linkedList.addAll(this.f48077);
            this.f48075.clear();
            this.f48077.clear();
        }
        Iterator it = linkedList.iterator();
        boolean zM19169 = false;
        while (it.hasNext()) {
            try {
                zM19169 |= ((C20552) it.next()).m19169(false, false);
            } catch (IOException e) {
                f48074.mo7083("Failed to close connection", (Throwable) e);
            }
        }
        synchronized (this.f48075) {
            m36793();
        }
        return zM19169;
    }
}
