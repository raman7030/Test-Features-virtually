package l;

import com.umeng.analytics.pro.cb;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Hashtable;
import java.util.Vector;

/* JADX INFO: renamed from: l.֫ۜۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C1654 extends C13439 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C16261 f5766;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Hashtable f5767;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public boolean f5768;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InputStream f5769;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f5770;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C8087 f5771;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Charset f5772;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f5773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C16261 f5774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f5775;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C8087 f5777;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C7795 f5779;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f5780;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public C19660 f5781;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public int f5778 = 1;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public int f5776 = 3;

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo5591() {
    }

    static {
        String str = File.separator;
        char c = File.separatorChar;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5590(boolean z) {
        this.f5768 = z;
    }

    public C1654() {
        String.valueOf(3);
        this.f5767 = null;
        this.f5769 = null;
        this.f5770 = false;
        this.f5772 = StandardCharsets.UTF_8;
        this.f5780 = true;
        this.f5768 = true;
        this.f5779 = new C7795(this);
        this.f63924 = 2097152;
        this.f63913 = 2097152;
        this.f63925 = 32768;
    }

    @Override // l.AbstractC19791
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo5598() throws C12651 {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.f63917.f63667 = pipedOutputStream;
            C2857 c2857 = new C2857(pipedOutputStream, this.f5779.f24090.length * this.f63911);
            this.f63917.f63666 = c2857;
            this.f5769 = c2857;
            C13025 c13025 = new C13025();
            c13025.m46274(true);
            c13025.mo9572(m45497(), this);
            C16261 c16261 = new C16261(this.f63925);
            this.f5774 = c16261;
            this.f5777 = new C8087(c16261);
            C16261 c16262 = new C16261(this.f63911);
            this.f5766 = c16262;
            this.f5771 = new C8087(c16262);
            this.f5777.m21457();
            m5555((byte) 1, 5);
            this.f5774.m38245(3);
            m45497().m19862(this.f5777, this, 9);
            C16261 c16263 = this.f5774;
            c16263.f50018 = 0;
            m5551(0, 9, c16263.f50016);
            int iM38250 = c16263.m38250() - 5;
            c16263.m38233();
            int iM38251 = c16263.m38250();
            if (iM38250 > 262144) {
                throw new C16532(4, "Received message is too long: " + iM38250);
            }
            this.f5776 = iM38251;
            this.f5767 = new Hashtable();
            if (iM38250 > 0) {
                m5564(this.f5774, iM38250);
                while (iM38250 > 0) {
                    byte[] bArrM38257 = this.f5774.m38257();
                    int length = iM38250 - (bArrM38257.length + 4);
                    byte[] bArrM38258 = this.f5774.m38257();
                    iM38250 = length - (bArrM38258.length + 4);
                    Hashtable hashtable = this.f5767;
                    int length2 = bArrM38257.length;
                    Charset charset = StandardCharsets.UTF_8;
                    hashtable.put(new String(bArrM38257, 0, length2, charset), new String(bArrM38258, 0, bArrM38258.length, charset));
                }
            }
            if (this.f5767.get("posix-rename@openssh.com") != null && ((String) this.f5767.get("posix-rename@openssh.com")).equals("1")) {
                this.f5770 = true;
            }
            if (this.f5767.get("statvfs@openssh.com") != null) {
                ((String) this.f5767.get("statvfs@openssh.com")).equals("2");
            }
            if (this.f5767.get("hardlink@openssh.com") != null) {
                ((String) this.f5767.get("hardlink@openssh.com")).equals("1");
            }
            new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (e instanceof C12651) {
                throw ((C12651) e);
            }
            throw new C12651(e.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5565(C16261 c16261, C6384 c6384) throws IOException {
        c16261.f50018 = 0;
        m5551(0, 9, c16261.f50016);
        c6384.f19747 = c16261.m38250() - 5;
        c6384.f19749 = c16261.m38233() & 255;
        c6384.f19748 = c16261.m38250();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final OutputStream m5592(String str) throws C16532 {
        try {
            ((C2857) this.f5769).m8744();
            String strM5582 = m5582(m5573(str));
            if (m5572(strM5582)) {
                throw new C16532(4, strM5582 + " is a directory");
            }
            m5556(26, C19356.m44592(strM5582, this.f5772));
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 != 101 && iM38233 != 102) {
                throw new C16532(4, "");
            }
            if (iM38233 == 101) {
                m5575(this.f5774, this.f5774.m38250());
                throw null;
            }
            return new C12734(this, this.f5774.m38257(), new long[]{0});
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InputStream m5585(long j, String str) {
        try {
            ((C2857) this.f5769).m8744();
            byte[] bArrM44592 = C19356.m44592(m5582(m5573(str)), this.f5772);
            m5553(bArrM44592);
            m5556(1, bArrM44592);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 != 101 && iM38233 != 102) {
                throw new C16532(4, "");
            }
            if (iM38233 == 101) {
                m5575(this.f5774, this.f5774.m38250());
                throw null;
            }
            byte[] bArrM38257 = this.f5774.m38257();
            C7795 c7795 = this.f5779;
            c7795.f24088 = 0;
            c7795.f24089 = 0;
            return new C10618(this, j, bArrM38257);
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Vector m5586(String str) throws C16532 {
        byte[] bArrM44592;
        byte[] bytes;
        String str2;
        boolean zM44602;
        String str3;
        String str4;
        Vector vector = new Vector();
        try {
            ((C2857) this.f5769).m8744();
            String strM5573 = m5573(str);
            new Vector();
            int iLastIndexOf = strM5573.lastIndexOf(47);
            int i = 1;
            String strSubstring = strM5573.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
            String strSubstring2 = strM5573.substring(iLastIndexOf + 1);
            String strM44600 = C19356.m44600(strSubstring);
            byte[][] bArr = new byte[1][];
            boolean zM5570 = m5570(strSubstring2, bArr);
            ?? r9 = 0;
            if (zM5570) {
                bArrM44592 = bArr[0];
            } else {
                String strM44601 = C19356.m44600(strM5573);
                if (m5553(C19356.m44592(strM44601, this.f5772)).m5764()) {
                    strM44600 = strM44601;
                    bArrM44592 = null;
                } else if (this.f5780) {
                    bArrM44592 = C19356.m44603(bArr[0]);
                } else {
                    bArrM44592 = C19356.m44592(C19356.m44600(strSubstring2), this.f5772);
                }
            }
            m5566(C19356.m44592(strM44600, this.f5772), (byte) 11);
            C6384 c6384 = new C6384();
            m5565(this.f5774, c6384);
            int i2 = c6384.f19747;
            int i3 = c6384.f19749;
            m5564(this.f5774, i2);
            byte b = 4;
            int i4 = 101;
            if (i3 != 101 && i3 != 102) {
                throw new C16532(4, "");
            }
            if (i3 == 101) {
                m5575(this.f5774, this.f5774.m38250());
                throw null;
            }
            byte[] bArrM38257 = this.f5774.m38257();
            while (true) {
                m5566(bArrM38257, (byte) 12);
                m5565(this.f5774, c6384);
                int i5 = c6384.f19747;
                int i6 = c6384.f19749;
                if (i6 != i4 && i6 != 104) {
                    throw new C16532(b, "");
                }
                if (i6 == i4) {
                    m5564(this.f5774, i5);
                    int iM38250 = this.f5774.m38250();
                    if (iM38250 != i) {
                        m5575(this.f5774, iM38250);
                        throw r9;
                    }
                    m5566(bArrM38257, b);
                    m5569((int[]) r9, c6384);
                    return vector;
                }
                C16261 c16261 = this.f5774;
                c16261.f50018 = 0;
                m5551(0, b, c16261.f50016);
                int i7 = i5 - 4;
                int iM38251 = this.f5774.m38250();
                this.f5774.m38242();
                while (iM38251 > 0) {
                    if (i7 > 0) {
                        C16261 c16262 = this.f5774;
                        int i8 = c16262.f50018;
                        if (i8 != 0) {
                            byte[] bArr2 = c16262.f50016;
                            System.arraycopy(bArr2, i8, bArr2, 0, c16262.f50017 - i8);
                            c16262.f50017 -= c16262.f50018;
                            c16262.f50018 = 0;
                        }
                        C16261 c16263 = this.f5774;
                        byte[] bArr3 = c16263.f50016;
                        int length = bArr3.length;
                        int i9 = c16263.f50017;
                        int iM5551 = m5551(i9, length > i9 + i7 ? i7 : bArr3.length - i9, bArr3);
                        this.f5774.f50017 += iM5551;
                        i7 -= iM5551;
                    }
                    byte[] bArrM38258 = this.f5774.m38257();
                    byte[] bArrM38259 = this.f5776 <= 3 ? this.f5774.m38257() : r9;
                    C1716 c1716M5757 = C1716.m5757(this.f5774);
                    if (bArrM44592 == null) {
                        zM44602 = true;
                    } else if (!zM5570) {
                        zM44602 = C19356.m44591(bArrM44592, bArrM38258);
                    } else {
                        if (this.f5780) {
                            bytes = bArrM38258;
                            str2 = null;
                        } else {
                            String str5 = new String(bArrM38258, 0, bArrM38258.length, this.f5772);
                            bytes = str5.getBytes(StandardCharsets.UTF_8);
                            str2 = str5;
                        }
                        zM44602 = C19356.m44602(bArrM44592, bytes);
                        str3 = str2;
                    }
                    if (zM44602) {
                        if (str3 == 0) {
                            str3 = new String(bArrM38258, 0, bArrM38258.length, this.f5772);
                        }
                        if (bArrM38259 != 0) {
                            str4 = new String(bArrM38259, 0, bArrM38259.length, this.f5772);
                        } else {
                            str4 = c1716M5757.toString() + " " + str3;
                        }
                        vector.addElement(new C12029(str3, str4, c1716M5757));
                    }
                    str3 = r9;
                    str3 = r9;
                    iM38251--;
                    i = 1;
                    b = 4;
                    i4 = 101;
                    r9 = 0;
                }
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m5595(String str) throws C16532 {
        try {
            if (this.f5776 < 3) {
                throw new C16532(8, "The remote sshd is too old to support symlink operation.");
            }
            ((C2857) this.f5769).m8744();
            m5566(C19356.m44592(m5582(m5573(str)), this.f5772), (byte) 19);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 != 101 && iM38233 != 104) {
                throw new C16532(4, "");
            }
            byte[] bArrM38257 = null;
            if (iM38233 == 104) {
                int iM38251 = this.f5774.m38250();
                for (int i = 0; i < iM38251; i++) {
                    bArrM38257 = this.f5774.m38257();
                    if (this.f5776 <= 3) {
                        this.f5774.m38257();
                    }
                    C1716.m5757(this.f5774);
                }
                return new String(bArrM38257, 0, bArrM38257.length, this.f5772);
            }
            m5575(this.f5774, this.f5774.m38250());
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5587(String str, String str2) throws C16532 {
        String strM44600;
        if (this.f5776 < 2) {
            throw new C16532(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((C2857) this.f5769).m8744();
            String strM5573 = m5573(str);
            String strM5574 = m5573(str2);
            String strM5582 = m5582(strM5573);
            Vector vectorM5583 = m5583(strM5574);
            int size = vectorM5583.size();
            if (size >= 2) {
                throw new C16532(4, vectorM5583.toString());
            }
            if (size == 1) {
                strM44600 = (String) vectorM5583.elementAt(0);
            } else {
                if (m5570(strM5574, (byte[][]) null)) {
                    throw new C16532(4, strM5574);
                }
                strM44600 = C19356.m44600(strM5574);
            }
            m5568(C19356.m44592(strM5582, this.f5772), C19356.m44592(strM44600, this.f5772));
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 != 101) {
                throw new C16532(4, "");
            }
            int iM38251 = this.f5774.m38250();
            if (iM38251 == 0) {
                return;
            }
            m5575(this.f5774, iM38251);
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m5597(String str) throws C16532 {
        try {
            ((C2857) this.f5769).m8744();
            Vector vectorM5583 = m5583(m5573(str));
            int size = vectorM5583.size();
            for (int i = 0; i < size; i++) {
                m5566(C19356.m44592((String) vectorM5583.elementAt(i), this.f5772), cb.k);
                C16261 c16261 = this.f5774;
                c16261.f50018 = 0;
                m5551(0, 9, c16261.f50016);
                int iM38250 = c16261.m38250() - 5;
                int iM38233 = c16261.m38233() & 255;
                c16261.m38250();
                m5564(this.f5774, iM38250);
                if (iM38233 != 101) {
                    throw new C16532(4, "");
                }
                int iM38251 = this.f5774.m38250();
                if (iM38251 != 0) {
                    m5575(this.f5774, iM38251);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m5572(String str) {
        try {
            m5566(C19356.m44592(str, this.f5772), (byte) 17);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 == 105) {
                return C1716.m5757(this.f5774).m5764();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m5596(String str) throws C16532 {
        try {
            ((C2857) this.f5769).m8744();
            Vector vectorM5583 = m5583(m5573(str));
            int size = vectorM5583.size();
            for (int i = 0; i < size; i++) {
                m5566(C19356.m44592((String) vectorM5583.elementAt(i), this.f5772), (byte) 15);
                C16261 c16261 = this.f5774;
                c16261.f50018 = 0;
                m5551(0, 9, c16261.f50016);
                int iM38250 = c16261.m38250() - 5;
                int iM38233 = c16261.m38233() & 255;
                c16261.m38250();
                m5564(this.f5774, iM38250);
                if (iM38233 != 101) {
                    throw new C16532(4, "");
                }
                int iM38251 = this.f5774.m38250();
                if (iM38251 != 0) {
                    m5575(this.f5774, iM38251);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5588(String str, C1716 c1716) throws C16532 {
        try {
            ((C2857) this.f5769).m8744();
            m5567(C19356.m44592(m5573(str), this.f5772), c1716);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 != 101) {
                throw new C16532(4, "");
            }
            int iM38251 = this.f5774.m38250();
            if (iM38251 == 0) {
                return;
            }
            m5575(this.f5774, iM38251);
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1716 m5594(String str) {
        try {
            ((C2857) this.f5769).m8744();
            return m5553(C19356.m44592(m5582(m5573(str)), this.f5772));
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private byte[] m5571() throws IOException {
        Charset charset = this.f5772;
        byte[] bArr = C19356.f62660;
        m5566("".getBytes(charset), (byte) 16);
        C16261 c16261 = this.f5774;
        c16261.f50018 = 0;
        m5551(0, 9, c16261.f50016);
        int iM38250 = c16261.m38250() - 5;
        int iM38233 = c16261.m38233() & 255;
        c16261.m38250();
        m5564(this.f5774, iM38250);
        if (iM38233 != 101 && iM38233 != 104) {
            throw new C16532(4, "");
        }
        byte[] bArrM38257 = null;
        if (iM38233 == 101) {
            m5575(this.f5774, this.f5774.m38250());
            throw null;
        }
        int iM38251 = this.f5774.m38250();
        while (true) {
            int i = iM38251 - 1;
            if (iM38251 <= 0) {
                return bArrM38257;
            }
            bArrM38257 = this.f5774.m38257();
            if (this.f5776 <= 3) {
                this.f5774.m38257();
            }
            C1716.m5757(this.f5774);
            iM38251 = i;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5593(String str, C1716 c1716) throws C16532 {
        try {
            ((C2857) this.f5769).m8744();
            Vector vectorM5583 = m5583(m5573(str));
            int size = vectorM5583.size();
            for (int i = 0; i < size; i++) {
                m5579((String) vectorM5583.elementAt(i), c1716);
            }
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m5579(String str, C1716 c1716) throws C16532 {
        try {
            m5576(C19356.m44592(str, this.f5772), c1716);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 != 101) {
                throw new C16532(4, "");
            }
            int iM38251 = this.f5774.m38250();
            if (iM38251 == 0) {
                return;
            }
            m5575(this.f5774, iM38251);
            throw null;
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String m5584() throws C16532 {
        if (this.f5775 == null) {
            try {
                ((C2857) this.f5769).m8744();
                byte[] bArrM5571 = m5571();
                this.f5775 = new String(bArrM5571, 0, bArrM5571.length, this.f5772);
            } catch (Exception e) {
                if (e instanceof C16532) {
                    throw ((C16532) e);
                }
                throw new C16532(e.toString(), e);
            }
        }
        return this.f5775;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5569(int[] iArr, C6384 c6384) throws IOException {
        m5565(this.f5774, c6384);
        int i = c6384.f19747;
        int i2 = c6384.f19749;
        if (iArr != null) {
            iArr[0] = c6384.f19748;
        }
        m5564(this.f5774, i);
        if (i2 != 101) {
            throw new C16532(4, "");
        }
        int iM38250 = this.f5774.m38250();
        if (iM38250 == 0) {
            return;
        }
        m5575(this.f5774, iM38250);
        throw null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C1716 m5553(byte[] bArr) throws C16532 {
        try {
            m5566(bArr, (byte) 17);
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, 9, c16261.f50016);
            int iM38250 = c16261.m38250() - 5;
            int iM38233 = c16261.m38233() & 255;
            c16261.m38250();
            m5564(this.f5774, iM38250);
            if (iM38233 == 105) {
                return C1716.m5757(this.f5774);
            }
            if (iM38233 == 101) {
                m5575(this.f5774, this.f5774.m38250());
                throw null;
            }
            throw new C16532(4, "");
        } catch (Exception e) {
            if (e instanceof C16532) {
                throw ((C16532) e);
            }
            throw new C16532(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5576(byte[] bArr, C1716 c1716) throws IOException {
        this.f5777.m21457();
        m5555((byte) 9, bArr.length + 9 + c1716.m5766());
        C16261 c16261 = this.f5774;
        int i = this.f5778;
        this.f5778 = i + 1;
        c16261.m38245(i);
        C16261 c16262 = this.f5774;
        c16262.getClass();
        c16262.m38252(0, bArr.length, bArr);
        c1716.m5762(this.f5774);
        m45497().m19862(this.f5777, this, bArr.length + 9 + c1716.m5766() + 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5567(byte[] bArr, C1716 c1716) throws IOException {
        this.f5777.m21457();
        m5555(cb.f77931l, bArr.length + 9 + c1716.m5766());
        C16261 c16261 = this.f5774;
        int i = this.f5778;
        this.f5778 = i + 1;
        c16261.m38245(i);
        C16261 c16262 = this.f5774;
        c16262.getClass();
        c16262.m38252(0, bArr.length, bArr);
        c1716.m5762(this.f5774);
        m45497().m19862(this.f5777, this, bArr.length + 9 + c1716.m5766() + 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5568(byte[] bArr, byte[] bArr2) throws IOException {
        String str = this.f5770 ? "posix-rename@openssh.com" : null;
        this.f5777.m21457();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            m5555((byte) 18, length);
            C16261 c16261 = this.f5774;
            int i = this.f5778;
            this.f5778 = i + 1;
            c16261.m38245(i);
        } else {
            length += str.length() + 4;
            m5555((byte) -56, length);
            C16261 c16262 = this.f5774;
            int i2 = this.f5778;
            this.f5778 = i2 + 1;
            c16262.m38245(i2);
            C16261 c16263 = this.f5774;
            byte[] bArr3 = C19356.f62660;
            c16263.m38256(str.getBytes(StandardCharsets.UTF_8));
        }
        C16261 c16264 = this.f5774;
        c16264.getClass();
        c16264.m38252(0, bArr.length, bArr);
        C16261 c16265 = this.f5774;
        c16265.getClass();
        c16265.m38252(0, bArr2.length, bArr2);
        m45497().m19862(this.f5777, this, length + 4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5562(C1654 c1654, byte[] bArr, C6384 c6384) throws IOException {
        c1654.m5566(bArr, (byte) 4);
        c1654.m5569((int[]) null, c6384);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5556(int i, byte[] bArr) throws IOException {
        this.f5777.m21457();
        m5555((byte) 3, bArr.length + 17);
        C16261 c16261 = this.f5774;
        int i2 = this.f5778;
        this.f5778 = i2 + 1;
        c16261.m38245(i2);
        C16261 c16262 = this.f5774;
        c16262.getClass();
        c16262.m38252(0, bArr.length, bArr);
        this.f5774.m38245(i);
        this.f5774.m38245(0);
        m45497().m19862(this.f5777, this, bArr.length + 21);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5566(byte[] bArr, byte b) throws IOException {
        this.f5777.m21457();
        int length = bArr.length;
        m5555(b, length + 9);
        C16261 c16261 = this.f5774;
        int i = this.f5778;
        this.f5778 = i + 1;
        c16261.m38245(i);
        C16261 c16262 = this.f5774;
        c16262.getClass();
        c16262.m38252(0, bArr.length, bArr);
        m45497().m19862(this.f5777, this, length + 13);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m5552(C1654 c1654, byte[] bArr, long j, byte[] bArr2, int i, int i2) throws IOException {
        c1654.f5771.m21457();
        C7381 c7381M45497 = c1654.m45497();
        int iM19874 = c7381M45497.m19874();
        C16261 c16261 = c1654.f5766;
        byte[] bArr3 = c16261.f50016;
        int length = bArr3.length;
        int i3 = c16261.f50017 + 34;
        if (length < C19373.m44633(i3, bArr.length, i2, iM19874)) {
            i2 = bArr3.length - ((i3 + bArr.length) + iM19874);
        }
        int length2 = bArr.length + 21 + i2;
        c16261.m38234((byte) 94);
        c16261.m38245(c1654.f63918);
        c16261.m38245(length2 + 4);
        c16261.m38245(length2);
        c16261.m38234((byte) 6);
        C16261 c16262 = c1654.f5766;
        int i4 = c1654.f5778;
        c1654.f5778 = i4 + 1;
        c16262.m38245(i4);
        C16261 c16263 = c1654.f5766;
        c16263.getClass();
        c16263.m38252(0, bArr.length, bArr);
        c1654.f5766.m38237(j);
        C16261 c16264 = c1654.f5766;
        if (c16264.f50016 != bArr2) {
            c16264.m38252(i, i2, bArr2);
        } else {
            c16264.m38245(i2);
            c1654.f5766.m38251(i2);
        }
        c7381M45497.m19862(c1654.f5771, c1654, C19373.m44633(bArr.length, 21, i2, 4));
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5561(C1654 c1654, byte[] bArr, long j, int i, C7795 c7795) throws IOException {
        c1654.f5777.m21457();
        c1654.m5555((byte) 5, bArr.length + 21);
        C16261 c16261 = c1654.f5774;
        int i2 = c1654.f5778;
        c1654.f5778 = i2 + 1;
        c16261.m38245(i2);
        C16261 c16262 = c1654.f5774;
        c16262.getClass();
        c16262.m38252(0, bArr.length, bArr);
        c1654.f5774.m38237(j);
        c1654.f5774.m38245(i);
        c1654.m45497().m19862(c1654.f5777, c1654, bArr.length + 25);
        if (c7795 != null) {
            int i3 = c1654.f5778 - 1;
            int i4 = c7795.f24088;
            if (i4 == 0) {
                c7795.f24089 = 0;
            }
            int length = c7795.f24089 + i4;
            C14144[] c14144Arr = c7795.f24090;
            if (length >= c14144Arr.length) {
                length -= c14144Arr.length;
            }
            C14144 c14144 = c14144Arr[length];
            c14144.f42689 = i3;
            c14144.f42691 = j;
            c14144.f42690 = i;
            c7795.f24088 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5555(byte b, int i) {
        C16261 c16261 = this.f5774;
        c16261.m38234((byte) 94);
        c16261.m38245(this.f63918);
        c16261.m38245(i + 4);
        c16261.m38245(i);
        c16261.m38234(b);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private Vector m5583(String str) throws IOException {
        byte[] bytes;
        String str2;
        Vector vector = new Vector();
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            vector.addElement(C19356.m44600(str));
            return vector;
        }
        String strSubstring = str.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        String strM44600 = C19356.m44600(strSubstring);
        byte[][] bArr = new byte[1][];
        if (!m5570(strSubstring2, bArr)) {
            if (!strM44600.equals("/")) {
                strM44600 = strM44600.concat("/");
            }
            StringBuilder sbM15339 = C5368.m15339(strM44600);
            sbM15339.append(C19356.m44600(strSubstring2));
            vector.addElement(sbM15339.toString());
            return vector;
        }
        byte[] bArr2 = bArr[0];
        m5566(C19356.m44592(strM44600, this.f5772), (byte) 11);
        C6384 c6384 = new C6384();
        m5565(this.f5774, c6384);
        int i = c6384.f19747;
        int i2 = c6384.f19749;
        m5564(this.f5774, i);
        byte b = 4;
        int i3 = 101;
        if (i2 != 101 && i2 != 102) {
            throw new C16532(4, "");
        }
        int[] iArr = null;
        if (i2 == 101) {
            m5575(this.f5774, this.f5774.m38250());
            throw null;
        }
        byte[] bArrM38257 = this.f5774.m38257();
        String strConcat = null;
        while (true) {
            m5566(bArrM38257, (byte) 12);
            m5565(this.f5774, c6384);
            int i4 = c6384.f19747;
            int i5 = c6384.f19749;
            if (i5 != i3 && i5 != 104) {
                throw new C16532(b, "");
            }
            if (i5 == i3) {
                m5564(this.f5774, i4);
                m5566(bArrM38257, b);
                m5569(iArr, c6384);
                return vector;
            }
            C16261 c16261 = this.f5774;
            c16261.f50018 = 0;
            m5551(0, b, c16261.f50016);
            int i6 = i4 - 4;
            this.f5774.m38242();
            for (int iM38250 = this.f5774.m38250(); iM38250 > 0; iM38250--) {
                if (i6 > 0) {
                    C16261 c16262 = this.f5774;
                    int i7 = c16262.f50018;
                    if (i7 != 0) {
                        byte[] bArr3 = c16262.f50016;
                        System.arraycopy(bArr3, i7, bArr3, 0, c16262.f50017 - i7);
                        c16262.f50017 -= c16262.f50018;
                        c16262.f50018 = 0;
                    }
                    C16261 c16263 = this.f5774;
                    byte[] bArr4 = c16263.f50016;
                    int length = bArr4.length;
                    int i8 = c16263.f50017;
                    int i9 = this.f5769.read(bArr4, i8, length > i8 + i6 ? i6 : bArr4.length - i8);
                    if (i9 <= 0) {
                        break;
                    }
                    this.f5774.f50017 += i9;
                    i6 -= i9;
                }
                byte[] bArrM38258 = this.f5774.m38257();
                if (this.f5776 <= 3) {
                    this.f5774.m38257();
                }
                C1716.m5757(this.f5774);
                if (this.f5780) {
                    bytes = bArrM38258;
                    str2 = null;
                } else {
                    str2 = new String(bArrM38258, 0, bArrM38258.length, this.f5772);
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                }
                if (C19356.m44602(bArr2, bytes)) {
                    if (str2 == null) {
                        str2 = new String(bArrM38258, 0, bArrM38258.length, this.f5772);
                    }
                    if (strConcat == null) {
                        strConcat = !strM44600.endsWith("/") ? strM44600.concat("/") : strM44600;
                    }
                    vector.addElement(strConcat + str2);
                }
            }
            b = 4;
            i3 = 101;
            iArr = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m5575(C16261 c16261, int i) throws C16532 {
        if (this.f5776 >= 3 && c16261.m38255() >= 4) {
            byte[] bArrM38257 = c16261.m38257();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArr = C19356.f62660;
            throw new C16532(i, new String(bArrM38257, 0, bArrM38257.length, charset));
        }
        throw new C16532(i, "Failure");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m5570(String str, byte[][] bArr) {
        int i;
        byte[] bArrM44592 = C19356.m44592(str, StandardCharsets.UTF_8);
        if (bArr != null) {
            bArr[0] = bArrM44592;
        }
        int length = bArrM44592.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArrM44592[i2];
            if (b == 42 || b == 63) {
                return true;
            }
            if (b == 92 && (i = i2 + 1) < length) {
                i2 = i;
            }
            i2++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m5564(C16261 c16261, int i) throws IOException {
        c16261.m38242();
        m5551(0, i, c16261.f50016);
        c16261.m38251(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int m5551(int i, int i2, byte[] bArr) throws IOException {
        int i3 = i;
        while (i2 > 0) {
            int i4 = this.f5769.read(bArr, i3, i2);
            if (i4 <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += i4;
            i2 -= i4;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5557(C1654 c1654, long j) throws IOException {
        while (j > 0) {
            long jSkip = c1654.f5769.skip(j);
            if (jSkip <= 0) {
                return;
            } else {
                j -= jSkip;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private String m5573(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        if (this.f5773 == null) {
            this.f5773 = m5584();
        }
        String str2 = this.f5773;
        return str2.endsWith("/") ? str2.concat(str) : C22870.m50967(str2, "/", str);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private String m5582(String str) throws IOException {
        Vector vectorM5583 = m5583(str);
        if (vectorM5583.size() == 1) {
            return (String) vectorM5583.elementAt(0);
        }
        StringBuilder sbM19190 = C7166.m19190(str, " is not unique: ");
        sbM19190.append(vectorM5583.toString());
        throw new C16532(4, sbM19190.toString());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5589(Charset charset) {
        this.f5772 = charset;
        this.f5780 = charset.equals(StandardCharsets.UTF_8);
    }
}
