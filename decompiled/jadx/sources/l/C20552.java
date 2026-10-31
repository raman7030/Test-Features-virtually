package l;

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
public final class C20552 extends AbstractRunnableC7146 implements InterfaceC9263 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC2148 f66209 = C11321.m27961(C20552.class);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InputStream f66210;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC18663 f66212;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public long f66213;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC17065 f66214;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public final boolean f66216;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public Socket f66220;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20594 f66221;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f66222;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public OutputStream f66223;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public InterfaceC3846 f66225;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public boolean f66215 = false;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AtomicLong f66217 = new AtomicLong();

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final byte[] f66226 = new byte[1024];

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final LinkedList f66224 = new LinkedList();

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public String f66211 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Semaphore f66218 = new Semaphore(1, true);

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public byte[] f66219 = new byte[64];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized C23373 m47102(InterfaceC18663 interfaceC18663, String str, String str2) {
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("Currently " + this.f66224.size() + " session(s) active for " + this);
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT);
        }
        if (str2 != null) {
            str2 = str2.toUpperCase(Locale.ROOT);
        }
        ListIterator listIterator = this.f66224.listIterator();
        while (listIterator.hasNext()) {
            C23373 c23373 = (C23373) listIterator.next();
            if (c23373.m51801(interfaceC18663, str, str2)) {
                InterfaceC2148 interfaceC2149 = f66209;
                if (interfaceC2149.mo7099()) {
                    interfaceC2149.mo7101("Reusing existing session " + c23373);
                }
                c23373.m51800();
                return c23373;
            }
            InterfaceC2148 interfaceC21410 = f66209;
            if (interfaceC21410.mo7099()) {
                interfaceC21410.mo7101("Existing session " + c23373 + " does not match " + interfaceC18663.mo6355());
            }
        }
        if (((C13722) interfaceC18663.mo27540()).m32976() > 0) {
            long j = this.f66213;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (j < jCurrentTimeMillis) {
                this.f66213 = ((long) ((C13722) interfaceC18663.mo27540()).m32976()) + jCurrentTimeMillis;
                ListIterator listIterator2 = this.f66224.listIterator();
                while (listIterator2.hasNext()) {
                    C23373 c23374 = (C23373) listIterator2.next();
                    if (c23374.m51814() != null && c23374.m51814().longValue() < jCurrentTimeMillis && !c23374.m51795()) {
                        InterfaceC2148 interfaceC21411 = f66209;
                        if (interfaceC21411.mo7086()) {
                            interfaceC21411.mo7088("Closing session after timeout " + c23374);
                        }
                        c23374.m51802(false, false);
                    }
                }
            }
        }
        C23373 c23375 = new C23373(interfaceC18663, str, str2, this);
        InterfaceC2148 interfaceC21412 = f66209;
        if (interfaceC21412.mo7086()) {
            interfaceC21412.mo7088("Establishing new session " + c23375 + " on " + this.f21940);
        }
        this.f66224.add(c23375);
        return c23375;
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean mo19175(boolean z, boolean z2) {
        boolean zM51802;
        InterfaceC18663 interfaceC18663;
        ListIterator listIterator = this.f66224.listIterator();
        long jM19176 = m19176();
        if ((!z2 || jM19176 == 1) && (z2 || jM19176 <= 0)) {
            zM51802 = false;
        } else {
            f66209.mo7104("Disconnecting transport while still in use " + this + ": " + this.f66224);
            zM51802 = true;
        }
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Disconnecting transport " + this);
        }
        try {
            try {
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101("Currently " + this.f66224.size() + " session(s) active for " + this);
                }
                while (listIterator.hasNext()) {
                    try {
                        try {
                            zM51802 |= ((C23373) listIterator.next()).m51802(z, false);
                        } catch (Throwable th) {
                            listIterator.remove();
                            throw th;
                        }
                    } catch (Exception e) {
                        f66209.mo7081("Failed to close session", e);
                    }
                    listIterator.remove();
                }
                Socket socket = this.f66220;
                if (socket != null) {
                    socket.shutdownOutput();
                    this.f66223.close();
                    this.f66210.close();
                    this.f66220.close();
                    f66209.mo7101("Socket closed");
                } else {
                    f66209.mo7101("Not yet initialized");
                }
                this.f66220 = null;
                this.f66214 = null;
                this.f66211 = null;
                interfaceC18663 = this.f66212;
            } catch (Exception e2) {
                f66209.mo7081("Exception in disconnect", e2);
                this.f66220 = null;
                this.f66214 = null;
                this.f66211 = null;
                interfaceC18663 = this.f66212;
            }
            ((C15611) interfaceC18663.mo27538()).m36796(this);
        } catch (Throwable th2) {
            this.f66220 = null;
            this.f66214 = null;
            this.f66211 = null;
            ((C15611) this.f66212.mo27538()).m36796(this);
            throw th2;
        }
        return zM51802;
    }

    public C20552(InterfaceC18663 interfaceC18663, InterfaceC3846 interfaceC3846, int i, boolean z) {
        boolean z2 = false;
        this.f66212 = interfaceC18663;
        if (z) {
            z2 = true;
        } else {
            interfaceC18663.mo27540().getClass();
        }
        this.f66216 = z2;
        this.f66213 = System.currentTimeMillis() + ((long) ((C13722) interfaceC18663.mo27540()).m32976());
        this.f66225 = interfaceC3846;
        this.f66222 = i;
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ۧ */
    public final int mo19173(InterfaceC7578 interfaceC7578) {
        if (interfaceC7578 != null) {
            interfaceC7578.getClass();
        }
        return ((C13722) this.f66212.mo27540()).m33015();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3846 m47109() {
        return this.f66225;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String m47108() {
        return this.f66211;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47118() {
        return this.f66224.size();
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo19180() {
        Socket socket = this.f66220;
        return super.mo19180() || socket == null || socket.isClosed();
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ۜ */
    public final boolean mo19172() {
        Socket socket = this.f66220;
        return super.mo19172() || socket == null || socket.isClosed();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC20594 m47117() throws C3037 {
        try {
            if (this.f66221 == null) {
                m19174(((C13722) this.f66212.mo27540()).m33015());
            }
            InterfaceC20594 interfaceC20594 = this.f66221;
            if (interfaceC20594 != null) {
                return interfaceC20594;
            }
            throw new C3037("Connection did not complete, failed to get negotiation response");
        } catch (IOException e) {
            throw new C3037(e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m47112() {
        return this.f66215 || (m47117() instanceof C3450);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47104(InterfaceC17065 interfaceC17065) {
        this.f66214 = interfaceC17065;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final InterfaceC17065 m47115() {
        return this.f66214;
    }

    public final InterfaceC18663 getContext() {
        return this.f66212;
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ֫ */
    public final void mo19166(InterfaceC7578 interfaceC7578) {
        InterfaceC2148 interfaceC2148;
        byte[] bArrM25072 = this.f66212.mo27542().m25072();
        try {
            synchronized (this.f21938) {
                int iMo10430 = interfaceC7578.mo10430(4, bArrM25072);
                C2913.m8901(65535 & iMo10430, 0, bArrM25072);
                if (f66209.mo7099()) {
                    do {
                        interfaceC2148 = f66209;
                        interfaceC2148.mo7101(interfaceC7578.toString());
                        if (!(interfaceC7578 instanceof AbstractC10011)) {
                            break;
                        } else {
                            interfaceC7578 = ((AbstractC10011) interfaceC7578).m25186();
                        }
                    } while (interfaceC7578 != null);
                    interfaceC2148.mo7101(C12085.m29468(bArrM25072, 4, iMo10430));
                }
                this.f66223.write(bArrM25072, 0, iMo10430 + 4);
                this.f66223.flush();
            }
            this.f66212.mo27542().m25071(bArrM25072);
        } catch (Throwable th) {
            this.f66212.mo27542().m25071(bArrM25072);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m47119() throws C3037 {
        if (this.f66216) {
            return false;
        }
        InterfaceC20594 interfaceC20594M47117 = m47117();
        return interfaceC20594M47117.mo10550() && !interfaceC20594M47117.mo10539();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m47110() {
        if (this.f66216) {
            return true;
        }
        return m47117().mo10539();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9263 m47101(Class cls) {
        if (cls.isAssignableFrom(C20552.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47105(InterfaceC3846 interfaceC3846, int i, String str) {
        int i2;
        if (this.f21933 == 5 || this.f21933 == 6) {
            return false;
        }
        if (str == null) {
            str = interfaceC3846.mo1015();
        }
        String str2 = this.f66211;
        if ((str2 != null && !str.equalsIgnoreCase(str2)) || !interfaceC3846.equals(this.f66225)) {
            return false;
        }
        if (i == 0 || i == (i2 = this.f66222)) {
            return true;
        }
        return i == 445 && i2 == 139;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m47113() throws IOException {
        String strMo1013;
        InterfaceC18663 interfaceC18663 = this.f66212;
        InterfaceC1023 interfaceC1023Mo27540 = interfaceC18663.mo27540();
        InterfaceC3846 interfaceC3846 = this.f66225;
        C16296 c16296 = new C16296(interfaceC1023Mo27540, interfaceC3846.mo1016(), 32, null);
        do {
            Socket socket = new Socket();
            this.f66220 = socket;
            socket.connect(new InetSocketAddress(interfaceC3846.mo1012(), 139), ((C13722) interfaceC18663.mo27540()).m33004());
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m32993());
            this.f66223 = this.f66220.getOutputStream();
            this.f66210 = this.f66220.getInputStream();
            C19120 c19120 = new C19120(interfaceC18663.mo27540(), c16296, ((RunnableC9242) interfaceC18663.mo27539()).m23696());
            OutputStream outputStream = this.f66223;
            byte[] bArr = this.f66226;
            outputStream.write(bArr, 0, c19120.m44069(bArr));
            int iM19158 = AbstractRunnableC7146.m19158(this.f66210, bArr, 0, 4);
            InterfaceC2148 interfaceC2148 = f66209;
            if (iM19158 < 4) {
                try {
                    this.f66220.close();
                } catch (IOException e) {
                    interfaceC2148.mo7081("Failed to close socket", (Exception) e);
                }
                throw new C3037("EOF during NetBIOS session request");
            }
            int i = bArr[0] & 255;
            if (i == -1) {
                m19178();
                throw new C2186(-1);
            }
            if (i == 130) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("session established ok with " + interfaceC3846);
                    return;
                }
                return;
            }
            if (i == 131) {
                int i2 = this.f66210.read() & 255;
                if (i2 == 128 || i2 == 130) {
                    this.f66220.close();
                    strMo1013 = interfaceC3846.mo1013(interfaceC18663);
                    c16296.f50125 = strMo1013;
                } else {
                    m19178();
                    throw new C2186(i2);
                }
            } else {
                m19178();
                throw new C2186(0);
            }
        } while (strMo1013 != null);
        throw new IOException("Failed to establish session with " + interfaceC3846);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C23415 m47090(int i) {
        synchronized (this.f21939) {
            try {
                if (i == 139) {
                    m47113();
                } else {
                    if (i == 0) {
                        i = 445;
                    }
                    Socket socket = new Socket();
                    this.f66220 = socket;
                    socket.connect(new InetSocketAddress(this.f66225.mo1012(), i), ((C13722) this.f66212.mo27540()).m33004());
                    this.f66220.setSoTimeout(((C13722) this.f66212.mo27540()).m32993());
                    this.f66223 = this.f66220.getOutputStream();
                    this.f66210 = this.f66220.getInputStream();
                }
                if (this.f66218.drainPermits() == 0) {
                    f66209.mo7088("It appears we previously lost some credits");
                }
                if (this.f66215) {
                    f66209.mo7088("Using SMB2 only negotiation");
                    return m47094((C3450) null);
                }
                this.f66212.mo27540().getClass();
                C9346 c9346 = new C9346(this.f66212.mo27540(), this.f66216);
                int iM47089 = m47089((InterfaceC7578) c9346, true);
                m47093();
                if (this.f66215) {
                    C3450 c3450 = new C3450(this.f66212.mo27540());
                    c3450.m10431(this.f66226, 4, false);
                    c3450.mo28228();
                    if (c3450.m10541() == 767) {
                        return m47094(c3450);
                    }
                    if (c3450.m10541() != 514) {
                        throw new C19369("Server returned invalid dialect verison in multi protocol negotiation");
                    }
                    int iM10462 = c3450.m10462();
                    if (iM10462 > 0) {
                        this.f66218.release(iM10462);
                    }
                    Arrays.fill(this.f66226, (byte) 0);
                    return new C23415(new C4861(this.f66212.mo27540(), this.f66216 ? 2 : 1), c3450, null, null);
                }
                if (((C13722) this.f66212.mo27540()).m32981().m48660()) {
                    throw new C19369("Server does not support SMB2");
                }
                C8640 c8640 = new C8640(this.f66212);
                c8640.decode(this.f66226);
                c8640.mo28228();
                InterfaceC2148 interfaceC2148 = f66209;
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101(c8640.toString());
                    interfaceC2148.mo7101(C12085.m29468(this.f66226, 4, iM47089));
                }
                int iM22407 = c8640.m22407();
                if (iM22407 > 0) {
                    this.f66218.release(iM22407);
                }
                Arrays.fill(this.f66226, (byte) 0);
                return new C23415(c9346, c8640, null, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m47089(InterfaceC7578 interfaceC7578, boolean z) throws IOException {
        if (z) {
            mo19177(interfaceC7578);
        } else {
            interfaceC7578.mo10434(0L);
            this.f66217.set(1L);
        }
        byte[] bArr = this.f66226;
        int iMo10430 = interfaceC7578.mo10430(4, bArr);
        C2913.m8901(65535 & iMo10430, 0, bArr);
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101(interfaceC7578.toString());
            interfaceC2148.mo7101(C12085.m29468(bArr, 4, iMo10430));
        }
        this.f66223.write(bArr, 0, iMo10430 + 4);
        this.f66223.flush();
        interfaceC2148.mo7101("Wrote negotiate request");
        return iMo10430;
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    private void m47093() throws IOException {
        InterfaceC18663 interfaceC18663 = this.f66212;
        try {
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m33004());
            if (mo19170() == null) {
                throw new IOException("transport closed in negotiate");
            }
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m32993());
            byte[] bArr = this.f66226;
            int iM8900 = C2913.m8900(2, bArr) & HPKE.aead_EXPORT_ONLY;
            if (iM8900 < 33 || iM8900 + 4 > bArr.length) {
                throw new IOException(C19370.m44628(iM8900, "Invalid payload size: "));
            }
            int i = this.f66215 ? 64 : 32;
            AbstractRunnableC7146.m19158(this.f66210, bArr, i + 4, iM8900 - i);
            f66209.mo7101("Read negotiate response");
        } catch (Throwable th) {
            this.f66220.setSoTimeout(((C13722) interfaceC18663.mo27540()).m32993());
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23415 m47094(C3450 c3450) throws Throwable {
        Throwable th;
        byte[] bArr;
        Semaphore semaphore = this.f66218;
        byte[] bArr2 = this.f66226;
        int iM47099 = m47099(c3450);
        InterfaceC18663 interfaceC18663 = this.f66212;
        C4861 c4861 = new C4861(interfaceC18663.mo27540(), iM47099);
        C3450 c3451 = null;
        byte[] bArr3 = null;
        try {
            c4861.m10442(Math.max(1, 512 - semaphore.availablePermits()));
            int iM47089 = m47089(c4861, c3450 != null);
            boolean zM48659 = ((C13722) interfaceC18663.mo27540()).m32972().m48659(EnumC21485.SMB311);
            if (zM48659) {
                bArr = new byte[iM47089];
                System.arraycopy(bArr2, 4, bArr, 0, iM47089);
            } else {
                bArr = null;
            }
            m47093();
            C3450 c3452 = (C3450) c4861.mo5430(interfaceC18663);
            try {
                int iM10431 = c3452.m10431(bArr2, 4, false);
                c3452.mo28228();
                if (zM48659) {
                    bArr3 = new byte[iM10431];
                    System.arraycopy(bArr2, 4, bArr3, 0, iM10431);
                } else {
                    bArr = null;
                }
                InterfaceC2148 interfaceC2148 = f66209;
                if (interfaceC2148.mo7099()) {
                    interfaceC2148.mo7101(c3452.toString());
                    interfaceC2148.mo7101(C12085.m29468(bArr2, 4, 0));
                }
                C23415 c23415 = new C23415(c4861, c3452, bArr, bArr3);
                int iM10462 = c3452.m10462();
                semaphore.release(iM10462 != 0 ? iM10462 : 1);
                Arrays.fill(bArr2, (byte) 0);
                return c23415;
            } catch (Throwable th2) {
                th = th2;
                c3451 = c3452;
                int iM10463 = c3451 != null ? c3451.m10462() : 0;
                semaphore.release(iM10463 != 0 ? iM10463 : 1);
                Arrays.fill(bArr2, (byte) 0);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m47114() {
        try {
            return m19174(((C13722) this.f66212.mo27540()).m33015());
        } catch (C1708 e) {
            throw new C3037("Failed to connect: " + this.f66225, e);
        }
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ᩳ */
    public final void mo19179() throws IOException {
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Connecting in state " + this.f21933 + " addr " + this.f66225.mo1012());
        }
        try {
            C23415 c23415M47090 = m47090(this.f66222);
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Negotiation response on " + this.f21940 + " :" + c23415M47090);
            }
            if (!c23415M47090.m51871().mo10538(this.f66212, c23415M47090.m51870())) {
                throw new C3037("This client is not compatible with the server.");
            }
            boolean zMo10539 = c23415M47090.m51871().mo10539();
            boolean zMo10540 = c23415M47090.m51871().mo10540();
            if (interfaceC2148.mo7086()) {
                StringBuilder sb = new StringBuilder("Signature negotiation enforced ");
                sb.append(this.f66216);
                sb.append(" (server ");
                sb.append(zMo10539);
                sb.append(") enabled false (server ");
                this.f66212.mo27540().getClass();
                sb.append(zMo10540);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                interfaceC2148.mo7088(sb.toString());
            }
            this.f66211 = this.f66225.mo1015();
            this.f66221 = c23415M47090.m51871();
            if (c23415M47090.m51871().mo10552().m48659(EnumC21485.SMB311)) {
                byte[] bArrM51872 = c23415M47090.m51872();
                synchronized (this.f66219) {
                    this.f66219 = m47107(bArrM51872.length, bArrM51872, this.f66219);
                }
                m47096(c23415M47090.m51869());
                if (interfaceC2148.mo7086()) {
                    byte[] bArr = this.f66219;
                    interfaceC2148.mo7088("Preauth hash after negotiate ".concat(C12085.m29468(bArr, 0, bArr.length)));
                }
            }
        } catch (IOException e) {
            this.f66212.mo27540().getClass();
            throw e;
        }
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ܽ */
    public final long mo19177(InterfaceC7578 interfaceC7578) {
        long jIncrementAndGet = this.f66217.incrementAndGet() - 1;
        if (!this.f66215) {
            jIncrementAndGet %= 32000;
        }
        interfaceC7578.mo10434(jIncrementAndGet);
        return jIncrementAndGet;
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ۖ */
    public final Long mo19170() throws IOException {
        byte[] bArr;
        char c;
        do {
            InputStream inputStream = this.f66210;
            bArr = this.f66226;
            c = 4;
            if (AbstractRunnableC7146.m19158(inputStream, bArr, 0, 4) < 4) {
                return null;
            }
        } while (bArr[0] == -123);
        if (AbstractRunnableC7146.m19158(this.f66210, bArr, 4, 32) < 32) {
            return null;
        }
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7099()) {
            interfaceC2148.mo7101("New data read: " + this);
            interfaceC2148.mo7101(C12085.m29468(bArr, 4, 32));
        }
        while (true) {
            byte b = bArr[0];
            if (b == 0 && bArr[c] == -2 && bArr[5] == 83 && bArr[6] == 77 && bArr[7] == 66) {
                this.f66215 = true;
                if (AbstractRunnableC7146.m19158(this.f66210, bArr, 36, 32) < 32) {
                    return null;
                }
                return Long.valueOf((((long) C2913.m8906(28, bArr)) & 4294967295L) | ((((long) C2913.m8906(32, bArr)) & 4294967295L) << 32));
            }
            if (b != 0 || bArr[1] != 0 || bArr[4] != -1 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
                int i = 0;
                while (i < 35) {
                    interfaceC2148.mo7104("Possibly out of phase, trying to resync ".concat(C12085.m29468(bArr, 0, 16)));
                    int i2 = i + 1;
                    bArr[i] = bArr[i2];
                    i = i2;
                }
                int i3 = this.f66210.read();
                if (i3 == -1) {
                    return null;
                }
                bArr[35] = (byte) i3;
                c = 4;
            } else {
                return Long.valueOf(((long) C2913.m8902(34, bArr)) & 65535);
            }
        }
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC1543 mo19163(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) throws IOException {
        InterfaceC7578 interfaceC7578Mo20318;
        int i;
        InterfaceC1543 interfaceC1543Mo5430 = interfaceC1543;
        if (interfaceC7578 instanceof InterfaceC10716) {
            if (interfaceC1543Mo5430 == null) {
                interfaceC1543Mo5430 = ((InterfaceC10716) interfaceC7578).mo5430(this.f66212);
            } else if (m47112()) {
                throw new IOException("Should not provide response argument for SMB2");
            }
        } else if ((interfaceC7578 instanceof AbstractC10011) && (interfaceC1543Mo5430 instanceof AbstractC10011)) {
            AbstractC10011 abstractC10011 = (AbstractC10011) interfaceC7578;
            InterfaceC1543 interfaceC1543M25186 = interfaceC1543Mo5430;
            while (true) {
                AbstractC10011 abstractC10012 = (AbstractC10011) interfaceC1543M25186;
                abstractC10011.mo28204((InterfaceC1543) abstractC10012);
                AbstractC11422 abstractC11422M25186 = abstractC10011.m25186();
                if (abstractC11422M25186 == null) {
                    break;
                }
                interfaceC1543M25186 = abstractC10012.m25186();
                abstractC11422M25186.mo28204((InterfaceC1543) abstractC11422M25186);
                if (!(abstractC11422M25186 instanceof AbstractC10011) || !(interfaceC1543M25186 instanceof AbstractC10011)) {
                    break;
                }
                abstractC10011 = (AbstractC10011) abstractC11422M25186;
            }
        } else {
            interfaceC7578.mo28204(interfaceC1543);
        }
        if (interfaceC1543Mo5430 != null) {
            int iM33009 = ((C13722) this.f66212.mo27540()).m33009();
            InterfaceC7578 interfaceC7579 = interfaceC7578;
            while (true) {
                if (interfaceC7579 == null) {
                    interfaceC1543Mo5430 = interfaceC1543Mo5430;
                    break;
                }
                int i2 = 0;
                int i3 = 0;
                InterfaceC7578 interfaceC75710 = null;
                InterfaceC7578 interfaceC75711 = interfaceC7579;
                while (true) {
                    if (interfaceC75711 != null) {
                        int i4 = i2 + 1;
                        int size = interfaceC75711.size();
                        InterfaceC7578 interfaceC7578Mo20322 = interfaceC75711.mo20322();
                        InterfaceC2148 interfaceC2148 = f66209;
                        if (interfaceC2148.mo7099()) {
                            interfaceC2148.mo7101(String.format("%s costs %d avail %d (%s)", interfaceC75711.getClass().getName(), 1, Integer.valueOf(this.f66218.availablePermits()), this.f21940));
                        }
                        if ((interfaceC7578Mo20322 == null || interfaceC75711.mo20321(interfaceC7578Mo20322)) && (i = i3 + size) < iM33009 && this.f66218.tryAcquire(1)) {
                            i3 = i;
                            interfaceC75710 = interfaceC75711;
                            interfaceC75711 = interfaceC7578Mo20322;
                            i2 = i4;
                            interfaceC1543Mo5430 = interfaceC1543Mo5430;
                        } else {
                            if (interfaceC75710 == null && i3 + size > iM33009) {
                                throw new C3037(String.format("Request size %d exceeds allowable size %d: %s", Integer.valueOf(size), Integer.valueOf(iM33009), interfaceC75711));
                            }
                            if (interfaceC75710 == null) {
                                try {
                                    long jMo19173 = mo19173(interfaceC75711);
                                    if (set.contains(EnumC0214.NO_TIMEOUT)) {
                                        this.f66218.acquire(1);
                                    } else if (!this.f66218.tryAcquire(1, jMo19173, TimeUnit.MILLISECONDS)) {
                                        throw new C3037("Failed to acquire credits in time");
                                    }
                                    synchronized (interfaceC75711) {
                                        interfaceC7578Mo20318 = interfaceC75711.mo20318();
                                        if (interfaceC2148.mo7086() && interfaceC7578Mo20318 != null) {
                                            interfaceC2148.mo7088("Insufficient credits, send only first " + interfaceC75711 + " next is " + interfaceC7578Mo20318);
                                        }
                                    }
                                } catch (InterruptedException e) {
                                    InterruptedIOException interruptedIOException = new InterruptedIOException("Interrupted while acquiring credits");
                                    interruptedIOException.initCause(e);
                                    throw interruptedIOException;
                                }
                            } else {
                                if (interfaceC2148.mo7086()) {
                                    interfaceC2148.mo7088("Not enough credits, split at " + interfaceC75710);
                                }
                                synchronized (interfaceC75710) {
                                    interfaceC7578Mo20318 = interfaceC75710.mo20318();
                                }
                            }
                            i2 = i4;
                        }
                    } else {
                        interfaceC1543Mo5430 = interfaceC1543Mo5430;
                        interfaceC7578Mo20318 = null;
                    }
                    int iMax = Math.max(1, ((512 - this.f66218.availablePermits()) - i2) + 1);
                    InterfaceC2148 interfaceC2149 = f66209;
                    if (interfaceC2149.mo7099()) {
                        interfaceC2149.mo7101("Request credits " + iMax);
                    }
                    interfaceC7578.mo20319(iMax);
                    try {
                        InterfaceC1543 interfaceC1543Mo5429 = interfaceC7579.mo5429();
                        if (interfaceC2149.mo7099()) {
                            interfaceC2149.mo7101("Sending " + interfaceC7579);
                        }
                        InterfaceC1543 interfaceC1544 = (InterfaceC1543) mo19163(interfaceC7579, interfaceC1543Mo5429, set);
                        if (!m47098(interfaceC7579)) {
                            if (interfaceC2149.mo7086()) {
                                interfaceC2149.mo7088("Breaking on error " + interfaceC1544);
                            }
                            int iMo28222 = 0;
                            while (true) {
                                if (interfaceC7579.mo20320()) {
                                    f66209.mo7101("Async");
                                    break;
                                }
                                InterfaceC1543 interfaceC1543Mo54210 = interfaceC7579.mo5429();
                                if (interfaceC1543Mo54210 == null) {
                                    f66209.mo7104("Response not properly set up for" + interfaceC7579);
                                } else if (interfaceC1543Mo54210.mo28213()) {
                                    iMo28222 = interfaceC1543Mo54210.mo28222() + iMo28222;
                                }
                                InterfaceC7578 interfaceC7578Mo20323 = interfaceC7579.mo20322();
                                if (interfaceC7578Mo20323 == null) {
                                    break;
                                }
                                interfaceC7579 = interfaceC7578Mo20323;
                            }
                            if (!mo19180() && !interfaceC7579.mo20320() && !interfaceC7579.mo5429().mo5289() && !interfaceC7579.mo5429().mo28209() && iMo28222 == 0) {
                                if (this.f66218.availablePermits() > 0 || i2 > 0) {
                                    f66209.mo7088("Server " + this + " returned zero credits for " + interfaceC7579);
                                    break;
                                }
                                f66209.mo7104("Server " + this + " took away all our credits");
                                break;
                            }
                            if (!interfaceC7579.mo20320()) {
                                InterfaceC2148 interfaceC21410 = f66209;
                                if (interfaceC21410.mo7099()) {
                                    interfaceC21410.mo7101("Adding credits " + iMo28222);
                                }
                                this.f66218.release(iMo28222);
                                break;
                            }
                            break;
                        }
                        if (interfaceC7578Mo20318 != null) {
                            interfaceC1544.mo5288(interfaceC7578Mo20318);
                        }
                        int iMo28223 = 0;
                        while (true) {
                            if (interfaceC7579.mo20320()) {
                                f66209.mo7101("Async");
                                break;
                            }
                            InterfaceC1543 interfaceC1543Mo54211 = interfaceC7579.mo5429();
                            if (interfaceC1543Mo54211 == null) {
                                f66209.mo7104("Response not properly set up for" + interfaceC7579);
                            } else if (interfaceC1543Mo54211.mo28213()) {
                                iMo28223 = interfaceC1543Mo54211.mo28222() + iMo28223;
                            }
                            InterfaceC7578 interfaceC7578Mo20324 = interfaceC7579.mo20322();
                            if (interfaceC7578Mo20324 == null) {
                                break;
                            }
                            interfaceC7579 = interfaceC7578Mo20324;
                        }
                        if (!mo19180() && !interfaceC7579.mo20320() && !interfaceC7579.mo5429().mo5289() && !interfaceC7579.mo5429().mo28209() && iMo28223 == 0) {
                            if (this.f66218.availablePermits() > 0 || i2 > 0) {
                                f66209.mo7088("Server " + this + " returned zero credits for " + interfaceC7579);
                            } else {
                                f66209.mo7104("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC7579.mo20320()) {
                            InterfaceC2148 interfaceC21411 = f66209;
                            if (interfaceC21411.mo7099()) {
                                interfaceC21411.mo7101("Adding credits " + iMo28223);
                            }
                            this.f66218.release(iMo28223);
                        }
                        interfaceC7579 = interfaceC7578Mo20318;
                        interfaceC1543Mo5430 = interfaceC1543Mo5430;
                    } catch (Throwable th) {
                        int iMo28224 = 0;
                        while (true) {
                            if (interfaceC7579.mo20320()) {
                                f66209.mo7101("Async");
                                break;
                            }
                            InterfaceC1543 interfaceC1543Mo54212 = interfaceC7579.mo5429();
                            if (interfaceC1543Mo54212 == null) {
                                f66209.mo7104("Response not properly set up for" + interfaceC7579);
                            } else if (interfaceC1543Mo54212.mo28213()) {
                                iMo28224 = interfaceC1543Mo54212.mo28222() + iMo28224;
                            }
                            InterfaceC7578 interfaceC7578Mo20325 = interfaceC7579.mo20322();
                            if (interfaceC7578Mo20325 == null) {
                                break;
                            }
                            interfaceC7579 = interfaceC7578Mo20325;
                        }
                        if (!mo19180() && !interfaceC7579.mo20320() && !interfaceC7579.mo5429().mo5289() && !interfaceC7579.mo5429().mo28209() && iMo28224 == 0) {
                            if (this.f66218.availablePermits() > 0 || i2 > 0) {
                                f66209.mo7088("Server " + this + " returned zero credits for " + interfaceC7579);
                            } else {
                                f66209.mo7104("Server " + this + " took away all our credits");
                            }
                        } else if (!interfaceC7579.mo20320()) {
                            InterfaceC2148 interfaceC21412 = f66209;
                            if (interfaceC21412.mo7099()) {
                                interfaceC21412.mo7101("Adding credits " + iMo28224);
                            }
                            this.f66218.release(iMo28224);
                        }
                        throw th;
                    }
                }
            }
            if (interfaceC1543Mo5430.mo28213()) {
                return interfaceC1543Mo5430;
            }
            throw new IOException("No response", interfaceC1543Mo5430.getException());
        }
        throw new IOException("Invalid response");
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo19168(InterfaceC7578 interfaceC7578, InterfaceC13495 interfaceC13495) {
        if (!this.f66215) {
            return false;
        }
        AbstractC13306 abstractC13306 = (AbstractC13306) interfaceC7578;
        AbstractC12601 abstractC12601 = (AbstractC12601) interfaceC13495;
        synchronized (abstractC12601) {
            if (!abstractC12601.m10451() || abstractC12601.m30866() || abstractC12601.m10446() != 259 || abstractC12601.m10450() == 0) {
                return false;
            }
            abstractC12601.m30868();
            boolean zM10451 = abstractC13306.m10451();
            abstractC13306.m10457(abstractC12601.m10450());
            if (abstractC12601.mo28225() != null) {
                abstractC12601.mo28203(Long.valueOf(System.currentTimeMillis() + ((long) mo19173(interfaceC7578))));
            }
            InterfaceC2148 interfaceC2148 = f66209;
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Have intermediate reply " + interfaceC13495);
            }
            if (!zM10451) {
                int iM10462 = abstractC12601.m10462();
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Credit from intermediate " + iM10462);
                }
                this.f66218.release(iM10462);
            }
            return true;
        }
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ֫ */
    public final void mo19167(InterfaceC13495 interfaceC13495) throws Exception {
        InterfaceC13927 interfaceC13927 = (InterfaceC13927) interfaceC13495;
        this.f66221.mo10536(interfaceC13495);
        try {
            if (this.f66215) {
                m47095(interfaceC13927);
            } else {
                m47092(interfaceC13927);
            }
        } catch (Exception e) {
            f66209.mo7083("Failure decoding message, disconnecting transport", (Throwable) e);
            interfaceC13495.mo28202(e);
            synchronized (interfaceC13495) {
                interfaceC13495.notifyAll();
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47095(InterfaceC13927 interfaceC13927) throws IOException {
        int iM8906;
        byte[] bArr = this.f66226;
        int iM8900 = (C2913.m8900(2, bArr) & HPKE.aead_EXPORT_ONLY) | ((bArr[1] & 255) << 16);
        if (iM8900 < 65) {
            throw new IOException(C19370.m44628(iM8900, "Invalid payload size: "));
        }
        int i = 0;
        if (bArr[0] != 0 || bArr[4] != -2 || bArr[5] != 83 || bArr[6] != 77 || bArr[7] != 66) {
            throw new IOException("Houston we have a synchronization problem");
        }
        int iM8907 = C2913.m8906(24, bArr);
        InterfaceC18663 interfaceC18663 = this.f66212;
        int iM33009 = ((C13722) interfaceC18663.mo27540()).m33009();
        int i2 = iM8907 != 0 ? iM8907 : iM8900;
        if (i2 > iM33009) {
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", Integer.valueOf(i2), Integer.valueOf(iM33009)));
        }
        AbstractC12601 abstractC12601 = (AbstractC12601) interfaceC13927;
        byte[] bArrM25072 = interfaceC18663.mo27542().m25072();
        int i3 = iM8907 != 0 ? iM8907 : iM8900;
        int i4 = 64;
        try {
            System.arraycopy(bArr, 4, bArrM25072, 0, 64);
            AbstractRunnableC7146.m19158(this.f66210, bArrM25072, 64, i3 - 64);
            abstractC12601.m10464(i3);
            int iM10431 = abstractC12601.m10431(bArrM25072, 0, false);
            if (iM10431 > i3) {
                throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i3), Integer.valueOf(iM10431), abstractC12601));
            }
            char c = 1;
            if (iM8907 != 0 && iM10431 > iM8907) {
                throw new IOException("Overlapping commands");
            }
            int i5 = iM8900 - i3;
            int i6 = 2;
            while (true) {
                if (i5 > 0 && iM8907 != 0) {
                    abstractC12601 = (AbstractC12601) abstractC12601.m10466();
                    InterfaceC2148 interfaceC2148 = f66209;
                    if (abstractC12601 != null) {
                        AbstractRunnableC7146.m19158(this.f66210, bArrM25072, i, i4);
                        iM8906 = C2913.m8906(20, bArrM25072);
                        if ((iM8906 != 0 && iM8906 > iM33009) || (iM8906 == 0 && i5 > iM33009)) {
                            break;
                        }
                        int i7 = iM8906 != 0 ? iM8906 : i5;
                        if (interfaceC2148.mo7086()) {
                            Integer numValueOf = Integer.valueOf(iM8906);
                            Integer numValueOf2 = Integer.valueOf(i7);
                            Integer numValueOf3 = Integer.valueOf(i5);
                            Object[] objArr = new Object[3];
                            objArr[0] = numValueOf;
                            objArr[c] = numValueOf2;
                            objArr[2] = numValueOf3;
                            interfaceC2148.mo7088(String.format("Compound next command %d read size %d remain %d", objArr));
                        }
                        abstractC12601.m10464(i7);
                        AbstractRunnableC7146.m19158(this.f66210, bArrM25072, 64, i7 - 64);
                        int iM10432 = abstractC12601.m10431(bArrM25072, 0, true);
                        if (iM10432 > i7) {
                            throw new IOException(String.format("WHAT? ( read %d decoded %d ): %s", Integer.valueOf(i7), Integer.valueOf(iM10432), abstractC12601));
                        }
                        if (iM8906 != 0 && iM10432 > iM8906) {
                            throw new IOException("Overlapping commands");
                        }
                        i5 -= i7;
                        i6 = 2;
                        i = 0;
                        iM8907 = iM8906;
                        i4 = 64;
                        c = 1;
                    } else {
                        interfaceC2148.mo7104("Response not properly set up");
                        this.f66210.skip(i5);
                    }
                }
                interfaceC18663.mo27542().m25071(bArrM25072);
                return;
            }
            if (iM8906 != 0) {
                i5 = iM8906;
            }
            Integer numValueOf4 = Integer.valueOf(i5);
            Integer numValueOf5 = Integer.valueOf(iM33009);
            Object[] objArr2 = new Object[i6];
            objArr2[i] = numValueOf4;
            objArr2[c] = numValueOf5;
            throw new IOException(String.format("Message size %d exceeds maxiumum buffer size %d", objArr2));
        } catch (Throwable th) {
            interfaceC18663.mo27542().m25071(bArrM25072);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47092(InterfaceC13927 interfaceC13927) {
        InterfaceC18663 interfaceC18663 = this.f66212;
        byte[] bArrM25072 = interfaceC18663.mo27542().m25072();
        try {
            System.arraycopy(this.f66226, 0, bArrM25072, 0, 36);
            int iM8900 = C2913.m8900(2, bArrM25072) & HPKE.aead_EXPORT_ONLY;
            if (iM8900 < 33 || iM8900 + 4 > Math.min(65535, ((C13722) interfaceC18663.mo27540()).m33009())) {
                throw new IOException("Invalid payload size: " + iM8900);
            }
            int iM8906 = C2913.m8906(9, bArrM25072);
            if (interfaceC13927.mo10463() == 46 && (iM8906 == 0 || iM8906 == -2147483643)) {
                C0172 c0172 = (C0172) interfaceC13927;
                AbstractRunnableC7146.m19158(this.f66210, bArrM25072, 36, 27);
                interfaceC13927.decode(bArrM25072);
                int iM1304 = c0172.m1304() - 59;
                if (c0172.m28207() > 0 && iM1304 > 0 && iM1304 < 4) {
                    AbstractRunnableC7146.m19158(this.f66210, bArrM25072, 63, iM1304);
                }
                if (c0172.m1303() > 0) {
                    AbstractRunnableC7146.m19158(this.f66210, c0172.m1307(), c0172.m1310(), c0172.m1303());
                }
            } else {
                AbstractRunnableC7146.m19158(this.f66210, bArrM25072, 36, iM8900 - 32);
                interfaceC13927.decode(bArrM25072);
            }
            interfaceC18663.mo27542().m25071(bArrM25072);
        } catch (Throwable th) {
            interfaceC18663.mo27542().m25071(bArrM25072);
            throw th;
        }
    }

    @Override // l.AbstractRunnableC7146
    /* JADX INFO: renamed from: ֫ */
    public final void mo19165(Long l2) {
        synchronized (this.f21939) {
            int iM8900 = C2913.m8900(2, this.f66226) & HPKE.aead_EXPORT_ONLY;
            if (iM8900 < 33 || iM8900 + 4 > ((C13722) this.f66212.mo27540()).m32982()) {
                f66209.mo7104("Flusing stream input");
                InputStream inputStream = this.f66210;
                inputStream.skip(inputStream.available());
            } else {
                InterfaceC18663 interfaceC18663 = this.f66212;
                byte[] bArr = this.f66226;
                InterfaceC13495 c14283 = null;
                if (this.f66215) {
                    if (l2.longValue() == -1 && (65535 & C2913.m8902(16, bArr)) == 18) {
                        c14283 = new C8389(interfaceC18663.mo27540());
                    }
                } else if (l2.longValue() == 65535 && bArr[8] == 36) {
                    c14283 = new C14283(interfaceC18663.mo27540());
                }
                if (c14283 != null) {
                    InterfaceC2148 interfaceC2148 = f66209;
                    interfaceC2148.mo7088("Parsing notification");
                    mo19167(c14283);
                    interfaceC2148.mo7096("Received notification " + c14283);
                    return;
                }
                f66209.mo7104("Skipping message " + l2);
                if (m47112()) {
                    this.f66210.skip(iM8900 - 64);
                } else {
                    this.f66210.skip(iM8900 - 32);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m47106(AbstractC11422 abstractC11422, AbstractC11422 abstractC11423) throws C3037 {
        boolean z;
        if (abstractC11423.getErrorCode() == 196610) {
            abstractC11423.m28232(-1073741225);
        } else {
            abstractC11423.m28232(C3037.m9290(abstractC11423.getErrorCode()));
        }
        int errorCode = abstractC11423.getErrorCode();
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
                    throw new C22087(abstractC11423.getErrorCode());
                case -1073741662:
                case -1073741225:
                    m47091(abstractC11423, abstractC11422.getPath(), abstractC11422);
                    throw null;
                case -1073741637:
                    throw new C0089();
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
                            throw new C22087(abstractC11423.getErrorCode());
                        default:
                            InterfaceC2148 interfaceC2148 = f66209;
                            if (interfaceC2148.mo7086()) {
                                interfaceC2148.mo7088("Error code: 0x" + C12085.m29467(abstractC11423.getErrorCode(), 8) + " for " + abstractC11422.getClass().getSimpleName());
                            }
                            throw new C3037(abstractC11423.getErrorCode());
                    }
            }
        } else {
            z = true;
        }
        if (abstractC11423.mo28214()) {
            throw new C3037("Signature verification failed.");
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m47091(InterfaceC1543 interfaceC1543, String str, InterfaceC16359 interfaceC16359) throws C3037 {
        InterfaceC18663 interfaceC18663 = this.f66212;
        interfaceC18663.mo27540().getClass();
        try {
            C8599 c8599M47100 = m47100(this.f66212, str, interfaceC16359.mo6629(), interfaceC16359.mo6637(), 1);
            InterfaceC2148 interfaceC2148 = f66209;
            if (c8599M47100 == null) {
                if (interfaceC2148.mo7086()) {
                    interfaceC2148.mo7088("Error code: 0x".concat(C12085.m29467(interfaceC1543.getErrorCode(), 8)));
                }
                throw new C3037(interfaceC1543.getErrorCode());
            }
            if (interfaceC16359.mo6637() != null) {
                interfaceC18663.mo27540().getClass();
            }
            if (interfaceC2148.mo7086()) {
                interfaceC2148.mo7088("Got referral " + c8599M47100);
            }
            ((C13474) interfaceC18663.mo27541()).m32496(interfaceC18663, str, c8599M47100);
            throw new C7125(c8599M47100);
        } catch (C19369 e) {
            throw new C3037("Failed to get DFS referral", e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m47103(InterfaceC7578 interfaceC7578, AbstractC11422 abstractC11422) throws C3037 {
        m47111(interfaceC7578, abstractC11422, Collections.EMPTY_SET);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1543 m47111(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) throws C3037 {
        m47114();
        boolean z = this.f66215;
        if (z && !(interfaceC7578 instanceof AbstractC3429)) {
            throw new C3037("Not an SMB2 request ".concat(interfaceC7578.getClass().getName()));
        }
        if (!z && !(interfaceC7578 instanceof AbstractC11422)) {
            throw new C3037("Not an SMB1 request");
        }
        this.f66221.mo10543(interfaceC7578);
        if (interfaceC1543 != null) {
            interfaceC7578.mo28204(interfaceC1543);
            interfaceC1543.mo10436(interfaceC7578.getDigest());
        }
        try {
            InterfaceC2148 interfaceC2148 = f66209;
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("Sending " + interfaceC7578);
            }
            interfaceC7578.getClass();
            if (interfaceC7578 instanceof AbstractC18246) {
                m47097(interfaceC7578, interfaceC1543, set);
            } else {
                if (interfaceC1543 != null) {
                    interfaceC1543.mo10459(interfaceC7578.mo10463());
                }
                interfaceC1543 = mo19163(interfaceC7578, interfaceC1543, set);
            }
            if (interfaceC2148.mo7099()) {
                interfaceC2148.mo7101("Response is " + interfaceC1543);
            }
            m47098(interfaceC7578);
            return interfaceC1543;
        } catch (C3037 e) {
            throw e;
        } catch (IOException e2) {
            throw new C3037(e2.getMessage(), e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c3 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private boolean m47098(InterfaceC7578 interfaceC7578) throws C3037 {
        InterfaceC11380 interfaceC11380;
        InterfaceC1543 interfaceC1543Mo5429;
        int iM12559;
        while (true) {
            boolean z = true;
            if (interfaceC7578 == null) {
                return true;
            }
            if (this.f66215) {
                interfaceC11380 = (AbstractC3429) interfaceC7578;
                interfaceC1543Mo5429 = interfaceC7578.mo5429();
                switch (interfaceC1543Mo5429.getErrorCode()) {
                    case -2147483643:
                        if (!(interfaceC1543Mo5429 instanceof C9801) && (!(interfaceC1543Mo5429 instanceof C4156) || ((iM12559 = ((C4156) interfaceC1543Mo5429).m12559()) != 1163287 && iM12559 != 1130508))) {
                        }
                        z = false;
                        if (interfaceC1543Mo5429.mo28214()) {
                            throw new C7976("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC7578 = interfaceC7578.mo20322();
                        break;
                    case -2147483642:
                    case 0:
                        if (interfaceC1543Mo5429.mo28214()) {
                            throw new C7976("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC7578 = interfaceC7578.mo20322();
                        break;
                        break;
                    case -1073741808:
                    case -1073741637:
                        throw new C0089();
                    case -1073741802:
                    case 259:
                    case 267:
                    case 268:
                        z = false;
                        if (interfaceC1543Mo5429.mo28214()) {
                            throw new C7976("Signature verification failed.");
                        }
                        if (!z) {
                            return false;
                        }
                        interfaceC7578 = interfaceC7578.mo20322();
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
                        throw new C22087(interfaceC1543Mo5429.getErrorCode());
                    case -1073741225:
                        if (!(interfaceC11380 instanceof InterfaceC16359)) {
                            throw new C3037("Invalid request for a DFS NT_STATUS_PATH_NOT_COVERED response ".concat(interfaceC11380.getClass().getName()));
                        }
                        InterfaceC16359 interfaceC16359 = (InterfaceC16359) interfaceC11380;
                        m47091(interfaceC1543Mo5429, interfaceC16359.mo6641(), interfaceC16359);
                        throw null;
                    default:
                        break;
                }
            } else {
                if (!m47106((AbstractC11422) interfaceC7578, (AbstractC11422) interfaceC7578.mo5429())) {
                    return false;
                }
                interfaceC7578 = interfaceC7578.mo20322();
            }
        }
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Error code: 0x" + C12085.m29467(interfaceC1543Mo5429.getErrorCode(), 8) + " for " + interfaceC11380.getClass().getSimpleName());
        }
        throw new C3037(interfaceC1543Mo5429.getErrorCode());
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m47097(InterfaceC7578 interfaceC7578, InterfaceC1543 interfaceC1543, Set set) {
        long jMo19177;
        interfaceC1543.mo10459(interfaceC7578.mo10463());
        AbstractC18246 abstractC18246 = (AbstractC18246) interfaceC7578;
        AbstractC17540 abstractC17540 = (AbstractC17540) interfaceC1543;
        abstractC17540.reset();
        try {
            try {
                abstractC18246.m42531(this.f66212.mo27542().m25072());
                abstractC18246.nextElement();
                if (abstractC18246.hasMoreElements()) {
                    AbstractC11422 c7188 = new C7188(this.f66212.mo27540());
                    mo19163((InterfaceC7578) abstractC18246, (InterfaceC1543) c7188, set);
                    if (c7188.getErrorCode() != 0) {
                        m47106((AbstractC11422) abstractC18246, c7188);
                    }
                    abstractC18246.nextElement();
                    jMo19177 = abstractC18246.mo28210();
                } else {
                    jMo19177 = mo19177(abstractC18246);
                }
                long j = jMo19177;
                try {
                    abstractC17540.mo28216();
                    long jMo19173 = mo19173((InterfaceC7578) abstractC18246);
                    if (set.contains(EnumC0214.NO_TIMEOUT)) {
                        abstractC17540.mo28203((Long) null);
                    } else {
                        abstractC17540.mo28203(Long.valueOf(System.currentTimeMillis() + jMo19173));
                    }
                    abstractC17540.m41014(this.f66212.mo27542().m25072());
                    this.f21934.put(Long.valueOf(j), abstractC17540);
                    while (true) {
                        InterfaceC2148 interfaceC2148 = f66209;
                        try {
                            mo19166((InterfaceC7578) abstractC18246);
                            if (!abstractC18246.hasMoreElements()) {
                                break;
                            } else {
                                abstractC18246.nextElement();
                            }
                        } catch (IOException e) {
                            interfaceC2148.mo7083("send failed", (Throwable) e);
                            try {
                                m19178();
                            } catch (IOException e2) {
                                e.addSuppressed(e2);
                                interfaceC2148.mo7091("disconnect failed", (Throwable) e2);
                            }
                            throw e;
                        }
                    }
                    synchronized (abstractC17540) {
                        while (true) {
                            if (abstractC17540.mo28213() && !abstractC17540.hasMoreElements()) {
                            }
                            if (set.contains(EnumC0214.NO_TIMEOUT)) {
                                abstractC17540.wait();
                                InterfaceC2148 interfaceC2149 = f66209;
                                if (interfaceC2149.mo7099()) {
                                    interfaceC2149.mo7101("Wait returned " + mo19180());
                                }
                                if (mo19180()) {
                                    throw new EOFException("Transport closed while waiting for result");
                                }
                            } else {
                                abstractC17540.wait(jMo19173);
                                jMo19173 = abstractC17540.mo28225().longValue() - System.currentTimeMillis();
                                if (jMo19173 <= 0) {
                                    throw new C1708(this + " timedout waiting for response to " + abstractC18246);
                                }
                            }
                        }
                    }
                    if (!abstractC17540.mo28213()) {
                        throw new C1708("Failed to read response");
                    }
                    if (abstractC17540.getErrorCode() != 0) {
                        m47106((AbstractC11422) abstractC18246, (AbstractC11422) abstractC17540);
                    }
                    this.f21934.remove(Long.valueOf(j));
                    this.f66212.mo27542().m25071(abstractC17540.m41016());
                    this.f66212.mo27542().m25071(abstractC18246.m42532());
                } catch (Throwable th) {
                    this.f21934.remove(Long.valueOf(j));
                    this.f66212.mo27542().m25071(abstractC17540.m41016());
                    throw th;
                }
            } catch (InterruptedException e3) {
                throw new C1708(e3);
            }
        } catch (Throwable th2) {
            this.f66212.mo27542().m25071(abstractC18246.m42532());
            throw th2;
        }
    }

    @Override // l.AbstractRunnableC7146
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[");
        sb.append(this.f66225);
        sb.append(":");
        sb.append(this.f66222);
        sb.append(",state=");
        sb.append(this.f21933);
        sb.append(",signingEnforced=");
        sb.append(this.f66216);
        sb.append(",usage=");
        return C15942.m37718(sb, m19176(), "]");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8599 m47100(InterfaceC18663 interfaceC18663, String str, String str2, String str3, int i) {
        C2249 c2249M15686;
        String str4 = str;
        int iM7452 = i;
        InterfaceC2148 interfaceC2148 = f66209;
        if (interfaceC2148.mo7086()) {
            interfaceC2148.mo7088("Resolving DFS path " + str4);
        }
        int i2 = 0;
        if (str.length() >= 2 && str4.charAt(0) == '\\' && str4.charAt(1) == '\\') {
            throw new C3037("Path must not start with double slash: ".concat(str4));
        }
        C23373 c23373M47102 = m47102(interfaceC18663, str2, str3);
        try {
            C20552 c20552M51804 = c23373M47102.m51804();
            try {
                C19141 c19141M51799 = c23373M47102.m51799("IPC$");
                try {
                    C17040 c17040 = new C17040(str4);
                    if (m47112()) {
                        C2745 c2745 = new C2745(interfaceC18663.mo27540(), 393620);
                        c2745.m8490();
                        c2745.m8488(c17040);
                        c2249M15686 = (C2249) ((C4156) c19141M51799.m44197(c2745, new EnumC0214[0])).m12557(C2249.class);
                    } else {
                        C5546 c5546 = new C5546(interfaceC18663.mo27540());
                        c19141M51799.m44196(new C0606(str4, interfaceC18663.mo27540()), c5546, Collections.EMPTY_SET);
                        c2249M15686 = c5546.m15686();
                    }
                    C8599 c8599 = null;
                    if (c2249M15686.m7452() == 0) {
                        c19141M51799.m44194();
                        c20552M51804.m19171();
                        c23373M47102.m51813();
                        return null;
                    }
                    if (iM7452 == 0 || c2249M15686.m7452() < iM7452) {
                        iM7452 = c2249M15686.m7452();
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis() + (((C13722) interfaceC18663.mo27540()).m32998() * 1000);
                    C3660[] c3660ArrM7451 = c2249M15686.m7451();
                    while (i2 < iM7452) {
                        C8599 c8599M22328 = C8599.m22328(c3660ArrM7451[i2], str4, jCurrentTimeMillis, c2249M15686.m7453());
                        c8599M22328.m22331(str3);
                        if ((c2249M15686.m7454() & 2) == 0 && (c8599M22328.m22342() & 2) == 0) {
                            interfaceC2148.mo7088("Non-root referral is not final " + c2249M15686);
                            c8599M22328.m22334();
                        }
                        if (c8599 != null) {
                            c8599.m22333(c8599M22328);
                        }
                        i2++;
                        str4 = str;
                        c8599 = c8599M22328;
                    }
                    if (interfaceC2148.mo7086()) {
                        interfaceC2148.mo7088("Got referral " + c8599);
                    }
                    c19141M51799.m44194();
                    c20552M51804.m19171();
                    c23373M47102.m51813();
                    return c8599;
                } catch (Throwable th) {
                    try {
                        c19141M51799.m44194();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                c20552M51804.m19171();
                throw th3;
            }
            try {
                c20552M51804.m19171();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        } catch (Throwable th5) {
            try {
                c23373M47102.m51813();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] m47116() {
        return this.f66219;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m47096(byte[] bArr) {
        synchronized (this.f66219) {
            this.f66219 = m47107(bArr.length, bArr, this.f66219);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m47107(int i, byte[] bArr, byte[] bArr2) throws C0089 {
        InterfaceC20594 interfaceC20594;
        if (!this.f66215 || (interfaceC20594 = this.f66221) == null) {
            throw new C0089();
        }
        C3450 c3450 = (C3450) interfaceC20594;
        if (!c3450.mo10552().m48659(EnumC21485.SMB311)) {
            throw new C0089();
        }
        if (c3450.m10546() == 1) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(XMSSKeyParameters.SHA_512);
                if (bArr2 != null) {
                    messageDigest.update(bArr2);
                }
                messageDigest.update(bArr, 0, i);
                return messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new C0317(e);
            }
        }
        throw new C0089();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m47099(C3450 c3450) {
        if (this.f66216) {
            return 3;
        }
        return (c3450 == null || !c3450.mo10539()) ? 1 : 3;
    }
}
