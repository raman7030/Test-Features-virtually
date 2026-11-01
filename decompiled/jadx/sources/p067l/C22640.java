package p067l;

import bin.p000mt.json.JSONArray;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import com.umeng.analytics.pro.C0708d;
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
public final class C22640 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final ArrayDeque f71428 = new ArrayDeque();

    /* JADX INFO: renamed from: ۙ */
    public boolean f71429;

    /* JADX INFO: renamed from: ۛ */
    public final C2521 f71430;

    /* JADX INFO: renamed from: ۤ */
    public final C20961 f71431;

    /* JADX INFO: renamed from: ۨ */
    public String f71432;

    /* JADX INFO: renamed from: ۫ */
    public final C13259 f71433;

    /* JADX INFO: renamed from: ۬ */
    public int f71434;

    /* JADX INFO: renamed from: ᩶ */
    public final C17273 f71435;

    /* JADX INFO: renamed from: ᩸ */
    public C19957 f71436;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f71437;

    /* JADX INFO: renamed from: ᩺ */
    public String f71438;

    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00e7  */
    public C22640(AbstractC17043 abstractC17043, C18615 c18615, C17273 c17273, C20961 c20961, C13259 c13259, C3192 c3192) {
        boolean z;
        String str;
        String str2;
        this.f71435 = c17273;
        this.f71431 = c20961;
        this.f71433 = c13259;
        String strName = c18615.f55585.name();
        boolean z2 = strName.equalsIgnoreCase(C0233a.f1077D) || strName.equalsIgnoreCase("UTF-16LE") || strName.equalsIgnoreCase("UTF-16BE") || strName.equalsIgnoreCase("UTF-32LE") || strName.equalsIgnoreCase("UTF-32BE") || strName.equalsIgnoreCase("US-ASCII") || strName.equalsIgnoreCase(LocalizedMessage.DEFAULT_ENCODING);
        C2521 c2521 = new C2521(abstractC17043, c18615, z2 ? c17273.f51473 : c18615.f55584, c3192);
        this.f71430 = c2521;
        long j = z2 ? c17273.f51476 : 0L;
        long jPosition = c2521.position();
        while (true) {
            try {
                long j2 = c17273.f51474;
                if (j < j2) {
                    C19957 c19957M3689 = this.f71430.m3689(j);
                    if (c19957M3689 == null) {
                        throw new IOException("File ended before the text search checkpoint.");
                    }
                    if (c19957M3689.m45292() >= c17273.f51476) {
                        m50688(c19957M3689);
                    }
                    j++;
                    jPosition = c19957M3689.m45286();
                } else {
                    if (c17273.f51471) {
                        C19957 c19957M36810 = this.f71430.m3689(j2);
                        this.f71436 = c19957M36810;
                        if (c19957M36810 == null) {
                            throw new IOException("Missing pending search line.");
                        }
                        m50689();
                        if (this.f71432 != null) {
                            c17273.f51469 = this.f71436.m45290();
                            return;
                        }
                        return;
                    }
                    return;
                }
            } catch (CharacterCodingException e) {
                e = e;
                c17273.f51474 = j;
                c17273.f51469 = jPosition;
                c17273.f51471 = false;
                this.f71436 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f71432 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f71438 = str2;
                return;
            } catch (C20628 e2) {
                e = e2;
                c17273.f51474 = j;
                c17273.f51469 = jPosition;
                c17273.f51471 = false;
                this.f71436 = null;
                z = e instanceof CharacterCodingException;
                if (z) {
                    str = "decode_error";
                } else {
                    str = "resource_limit";
                }
                this.f71432 = str;
                if (z) {
                    str2 = "invalid_encoding";
                } else {
                    str2 = "line_too_long";
                }
                this.f71438 = str2;
                return;
            } catch (Throwable th) {
                try {
                    this.f71430.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C16603 m50691(long j, long j2, C13241 c13241) throws IOException {
        ArrayDeque arrayDeque;
        C2521 c2521;
        C20961 c20961;
        long j3;
        long j4;
        long jM45291;
        long j5;
        long j6;
        C9898 c9898;
        C20961 c20962 = this.f71431;
        C16603 c16603 = new C16603(c20962.m47288());
        c13241.getClass();
        long jNanoTime = System.nanoTime();
        C17273 c17273 = this.f71435;
        long j7 = c17273.f51469;
        boolean z = false;
        loop0: while (true) {
            C2521.m3687();
            String str = this.f71432;
            C2521 c2522 = this.f71430;
            arrayDeque = this.f71428;
            if (str == null) {
                C19957 c19957 = this.f71436;
                if (c19957 != null) {
                    boolean z2 = this.f71437;
                    JSONArray jSONArray = c16603.f48765;
                    if (!z2 || c17273.f51478 == c19957.m45292() || jSONArray.size() < c20962.m47290()) {
                        if (this.f71437) {
                            j5 = 1;
                        } else {
                            if (this.f71436.m45292() <= c17273.f51467) {
                                j5 = 1;
                            } else {
                                c20961 = c20962;
                                j3 = jNanoTime;
                                j4 = j7;
                                c2521 = c2522;
                                arrayDeque = arrayDeque;
                                j5 = 1;
                            }
                            jM45291 = 0;
                            m50688(this.f71436);
                            c17273.f51474 = this.f71436.m45292() + j5;
                            c17273.f51471 = false;
                            this.f71436 = null;
                            z = true;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (this.f71437) {
                            arrayList.addAll(arrayDeque);
                            c2521 = c2522;
                            long j8 = jNanoTime;
                            long jMax = Math.max(0L, this.f71436.m45292() - ((long) c20962.m47289()));
                            if (c20962.m47289() > 0) {
                                j3 = j8;
                                if (this.f71436.m45292() > 0 && (arrayDeque.isEmpty() || ((C19957) arrayDeque.getFirst()).m45292() > jMax || ((C19957) arrayDeque.getFirst()).m45291() > 0)) {
                                    c16603.m37617(jMax, "context_clipped");
                                }
                            } else {
                                j3 = j8;
                            }
                        } else {
                            j3 = jNanoTime;
                            c2521 = c2522;
                        }
                        arrayList.add(this.f71436);
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C19957 c19958 = (C19957) it.next();
                                arrayDeque = arrayDeque;
                                if (c19958.m45292() < c17273.f51480) {
                                    arrayDeque = arrayDeque;
                                } else {
                                    long jM45292 = c19958.m45292();
                                    long j9 = c17273.f51480;
                                    long jM45293 = c19958.m45291();
                                    if (jM45292 == j9) {
                                        jM45293 = Math.max(jM45293, c17273.f51470);
                                    }
                                    long j10 = j7;
                                    if (c19958.m45292() < c16603.f48763) {
                                        j6 = j5;
                                    } else {
                                        if (c19958.m45292() == c16603.f48763) {
                                            jM45293 = Math.max(jM45293, c16603.f48761);
                                        }
                                        int iCodePointCount = c19958.m45288().codePointCount(0, c19958.m45288().length());
                                        long jM45294 = jM45293 - c19958.m45291();
                                        j6 = j5;
                                        if (jM45294 < iCodePointCount) {
                                            int i = (int) jM45294;
                                            int iOffsetByCodePoints = c19958.m45288().offsetByCodePoints(0, i);
                                            int i2 = c16603.f48762;
                                            if (i2 != 0) {
                                                int iMin = Math.min(i2, iCodePointCount - i);
                                                int iOffsetByCodePoints2 = c19958.m45288().offsetByCodePoints(iOffsetByCodePoints, iMin);
                                                if (iOffsetByCodePoints2 < c19958.m45288().length() && iOffsetByCodePoints2 > iOffsetByCodePoints && c19958.m45288().charAt(iOffsetByCodePoints2 - 1) == '\r' && c19958.m45288().charAt(iOffsetByCodePoints2) == '\n') {
                                                    iOffsetByCodePoints2--;
                                                    iMin--;
                                                }
                                                if (iMin != 0) {
                                                    C19957 c19959 = this.f71436;
                                                    if (c19958 == c19959 && this.f71437 && c17273.f51478 != c19959.m45292()) {
                                                        jSONArray.add(this.f71436.m45292());
                                                        c17273.f51478 = this.f71436.m45292();
                                                        c17273.f51467 = Math.max(c17273.f51467, this.f71436.m45292() + ((long) c20962.m47286()));
                                                    }
                                                    long jM45295 = c19958.m45292();
                                                    String strSubstring = c19958.m45288().substring(iOffsetByCodePoints, iOffsetByCodePoints2);
                                                    ArrayList arrayList2 = c16603.f48760;
                                                    if (!arrayList2.isEmpty() && jM45295 == c16603.f48763 && jM45293 == c16603.f48761) {
                                                        c9898 = (C9898) C20013.m45383(arrayList2, 1);
                                                    } else {
                                                        C9898 c9899 = new C9898(jM45295, jM45293);
                                                        arrayList2.add(c9899);
                                                        c9898 = c9899;
                                                    }
                                                    c9898.f27446.append(strSubstring);
                                                    c16603.f48763 = jM45295;
                                                    c16603.f48761 = ((long) strSubstring.codePointCount(0, strSubstring.length())) + jM45293;
                                                    if (strSubstring.endsWith("\n") || strSubstring.endsWith("\r")) {
                                                        c16603.f48763 += j6;
                                                        c16603.f48761 = 0L;
                                                    }
                                                    c16603.f48762 -= iMin;
                                                    c17273.f51480 = c19958.m45292();
                                                    c17273.f51470 = jM45293 + ((long) iMin);
                                                    if (iOffsetByCodePoints2 >= c19958.m45288().length()) {
                                                        c17273.f51480 = c19958.m45292() + j6;
                                                        c17273.f51470 = 0L;
                                                        it = it;
                                                        c20962 = c20962;
                                                    }
                                                }
                                            }
                                            c16603.f48764 = "output_limit";
                                            break loop0;
                                        }
                                        j7 = j10;
                                        j5 = j6;
                                    }
                                    j7 = j10;
                                    j5 = j6;
                                }
                            } else {
                                c20961 = c20962;
                                j4 = j7;
                                arrayDeque = arrayDeque;
                                jM45291 = 0;
                                m50688(this.f71436);
                                c17273.f51474 = this.f71436.m45292() + j5;
                                c17273.f51471 = false;
                                this.f71436 = null;
                                z = true;
                            }
                        }
                    } else {
                        c16603.f48764 = "match_limit";
                    }
                } else {
                    c20961 = c20962;
                    j3 = jNanoTime;
                    j4 = j7;
                    c2521 = c2522;
                    arrayDeque = arrayDeque;
                    jM45291 = 0;
                }
                if (!this.f71429) {
                    if (z && (c17273.f51469 - j4 >= j || System.nanoTime() - j3 >= j2)) {
                        c16603.f48764 = "scan_budget";
                        break;
                    }
                    try {
                        C2521 c2523 = c2521;
                        C19957 c19957M3689 = c2523.m3689(c17273.f51474);
                        this.f71436 = c19957M3689;
                        if (c19957M3689 == null) {
                            this.f71429 = true;
                            c17273.f51469 = c2523.position();
                        } else {
                            m50689();
                            if (this.f71432 == null) {
                                c17273.f51471 = true;
                                c17273.f51469 = this.f71436.m45286();
                                c17273.f51480 = ((!this.f71437 || arrayDeque.isEmpty()) ? this.f71436 : (C19957) arrayDeque.getFirst()).m45292();
                                if (this.f71437 && !arrayDeque.isEmpty()) {
                                    jM45291 = ((C19957) arrayDeque.getFirst()).m45291();
                                }
                                c17273.f51470 = jM45291;
                            }
                        }
                    } catch (CharacterCodingException unused) {
                        this.f71432 = "decode_error";
                        this.f71438 = "invalid_encoding";
                    } catch (C20628 unused2) {
                        this.f71432 = "resource_limit";
                        this.f71438 = "line_too_long";
                    }
                    c20962 = c20961;
                    jNanoTime = j3;
                    j7 = j4;
                } else {
                    c16603.f48764 = C0708d.f2613aB;
                    break;
                }
            } else {
                c16603.f48764 = str;
                c16603.m37617(c17273.f51474, this.f71438);
                long j11 = c17273.f51474;
                if (j11 <= c17273.f51467) {
                    c16603.m37617(j11, "context_incomplete");
                }
            }
            c2521 = c2522;
            arrayDeque = arrayDeque;
            break;
        }
        if (arrayDeque.isEmpty()) {
            c17273.f51476 = c17273.f51474;
            C19957 c199510 = this.f71436;
            c17273.f51473 = c199510 == null ? c2521.position() : c199510.m45290();
        } else {
            c17273.f51476 = ((C19957) arrayDeque.getFirst()).m45292();
            c17273.f51473 = ((C19957) arrayDeque.getFirst()).m45290();
        }
        return c16603;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m50689() throws InterruptedIOException {
        C2521.m3687();
        C13929 c13929Matcher = this.f71433.matcher((CharSequence) this.f71436.m45288().substring(0, this.f71436.m45289()));
        this.f71437 = c13929Matcher.find();
        C2521.m3687();
        if (c13929Matcher.m31668() || c13929Matcher.m31678()) {
            this.f71432 = "resource_limit";
            this.f71438 = "match_resource_limit";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m50688(C19957 c19957) {
        C20961 c20961 = this.f71431;
        if (c20961.m47289() == 0) {
            return;
        }
        C19957 c19957M45287 = c19957.m45287(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT);
        ArrayDeque arrayDeque = this.f71428;
        arrayDeque.addLast(c19957M45287);
        this.f71434 = c19957M45287.m45288().length() + this.f71434;
        while (arrayDeque.size() > c20961.m47289()) {
            this.f71434 -= ((C19957) arrayDeque.removeFirst()).m45288().length();
        }
        while (this.f71434 > 131072 && !arrayDeque.isEmpty()) {
            C19957 c19958 = (C19957) arrayDeque.removeFirst();
            int length = this.f71434 - c19958.m45288().length();
            this.f71434 = length;
            int i = WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT - length;
            if (i > 1) {
                C19957 c19957M45288 = c19958.m45287(i);
                arrayDeque.addFirst(c19957M45288);
                this.f71434 = c19957M45288.m45288().length() + this.f71434;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m50690() {
        long length = (((long) this.f71431.m47291().length()) * 512) + 65536;
        int i = this.f71434;
        C19957 c19957 = this.f71436;
        return (((long) (i + (c19957 == null ? 0 : c19957.m45288().length()))) * 2) + length;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f71430.close();
    }
}
