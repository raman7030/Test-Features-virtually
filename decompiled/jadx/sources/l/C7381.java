package l;

import com.alipay.sdk.m.o.b;
import com.alipay.sdk.m.y.q;
import com.google.android.material.color.MaterialColors;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.d;
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
public final class C7381 {

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final byte[] f22653;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC22198 f22654;

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public InterfaceC23526 f22656;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public InterfaceC1031 f22658;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22659;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public InterfaceC20705 f22660;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C16261 f22661;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public C8087 f22662;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22664;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public InterfaceC23526 f22665;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public byte[] f22673;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public byte[] f22678;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public byte[] f22681;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public Runnable f22682;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public RunnableC11615 f22684;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public byte[] f22685;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f22687;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public Socket f22692;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public String f22694;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public byte[] f22695;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C20413 f22696;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22698;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public byte[] f22701;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C19708 f22702;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public byte[] f22703;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public byte[] f22705;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f22708;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public InterfaceC1031 f22709;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC20705 f22715;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public InterfaceC18650 f22720;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public byte[] f22721;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C7381 f22722;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f22713 = "SSH-2.0-JSCH_2.27.6".getBytes(StandardCharsets.UTF_8);

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public int f22716 = 0;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public int f22718 = 0;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String[] f22671 = null;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22704 = false;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f22711 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f22691 = true;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f22663 = true;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22686 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22667 = false;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f22689 = true;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public boolean f22710 = false;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22706 = false;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public Thread f22697 = null;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public Object f22714 = new Object();

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public boolean f22676 = false;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f22679 = false;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Hashtable f22677 = null;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public int f22712 = 1;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public volatile String[] f22668 = null;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public volatile boolean f22690 = false;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public volatile long f22674 = 0;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public int f22680 = 6;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f22699 = 0;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public byte[] f22666 = null;

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public ThreadFactoryC5970 f22672 = new ThreadFactoryC5970();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f22717 = false;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ArrayList f22655 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f22669 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile boolean f22693 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f22675 = false;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public volatile String[] f22700 = null;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public int[] f22688 = new int[1];

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int[] f22657 = new int[1];

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public int f22670 = 8;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f22707 = 8;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13730 f22683 = new C13730();

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C4185 f22719 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19860(C7381 c7381) {
        this.f22722 = c7381;
    }

    public C7381(C20413 c20413, String str, String str2, int i) throws C12651 {
        String property = null;
        this.f22687 = "127.0.0.1";
        this.f22708 = 22;
        this.f22694 = null;
        this.f22696 = c20413;
        C16261 c16261 = new C16261();
        this.f22661 = c16261;
        this.f22662 = new C8087(c16261);
        this.f22694 = str;
        this.f22687 = str2;
        this.f22708 = i;
        if (str == null) {
            try {
                property = System.getProperty("user.name");
            } catch (SecurityException unused) {
            }
            this.f22694 = property;
        }
        if (this.f22694 == null) {
            throw new C12651("username is not given.");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19858(Runnable runnable) {
        this.f22682 = runnable;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d7  */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c2, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x03c3, code lost:
    
        r14.f22693 = false;
        r14.f22675 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c7, code lost:
    
        throw r0;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m19857() throws C12651 {
        boolean z;
        AbstractC9478 abstractC9478;
        if (this.f22704) {
            throw new C12651("session is already connected");
        }
        this.f22686 = true;
        this.f22702 = new C19708();
        if (f22654 == null) {
            try {
                f22654 = (InterfaceC22198) Class.forName(m19856("random")).asSubclass(InterfaceC22198.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Exception e) {
                throw new C12651(e.toString(), e);
            }
        }
        C8087.m21456(f22654);
        m19877().getClass();
        try {
            try {
                Socket socketM44589 = C19356.m44589(this.f22708, b.j0, this.f22687);
                this.f22692 = socketM44589;
                InputStream inputStream = socketM44589.getInputStream();
                OutputStream outputStream = this.f22692.getOutputStream();
                this.f22692.setTcpNoDelay(true);
                this.f22702.m45401(inputStream);
                this.f22702.m45402(outputStream);
                Socket socket = this.f22692;
                if (socket != null) {
                    socket.setSoTimeout(b.j0);
                }
                this.f22704 = true;
                m19877().getClass();
                this.f22696.m46774(this);
                byte[] bArr = this.f22713;
                int length = bArr.length;
                int i = length + 2;
                byte[] bArr2 = new byte[i];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                bArr2[length] = cb.k;
                bArr2[length + 1] = 10;
                C19708 c19708 = this.f22702;
                c19708.f63667.write(bArr2, 0, i);
                c19708.f63667.flush();
                while (true) {
                    int i2 = 0;
                    int iM45403 = 0;
                    while (i2 < this.f22661.f50016.length && (iM45403 = this.f22702.m45403()) >= 0) {
                        this.f22661.f50016[i2] = (byte) iM45403;
                        i2++;
                        if (iM45403 == 10) {
                            break;
                        }
                    }
                    if (iM45403 < 0) {
                        throw new C12651("connection is closed by foreign host");
                    }
                    byte[] bArr3 = this.f22661.f50016;
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
                            throw new C12651("invalid server's version string");
                        }
                        byte[] bArr4 = new byte[i2];
                        this.f22681 = bArr4;
                        System.arraycopy(bArr3, 0, bArr4, 0, i2);
                        this.f22690 = C19356.m44588(this.f22681).startsWith("SSH-2.0-OpenSSH_7.4");
                        m19877().getClass();
                        Runnable runnable = this.f22682;
                        if (runnable != null) {
                            runnable.run();
                        }
                        this.f22691 = m19856("enable_server_sig_algs").equals("yes");
                        this.f22663 = m19856("enable_ext_info_in_auth").equals("yes");
                        this.f22689 = m19856("enable_strict_kex").equals("yes");
                        this.f22710 = m19856("require_strict_kex").equals("yes");
                        m19846();
                        C16261 c16261 = this.f22661;
                        m19863(c16261);
                        this.f22661 = c16261;
                        if (c16261.m38244() != 20) {
                            this.f22693 = false;
                            throw new C12651("invalid protocol: " + ((int) this.f22661.m38244()));
                        }
                        m19877().getClass();
                        AbstractC16553 abstractC16553M19847 = m19847(this.f22661);
                        do {
                            C16261 c16262 = this.f22661;
                            m19863(c16262);
                            this.f22661 = c16262;
                            if (abstractC16553M19847.mo18945() == this.f22661.m38244()) {
                                this.f22674 = System.currentTimeMillis();
                                boolean zMo18944 = abstractC16553M19847.mo18944(this.f22661);
                                if (!zMo18944) {
                                    this.f22693 = false;
                                    throw new C12651("verify: " + zMo18944);
                                }
                            } else {
                                this.f22693 = false;
                                throw new C12651("invalid protocol(kex): " + ((int) this.f22661.m38244()));
                            }
                        } while (abstractC16553M19847.mo18945() != 0);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        this.f22675 = true;
                        m19841(this.f22687, this.f22708, abstractC16553M19847);
                        this.f22675 = false;
                        this.f22674 = (System.currentTimeMillis() - jCurrentTimeMillis) + this.f22674;
                        C8087 c8087 = this.f22662;
                        c8087.m21457();
                        this.f22661.m38234((byte) 21);
                        m19872(c8087);
                        this.f22696.m46777().getClass();
                        C16261 c16263 = this.f22661;
                        m19863(c16263);
                        this.f22661 = c16263;
                        if (c16263.m38244() == 21) {
                            m19877().getClass();
                            m19843(abstractC16553M19847);
                            this.f22686 = false;
                            if (this.f22691 && this.f22663 && this.f22711) {
                                m19845();
                            }
                            try {
                                String strM19856 = m19856("MaxAuthTries");
                                if (strM19856 != null) {
                                    this.f22680 = Integer.parseInt(strM19856);
                                }
                                try {
                                    C15826 c15826 = (C15826) Class.forName(m19856("userauth.none")).asSubclass(C15826.class).getDeclaredConstructor(null).newInstance(null);
                                    boolean zMo7854 = c15826.mo7854(this);
                                    String strM19857 = m19856("PreferredAuthentications");
                                    String[] strArrM44594 = C19356.m44594(strM19857);
                                    if (zMo7854) {
                                        strM19857 = null;
                                    } else {
                                        String strM37457 = c15826.m37457();
                                        if (strM37457 != null) {
                                            strM19857 = strM37457.toLowerCase(Locale.ROOT);
                                        }
                                    }
                                    String[] strArrM44595 = C19356.m44594(strM19857);
                                    int i4 = 0;
                                    loop3: while (true) {
                                        z = false;
                                        while (!zMo7854 && strArrM44594 != null && i4 < strArrM44594.length) {
                                            int i5 = i4 + 1;
                                            String str = strArrM44594[i4];
                                            int i6 = 0;
                                            while (true) {
                                                if (i6 < strArrM44595.length) {
                                                    if (strArrM44595[i6].equals(str)) {
                                                        m19877().getClass();
                                                        try {
                                                            if (m19856("userauth." + str) != null) {
                                                                abstractC9478 = (AbstractC9478) Class.forName(m19856("userauth." + str)).asSubclass(AbstractC9478.class).getDeclaredConstructor(null).newInstance(null);
                                                            } else {
                                                                abstractC9478 = null;
                                                            }
                                                        } catch (Exception unused) {
                                                            m19877().getClass();
                                                        }
                                                        if (abstractC9478 != null) {
                                                            try {
                                                                zMo7854 = abstractC9478.mo7854(this);
                                                                if (zMo7854) {
                                                                    m19877().getClass();
                                                                }
                                                                z = false;
                                                            } catch (RuntimeException e2) {
                                                                throw e2;
                                                            } catch (C3479 unused2) {
                                                                z = true;
                                                            } catch (C6301 e3) {
                                                                String strM17343 = e3.m17343();
                                                                String[] strArrM44596 = C19356.m44594(strM17343);
                                                                int i7 = !strM19857.equals(strM17343) ? 0 : i5;
                                                                strM19857 = strM17343;
                                                                strArrM44595 = strArrM44596;
                                                                i4 = i7;
                                                            } catch (C12651 e4) {
                                                                throw e4;
                                                            } catch (Exception unused3) {
                                                                m19877().getClass();
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
                                    if (!zMo7854) {
                                        if (this.f22699 >= this.f22680) {
                                            m19877().getClass();
                                        }
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(z ? "Auth cancel" : "Auth fail");
                                        sb.append(" for methods '");
                                        sb.append(strM19857);
                                        sb.append("'");
                                        throw new C12651(sb.toString());
                                    }
                                    Socket socket2 = this.f22692;
                                    if (socket2 != null) {
                                        socket2.setSoTimeout(0);
                                    }
                                    this.f22706 = true;
                                    synchronized (this.f22714) {
                                        if (this.f22704) {
                                            Thread threadNewThread = m19879().newThread(new RunnableC11615(this));
                                            this.f22697 = threadNewThread;
                                            threadNewThread.setName("Connect thread " + this.f22687 + " session");
                                            this.f22697.start();
                                            m19850();
                                        }
                                    }
                                    C19356.m44596(this.f22666);
                                    this.f22666 = null;
                                    return;
                                } catch (Exception e5) {
                                    throw new C12651(e5.toString(), e5);
                                }
                            } catch (NumberFormatException e6) {
                                throw new C12651("MaxAuthTries: " + m19856("MaxAuthTries"), e6);
                            }
                        }
                        this.f22693 = false;
                        throw new C12651("invalid protocol(newkeys): " + ((int) this.f22661.m38244()));
                    }
                }
            } catch (Exception e7) {
                this.f22693 = false;
                try {
                    if (this.f22704) {
                        String string = e7.toString();
                        this.f22662.m21457();
                        this.f22661.m38235(string.length() + 15 + m19874());
                        this.f22661.m38234((byte) 1);
                        this.f22661.m38245(3);
                        this.f22661.m38256(C19356.m44599(string));
                        this.f22661.m38256(C19356.m44599("en"));
                        m19872(this.f22662);
                    }
                } catch (Exception unused4) {
                }
                try {
                    m19870();
                } catch (Exception unused5) {
                }
                this.f22704 = false;
                if (e7 instanceof RuntimeException) {
                    throw ((RuntimeException) e7);
                }
                if (e7 instanceof C12651) {
                    throw ((C12651) e7);
                }
                throw new C12651("Session.connect: " + e7, e7);
            }
        } catch (Throwable th) {
            C19356.m44596(this.f22666);
            this.f22666 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC16553 m19847(C16261 c16261) throws C12651 {
        boolean z;
        int iM38250 = c16261.m38250();
        boolean z2 = true;
        if (iM38250 != c16261.m38255()) {
            c16261.m38233();
            this.f22695 = new byte[c16261.f50017 - 5];
        } else {
            this.f22695 = new byte[(iM38250 - 1) - c16261.m38233()];
        }
        byte[] bArr = c16261.f50016;
        int i = c16261.f50018;
        byte[] bArr2 = this.f22695;
        int i2 = 0;
        System.arraycopy(bArr, i, bArr2, 0, bArr2.length);
        if (this.f22686) {
            if (this.f22689 || this.f22710) {
                C16261 c16262 = new C16261(this.f22695);
                c16262.f50018 = 17;
                byte[] bArrM38257 = c16262.m38257();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= bArrM38257.length) {
                        z = false;
                        break;
                    }
                    while (i3 < bArrM38257.length && bArrM38257[i3] != 44) {
                        i3++;
                    }
                    if (i4 != i3 && "kex-strict-s-v00@openssh.com".equals(C19356.m44585(i4, i3 - i4, bArrM38257))) {
                        z = true;
                        break;
                    }
                    i4 = i3 + 1;
                    i3 = i4;
                }
                this.f22667 = z;
                if (this.f22667) {
                    this.f22696.m46777().getClass();
                    if (this.f22716 != 1) {
                        throw new C14061("KEXINIT not first packet from server");
                    }
                } else if (this.f22710) {
                    throw new C14061("Strict KEX not supported by server");
                }
            }
            if (this.f22691) {
                C16261 c16263 = new C16261(this.f22695);
                c16263.f50018 = 17;
                byte[] bArrM38258 = c16263.m38257();
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if (i5 >= bArrM38258.length) {
                        z2 = false;
                        break;
                    }
                    while (i5 < bArrM38258.length && bArrM38258[i5] != 44) {
                        i5++;
                    }
                    if (i6 != i5) {
                        if ("ext-info-s".equals(C19356.m44585(i6, i5 - i6, bArrM38258))) {
                            break;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    }
                }
                this.f22711 = z2;
                if (this.f22711) {
                    this.f22696.m46777().getClass();
                }
            }
        }
        if (!this.f22693) {
            m19846();
        }
        byte[] bArr3 = this.f22695;
        byte[] bArr4 = this.f22703;
        String[] strArr = new String[10];
        C16261 c16264 = new C16261(bArr3);
        c16264.f50018 = 17;
        C16261 c16265 = new C16261(bArr4);
        c16265.f50018 = 17;
        this.f22696.m46777().getClass();
        int i7 = 0;
        for (int i8 = 10; i7 < i8; i8 = 10) {
            byte[] bArrM38259 = c16264.m38257();
            byte[] bArrM382510 = c16265.m38257();
            int i9 = 0;
            int i10 = 0;
            while (i9 < bArrM382510.length) {
                while (i9 < bArrM382510.length && bArrM382510[i9] != 44) {
                    i9++;
                }
                if (i10 == i9) {
                    int length = bArrM382510.length;
                    Charset charset = StandardCharsets.UTF_8;
                    throw new C4890(i7, new String(bArrM382510, i2, length, charset), new String(bArrM38259, i2, bArrM38259.length, charset));
                }
                String strM44585 = C19356.m44585(i10, i9 - i10, bArrM382510);
                int i11 = 0;
                int i12 = 0;
                while (i12 < bArrM38259.length) {
                    while (i12 < bArrM38259.length && bArrM38259[i12] != 44) {
                        i12++;
                    }
                    if (i11 == i12) {
                        int length2 = bArrM382510.length;
                        Charset charset2 = StandardCharsets.UTF_8;
                        throw new C4890(i7, new String(bArrM382510, 0, length2, charset2), new String(bArrM38259, 0, bArrM38259.length, charset2));
                    }
                    if (strM44585.equals(C19356.m44585(i11, i12 - i11, bArrM38259))) {
                        strArr[i7] = strM44585;
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
                int length3 = bArrM382510.length;
                Charset charset3 = StandardCharsets.UTF_8;
                throw new C4890(i7, new String(bArrM382510, 0, length3, charset3), new String(bArrM38259, 0, bArrM38259.length, charset3));
            }
            i7++;
            i2 = 0;
        }
        try {
            if (((InterfaceC23526) Class.forName(m19856(strArr[3])).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null)).mo2210()) {
                strArr[5] = null;
            }
            if (((InterfaceC23526) Class.forName(m19856(strArr[2])).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null)).mo2210()) {
                strArr[4] = null;
            }
            this.f22696.m46777().getClass();
            this.f22671 = strArr;
            if (strArr[0].equals("ext-info-c") || this.f22671[0].equals("ext-info-s") || this.f22671[0].equals("kex-strict-c-v00@openssh.com") || this.f22671[0].equals("kex-strict-s-v00@openssh.com")) {
                throw new C12651("Invalid Kex negotiated: " + this.f22671[0]);
            }
            if (!this.f22706 && (this.f22671[2].equals("none") || this.f22671[3].equals("none"))) {
                throw new C12651("NONE Cipher should not be chosen before authentification is successed.");
            }
            try {
                AbstractC16553 abstractC16553 = (AbstractC16553) Class.forName(m19856(this.f22671[0])).asSubclass(AbstractC16553.class).getDeclaredConstructor(null).newInstance(null);
                byte[] bArr5 = this.f22681;
                byte[] bArr6 = this.f22713;
                byte[] bArr7 = this.f22695;
                byte[] bArr8 = this.f22703;
                abstractC16553.f50859 = this;
                abstractC16553.mo18943(this, bArr5, bArr6, bArr7, bArr8);
                return abstractC16553;
            } catch (Exception | LinkageError e) {
                throw new C12651(e.toString(), e);
            }
        } catch (Exception | LinkageError e2) {
            throw new C12651(e2.toString(), e2);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String[] m19866() {
        return this.f22700;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:58:0x014a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f1  */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m19846() throws C12651 {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        if (this.f22693) {
            return;
        }
        String strM19856 = m19856("cipher.c2s");
        String strM19857 = m19856("cipher.s2c");
        String strM19858 = m19856("CheckCiphers");
        C20413 c20413 = this.f22696;
        int i = -1;
        if (strM19858 == null || strM19858.length() == 0) {
            strArr = null;
        } else {
            c20413.m46777().getClass();
            String strM19859 = m19856("cipher.c2s");
            String strM198510 = m19856("cipher.s2c");
            Vector vector = new Vector();
            for (String str : C19356.m44594(strM19858)) {
                if ((strM198510.indexOf(str) != -1 || strM19859.indexOf(str) != -1) && !m19853(m19856(str))) {
                    vector.addElement(str);
                }
            }
            if (vector.size() == 0) {
                strArr = null;
            } else {
                strArr = new String[vector.size()];
                System.arraycopy(vector.toArray(), 0, strArr, 0, vector.size());
                c20413.m46777().getClass();
            }
        }
        if (strArr != null && strArr.length > 0) {
            this.f22696.m46777().getClass();
            strM19856 = C19356.m44586(strM19856, strArr);
            strM19857 = C19356.m44586(strM19857, strArr);
            if (strM19856 == null || strM19857 == null) {
                throw new C12651("There are not any available ciphers.");
            }
            this.f22696.m46777().getClass();
        }
        String str2 = strM19857;
        String strM198511 = m19856("mac.c2s");
        String strM198512 = m19856("mac.s2c");
        String strM198513 = m19856("CheckMacs");
        C20413 c20414 = this.f22696;
        if (strM198513 == null || strM198513.length() == 0) {
            strArr2 = null;
        } else {
            c20414.m46777().getClass();
            String strM198514 = m19856("mac.c2s");
            String strM198515 = m19856("mac.s2c");
            Vector vector2 = new Vector();
            String[] strArrM44594 = C19356.m44594(strM198513);
            int i2 = 0;
            while (i2 < strArrM44594.length) {
                String str3 = strArrM44594[i2];
                if (strM198515.indexOf(str3) != i || strM198514.indexOf(str3) != i) {
                    try {
                        InterfaceC1031 interfaceC1031 = (InterfaceC1031) Class.forName(m19856(str3)).asSubclass(InterfaceC1031.class).getDeclaredConstructor(null).newInstance(null);
                        interfaceC1031.init(new byte[interfaceC1031.getBlockSize()]);
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
                c20414.m46777().getClass();
            }
        }
        if (strArr2 != null && strArr2.length > 0) {
            this.f22696.m46777().getClass();
            String strM44586 = C19356.m44586(strM198511, strArr2);
            String strM44587 = C19356.m44586(strM198512, strArr2);
            if (strM44586 == null || strM44587 == null) {
                throw new C12651("There are not any available macs.");
            }
            this.f22696.m46777().getClass();
        }
        String strM198516 = m19856("kex");
        String strM198517 = m19856("CheckKexes");
        C20413 c20415 = this.f22696;
        if (strM198517 == null || strM198517.length() == 0) {
            strArr3 = null;
        } else {
            c20415.m46777().getClass();
            Vector vector3 = new Vector();
            String[] strArrM44595 = C19356.m44594(strM198517);
            for (int i3 = 0; i3 < strArrM44595.length; i3++) {
                try {
                    AbstractC16553 abstractC16553 = (AbstractC16553) Class.forName(m19856(strArrM44595[i3])).asSubclass(AbstractC16553.class).getDeclaredConstructor(null).newInstance(null);
                    abstractC16553.f50859 = this;
                    abstractC16553.mo18943(this, null, null, null, null);
                } catch (Exception | LinkageError unused2) {
                    vector3.addElement(strArrM44595[i3]);
                }
            }
            if (vector3.size() == 0) {
                strArr3 = null;
            } else {
                strArr3 = new String[vector3.size()];
                System.arraycopy(vector3.toArray(), 0, strArr3, 0, vector3.size());
                c20415.m46777().getClass();
            }
        }
        if (strArr3 != null && strArr3.length > 0) {
            this.f22696.m46777().getClass();
            strM198516 = C19356.m44586(strM198516, strArr3);
            if (strM198516 == null) {
                throw new C12651("There are not any available kexes.");
            }
            this.f22696.m46777().getClass();
        }
        if (this.f22691 && !this.f22706) {
            strM198516 = C16014.m37867(strM198516, ",ext-info-c");
        }
        if ((this.f22689 || this.f22710) && this.f22686) {
            strM198516 = C16014.m37867(strM198516, ",kex-strict-c-v00@openssh.com");
        }
        String strM198518 = m19856("server_host_key");
        String strM198519 = m19856("CheckSignatures");
        C20413 c20416 = this.f22696;
        if (strM198519 == null || strM198519.length() == 0) {
            strArr4 = null;
        } else {
            c20416.m46777().getClass();
            Vector vector4 = new Vector();
            String[] strArrM44596 = C19356.m44594(strM198519);
            for (int i4 = 0; i4 < strArrM44596.length; i4++) {
                try {
                    ((InterfaceC17944) Class.forName(C20413.m46768(strArrM44596[i4])).asSubclass(InterfaceC17944.class).getDeclaredConstructor(null).newInstance(null)).init();
                } catch (Exception | LinkageError unused3) {
                    vector4.addElement(strArrM44596[i4]);
                }
            }
            if (vector4.size() == 0) {
                strArr4 = null;
            } else {
                strArr4 = new String[vector4.size()];
                System.arraycopy(vector4.toArray(), 0, strArr4, 0, vector4.size());
                c20416.m46777().getClass();
            }
        }
        this.f22700 = strArr4;
        if (strArr4 != null && strArr4.length > 0) {
            this.f22696.m46777().getClass();
            strM198518 = C19356.m44586(strM198518, strArr4);
            if (strM198518 == null) {
                throw new C12651("There are not any available sig algorithm.");
            }
            this.f22696.m46777().getClass();
        }
        if (m19856("prefer_known_host_key_types").equals("yes")) {
            this.f22696.m46777().getClass();
            InterfaceC19002 interfaceC19002M46771 = this.f22696.m46771();
            String string = this.f22687;
            if (this.f22708 != 22) {
                StringBuilder sbM9834 = C3200.m9834("[", string, "]:");
                sbM9834.append(this.f22708);
                string = sbM9834.toString();
            }
            C4185[] c4185ArrM44641 = ((C19377) interfaceC19002M46771).m44641(string, (String) null);
            if (c4185ArrM44641.length > 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(Arrays.asList(C19356.m44594(strM198518)));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String str5 = (str4.equals("rsa-sha2-256") || str4.equals("rsa-sha2-512") || str4.equals("ssh-rsa-sha224@ssh.com") || str4.equals("ssh-rsa-sha256@ssh.com") || str4.equals("ssh-rsa-sha384@ssh.com") || str4.equals("ssh-rsa-sha512@ssh.com")) ? OpenSSHPublicKeyUtil.RSA : str4;
                    for (C4185 c4185 : c4185ArrM44641) {
                        if (c4185.m12630().equals(str5)) {
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
                    strM198518 = sb.toString();
                }
            }
            this.f22696.m46777().getClass();
        }
        this.f22674 = System.currentTimeMillis();
        this.f22693 = true;
        C16261 c16261 = new C16261();
        C8087 c8087 = new C8087(c16261);
        c8087.m21457();
        c16261.m38234((byte) 20);
        synchronized (f22654) {
            f22654.mo3071(c16261.f50017, 16, c16261.f50016);
            c16261.m38251(16);
        }
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256(C19356.m44592(strM198516, charset));
        c16261.m38256(C19356.m44592(strM198518, charset));
        c16261.m38256(C19356.m44592(strM19856, charset));
        c16261.m38256(C19356.m44592(str2, charset));
        c16261.m38256(C19356.m44592(m19856("mac.c2s"), charset));
        c16261.m38256(C19356.m44592(m19856("mac.s2c"), charset));
        c16261.m38256(C19356.m44592(m19856("compression.c2s"), charset));
        c16261.m38256(C19356.m44592(m19856("compression.s2c"), charset));
        c16261.m38256(C19356.m44592(m19856("lang.c2s"), charset));
        c16261.m38256(C19356.m44592(m19856("lang.s2c"), charset));
        c16261.m38234((byte) 0);
        c16261.m38245(0);
        c16261.f50018 = 5;
        int iM38255 = c16261.m38255();
        byte[] bArr = new byte[iM38255];
        this.f22703 = bArr;
        c16261.m38236(0, iM38255, bArr);
        m19872(c8087);
        this.f22696.m46777().getClass();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m19845() throws C12651 {
        C8087 c8087 = this.f22662;
        c8087.m21457();
        this.f22661.m38234((byte) 7);
        this.f22661.m38245(1);
        C16261 c16261 = this.f22661;
        Charset charset = StandardCharsets.UTF_8;
        c16261.m38256(C19356.m44592("ext-info-in-auth@openssh.com", charset));
        this.f22661.m38256(C19356.m44592("0", charset));
        m19872(c8087);
        this.f22696.m46777().getClass();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19841(String str, int i, AbstractC16553 abstractC16553) throws C11946, C7712, C13356 {
        C19377 c19377;
        int iM44639;
        boolean z;
        String strM19856 = m19856("StrictHostKeyChecking");
        byte[] bArr = abstractC16553.f50858;
        String strM38943 = abstractC16553.m38943();
        InterfaceC2774 interfaceC2774 = null;
        try {
            interfaceC2774 = (InterfaceC2774) Class.forName(abstractC16553.f50859.m19856(abstractC16553.f50859.m19856("FingerprintHash").toLowerCase(Locale.ROOT))).asSubclass(InterfaceC2774.class).getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            abstractC16553.f50859.f22696.m46777().getClass();
        }
        String strM44587 = C19356.m44587(interfaceC2774, abstractC16553.f50858);
        String str2 = i != 22 ? "[" + str + "]:" + i : str;
        InterfaceC19002 interfaceC19002M46771 = this.f22696.m46771();
        if (m19856("HashKnownHosts").equals("yes") && C12354.m29972(interfaceC19002M46771)) {
            C18671 c18671 = new C18671((C19377) interfaceC19002M46771, "", str2, 0, bArr, null);
            c18671.m43288();
            this.f22719 = c18671;
        } else {
            this.f22719 = new C4185(str2, 0, bArr);
        }
        synchronized (interfaceC19002M46771) {
            c19377 = (C19377) interfaceC19002M46771;
            iM44639 = c19377.m44639(str2, bArr);
        }
        if ((strM19856.equals("ask") || strM19856.equals("yes")) && iM44639 == 2) {
            synchronized (interfaceC19002M46771) {
            }
            if (this.f22720 != null) {
                if (strM19856.equals("ask")) {
                    this.f22720.getClass();
                    synchronized (interfaceC19002M46771) {
                        c19377.m44642(str2, abstractC16553.m38941());
                    }
                    z = true;
                } else {
                    this.f22720.getClass();
                }
            }
            throw new C13356(C20094.m46315("HostKey has been changed: ", str2));
        }
        z = false;
        if ((strM19856.equals("ask") || strM19856.equals("yes")) && iM44639 != 0 && !z) {
            if (strM19856.equals("yes")) {
                throw new C7712(C20094.m46315("reject HostKey: ", str2));
            }
            if (this.f22720 == null) {
                if (iM44639 != 1) {
                    throw new C13356(C20094.m46315("HostKey has been changed: ", str2));
                }
                StringBuilder sbM10501 = C3435.m10501("UnknownHostKey: ", str2, ". ", strM38943, " key fingerprint is ");
                sbM10501.append(strM44587);
                throw new C7712(sbM10501.toString());
            }
            z = true;
        }
        if (strM19856.equals("no") && 1 == iM44639) {
            z = true;
        }
        if (iM44639 == 0) {
            C4185[] c4185ArrM44641 = c19377.m44641(str2, abstractC16553.m38941());
            byte[] bArrM44593 = C19356.m44593(bArr, bArr.length, true);
            String str3 = new String(bArrM44593, 0, bArrM44593.length, StandardCharsets.UTF_8);
            for (int i2 = 0; i2 < c4185ArrM44641.length; i2++) {
                byte[] bArr2 = c4185ArrM44641[i2].f13634;
                byte[] bArrM44594 = C19356.m44593(bArr2, bArr2.length, true);
                if (new String(bArrM44594, 0, bArrM44594.length, StandardCharsets.UTF_8).equals(str3) && c4185ArrM44641[i2].f13635.equals("@revoked")) {
                    this.f22696.m46777().getClass();
                    throw new C11946(C20094.m46315("revoked HostKey: ", str2));
                }
            }
        }
        if (iM44639 == 0) {
            this.f22696.m46777().getClass();
        }
        if (z) {
            this.f22696.m46777().getClass();
        }
        if (z) {
            synchronized (interfaceC19002M46771) {
                c19377.m44640(this.f22719, this.f22720);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC19791 m19869(String str) throws C12651 {
        if (!this.f22704) {
            throw new C12651("session is down");
        }
        try {
            AbstractC19791 abstractC19791M19852 = m19852(str);
            if (abstractC19791M19852 != null) {
                abstractC19791M19852.mo5591();
                if (abstractC19791M19852 instanceof C13439) {
                    this.f22696.getClass();
                }
                return abstractC19791M19852;
            }
            this.f22696.m46777().getClass();
            return null;
        } catch (Exception unused) {
            this.f22696.m46777().getClass();
            return null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19861(C8087 c8087) {
        InterfaceC1031 interfaceC1031;
        InterfaceC20705 interfaceC20705 = this.f22715;
        boolean z = false;
        if (interfaceC20705 != null) {
            C16261 c16261 = c8087.f24903;
            int i = c16261.f50017;
            int[] iArr = this.f22657;
            iArr[0] = i;
            c16261.f50016 = interfaceC20705.mo24025(c16261.f50016, iArr);
            c8087.f24903.f50017 = iArr[0];
        }
        InterfaceC23526 interfaceC23526 = this.f22665;
        int i2 = interfaceC23526 != null ? this.f22707 : 8;
        boolean z2 = interfaceC23526 != null && interfaceC23526.mo2209();
        InterfaceC23526 interfaceC23527 = this.f22665;
        boolean z3 = interfaceC23527 != null && interfaceC23527.mo2210();
        boolean z4 = (z2 || z3 || this.f22665 == null || (interfaceC1031 = this.f22709) == null || !interfaceC1031.mo3562()) ? false : true;
        if (!z2 && !z3 && !z4) {
            z = true;
        }
        c8087.m21458(i2, z);
        C16261 c16262 = c8087.f24903;
        byte[] bArr = c16262.f50016;
        if (z2) {
            this.f22665.mo2202(this.f22718);
            this.f22665.mo2203(0, bArr, 4, bArr, 0);
            this.f22665.mo2208(0, bArr, c16262.f50017, bArr, 0);
            c16262.m38251(this.f22665.mo2207());
            return;
        }
        if (z3) {
            this.f22665.mo2205(bArr);
            this.f22665.mo2208(4, bArr, c16262.f50017 - 4, bArr, 4);
            c16262.m38251(this.f22665.mo2207());
            return;
        }
        if (z4) {
            this.f22665.mo2203(4, bArr, c16262.f50017 - 4, bArr, 4);
            this.f22709.mo3560(this.f22718);
            this.f22709.mo3561(c16262.f50017, c16262.f50016);
            this.f22709.mo3563(c16262.f50017, c16262.f50016);
            c16262.m38251(this.f22709.getBlockSize());
            return;
        }
        InterfaceC1031 interfaceC1032 = this.f22709;
        if (interfaceC1032 != null) {
            interfaceC1032.mo3560(this.f22718);
            this.f22709.mo3561(c16262.f50017, c16262.f50016);
            this.f22709.mo3563(c16262.f50017, c16262.f50016);
        }
        InterfaceC23526 interfaceC23528 = this.f22665;
        if (interfaceC23528 != null) {
            interfaceC23528.mo2203(0, bArr, c16262.f50017, bArr, 0);
        }
        InterfaceC1031 interfaceC1033 = this.f22709;
        if (interfaceC1033 != null) {
            c16262.m38251(interfaceC1033.getBlockSize());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC19791 m19840(int i) {
        Lock lock = this.f22669.readLock();
        lock.lock();
        try {
            for (AbstractC19791 abstractC19791 : this.f22655) {
                if (abstractC19791.f63920 == i) {
                    return abstractC19791;
                }
            }
            return null;
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19863(C16261 c16261) throws IOException {
        char c;
        boolean z;
        InterfaceC1031 interfaceC1031;
        InterfaceC23526 interfaceC23526 = this.f22656;
        char c2 = 1;
        boolean z2 = interfaceC23526 != null && interfaceC23526.mo2209();
        InterfaceC23526 interfaceC23527 = this.f22656;
        boolean z3 = interfaceC23527 != null && interfaceC23527.mo2210();
        boolean z4 = (z2 || z3 || this.f22656 == null || (interfaceC1031 = this.f22658) == null || !interfaceC1031.mo3562()) ? false : true;
        while (true) {
            c16261.m38242();
            if (z2) {
                this.f22702.m45400(c16261.f50017, 4, c16261.f50016);
                c16261.f50017 += 4;
                this.f22656.mo2202(this.f22716);
                byte[] bArr = new byte[4];
                this.f22656.mo2203(0, c16261.f50016, 4, bArr, 0);
                int i = ((bArr[c2] << 16) & 16711680) | ((bArr[0] << 24) & (-16777216)) | ((bArr[2] << 8) & 65280) | (bArr[3] & 255);
                if (i < 5 || i > 262144) {
                    break;
                }
                int iMo2207 = this.f22656.mo2207() + i;
                int i2 = c16261.f50017;
                int i3 = i2 + iMo2207;
                byte[] bArr2 = c16261.f50016;
                if (i3 > bArr2.length) {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, 0, bArr3, 0, i2);
                    c16261.f50016 = bArr3;
                }
                if (iMo2207 % this.f22670 != 0) {
                    this.f22696.m46777().getClass();
                    m19842(c16261, this.f22656, this.f22658, 0, 262144 - this.f22670);
                    throw null;
                }
                this.f22702.m45400(c16261.f50017, iMo2207, c16261.f50016);
                int iMo2208 = iMo2207 - this.f22656.mo2207();
                c16261.f50017 += iMo2208;
                try {
                    InterfaceC23526 interfaceC23528 = this.f22656;
                    byte[] bArr4 = c16261.f50016;
                    interfaceC23528.mo2208(0, bArr4, iMo2208 + 4, bArr4, 0);
                    System.arraycopy(bArr, 0, c16261.f50016, 0, 4);
                } catch (AEADBadTagException e) {
                    throw new C12651("Packet corrupt", e);
                }
            } else if (z3 || z4) {
                this.f22702.m45400(c16261.f50017, 4, c16261.f50016);
                c16261.f50017 += 4;
                byte[] bArr5 = c16261.f50016;
                int iMo2209 = (65280 & (bArr5[2] << 8)) | (16711680 & (bArr5[1] << 16)) | ((-16777216) & (bArr5[0] << 24)) | (bArr5[3] & 255);
                if (iMo2209 < 5 || iMo2209 > 262144) {
                    m19842(c16261, this.f22656, this.f22658, 0, 262144);
                    throw null;
                }
                if (z3) {
                    iMo2209 += this.f22656.mo2207();
                }
                int i4 = iMo2209;
                int i5 = c16261.f50017;
                int i6 = i5 + i4;
                byte[] bArr6 = c16261.f50016;
                if (i6 > bArr6.length) {
                    byte[] bArr7 = new byte[i6];
                    System.arraycopy(bArr6, 0, bArr7, 0, i5);
                    c16261.f50016 = bArr7;
                }
                if (i4 % this.f22670 != 0) {
                    this.f22696.m46777().getClass();
                    m19842(c16261, this.f22656, this.f22658, 0, 262144 - this.f22670);
                    throw null;
                }
                this.f22702.m45400(c16261.f50017, i4, c16261.f50016);
                c16261.f50017 += i4;
                if (z3) {
                    try {
                        this.f22656.mo2205(c16261.f50016);
                        InterfaceC23526 interfaceC23529 = this.f22656;
                        byte[] bArr8 = c16261.f50016;
                        interfaceC23529.mo2208(4, bArr8, i4, bArr8, 4);
                        c16261.f50017 -= this.f22656.mo2207();
                    } catch (AEADBadTagException e2) {
                        throw new C12651("Packet corrupt", e2);
                    }
                } else {
                    this.f22658.mo3560(this.f22716);
                    this.f22658.mo3561(c16261.f50017, c16261.f50016);
                    this.f22658.mo3563(0, this.f22678);
                    C19708 c19708 = this.f22702;
                    byte[] bArr9 = this.f22698;
                    c19708.m45400(0, bArr9.length, bArr9);
                    if (!C19356.m44597(this.f22678, this.f22698)) {
                        throw new C12651("Packet corrupt");
                    }
                    InterfaceC23526 interfaceC235210 = this.f22656;
                    byte[] bArr10 = c16261.f50016;
                    interfaceC235210.mo2203(4, bArr10, i4, bArr10, 4);
                }
            } else {
                this.f22702.m45400(c16261.f50017, this.f22670, c16261.f50016);
                int i7 = c16261.f50017;
                int i8 = this.f22670;
                c16261.f50017 = i7 + i8;
                InterfaceC23526 interfaceC235211 = this.f22656;
                if (interfaceC235211 != null) {
                    byte[] bArr11 = c16261.f50016;
                    interfaceC235211.mo2203(0, bArr11, i8, bArr11, 0);
                }
                byte[] bArr12 = c16261.f50016;
                int i9 = (65280 & (bArr12[2] << 8)) | (16711680 & (bArr12[1] << 16)) | ((-16777216) & (bArr12[0] << 24)) | (bArr12[3] & 255);
                if (i9 < 5 || i9 > 262144) {
                    m19842(c16261, this.f22656, this.f22658, 0, 262144);
                    throw null;
                }
                int i10 = (i9 + 4) - this.f22670;
                int i11 = c16261.f50017;
                int i12 = i11 + i10;
                if (i12 > bArr12.length) {
                    byte[] bArr13 = new byte[i12];
                    System.arraycopy(bArr12, 0, bArr13, 0, i11);
                    c16261.f50016 = bArr13;
                }
                if (i10 % this.f22670 != 0) {
                    this.f22696.m46777().getClass();
                    m19842(c16261, this.f22656, this.f22658, 0, 262144 - this.f22670);
                    throw null;
                }
                if (i10 > 0) {
                    this.f22702.m45400(c16261.f50017, i10, c16261.f50016);
                    c16261.f50017 += i10;
                    InterfaceC23526 interfaceC235212 = this.f22656;
                    if (interfaceC235212 != null) {
                        byte[] bArr14 = c16261.f50016;
                        int i13 = this.f22670;
                        interfaceC235212.mo2203(i13, bArr14, i10, bArr14, i13);
                    }
                }
                InterfaceC1031 interfaceC1032 = this.f22658;
                if (interfaceC1032 != null) {
                    interfaceC1032.mo3560(this.f22716);
                    this.f22658.mo3561(c16261.f50017, c16261.f50016);
                    this.f22658.mo3563(0, this.f22678);
                    C19708 c19709 = this.f22702;
                    byte[] bArr15 = this.f22698;
                    c19709.m45400(0, bArr15.length, bArr15);
                    if (!C19356.m44597(this.f22678, this.f22698)) {
                        int i14 = this.f22670;
                        if (i10 + i14 > 262144) {
                            throw new IOException("MAC Error");
                        }
                        m19842(c16261, this.f22656, this.f22658, c16261.f50017, (262144 - i10) - i14);
                        throw null;
                    }
                }
                c16261 = c16261;
            }
            int i15 = this.f22716 + 1;
            this.f22716 = i15;
            if (i15 == 0 && ((this.f22689 || this.f22710) && this.f22686)) {
                throw new C14061("incoming sequence number wrapped during initial KEX");
            }
            InterfaceC20705 interfaceC20705 = this.f22660;
            if (interfaceC20705 != null) {
                byte[] bArr16 = c16261.f50016;
                byte b = bArr16[4];
                int[] iArr = this.f22688;
                c = 5;
                iArr[0] = (c16261.f50017 - 5) - b;
                byte[] bArrMo24024 = interfaceC20705.mo24024(bArr16, iArr);
                if (bArrMo24024 != null) {
                    c16261.f50016 = bArrMo24024;
                    c16261.f50017 = this.f22688[0] + 5;
                } else {
                    this.f22696.m46777().getClass();
                }
                c16261.f50018 = 0;
                return;
            }
            c = 5;
            int i16 = c16261.f50016[c] & 255;
            if (i16 == 1) {
                c16261.f50018 = 0;
                c16261.m38250();
                c16261.m38241();
                int iM38250 = c16261.m38250();
                byte[] bArrM38257 = c16261.m38257();
                byte[] bArrM38258 = c16261.m38257();
                int length = bArrM38257.length;
                Charset charset = StandardCharsets.UTF_8;
                throw new C23234("SSH_MSG_DISCONNECT: " + iM38250 + " " + new String(bArrM38257, 0, length, charset) + " " + new String(bArrM38258, 0, bArrM38258.length, charset));
            }
            if (!this.f22686 || !this.f22667) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        c16261.f50018 = 0;
                        c16261.m38250();
                        c16261.m38241();
                        c16261.m38250();
                        this.f22696.m46777().getClass();
                    } else if (i16 == 4) {
                        c16261.f50018 = 0;
                        c16261.m38250();
                        c16261.m38241();
                    } else if (i16 == 93) {
                        c16261.f50018 = 0;
                        c16261.m38250();
                        c16261.m38241();
                        AbstractC19791 abstractC19791M19840 = m19840(c16261.m38250());
                        if (abstractC19791M19840 != null) {
                            abstractC19791M19840.m45486(c16261.m38243());
                        }
                    } else if (i16 == 7) {
                        c16261.f50018 = 0;
                        c16261.m38250();
                        c16261.m38241();
                        if (!this.f22691 || this.f22706 || this.f22693) {
                            this.f22696.m46777().getClass();
                            z = true;
                        } else {
                            this.f22696.m46777().getClass();
                            z = false;
                        }
                        long jM38243 = c16261.m38243();
                        for (long j = 0; j < jM38243; j++) {
                            byte[] bArrM38259 = c16261.m38257();
                            byte[] bArrM382510 = c16261.m38257();
                            if (!z) {
                                int length2 = bArrM38259.length;
                                Charset charset2 = StandardCharsets.UTF_8;
                                if (new String(bArrM38259, 0, length2, charset2).equals("server-sig-algs")) {
                                    String str = new String(bArrM382510, 0, bArrM382510.length, charset2);
                                    this.f22696.m46777().getClass();
                                    if (this.f22690) {
                                        str = !str.isEmpty() ? str.concat(",rsa-sha2-256,rsa-sha2-512") : "rsa-sha2-256,rsa-sha2-512";
                                        this.f22696.m46777().getClass();
                                    }
                                    this.f22668 = C19356.m44594(str);
                                }
                            }
                        }
                    } else if (i16 == 52) {
                        this.f22706 = true;
                        if (this.f22660 == null && this.f22715 == null) {
                            m19849(this.f22671[6]);
                            m19854(this.f22671[7]);
                        }
                    }
                }
                c2 = 1;
            }
            c16261.f50018 = 0;
            return;
        }
        m19842(c16261, this.f22656, this.f22658, 0, 262144);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19842(C16261 c16261, InterfaceC23526 interfaceC23526, InterfaceC1031 interfaceC1031, int i, int i2) throws C12651 {
        IOException e;
        if (interfaceC23526.mo2206() && (interfaceC1031 == null || !interfaceC1031.mo3562())) {
            if (interfaceC1031 != null) {
                interfaceC1031.mo3560(this.f22716);
                interfaceC1031.mo3561(i, c16261.f50016);
            }
            while (i2 > 0) {
                try {
                    c16261.m38242();
                    byte[] bArr = c16261.f50016;
                    int length = i2 > bArr.length ? bArr.length : i2;
                    this.f22702.m45400(0, length, bArr);
                    if (interfaceC1031 != null) {
                        interfaceC1031.mo3561(length, c16261.f50016);
                    }
                    i2 -= length;
                } catch (IOException e2) {
                    e = e2;
                    this.f22696.m46777().getClass();
                }
            }
            e = null;
            if (interfaceC1031 != null) {
                interfaceC1031.mo3563(0, c16261.f50016);
            }
            C12651 c12651 = new C12651("Packet corrupt");
            if (e != null) {
                c12651.addSuppressed(e);
                throw c12651;
            }
            throw c12651;
        }
        throw new C12651("Packet corrupt");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final byte[] m19873() {
        return this.f22664;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m19843(AbstractC16553 abstractC16553) {
        try {
            m19848(abstractC16553);
            C19356.m44596(abstractC16553.f50856);
            abstractC16553.f50856 = null;
            this.f22693 = false;
            if (this.f22667) {
                this.f22716 = 0;
                this.f22696.m46777().getClass();
            }
        } catch (Throwable th) {
            C19356.m44596(abstractC16553.f50856);
            abstractC16553.f50856 = null;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m19848(AbstractC16553 abstractC16553) throws C12651 {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3 = abstractC16553.f50856;
        byte[] bArr4 = abstractC16553.f50855;
        InterfaceC2774 interfaceC2774 = abstractC16553.f50857;
        if (this.f22664 == null) {
            byte[] bArr5 = new byte[bArr4.length];
            this.f22664 = bArr5;
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
        }
        this.f22661.m38242();
        this.f22661.m38247(bArr3);
        this.f22661.m38247(bArr4);
        this.f22661.m38234((byte) 65);
        this.f22661.m38247(this.f22664);
        C16261 c16261 = this.f22661;
        interfaceC2774.mo1151(c16261.f50017, c16261.f50016);
        this.f22701 = interfaceC2774.mo1152();
        C16261 c16262 = this.f22661;
        int i = c16262.f50017;
        int length = (i - this.f22664.length) - 1;
        byte[] bArr6 = c16262.f50016;
        bArr6[length] = (byte) (bArr6[length] + 1);
        interfaceC2774.mo1151(i, bArr6);
        this.f22705 = interfaceC2774.mo1152();
        C16261 c16263 = this.f22661;
        byte[] bArr7 = c16263.f50016;
        bArr7[length] = (byte) (bArr7[length] + 1);
        interfaceC2774.mo1151(c16263.f50017, bArr7);
        this.f22659 = interfaceC2774.mo1152();
        C16261 c16264 = this.f22661;
        byte[] bArr8 = c16264.f50016;
        bArr8[length] = (byte) (bArr8[length] + 1);
        interfaceC2774.mo1151(c16264.f50017, bArr8);
        this.f22685 = interfaceC2774.mo1152();
        C16261 c16265 = this.f22661;
        byte[] bArr9 = c16265.f50016;
        bArr9[length] = (byte) (bArr9[length] + 1);
        interfaceC2774.mo1151(c16265.f50017, bArr9);
        this.f22721 = interfaceC2774.mo1152();
        C16261 c16266 = this.f22661;
        byte[] bArr10 = c16266.f50016;
        bArr10[length] = (byte) (bArr10[length] + 1);
        interfaceC2774.mo1151(c16266.f50017, bArr10);
        this.f22673 = interfaceC2774.mo1152();
        try {
            this.f22656 = (InterfaceC23526) Class.forName(m19856(this.f22671[3])).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize = this.f22656.getBlockSize();
                bArr = this.f22685;
                if (blockSize <= bArr.length) {
                    break;
                }
                this.f22661.m38242();
                C16261 c16267 = this.f22661;
                c16267.getClass();
                c16267.m38246(0, bArr3.length, bArr3);
                C16261 c16268 = this.f22661;
                c16268.getClass();
                c16268.m38246(0, bArr4.length, bArr4);
                this.f22661.m38247(this.f22685);
                C16261 c16269 = this.f22661;
                interfaceC2774.mo1151(c16269.f50017, c16269.f50016);
                byte[] bArrMo1152 = interfaceC2774.mo1152();
                byte[] bArr11 = this.f22685;
                byte[] bArr12 = new byte[bArr11.length + bArrMo1152.length];
                System.arraycopy(bArr11, 0, bArr12, 0, bArr11.length);
                System.arraycopy(bArrMo1152, 0, bArr12, this.f22685.length, bArrMo1152.length);
                this.f22685 = bArr12;
            }
            this.f22656.mo2204(1, bArr, this.f22705);
            this.f22670 = this.f22656.mo2211();
            if (!this.f22656.mo2210()) {
                InterfaceC1031 interfaceC1031 = (InterfaceC1031) Class.forName(m19856(this.f22671[5])).asSubclass(InterfaceC1031.class).getDeclaredConstructor(null).newInstance(null);
                this.f22658 = interfaceC1031;
                byte[] bArrM19844 = m19844(this.f22661, bArr3, bArr4, this.f22673, interfaceC2774, interfaceC1031.getBlockSize());
                this.f22673 = bArrM19844;
                this.f22658.init(bArrM19844);
                this.f22678 = new byte[this.f22658.getBlockSize()];
                this.f22698 = new byte[this.f22658.getBlockSize()];
            }
            this.f22665 = (InterfaceC23526) Class.forName(m19856(this.f22671[2])).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            while (true) {
                int blockSize2 = this.f22665.getBlockSize();
                bArr2 = this.f22659;
                if (blockSize2 <= bArr2.length) {
                    break;
                }
                this.f22661.m38242();
                C16261 c162610 = this.f22661;
                c162610.getClass();
                c162610.m38246(0, bArr3.length, bArr3);
                C16261 c162611 = this.f22661;
                c162611.getClass();
                c162611.m38246(0, bArr4.length, bArr4);
                this.f22661.m38247(this.f22659);
                C16261 c162612 = this.f22661;
                interfaceC2774.mo1151(c162612.f50017, c162612.f50016);
                byte[] bArrMo1153 = interfaceC2774.mo1152();
                byte[] bArr13 = this.f22659;
                byte[] bArr14 = new byte[bArr13.length + bArrMo1153.length];
                System.arraycopy(bArr13, 0, bArr14, 0, bArr13.length);
                System.arraycopy(bArrMo1153, 0, bArr14, this.f22659.length, bArrMo1153.length);
                this.f22659 = bArr14;
            }
            this.f22665.mo2204(0, bArr2, this.f22701);
            this.f22707 = this.f22665.mo2211();
            if (!this.f22665.mo2210()) {
                InterfaceC1031 interfaceC1032 = (InterfaceC1031) Class.forName(m19856(this.f22671[4])).asSubclass(InterfaceC1031.class).getDeclaredConstructor(null).newInstance(null);
                this.f22709 = interfaceC1032;
                byte[] bArrM19845 = m19844(this.f22661, bArr3, bArr4, this.f22721, interfaceC2774, interfaceC1032.getBlockSize());
                this.f22721 = bArrM19845;
                this.f22709.init(bArrM19845);
            }
            m19849(this.f22671[6]);
            m19854(this.f22671[7]);
        } catch (Exception | LinkageError e) {
            if (!(e instanceof C12651)) {
                throw new C12651(e.toString(), e);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m19844(C16261 c16261, byte[] bArr, byte[] bArr2, byte[] bArr3, InterfaceC2774 interfaceC2774, int i) {
        int blockSize = interfaceC2774.getBlockSize();
        while (bArr3.length < i) {
            c16261.m38242();
            c16261.m38247(bArr);
            c16261.m38247(bArr2);
            c16261.m38246(0, bArr3.length, bArr3);
            interfaceC2774.mo1151(c16261.f50017, c16261.f50016);
            byte[] bArr4 = new byte[bArr3.length + blockSize];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            System.arraycopy(interfaceC2774.mo1152(), 0, bArr4, bArr3.length, blockSize);
            C19356.m44596(bArr3);
            bArr3 = bArr4;
        }
        return bArr3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r20.f63909 != false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0071, code lost:
    
        if (r20.m45489() == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r20.f63922 <= 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007c, code lost:
    
        r7 = r20.f63922;
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
    
        if (r18.f22665 == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        r10 = r18.f22707;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x008f, code lost:
    
        r10 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
    
        r11 = r18.f22709;
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
    
        r12 = r19.f24903;
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
    
        r10 = l.C19373.m44633(r13, r15, r11, 32);
        r11 = r12.f50016;
        r15 = r11.length;
        r14 = ((r12.f50017 + r10) - 14) - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b6, code lost:
    
        if (r15 >= r14) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b8, code lost:
    
        r14 = new byte[r14];
        java.lang.System.arraycopy(r11, 0, r14, 0, r11.length);
        r12.f50016 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c0, code lost:
    
        r11 = r12.f50016;
        java.lang.System.arraycopy(r11, r13, r11, r10, (r12.f50017 - 14) - r9);
        r12.f50017 = 10;
        r12.m38245(r9);
        r12.f50017 = r13;
        r14 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d5, code lost:
    
        r14 = 5;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d7, code lost:
    
        r9 = r19.f24903.f50016[r14];
        r11 = r20.f63918;
        r6 = r6 - ((int) r7);
        r20.f63922 -= r7;
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
    
        m19851(r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f3, code lost:
    
        if (r6 != 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f5, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f6, code lost:
    
        r7 = r19.f24903;
        r8 = r7.f50016;
        java.lang.System.arraycopy(r8, r10, r8, 14, r6);
        r7.f50016[r14] = r9;
        r7.f50017 = 6;
        r7.m38245(r11);
        r7.m38245(r6);
        r7.f50017 = r6 + 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0112, code lost:
    
        monitor-enter(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0115, code lost:
    
        if (r18.f22693 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
    
        monitor-exit(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x011a, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x011f, code lost:
    
        if (r20.f63922 < r9) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0121, code lost:
    
        r20.f63922 -= r9;
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m19862(C8087 c8087, AbstractC19791 abstractC19791, int i) throws IOException {
        long j = 0;
        int i2 = i;
        while (true) {
            if (!this.f22693) {
                synchronized (abstractC19791) {
                    long j2 = i2;
                    if (abstractC19791.f63922 < j2) {
                        try {
                            abstractC19791.f63915++;
                            abstractC19791.wait(100L);
                        } catch (InterruptedException unused) {
                        } catch (Throwable th) {
                            abstractC19791.f63915--;
                            throw th;
                        }
                        abstractC19791.f63915--;
                    }
                    if (!this.f22693) {
                        if (abstractC19791.f63922 >= j2) {
                            abstractC19791.f63922 -= j2;
                        }
                        m19851(c8087);
                        return;
                    }
                }
            } else {
                if (j > 0 && System.currentTimeMillis() - this.f22674 > j) {
                    throw new C12651("timeout in waiting for rekeying process.");
                }
                try {
                    Thread.sleep(10L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19872(C8087 c8087) throws C12651 {
        long j = 0;
        while (this.f22693) {
            if (j <= 0 || System.currentTimeMillis() - this.f22674 <= j || this.f22675) {
                byte b = c8087.f24903.f50016[5];
                if (b == 20 || b == 21 || b == 30 || b == 31 || b == 31 || b == 32 || b == 33 || b == 34 || b == 1) {
                    break;
                } else {
                    try {
                        Thread.sleep(10L);
                    } catch (InterruptedException unused) {
                    }
                }
            } else {
                throw new C12651("timeout in waiting for rekeying process.");
            }
        }
        m19851(c8087);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m19851(C8087 c8087) {
        boolean z = this.f22686;
        boolean z2 = this.f22667;
        boolean z3 = this.f22689;
        boolean z4 = this.f22710;
        boolean z5 = c8087.f24903.f50016[5] == 21 && z2;
        synchronized (this.f22714) {
            m19861(c8087);
            C19708 c19708 = this.f22702;
            if (c19708 != null) {
                OutputStream outputStream = c19708.f63667;
                C16261 c16261 = c8087.f24903;
                outputStream.write(c16261.f50016, 0, c16261.f50017);
                c19708.f63667.flush();
                int i = this.f22718 + 1;
                this.f22718 = i;
                if (i == 0 && ((z3 || z4) && z)) {
                    throw new C14061("outgoing sequence number wrapped during initial KEX");
                }
                if (z5) {
                    this.f22718 = 0;
                }
            }
        }
        if (!z5 || this.f22702 == null) {
            return;
        }
        this.f22696.m46777().getClass();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m19867() {
        AbstractC19791 abstractC19791M19840;
        int i;
        byte b;
        this.f22684 = new RunnableC11615(this);
        C16261 c16261 = new C16261();
        C8087 c8087 = new C8087(c16261);
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        while (true) {
            AbstractC16553 abstractC16553M19847 = null;
            while (true) {
                int i2 = 0;
                while (true) {
                    try {
                        if (this.f22704 && this.f22684 != null) {
                            try {
                                m19863(c16261);
                                int i3 = c16261.f50016[5] & 255;
                                if (abstractC16553M19847 != null && abstractC16553M19847.mo18945() == i3) {
                                    this.f22674 = System.currentTimeMillis();
                                    boolean zMo18944 = abstractC16553M19847.mo18944(c16261);
                                    if (!zMo18944) {
                                        throw new C12651("verify: " + zMo18944);
                                    }
                                } else if (i3 == 20) {
                                    abstractC16553M19847 = m19847(c16261);
                                } else if (i3 != 21) {
                                    switch (i3) {
                                        case 80:
                                            c16261.m38250();
                                            c16261.m38241();
                                            c16261.m38257();
                                            if (c16261.m38233() != 0) {
                                                c8087.m21457();
                                                c16261.m38234((byte) 82);
                                                m19872(c8087);
                                            }
                                            break;
                                        case 81:
                                        case 82:
                                            Thread threadM33031 = this.f22683.m33031();
                                            if (threadM33031 != null) {
                                                this.f22683.getClass();
                                                if (i3 == 81 && this.f22683.m33029() == 0) {
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    this.f22683.m33030(c16261.m38250());
                                                }
                                                threadM33031.interrupt();
                                            }
                                            break;
                                        default:
                                            switch (i3) {
                                                case 90:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    byte[] bArrM38257 = c16261.m38257();
                                                    String str = new String(bArrM38257, 0, bArrM38257.length, StandardCharsets.UTF_8);
                                                    if ("forwarded-tcpip".equals(str) || (("x11".equals(str) && this.f22676) || ("auth-agent@openssh.com".equals(str) && this.f22679))) {
                                                        final AbstractC19791 abstractC19791M19869 = m19869(str);
                                                        if (abstractC19791M19869 == null) {
                                                            this.f22696.m46777().getClass();
                                                            c8087.m21457();
                                                            c16261.m38234((byte) 92);
                                                            c16261.m38245(c16261.m38250());
                                                            c16261.m38245(4);
                                                            byte[] bArr = C19356.f62660;
                                                            c16261.m38256(bArr);
                                                            c16261.m38252(0, bArr.length, bArr);
                                                            m19872(c8087);
                                                        } else {
                                                            abstractC19791M19869.mo10853(c16261);
                                                            ThreadFactoryC5970 threadFactoryC5970 = this.f22672;
                                                            Runnable runnable = new Runnable() { // from class: l.᩺ۢۘ
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    abstractC19791M19869.mo2847();
                                                                }
                                                            };
                                                            threadFactoryC5970.getClass();
                                                            Thread thread = new Thread(runnable);
                                                            thread.setName("Channel " + str + " " + this.f22687);
                                                            thread.start();
                                                        }
                                                    } else {
                                                        this.f22696.m46777().getClass();
                                                        c8087.m21457();
                                                        c16261.m38234((byte) 92);
                                                        c16261.m38245(c16261.m38250());
                                                        c16261.m38245(1);
                                                        byte[] bArr2 = C19356.f62660;
                                                        c16261.m38256(bArr2);
                                                        c16261.m38252(0, bArr2.length, bArr2);
                                                        m19872(c8087);
                                                    }
                                                    break;
                                                case 91:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19841 = m19840(c16261.m38250());
                                                    int iM38250 = c16261.m38250();
                                                    long jM38243 = c16261.m38243();
                                                    int iM38251 = c16261.m38250();
                                                    if (abstractC19791M19841 != null) {
                                                        abstractC19791M19841.m45492(jM38243);
                                                        abstractC19791M19841.f63911 = iM38251;
                                                        abstractC19791M19841.f63914 = true;
                                                        abstractC19791M19841.m45491(iM38250);
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_HIGH_LIGHT /* 92 */:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19842 = m19840(c16261.m38250());
                                                    if (abstractC19791M19842 != null) {
                                                        c16261.m38250();
                                                        abstractC19791M19842.f63909 = true;
                                                        abstractC19791M19842.m45491(0);
                                                    }
                                                    break;
                                                case 93:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19843 = m19840(c16261.m38250());
                                                    if (abstractC19791M19843 != null) {
                                                        abstractC19791M19843.m45486(c16261.m38243());
                                                    }
                                                    break;
                                                case MaterialColors.TONE_SURFACE_CONTAINER_LIGHT /* 94 */:
                                                    c16261.m38250();
                                                    c16261.m38233();
                                                    c16261.m38233();
                                                    abstractC19791M19840 = m19840(c16261.m38250());
                                                    int iM38252 = c16261.m38250();
                                                    int i4 = c16261.f50018;
                                                    c16261.f50018 = i4 + iM38252;
                                                    iArr[0] = i4;
                                                    iArr2[0] = iM38252;
                                                    byte[] bArr3 = c16261.f50016;
                                                    if (abstractC19791M19840 != null && iM38252 != 0) {
                                                        try {
                                                            try {
                                                                abstractC19791M19840.mo2846(bArr3, iArr[0], iM38252);
                                                                abstractC19791M19840.f63913 -= iArr2[0];
                                                                if (abstractC19791M19840.f63913 >= abstractC19791M19840.f63924 / 2) {
                                                                    continue;
                                                                } else {
                                                                    c8087.m21457();
                                                                    c16261.m38234((byte) 93);
                                                                    c16261.m38245(abstractC19791M19840.f63918);
                                                                    c16261.m38245(abstractC19791M19840.f63924 - abstractC19791M19840.f63913);
                                                                    synchronized (abstractC19791M19840) {
                                                                        if (!abstractC19791M19840.f63909) {
                                                                            m19872(c8087);
                                                                        }
                                                                    }
                                                                    i = abstractC19791M19840.f63924;
                                                                    abstractC19791M19840.f63913 = i;
                                                                }
                                                            } catch (Exception unused) {
                                                                continue;
                                                            }
                                                        } catch (Exception unused2) {
                                                            abstractC19791M19840.m45490();
                                                        }
                                                    }
                                                    break;
                                                case 95:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    abstractC19791M19840 = m19840(c16261.m38250());
                                                    c16261.m38250();
                                                    int iM38253 = c16261.m38250();
                                                    int i5 = c16261.f50018;
                                                    c16261.f50018 = i5 + iM38253;
                                                    iArr[0] = i5;
                                                    iArr2[0] = iM38253;
                                                    if (abstractC19791M19840 != null && iM38253 != 0) {
                                                        try {
                                                            abstractC19791M19840.f63917.getClass();
                                                            throw null;
                                                        } catch (NullPointerException unused3) {
                                                            abstractC19791M19840.f63913 -= iArr2[0];
                                                            if (abstractC19791M19840.f63913 < abstractC19791M19840.f63924 / 2) {
                                                                c8087.m21457();
                                                                c16261.m38234((byte) 93);
                                                                c16261.m38245(abstractC19791M19840.f63918);
                                                                c16261.m38245(abstractC19791M19840.f63924 - abstractC19791M19840.f63913);
                                                                synchronized (abstractC19791M19840) {
                                                                    if (!abstractC19791M19840.f63909) {
                                                                        m19872(c8087);
                                                                    }
                                                                    i = abstractC19791M19840.f63924;
                                                                    abstractC19791M19840.f63913 = i;
                                                                }
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 96:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19844 = m19840(c16261.m38250());
                                                    if (abstractC19791M19844 != null) {
                                                        abstractC19791M19844.mo2848();
                                                    }
                                                    break;
                                                case 97:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19845 = m19840(c16261.m38250());
                                                    if (abstractC19791M19845 != null) {
                                                        abstractC19791M19845.m45490();
                                                    }
                                                    break;
                                                case 98:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    int iM38254 = c16261.m38250();
                                                    byte[] bArrM38258 = c16261.m38257();
                                                    boolean z = c16261.m38233() != 0;
                                                    AbstractC19791 abstractC19791M19846 = m19840(iM38254);
                                                    if (abstractC19791M19846 != null) {
                                                        if (new String(bArrM38258, 0, bArrM38258.length, StandardCharsets.UTF_8).equals("exit-status")) {
                                                            c16261.m38250();
                                                            b = 99;
                                                        } else {
                                                            b = 100;
                                                        }
                                                        if (z) {
                                                            c8087.m21457();
                                                            c16261.m38234(b);
                                                            c16261.m38245(abstractC19791M19846.f63918);
                                                            m19872(c8087);
                                                        }
                                                    }
                                                    break;
                                                case q.f /* 99 */:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19847 = m19840(c16261.m38250());
                                                    if (abstractC19791M19847 != null) {
                                                        abstractC19791M19847.f63910 = 1;
                                                    }
                                                    break;
                                                case 100:
                                                    c16261.m38250();
                                                    c16261.m38241();
                                                    AbstractC19791 abstractC19791M19848 = m19840(c16261.m38250());
                                                    if (abstractC19791M19848 != null) {
                                                        abstractC19791M19848.f63910 = 0;
                                                    }
                                                    break;
                                                default:
                                                    throw new IOException("Unknown SSH message type " + i3);
                                            }
                                            break;
                                    }
                                } else {
                                    C8087 c8088 = this.f22662;
                                    c8088.m21457();
                                    this.f22661.m38234((byte) 21);
                                    m19872(c8088);
                                    this.f22696.m46777().getClass();
                                    m19843(abstractC16553M19847);
                                }
                            } catch (InterruptedIOException e) {
                                if (!this.f22693 && i2 < this.f22712) {
                                    C16261 c16262 = new C16261();
                                    C8087 c8089 = new C8087(c16262);
                                    c8089.m21457();
                                    c16262.m38234(UTF8.S_P4A);
                                    c16262.m38256(f22653);
                                    c16262.m38234((byte) 1);
                                    m19872(c8089);
                                } else if (!this.f22693 || i2 >= this.f22712) {
                                    throw e;
                                }
                                i2++;
                            }
                        }
                    } catch (Exception unused4) {
                        this.f22693 = false;
                        this.f22696.m46777().getClass();
                    }
                }
            }
        }
        try {
            m19870();
        } catch (NullPointerException | Exception unused5) {
        }
        this.f22704 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19865(AbstractC19791 abstractC19791) {
        Lock lockWriteLock = this.f22669.writeLock();
        lockWriteLock.lock();
        try {
            this.f22655.remove(abstractC19791);
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19870() {
        if (this.f22704) {
            this.f22696.m46777().getClass();
            Lock lockWriteLock = this.f22669.writeLock();
            lockWriteLock.lock();
            try {
                this.f22717 = true;
                ArrayList arrayList = new ArrayList(this.f22655);
                lockWriteLock.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    try {
                        ((AbstractC19791) it.next()).m45490();
                    } catch (Exception unused) {
                        this.f22696.m46777().getClass();
                    }
                }
                this.f22704 = false;
                C21493.m48663(this);
                C3562.m10851(this);
                C14353.m34248(this);
                synchronized (this.f22714) {
                    if (this.f22697 != null) {
                        Thread.yield();
                        this.f22697.interrupt();
                        this.f22697 = null;
                    }
                }
                this.f22684 = null;
                try {
                    C19708 c19708 = this.f22702;
                    if (c19708 != null) {
                        InputStream inputStream = c19708.f63666;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        OutputStream outputStream = this.f22702.f63667;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f22702.getClass();
                    }
                    Socket socket = this.f22692;
                    if (socket != null) {
                        socket.close();
                    }
                } catch (Exception unused2) {
                }
                this.f22702 = null;
                this.f22692 = null;
                lockWriteLock.lock();
                try {
                    this.f22717 = false;
                    this.f22655.clear();
                    lockWriteLock.unlock();
                    this.f22716 = 0;
                    this.f22718 = 0;
                    this.f22686 = true;
                    this.f22667 = false;
                    this.f22711 = false;
                    this.f22668 = null;
                    this.f22696.m46776(this);
                } catch (Throwable th) {
                    lockWriteLock.unlock();
                    throw th;
                }
            } catch (Throwable th2) {
                lockWriteLock.unlock();
                throw th2;
            }
        }
        C7381 c7381 = this.f22722;
        if (c7381 != null) {
            c7381.m19870();
            this.f22722 = null;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ThreadFactoryC5970 m19879() {
        return this.f22672;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m19855(String str, int i, int i2, String str2) {
        C21493 c21493M48662 = C21493.m48662(this, str, i, str2, i2);
        RunnableC15141 runnableC15141 = new RunnableC15141(c21493M48662);
        this.f22672.getClass();
        Thread thread = new Thread(runnableC15141);
        thread.setName("PortWatcher Thread for " + str2);
        thread.start();
        return c21493M48662.f69137;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x005b */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m19849(String str) {
        int i;
        InterfaceC20705 interfaceC20705 = this.f22715;
        if (str.equals("none")) {
            this.f22715 = null;
            if (interfaceC20705 != null) {
                interfaceC20705.end();
                return;
            }
            return;
        }
        String strM19856 = m19856(str);
        if (strM19856 != null) {
            if (str.equals("zlib") || (this.f22706 && str.equals("zlib@openssh.com"))) {
                try {
                    this.f22715 = (InterfaceC20705) Class.forName(strM19856).asSubclass(InterfaceC20705.class).getDeclaredConstructor(null).newInstance(null);
                    try {
                        i = Integer.parseInt(m19856("compression_level"));
                    } catch (Exception unused) {
                        i = 6;
                    }
                    this.f22715.mo24023(1, i, this);
                    if (interfaceC20705 != null) {
                        interfaceC20705.end();
                    }
                } catch (Exception e) {
                    throw new C12651(e.toString(), e);
                }
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x004d */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m19854(String str) {
        InterfaceC20705 interfaceC20705 = this.f22660;
        if (str.equals("none")) {
            this.f22660 = null;
            if (interfaceC20705 != null) {
                interfaceC20705.end();
                return;
            }
            return;
        }
        String strM19856 = m19856(str);
        if (strM19856 != null) {
            if (str.equals("zlib") || (this.f22706 && str.equals("zlib@openssh.com"))) {
                try {
                    InterfaceC20705 interfaceC20706 = (InterfaceC20705) Class.forName(strM19856).asSubclass(InterfaceC20705.class).getDeclaredConstructor(null).newInstance(null);
                    this.f22660 = interfaceC20706;
                    interfaceC20706.mo24023(0, 0, this);
                    if (interfaceC20705 != null) {
                        interfaceC20705.end();
                    }
                } catch (Exception e) {
                    throw new C12651(e.toString(), e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private AbstractC19791 m19852(String str) {
        C5679 c5679;
        C13439 c13439 = str.equals(d.aw) ? new C13439() : null;
        if (str.equals("shell")) {
            C16470 c16470 = new C16470();
            c16470.f40156 = true;
            c13439 = c16470;
        }
        C13439 c21907 = c13439;
        if (str.equals("exec")) {
            c21907 = new C21907();
        }
        AbstractC19791 c14353 = c21907;
        if (str.equals("x11")) {
            c14353 = new C14353();
        }
        AbstractC19791 c0739 = c14353;
        if (str.equals("auth-agent@openssh.com")) {
            c0739 = new C0739();
        }
        AbstractC19791 c8501 = c0739;
        if (str.equals("direct-tcpip")) {
            c8501 = new C8501();
        }
        AbstractC19791 c3562 = c8501;
        if (str.equals("forwarded-tcpip")) {
            c3562 = new C3562();
        }
        AbstractC19791 abstractC19791 = c3562;
        if (str.equals("sftp")) {
            C1654 c1654 = new C1654();
            c1654.m5590(m19856("use_sftp_write_flush_workaround").equals("yes"));
            abstractC19791 = c1654;
        }
        AbstractC19791 abstractC19792 = abstractC19791;
        if (str.equals("subsystem")) {
            C17176 c17176 = new C17176();
            c17176.f52641 = true;
            c17176.f52642 = "";
            abstractC19792 = c17176;
        }
        AbstractC19791 abstractC19793 = abstractC19792;
        if (str.equals("direct-streamlocal@openssh.com")) {
            c5679 = new C5679();
        }
        if (abstractC19793 == null) {
            abstractC19793 = c5679;
            return null;
        }
        abstractC19793 = c5679;
        Lock lockWriteLock = this.f22669.writeLock();
        lockWriteLock.lock();
        try {
            if (this.f22717 || !this.f22704) {
                return null;
            }
            abstractC19793.f63923 = this;
            this.f22655.add(abstractC19793);
            return abstractC19793;
        } finally {
            lockWriteLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String[] m19876() {
        return this.f22668;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19864(InterfaceC18650 interfaceC18650) {
        this.f22720 = interfaceC18650;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC18650 m19878() {
        return this.f22720;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19859(String str, String str2) throws Throwable {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2 == null ? null : str2.getBytes();
        C20413 c20413 = this.f22696;
        c20413.m46772(C5596.m15880(c20413.f65869, "builtin", bytes), bytes2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m19875(String str) {
        if (str != null) {
            byte[] bArr = C19356.f62660;
            this.f22666 = C19356.m44592(str, StandardCharsets.UTF_8);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19871(String str, String str2) {
        synchronized (this.f22714) {
            if (this.f22677 == null) {
                this.f22677 = new Hashtable();
            }
            if (str.equals("PubkeyAcceptedKeyTypes")) {
                this.f22677.put("PubkeyAcceptedAlgorithms", str2);
            } else {
                this.f22677.put(str, str2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19856(String str) {
        if (str.equals("PubkeyAcceptedKeyTypes")) {
            str = "PubkeyAcceptedAlgorithms";
        }
        Hashtable hashtable = this.f22677;
        if (hashtable != null) {
            Object obj = hashtable.get(str);
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        String strM46768 = C20413.m46768(str);
        if (strM46768 != null) {
            return strM46768;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m19868() {
        return this.f22704;
    }

    static {
        byte[] bArr = C19356.f62660;
        f22653 = "keepalive@jcraft.com".getBytes(StandardCharsets.UTF_8);
        C19356.m44599("no-more-sessions@openssh.com");
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m19853(String str) {
        try {
            InterfaceC23526 interfaceC23526 = (InterfaceC23526) Class.forName(str).asSubclass(InterfaceC23526.class).getDeclaredConstructor(null).newInstance(null);
            interfaceC23526.mo2204(0, new byte[interfaceC23526.getBlockSize()], new byte[interfaceC23526.mo2211()]);
            return true;
        } catch (Exception | LinkageError unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m19850() {
        if (m19856("ClearAllForwardings").equals("yes")) {
            return;
        }
        this.f22696.getClass();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5265 m19877() {
        return this.f22696.m46777();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19874() {
        InterfaceC23526 interfaceC23526 = this.f22665;
        InterfaceC1031 interfaceC1031 = this.f22709;
        int blockSize = 20;
        if (interfaceC23526 != null && (interfaceC23526.mo2209() || interfaceC23526.mo2210())) {
            if (interfaceC23526.mo2207() > 20) {
                blockSize = interfaceC23526.mo2207();
            }
        } else if (interfaceC1031 != null && interfaceC1031.getBlockSize() > 20) {
            blockSize = interfaceC1031.getBlockSize();
        }
        return blockSize + 64;
    }
}
