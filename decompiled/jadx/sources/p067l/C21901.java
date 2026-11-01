package p067l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.bouncycastle.crypto.hpke.HPKE;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;

/* JADX INFO: renamed from: l.᩷֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: YA21 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21901 extends AbstractRunnableC9160 implements InterfaceC11172 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public static InterfaceC4410 f68890 = C13128.m30022(C21901.class);

    /* JADX INFO: renamed from: ֫֫ */
    public InputStream f68891;

    /* JADX INFO: renamed from: ۘ֫ */
    public final InterfaceC20106 f68893;

    /* JADX INFO: renamed from: ۜ֫ */
    public long f68894;

    /* JADX INFO: renamed from: ۟ */
    public InterfaceC18587 f68895;

    /* JADX INFO: renamed from: ۢ֫ */
    public final boolean f68897;

    /* JADX INFO: renamed from: ܺ֫ */
    public Socket f68901;

    /* JADX INFO: renamed from: ܽ֫ */
    public InterfaceC21941 f68902;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f68903;

    /* JADX INFO: renamed from: ᩳ֫ */
    public OutputStream f68904;

    /* JADX INFO: renamed from: ᩺ */
    public InterfaceC6024 f68906;

    /* JADX INFO: renamed from: ۡ֫ */
    public boolean f68896 = false;

    /* JADX INFO: renamed from: ۧ֫ */
    public final AtomicLong f68898 = new AtomicLong();

    /* JADX INFO: renamed from: ᩻֫ */
    public final byte[] f68907 = new byte[1024];

    /* JADX INFO: renamed from: ᩷֫ */
    public final LinkedList f68905 = new LinkedList();

    /* JADX INFO: renamed from: ۖ֫ */
    public String f68892 = null;

    /* JADX INFO: renamed from: ܰ */
    public final Semaphore f68899 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ܳ֫ */
    public byte[] f68900 = new byte[64];

    /* JADX INFO: renamed from: ֫ */
    public final synchronized C24582 m49426(InterfaceC20106 interfaceC20106, String str, String str2) {
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("Currently " + this.f68905.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator listIterator = this.f68905.listIterator();
        while (listIterator.hasNext()) {
            C24582 c24582 = (C24582) listIterator.next();
            if (c24582.m54198(interfaceC20106, str, str2)) {
                InterfaceC4410 interfaceC4411 = f68890;
                if (interfaceC4411.mo9194()) {
                    interfaceC4411.mo9196("Reusing existing session " + c24582);
                }
                c24582.m54197();
                return c24582;
            }
            InterfaceC4410 interfaceC4412 = f68890;
            if (interfaceC4412.mo9194()) {
                interfaceC4412.mo9196("Existing session " + c24582 + " does not match " + interfaceC20106.mo8528());
            }
        }
        if (((C15410) interfaceC20106.mo29602()).m35090() > 0) {
            long j = this.f68894;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j < jCurrentTimeMillis) {
                this.f68894 = ((long) ((C15410) interfaceC20106.mo29602()).m35090()) + jCurrentTimeMillis;
                ListIterator listIterator2 = this.f68905.listIterator();
                while (listIterator2.hasNext()) {
                    C24582 c24583 = (C24582) listIterator2.next();
                    if (c24583.m54211() != null && c24583.m54211().longValue() < jCurrentTimeMillis && !c24583.m54192()) {
                        InterfaceC4410 interfaceC4413 = f68890;
                        if (interfaceC4413.mo9181()) {
                            interfaceC4413.mo9183("Closing session after timeout " + c24583);
                        }
                        c24583.m54199(false, false);
                    }
                }
            }
        }
        C24582 c24584 = new C24582(interfaceC20106, str, str2, this);
        InterfaceC4410 interfaceC4414 = f68890;
        if (interfaceC4414.mo9181()) {
            interfaceC4414.mo9183("Establishing new session " + c24584 + " on " + this.f24819);
        }
        this.f68905.add(c24584);
        return c24584;
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo21118(boolean z, boolean z2) {
        boolean zM54199;
        InterfaceC20106 interfaceC20106;
        ListIterator listIterator = this.f68905.listIterator();
        long jM21119 = m21119();
        if ((!z2 || jM21119 == 1) && (z2 || jM21119 <= 0)) {
            zM54199 = false;
        } else {
            f68890.mo9199("Disconnecting transport while still in use " + this + ": " + this.f68905);
            zM54199 = true;
        }
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Disconnecting transport " + this);
        }
        try {
            try {
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9196("Currently " + this.f68905.size() + " session(s) active for " + this);
                }
                while (listIterator.hasNext()) {
                    try {
                        try {
                            zM54199 |= ((C24582) listIterator.next()).m54199(z, false);
                        } catch (Throwable th) {
                            listIterator.remove();
                            throw th;
                        }
                    } catch (Exception e) {
                        f68890.mo9176("Failed to close session", e);
                    }
                    listIterator.remove();
                }
                Socket socket = this.f68901;
                if (socket != null) {
                    socket.shutdownOutput();
                    this.f68904.close();
                    this.f68891.close();
                    this.f68901.close();
                    f68890.mo9196("Socket closed");
                } else {
                    f68890.mo9196("Not yet initialized");
                }
                this.f68901 = null;
                this.f68895 = null;
                this.f68892 = null;
                interfaceC20106 = this.f68893;
            } catch (Exception e2) {
                f68890.mo9176("Exception in disconnect", e2);
                this.f68901 = null;
                this.f68895 = null;
                this.f68892 = null;
                interfaceC20106 = this.f68893;
            }
            ((C17205) interfaceC20106.mo29600()).m38962(this);
        } catch (Throwable th2) {
            this.f68901 = null;
            this.f68895 = null;
            this.f68892 = null;
            ((C17205) this.f68893.mo29600()).m38962(this);
            throw th2;
        }
        return zM54199;
    }

    public C21901(InterfaceC20106 interfaceC20106, InterfaceC6024 interfaceC6024, int i, boolean z) {
        boolean z2 = false;
        this.f68893 = interfaceC20106;
        if (z) {
            z2 = true;
        } else {
            interfaceC20106.mo29602().getClass();
        }
        this.f68897 = z2;
        this.f68894 = System.currentTimeMillis() + ((long) ((C15410) interfaceC20106.mo29602()).m35090());
        this.f68906 = interfaceC6024;
        this.f68903 = i;
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ۧ */
    public final int mo21116(InterfaceC9571 interfaceC9571) {
        if (interfaceC9571 != null) {
            interfaceC9571.getClass();
        }
        return ((C15410) this.f68893.mo29602()).m35129();
    }

    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC6024 m49433() {
        return this.f68906;
    }

    /* JADX INFO: renamed from: ۗ */
    public final String m49432() {
        return this.f68892;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final int m49442() {
        return this.f68905.size();
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo21123() {
        Socket socket = this.f68901;
        return super.mo21123() || socket == null || socket.isClosed();
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo21115() {
        Socket socket = this.f68901;
        return super.mo21115() || socket == null || socket.isClosed();
    }

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC21941 m49441() throws C5255 {
        try {
            if (this.f68902 == null) {
                m21117(((C15410) this.f68893.mo29602()).m35129());
            }
            InterfaceC21941 interfaceC21941 = this.f68902;
            if (interfaceC21941 != null) {
                return interfaceC21941;
            }
            throw new C5255("Connection did not complete, failed to get negotiation response");
        } catch (IOException e) {
            throw new C5255(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public final boolean m49436() {
        return this.f68896 || (m49441() instanceof C5648);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49428(InterfaceC18587 interfaceC18587) {
        this.f68895 = interfaceC18587;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final InterfaceC18587 m49439() {
        return this.f68895;
    }

    public final InterfaceC20106 getContext() {
        return this.f68893;
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ֫ */
    public final void mo21109(InterfaceC9571 interfaceC9571) {
        InterfaceC4410 interfaceC4410;
        byte[] bArrM27089 = this.f68893.mo29604().m27089();
        try {
            synchronized (this.f24817) {
                int iMo12469 = interfaceC9571.mo12469(4, bArrM27089);
                C5137.m10969(65535 & iMo12469, 0, bArrM27089);
                if (f68890.mo9194()) {
                    do {
                        interfaceC4410 = f68890;
                        interfaceC4410.mo9196(interfaceC9571.toString());
                        if (!(interfaceC9571 instanceof AbstractC11883)) {
                            break;
                        } else {
                            interfaceC9571 = ((AbstractC11883) interfaceC9571).m27203();
                        }
                    } while (interfaceC9571 != null);
                    interfaceC4410.mo9196(C13854.m31530(bArrM27089, 4, iMo12469));
                }
                this.f68904.write(bArrM27089, 0, iMo12469 + 4);
                this.f68904.flush();
            }
            this.f68893.mo29604().m27088(bArrM27089);
        } catch (Throwable th) {
            this.f68893.mo29604().m27088(bArrM27089);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩺ */
    public final boolean m49443() throws C5255 {
        if (this.f68897) {
            return false;
        }
        InterfaceC21941 interfaceC21941M49441 = m49441();
        return interfaceC21941M49441.mo12574() && !interfaceC21941M49441.mo12563();
    }

    /* JADX INFO: renamed from: ۤ */
    public final boolean m49434() {
        if (this.f68897) {
            return true;
        }
        return m49441().mo12563();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11172 m49425(Class cls) {
        if (cls.isAssignableFrom(C21901.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m49429(InterfaceC6024 interfaceC6024, int i, String str) {
        int i2;
        if (this.f24812 == 5 || this.f24812 == 6) {
            return false;
        }
        if (str == null) {
            str = interfaceC6024.mo3411();
        }
        String str2 = this.f68892;
        if ((str2 != null && !str.equalsIgnoreCase(str2)) || !interfaceC6024.equals(this.f68906)) {
            return false;
        }
        if (i == 0 || i == (i2 = this.f68903)) {
            return true;
        }
        return i == 445 && i2 == 139;
    }

    /* JADX INFO: renamed from: ܰ */
    public final void m49437() throws IOException {
        String strMo3409;
        InterfaceC20106 interfaceC20106 = this.f68893;
        InterfaceC3341 interfaceC3341Mo29602 = interfaceC20106.mo29602();
        InterfaceC6024 interfaceC6024 = this.f68906;
        C17856 c17856 = new C17856(interfaceC3341Mo29602, interfaceC6024.mo3412(), 32, null);
        do {
            Socket socket = new Socket();
            this.f68901 = socket;
            socket.connect(new InetSocketAddress(interfaceC6024.mo3408(), 139), ((C15410) interfaceC20106.mo29602()).m35118());
            this.f68901.setSoTimeout(((C15410) interfaceC20106.mo29602()).m35107());
            this.f68904 = this.f68901.getOutputStream();
            this.f68891 = this.f68901.getInputStream();
            C20540 c20540 = new C20540(interfaceC20106.mo29602(), c17856, ((RunnableC11152) interfaceC20106.mo29601()).m25696());
            OutputStream outputStream = this.f68904;
            byte[] bArr = this.f68907;
            outputStream.write(bArr, 0, c20540.m46363(bArr));
            int iM21101 = AbstractRunnableC9160.m21101(this.f68891, bArr, 0, 4);
            InterfaceC4410 interfaceC4410 = f68890;
            if (iM21101 < 4) {
                try {
                    this.f68901.close();
                } catch (IOException e) {
                    interfaceC4410.mo9176("Failed to close socket", (Exception) e);
                }
                throw new C5255("EOF during NetBIOS session request");
            }
            int i = bArr[0] & 255;
            if (i == -1) {
                m21121();
                throw new C4446(-1);
            }
            if (i == 130) {
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("session established ok with " + interfaceC6024);
                    return;
                }
                return;
            }
            if (i == 131) {
                int i2 = this.f68891.read() & 255;
                if (i2 == 128 || i2 == 130) {
                    this.f68901.close();
                    strMo3409 = interfaceC6024.mo3409(interfaceC20106);
                    c17856.f53292 = strMo3409;
                } else {
                    m21121();
                    throw new C4446(i2);
                }
            } else {
                m21121();
                throw new C4446(0);
            }
        } while (strMo3409 != null);
        throw new IOException("Failed to establish session with " + interfaceC6024);
    }

    /* JADX INFO: renamed from: ֫ */
    private C24622 m49414(int i) {
        synchronized (this.f24818) {
            try {
                if (i == 139) {
                    m49437();
                } else {
                    if (i == 0) {
                        i = 445;
                    }
                    Socket socket = new Socket();
                    this.f68901 = socket;
                    socket.connect(new InetSocketAddress(this.f68906.mo3408(), i), ((C15410) this.f68893.mo29602()).m35118());
                    this.f68901.setSoTimeout(((C15410) this.f68893.mo29602()).m35107());
                    this.f68904 = this.f68901.getOutputStream();
                    this.f68891 = this.f68901.getInputStream();
                }
                if (this.f68899.drainPermits() == 0) {
                    f68890.mo9183("It appears we previously lost some credits");
                }
                if (this.f68896) {
                    f68890.mo9183("Using SMB2 only negotiation");
                    return m49418((C5648) null);
                }
                this.f68893.mo29602().getClass();
                C11251 c11251 = new C11251(this.f68893.mo29602(), this.f68897);
                int iM49413 = m49413((InterfaceC9571) c11251, true);
                m49417();
                if (this.f68896) {
                    C5648 c5648 = new C5648(this.f68893.mo29602());
                    c5648.m12470(this.f68907, 4, false);
                    c5648.mo30272();
                    if (c5648.m12565() == 767) {
                        return m49418(c5648);
                    }
                    if (c5648.m12565() != 514) {
                        throw new C20777("Server returned invalid dialect verison in multi protocol negotiation");
                    }
                    int iM12501 = c5648.m12501();
                    if (iM12501 > 0) {
                        this.f68899.release(iM12501);
                    }
                    Arrays.fill(this.f68907, (byte) 0);
                    return new C24622(new C6989(this.f68893.mo29602(), this.f68897 ? 2 : 1), c5648, null, null);
                }
                if (((C15410) this.f68893.mo29602()).m35095().m50997()) {
                    throw new C20777("Server does not support SMB2");
                }
                C10580 c10580 = new C10580(this.f68893);
                c10580.decode(this.f68907);
                c10580.mo30272();
                InterfaceC4410 interfaceC4410 = f68890;
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9196(c10580.toString());
                    interfaceC4410.mo9196(C13854.m31530(this.f68907, 4, iM49413));
                }
                int iM24376 = c10580.m24376();
                if (iM24376 > 0) {
                    this.f68899.release(iM24376);
                }
                Arrays.fill(this.f68907, (byte) 0);
                return new C24622(c11251, c10580, null, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m49413(InterfaceC9571 interfaceC9571, boolean z) throws IOException {
        if (z) {
            mo21120(interfaceC9571);
        } else {
            interfaceC9571.mo12473(0L);
            this.f68898.set(1L);
        }
        byte[] bArr = this.f68907;
        int iMo12469 = interfaceC9571.mo12469(4, bArr);
        C5137.m10969(65535 & iMo12469, 0, bArr);
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196(interfaceC9571.toString());
            interfaceC4410.mo9196(C13854.m31530(bArr, 4, iMo12469));
        }
        this.f68904.write(bArr, 0, iMo12469 + 4);
        this.f68904.flush();
        interfaceC4410.mo9196("Wrote negotiate request");
        return iMo12469;
    }

    /* JADX INFO: renamed from: ۟ */
    private void m49417() throws IOException {
        InterfaceC20106 interfaceC20106 = this.f68893;
        try {
            this.f68901.setSoTimeout(((C15410) interfaceC20106.mo29602()).m35118());
            if (mo21113() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.f68901.setSoTimeout(((C15410) interfaceC20106.mo29602()).m35107());
            byte[] bArr = this.f68907;
            int iM10968 = C5137.m10968(2, bArr) & HPKE.aead_EXPORT_ONLY;
            if (iM10968 < 33 || iM10968 + 4 > bArr.length) {
                throw new IOException(C20778.m46922(iM10968, "Invalid payload size: "));
            }
            int i = this.f68896 ? 64 : 32;
            AbstractRunnableC9160.m21101(this.f68891, bArr, i + 4, iM10968 - i);
            f68890.mo9196("Read negotiate response");
        } catch (Throwable th) {
            this.f68901.setSoTimeout(((C15410) interfaceC20106.mo29602()).m35107());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C24622 m49418(C5648 c5648) throws Throwable {
        Throwable th;
        byte[] bArr;
        Semaphore semaphore = this.f68899;
        byte[] bArr2 = this.f68907;
        int iM49423 = m49423(c5648);
        InterfaceC20106 interfaceC20106 = this.f68893;
        C6989 c6989 = new C6989(interfaceC20106.mo29602(), iM49423);
        C5648 c5649 = null;
        byte[] bArr3 = null;
        try {
            c6989.m12481(Math.max(1, 512 - semaphore.availablePermits()));
            int iM49413 = m49413(c6989, c5648 != null);
            boolean zM50996 = ((C15410) interfaceC20106.mo29602()).m35086().m50996(EnumC22788.SMB311);
            if (zM50996) {
                bArr = new byte[iM49413];
                System.arraycopy(bArr2, 4, bArr, 0, iM49413);
            } else {
                bArr = null;
            }
            m49417();
            C5648 c56410 = (C5648) c6989.mo7659(interfaceC20106);
            try {
                int iM12470 = c56410.m12470(bArr2, 4, false);
                c56410.mo30272();
                if (zM50996) {
                    bArr3 = new byte[iM12470];
                    System.arraycopy(bArr2, 4, bArr3, 0, iM12470);
                } else {
                    bArr = null;
                }
                InterfaceC4410 interfaceC4410 = f68890;
                if (interfaceC4410.mo9194()) {
                    interfaceC4410.mo9196(c56410.toString());
                    interfaceC4410.mo9196(C13854.m31530(bArr2, 4, 0));
                }
                C24622 c24622 = new C24622(c6989, c56410, bArr, bArr3);
                int iM12501 = c56410.m12501();
                semaphore.release(iM12501 != 0 ? iM12501 : 1);
                Arrays.fill(bArr2, (byte) 0);
                return c24622;
            } catch (Throwable th2) {
                th = th2;
                c5649 = c56410;
                int iM12502 = c5649 != null ? c5649.m12501() : 0;
                semaphore.release(iM12502 != 0 ? iM12502 : 1);
                Arrays.fill(bArr2, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ᩴ */
    public final boolean m49438() {
        try {
            return m21117(((C15410) this.f68893.mo29602()).m35129());
        } catch (C3992 e) {
            throw new C5255("Failed to connect: " + this.f68906, e);
        }
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ᩳ */
    public final void mo21122() throws IOException {
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Connecting in state " + this.f24812 + " addr " + this.f68906.mo3408());
        }
        try {
            C24622 c24622M49414 = m49414(this.f68903);
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Negotiation response on " + this.f24819 + " :" + c24622M49414);
            }
            if (!c24622M49414.m54269().mo12562(this.f68893, c24622M49414.m54268())) {
                throw new C5255("This client is not compatible with the server.");
            }
            boolean zMo12563 = c24622M49414.m54269().mo12563();
            boolean zMo12564 = c24622M49414.m54269().mo12564();
            if (interfaceC4410.mo9181()) {
                StringBuilder sb = new StringBuilder("Signature negotiation enforced ");
                sb.append(this.f68897);
                sb.append(" (server ");
                sb.append(zMo12563);
                sb.append(") enabled false (server ");
                this.f68893.mo29602().getClass();
                sb.append(zMo12564);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                interfaceC4410.mo9183(sb.toString());
            }
            this.f68892 = this.f68906.mo3411();
            this.f68902 = c24622M49414.m54269();
            if (c24622M49414.m54269().mo12576().m50996(EnumC22788.SMB311)) {
                byte[] bArrM54270 = c24622M49414.m54270();
                synchronized (this.f68900) {
                    this.f68900 = m49431(bArrM54270.length, bArrM54270, this.f68900);
                }
                m49420(c24622M49414.m54267());
                if (interfaceC4410.mo9181()) {
                    byte[] bArr = this.f68900;
                    interfaceC4410.mo9183("Preauth hash after negotiate ".concat(C13854.m31530(bArr, 0, bArr.length)));
                }
            }
        } catch (IOException e) {
            this.f68893.mo29602().getClass();
            throw e;
        }
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ܽ */
    public final long mo21120(InterfaceC9571 interfaceC9571) {
        long jIncrementAndGet = this.f68898.incrementAndGet() - 1;
        if (!this.f68896) {
            jIncrementAndGet %= 32000;
        }
        interfaceC9571.mo12473(jIncrementAndGet);
        return jIncrementAndGet;
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ۖ */
    public final Long mo21113() throws IOException {
        byte[] bArr;
        char c;
        do {
            InputStream inputStream = this.f68891;
            bArr = this.f68907;
            c = 4;
            if (AbstractRunnableC9160.m21101(inputStream, bArr, 0, 4) < 4) {
                return null;
            }
        } while (bArr[0] == -123);
        if (AbstractRunnableC9160.m21101(this.f68891, bArr, 4, 32) < 32) {
            return null;
        }
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196("New data read: " + this);
            interfaceC4410.mo9196(C13854.m31530(bArr, 4, 32));
        }
        while (true) {
            byte b = bArr[0];
            if (b == 0 && bArr[c] == -2 && bArr[5] == 83 && bArr[6] == 77 && bArr[7] == 66) {
                this.f68896 = true;
                if (AbstractRunnableC9160.m21101(this.f68891, bArr, 36, 32) < 32) {
                    return null;
                }
                return Long.valueOf((((long) C5137.m10974(28, bArr)) & 4294967295L) | ((((long) C5137.m10974(32, bArr)) & 4294967295L) << 32));
            }
            if (b != 0 || bArr[1] != 0 || bArr[4] != -1 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
                int i = 0;
                while (i < 35) {
                    interfaceC4410.mo9199("Possibly out of phase, trying to resync ".concat(C13854.m31530(bArr, 0, 16)));
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = this.f68891.read();
                if (i3 == -1) {
                    return null;
                }
                bArr[35] = (byte) i3;
                c = 4;
            } else {
                return Long.valueOf(((long) C5137.m10970(34, bArr)) & 65535);
            }
        }
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3835 mo21106(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, Set set) throws IOException {
        InterfaceC9571 interfaceC9571Mo22295;
        int i;
        InterfaceC3835 interfaceC3835Mo7659 = interfaceC3835;
        if (interfaceC9571 instanceof InterfaceC12553) {
            if (interfaceC3835Mo7659 == null) {
                interfaceC3835Mo7659 = ((InterfaceC12553) interfaceC9571).mo7659(this.f68893);
            } else if (m49436()) {
                throw new IOException("Should not provide response argument for SMB2");
            }
        } else if ((interfaceC9571 instanceof AbstractC11883) && (interfaceC3835Mo7659 instanceof AbstractC11883)) {
            AbstractC11883 abstractC11883 = (AbstractC11883) interfaceC9571;
            InterfaceC3835 interfaceC3835M27203 = interfaceC3835Mo7659;
            while (true) {
                AbstractC11883 abstractC11884 = (AbstractC11883) interfaceC3835M27203;
                abstractC11883.mo30248((InterfaceC3835) abstractC11884);
                AbstractC13224 abstractC13224M27203 = abstractC11883.m27203();
                if (abstractC13224M27203 == null) {
                    break;
                }
                interfaceC3835M27203 = abstractC11884.m27203();
                abstractC13224M27203.mo30248((InterfaceC3835) abstractC13224M27203);
                if (!(abstractC13224M27203 instanceof AbstractC11883) || !(interfaceC3835M27203 instanceof AbstractC11883)) {
                    break;
                }
                abstractC11883 = (AbstractC11883) abstractC13224M27203;
            }
        } else {
            interfaceC9571.mo30248(interfaceC3835);
        }
        if (interfaceC3835Mo7659 != null) {
            int iM35123 = ((C15410) this.f68893.mo29602()).m35123();
            InterfaceC9571 interfaceC9572 = interfaceC9571;
            while (true) {
                if (interfaceC9572 == null) {
                    interfaceC3835Mo7659 = interfaceC3835Mo7659;
                    break;
                }
                int i2 = 0;
                int i3 = 0;
                InterfaceC9571 interfaceC9573 = null;
                InterfaceC9571 interfaceC9574 = interfaceC9572;
                while (true) {
                    if (interfaceC9574 != null) {
                        int i4 = i2 + 1;
                        int size = interfaceC9574.size();
                        InterfaceC9571 interfaceC9571Mo22299 = interfaceC9574.mo22299();
                        InterfaceC4410 interfaceC4410 = f68890;
                        if (interfaceC4410.mo9194()) {
                            interfaceC4410.mo9196(String.format("%s costs %d avail %d (%s)", interfaceC9574.getClass().getName(), 1, Integer.valueOf(this.f68899.availablePermits()), this.f24819));
                        }
                        if ((interfaceC9571Mo22299 == null || interfaceC9574.mo22298(interfaceC9571Mo22299)) && (i = i3 + size) < iM35123 && this.f68899.tryAcquire(1)) {
                            i3 = i;
                            interfaceC9573 = interfaceC9574;
                            interfaceC9574 = interfaceC9571Mo22299;
                            i2 = i4;
                            interfaceC3835Mo7659 = interfaceC3835Mo7659;
                        } else {
                            if (interfaceC9573 == null && i3 + size > iM35123) {
                                throw new C5255(String.format("Request size %d exceeds allowable size %d: %s", Integer.valueOf(size), Integer.valueOf(iM35123), interfaceC9574));
                            }
                            if (interfaceC9573 == null) {
                                try {
                                    long jMo21116 = mo21116(interfaceC9574);
                                    if (set.contains(EnumC2572.NO_TIMEOUT)) {
                                        this.f68899.acquire(1);
                                    } else if (!this.f68899.tryAcquire(1, jMo21116, TimeUnit.MILLISECONDS)) {
                                        throw new C5255("Failed to acquire credits in time");
                                    }
                                    synchronized (interfaceC9574) {
                                        interfaceC9571Mo22295 = interfaceC9574.mo22295();
                                        if (interfaceC4410.mo9181() && interfaceC9571Mo22295 != null) {
                                            interfaceC4410.mo9183("Insufficient credits, send only first " + interfaceC9574 + " next is " + interfaceC9571Mo22295);
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while acquiring credits");
                                    interruptedIOException.initCause(e);
                                    throw interruptedIOException;
                                }
                            } else {
                                if (interfaceC4410.mo9181()) {
                                    interfaceC4410.mo9183("Not enough credits, split at " + interfaceC9573);
                                }
                                synchronized (interfaceC9573) {
                                    interfaceC9571Mo22295 = interfaceC9573.mo22295();
                                }
                            }
                            i2 = i4;
                        }
                    } else {
                        interfaceC3835Mo7659 = interfaceC3835Mo7659;
                        interfaceC9571Mo22295 = null;
                    }
                    int iMax = Math.max(1, ((512 - this.f68899.availablePermits()) - i2) + 1);
                    InterfaceC4410 interfaceC4411 = f68890;
                    if (interfaceC4411.mo9194()) {
                        interfaceC4411.mo9196("Request credits " + iMax);
                    }
                    interfaceC9571.mo22296(iMax);
                    try {
                        InterfaceC3835 interfaceC3835Mo7658 = interfaceC9572.mo7658();
                        if (interfaceC4411.mo9194()) {
                            interfaceC4411.mo9196("Sending " + interfaceC9572);
                        }
                        InterfaceC3835 interfaceC3836 = (InterfaceC3835) mo21106(interfaceC9572, interfaceC3835Mo7658, set);
                        if (!m49422(interfaceC9572)) {
                            if (interfaceC4411.mo9181()) {
                                interfaceC4411.mo9183("Breaking on error " + interfaceC3836);
                            }
                            int iMo30266 = 0;
                            while (true) {
                                if (interfaceC9572.mo22297()) {
                                    f68890.mo9196("Async");
                                    break;
                                }
                                InterfaceC3835 interfaceC3835Mo76510 = interfaceC9572.mo7658();
                                if (interfaceC3835Mo76510 == null) {
                                    f68890.mo9199("Response not properly set up for" + interfaceC9572);
                                } else if (interfaceC3835Mo76510.mo30257()) {
                                    iMo30266 = interfaceC3835Mo76510.mo30266() + iMo30266;
                                }
                                InterfaceC9571 interfaceC9571Mo222910 = interfaceC9572.mo22299();
                                if (interfaceC9571Mo222910 == null) {
                                    break;
                                }
                                interfaceC9572 = interfaceC9571Mo222910;
                            }
                            if (!mo21123() && !interfaceC9572.mo22297() && !interfaceC9572.mo7658().mo7518() && !interfaceC9572.mo7658().mo30253() && iMo30266 == 0) {
                                if (this.f68899.availablePermits() > 0 || i2 > 0) {
                                    f68890.mo9183("Server " + this + " returned zero credits for " + interfaceC9572);
                                    break;
                                }
                                f68890.mo9199("Server " + this + " took away all our credits");
                                break;
                            }
                            if (!interfaceC9572.mo22297()) {
                                InterfaceC4410 interfaceC4412 = f68890;
                                if (interfaceC4412.mo9194()) {
                                    interfaceC4412.mo9196("Adding credits " + iMo30266);
                                }
                                this.f68899.release(iMo30266);
                                break;
                            }
                            break;
                        }
                        if (interfaceC9571Mo22295 != null) {
                            interfaceC3836.mo7517(interfaceC9571Mo22295);
                        }
                        int iMo30267 = 0;
                        while (true) {
                            if (interfaceC9572.mo22297()) {
                                f68890.mo9196("Async");
                                break;
                            }
                            InterfaceC3835 interfaceC3835Mo76511 = interfaceC9572.mo7658();
                            if (interfaceC3835Mo76511 == null) {
                                f68890.mo9199("Response not properly set up for" + interfaceC9572);
                            } else if (interfaceC3835Mo76511.mo30257()) {
                                iMo30267 = interfaceC3835Mo76511.mo30266() + iMo30267;
                            }
                            InterfaceC9571 interfaceC9571Mo222911 = interfaceC9572.mo22299();
                            if (interfaceC9571Mo222911 == null) {
                                break;
                            }
                            interfaceC9572 = interfaceC9571Mo222911;
                        }
                        if (!mo21123() && !interfaceC9572.mo22297() && !interfaceC9572.mo7658().mo7518() && !interfaceC9572.mo7658().mo30253() && iMo30267 == 0) {
                            if (this.f68899.availablePermits() > 0 || i2 > 0) {
                                f68890.mo9183("Server " + this + " returned zero credits for " + interfaceC9572);
                            } else {
                                f68890.mo9199("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC9572.mo22297()) {
                            InterfaceC4410 interfaceC4413 = f68890;
                            if (interfaceC4413.mo9194()) {
                                interfaceC4413.mo9196("Adding credits " + iMo30267);
                            }
                            this.f68899.release(iMo30267);
                        }
                        interfaceC9572 = interfaceC9571Mo22295;
                        interfaceC3835Mo7659 = interfaceC3835Mo7659;
                    } catch (Throwable th) {
                        int iMo30268 = 0;
                        while (true) {
                            if (interfaceC9572.mo22297()) {
                                f68890.mo9196("Async");
                                break;
                            }
                            InterfaceC3835 interfaceC3835Mo76512 = interfaceC9572.mo7658();
                            if (interfaceC3835Mo76512 == null) {
                                f68890.mo9199("Response not properly set up for" + interfaceC9572);
                            } else if (interfaceC3835Mo76512.mo30257()) {
                                iMo30268 = interfaceC3835Mo76512.mo30266() + iMo30268;
                            }
                            InterfaceC9571 interfaceC9571Mo222912 = interfaceC9572.mo22299();
                            if (interfaceC9571Mo222912 == null) {
                                break;
                            }
                            interfaceC9572 = interfaceC9571Mo222912;
                        }
                        if (!mo21123() && !interfaceC9572.mo22297() && !interfaceC9572.mo7658().mo7518() && !interfaceC9572.mo7658().mo30253() && iMo30268 == 0) {
                            if (this.f68899.availablePermits() > 0 || i2 > 0) {
                                f68890.mo9183("Server " + this + " returned zero credits for " + interfaceC9572);
                            } else {
                                f68890.mo9199("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC9572.mo22297()) {
                            InterfaceC4410 interfaceC4414 = f68890;
                            if (interfaceC4414.mo9194()) {
                                interfaceC4414.mo9196("Adding credits " + iMo30268);
                            }
                            this.f68899.release(iMo30268);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC3835Mo7659.mo30257()) {
                return interfaceC3835Mo7659;
            }
            throw new IOException("No response", interfaceC3835Mo7659.getException());
        }
        throw new IOException("Invalid response");
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo21111(InterfaceC9571 interfaceC9571, InterfaceC15194 interfaceC15194) {
        if (!this.f68896) {
            return false;
        }
        AbstractC15015 abstractC15015 = (AbstractC15015) interfaceC9571;
        AbstractC14345 abstractC14345 = (AbstractC14345) interfaceC15194;
        synchronized (abstractC14345) {
            if (!abstractC14345.m12490() || abstractC14345.m32943() || abstractC14345.m12485() != 259 || abstractC14345.m12489() == 0) {
                return false;
            }
            abstractC14345.m32945();
            boolean zM12490 = abstractC15015.m12490();
            abstractC15015.m12496(abstractC14345.m12489());
            if (abstractC14345.mo30269() != null) {
                abstractC14345.mo30247(Long.valueOf(System.currentTimeMillis() + ((long) mo21116(interfaceC9571))));
            }
            InterfaceC4410 interfaceC4410 = f68890;
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Have intermediate reply " + interfaceC15194);
            }
            if (!zM12490) {
                int iM12501 = abstractC14345.m12501();
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Credit from intermediate " + iM12501);
                }
                this.f68899.release(iM12501);
            }
            return true;
        }
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ֫ */
    public final void mo21110(InterfaceC15194 interfaceC15194) throws Exception {
        InterfaceC15605 interfaceC15605 = (InterfaceC15605) interfaceC15194;
        this.f68902.mo12560(interfaceC15194);
        try {
            if (this.f68896) {
                m49419(interfaceC15605);
            } else {
                m49416(interfaceC15605);
            }
        } catch (Exception e) {
            f68890.mo9178("Failure decoding message, disconnecting transport", (Throwable) e);
            interfaceC15194.mo30246(e);
            synchronized (interfaceC15194) {
                interfaceC15194.notifyAll();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m49419(InterfaceC15605 interfaceC15605) throws IOException {
        int iM10974;
        byte[] bArr = this.f68907;
        int iM10968 = (C5137.m10968(2, bArr) & HPKE.aead_EXPORT_ONLY) | ((bArr[1] & 255) << 16);
        if (iM10968 < 65) {
            throw new IOException(C20778.m46922(iM10968, "Invalid payload size: "));
        }
        int i = 0;
        if (bArr[0] != 0 || bArr[4] != -2 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
            throw new IOException("Houston we have a synchronization problem");
        }
        int iM10975 = C5137.m10974(24, bArr);
        InterfaceC20106 interfaceC20106 = this.f68893;
        int iM35123 = ((C15410) interfaceC20106.mo29602()).m35123();
        int i2 = iM10975 != 0 ? iM10975 : iM10968;
        if (i2 > iM35123) {
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", Integer.valueOf(i2), Integer.valueOf(iM35123)));
        }
        AbstractC14345 abstractC14345 = (AbstractC14345) interfaceC15605;
        byte[] bArrM27089 = interfaceC20106.mo29604().m27089();
        int i3 = iM10975 != 0 ? iM10975 : iM10968;
        int i4 = 64;
        try {
            System.arraycopy(bArr, 4, bArrM27089, 0, 64);
            AbstractRunnableC9160.m21101(this.f68891, bArrM27089, 64, i3 - 64);
            abstractC14345.m12503(i3);
            int iM12470 = abstractC14345.m12470(bArrM27089, 0, false);
            if (iM12470 > i3) {
                throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i3), Integer.valueOf(iM12470), abstractC14345));
            }
            char c = 1;
            if (iM10975 != 0 && iM12470 > iM10975) {
                throw new IOException("Overlapping commands");
            }
            int i5 = iM10968 - i3;
            int i6 = 2;
            while (true) {
                if (i5 > 0 && iM10975 != 0) {
                    abstractC14345 = (AbstractC14345) abstractC14345.m12505();
                    InterfaceC4410 interfaceC4410 = f68890;
                    if (abstractC14345 != null) {
                        AbstractRunnableC9160.m21101(this.f68891, bArrM27089, i, i4);
                        iM10974 = C5137.m10974(20, bArrM27089);
                        if ((iM10974 != 0 && iM10974 > iM35123) || (iM10974 == 0 && i5 > iM35123)) {
                            break;
                        }
                        int i7 = iM10974 != 0 ? iM10974 : i5;
                        if (interfaceC4410.mo9181()) {
                            Integer numValueOf = Integer.valueOf(iM10974);
                            Integer numValueOf2 = Integer.valueOf(i7);
                            Integer numValueOf3 = Integer.valueOf(i5);
                            Object[] objArr = new Object[3];
                            objArr[0] = numValueOf;
                            objArr[c] = numValueOf2;
                            objArr[2] = numValueOf3;
                            interfaceC4410.mo9183(String.format("Compound next command %d read size %d remain %d", objArr));
                        }
                        abstractC14345.m12503(i7);
                        AbstractRunnableC9160.m21101(this.f68891, bArrM27089, 64, i7 - 64);
                        int iM12471 = abstractC14345.m12470(bArrM27089, 0, true);
                        if (iM12471 > i7) {
                            throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i7), Integer.valueOf(iM12471), abstractC14345));
                        }
                        if (iM10974 != 0 && iM12471 > iM10974) {
                            throw new IOException("Overlapping commands");
                        }
                        i5 -= i7;
                        i6 = 2;
                        i = 0;
                        iM10975 = iM10974;
                        i4 = 64;
                        c = 1;
                    } else {
                        interfaceC4410.mo9199("Response not properly set up");
                        this.f68891.skip(i5);
                    }
                }
                interfaceC20106.mo29604().m27088(bArrM27089);
                return;
            }
            if (iM10974 != 0) {
                i5 = iM10974;
            }
            Integer numValueOf4 = Integer.valueOf(i5);
            Integer numValueOf5 = Integer.valueOf(iM35123);
            Object[] objArr2 = new Object[i6];
            objArr2[i] = numValueOf4;
            objArr2[c] = numValueOf5;
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", objArr2));
        } catch (Throwable th) {
            interfaceC20106.mo29604().m27088(bArrM27089);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49416(InterfaceC15605 interfaceC15605) {
        InterfaceC20106 interfaceC20106 = this.f68893;
        byte[] bArrM27089 = interfaceC20106.mo29604().m27089();
        try {
            System.arraycopy(this.f68907, 0, bArrM27089, 0, 36);
            int iM10968 = C5137.m10968(2, bArrM27089) & HPKE.aead_EXPORT_ONLY;
            if (iM10968 < 33 || iM10968 + 4 > Math.min(65535, ((C15410) interfaceC20106.mo29602()).m35123())) {
                throw new IOException("Invalid payload size: " + iM10968);
            }
            int iM10974 = C5137.m10974(9, bArrM27089);
            if (interfaceC15605.mo12502() == 46 && (iM10974 == 0 || iM10974 == -2147483643)) {
                C2532 c2532 = (C2532) interfaceC15605;
                AbstractRunnableC9160.m21101(this.f68891, bArrM27089, 36, 27);
                interfaceC15605.decode(bArrM27089);
                int iM3712 = c2532.m3712() - 59;
                if (c2532.m30251() > 0 && iM3712 > 0 && iM3712 < 4) {
                    AbstractRunnableC9160.m21101(this.f68891, bArrM27089, 63, iM3712);
                }
                if (c2532.m3711() > 0) {
                    AbstractRunnableC9160.m21101(this.f68891, c2532.m3715(), c2532.m3718(), c2532.m3711());
                }
            } else {
                AbstractRunnableC9160.m21101(this.f68891, bArrM27089, 36, iM10968 - 32);
                interfaceC15605.decode(bArrM27089);
            }
            interfaceC20106.mo29604().m27088(bArrM27089);
        } catch (Throwable th) {
            interfaceC20106.mo29604().m27088(bArrM27089);
            throw th;
        }
    }

    @Override // p067l.AbstractRunnableC9160
    /* JADX INFO: renamed from: ֫ */
    public final void mo21108(Long l2) {
        synchronized (this.f24818) {
            int iM10968 = C5137.m10968(2, this.f68907) & HPKE.aead_EXPORT_ONLY;
            if (iM10968 < 33 || iM10968 + 4 > ((C15410) this.f68893.mo29602()).m35096()) {
                f68890.mo9199("Flusing stream input");
                InputStream inputStream = this.f68891;
                inputStream.skip(inputStream.available());
            } else {
                InterfaceC20106 interfaceC20106 = this.f68893;
                byte[] bArr = this.f68907;
                InterfaceC15194 c15943 = null;
                if (this.f68896) {
                    if (l2.longValue() == -1 && (65535 & C5137.m10970(16, bArr)) == 18) {
                        c15943 = new C10342(interfaceC20106.mo29602());
                    }
                } else if (l2.longValue() == 65535 && bArr[8] == 36) {
                    c15943 = new C15943(interfaceC20106.mo29602());
                }
                if (c15943 != null) {
                    InterfaceC4410 interfaceC4410 = f68890;
                    interfaceC4410.mo9183("Parsing notification");
                    mo21110(c15943);
                    interfaceC4410.mo9191("Received notification " + c15943);
                    return;
                }
                f68890.mo9199("Skipping message " + l2);
                if (m49436()) {
                    this.f68891.skip(iM10968 - 64);
                } else {
                    this.f68891.skip(iM10968 - 32);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX INFO: renamed from: ֫ */
    public final boolean m49430(AbstractC13224 abstractC13224, AbstractC13224 abstractC13225) throws C5255 {
        boolean z;
        if (abstractC13225.getErrorCode() == 196610) {
            abstractC13225.m30276(-1073741225);
        } else {
            abstractC13225.m30276(C5255.m11332(abstractC13225.getErrorCode()));
        }
        int errorCode = abstractC13225.getErrorCode();
        if (errorCode != 0) {
            switch (errorCode) {
                case -2147483643:
                case -1073741802:
                    z = false;
                    break;
                case -1073741790:
                case -1073741718:
                case -1073741428:
                case -1073741260:
                    throw new C23360(abstractC13225.getErrorCode());
                case -1073741662:
                case -1073741225:
                    m49415(abstractC13225, abstractC13224.getPath(), abstractC13224);
                    throw null;
                case -1073741637:
                    throw new C2453();
                case 0:
                    z = true;
                    break;
                default:
                    switch (errorCode) {
                        case -1073741715:
                        case -1073741714:
                        case -1073741713:
                        case -1073741712:
                        case -1073741711:
                        case -1073741710:
                            throw new C23360(abstractC13225.getErrorCode());
                        default:
                            InterfaceC4410 interfaceC4410 = f68890;
                            if (interfaceC4410.mo9181()) {
                                interfaceC4410.mo9183("Error code: 0x" + C13854.m31529(abstractC13225.getErrorCode(), 8) + " for " + abstractC13224.getClass().getSimpleName());
                            }
                            throw new C5255(abstractC13225.getErrorCode());
                    }
            }
        } else {
            z = true;
        }
        if (abstractC13225.mo30258()) {
            throw new C5255("Signature verification failed.");
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m49415(InterfaceC3835 interfaceC3835, String str, InterfaceC17916 interfaceC17916) throws C5255 {
        InterfaceC20106 interfaceC20106 = this.f68893;
        interfaceC20106.mo29602().getClass();
        try {
            C10541 c10541M49424 = m49424(this.f68893, str, interfaceC17916.mo8755(), interfaceC17916.mo8763(), 1);
            InterfaceC4410 interfaceC4410 = f68890;
            if (c10541M49424 == null) {
                if (interfaceC4410.mo9181()) {
                    interfaceC4410.mo9183("Error code: 0x".concat(C13854.m31529(interfaceC3835.getErrorCode(), 8)));
                }
                throw new C5255(interfaceC3835.getErrorCode());
            }
            if (interfaceC17916.mo8763() != null) {
                interfaceC20106.mo29602().getClass();
            }
            if (interfaceC4410.mo9181()) {
                interfaceC4410.mo9183("Got referral " + c10541M49424);
            }
            ((C15174) interfaceC20106.mo29603()).m34598(interfaceC20106, str, c10541M49424);
            throw new C9140(c10541M49424);
        } catch (C20777 e) {
            throw new C5255("Failed to get DFS referral", e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m49427(InterfaceC9571 interfaceC9571, AbstractC13224 abstractC13224) throws C5255 {
        m49435(interfaceC9571, abstractC13224, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: ۧ */
    public final InterfaceC3835 m49435(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, Set set) throws C5255 {
        m49438();
        boolean z = this.f68896;
        if (z && !(interfaceC9571 instanceof AbstractC5628)) {
            throw new C5255("Not an SMB2 request ".concat(interfaceC9571.getClass().getName()));
        }
        if (!z && !(interfaceC9571 instanceof AbstractC13224)) {
            throw new C5255("Not an SMB1 request");
        }
        this.f68902.mo12567(interfaceC9571);
        if (interfaceC3835 != null) {
            interfaceC9571.mo30248(interfaceC3835);
            interfaceC3835.mo12475(interfaceC9571.getDigest());
        }
        try {
            InterfaceC4410 interfaceC4410 = f68890;
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196("Sending " + interfaceC9571);
            }
            interfaceC9571.getClass();
            if (interfaceC9571 instanceof AbstractC19710) {
                m49421(interfaceC9571, interfaceC3835, set);
            } else {
                if (interfaceC3835 != null) {
                    interfaceC3835.mo12498(interfaceC9571.mo12502());
                }
                interfaceC3835 = mo21106(interfaceC9571, interfaceC3835, set);
            }
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196("Response is " + interfaceC3835);
            }
            m49422(interfaceC9571);
            return interfaceC3835;
        } catch (C5255 e) {
            throw e;
        } catch (IOException e2) {
            throw new C5255(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ */
    private boolean m49422(InterfaceC9571 interfaceC9571) throws C5255 {
        InterfaceC13184 interfaceC13184;
        InterfaceC3835 interfaceC3835Mo7658;
        int iM14449;
        while (true) {
            boolean z = true;
            if (interfaceC9571 == null) {
                return true;
            }
            if (this.f68896) {
                interfaceC13184 = (AbstractC5628) interfaceC9571;
                interfaceC3835Mo7658 = interfaceC9571.mo7658();
                switch (interfaceC3835Mo7658.getErrorCode()) {
                    case -2147483643:
                        if (!(interfaceC3835Mo7658 instanceof C11684) && (!(interfaceC3835Mo7658 instanceof C6319) || ((iM14449 = ((C6319) interfaceC3835Mo7658).m14449()) != 1163287 && iM14449 != 1130508))) {
                        }
                        z = false;
                        if (interfaceC3835Mo7658.mo30258()) {
                            throw new C9949("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC9571 = interfaceC9571.mo22299();
                        break;
                    case -2147483642:
                    case 0:
                        if (interfaceC3835Mo7658.mo30258()) {
                            throw new C9949("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC9571 = interfaceC9571.mo22299();
                        break;
                        break;
                    case -1073741808:
                    case -1073741637:
                        throw new C2453();
                    case -1073741802:
                    case 259:
                    case 267:
                    case 268:
                        z = false;
                        if (interfaceC3835Mo7658.mo30258()) {
                            throw new C9949("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC9571 = interfaceC9571.mo22299();
                        break;
                        break;
                    case -1073741790:
                    case -1073741718:
                    case -1073741715:
                    case -1073741714:
                    case -1073741713:
                    case -1073741712:
                    case -1073741711:
                    case -1073741710:
                    case -1073741428:
                    case -1073741260:
                        throw new C23360(interfaceC3835Mo7658.getErrorCode());
                    case -1073741225:
                        if (!(interfaceC13184 instanceof InterfaceC17916)) {
                            throw new C5255("Invalid request for a DFS NT_STATUS_PATH_NOT_COVERED response ".concat(interfaceC13184.getClass().getName()));
                        }
                        InterfaceC17916 interfaceC17916 = (InterfaceC17916) interfaceC13184;
                        m49415(interfaceC3835Mo7658, interfaceC17916.mo8767(), interfaceC17916);
                        throw null;
                    default:
                        break;
                }
            } else {
                if (!m49430((AbstractC13224) interfaceC9571, (AbstractC13224) interfaceC9571.mo7658())) {
                    return false;
                }
                interfaceC9571 = interfaceC9571.mo22299();
            }
        }
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Error code: 0x" + C13854.m31529(interfaceC3835Mo7658.getErrorCode(), 8) + " for " + interfaceC13184.getClass().getSimpleName());
        }
        throw new C5255(interfaceC3835Mo7658.getErrorCode());
    }

    /* JADX INFO: renamed from: ܽ */
    private void m49421(InterfaceC9571 interfaceC9571, InterfaceC3835 interfaceC3835, Set set) {
        long jMo21120;
        interfaceC3835.mo12498(interfaceC9571.mo12502());
        AbstractC19710 abstractC19710 = (AbstractC19710) interfaceC9571;
        AbstractC19039 abstractC19039 = (AbstractC19039) interfaceC3835;
        abstractC19039.reset();
        try {
            try {
                abstractC19710.m44790(this.f68893.mo29604().m27089());
                abstractC19710.nextElement();
                if (abstractC19710.hasMoreElements()) {
                    AbstractC13224 c9200 = new C9200(this.f68893.mo29602());
                    mo21106((InterfaceC9571) abstractC19710, (InterfaceC3835) c9200, set);
                    if (c9200.getErrorCode() != 0) {
                        m49430((AbstractC13224) abstractC19710, c9200);
                    }
                    abstractC19710.nextElement();
                    jMo21120 = abstractC19710.mo30254();
                } else {
                    jMo21120 = mo21120(abstractC19710);
                }
                long j = jMo21120;
                try {
                    abstractC19039.mo30260();
                    long jMo21116 = mo21116((InterfaceC9571) abstractC19710);
                    if (set.contains(EnumC2572.NO_TIMEOUT)) {
                        abstractC19039.mo30247((Long) null);
                    } else {
                        abstractC19039.mo30247(Long.valueOf(System.currentTimeMillis() + jMo21116));
                    }
                    abstractC19039.m43259(this.f68893.mo29604().m27089());
                    this.f24813.put(Long.valueOf(j), abstractC19039);
                    while (true) {
                        InterfaceC4410 interfaceC4410 = f68890;
                        try {
                            mo21109((InterfaceC9571) abstractC19710);
                            if (!abstractC19710.hasMoreElements()) {
                                break;
                            } else {
                                abstractC19710.nextElement();
                            }
                        } catch (IOException e) {
                            interfaceC4410.mo9178("send failed", (Throwable) e);
                            try {
                                m21121();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                                interfaceC4410.mo9186("disconnect failed", (Throwable) e2);
                            }
                            throw e;
                        }
                    }
                    synchronized (abstractC19039) {
                        while (true) {
                            if (abstractC19039.mo30257() && !abstractC19039.hasMoreElements()) {
                            }
                            if (set.contains(EnumC2572.NO_TIMEOUT)) {
                                abstractC19039.wait();
                                InterfaceC4410 interfaceC4411 = f68890;
                                if (interfaceC4411.mo9194()) {
                                    interfaceC4411.mo9196("Wait returned " + mo21123());
                                }
                                if (mo21123()) {
                                    throw new EOFException("Transport closed while waiting for result");
                                }
                            } else {
                                abstractC19039.wait(jMo21116);
                                jMo21116 = abstractC19039.mo30269().longValue() - System.currentTimeMillis();
                                if (jMo21116 <= 0) {
                                    throw new C3992(this + " timedout waiting for response to " + abstractC19710);
                                }
                            }
                        }
                    }
                    if (!abstractC19039.mo30257()) {
                        throw new C3992("Failed to read response");
                    }
                    if (abstractC19039.getErrorCode() != 0) {
                        m49430((AbstractC13224) abstractC19710, (AbstractC13224) abstractC19039);
                    }
                    this.f24813.remove(Long.valueOf(j));
                    this.f68893.mo29604().m27088(abstractC19039.m43261());
                    this.f68893.mo29604().m27088(abstractC19710.m44791());
                } catch (Throwable th) {
                    this.f24813.remove(Long.valueOf(j));
                    this.f68893.mo29604().m27088(abstractC19039.m43261());
                    throw th;
                }
            } catch (InterruptedException e3) {
                throw new C3992(e3);
            }
        } catch (Throwable th2) {
            this.f68893.mo29604().m27088(abstractC19710.m44791());
            throw th2;
        }
    }

    @Override // p067l.AbstractRunnableC9160
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.f68906);
        sb.append(":");
        sb.append(this.f68903);
        sb.append(",state=");
        sb.append(this.f24812);
        sb.append(",signingEnforced=");
        sb.append(this.f68897);
        sb.append(",usage=");
        return C17520.m39893(sb, m21119(), "]");
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10541 m49424(InterfaceC20106 interfaceC20106, String str, String str2, String str3, int i) {
        C4506 c4506M17601;
        String str4 = str;
        int iM9534 = i;
        InterfaceC4410 interfaceC4410 = f68890;
        if (interfaceC4410.mo9181()) {
            interfaceC4410.mo9183("Resolving DFS path " + str4);
        }
        int i2 = 0;
        if (str.length() >= 2 && str4.charAt(0) == '\\' && str4.charAt(1) == '\\') {
            throw new C5255("Path must not start with double slash: ".concat(str4));
        }
        C24582 c24582M49426 = m49426(interfaceC20106, str2, str3);
        try {
            C21901 c21901M54201 = c24582M49426.m54201();
            try {
                C20560 c20560M54196 = c24582M49426.m54196("IPC$");
                try {
                    C18563 c18563 = new C18563(str4);
                    if (m49436()) {
                        C4978 c4978 = new C4978(interfaceC20106.mo29602(), 393620);
                        c4978.m10537();
                        c4978.m10535(c18563);
                        c4506M17601 = (C4506) ((C6319) c20560M54196.m46491(c4978, new EnumC2572[0])).m14447(C4506.class);
                    } else {
                        C7640 c7640 = new C7640(interfaceC20106.mo29602());
                        c20560M54196.m46490(new C2945(str4, interfaceC20106.mo29602()), c7640, Collections.EMPTY_SET);
                        c4506M17601 = c7640.m17601();
                    }
                    C10541 c10541 = null;
                    if (c4506M17601.m9534() == 0) {
                        c20560M54196.m46488();
                        c21901M54201.m21114();
                        c24582M49426.m54210();
                        return null;
                    }
                    if (iM9534 == 0 || c4506M17601.m9534() < iM9534) {
                        iM9534 = c4506M17601.m9534();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() + (((C15410) interfaceC20106.mo29602()).m35112() * 1000);
                    C5847[] c5847ArrM9533 = c4506M17601.m9533();
                    while (i2 < iM9534) {
                        C10541 c10541M24297 = C10541.m24297(c5847ArrM9533[i2], str4, jCurrentTimeMillis, c4506M17601.m9535());
                        c10541M24297.m24300(str3);
                        if ((c4506M17601.m9536() & 2) == 0 && (c10541M24297.m24311() & 2) == 0) {
                            interfaceC4410.mo9183("Non-root referral is not final " + c4506M17601);
                            c10541M24297.m24303();
                        }
                        if (c10541 != null) {
                            c10541.m24302(c10541M24297);
                        }
                        i2++;
                        str4 = str;
                        c10541 = c10541M24297;
                    }
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Got referral " + c10541);
                    }
                    c20560M54196.m46488();
                    c21901M54201.m21114();
                    c24582M49426.m54210();
                    return c10541;
                } catch (Throwable th) {
                    try {
                        c20560M54196.m46488();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                c21901M54201.m21114();
                throw th3;
            }
            try {
                c21901M54201.m21114();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c24582M49426.m54210();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] m49440() {
        return this.f68900;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m49420(byte[] bArr) {
        synchronized (this.f68900) {
            this.f68900 = m49431(bArr.length, bArr, this.f68900);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m49431(int i, byte[] bArr, byte[] bArr2) throws C2453 {
        InterfaceC21941 interfaceC21941;
        if (!this.f68896 || (interfaceC21941 = this.f68902) == null) {
            throw new C2453();
        }
        C5648 c5648 = (C5648) interfaceC21941;
        if (!c5648.mo12576().m50996(EnumC22788.SMB311)) {
            throw new C2453();
        }
        if (c5648.m12570() == 1) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                if (bArr2 != null) {
                    messageDigest.update(bArr2);
                }
                messageDigest.update(bArr, 0, i);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new C2670(e);
            }
        }
        throw new C2453();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m49423(C5648 c5648) {
        if (this.f68897) {
            return 3;
        }
        return (c5648 == null || !c5648.mo12563()) ? 1 : 3;
    }
}
