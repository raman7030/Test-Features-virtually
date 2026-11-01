package p067l;

import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.color.MaterialColors;
import com.umeng.analytics.pro.C0698cb;
import com.umeng.analytics.pro.C0708d;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Vector;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.AEADBadTagException;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.۟ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: HAFC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9383 {

    /* JADX INFO: renamed from: ֫ۧ */
    public static final byte[] f25565;

    /* JADX INFO: renamed from: ۧۧ */
    public static InterfaceC23465 f25566;

    /* JADX INFO: renamed from: ֡֫ */
    public InterfaceC24727 f25568;

    /* JADX INFO: renamed from: ֨֫ */
    public InterfaceC3348 f25570;

    /* JADX INFO: renamed from: ֫ */
    public byte[] f25571;

    /* JADX INFO: renamed from: ֫֫ */
    public InterfaceC22046 f25572;

    /* JADX INFO: renamed from: ۖ */
    public C17823 f25573;

    /* JADX INFO: renamed from: ۖ֫ */
    public C10054 f25574;

    /* JADX INFO: renamed from: ۗ֫ */
    public byte[] f25576;

    /* JADX INFO: renamed from: ۘ */
    public InterfaceC24727 f25577;

    /* JADX INFO: renamed from: ۜ */
    public byte[] f25585;

    /* JADX INFO: renamed from: ۠֫ */
    public byte[] f25590;

    /* JADX INFO: renamed from: ۢ */
    public byte[] f25593;

    /* JADX INFO: renamed from: ۢ֫ */
    public Runnable f25594;

    /* JADX INFO: renamed from: ۤ֫ */
    public RunnableC13407 f25596;

    /* JADX INFO: renamed from: ۧ */
    public byte[] f25597;

    /* JADX INFO: renamed from: ۨ */
    public String f25599;

    /* JADX INFO: renamed from: ۬֫ */
    public Socket f25604;

    /* JADX INFO: renamed from: ܰ֫ */
    public String f25606;

    /* JADX INFO: renamed from: ܳ */
    public byte[] f25607;

    /* JADX INFO: renamed from: ܳ֫ */
    public C21769 f25608;

    /* JADX INFO: renamed from: ܶ֫ */
    public byte[] f25610;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f25613;

    /* JADX INFO: renamed from: ܽ֫ */
    public C21099 f25614;

    /* JADX INFO: renamed from: ܿ */
    public byte[] f25615;

    /* JADX INFO: renamed from: ᩳ */
    public byte[] f25617;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f25620;

    /* JADX INFO: renamed from: ᩵ */
    public InterfaceC3348 f25621;

    /* JADX INFO: renamed from: ᩸ */
    public InterfaceC22046 f25627;

    /* JADX INFO: renamed from: ᩺֫ */
    public InterfaceC20093 f25632;

    /* JADX INFO: renamed from: ᩻ */
    public byte[] f25633;

    /* JADX INFO: renamed from: ᩻֫ */
    public C9383 f25634;

    /* JADX INFO: renamed from: ᩷ */
    public byte[] f25625 = "SSH-2.0-JSCH_2.27.6".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩸֫ */
    public int f25628 = 0;

    /* JADX INFO: renamed from: ᩹֫ */
    public int f25630 = 0;

    /* JADX INFO: renamed from: ۛ */
    public String[] f25583 = null;

    /* JADX INFO: renamed from: ܿ֫ */
    public volatile boolean f25616 = false;

    /* JADX INFO: renamed from: ᩶ */
    public volatile boolean f25623 = false;

    /* JADX INFO: renamed from: ۬ */
    public boolean f25603 = true;

    /* JADX INFO: renamed from: ۗ */
    public boolean f25575 = true;

    /* JADX INFO: renamed from: ۧ֫ */
    public volatile boolean f25598 = true;

    /* JADX INFO: renamed from: ۙ */
    public volatile boolean f25579 = false;

    /* JADX INFO: renamed from: ۫ */
    public boolean f25601 = true;

    /* JADX INFO: renamed from: ᩵֫ */
    public boolean f25622 = false;

    /* JADX INFO: renamed from: ᩳ֫ */
    public volatile boolean f25618 = false;

    /* JADX INFO: renamed from: ܶ */
    public Thread f25609 = null;

    /* JADX INFO: renamed from: ᩷֫ */
    public Object f25626 = new Object();

    /* JADX INFO: renamed from: ۟֫ */
    public boolean f25588 = false;

    /* JADX INFO: renamed from: ۡ */
    public boolean f25591 = false;

    /* JADX INFO: renamed from: ۠ */
    public Hashtable f25589 = null;

    /* JADX INFO: renamed from: ᩶֫ */
    public int f25624 = 1;

    /* JADX INFO: renamed from: ۙ֫ */
    public volatile String[] f25580 = null;

    /* JADX INFO: renamed from: ۫֫ */
    public volatile boolean f25602 = false;

    /* JADX INFO: renamed from: ۜ֫ */
    public volatile long f25586 = 0;

    /* JADX INFO: renamed from: ۡ֫ */
    public int f25592 = 6;

    /* JADX INFO: renamed from: ܺ */
    public int f25611 = 0;

    /* JADX INFO: renamed from: ۘ֫ */
    public byte[] f25578 = null;

    /* JADX INFO: renamed from: ۛ֫ */
    public ThreadFactoryC8042 f25584 = new ThreadFactoryC8042();

    /* JADX INFO: renamed from: ᩹ */
    public boolean f25629 = false;

    /* JADX INFO: renamed from: ֡ */
    public final ArrayList f25567 = new ArrayList();

    /* JADX INFO: renamed from: ۚ */
    public final ReentrantReadWriteLock f25581 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ܰ */
    public volatile boolean f25605 = false;

    /* JADX INFO: renamed from: ۟ */
    public volatile boolean f25587 = false;

    /* JADX INFO: renamed from: ܺ֫ */
    public volatile String[] f25612 = null;

    /* JADX INFO: renamed from: ۨ֫ */
    public int[] f25600 = new int[1];

    /* JADX INFO: renamed from: ֨ */
    public int[] f25569 = new int[1];

    /* JADX INFO: renamed from: ۚ֫ */
    public int f25582 = 8;

    /* JADX INFO: renamed from: ᩴ */
    public int f25619 = 8;

    /* JADX INFO: renamed from: ۤ */
    public C15417 f25595 = new C15417();

    /* JADX INFO: renamed from: ᩺ */
    public C6346 f25631 = null;

    /* JADX INFO: renamed from: ֫ */
    public final void m21833(C9383 c9383) {
        this.f25634 = c9383;
    }

    public C9383(C21769 c21769, String str, String str2, int i) throws C14392 {
        String property = null;
        this.f25599 = "127.0.0.1";
        this.f25620 = 22;
        this.f25606 = null;
        this.f25608 = c21769;
        C17823 c17823 = new C17823();
        this.f25573 = c17823;
        this.f25574 = new C10054(c17823);
        this.f25606 = str;
        this.f25599 = str2;
        this.f25620 = i;
        if (str == null) {
            try {
                property = System.getProperty("user.name");
            } catch (SecurityException unused) {
            }
            this.f25606 = property;
        }
        if (this.f25606 == null) {
            throw new C14392("username is not given.");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21831(Runnable runnable) {
        this.f25594 = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c3, code lost:
    
        r14.f25605 = false;
        r14.f25587 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c7, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21830() throws C14392 {
        boolean z;
        AbstractC11376 abstractC11376;
        if (this.f25616) {
            throw new C14392("session is already connected");
        }
        this.f25598 = true;
        this.f25614 = new C21099();
        if (f25566 == null) {
            try {
                f25566 = (InterfaceC23465) Class.forName(m21829("random")).asSubclass(InterfaceC23465.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new C14392(e.toString(), e);
            }
        }
        C10054.m23424(f25566);
        m21850().getClass();
        try {
            try {
                Socket socketM46883 = C20764.m46883(this.f25620, C0180b.f790j0, this.f25599);
                this.f25604 = socketM46883;
                InputStream inputStream = socketM46883.getInputStream();
                OutputStream outputStream = this.f25604.getOutputStream();
                this.f25604.setTcpNoDelay(true);
                this.f25614.m47705(inputStream);
                this.f25614.m47706(outputStream);
                Socket socket = this.f25604;
                if (socket != null) {
                    socket.setSoTimeout(C0180b.f790j0);
                }
                this.f25616 = true;
                m21850().getClass();
                this.f25608.m49097(this);
                byte[] bArr = this.f25625;
                int length = bArr.length;
                int i = length + 2;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                bArr2[length] = C0698cb.f2569k;
                bArr2[length + 1] = 10;
                C21099 c21099 = this.f25614;
                c21099.f66298.write(bArr2, 0, i);
                c21099.f66298.flush();
                while (true) {
                    int i2 = 0;
                    int iM47707 = 0;
                    while (i2 < this.f25573.f53185.length && (iM47707 = this.f25614.m47707()) >= 0) {
                        this.f25573.f53185[i2] = (byte) iM47707;
                        i2++;
                        if (iM47707 == 10) {
                            break;
                        }
                    }
                    if (iM47707 < 0) {
                        throw new C14392("connection is closed by foreign host");
                    }
                    byte[] bArr3 = this.f25573.f53185;
                    if (bArr3[i2 - 1] == 10) {
                        int i3 = i2 - 1;
                        if (i3 > 0) {
                            i2 -= 2;
                            if (bArr3[i2] != 13) {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                    }
                    if (i2 > 3 && (i2 == bArr3.length || (bArr3[0] == 83 && bArr3[1] == 83 && bArr3[2] == 72 && bArr3[3] == 45))) {
                        if (i2 == bArr3.length || i2 < 7 || (bArr3[4] == 49 && bArr3[6] != 57)) {
                            throw new C14392("invalid server's version string");
                        }
                        byte[] bArr4 = new byte[i2];
                        this.f25593 = bArr4;
                        System.arraycopy(bArr3, 0, bArr4, 0, i2);
                        this.f25602 = C20764.m46882(this.f25593).startsWith("SSH-2.0-OpenSSH_7.4");
                        m21850().getClass();
                        Runnable runnable = this.f25594;
                        if (runnable != null) {
                            runnable.run();
                        }
                        this.f25603 = m21829("enable_server_sig_algs").equals("yes");
                        this.f25575 = m21829("enable_ext_info_in_auth").equals("yes");
                        this.f25601 = m21829("enable_strict_kex").equals("yes");
                        this.f25622 = m21829("require_strict_kex").equals("yes");
                        m21819();
                        C17823 c17823 = this.f25573;
                        m21836(c17823);
                        this.f25573 = c17823;
                        if (c17823.m40458() != 20) {
                            this.f25605 = false;
                            throw new C14392("invalid protocol: " + ((int) this.f25573.m40458()));
                        }
                        m21850().getClass();
                        AbstractC18100 abstractC18100M21820 = m21820(this.f25573);
                        do {
                            C17823 c17824 = this.f25573;
                            m21836(c17824);
                            this.f25573 = c17824;
                            if (abstractC18100M21820.mo20902() == this.f25573.m40458()) {
                                this.f25586 = System.currentTimeMillis();
                                boolean zMo20901 = abstractC18100M21820.mo20901(this.f25573);
                                if (!zMo20901) {
                                    this.f25605 = false;
                                    throw new C14392("verify: " + zMo20901);
                                }
                            } else {
                                this.f25605 = false;
                                throw new C14392("invalid protocol(kex): " + ((int) this.f25573.m40458()));
                            }
                        } while (abstractC18100M21820.mo20902() != 0);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f25587 = true;
                        m21814(this.f25599, this.f25620, abstractC18100M21820);
                        this.f25587 = false;
                        this.f25586 = (System.currentTimeMillis() - jCurrentTimeMillis) + this.f25586;
                        C10054 c10054 = this.f25574;
                        c10054.m23425();
                        this.f25573.m40448((byte) 21);
                        m21845(c10054);
                        this.f25608.m49100().getClass();
                        C17823 c17825 = this.f25573;
                        m21836(c17825);
                        this.f25573 = c17825;
                        if (c17825.m40458() == 21) {
                            m21850().getClass();
                            m21816(abstractC18100M21820);
                            this.f25598 = false;
                            if (this.f25603 && this.f25575 && this.f25623) {
                                m21818();
                            }
                            try {
                                String strM21829 = m21829("MaxAuthTries");
                                if (strM21829 != null) {
                                    this.f25592 = Integer.parseInt(strM21829);
                                }
                                try {
                                    C17409 c17409 = (C17409) Class.forName(m21829("userauth.none")).asSubclass(C17409.class).getDeclaredConstructor(null).newInstance(null);
                                    boolean zMo9902 = c17409.mo9902(this);
                                    String strM218210 = m21829("PreferredAuthentications");
                                    String[] strArrM46888 = C20764.m46888(strM218210);
                                    if (zMo9902) {
                                        strM218210 = null;
                                    } else {
                                        String strM39629 = c17409.m39629();
                                        if (strM39629 != null) {
                                            strM218210 = strM39629.toLowerCase(Locale.ROOT);
                                        }
                                    }
                                    String[] strArrM46889 = C20764.m46888(strM218210);
                                    int i4 = 0;
                                    loop3: while (true) {
                                        z = false;
                                        while (!zMo9902 && strArrM46888 != null && i4 < strArrM46888.length) {
                                            int i5 = i4 + 1;
                                            String str = strArrM46888[i4];
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 < strArrM46889.length) {
                                                    if (strArrM46889[i6].equals(str)) {
                                                        m21850().getClass();
                                                        try {
                                                            if (m21829("userauth." + str) != null) {
                                                                abstractC11376 = (AbstractC11376) Class.forName(m21829("userauth." + str)).asSubclass(AbstractC11376.class).getDeclaredConstructor(null).newInstance(null);
                                                            } else {
                                                                abstractC11376 = null;
                                                            }
                                                        } catch (Exception unused) {
                                                            m21850().getClass();
                                                        }
                                                        if (abstractC11376 != null) {
                                                            try {
                                                                zMo9902 = abstractC11376.mo9902(this);
                                                                if (zMo9902) {
                                                                    m21850().getClass();
                                                                }
                                                                z = false;
                                                            } catch (RuntimeException e2) {
                                                                throw e2;
                                                            } catch (C5675 unused2) {
                                                                z = true;
                                                            } catch (C8357 e3) {
                                                                String strM19283 = e3.m19283();
                                                                String[] strArrM468810 = C20764.m46888(strM19283);
                                                                int i7 = !strM218210.equals(strM19283) ? 0 : i5;
                                                                strM218210 = strM19283;
                                                                strArrM46889 = strArrM468810;
                                                                i4 = i7;
                                                            } catch (C14392 e4) {
                                                                throw e4;
                                                            } catch (Exception unused3) {
                                                                m21850().getClass();
                                                                z = false;
                                                            }
                                                        }
                                                    } else {
                                                        i6++;
                                                    }
                                                }
                                                i4 = i5;
                                            }
                                        }
                                        break loop3;
                                    }
                                    if (!zMo9902) {
                                        if (this.f25611 >= this.f25592) {
                                            m21850().getClass();
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(z ? "Auth cancel" : "Auth fail");
                                        sb.append(" for methods '");
                                        sb.append(strM218210);
                                        sb.append("'");
                                        throw new C14392(sb.toString());
                                    }
                                    Socket socket2 = this.f25604;
                                    if (socket2 != null) {
                                        socket2.setSoTimeout(0);
                                    }
                                    this.f25618 = true;
                                    synchronized (this.f25626) {
                                        if (this.f25616) {
                                            Thread threadNewThread = m21852().newThread(new RunnableC13407(this));
                                            this.f25609 = threadNewThread;
                                            threadNewThread.setName("Connect thread " + this.f25599 + " session");
                                            this.f25609.start();
                                            m21823();
                                        }
                                    }
                                    C20764.m46890(this.f25578);
                                    this.f25578 = null;
                                    return;
                                } catch (Exception e5) {
                                    throw new C14392(e5.toString(), e5);
                                }
                            } catch (NumberFormatException e6) {
                                throw new C14392("MaxAuthTries: " + m21829("MaxAuthTries"), e6);
                            }
                        }
                        this.f25605 = false;
                        throw new C14392("invalid protocol(newkeys): " + ((int) this.f25573.m40458()));
                    }
                }
            } catch (Exception e7) {
                this.f25605 = false;
                try {
                    if (this.f25616) {
                        String string = e7.toString();
                        this.f25574.m23425();
                        this.f25573.m40449(string.length() + 15 + m21847());
                        this.f25573.m40448((byte) 1);
                        this.f25573.m40459(3);
                        this.f25573.m40470(C20764.m46893(string));
                        this.f25573.m40470(C20764.m46893("en"));
                        m21845(this.f25574);
                    }
                } catch (Exception unused4) {
                }
                try {
                    m21843();
                } catch (Exception unused5) {
                }
                this.f25616 = false;
                if (e7 instanceof RuntimeException) {
                    throw ((RuntimeException) e7);
                }
                if (e7 instanceof C14392) {
                    throw ((C14392) e7);
                }
                throw new C14392("Session.connect: " + e7, e7);
            }
        } catch (Throwable th) {
            C20764.m46890(this.f25578);
            this.f25578 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private AbstractC18100 m21820(C17823 c17823) throws C14392 {
        boolean z;
        int iM40464 = c17823.m40464();
        boolean z2 = true;
        if (iM40464 != c17823.m40469()) {
            c17823.m40447();
            this.f25607 = new byte[c17823.f53186 - 5];
        } else {
            this.f25607 = new byte[(iM40464 - 1) - c17823.m40447()];
        }
        byte[] bArr = c17823.f53185;
        int i = c17823.f53187;
        byte[] bArr2 = this.f25607;
        int i2 = 0;
        System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        if (this.f25598) {
            if (this.f25601 || this.f25622) {
                C17823 c17824 = new C17823(this.f25607);
                c17824.f53187 = 17;
                byte[] bArrM40471 = c17824.m40471();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= bArrM40471.length) {
                        z = false;
                        break;
                    }
                    while (i3 < bArrM40471.length && bArrM40471[i3] != 44) {
                        i3++;
                    }
                    if (i4 != i3 && "kex-strict-s-v00@openssh.com".equals(C20764.m46879(i4, i3 - i4, bArrM40471))) {
                        z = true;
                        break;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                }
                this.f25579 = z;
                if (this.f25579) {
                    this.f25608.m49100().getClass();
                    if (this.f25628 != 1) {
                        throw new C15732("KEXINIT not first packet from server");
                    }
                } else if (this.f25622) {
                    throw new C15732("Strict KEX not supported by server");
                }
            }
            if (this.f25603) {
                C17823 c17825 = new C17823(this.f25607);
                c17825.f53187 = 17;
                byte[] bArrM40472 = c17825.m40471();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= bArrM40472.length) {
                        z2 = false;
                        break;
                    }
                    while (i5 < bArrM40472.length && bArrM40472[i5] != 44) {
                        i5++;
                    }
                    if (i6 != i5) {
                        if ("ext-info-s".equals(C20764.m46879(i6, i5 - i6, bArrM40472))) {
                            break;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    }
                }
                this.f25623 = z2;
                if (this.f25623) {
                    this.f25608.m49100().getClass();
                }
            }
        }
        if (!this.f25605) {
            m21819();
        }
        byte[] bArr3 = this.f25607;
        byte[] bArr4 = this.f25615;
        String[] strArr = new String[10];
        C17823 c17826 = new C17823(bArr3);
        c17826.f53187 = 17;
        C17823 c17827 = new C17823(bArr4);
        c17827.f53187 = 17;
        this.f25608.m49100().getClass();
        int i7 = 0;
        for (int i8 = 10; i7 < i8; i8 = 10) {
            byte[] bArrM40473 = c17826.m40471();
            byte[] bArrM40474 = c17827.m40471();
            int i9 = 0;
            int i10 = 0;
            while (i9 < bArrM40474.length) {
                while (i9 < bArrM40474.length && bArrM40474[i9] != 44) {
                    i9++;
                }
                if (i10 == i9) {
                    int length = bArrM40474.length;
                    Charset charset = StandardCharsets.UTF_8;
                    throw new C7016(i7, new String(bArrM40474, i2, length, charset), new String(bArrM40473, i2, bArrM40473.length, charset));
                }
                String strM46879 = C20764.m46879(i10, i9 - i10, bArrM40474);
                int i11 = 0;
                int i12 = 0;
                while (i12 < bArrM40473.length) {
                    while (i12 < bArrM40473.length && bArrM40473[i12] != 44) {
                        i12++;
                    }
                    if (i11 == i12) {
                        int length2 = bArrM40474.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        throw new C7016(i7, new String(bArrM40474, 0, length2, charset2), new String(bArrM40473, 0, bArrM40473.length, charset2));
                    }
                    if (strM46879.equals(C20764.m46879(i11, i12 - i11, bArrM40473))) {
                        strArr[i7] = strM46879;
                        break;
                    }
                    i12++;
                    i11 = i12;
                }
                i2 = 0;
                i10 = i9 + 1;
                i9 = i10;
            }
            if (i9 == 0) {
                strArr[i7] = "";
            } else if (strArr[i7] == null) {
                int length3 = bArrM40474.length;
                Charset charset3 = StandardCharsets.UTF_8;
                throw new C7016(i7, new String(bArrM40474, 0, length3, charset3), new String(bArrM40473, 0, bArrM40473.length, charset3));
            }
            i7++;
            i2 = 0;
        }
        try {
            if (((InterfaceC24727) Class.forName(m21829(strArr[3])).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null)).mo4577()) {
                strArr[5] = null;
            }
            if (((InterfaceC24727) Class.forName(m21829(strArr[2])).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null)).mo4577()) {
                strArr[4] = null;
            }
            this.f25608.m49100().getClass();
            this.f25583 = strArr;
            if (strArr[0].equals("ext-info-c") || this.f25583[0].equals("ext-info-s") || this.f25583[0].equals("kex-strict-c-v00@openssh.com") || this.f25583[0].equals("kex-strict-s-v00@openssh.com")) {
                throw new C14392("Invalid Kex negotiated: " + this.f25583[0]);
            }
            if (!this.f25618 && (this.f25583[2].equals("none") || this.f25583[3].equals("none"))) {
                throw new C14392("NONE Cipher should not be chosen before authentification is successed.");
            }
            try {
                AbstractC18100 abstractC18100 = (AbstractC18100) Class.forName(m21829(this.f25583[0])).asSubclass(AbstractC18100.class).getDeclaredConstructor(null).newInstance(null);
                byte[] bArr5 = this.f25593;
                byte[] bArr6 = this.f25625;
                byte[] bArr7 = this.f25607;
                byte[] bArr8 = this.f25615;
                abstractC18100.f54037 = this;
                abstractC18100.mo20900(this, bArr5, bArr6, bArr7, bArr8);
                return abstractC18100;
            } catch (Exception | LinkageError e) {
                throw new C14392(e.toString(), e);
            }
        } catch (Exception | LinkageError e2) {
            throw new C14392(e2.toString(), e2);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final String[] m21839() {
        return this.f25612;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX INFO: renamed from: ۘ */
    private void m21819() throws C14392 {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        if (this.f25605) {
            return;
        }
        String strM21829 = m21829("cipher.c2s");
        String strM218210 = m21829("cipher.s2c");
        String strM218211 = m21829("CheckCiphers");
        C21769 c21769 = this.f25608;
        int i = -1;
        if (strM218211 == null || strM218211.length() == 0) {
            strArr = null;
        } else {
            c21769.m49100().getClass();
            String strM218212 = m21829("cipher.c2s");
            String strM218213 = m21829("cipher.s2c");
            Vector vector = new Vector();
            for (String str : C20764.m46888(strM218211)) {
                if ((strM218213.indexOf(str) != -1 || strM218212.indexOf(str) != -1) && !m21826(m21829(str))) {
                    vector.addElement(str);
                }
            }
            if (vector.size() == 0) {
                strArr = null;
            } else {
                strArr = new String[vector.size()];
                System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
                c21769.m49100().getClass();
            }
        }
        if (strArr != null && strArr.length > 0) {
            this.f25608.m49100().getClass();
            strM21829 = C20764.m46880(strM21829, strArr);
            strM218210 = C20764.m46880(strM218210, strArr);
            if (strM21829 == null || strM218210 == null) {
                throw new C14392("There are not any available ciphers.");
            }
            this.f25608.m49100().getClass();
        }
        String str2 = strM218210;
        String strM218214 = m21829("mac.c2s");
        String strM218215 = m21829("mac.s2c");
        String strM218216 = m21829("CheckMacs");
        C21769 c217610 = this.f25608;
        if (strM218216 == null || strM218216.length() == 0) {
            strArr2 = null;
        } else {
            c217610.m49100().getClass();
            String strM218217 = m21829("mac.c2s");
            String strM218218 = m21829("mac.s2c");
            Vector vector2 = new Vector();
            String[] strArrM46888 = C20764.m46888(strM218216);
            int i2 = 0;
            while (i2 < strArrM46888.length) {
                String str3 = strArrM46888[i2];
                if (strM218218.indexOf(str3) != i || strM218217.indexOf(str3) != i) {
                    try {
                        InterfaceC3348 interfaceC3348 = (InterfaceC3348) Class.forName(m21829(str3)).asSubclass(InterfaceC3348.class).getDeclaredConstructor(null).newInstance(null);
                        interfaceC3348.init(new byte[interfaceC3348.getBlockSize()]);
                    } catch (Exception | LinkageError unused) {
                        vector2.addElement(str3);
                    }
                }
                i2++;
                i = -1;
            }
            if (vector2.size() == 0) {
                strArr2 = null;
            } else {
                strArr2 = new String[vector2.size()];
                System.arraycopy(vector2.toArray(), 0, strArr2, 0, vector2.size());
                c217610.m49100().getClass();
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            this.f25608.m49100().getClass();
            String strM46880 = C20764.m46880(strM218214, strArr2);
            String strM46881 = C20764.m46880(strM218215, strArr2);
            if (strM46880 == null || strM46881 == null) {
                throw new C14392("There are not any available macs.");
            }
            this.f25608.m49100().getClass();
        }
        String strM218219 = m21829("kex");
        String strM218220 = m21829("CheckKexes");
        C21769 c217611 = this.f25608;
        if (strM218220 == null || strM218220.length() == 0) {
            strArr3 = null;
        } else {
            c217611.m49100().getClass();
            Vector vector3 = new Vector();
            String[] strArrM46889 = C20764.m46888(strM218220);
            for (int i3 = 0; i3 < strArrM46889.length; i3++) {
                try {
                    AbstractC18100 abstractC18100 = (AbstractC18100) Class.forName(m21829(strArrM46889[i3])).asSubclass(AbstractC18100.class).getDeclaredConstructor(null).newInstance(null);
                    abstractC18100.f54037 = this;
                    abstractC18100.mo20900(this, null, null, null, null);
                } catch (Exception | LinkageError unused2) {
                    vector3.addElement(strArrM46889[i3]);
                }
            }
            if (vector3.size() == 0) {
                strArr3 = null;
            } else {
                strArr3 = new String[vector3.size()];
                System.arraycopy(vector3.toArray(), 0, strArr3, 0, vector3.size());
                c217611.m49100().getClass();
            }
        }
        if (strArr3 != null && strArr3.length > 0) {
            this.f25608.m49100().getClass();
            strM218219 = C20764.m46880(strM218219, strArr3);
            if (strM218219 == null) {
                throw new C14392("There are not any available kexes.");
            }
            this.f25608.m49100().getClass();
        }
        if (this.f25603 && !this.f25618) {
            strM218219 = C17588.m40053(strM218219, ",ext-info-c");
        }
        if ((this.f25601 || this.f25622) && this.f25598) {
            strM218219 = C17588.m40053(strM218219, ",kex-strict-c-v00@openssh.com");
        }
        String strM218221 = m21829("server_host_key");
        String strM218222 = m21829("CheckSignatures");
        C21769 c217612 = this.f25608;
        if (strM218222 == null || strM218222.length() == 0) {
            strArr4 = null;
        } else {
            c217612.m49100().getClass();
            Vector vector4 = new Vector();
            String[] strArrM468810 = C20764.m46888(strM218222);
            for (int i4 = 0; i4 < strArrM468810.length; i4++) {
                try {
                    ((InterfaceC19422) Class.forName(C21769.m49091(strArrM468810[i4])).asSubclass(InterfaceC19422.class).getDeclaredConstructor(null).newInstance(null)).init();
                } catch (Exception | LinkageError unused3) {
                    vector4.addElement(strArrM468810[i4]);
                }
            }
            if (vector4.size() == 0) {
                strArr4 = null;
            } else {
                strArr4 = new String[vector4.size()];
                System.arraycopy(vector4.toArray(), 0, strArr4, 0, vector4.size());
                c217612.m49100().getClass();
            }
        }
        this.f25612 = strArr4;
        if (strArr4 != null && strArr4.length > 0) {
            this.f25608.m49100().getClass();
            strM218221 = C20764.m46880(strM218221, strArr4);
            if (strM218221 == null) {
                throw new C14392("There are not any available sig algorithm.");
            }
            this.f25608.m49100().getClass();
        }
        if (m21829("prefer_known_host_key_types").equals("yes")) {
            this.f25608.m49100().getClass();
            InterfaceC20428 interfaceC20428M49094 = this.f25608.m49094();
            String string = this.f25599;
            if (this.f25620 != 22) {
                StringBuilder sbM11879 = C5410.m11879("[", string, "]:");
                sbM11879.append(this.f25620);
                string = sbM11879.toString();
            }
            C6346[] c6346ArrM46935 = ((C20784) interfaceC20428M49094).m46935(string, (String) null);
            if (c6346ArrM46935.length > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(Arrays.asList(C20764.m46888(strM218221)));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String str5 = (str4.equals("rsa-sha2-256") || str4.equals("rsa-sha2-512") || str4.equals("ssh-rsa-sha224@ssh.com") || str4.equals("ssh-rsa-sha256@ssh.com") || str4.equals("ssh-rsa-sha384@ssh.com") || str4.equals("ssh-rsa-sha512@ssh.com")) ? OpenSSHPublicKeyUtil.RSA : str4;
                    for (C6346 c6346 : c6346ArrM46935) {
                        if (c6346.m14505().equals(str5)) {
                            arrayList.add(str4);
                            it.remove();
                            break;
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    arrayList.addAll(arrayList2);
                    StringBuilder sb = new StringBuilder();
                    Iterator it2 = arrayList.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it2.next());
                            if (!it2.hasNext()) {
                                break;
                            } else {
                                sb.append((CharSequence) ",");
                            }
                        }
                    }
                    strM218221 = sb.toString();
                }
            }
            this.f25608.m49100().getClass();
        }
        this.f25586 = System.currentTimeMillis();
        this.f25605 = true;
        C17823 c17823 = new C17823();
        C10054 c10054 = new C10054(c17823);
        c10054.m23425();
        c17823.m40448((byte) 20);
        synchronized (f25566) {
            f25566.mo5385(c17823.f53186, 16, c17823.f53185);
            c17823.m40465(16);
        }
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470(C20764.m46886(strM218219, charset));
        c17823.m40470(C20764.m46886(strM218221, charset));
        c17823.m40470(C20764.m46886(strM21829, charset));
        c17823.m40470(C20764.m46886(str2, charset));
        c17823.m40470(C20764.m46886(m21829("mac.c2s"), charset));
        c17823.m40470(C20764.m46886(m21829("mac.s2c"), charset));
        c17823.m40470(C20764.m46886(m21829("compression.c2s"), charset));
        c17823.m40470(C20764.m46886(m21829("compression.s2c"), charset));
        c17823.m40470(C20764.m46886(m21829("lang.c2s"), charset));
        c17823.m40470(C20764.m46886(m21829("lang.s2c"), charset));
        c17823.m40448((byte) 0);
        c17823.m40459(0);
        c17823.f53187 = 5;
        int iM40469 = c17823.m40469();
        byte[] bArr = new byte[iM40469];
        this.f25615 = bArr;
        c17823.m40450(0, iM40469, bArr);
        m21845(c10054);
        this.f25608.m49100().getClass();
    }

    /* JADX INFO: renamed from: ۖ */
    private void m21818() throws C14392 {
        C10054 c10054 = this.f25574;
        c10054.m23425();
        this.f25573.m40448((byte) 7);
        this.f25573.m40459(1);
        C17823 c17823 = this.f25573;
        Charset charset = StandardCharsets.UTF_8;
        c17823.m40470(C20764.m46886("ext-info-in-auth@openssh.com", charset));
        this.f25573.m40470(C20764.m46886("0", charset));
        m21845(c10054);
        this.f25608.m49100().getClass();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21814(String str, int i, AbstractC18100 abstractC18100) throws C13722, C9698, C15062 {
        C20784 c20784;
        int iM46933;
        boolean z;
        String strM21829 = m21829("StrictHostKeyChecking");
        byte[] bArr = abstractC18100.f54036;
        String strM41169 = abstractC18100.m41169();
        InterfaceC5005 interfaceC5005 = null;
        try {
            interfaceC5005 = (InterfaceC5005) Class.forName(abstractC18100.f54037.m21829(abstractC18100.f54037.m21829("FingerprintHash").toLowerCase(Locale.ROOT))).asSubclass(InterfaceC5005.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            abstractC18100.f54037.f25608.m49100().getClass();
        }
        String strM46881 = C20764.m46881(interfaceC5005, abstractC18100.f54036);
        String str2 = i != 22 ? "[" + str + "]:" + i : str;
        InterfaceC20428 interfaceC20428M49094 = this.f25608.m49094();
        if (m21829("HashKnownHosts").equals("yes") && C14110.m32033(interfaceC20428M49094)) {
            C20113 c20113 = new C20113((C20784) interfaceC20428M49094, "", str2, 0, bArr, null);
            c20113.m45554();
            this.f25631 = c20113;
        } else {
            this.f25631 = new C6346(str2, 0, bArr);
        }
        synchronized (interfaceC20428M49094) {
            c20784 = (C20784) interfaceC20428M49094;
            iM46933 = c20784.m46933(str2, bArr);
        }
        if ((strM21829.equals("ask") || strM21829.equals("yes")) && iM46933 == 2) {
            synchronized (interfaceC20428M49094) {
            }
            if (this.f25632 != null) {
                if (strM21829.equals("ask")) {
                    this.f25632.getClass();
                    synchronized (interfaceC20428M49094) {
                        c20784.m46936(str2, abstractC18100.m41167());
                    }
                    z = true;
                } else {
                    this.f25632.getClass();
                }
            }
            throw new C15062(C21466.m48631("HostKey has been changed: ", str2));
        }
        z = false;
        if ((strM21829.equals("ask") || strM21829.equals("yes")) && iM46933 != 0 && !z) {
            if (strM21829.equals("yes")) {
                throw new C9698(C21466.m48631("reject HostKey: ", str2));
            }
            if (this.f25632 == null) {
                if (iM46933 != 1) {
                    throw new C15062(C21466.m48631("HostKey has been changed: ", str2));
                }
                StringBuilder sbM12525 = C5633.m12525("UnknownHostKey: ", str2, ". ", strM41169, " key fingerprint is ");
                sbM12525.append(strM46881);
                throw new C9698(sbM12525.toString());
            }
            z = true;
        }
        if (strM21829.equals("no") && 1 == iM46933) {
            z = true;
        }
        if (iM46933 == 0) {
            C6346[] c6346ArrM46935 = c20784.m46935(str2, abstractC18100.m41167());
            byte[] bArrM46887 = C20764.m46887(bArr, bArr.length, true);
            String str3 = new String(bArrM46887, 0, bArrM46887.length, StandardCharsets.UTF_8);
            for (int i2 = 0; i2 < c6346ArrM46935.length; i2++) {
                byte[] bArr2 = c6346ArrM46935[i2].f16447;
                byte[] bArrM46888 = C20764.m46887(bArr2, bArr2.length, true);
                if (new String(bArrM46888, 0, bArrM46888.length, StandardCharsets.UTF_8).equals(str3) && c6346ArrM46935[i2].f16448.equals("@revoked")) {
                    this.f25608.m49100().getClass();
                    throw new C13722(C21466.m48631("revoked HostKey: ", str2));
                }
            }
        }
        if (iM46933 == 0) {
            this.f25608.m49100().getClass();
        }
        if (z) {
            this.f25608.m49100().getClass();
        }
        if (z) {
            synchronized (interfaceC20428M49094) {
                c20784.m46934(this.f25631, this.f25632);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC21178 m21842(String str) throws C14392 {
        if (!this.f25616) {
            throw new C14392("session is down");
        }
        try {
            AbstractC21178 abstractC21178M21825 = m21825(str);
            if (abstractC21178M21825 != null) {
                abstractC21178M21825.mo7821();
                if (abstractC21178M21825 instanceof C15141) {
                    this.f25608.getClass();
                }
                return abstractC21178M21825;
            }
            this.f25608.m49100().getClass();
            return null;
        } catch (Exception unused) {
            this.f25608.m49100().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21834(C10054 c10054) {
        InterfaceC3348 interfaceC3348;
        InterfaceC22046 interfaceC22046 = this.f25627;
        boolean z = false;
        if (interfaceC22046 != null) {
            C17823 c17823 = c10054.f27814;
            int i = c17823.f53186;
            int[] iArr = this.f25569;
            iArr[0] = i;
            c17823.f53185 = interfaceC22046.mo26034(c17823.f53185, iArr);
            c10054.f27814.f53186 = iArr[0];
        }
        InterfaceC24727 interfaceC24727 = this.f25577;
        int i2 = interfaceC24727 != null ? this.f25619 : 8;
        boolean z2 = interfaceC24727 != null && interfaceC24727.mo4576();
        InterfaceC24727 interfaceC24728 = this.f25577;
        boolean z3 = interfaceC24728 != null && interfaceC24728.mo4577();
        boolean z4 = (z2 || z3 || this.f25577 == null || (interfaceC3348 = this.f25621) == null || !interfaceC3348.mo5849()) ? false : true;
        if (!z2 && !z3 && !z4) {
            z = true;
        }
        c10054.m23426(i2, z);
        C17823 c17824 = c10054.f27814;
        byte[] bArr = c17824.f53185;
        if (z2) {
            this.f25577.mo4569(this.f25630);
            this.f25577.mo4570(0, bArr, 4, bArr, 0);
            this.f25577.mo4575(0, bArr, c17824.f53186, bArr, 0);
            c17824.m40465(this.f25577.mo4574());
            return;
        }
        if (z3) {
            this.f25577.mo4572(bArr);
            this.f25577.mo4575(4, bArr, c17824.f53186 - 4, bArr, 4);
            c17824.m40465(this.f25577.mo4574());
            return;
        }
        if (z4) {
            this.f25577.mo4570(4, bArr, c17824.f53186 - 4, bArr, 4);
            this.f25621.mo5847(this.f25630);
            this.f25621.mo5848(c17824.f53186, c17824.f53185);
            this.f25621.mo5850(c17824.f53186, c17824.f53185);
            c17824.m40465(this.f25621.getBlockSize());
            return;
        }
        InterfaceC3348 interfaceC3349 = this.f25621;
        if (interfaceC3349 != null) {
            interfaceC3349.mo5847(this.f25630);
            this.f25621.mo5848(c17824.f53186, c17824.f53185);
            this.f25621.mo5850(c17824.f53186, c17824.f53185);
        }
        InterfaceC24727 interfaceC24729 = this.f25577;
        if (interfaceC24729 != null) {
            interfaceC24729.mo4570(0, bArr, c17824.f53186, bArr, 0);
        }
        InterfaceC3348 interfaceC33410 = this.f25621;
        if (interfaceC33410 != null) {
            c17824.m40465(interfaceC33410.getBlockSize());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC21178 m21813(int i) {
        Lock lock = this.f25581.readLock();
        lock.lock();
        try {
            for (AbstractC21178 abstractC21178 : this.f25567) {
                if (abstractC21178.f66557 == i) {
                    return abstractC21178;
                }
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21836(C17823 c17823) throws IOException {
        char c;
        boolean z;
        InterfaceC3348 interfaceC3348;
        InterfaceC24727 interfaceC24727 = this.f25568;
        char c2 = 1;
        boolean z2 = interfaceC24727 != null && interfaceC24727.mo4576();
        InterfaceC24727 interfaceC24728 = this.f25568;
        boolean z3 = interfaceC24728 != null && interfaceC24728.mo4577();
        boolean z4 = (z2 || z3 || this.f25568 == null || (interfaceC3348 = this.f25570) == null || !interfaceC3348.mo5849()) ? false : true;
        while (true) {
            c17823.m40456();
            if (z2) {
                this.f25614.m47704(c17823.f53186, 4, c17823.f53185);
                c17823.f53186 += 4;
                this.f25568.mo4569(this.f25628);
                byte[] bArr = new byte[4];
                this.f25568.mo4570(0, c17823.f53185, 4, bArr, 0);
                int i = ((bArr[c2] << 16) & 16711680) | ((bArr[0] << 24) & (-16777216)) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
                if (i < 5 || i > 262144) {
                    break;
                }
                int iMo4574 = this.f25568.mo4574() + i;
                int i2 = c17823.f53186;
                int i3 = i2 + iMo4574;
                byte[] bArr2 = c17823.f53185;
                if (i3 > bArr2.length) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i2);
                    c17823.f53185 = bArr3;
                }
                if (iMo4574 % this.f25582 != 0) {
                    this.f25608.m49100().getClass();
                    m21815(c17823, this.f25568, this.f25570, 0, 262144 - this.f25582);
                    throw null;
                }
                this.f25614.m47704(c17823.f53186, iMo4574, c17823.f53185);
                int iMo4575 = iMo4574 - this.f25568.mo4574();
                c17823.f53186 += iMo4575;
                try {
                    InterfaceC24727 interfaceC24729 = this.f25568;
                    byte[] bArr4 = c17823.f53185;
                    interfaceC24729.mo4575(0, bArr4, iMo4575 + 4, bArr4, 0);
                    System.arraycopy(bArr, 0, c17823.f53185, 0, 4);
                } catch (AEADBadTagException e) {
                    throw new C14392("Packet corrupt", e);
                }
            } else if (z3 || z4) {
                this.f25614.m47704(c17823.f53186, 4, c17823.f53185);
                c17823.f53186 += 4;
                byte[] bArr5 = c17823.f53185;
                int iMo4576 = (65280 & (bArr5[2] << 8)) | (16711680 & (bArr5[1] << 16)) | ((-16777216) & (bArr5[0] << 24)) | (bArr5[3] & 255);
                if (iMo4576 < 5 || iMo4576 > 262144) {
                    m21815(c17823, this.f25568, this.f25570, 0, 262144);
                    throw null;
                }
                if (z3) {
                    iMo4576 += this.f25568.mo4574();
                }
                int i4 = iMo4576;
                int i5 = c17823.f53186;
                int i6 = i5 + i4;
                byte[] bArr6 = c17823.f53185;
                if (i6 > bArr6.length) {
                    byte[] bArr7 = new byte[i6];
                    System.arraycopy(bArr6, 0, bArr7, 0, i5);
                    c17823.f53185 = bArr7;
                }
                if (i4 % this.f25582 != 0) {
                    this.f25608.m49100().getClass();
                    m21815(c17823, this.f25568, this.f25570, 0, 262144 - this.f25582);
                    throw null;
                }
                this.f25614.m47704(c17823.f53186, i4, c17823.f53185);
                c17823.f53186 += i4;
                if (z3) {
                    try {
                        this.f25568.mo4572(c17823.f53185);
                        InterfaceC24727 interfaceC247210 = this.f25568;
                        byte[] bArr8 = c17823.f53185;
                        interfaceC247210.mo4575(4, bArr8, i4, bArr8, 4);
                        c17823.f53186 -= this.f25568.mo4574();
                    } catch (AEADBadTagException e2) {
                        throw new C14392("Packet corrupt", e2);
                    }
                } else {
                    this.f25570.mo5847(this.f25628);
                    this.f25570.mo5848(c17823.f53186, c17823.f53185);
                    this.f25570.mo5850(0, this.f25590);
                    C21099 c21099 = this.f25614;
                    byte[] bArr9 = this.f25610;
                    c21099.m47704(0, bArr9.length, bArr9);
                    if (!C20764.m46891(this.f25590, this.f25610)) {
                        throw new C14392("Packet corrupt");
                    }
                    InterfaceC24727 interfaceC247211 = this.f25568;
                    byte[] bArr10 = c17823.f53185;
                    interfaceC247211.mo4570(4, bArr10, i4, bArr10, 4);
                }
            } else {
                this.f25614.m47704(c17823.f53186, this.f25582, c17823.f53185);
                int i7 = c17823.f53186;
                int i8 = this.f25582;
                c17823.f53186 = i7 + i8;
                InterfaceC24727 interfaceC247212 = this.f25568;
                if (interfaceC247212 != null) {
                    byte[] bArr11 = c17823.f53185;
                    interfaceC247212.mo4570(0, bArr11, i8, bArr11, 0);
                }
                byte[] bArr12 = c17823.f53185;
                int i9 = (65280 & (bArr12[2] << 8)) | (16711680 & (bArr12[1] << 16)) | ((-16777216) & (bArr12[0] << 24)) | (bArr12[3] & 255);
                if (i9 < 5 || i9 > 262144) {
                    m21815(c17823, this.f25568, this.f25570, 0, 262144);
                    throw null;
                }
                int i10 = (i9 + 4) - this.f25582;
                int i11 = c17823.f53186;
                int i12 = i11 + i10;
                if (i12 > bArr12.length) {
                    byte[] bArr13 = new byte[i12];
                    System.arraycopy(bArr12, 0, bArr13, 0, i11);
                    c17823.f53185 = bArr13;
                }
                if (i10 % this.f25582 != 0) {
                    this.f25608.m49100().getClass();
                    m21815(c17823, this.f25568, this.f25570, 0, 262144 - this.f25582);
                    throw null;
                }
                if (i10 > 0) {
                    this.f25614.m47704(c17823.f53186, i10, c17823.f53185);
                    c17823.f53186 += i10;
                    InterfaceC24727 interfaceC247213 = this.f25568;
                    if (interfaceC247213 != null) {
                        byte[] bArr14 = c17823.f53185;
                        int i13 = this.f25582;
                        interfaceC247213.mo4570(i13, bArr14, i10, bArr14, i13);
                    }
                }
                InterfaceC3348 interfaceC3349 = this.f25570;
                if (interfaceC3349 != null) {
                    interfaceC3349.mo5847(this.f25628);
                    this.f25570.mo5848(c17823.f53186, c17823.f53185);
                    this.f25570.mo5850(0, this.f25590);
                    C21099 c210910 = this.f25614;
                    byte[] bArr15 = this.f25610;
                    c210910.m47704(0, bArr15.length, bArr15);
                    if (!C20764.m46891(this.f25590, this.f25610)) {
                        int i14 = this.f25582;
                        if (i10 + i14 > 262144) {
                            throw new IOException("MAC Error");
                        }
                        m21815(c17823, this.f25568, this.f25570, c17823.f53186, (262144 - i10) - i14);
                        throw null;
                    }
                }
                c17823 = c17823;
            }
            int i15 = this.f25628 + 1;
            this.f25628 = i15;
            if (i15 == 0 && ((this.f25601 || this.f25622) && this.f25598)) {
                throw new C15732("incoming sequence number wrapped during initial KEX");
            }
            InterfaceC22046 interfaceC22046 = this.f25572;
            if (interfaceC22046 != null) {
                byte[] bArr16 = c17823.f53185;
                byte b = bArr16[4];
                int[] iArr = this.f25600;
                c = 5;
                iArr[0] = (c17823.f53186 - 5) - b;
                byte[] bArrMo26033 = interfaceC22046.mo26033(bArr16, iArr);
                if (bArrMo26033 != null) {
                    c17823.f53185 = bArrMo26033;
                    c17823.f53186 = this.f25600[0] + 5;
                } else {
                    this.f25608.m49100().getClass();
                }
                c17823.f53187 = 0;
                return;
            }
            c = 5;
            int i16 = c17823.f53185[c] & 255;
            if (i16 == 1) {
                c17823.f53187 = 0;
                c17823.m40464();
                c17823.m40455();
                int iM40464 = c17823.m40464();
                byte[] bArrM40471 = c17823.m40471();
                byte[] bArrM40472 = c17823.m40471();
                int length = bArrM40471.length;
                Charset charset = StandardCharsets.UTF_8;
                throw new C24450("SSH_MSG_DISCONNECT: " + iM40464 + " " + new String(bArrM40471, 0, length, charset) + " " + new String(bArrM40472, 0, bArrM40472.length, charset));
            }
            if (!this.f25598 || !this.f25579) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        c17823.f53187 = 0;
                        c17823.m40464();
                        c17823.m40455();
                        c17823.m40464();
                        this.f25608.m49100().getClass();
                    } else if (i16 == 4) {
                        c17823.f53187 = 0;
                        c17823.m40464();
                        c17823.m40455();
                    } else if (i16 == 93) {
                        c17823.f53187 = 0;
                        c17823.m40464();
                        c17823.m40455();
                        AbstractC21178 abstractC21178M21813 = m21813(c17823.m40464());
                        if (abstractC21178M21813 != null) {
                            abstractC21178M21813.m47797(c17823.m40457());
                        }
                    } else if (i16 == 7) {
                        c17823.f53187 = 0;
                        c17823.m40464();
                        c17823.m40455();
                        if (!this.f25603 || this.f25618 || this.f25605) {
                            this.f25608.m49100().getClass();
                            z = true;
                        } else {
                            this.f25608.m49100().getClass();
                            z = false;
                        }
                        long jM40457 = c17823.m40457();
                        for (long j = 0; j < jM40457; j++) {
                            byte[] bArrM40473 = c17823.m40471();
                            byte[] bArrM40474 = c17823.m40471();
                            if (!z) {
                                int length2 = bArrM40473.length;
                                Charset charset2 = StandardCharsets.UTF_8;
                                if (new String(bArrM40473, 0, length2, charset2).equals("server-sig-algs")) {
                                    String str = new String(bArrM40474, 0, bArrM40474.length, charset2);
                                    this.f25608.m49100().getClass();
                                    if (this.f25602) {
                                        str = !str.isEmpty() ? str.concat(",rsa-sha2-256,rsa-sha2-512") : "rsa-sha2-256,rsa-sha2-512";
                                        this.f25608.m49100().getClass();
                                    }
                                    this.f25580 = C20764.m46888(str);
                                }
                            }
                        }
                    } else if (i16 == 52) {
                        this.f25618 = true;
                        if (this.f25572 == null && this.f25627 == null) {
                            m21822(this.f25583[6]);
                            m21827(this.f25583[7]);
                        }
                    }
                }
                c2 = 1;
            }
            c17823.f53187 = 0;
            return;
        }
        m21815(c17823, this.f25568, this.f25570, 0, 262144);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21815(C17823 c17823, InterfaceC24727 interfaceC24727, InterfaceC3348 interfaceC3348, int i, int i2) throws C14392 {
        IOException e;
        if (interfaceC24727.mo4573() && (interfaceC3348 == null || !interfaceC3348.mo5849())) {
            if (interfaceC3348 != null) {
                interfaceC3348.mo5847(this.f25628);
                interfaceC3348.mo5848(i, c17823.f53185);
            }
            while (i2 > 0) {
                try {
                    c17823.m40456();
                    byte[] bArr = c17823.f53185;
                    int length = i2 > bArr.length ? bArr.length : i2;
                    this.f25614.m47704(0, length, bArr);
                    if (interfaceC3348 != null) {
                        interfaceC3348.mo5848(length, c17823.f53185);
                    }
                    i2 -= length;
                } catch (IOException e2) {
                    e = e2;
                    this.f25608.m49100().getClass();
                }
            }
            e = null;
            if (interfaceC3348 != null) {
                interfaceC3348.mo5850(0, c17823.f53185);
            }
            C14392 c14392 = new C14392("Packet corrupt");
            if (e != null) {
                c14392.addSuppressed(e);
                throw c14392;
            }
            throw c14392;
        }
        throw new C14392("Packet corrupt");
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m21846() {
        return this.f25576;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m21816(AbstractC18100 abstractC18100) {
        try {
            m21821(abstractC18100);
            C20764.m46890(abstractC18100.f54034);
            abstractC18100.f54034 = null;
            this.f25605 = false;
            if (this.f25579) {
                this.f25628 = 0;
                this.f25608.m49100().getClass();
            }
        } catch (Throwable th) {
            C20764.m46890(abstractC18100.f54034);
            abstractC18100.f54034 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m21821(AbstractC18100 abstractC18100) throws C14392 {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = abstractC18100.f54034;
        byte[] bArr4 = abstractC18100.f54033;
        InterfaceC5005 interfaceC5005 = abstractC18100.f54035;
        if (this.f25576 == null) {
            byte[] bArr5 = new byte[bArr4.length];
            this.f25576 = bArr5;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        }
        this.f25573.m40456();
        this.f25573.m40461(bArr3);
        this.f25573.m40461(bArr4);
        this.f25573.m40448((byte) 65);
        this.f25573.m40461(this.f25576);
        C17823 c17823 = this.f25573;
        interfaceC5005.mo3552(c17823.f53186, c17823.f53185);
        this.f25613 = interfaceC5005.mo3553();
        C17823 c17824 = this.f25573;
        int i = c17824.f53186;
        int length = (i - this.f25576.length) - 1;
        byte[] bArr6 = c17824.f53185;
        bArr6[length] = (byte) (bArr6[length] + 1);
        interfaceC5005.mo3552(i, bArr6);
        this.f25617 = interfaceC5005.mo3553();
        C17823 c17825 = this.f25573;
        byte[] bArr7 = c17825.f53185;
        bArr7[length] = (byte) (bArr7[length] + 1);
        interfaceC5005.mo3552(c17825.f53186, bArr7);
        this.f25571 = interfaceC5005.mo3553();
        C17823 c17826 = this.f25573;
        byte[] bArr8 = c17826.f53185;
        bArr8[length] = (byte) (bArr8[length] + 1);
        interfaceC5005.mo3552(c17826.f53186, bArr8);
        this.f25597 = interfaceC5005.mo3553();
        C17823 c17827 = this.f25573;
        byte[] bArr9 = c17827.f53185;
        bArr9[length] = (byte) (bArr9[length] + 1);
        interfaceC5005.mo3552(c17827.f53186, bArr9);
        this.f25633 = interfaceC5005.mo3553();
        C17823 c17828 = this.f25573;
        byte[] bArr10 = c17828.f53185;
        bArr10[length] = (byte) (bArr10[length] + 1);
        interfaceC5005.mo3552(c17828.f53186, bArr10);
        this.f25585 = interfaceC5005.mo3553();
        try {
            this.f25568 = (InterfaceC24727) Class.forName(m21829(this.f25583[3])).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize = this.f25568.getBlockSize();
                bArr = this.f25597;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.f25573.m40456();
                C17823 c17829 = this.f25573;
                c17829.getClass();
                c17829.m40460(0, bArr3.length, bArr3);
                C17823 c178210 = this.f25573;
                c178210.getClass();
                c178210.m40460(0, bArr4.length, bArr4);
                this.f25573.m40461(this.f25597);
                C17823 c178211 = this.f25573;
                interfaceC5005.mo3552(c178211.f53186, c178211.f53185);
                byte[] bArrMo3553 = interfaceC5005.mo3553();
                byte[] bArr11 = this.f25597;
                byte[] bArr12 = new byte[bArr11.length + bArrMo3553.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(bArrMo3553, 0, bArr12, this.f25597.length, bArrMo3553.length);
                this.f25597 = bArr12;
            }
            this.f25568.mo4571(1, bArr, this.f25617);
            this.f25582 = this.f25568.mo4578();
            if (!this.f25568.mo4577()) {
                InterfaceC3348 interfaceC3348 = (InterfaceC3348) Class.forName(m21829(this.f25583[5])).asSubclass(InterfaceC3348.class).getDeclaredConstructor(null).newInstance(null);
                this.f25570 = interfaceC3348;
                byte[] bArrM21817 = m21817(this.f25573, bArr3, bArr4, this.f25585, interfaceC5005, interfaceC3348.getBlockSize());
                this.f25585 = bArrM21817;
                this.f25570.init(bArrM21817);
                this.f25590 = new byte[this.f25570.getBlockSize()];
                this.f25610 = new byte[this.f25570.getBlockSize()];
            }
            this.f25577 = (InterfaceC24727) Class.forName(m21829(this.f25583[2])).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize2 = this.f25577.getBlockSize();
                bArr2 = this.f25571;
                if (blockSize2 <= bArr2.length) {
                    break;
                }
                this.f25573.m40456();
                C17823 c178212 = this.f25573;
                c178212.getClass();
                c178212.m40460(0, bArr3.length, bArr3);
                C17823 c178213 = this.f25573;
                c178213.getClass();
                c178213.m40460(0, bArr4.length, bArr4);
                this.f25573.m40461(this.f25571);
                C17823 c178214 = this.f25573;
                interfaceC5005.mo3552(c178214.f53186, c178214.f53185);
                byte[] bArrMo3554 = interfaceC5005.mo3553();
                byte[] bArr13 = this.f25571;
                byte[] bArr14 = new byte[bArr13.length + bArrMo3554.length];
                System.arraycopy(bArr13, 0, bArr14, 0, bArr13.length);
                System.arraycopy(bArrMo3554, 0, bArr14, this.f25571.length, bArrMo3554.length);
                this.f25571 = bArr14;
            }
            this.f25577.mo4571(0, bArr2, this.f25613);
            this.f25619 = this.f25577.mo4578();
            if (!this.f25577.mo4577()) {
                InterfaceC3348 interfaceC3349 = (InterfaceC3348) Class.forName(m21829(this.f25583[4])).asSubclass(InterfaceC3348.class).getDeclaredConstructor(null).newInstance(null);
                this.f25621 = interfaceC3349;
                byte[] bArrM21818 = m21817(this.f25573, bArr3, bArr4, this.f25633, interfaceC5005, interfaceC3349.getBlockSize());
                this.f25633 = bArrM21818;
                this.f25621.init(bArrM21818);
            }
            m21822(this.f25583[6]);
            m21827(this.f25583[7]);
        } catch (Exception | LinkageError e) {
            if (!(e instanceof C14392)) {
                throw new C14392(e.toString(), e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m21817(C17823 c17823, byte[] bArr, byte[] bArr2, byte[] bArr3, InterfaceC5005 interfaceC5005, int i) {
        int blockSize = interfaceC5005.getBlockSize();
        while (bArr3.length < i) {
            c17823.m40456();
            c17823.m40461(bArr);
            c17823.m40461(bArr2);
            c17823.m40460(0, bArr3.length, bArr3);
            interfaceC5005.mo3552(c17823.f53186, c17823.f53185);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(interfaceC5005.mo3553(), 0, bArr4, bArr3.length, blockSize);
            C20764.m46890(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r20.f66546 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (r20.m47800() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r20.f66559 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        r7 = r20.f66559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0080, code lost:
    
        if (r7 <= r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        r7 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        if (r7 == r12) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0087, code lost:
    
        r9 = (int) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
    
        if (r18.f25577 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        r10 = r18.f25619;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r11 = r18.f25621;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
    
        if (r11 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
    
        r11 = r11.getBlockSize();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009a, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
    
        r12 = r19.f27814;
        r13 = r9 + 14;
        r15 = (-r13) & (r10 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a4, code lost:
    
        if (r15 >= r10) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a6, code lost:
    
        r15 = r15 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a7, code lost:
    
        r10 = p067l.C20780.m46927(r13, r15, r11, 32);
        r11 = r12.f53185;
        r15 = r11.length;
        r14 = ((r12.f53186 + r10) - 14) - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        if (r15 >= r14) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
    
        r14 = new byte[r14];
        java.lang.System.arraycopy(r11, 0, r14, 0, r11.length);
        r12.f53185 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c0, code lost:
    
        r11 = r12.f53185;
        java.lang.System.arraycopy(r11, r13, r11, r10, (r12.f53186 - 14) - r9);
        r12.f53186 = 10;
        r12.m40459(r9);
        r12.f53186 = r13;
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r14 = 5;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        r9 = r19.f27814.f53185[r14];
        r11 = r20.f66555;
        r6 = r6 - ((int) r7);
        r20.f66559 -= r7;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e8, code lost:
    
        r14 = 5;
        r11 = -1;
        r7 = false;
        r9 = 0;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ed, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ee, code lost:
    
        if (r7 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f0, code lost:
    
        m21824(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        if (r6 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        r7 = r19.f27814;
        r8 = r7.f53185;
        java.lang.System.arraycopy(r8, r10, r8, 14, r6);
        r7.f53185[r14] = r9;
        r7.f53186 = 6;
        r7.m40459(r11);
        r7.m40459(r6);
        r7.f53186 = r6 + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0112, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0115, code lost:
    
        if (r18.f25605 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        if (r20.f66559 < r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r20.f66559 -= r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0126, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012b, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x013b, code lost:
    
        throw new java.io.IOException("channel is broken");
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m21835(C10054 c10054, AbstractC21178 abstractC21178, int i) throws IOException {
        long j = 0;
        int i2 = i;
        while (true) {
            if (!this.f25605) {
                synchronized (abstractC21178) {
                    long j2 = i2;
                    if (abstractC21178.f66559 < j2) {
                        try {
                            abstractC21178.f66552++;
                            abstractC21178.wait(100L);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            abstractC21178.f66552--;
                            throw th;
                        }
                        abstractC21178.f66552--;
                    }
                    if (!this.f25605) {
                        if (abstractC21178.f66559 >= j2) {
                            abstractC21178.f66559 -= j2;
                        }
                        m21824(c10054);
                        return;
                    }
                }
            } else {
                if (j > 0 && System.currentTimeMillis() - this.f25586 > j) {
                    throw new C14392("timeout in waiting for rekeying process.");
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21845(C10054 c10054) throws C14392 {
        long j = 0;
        while (this.f25605) {
            if (j <= 0 || System.currentTimeMillis() - this.f25586 <= j || this.f25587) {
                byte b = c10054.f27814.f53185[5];
                if (b == 20 || b == 21 || b == 30 || b == 31 || b == 31 || b == 32 || b == 33 || b == 34 || b == 1) {
                    break;
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                throw new C14392("timeout in waiting for rekeying process.");
            }
        }
        m21824(c10054);
    }

    /* JADX INFO: renamed from: ܽ */
    private void m21824(C10054 c10054) {
        boolean z = this.f25598;
        boolean z2 = this.f25579;
        boolean z3 = this.f25601;
        boolean z4 = this.f25622;
        boolean z5 = c10054.f27814.f53185[5] == 21 && z2;
        synchronized (this.f25626) {
            m21834(c10054);
            C21099 c21099 = this.f25614;
            if (c21099 != null) {
                OutputStream outputStream = c21099.f66298;
                C17823 c17823 = c10054.f27814;
                outputStream.write(c17823.f53185, 0, c17823.f53186);
                c21099.f66298.flush();
                int i = this.f25630 + 1;
                this.f25630 = i;
                if (i == 0 && ((z3 || z4) && z)) {
                    throw new C15732("outgoing sequence number wrapped during initial KEX");
                }
                if (z5) {
                    this.f25630 = 0;
                }
            }
        }
        if (!z5 || this.f25614 == null) {
            return;
        }
        this.f25608.m49100().getClass();
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m21840() {
        AbstractC21178 abstractC21178M21813;
        int i;
        byte b;
        this.f25596 = new RunnableC13407(this);
        C17823 c17823 = new C17823();
        C10054 c10054 = new C10054(c17823);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            AbstractC18100 abstractC18100M21820 = null;
            while (true) {
                int i2 = 0;
                while (true) {
                    try {
                        if (this.f25616 && this.f25596 != null) {
                            try {
                                m21836(c17823);
                                int i3 = c17823.f53185[5] & 255;
                                if (abstractC18100M21820 != null && abstractC18100M21820.mo20902() == i3) {
                                    this.f25586 = System.currentTimeMillis();
                                    boolean zMo20901 = abstractC18100M21820.mo20901(c17823);
                                    if (!zMo20901) {
                                        throw new C14392("verify: " + zMo20901);
                                    }
                                } else if (i3 == 20) {
                                    abstractC18100M21820 = m21820(c17823);
                                } else if (i3 != 21) {
                                    switch (i3) {
                                        case 80:
                                            c17823.m40464();
                                            c17823.m40455();
                                            c17823.m40471();
                                            if (c17823.m40447() != 0) {
                                                c10054.m23425();
                                                c17823.m40448((byte) 82);
                                                m21845(c10054);
                                            }
                                            break;
                                        case 81:
                                        case 82:
                                            Thread threadM35145 = this.f25595.m35145();
                                            if (threadM35145 != null) {
                                                this.f25595.getClass();
                                                if (i3 == 81 && this.f25595.m35143() == 0) {
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    this.f25595.m35144(c17823.m40464());
                                                }
                                                threadM35145.interrupt();
                                            }
                                            break;
                                        default:
                                            switch (i3) {
                                                case 90:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    byte[] bArrM40471 = c17823.m40471();
                                                    String str = new String(bArrM40471, 0, bArrM40471.length, StandardCharsets.UTF_8);
                                                    if ("forwarded-tcpip".equals(str) || (("x11".equals(str) && this.f25588) || ("auth-agent@openssh.com".equals(str) && this.f25591))) {
                                                        final AbstractC21178 abstractC21178M21842 = m21842(str);
                                                        if (abstractC21178M21842 == null) {
                                                            this.f25608.m49100().getClass();
                                                            c10054.m23425();
                                                            c17823.m40448((byte) 92);
                                                            c17823.m40459(c17823.m40464());
                                                            c17823.m40459(4);
                                                            byte[] bArr = C20764.f65273;
                                                            c17823.m40470(bArr);
                                                            c17823.m40466(0, bArr.length, bArr);
                                                            m21845(c10054);
                                                        } else {
                                                            abstractC21178M21842.mo12833(c17823);
                                                            ThreadFactoryC8042 threadFactoryC8042 = this.f25584;
                                                            Runnable runnable = new Runnable() { // from class: l.᩺ۢۘ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    abstractC21178M21842.mo5176();
                                                                }
                                                            };
                                                            threadFactoryC8042.getClass();
                                                            Thread thread = new Thread(runnable);
                                                            thread.setName("Channel " + str + " " + this.f25599);
                                                            thread.start();
                                                        }
                                                    } else {
                                                        this.f25608.m49100().getClass();
                                                        c10054.m23425();
                                                        c17823.m40448((byte) 92);
                                                        c17823.m40459(c17823.m40464());
                                                        c17823.m40459(1);
                                                        byte[] bArr2 = C20764.f65273;
                                                        c17823.m40470(bArr2);
                                                        c17823.m40466(0, bArr2.length, bArr2);
                                                        m21845(c10054);
                                                    }
                                                    break;
                                                case 91:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M21814 = m21813(c17823.m40464());
                                                    int iM40464 = c17823.m40464();
                                                    long jM40457 = c17823.m40457();
                                                    int iM40465 = c17823.m40464();
                                                    if (abstractC21178M21814 != null) {
                                                        abstractC21178M21814.m47803(jM40457);
                                                        abstractC21178M21814.f66548 = iM40465;
                                                        abstractC21178M21814.f66551 = true;
                                                        abstractC21178M21814.m47802(iM40464);
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M21815 = m21813(c17823.m40464());
                                                    if (abstractC21178M21815 != null) {
                                                        c17823.m40464();
                                                        abstractC21178M21815.f66546 = true;
                                                        abstractC21178M21815.m47802(0);
                                                    }
                                                    break;
                                                case 93:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M21816 = m21813(c17823.m40464());
                                                    if (abstractC21178M21816 != null) {
                                                        abstractC21178M21816.m47797(c17823.m40457());
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                    c17823.m40464();
                                                    c17823.m40447();
                                                    c17823.m40447();
                                                    abstractC21178M21813 = m21813(c17823.m40464());
                                                    int iM40466 = c17823.m40464();
                                                    int i4 = c17823.f53187;
                                                    c17823.f53187 = i4 + iM40466;
                                                    iArr[0] = i4;
                                                    iArr2[0] = iM40466;
                                                    byte[] bArr3 = c17823.f53185;
                                                    if (abstractC21178M21813 != null && iM40466 != 0) {
                                                        try {
                                                            try {
                                                                abstractC21178M21813.mo5175(bArr3, iArr[0], iM40466);
                                                                abstractC21178M21813.f66550 -= iArr2[0];
                                                                if (abstractC21178M21813.f66550 >= abstractC21178M21813.f66561 / 2) {
                                                                    continue;
                                                                } else {
                                                                    c10054.m23425();
                                                                    c17823.m40448((byte) 93);
                                                                    c17823.m40459(abstractC21178M21813.f66555);
                                                                    c17823.m40459(abstractC21178M21813.f66561 - abstractC21178M21813.f66550);
                                                                    synchronized (abstractC21178M21813) {
                                                                        if (!abstractC21178M21813.f66546) {
                                                                            m21845(c10054);
                                                                        }
                                                                    }
                                                                    i = abstractC21178M21813.f66561;
                                                                    abstractC21178M21813.f66550 = i;
                                                                }
                                                            } catch (Exception unused) {
                                                                continue;
                                                            }
                                                        } catch (Exception unused2) {
                                                            abstractC21178M21813.m47801();
                                                        }
                                                    }
                                                    break;
                                                case 95:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    abstractC21178M21813 = m21813(c17823.m40464());
                                                    c17823.m40464();
                                                    int iM40467 = c17823.m40464();
                                                    int i5 = c17823.f53187;
                                                    c17823.f53187 = i5 + iM40467;
                                                    iArr[0] = i5;
                                                    iArr2[0] = iM40467;
                                                    if (abstractC21178M21813 != null && iM40467 != 0) {
                                                        try {
                                                            abstractC21178M21813.f66554.getClass();
                                                            throw null;
                                                        } catch (NullPointerException unused3) {
                                                            abstractC21178M21813.f66550 -= iArr2[0];
                                                            if (abstractC21178M21813.f66550 < abstractC21178M21813.f66561 / 2) {
                                                                c10054.m23425();
                                                                c17823.m40448((byte) 93);
                                                                c17823.m40459(abstractC21178M21813.f66555);
                                                                c17823.m40459(abstractC21178M21813.f66561 - abstractC21178M21813.f66550);
                                                                synchronized (abstractC21178M21813) {
                                                                    if (!abstractC21178M21813.f66546) {
                                                                        m21845(c10054);
                                                                    }
                                                                    i = abstractC21178M21813.f66561;
                                                                    abstractC21178M21813.f66550 = i;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 96:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M21817 = m21813(c17823.m40464());
                                                    if (abstractC21178M21817 != null) {
                                                        abstractC21178M21817.mo5177();
                                                    }
                                                    break;
                                                case 97:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M21818 = m21813(c17823.m40464());
                                                    if (abstractC21178M21818 != null) {
                                                        abstractC21178M21818.m47801();
                                                    }
                                                    break;
                                                case 98:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    int iM40468 = c17823.m40464();
                                                    byte[] bArrM40472 = c17823.m40471();
                                                    boolean z = c17823.m40447() != 0;
                                                    AbstractC21178 abstractC21178M21819 = m21813(iM40468);
                                                    if (abstractC21178M21819 != null) {
                                                        if (new String(bArrM40472, 0, bArrM40472.length, StandardCharsets.UTF_8).equals("exit-status")) {
                                                            c17823.m40464();
                                                            b = 99;
                                                        } else {
                                                            b = 100;
                                                        }
                                                        if (z) {
                                                            c10054.m23425();
                                                            c17823.m40448(b);
                                                            c17823.m40459(abstractC21178M21819.f66555);
                                                            m21845(c10054);
                                                        }
                                                    }
                                                    break;
                                                case C0254q.f1216f /* 99 */:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M218110 = m21813(c17823.m40464());
                                                    if (abstractC21178M218110 != null) {
                                                        abstractC21178M218110.f66547 = 1;
                                                    }
                                                    break;
                                                case 100:
                                                    c17823.m40464();
                                                    c17823.m40455();
                                                    AbstractC21178 abstractC21178M218111 = m21813(c17823.m40464());
                                                    if (abstractC21178M218111 != null) {
                                                        abstractC21178M218111.f66547 = 0;
                                                    }
                                                    break;
                                                default:
                                                    throw new IOException("Unknown SSH message type " + i3);
                                            }
                                            break;
                                    }
                                } else {
                                    C10054 c10055 = this.f25574;
                                    c10055.m23425();
                                    this.f25573.m40448((byte) 21);
                                    m21845(c10055);
                                    this.f25608.m49100().getClass();
                                    m21816(abstractC18100M21820);
                                }
                            } catch (InterruptedIOException e) {
                                if (!this.f25605 && i2 < this.f25624) {
                                    C17823 c17824 = new C17823();
                                    C10054 c10056 = new C10054(c17824);
                                    c10056.m23425();
                                    c17824.m40448(UTF8.S_P4A);
                                    c17824.m40470(f25565);
                                    c17824.m40448((byte) 1);
                                    m21845(c10056);
                                } else if (!this.f25605 || i2 >= this.f25624) {
                                    throw e;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception unused4) {
                        this.f25605 = false;
                        this.f25608.m49100().getClass();
                    }
                }
            }
        }
        try {
            m21843();
        } catch (NullPointerException | Exception unused5) {
        }
        this.f25616 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21838(AbstractC21178 abstractC21178) {
        Lock lockWriteLock = this.f25581.writeLock();
        lockWriteLock.lock();
        try {
            this.f25567.remove(abstractC21178);
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21843() {
        if (this.f25616) {
            this.f25608.m49100().getClass();
            Lock lockWriteLock = this.f25581.writeLock();
            lockWriteLock.lock();
            try {
                this.f25629 = true;
                ArrayList arrayList = new ArrayList(this.f25567);
                lockWriteLock.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((AbstractC21178) it.next()).m47801();
                    } catch (Exception unused) {
                        this.f25608.m49100().getClass();
                    }
                }
                this.f25616 = false;
                C22795.m51000(this);
                C5754.m12831(this);
                C16009.m36381(this);
                synchronized (this.f25626) {
                    if (this.f25609 != null) {
                        Thread.yield();
                        this.f25609.interrupt();
                        this.f25609 = null;
                    }
                }
                this.f25596 = null;
                try {
                    C21099 c21099 = this.f25614;
                    if (c21099 != null) {
                        InputStream inputStream = c21099.f66297;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        OutputStream outputStream = this.f25614.f66298;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f25614.getClass();
                    }
                    Socket socket = this.f25604;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception unused2) {
                }
                this.f25614 = null;
                this.f25604 = null;
                lockWriteLock.lock();
                try {
                    this.f25629 = false;
                    this.f25567.clear();
                    lockWriteLock.unlock();
                    this.f25628 = 0;
                    this.f25630 = 0;
                    this.f25598 = true;
                    this.f25579 = false;
                    this.f25623 = false;
                    this.f25580 = null;
                    this.f25608.m49099(this);
                } catch (Throwable th) {
                    lockWriteLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                lockWriteLock.unlock();
                throw th2;
            }
        }
        C9383 c9383 = this.f25634;
        if (c9383 != null) {
            c9383.m21843();
            this.f25634 = null;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final ThreadFactoryC8042 m21852() {
        return this.f25584;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m21828(String str, int i, int i2, String str2) {
        C22795 c22795M50999 = C22795.m50999(this, str, i, str2, i2);
        RunnableC16758 runnableC16758 = new RunnableC16758(c22795M50999);
        this.f25584.getClass();
        Thread thread = new Thread(runnableC16758);
        thread.setName("PortWatcher Thread for " + str2);
        thread.start();
        return c22795M50999.f71834;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    /* JADX INFO: renamed from: ܳ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m21822(String str) {
        int i;
        InterfaceC22046 interfaceC22046 = this.f25627;
        if (str.equals("none")) {
            this.f25627 = null;
            if (interfaceC22046 != null) {
                interfaceC22046.end();
                return;
            }
            return;
        }
        String strM21829 = m21829(str);
        if (strM21829 != null) {
            if (str.equals("zlib") || (this.f25618 && str.equals("zlib@openssh.com"))) {
                try {
                    this.f25627 = (InterfaceC22046) Class.forName(strM21829).asSubclass(InterfaceC22046.class).getDeclaredConstructor(null).newInstance(null);
                    try {
                        i = Integer.parseInt(m21829("compression_level"));
                    } catch (Exception unused) {
                        i = 6;
                    }
                    this.f25627.mo26032(1, i, this);
                    if (interfaceC22046 != null) {
                        interfaceC22046.end();
                    }
                } catch (Exception e) {
                    throw new C14392(e.toString(), e);
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004d */
    /* JADX INFO: renamed from: ᩻ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m21827(String str) {
        InterfaceC22046 interfaceC22046 = this.f25572;
        if (str.equals("none")) {
            this.f25572 = null;
            if (interfaceC22046 != null) {
                interfaceC22046.end();
                return;
            }
            return;
        }
        String strM21829 = m21829(str);
        if (strM21829 != null) {
            if (str.equals("zlib") || (this.f25618 && str.equals("zlib@openssh.com"))) {
                try {
                    InterfaceC22046 interfaceC22047 = (InterfaceC22046) Class.forName(strM21829).asSubclass(InterfaceC22046.class).getDeclaredConstructor(null).newInstance(null);
                    this.f25572 = interfaceC22047;
                    interfaceC22047.mo26032(0, 0, this);
                    if (interfaceC22046 != null) {
                        interfaceC22046.end();
                    }
                } catch (Exception e) {
                    throw new C14392(e.toString(), e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private AbstractC21178 m21825(String str) {
        C7766 c7766;
        C15141 c15141 = str.equals(C0708d.f2642aw) ? new C15141() : null;
        if (str.equals("shell")) {
            C18021 c18021 = new C18021();
            c18021.f43227 = true;
            c15141 = c18021;
        }
        C15141 c23189 = c15141;
        if (str.equals("exec")) {
            c23189 = new C23189();
        }
        AbstractC21178 c16009 = c23189;
        if (str.equals("x11")) {
            c16009 = new C16009();
        }
        AbstractC21178 c3071 = c16009;
        if (str.equals("auth-agent@openssh.com")) {
            c3071 = new C3071();
        }
        AbstractC21178 c10448 = c3071;
        if (str.equals("direct-tcpip")) {
            c10448 = new C10448();
        }
        AbstractC21178 c5754 = c10448;
        if (str.equals("forwarded-tcpip")) {
            c5754 = new C5754();
        }
        AbstractC21178 abstractC21178 = c5754;
        if (str.equals("sftp")) {
            C3940 c3940 = new C3940();
            c3940.m7820(m21829("use_sftp_write_flush_workaround").equals("yes"));
            abstractC21178 = c3940;
        }
        AbstractC21178 abstractC21179 = abstractC21178;
        if (str.equals("subsystem")) {
            C18692 c18692 = new C18692();
            c18692.f55822 = true;
            c18692.f55823 = "";
            abstractC21179 = c18692;
        }
        AbstractC21178 abstractC211710 = abstractC21179;
        if (str.equals("direct-streamlocal@openssh.com")) {
            c7766 = new C7766();
        }
        if (abstractC211710 == null) {
            abstractC211710 = c7766;
            return null;
        }
        abstractC211710 = c7766;
        Lock lockWriteLock = this.f25581.writeLock();
        lockWriteLock.lock();
        try {
            if (this.f25629 || !this.f25616) {
                return null;
            }
            abstractC211710.f66560 = this;
            this.f25567.add(abstractC211710);
            return abstractC211710;
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final String[] m21849() {
        return this.f25580;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21837(InterfaceC20093 interfaceC20093) {
        this.f25632 = interfaceC20093;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC20093 m21851() {
        return this.f25632;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21832(String str, String str2) throws Throwable {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2 == null ? null : str2.getBytes();
        C21769 c21769 = this.f25608;
        c21769.m49095(C7687.m17801(c21769.f68545, "builtin", bytes), bytes2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m21848(String str) {
        if (str != null) {
            byte[] bArr = C20764.f65273;
            this.f25578 = C20764.m46886(str, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m21844(String str, String str2) {
        synchronized (this.f25626) {
            if (this.f25589 == null) {
                this.f25589 = new Hashtable();
            }
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                this.f25589.put("PubkeyAcceptedAlgorithms", str2);
            } else {
                this.f25589.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21829(String str) {
        if (str.equals("PubkeyAcceptedKeyTypes")) {
            str = "PubkeyAcceptedAlgorithms";
        }
        Hashtable hashtable = this.f25589;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String strM49091 = C21769.m49091(str);
        if (strM49091 != null) {
            return strM49091;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m21841() {
        return this.f25616;
    }

    static {
        byte[] bArr = C20764.f65273;
        f25565 = "keepalive@jcraft.com".getBytes(StandardCharsets.UTF_8);
        C20764.m46893("no-more-sessions@openssh.com");
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m21826(String str) {
        try {
            InterfaceC24727 interfaceC24727 = (InterfaceC24727) Class.forName(str).asSubclass(InterfaceC24727.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC24727.mo4571(0, new byte[interfaceC24727.getBlockSize()], new byte[interfaceC24727.mo4578()]);
            return true;
        } catch (Exception | LinkageError unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܺ */
    private void m21823() {
        if (m21829("ClearAllForwardings").equals("yes")) {
            return;
        }
        this.f25608.getClass();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC7372 m21850() {
        return this.f25608.m49100();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m21847() {
        InterfaceC24727 interfaceC24727 = this.f25577;
        InterfaceC3348 interfaceC3348 = this.f25621;
        int blockSize = 20;
        if (interfaceC24727 != null && (interfaceC24727.mo4576() || interfaceC24727.mo4577())) {
            if (interfaceC24727.mo4574() > 20) {
                blockSize = interfaceC24727.mo4574();
            }
        } else if (interfaceC3348 != null && interfaceC3348.getBlockSize() > 20) {
            blockSize = interfaceC3348.getBlockSize();
        }
        return blockSize + 64;
    }
}
