package p067l;

import com.umeng.analytics.pro.C0698cb;
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
public final class C3940 extends C15141 {

    /* JADX INFO: renamed from: ֫֫ */
    public C17823 f8546;

    /* JADX INFO: renamed from: ۛ */
    public Hashtable f8547;

    /* JADX INFO: renamed from: ۜ֫ */
    public boolean f8548;

    /* JADX INFO: renamed from: ۟ */
    public InputStream f8549;

    /* JADX INFO: renamed from: ۤ */
    public boolean f8550;

    /* JADX INFO: renamed from: ۧ֫ */
    public C10054 f8551;

    /* JADX INFO: renamed from: ۨ */
    public Charset f8552;

    /* JADX INFO: renamed from: ۫ */
    public String f8553;

    /* JADX INFO: renamed from: ۬ */
    public C17823 f8554;

    /* JADX INFO: renamed from: ܰ */
    public String f8555;

    /* JADX INFO: renamed from: ܽ֫ */
    public C10054 f8557;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C9777 f8559;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f8560;

    /* JADX INFO: renamed from: ᩻֫ */
    public C21054 f8561;

    /* JADX INFO: renamed from: ܿ֫ */
    public int f8558 = 1;

    /* JADX INFO: renamed from: ܳ֫ */
    public int f8556 = 3;

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ۜ */
    public final void mo7821() {
    }

    static {
        String str = File.separator;
        char c = File.separatorChar;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7820(boolean z) {
        this.f8548 = z;
    }

    public C3940() {
        String.valueOf(3);
        this.f8547 = null;
        this.f8549 = null;
        this.f8550 = false;
        this.f8552 = StandardCharsets.UTF_8;
        this.f8560 = true;
        this.f8548 = true;
        this.f8559 = new C9777(this);
        this.f66561 = 2097152;
        this.f66550 = 2097152;
        this.f66562 = 32768;
    }

    @Override // p067l.AbstractC21178
    /* JADX INFO: renamed from: ᩴ */
    public final void mo7828() throws C14392 {
        try {
            PipedOutputStream pipedOutputStream = new PipedOutputStream();
            this.f66554.f66298 = pipedOutputStream;
            C5084 c5084 = new C5084(pipedOutputStream, this.f8559.f27007.length * this.f66548);
            this.f66554.f66297 = c5084;
            this.f8549 = c5084;
            C14747 c14747 = new C14747();
            c14747.m48590(true);
            c14747.mo11615(m47808(), this);
            C17823 c17823 = new C17823(this.f66562);
            this.f8554 = c17823;
            this.f8557 = new C10054(c17823);
            C17823 c17824 = new C17823(this.f66548);
            this.f8546 = c17824;
            this.f8551 = new C10054(c17824);
            this.f8557.m23425();
            m7785((byte) 1, 5);
            this.f8554.m40459(3);
            m47808().m21835(this.f8557, this, 9);
            C17823 c17825 = this.f8554;
            c17825.f53187 = 0;
            m7781(0, 9, c17825.f53185);
            int iM40464 = c17825.m40464() - 5;
            c17825.m40447();
            int iM40465 = c17825.m40464();
            if (iM40464 > 262144) {
                throw new C18080(4, "Received message is too long: " + iM40464);
            }
            this.f8556 = iM40465;
            this.f8547 = new Hashtable();
            if (iM40464 > 0) {
                m7794(this.f8554, iM40464);
                while (iM40464 > 0) {
                    byte[] bArrM40471 = this.f8554.m40471();
                    int length = iM40464 - (bArrM40471.length + 4);
                    byte[] bArrM40472 = this.f8554.m40471();
                    iM40464 = length - (bArrM40472.length + 4);
                    Hashtable hashtable = this.f8547;
                    int length2 = bArrM40471.length;
                    Charset charset = StandardCharsets.UTF_8;
                    hashtable.put(new String(bArrM40471, 0, length2, charset), new String(bArrM40472, 0, bArrM40472.length, charset));
                }
            }
            if (this.f8547.get("posix-rename@openssh.com") != null && ((String) this.f8547.get("posix-rename@openssh.com")).equals("1")) {
                this.f8550 = true;
            }
            if (this.f8547.get("statvfs@openssh.com") != null) {
                ((String) this.f8547.get("statvfs@openssh.com")).equals("2");
            }
            if (this.f8547.get("hardlink@openssh.com") != null) {
                ((String) this.f8547.get("hardlink@openssh.com")).equals("1");
            }
            new File(".").getCanonicalPath();
        } catch (Exception e) {
            if (e instanceof C14392) {
                throw ((C14392) e);
            }
            throw new C14392(e.toString(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m7795(C17823 c17823, C8436 c8436) throws IOException {
        c17823.f53187 = 0;
        m7781(0, 9, c17823.f53185);
        c8436.f22620 = c17823.m40464() - 5;
        c8436.f22622 = c17823.m40447() & 255;
        c8436.f22621 = c17823.m40464();
    }

    /* JADX INFO: renamed from: ۧ */
    public final OutputStream m7822(String str) throws C18080 {
        try {
            ((C5084) this.f8549).m10811();
            String strM7812 = m7812(m7803(str));
            if (m7802(strM7812)) {
                throw new C18080(4, strM7812 + " is a directory");
            }
            m7786(26, C20764.m46886(strM7812, this.f8552));
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 != 101 && iM40447 != 102) {
                throw new C18080(4, "");
            }
            if (iM40447 == 101) {
                m7805(this.f8554, this.f8554.m40464());
                throw null;
            }
            return new C14471(this, this.f8554.m40471(), new long[]{0});
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InputStream m7815(long j, String str) {
        try {
            ((C5084) this.f8549).m10811();
            byte[] bArrM46886 = C20764.m46886(m7812(m7803(str)), this.f8552);
            m7783(bArrM46886);
            m7786(1, bArrM46886);
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 != 101 && iM40447 != 102) {
                throw new C18080(4, "");
            }
            if (iM40447 == 101) {
                m7805(this.f8554, this.f8554.m40464());
                throw null;
            }
            byte[] bArrM40471 = this.f8554.m40471();
            C9777 c9777 = this.f8559;
            c9777.f27005 = 0;
            c9777.f27006 = 0;
            return new C12460(this, j, bArrM40471);
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int[], java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX INFO: renamed from: ֫ */
    public final Vector m7816(String str) throws C18080 {
        byte[] bArrM46886;
        byte[] bytes;
        String str2;
        boolean zM46896;
        String str3;
        String str4;
        Vector vector = new Vector();
        try {
            ((C5084) this.f8549).m10811();
            String strM7803 = m7803(str);
            new Vector();
            int iLastIndexOf = strM7803.lastIndexOf(47);
            int i = 1;
            String strSubstring = strM7803.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
            String strSubstring2 = strM7803.substring(iLastIndexOf + 1);
            String strM46894 = C20764.m46894(strSubstring);
            byte[][] bArr = new byte[1][];
            boolean zM7800 = m7800(strSubstring2, bArr);
            ?? r9 = 0;
            if (zM7800) {
                bArrM46886 = bArr[0];
            } else {
                String strM46895 = C20764.m46894(strM7803);
                if (m7783(C20764.m46886(strM46895, this.f8552)).m7974()) {
                    strM46894 = strM46895;
                    bArrM46886 = null;
                } else if (this.f8560) {
                    bArrM46886 = C20764.m46897(bArr[0]);
                } else {
                    bArrM46886 = C20764.m46886(C20764.m46894(strSubstring2), this.f8552);
                }
            }
            m7796(C20764.m46886(strM46894, this.f8552), (byte) 11);
            C8436 c8436 = new C8436();
            m7795(this.f8554, c8436);
            int i2 = c8436.f22620;
            int i3 = c8436.f22622;
            m7794(this.f8554, i2);
            byte b = 4;
            int i4 = 101;
            if (i3 != 101 && i3 != 102) {
                throw new C18080(4, "");
            }
            if (i3 == 101) {
                m7805(this.f8554, this.f8554.m40464());
                throw null;
            }
            byte[] bArrM40471 = this.f8554.m40471();
            while (true) {
                m7796(bArrM40471, (byte) 12);
                m7795(this.f8554, c8436);
                int i5 = c8436.f22620;
                int i6 = c8436.f22622;
                if (i6 != i4 && i6 != 104) {
                    throw new C18080(b, "");
                }
                if (i6 == i4) {
                    m7794(this.f8554, i5);
                    int iM40464 = this.f8554.m40464();
                    if (iM40464 != i) {
                        m7805(this.f8554, iM40464);
                        throw r9;
                    }
                    m7796(bArrM40471, b);
                    m7799((int[]) r9, c8436);
                    return vector;
                }
                C17823 c17823 = this.f8554;
                c17823.f53187 = 0;
                m7781(0, b, c17823.f53185);
                int i7 = i5 - 4;
                int iM40465 = this.f8554.m40464();
                this.f8554.m40456();
                while (iM40465 > 0) {
                    if (i7 > 0) {
                        C17823 c17824 = this.f8554;
                        int i8 = c17824.f53187;
                        if (i8 != 0) {
                            byte[] bArr2 = c17824.f53185;
                            System.arraycopy(bArr2, i8, bArr2, 0, c17824.f53186 - i8);
                            c17824.f53186 -= c17824.f53187;
                            c17824.f53187 = 0;
                        }
                        C17823 c17825 = this.f8554;
                        byte[] bArr3 = c17825.f53185;
                        int length = bArr3.length;
                        int i9 = c17825.f53186;
                        int iM7781 = m7781(i9, length > i9 + i7 ? i7 : bArr3.length - i9, bArr3);
                        this.f8554.f53186 += iM7781;
                        i7 -= iM7781;
                    }
                    byte[] bArrM40472 = this.f8554.m40471();
                    byte[] bArrM40473 = this.f8556 <= 3 ? this.f8554.m40471() : r9;
                    C3999 c3999M7967 = C3999.m7967(this.f8554);
                    if (bArrM46886 == null) {
                        zM46896 = true;
                    } else if (!zM7800) {
                        zM46896 = C20764.m46885(bArrM46886, bArrM40472);
                    } else {
                        if (this.f8560) {
                            bytes = bArrM40472;
                            str2 = null;
                        } else {
                            String str5 = new String(bArrM40472, 0, bArrM40472.length, this.f8552);
                            bytes = str5.getBytes(StandardCharsets.UTF_8);
                            str2 = str5;
                        }
                        zM46896 = C20764.m46896(bArrM46886, bytes);
                        str3 = str2;
                    }
                    if (zM46896) {
                        if (str3 == 0) {
                            str3 = new String(bArrM40472, 0, bArrM40472.length, this.f8552);
                        }
                        if (bArrM40473 != 0) {
                            str4 = new String(bArrM40473, 0, bArrM40473.length, this.f8552);
                        } else {
                            str4 = c3999M7967.toString() + " " + str3;
                        }
                        vector.addElement(new C13801(str3, str4, c3999M7967));
                    }
                    str3 = r9;
                    str3 = r9;
                    iM40465--;
                    i = 1;
                    b = 4;
                    i4 = 101;
                    r9 = 0;
                }
            }
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m7825(String str) throws C18080 {
        try {
            if (this.f8556 < 3) {
                throw new C18080(8, "The remote sshd is too old to support symlink operation.");
            }
            ((C5084) this.f8549).m10811();
            m7796(C20764.m46886(m7812(m7803(str)), this.f8552), (byte) 19);
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 != 101 && iM40447 != 104) {
                throw new C18080(4, "");
            }
            byte[] bArrM40471 = null;
            if (iM40447 == 104) {
                int iM40465 = this.f8554.m40464();
                for (int i = 0; i < iM40465; i++) {
                    bArrM40471 = this.f8554.m40471();
                    if (this.f8556 <= 3) {
                        this.f8554.m40471();
                    }
                    C3999.m7967(this.f8554);
                }
                return new String(bArrM40471, 0, bArrM40471.length, this.f8552);
            }
            m7805(this.f8554, this.f8554.m40464());
            throw null;
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7817(String str, String str2) throws C18080 {
        String strM46894;
        if (this.f8556 < 2) {
            throw new C18080(8, "The remote sshd is too old to support rename operation.");
        }
        try {
            ((C5084) this.f8549).m10811();
            String strM7803 = m7803(str);
            String strM7804 = m7803(str2);
            String strM7812 = m7812(strM7803);
            Vector vectorM7813 = m7813(strM7804);
            int size = vectorM7813.size();
            if (size >= 2) {
                throw new C18080(4, vectorM7813.toString());
            }
            if (size == 1) {
                strM46894 = (String) vectorM7813.elementAt(0);
            } else {
                if (m7800(strM7804, (byte[][]) null)) {
                    throw new C18080(4, strM7804);
                }
                strM46894 = C20764.m46894(strM7804);
            }
            m7798(C20764.m46886(strM7812, this.f8552), C20764.m46886(strM46894, this.f8552));
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 != 101) {
                throw new C18080(4, "");
            }
            int iM40465 = this.f8554.m40464();
            if (iM40465 == 0) {
                return;
            }
            m7805(this.f8554, iM40465);
            throw null;
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m7827(String str) throws C18080 {
        try {
            ((C5084) this.f8549).m10811();
            Vector vectorM7813 = m7813(m7803(str));
            int size = vectorM7813.size();
            for (int i = 0; i < size; i++) {
                m7796(C20764.m46886((String) vectorM7813.elementAt(i), this.f8552), C0698cb.f2569k);
                C17823 c17823 = this.f8554;
                c17823.f53187 = 0;
                m7781(0, 9, c17823.f53185);
                int iM40464 = c17823.m40464() - 5;
                int iM40447 = c17823.m40447() & 255;
                c17823.m40464();
                m7794(this.f8554, iM40464);
                if (iM40447 != 101) {
                    throw new C18080(4, "");
                }
                int iM40465 = this.f8554.m40464();
                if (iM40465 != 0) {
                    m7805(this.f8554, iM40465);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m7802(String str) {
        try {
            m7796(C20764.m46886(str, this.f8552), (byte) 17);
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 == 105) {
                return C3999.m7967(this.f8554).m7974();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m7826(String str) throws C18080 {
        try {
            ((C5084) this.f8549).m10811();
            Vector vectorM7813 = m7813(m7803(str));
            int size = vectorM7813.size();
            for (int i = 0; i < size; i++) {
                m7796(C20764.m46886((String) vectorM7813.elementAt(i), this.f8552), (byte) 15);
                C17823 c17823 = this.f8554;
                c17823.f53187 = 0;
                m7781(0, 9, c17823.f53185);
                int iM40464 = c17823.m40464() - 5;
                int iM40447 = c17823.m40447() & 255;
                c17823.m40464();
                m7794(this.f8554, iM40464);
                if (iM40447 != 101) {
                    throw new C18080(4, "");
                }
                int iM40465 = this.f8554.m40464();
                if (iM40465 != 0) {
                    m7805(this.f8554, iM40465);
                    throw null;
                }
            }
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7818(String str, C3999 c3999) throws C18080 {
        try {
            ((C5084) this.f8549).m10811();
            m7797(C20764.m46886(m7803(str), this.f8552), c3999);
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 != 101) {
                throw new C18080(4, "");
            }
            int iM40465 = this.f8554.m40464();
            if (iM40465 == 0) {
                return;
            }
            m7805(this.f8554, iM40465);
            throw null;
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C3999 m7824(String str) {
        try {
            ((C5084) this.f8549).m10811();
            return m7783(C20764.m46886(m7812(m7803(str)), this.f8552));
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۚ */
    private byte[] m7801() throws IOException {
        Charset charset = this.f8552;
        byte[] bArr = C20764.f65273;
        m7796("".getBytes(charset), (byte) 16);
        C17823 c17823 = this.f8554;
        c17823.f53187 = 0;
        m7781(0, 9, c17823.f53185);
        int iM40464 = c17823.m40464() - 5;
        int iM40447 = c17823.m40447() & 255;
        c17823.m40464();
        m7794(this.f8554, iM40464);
        if (iM40447 != 101 && iM40447 != 104) {
            throw new C18080(4, "");
        }
        byte[] bArrM40471 = null;
        if (iM40447 == 101) {
            m7805(this.f8554, this.f8554.m40464());
            throw null;
        }
        int iM40465 = this.f8554.m40464();
        while (true) {
            int i = iM40465 - 1;
            if (iM40465 <= 0) {
                return bArrM40471;
            }
            bArrM40471 = this.f8554.m40471();
            if (this.f8556 <= 3) {
                this.f8554.m40471();
            }
            C3999.m7967(this.f8554);
            iM40465 = i;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m7823(String str, C3999 c3999) throws C18080 {
        try {
            ((C5084) this.f8549).m10811();
            Vector vectorM7813 = m7813(m7803(str));
            int size = vectorM7813.size();
            for (int i = 0; i < size; i++) {
                m7809((String) vectorM7813.elementAt(i), c3999);
            }
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m7809(String str, C3999 c3999) throws C18080 {
        try {
            m7806(C20764.m46886(str, this.f8552), c3999);
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 != 101) {
                throw new C18080(4, "");
            }
            int iM40465 = this.f8554.m40464();
            if (iM40465 == 0) {
                return;
            }
            m7805(this.f8554, iM40465);
            throw null;
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֡ */
    public final String m7814() throws C18080 {
        if (this.f8555 == null) {
            try {
                ((C5084) this.f8549).m10811();
                byte[] bArrM7801 = m7801();
                this.f8555 = new String(bArrM7801, 0, bArrM7801.length, this.f8552);
            } catch (Exception e) {
                if (e instanceof C18080) {
                    throw ((C18080) e);
                }
                throw new C18080(e.toString(), e);
            }
        }
        return this.f8555;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m7799(int[] iArr, C8436 c8436) throws IOException {
        m7795(this.f8554, c8436);
        int i = c8436.f22620;
        int i2 = c8436.f22622;
        if (iArr != null) {
            iArr[0] = c8436.f22621;
        }
        m7794(this.f8554, i);
        if (i2 != 101) {
            throw new C18080(4, "");
        }
        int iM40464 = this.f8554.m40464();
        if (iM40464 == 0) {
            return;
        }
        m7805(this.f8554, iM40464);
        throw null;
    }

    /* JADX INFO: renamed from: ֫ */
    private C3999 m7783(byte[] bArr) throws C18080 {
        try {
            m7796(bArr, (byte) 17);
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, 9, c17823.f53185);
            int iM40464 = c17823.m40464() - 5;
            int iM40447 = c17823.m40447() & 255;
            c17823.m40464();
            m7794(this.f8554, iM40464);
            if (iM40447 == 105) {
                return C3999.m7967(this.f8554);
            }
            if (iM40447 == 101) {
                m7805(this.f8554, this.f8554.m40464());
                throw null;
            }
            throw new C18080(4, "");
        } catch (Exception e) {
            if (e instanceof C18080) {
                throw ((C18080) e);
            }
            throw new C18080(e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m7806(byte[] bArr, C3999 c3999) throws IOException {
        this.f8557.m23425();
        m7785((byte) 9, bArr.length + 9 + c3999.m7976());
        C17823 c17823 = this.f8554;
        int i = this.f8558;
        this.f8558 = i + 1;
        c17823.m40459(i);
        C17823 c17824 = this.f8554;
        c17824.getClass();
        c17824.m40466(0, bArr.length, bArr);
        c3999.m7972(this.f8554);
        m47808().m21835(this.f8557, this, bArr.length + 9 + c3999.m7976() + 4);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7797(byte[] bArr, C3999 c3999) throws IOException {
        this.f8557.m23425();
        m7785(C0698cb.f2570l, bArr.length + 9 + c3999.m7976());
        C17823 c17823 = this.f8554;
        int i = this.f8558;
        this.f8558 = i + 1;
        c17823.m40459(i);
        C17823 c17824 = this.f8554;
        c17824.getClass();
        c17824.m40466(0, bArr.length, bArr);
        c3999.m7972(this.f8554);
        m47808().m21835(this.f8557, this, bArr.length + 9 + c3999.m7976() + 4);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7798(byte[] bArr, byte[] bArr2) throws IOException {
        String str = this.f8550 ? "posix-rename@openssh.com" : null;
        this.f8557.m23425();
        int length = bArr.length + 13 + bArr2.length;
        if (str == null) {
            m7785((byte) 18, length);
            C17823 c17823 = this.f8554;
            int i = this.f8558;
            this.f8558 = i + 1;
            c17823.m40459(i);
        } else {
            length += str.length() + 4;
            m7785((byte) -56, length);
            C17823 c17824 = this.f8554;
            int i2 = this.f8558;
            this.f8558 = i2 + 1;
            c17824.m40459(i2);
            C17823 c17825 = this.f8554;
            byte[] bArr3 = C20764.f65273;
            c17825.m40470(str.getBytes(StandardCharsets.UTF_8));
        }
        C17823 c17826 = this.f8554;
        c17826.getClass();
        c17826.m40466(0, bArr.length, bArr);
        C17823 c17827 = this.f8554;
        c17827.getClass();
        c17827.m40466(0, bArr2.length, bArr2);
        m47808().m21835(this.f8557, this, length + 4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7792(C3940 c3940, byte[] bArr, C8436 c8436) throws IOException {
        c3940.m7796(bArr, (byte) 4);
        c3940.m7799((int[]) null, c8436);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7786(int i, byte[] bArr) throws IOException {
        this.f8557.m23425();
        m7785((byte) 3, bArr.length + 17);
        C17823 c17823 = this.f8554;
        int i2 = this.f8558;
        this.f8558 = i2 + 1;
        c17823.m40459(i2);
        C17823 c17824 = this.f8554;
        c17824.getClass();
        c17824.m40466(0, bArr.length, bArr);
        this.f8554.m40459(i);
        this.f8554.m40459(0);
        m47808().m21835(this.f8557, this, bArr.length + 21);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7796(byte[] bArr, byte b) throws IOException {
        this.f8557.m23425();
        int length = bArr.length;
        m7785(b, length + 9);
        C17823 c17823 = this.f8554;
        int i = this.f8558;
        this.f8558 = i + 1;
        c17823.m40459(i);
        C17823 c17824 = this.f8554;
        c17824.getClass();
        c17824.m40466(0, bArr.length, bArr);
        m47808().m21835(this.f8557, this, length + 13);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m7782(C3940 c3940, byte[] bArr, long j, byte[] bArr2, int i, int i2) throws IOException {
        c3940.f8551.m23425();
        C9383 c9383M47808 = c3940.m47808();
        int iM21847 = c9383M47808.m21847();
        C17823 c17823 = c3940.f8546;
        byte[] bArr3 = c17823.f53185;
        int length = bArr3.length;
        int i3 = c17823.f53186 + 34;
        if (length < C20780.m46927(i3, bArr.length, i2, iM21847)) {
            i2 = bArr3.length - ((i3 + bArr.length) + iM21847);
        }
        int length2 = bArr.length + 21 + i2;
        c17823.m40448((byte) 94);
        c17823.m40459(c3940.f66555);
        c17823.m40459(length2 + 4);
        c17823.m40459(length2);
        c17823.m40448((byte) 6);
        C17823 c17824 = c3940.f8546;
        int i4 = c3940.f8558;
        c3940.f8558 = i4 + 1;
        c17824.m40459(i4);
        C17823 c17825 = c3940.f8546;
        c17825.getClass();
        c17825.m40466(0, bArr.length, bArr);
        c3940.f8546.m40451(j);
        C17823 c17826 = c3940.f8546;
        if (c17826.f53185 != bArr2) {
            c17826.m40466(i, i2, bArr2);
        } else {
            c17826.m40459(i2);
            c3940.f8546.m40465(i2);
        }
        c9383M47808.m21835(c3940.f8551, c3940, C20780.m46927(bArr.length, 21, i2, 4));
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7791(C3940 c3940, byte[] bArr, long j, int i, C9777 c9777) throws IOException {
        c3940.f8557.m23425();
        c3940.m7785((byte) 5, bArr.length + 21);
        C17823 c17823 = c3940.f8554;
        int i2 = c3940.f8558;
        c3940.f8558 = i2 + 1;
        c17823.m40459(i2);
        C17823 c17824 = c3940.f8554;
        c17824.getClass();
        c17824.m40466(0, bArr.length, bArr);
        c3940.f8554.m40451(j);
        c3940.f8554.m40459(i);
        c3940.m47808().m21835(c3940.f8557, c3940, bArr.length + 25);
        if (c9777 != null) {
            int i3 = c3940.f8558 - 1;
            int i4 = c9777.f27005;
            if (i4 == 0) {
                c9777.f27006 = 0;
            }
            int length = c9777.f27006 + i4;
            C15811[] c15811Arr = c9777.f27007;
            if (length >= c15811Arr.length) {
                length -= c15811Arr.length;
            }
            C15811 c15811 = c15811Arr[length];
            c15811.f45778 = i3;
            c15811.f45780 = j;
            c15811.f45779 = i;
            c9777.f27005 = i4 + 1;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m7785(byte b, int i) {
        C17823 c17823 = this.f8554;
        c17823.m40448((byte) 94);
        c17823.m40459(this.f66555);
        c17823.m40459(i + 4);
        c17823.m40459(i);
        c17823.m40448(b);
    }

    /* JADX INFO: renamed from: ᩻ */
    private Vector m7813(String str) throws IOException {
        byte[] bytes;
        String str2;
        Vector vector = new Vector();
        int iLastIndexOf = str.lastIndexOf(47);
        if (iLastIndexOf < 0) {
            vector.addElement(C20764.m46894(str));
            return vector;
        }
        String strSubstring = str.substring(0, iLastIndexOf == 0 ? 1 : iLastIndexOf);
        String strSubstring2 = str.substring(iLastIndexOf + 1);
        String strM46894 = C20764.m46894(strSubstring);
        byte[][] bArr = new byte[1][];
        if (!m7800(strSubstring2, bArr)) {
            if (!strM46894.equals("/")) {
                strM46894 = strM46894.concat("/");
            }
            StringBuilder sbM17248 = C7470.m17248(strM46894);
            sbM17248.append(C20764.m46894(strSubstring2));
            vector.addElement(sbM17248.toString());
            return vector;
        }
        byte[] bArr2 = bArr[0];
        m7796(C20764.m46886(strM46894, this.f8552), (byte) 11);
        C8436 c8436 = new C8436();
        m7795(this.f8554, c8436);
        int i = c8436.f22620;
        int i2 = c8436.f22622;
        m7794(this.f8554, i);
        byte b = 4;
        int i3 = 101;
        if (i2 != 101 && i2 != 102) {
            throw new C18080(4, "");
        }
        int[] iArr = null;
        if (i2 == 101) {
            m7805(this.f8554, this.f8554.m40464());
            throw null;
        }
        byte[] bArrM40471 = this.f8554.m40471();
        String strConcat = null;
        while (true) {
            m7796(bArrM40471, (byte) 12);
            m7795(this.f8554, c8436);
            int i4 = c8436.f22620;
            int i5 = c8436.f22622;
            if (i5 != i3 && i5 != 104) {
                throw new C18080(b, "");
            }
            if (i5 == i3) {
                m7794(this.f8554, i4);
                m7796(bArrM40471, b);
                m7799(iArr, c8436);
                return vector;
            }
            C17823 c17823 = this.f8554;
            c17823.f53187 = 0;
            m7781(0, b, c17823.f53185);
            int i6 = i4 - 4;
            this.f8554.m40456();
            for (int iM40464 = this.f8554.m40464(); iM40464 > 0; iM40464--) {
                if (i6 > 0) {
                    C17823 c17824 = this.f8554;
                    int i7 = c17824.f53187;
                    if (i7 != 0) {
                        byte[] bArr3 = c17824.f53185;
                        System.arraycopy(bArr3, i7, bArr3, 0, c17824.f53186 - i7);
                        c17824.f53186 -= c17824.f53187;
                        c17824.f53187 = 0;
                    }
                    C17823 c17825 = this.f8554;
                    byte[] bArr4 = c17825.f53185;
                    int length = bArr4.length;
                    int i8 = c17825.f53186;
                    int i9 = this.f8549.read(bArr4, i8, length > i8 + i6 ? i6 : bArr4.length - i8);
                    if (i9 <= 0) {
                        break;
                    }
                    this.f8554.f53186 += i9;
                    i6 -= i9;
                }
                byte[] bArrM40472 = this.f8554.m40471();
                if (this.f8556 <= 3) {
                    this.f8554.m40471();
                }
                C3999.m7967(this.f8554);
                if (this.f8560) {
                    bytes = bArrM40472;
                    str2 = null;
                } else {
                    str2 = new String(bArrM40472, 0, bArrM40472.length, this.f8552);
                    bytes = str2.getBytes(StandardCharsets.UTF_8);
                }
                if (C20764.m46896(bArr2, bytes)) {
                    if (str2 == null) {
                        str2 = new String(bArrM40472, 0, bArrM40472.length, this.f8552);
                    }
                    if (strConcat == null) {
                        strConcat = !strM46894.endsWith("/") ? strM46894.concat("/") : strM46894;
                    }
                    vector.addElement(strConcat + str2);
                }
            }
            b = 4;
            i3 = 101;
            iArr = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m7805(C17823 c17823, int i) throws C18080 {
        if (this.f8556 >= 3 && c17823.m40469() >= 4) {
            byte[] bArrM40471 = c17823.m40471();
            Charset charset = StandardCharsets.UTF_8;
            byte[] bArr = C20764.f65273;
            throw new C18080(i, new String(bArrM40471, 0, bArrM40471.length, charset));
        }
        throw new C18080(i, "Failure");
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m7800(String str, byte[][] bArr) {
        int i;
        byte[] bArrM46886 = C20764.m46886(str, StandardCharsets.UTF_8);
        if (bArr != null) {
            bArr[0] = bArrM46886;
        }
        int length = bArrM46886.length;
        int i2 = 0;
        while (i2 < length) {
            byte b = bArrM46886[i2];
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
    /* JADX INFO: renamed from: ֫ */
    public void m7794(C17823 c17823, int i) throws IOException {
        c17823.m40456();
        m7781(0, i, c17823.f53185);
        c17823.m40465(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public int m7781(int i, int i2, byte[] bArr) throws IOException {
        int i3 = i;
        while (i2 > 0) {
            int i4 = this.f8549.read(bArr, i3, i2);
            if (i4 <= 0) {
                throw new IOException("inputstream is closed");
            }
            i3 += i4;
            i2 -= i4;
        }
        return i3 - i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m7787(C3940 c3940, long j) throws IOException {
        while (j > 0) {
            long jSkip = c3940.f8549.skip(j);
            if (jSkip <= 0) {
                return;
            } else {
                j -= jSkip;
            }
        }
    }

    /* JADX INFO: renamed from: ۢ */
    private String m7803(String str) {
        if (str.charAt(0) == '/') {
            return str;
        }
        if (this.f8553 == null) {
            this.f8553 = m7814();
        }
        String str2 = this.f8553;
        return str2.endsWith("/") ? str2.concat(str) : C24104.m53357(str2, "/", str);
    }

    /* JADX INFO: renamed from: ᩷ */
    private String m7812(String str) throws IOException {
        Vector vectorM7813 = m7813(str);
        if (vectorM7813.size() == 1) {
            return (String) vectorM7813.elementAt(0);
        }
        StringBuilder sbM21133 = C9179.m21133(str, " is not unique: ");
        sbM21133.append(vectorM7813.toString());
        throw new C18080(4, sbM21133.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m7819(Charset charset) {
        this.f8552 = charset;
        this.f8560 = charset.equals(StandardCharsets.UTF_8);
    }
}
