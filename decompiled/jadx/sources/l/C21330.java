package l;

import bin.mt.json.JSONArray;
import com.alipay.sdk.m.w.a;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.charset.CharacterCodingException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩸ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21330 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f68734 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f68735;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final C0161 f68736;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C19563 f68737;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f68738;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11459 f68739;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f68740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C15683 f68741;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18507 f68742;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f68743;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public String f68744;

    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    public C21330(AbstractC15440 abstractC15440, C17095 c17095, C15683 c15683, C19563 c19563, C11459 c11459, C0867 c0867) {
        boolean z;
        String str;
        String str2;
        this.f68741 = c15683;
        this.f68737 = c19563;
        this.f68739 = c11459;
        String strName = c17095.f52402.name();
        boolean z2 = strName.equalsIgnoreCase(a.D) || strName.equalsIgnoreCase("UTF-16LE") || strName.equalsIgnoreCase("UTF-16BE") || strName.equalsIgnoreCase("UTF-32LE") || strName.equalsIgnoreCase("UTF-32BE") || strName.equalsIgnoreCase("US-ASCII") || strName.equalsIgnoreCase(LocalizedMessage.DEFAULT_ENCODING);
        C0161 c0161 = new C0161(abstractC15440, c17095, z2 ? c15683.f48335 : c17095.f52401, c0867);
        this.f68736 = c0161;
        long j = z2 ? c15683.f48338 : 0L;
        long jPosition = c0161.position();
        while (true) {
            try {
                long j2 = c15683.f48336;
                if (j < j2) {
                    C18507 c18507M1281 = this.f68736.m1281(j);
                    if (c18507M1281 == null) {
                        throw new IOException("File ended before the text search checkpoint.");
                    }
                    if (c18507M1281.m43014() >= c15683.f48338) {
                        m48353(c18507M1281);
                    }
                    j++;
                    jPosition = c18507M1281.m43008();
                } else {
                    if (c15683.f48333) {
                        C18507 c18507M1282 = this.f68736.m1281(j2);
                        this.f68742 = c18507M1282;
                        if (c18507M1282 == null) {
                            throw new IOException("Missing pending search line.");
                        }
                        m48354();
                        if (this.f68738 != null) {
                            c15683.f48331 = this.f68742.m43012();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (CharacterCodingException e) {
                e = e;
                c15683.f48336 = j;
                c15683.f48331 = jPosition;
                c15683.f48333 = false;
                this.f68742 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f68738 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f68744 = str2;
                return;
            } catch (C19213 e2) {
                e = e2;
                c15683.f48336 = j;
                c15683.f48331 = jPosition;
                c15683.f48333 = false;
                this.f68742 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f68738 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f68744 = str2;
                return;
            } catch (Throwable th) {
                try {
                    this.f68736.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14978 m48356(long j, long j2, C11440 c11440) throws IOException {
        ArrayDeque arrayDeque;
        C0161 c0161;
        C19563 c19563;
        long j3;
        long j4;
        long jM43013;
        long j5;
        long j6;
        C7923 c7923;
        C19563 c19564 = this.f68737;
        C14978 c14978 = new C14978(c19564.m44993());
        c11440.getClass();
        long jNanoTime = System.nanoTime();
        C15683 c15683 = this.f68741;
        long j7 = c15683.f48331;
        boolean z = false;
        loop0: while (true) {
            C0161.m1279();
            String str = this.f68738;
            C0161 c0162 = this.f68736;
            arrayDeque = this.f68734;
            if (str == null) {
                C18507 c18507 = this.f68742;
                if (c18507 != null) {
                    boolean z2 = this.f68743;
                    JSONArray jSONArray = c14978.f45652;
                    if (!z2 || c15683.f48340 == c18507.m43014() || jSONArray.size() < c19564.m44995()) {
                        if (this.f68743) {
                            j5 = 1;
                        } else {
                            if (this.f68742.m43014() <= c15683.f48329) {
                                j5 = 1;
                            } else {
                                c19563 = c19564;
                                j3 = jNanoTime;
                                j4 = j7;
                                c0161 = c0162;
                                arrayDeque = arrayDeque;
                                j5 = 1;
                            }
                            jM43013 = 0;
                            m48353(this.f68742);
                            c15683.f48336 = this.f68742.m43014() + j5;
                            c15683.f48333 = false;
                            this.f68742 = null;
                            z = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (this.f68743) {
                            arrayList.addAll(arrayDeque);
                            c0161 = c0162;
                            long j8 = jNanoTime;
                            long jMax = Math.max(0L, this.f68742.m43014() - ((long) c19564.m44994()));
                            if (c19564.m44994() > 0) {
                                j3 = j8;
                                if (this.f68742.m43014() > 0 && (arrayDeque.isEmpty() || ((C18507) arrayDeque.getFirst()).m43014() > jMax || ((C18507) arrayDeque.getFirst()).m43013() > 0)) {
                                    c14978.m35461(jMax, "context_clipped");
                                }
                            } else {
                                j3 = j8;
                            }
                        } else {
                            j3 = jNanoTime;
                            c0161 = c0162;
                        }
                        arrayList.add(this.f68742);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C18507 c18508 = (C18507) it.next();
                                arrayDeque = arrayDeque;
                                if (c18508.m43014() < c15683.f48342) {
                                    arrayDeque = arrayDeque;
                                } else {
                                    long jM43014 = c18508.m43014();
                                    long j9 = c15683.f48342;
                                    long jM43015 = c18508.m43013();
                                    if (jM43014 == j9) {
                                        jM43015 = Math.max(jM43015, c15683.f48332);
                                    }
                                    long j10 = j7;
                                    if (c18508.m43014() < c14978.f45650) {
                                        j6 = j5;
                                    } else {
                                        if (c18508.m43014() == c14978.f45650) {
                                            jM43015 = Math.max(jM43015, c14978.f45648);
                                        }
                                        int iCodePointCount = c18508.m43010().codePointCount(0, c18508.m43010().length());
                                        long jM43016 = jM43015 - c18508.m43013();
                                        j6 = j5;
                                        if (jM43016 < iCodePointCount) {
                                            int i = (int) jM43016;
                                            int iOffsetByCodePoints = c18508.m43010().offsetByCodePoints(0, i);
                                            int i2 = c14978.f45649;
                                            if (i2 != 0) {
                                                int iMin = Math.min(i2, iCodePointCount - i);
                                                int iOffsetByCodePoints2 = c18508.m43010().offsetByCodePoints(iOffsetByCodePoints, iMin);
                                                if (iOffsetByCodePoints2 < c18508.m43010().length() && iOffsetByCodePoints2 > iOffsetByCodePoints && c18508.m43010().charAt(iOffsetByCodePoints2 - 1) == '\r' && c18508.m43010().charAt(iOffsetByCodePoints2) == '\n') {
                                                    iOffsetByCodePoints2--;
                                                    iMin--;
                                                }
                                                if (iMin != 0) {
                                                    C18507 c18509 = this.f68742;
                                                    if (c18508 == c18509 && this.f68743 && c15683.f48340 != c18509.m43014()) {
                                                        jSONArray.add(this.f68742.m43014());
                                                        c15683.f48340 = this.f68742.m43014();
                                                        c15683.f48329 = Math.max(c15683.f48329, this.f68742.m43014() + ((long) c19564.m44991()));
                                                    }
                                                    long jM43017 = c18508.m43014();
                                                    String strSubstring = c18508.m43010().substring(iOffsetByCodePoints, iOffsetByCodePoints2);
                                                    ArrayList arrayList2 = c14978.f45647;
                                                    if (!arrayList2.isEmpty() && jM43017 == c14978.f45650 && jM43015 == c14978.f45648) {
                                                        c7923 = (C7923) C18566.m43105(arrayList2, 1);
                                                    } else {
                                                        C7923 c7924 = new C7923(jM43017, jM43015);
                                                        arrayList2.add(c7924);
                                                        c7923 = c7924;
                                                    }
                                                    c7923.f24531.append(strSubstring);
                                                    c14978.f45650 = jM43017;
                                                    c14978.f45648 = ((long) strSubstring.codePointCount(0, strSubstring.length())) + jM43015;
                                                    if (strSubstring.endsWith("\n") || strSubstring.endsWith("\r")) {
                                                        c14978.f45650 += j6;
                                                        c14978.f45648 = 0L;
                                                    }
                                                    c14978.f45649 -= iMin;
                                                    c15683.f48342 = c18508.m43014();
                                                    c15683.f48332 = jM43015 + ((long) iMin);
                                                    if (iOffsetByCodePoints2 >= c18508.m43010().length()) {
                                                        c15683.f48342 = c18508.m43014() + j6;
                                                        c15683.f48332 = 0L;
                                                        it = it;
                                                        c19564 = c19564;
                                                    }
                                                }
                                            }
                                            c14978.f45651 = "output_limit";
                                            break loop0;
                                        }
                                        j7 = j10;
                                        j5 = j6;
                                    }
                                    j7 = j10;
                                    j5 = j6;
                                }
                            } else {
                                c19563 = c19564;
                                j4 = j7;
                                arrayDeque = arrayDeque;
                                jM43013 = 0;
                                m48353(this.f68742);
                                c15683.f48336 = this.f68742.m43014() + j5;
                                c15683.f48333 = false;
                                this.f68742 = null;
                                z = true;
                            }
                        }
                    } else {
                        c14978.f45651 = "match_limit";
                    }
                } else {
                    c19563 = c19564;
                    j3 = jNanoTime;
                    j4 = j7;
                    c0161 = c0162;
                    arrayDeque = arrayDeque;
                    jM43013 = 0;
                }
                if (!this.f68735) {
                    if (z && (c15683.f48331 - j4 >= j || System.nanoTime() - j3 >= j2)) {
                        c14978.f45651 = "scan_budget";
                        break;
                    }
                    try {
                        C0161 c0163 = c0161;
                        C18507 c18507M1281 = c0163.m1281(c15683.f48336);
                        this.f68742 = c18507M1281;
                        if (c18507M1281 == null) {
                            this.f68735 = true;
                            c15683.f48331 = c0163.position();
                        } else {
                            m48354();
                            if (this.f68738 == null) {
                                c15683.f48333 = true;
                                c15683.f48331 = this.f68742.m43008();
                                c15683.f48342 = ((!this.f68743 || arrayDeque.isEmpty()) ? this.f68742 : (C18507) arrayDeque.getFirst()).m43014();
                                if (this.f68743 && !arrayDeque.isEmpty()) {
                                    jM43013 = ((C18507) arrayDeque.getFirst()).m43013();
                                }
                                c15683.f48332 = jM43013;
                            }
                        }
                    } catch (CharacterCodingException unused) {
                        this.f68738 = "decode_error";
                        this.f68744 = "invalid_encoding";
                    } catch (C19213 unused2) {
                        this.f68738 = "resource_limit";
                        this.f68744 = "line_too_long";
                    }
                    c19564 = c19563;
                    jNanoTime = j3;
                    j7 = j4;
                } else {
                    c14978.f45651 = d.aB;
                    break;
                }
            } else {
                c14978.f45651 = str;
                c14978.m35461(c15683.f48336, this.f68744);
                long j11 = c15683.f48336;
                if (j11 <= c15683.f48329) {
                    c14978.m35461(j11, "context_incomplete");
                }
            }
            c0161 = c0162;
            arrayDeque = arrayDeque;
            break;
        }
        if (arrayDeque.isEmpty()) {
            c15683.f48338 = c15683.f48336;
            C18507 c185010 = this.f68742;
            c15683.f48335 = c185010 == null ? c0161.position() : c185010.m43012();
        } else {
            c15683.f48338 = ((C18507) arrayDeque.getFirst()).m43014();
            c15683.f48335 = ((C18507) arrayDeque.getFirst()).m43012();
        }
        return c14978;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m48354() throws InterruptedIOException {
        C0161.m1279();
        C12164 c12164Matcher = this.f68739.matcher((CharSequence) this.f68742.m43010().substring(0, this.f68742.m43011()));
        this.f68743 = c12164Matcher.find();
        C0161.m1279();
        if (c12164Matcher.m29603() || c12164Matcher.m29613()) {
            this.f68738 = "resource_limit";
            this.f68744 = "match_resource_limit";
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48353(C18507 c18507) {
        C19563 c19563 = this.f68737;
        if (c19563.m44994() == 0) {
            return;
        }
        C18507 c18507M43009 = c18507.m43009(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        ArrayDeque arrayDeque = this.f68734;
        arrayDeque.addLast(c18507M43009);
        this.f68740 = c18507M43009.m43010().length() + this.f68740;
        while (arrayDeque.size() > c19563.m44994()) {
            this.f68740 -= ((C18507) arrayDeque.removeFirst()).m43010().length();
        }
        while (this.f68740 > 131072 && !arrayDeque.isEmpty()) {
            C18507 c18508 = (C18507) arrayDeque.removeFirst();
            int length = this.f68740 - c18508.m43010().length();
            this.f68740 = length;
            int i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - length;
            if (i > 1) {
                C18507 c18507M430010 = c18508.m43009(i);
                arrayDeque.addFirst(c18507M430010);
                this.f68740 = c18507M430010.m43010().length() + this.f68740;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m48355() {
        long length = (((long) this.f68737.m44996().length()) * 512) + 65536;
        int i = this.f68740;
        C18507 c18507 = this.f68742;
        return (((long) (i + (c18507 == null ? 0 : c18507.m43010().length()))) * 2) + length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f68736.close();
    }
}
