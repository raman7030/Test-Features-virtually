package p067l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩺᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 97LV */
/* JADX INFO: loaded from: classes.dex */
public final class C24508 implements InterfaceC17570 {

    /* JADX INFO: renamed from: ֫ */
    public final C14450 f77651;

    /* JADX INFO: renamed from: ۧ */
    public final C7074 f77652;

    /* JADX INFO: renamed from: ۢ */
    public static final Pattern f77605 = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ܿۧ */
    public static final Pattern f77631 = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۜ */
    public static final Pattern f77597 = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۫֫ */
    public static final Pattern f77614 = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩸ */
    public static final Pattern f77643 = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۡ */
    public static final Pattern f77603 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۚ */
    public static final Pattern f77593 = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳۧ */
    public static final Pattern f77621 = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: ᩹ */
    public static final Pattern f77645 = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۤ֫ */
    public static final Pattern f77608 = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩸֫ */
    public static final Pattern f77644 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: ۛ */
    public static final Pattern f77595 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۛ֫ */
    public static final Pattern f77596 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: ܳ */
    public static final Pattern f77619 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩻ */
    public static final Pattern f77649 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩵֫ */
    public static final Pattern f77638 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩳۧ */
    public static final Pattern f77634 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: ۚ֫ */
    public static final Pattern f77594 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: ֡ */
    public static final Pattern f77579 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩵ */
    public static final Pattern f77637 = m54077("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: ۙ֫ */
    public static final Pattern f77592 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: ܰ */
    public static final Pattern f77617 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩴ֫ */
    public static final Pattern f77636 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩴ */
    public static final Pattern f77635 = m54077("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: ۡ֫ */
    public static final Pattern f77604 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: ۢ֫ */
    public static final Pattern f77606 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܺ֫ */
    public static final Pattern f77625 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: ۜ֫ */
    public static final Pattern f77598 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: ᩷֫ */
    public static final Pattern f77642 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: ܰ֫ */
    public static final Pattern f77618 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܺ */
    public static final Pattern f77624 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: ܿ */
    public static final Pattern f77629 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: ۘ */
    public static final Pattern f77589 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: ۖ */
    public static final Pattern f77585 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۖ֫ */
    public static final Pattern f77586 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: ܿ֫ */
    public static final Pattern f77630 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳ֫ */
    public static final Pattern f77620 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֫ۧ */
    public static final Pattern f77584 = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final Pattern f77633 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: ۟֫ */
    public static final Pattern f77600 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: ܶ֫ */
    public static final Pattern f77623 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: ᩻֫ */
    public static final Pattern f77650 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۘ֫ */
    public static final Pattern f77590 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩺ */
    public static final Pattern f77647 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֨ */
    public static final Pattern f77581 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽ֫ */
    public static final Pattern f77627 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: ᩷ */
    public static final Pattern f77641 = m54077("AUTOSELECT");

    /* JADX INFO: renamed from: ۗ */
    public static final Pattern f77587 = m54077("DEFAULT");

    /* JADX INFO: renamed from: ۤ */
    public static final Pattern f77607 = m54077("FORCED");

    /* JADX INFO: renamed from: ۧ֫ */
    public static final Pattern f77609 = m54077("INDEPENDENT");

    /* JADX INFO: renamed from: ۨ */
    public static final Pattern f77611 = m54077("GAP");

    /* JADX INFO: renamed from: ۠֫ */
    public static final Pattern f77602 = m54077("PRECISE");

    /* JADX INFO: renamed from: ۧۧ */
    public static final Pattern f77610 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֫֫ */
    public static final Pattern f77583 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۟ */
    public static final Pattern f77599 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۠ */
    public static final Pattern f77601 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۬֫ */
    public static final Pattern f77616 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۙ */
    public static final Pattern f77591 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۬ */
    public static final Pattern f77615 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֡֫ */
    public static final Pattern f77580 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۫ */
    public static final Pattern f77613 = m54077("END-ON-NEXT");

    /* JADX INFO: renamed from: ᩳ */
    public static final Pattern f77632 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽ */
    public static final Pattern f77626 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩶֫ */
    public static final Pattern f77640 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ֨֫ */
    public static final Pattern f77582 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۗ֫ */
    public static final Pattern f77588 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩹֫ */
    public static final Pattern f77646 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩶ */
    public static final Pattern f77639 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۨ֫ */
    public static final Pattern f77612 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩺֫ */
    public static final Pattern f77648 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽۧ */
    public static final Pattern f77628 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: ܶ */
    public static final Pattern f77622 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    @Override // p067l.InterfaceC17570
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo36005(Uri uri, C21412 c21412) {
        return m54084(uri, (InputStream) c21412);
    }

    public C24508() {
        this(C14450.f41281, null);
    }

    public C24508(C14450 c14450, C7074 c7074) {
        this.f77651 = c14450;
        this.f77652 = c7074;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0103, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0047 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫ */
    public final AbstractC12439 m54084(Uri uri, InputStream inputStream) throws C10998 {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zM13031 = false;
            if (i2 == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    i2 = bufferedReader.read();
                    while (i2 != -1) {
                        i2 = bufferedReader.read();
                    }
                    i = 0;
                    while (true) {
                        if (i < 7) {
                            if (i2 != "#EXTM3U".charAt(i)) {
                                break;
                                break;
                            }
                            i2 = bufferedReader.read();
                            i++;
                        } else {
                            while (i2 != -1) {
                                i2 = bufferedReader.read();
                            }
                            zM13031 = C5792.m13031(i2);
                            break;
                        }
                    }
                }
            } else {
                while (i2 != -1 && Character.isWhitespace(i2)) {
                    i2 = bufferedReader.read();
                }
                i = 0;
                while (true) {
                    if (i < 7) {
                        if (i2 != "#EXTM3U".charAt(i)) {
                            break;
                        }
                        i2 = bufferedReader.read();
                        i++;
                    } else {
                        while (i2 != -1 && Character.isWhitespace(i2) && !C5792.m13031(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zM13031 = C5792.m13031(i2);
                        break;
                    }
                }
            }
            if (!zM13031) {
                throw C10998.m25385("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(strTrim);
                            C14450 c14450M54079 = m54079(new C13780(arrayDeque, bufferedReader), uri.toString());
                            C5792.m13000(bufferedReader);
                            return c14450M54079;
                        }
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        C7074 c7074M54078 = m54078(this.f77651, this.f77652, new C13780(arrayDeque, bufferedReader), uri.toString());
                        C5792.m13000(bufferedReader);
                        return c7074M54078;
                    }
                } else {
                    C5792.m13000(bufferedReader);
                    throw C10998.m25385("Failed to parse the playlist, could not identify any tags.");
                }
            }
        } catch (Throwable th) {
            C5792.m13000(bufferedReader);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0210 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x021c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0225  */
    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:112:0x023a  */
    /* JADX WARN: Code duplicated, block: B:117:0x024b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0250  */
    /* JADX WARN: Code duplicated, block: B:120:0x0253  */
    /* JADX WARN: Code duplicated, block: B:121:0x0258  */
    /* JADX WARN: Code duplicated, block: B:124:0x0262  */
    /* JADX WARN: Code duplicated, block: B:127:0x027b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0286  */
    /* JADX WARN: Code duplicated, block: B:131:0x028b  */
    /* JADX WARN: Code duplicated, block: B:134:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:140:0x030c  */
    /* JADX WARN: Code duplicated, block: B:208:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:284:0x0336 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0240 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0170  */
    /* JADX WARN: Code duplicated, block: B:55:0x0178  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d4  */
    /* JADX WARN: Failed to find 'out' block for switch in B:209:0x04de. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX INFO: renamed from: ֫ */
    public static C14450 m54079(C13780 c13780, String str) throws IOException {
        ?? r7;
        String str2;
        int i;
        String str3;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        C15120 c15120;
        String strM26817;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        String str4;
        C10307 c10307M6672;
        C15120 c15121;
        String strM26818;
        C15120 c15122;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        String strM13017;
        int i6;
        String[] strArrM13028;
        String string;
        StringBuilder sb;
        int length;
        int i7;
        String str7;
        String strM54075;
        int i8;
        int i9;
        String strM54076;
        float f;
        Uri uriM24199;
        ArrayList arrayList5;
        String str8 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        while (true) {
            boolean zM31410 = c13780.m31410();
            String str9 = "application/x-mpegURL";
            Pattern pattern2 = f77584;
            boolean z3 = z2;
            ArrayList arrayList14 = arrayList10;
            Pattern pattern3 = f77590;
            ArrayList arrayList15 = arrayList9;
            String str10 = ",";
            if (!zM31410) {
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = arrayList7;
                ArrayList arrayList18 = arrayList8;
                ArrayList arrayList19 = arrayList13;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (i10 < arrayList6.size()) {
                    C15120 c15123 = (C15120) arrayList6.get(i10);
                    Uri uri = c15123.f43174;
                    C10307 c10307 = c15123.f43173;
                    if (hashSet.add(uri)) {
                        C23877.m52960(c10307.f28526 == null);
                        ArrayList arrayList22 = (ArrayList) map.get(c15123.f43174);
                        arrayList22.getClass();
                        C25079 c25079 = new C25079(new C25179(null, null, arrayList22));
                        C3601 c3601M23918 = c10307.m23918();
                        c3601M23918.m6681(c25079);
                        arrayList21.add(new C15120(c15123.f43174, c3601M23918.m6672(), c15123.f43172, c15123.f43170, c15123.f43175, c15123.f43171));
                    }
                    i10++;
                    hashSet = hashSet;
                    z = z;
                    map = map;
                }
                boolean z4 = z;
                int i11 = 0;
                ArrayList arrayList23 = null;
                C10307 c10308 = null;
                while (i11 < arrayList16.size()) {
                    String str11 = (String) arrayList16.get(i11);
                    String strM54077 = m54076(str11, f77647, map2);
                    String strM54078 = m54076(str11, pattern3, map2);
                    C3601 c3601 = new C3601();
                    Pattern pattern4 = pattern3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strM54077);
                    C10307 c10309 = c10308;
                    sb2.append(":");
                    sb2.append(strM54078);
                    c3601.m6701(sb2.toString());
                    c3601.m6705(strM54078);
                    c3601.m6694(str9);
                    boolean zM54082 = m54082(f77587, str11);
                    if (m54082(f77607, str11)) {
                        r7 = zM54082;
                        r7 = (zM54082 ? 1 : 0) | 2;
                    }
                    r7 = zM54082;
                    int i12 = r7;
                    if (m54082(f77641, str11)) {
                        i12 = (r7 == true ? 1 : 0) | 4;
                    }
                    c3601.m6698(i12);
                    String strM54079 = m54075(str11, f77581, (String) null, map2);
                    if (TextUtils.isEmpty(strM54079)) {
                        i = 0;
                        str2 = str10;
                    } else {
                        String str12 = C5792.f14228;
                        String[] strArrSplit = strM54079.split(str10, -1);
                        int i13 = C5792.m13005("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        str2 = str10;
                        if (C5792.m13005("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i13 |= 4096;
                        }
                        int i14 = C5792.m13005("public.accessibility.describes-music-and-sound", strArrSplit) ? i13 | 1024 : i13;
                        i = C5792.m13005("public.easy-to-read", strArrSplit) ? i14 | 8192 : i14;
                    }
                    c3601.m6686(i);
                    c3601.m6703(m54075(str11, f77650, (String) null, map2));
                    String strM540710 = m54075(str11, pattern2, (String) null, map2);
                    Uri uriM241910 = strM540710 == null ? null : C10486.m24199(str8, strM540710);
                    C25079 c250710 = new C25079(new C25179(strM54077, strM54078, Collections.EMPTY_LIST));
                    switch (m54076(str11, f77600, map2)) {
                        case "SUBTITLES":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList6.size()) {
                                    c15120 = (C15120) arrayList6.get(i15);
                                    if (!strM54077.equals(c15120.f43175)) {
                                        i15++;
                                    }
                                } else {
                                    c15120 = null;
                                }
                            }
                            if (c15120 != null) {
                                String strM13018 = C5792.m13017(3, c15120.f43173.f28533);
                                c3601.m6677(strM13018);
                                strM26817 = C11669.m26817(strM13018);
                            } else {
                                strM26817 = null;
                            }
                            if (strM26817 == null) {
                                strM26817 = "text/vtt";
                            }
                            c3601.m6697(strM26817);
                            c3601.m6681(c250710);
                            if (uriM241910 != null) {
                                C5733 c5733 = new C5733(uriM241910, c3601.m6672(), strM54078);
                                arrayList3 = arrayList15;
                                arrayList3.add(c5733);
                            } else {
                                arrayList3 = arrayList15;
                                C21334.m48351("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            c10307M6672 = c10309;
                            break;
                        case "CLOSED-CAPTIONS":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList4 = arrayList18;
                            arrayList2 = arrayList17;
                            String strM540711 = m54076(str11, f77627, map2);
                            if (strM540711.startsWith("CC")) {
                                i2 = Integer.parseInt(strM540711.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strM540711.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList23 == null) {
                                arrayList23 = new ArrayList();
                            }
                            c3601.m6697(str4);
                            c3601.m6674(i2);
                            arrayList23.add(c3601.m6672());
                            c10307M6672 = c10309;
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList17;
                            int i16 = 0;
                            str3 = str9;
                            while (true) {
                                if (i16 < arrayList6.size()) {
                                    c15121 = (C15120) arrayList6.get(i16);
                                    pattern = pattern2;
                                    if (!strM54077.equals(c15121.f43170)) {
                                        i16++;
                                        pattern2 = pattern;
                                    }
                                } else {
                                    pattern = pattern2;
                                    c15121 = null;
                                }
                            }
                            if (c15121 != null) {
                                String strM13019 = C5792.m13017(1, c15121.f43173.f28533);
                                c3601.m6677(strM13019);
                                strM26818 = C11669.m26817(strM13019);
                            } else {
                                strM26818 = null;
                            }
                            String strM540712 = m54075(str11, f77593, (String) null, map2);
                            if (strM540712 != null) {
                                String str13 = C5792.f14228;
                                c3601.m6704(Integer.parseInt(strM540712.split("/", 2)[0]));
                                if ("audio/eac3".equals(strM26818) && strM540712.endsWith("/JOC")) {
                                    c3601.m6677("ec+3");
                                    strM26818 = "audio/eac3-joc";
                                }
                            }
                            c3601.m6697(strM26818);
                            if (uriM241910 == null) {
                                arrayList4 = arrayList18;
                                if (c15121 != null) {
                                    c10307M6672 = c3601.m6672();
                                    arrayList = arrayList4;
                                    arrayList3 = arrayList15;
                                }
                                break;
                            } else {
                                c3601.m6681(c250710);
                                C5733 c5734 = new C5733(uriM241910, c3601.m6672(), strM54078);
                                arrayList4 = arrayList18;
                                arrayList4.add(c5734);
                            }
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            c10307M6672 = c10309;
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList6.size()) {
                                    c15122 = (C15120) arrayList6.get(i17);
                                    if (!strM54077.equals(c15122.f43172)) {
                                        i17++;
                                    }
                                } else {
                                    c15122 = null;
                                }
                            }
                            if (c15122 != null) {
                                C10307 c103010 = c15122.f43173;
                                String strM130110 = C5792.m13017(2, c103010.f28533);
                                c3601.m6677(strM130110);
                                c3601.m6697(C11669.m26817(strM130110));
                                c3601.m6685(c103010.f28547);
                                c3601.m6689(c103010.f28523);
                                c3601.m6673(c103010.f28510);
                            }
                            if (uriM241910 != null) {
                                c3601.m6681(c250710);
                                arrayList2 = arrayList17;
                                arrayList2.add(new C5733(uriM241910, c3601.m6672(), strM54078));
                                str3 = str9;
                                pattern = pattern2;
                                arrayList3 = arrayList15;
                                arrayList = arrayList18;
                            }
                            c10307M6672 = c10309;
                        default:
                            str3 = str9;
                            pattern = pattern2;
                            arrayList3 = arrayList15;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            c10307M6672 = c10309;
                            break;
                    }
                    i11++;
                    arrayList15 = arrayList3;
                    arrayList17 = arrayList2;
                    arrayList18 = arrayList;
                    pattern3 = pattern4;
                    str10 = str2;
                    str9 = str3;
                    pattern2 = pattern;
                    c10308 = c10307M6672;
                    str8 = str;
                }
                return new C14450(str, arrayList19, arrayList21, arrayList17, arrayList18, arrayList15, arrayList14, c10308, z4 ? Collections.EMPTY_LIST : arrayList23, z3, map2, arrayList20);
            }
            String strM31411 = c13780.m31411();
            ArrayList arrayList24 = arrayList8;
            if (strM31411.startsWith("#EXT")) {
                arrayList13.add(strM31411);
            }
            boolean zStartsWith = strM31411.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList13;
            if (strM31411.startsWith("#EXT-X-DEFINE")) {
                map2.put(m54076(strM31411, pattern3, map2), m54076(strM31411, f77610, map2));
            } else {
                if (strM31411.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                    arrayList11 = arrayList11;
                    arrayList7 = arrayList7;
                    arrayList12 = arrayList12;
                } else if (strM31411.startsWith("#EXT-X-MEDIA")) {
                    arrayList11.add(strM31411);
                } else if (strM31411.startsWith("#EXT-X-SESSION-KEY")) {
                    C20366 c20366M54080 = m54080(strM31411, m54075(strM31411, f77630, "identity", map2), map2);
                    if (c20366M54080 != null) {
                        String strM540713 = m54076(strM31411, f77586, map2);
                        arrayList12.add(new C21037(("SAMPLE-AES-CENC".equals(strM540713) || "SAMPLE-AES-CTR".equals(strM540713)) ? "cenc" : "cbcs", c20366M54080));
                    }
                } else {
                    if (strM31411.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z | strM31411.contains("CLOSED-CAPTIONS=NONE");
                        int i18 = zStartsWith ? 16384 : 0;
                        int i19 = Integer.parseInt(m54076(strM31411, f77603, Collections.EMPTY_MAP));
                        Matcher matcher = f77605.matcher(strM31411);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strM540714 = m54075(strM31411, f77621, (String) null, map2);
                        String strM540715 = m54075(strM31411, f77645, (String) null, map2);
                        HashMap map3 = map;
                        String strM540716 = m54075(strM31411, f77608, (String) null, map2);
                        if (strM540716 != null) {
                            String str14 = C5792.f14228;
                            i4 = i18;
                            String[] strArrSplit2 = strM540716.split(",", 2)[0].split("/", -1);
                            str5 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str6 = strArrSplit2[1];
                                i5 = 2;
                            }
                            strM13017 = C5792.m13017(i5, strM540715);
                            int i20 = C11669.f32550;
                            if (strM13017 == null) {
                                i6 = i19;
                            } else {
                                if (strM13017.startsWith("dvhe")) {
                                    i6 = i19;
                                } else {
                                    i6 = i19;
                                    if (!strM13017.startsWith("dvh1") || (str5 != null && ((str5.startsWith("dvhe") && strM13017.startsWith("hev1")) || ((str5.startsWith("dvh1") && strM13017.startsWith("hvc1")) || ((str5.startsWith("dvav") && strM13017.startsWith("avc3")) || ((str5.startsWith("dva1") && strM13017.startsWith("avc1")) || (str5.startsWith("dav1") && strM13017.startsWith("av01")))))))) {
                                    }
                                }
                                if (str5 != null || (strM540714 != null && str6 != null && ((!strM540714.equals("PQ") || str6.equals("db1p")) && ((!strM540714.equals("SDR") || str6.equals("db2g")) && (!strM540714.equals("HLG") || str6.startsWith("db4")))))) {
                                    if (str5 == null) {
                                        str5 = strM13017;
                                    }
                                    strArrM13028 = C5792.m13028(strM540715);
                                    if (strArrM13028.length == 0) {
                                        string = null;
                                    } else {
                                        sb = new StringBuilder();
                                        length = strArrM13028.length;
                                        i7 = 0;
                                        while (i7 < length) {
                                            str7 = strArrM13028[i7];
                                            String[] strArr = strArrM13028;
                                            if (2 != C11669.m26822(C11669.m26817(str7))) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(str7);
                                            }
                                            i7++;
                                            strArrM13028 = strArr;
                                        }
                                        if (sb.length() > 0) {
                                            string = sb.toString();
                                        } else {
                                            string = null;
                                        }
                                    }
                                    if (string != null) {
                                        strM540715 = C24104.m53357(str5, ",", string);
                                    } else {
                                        strM540715 = str5;
                                    }
                                }
                            }
                            strM54075 = m54075(strM31411, f77644, (String) null, map2);
                            if (strM54075 != null) {
                                String[] strArrSplit3 = strM54075.split("x", -1);
                                i9 = Integer.parseInt(strArrSplit3[0]);
                                i8 = Integer.parseInt(strArrSplit3[1]);
                                if (i9 > 0 || i8 <= 0) {
                                    i8 = -1;
                                    i9 = -1;
                                }
                            } else {
                                i8 = -1;
                                i9 = -1;
                            }
                            strM54076 = m54075(strM31411, f77595, (String) null, map2);
                            if (strM54076 != null) {
                                f = Float.parseFloat(strM54076);
                            } else {
                                f = -1.0f;
                            }
                            String strM540717 = m54075(strM31411, f77631, (String) null, map2);
                            String strM540718 = m54075(strM31411, f77597, (String) null, map2);
                            String strM540719 = m54075(strM31411, f77614, (String) null, map2);
                            String strM540720 = m54075(strM31411, f77643, (String) null, map2);
                            if (zStartsWith) {
                                uriM24199 = C10486.m24199(str8, m54076(strM31411, pattern2, map2));
                            } else {
                                if (c13780.m31410()) {
                                    throw C10998.m25385("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriM24199 = C10486.m24199(str8, m54074(c13780.m31411(), map2));
                            }
                            C3601 c3602 = new C3601();
                            c3602.m6699(arrayList6.size());
                            c3602.m6694("application/x-mpegURL");
                            c3602.m6677(strM540715);
                            c3602.m6700(i3);
                            int i21 = i6;
                            c3602.m6670(i21);
                            c3602.m6685(i9);
                            c3602.m6689(i8);
                            c3602.m6673(f);
                            c3602.m6686(i4);
                            arrayList6.add(new C15120(uriM24199, c3602.m6672(), strM540717, strM540718, strM540719, strM540720));
                            map = map3;
                            arrayList5 = (ArrayList) map.get(uriM24199);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                map.put(uriM24199, arrayList5);
                            }
                            arrayList5.add(new C16461(i3, i21, strM540717, strM540718, strM540719, strM540720));
                            z = zContains;
                        } else {
                            i4 = i18;
                            str5 = null;
                        }
                        i5 = 2;
                        str6 = null;
                        strM13017 = C5792.m13017(i5, strM540715);
                        int i22 = C11669.f32550;
                        if (strM13017 == null) {
                            i6 = i19;
                        } else {
                            if (strM13017.startsWith("dvhe")) {
                                i6 = i19;
                                if (!strM13017.startsWith("dvh1")) {
                                }
                            } else {
                                i6 = i19;
                            }
                            if (str5 != null) {
                                if (str5 == null) {
                                    str5 = strM13017;
                                }
                                strArrM13028 = C5792.m13028(strM540715);
                                if (strArrM13028.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM13028.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM13028[i7];
                                        String[] strArr2 = strArrM13028;
                                        if (2 != C11669.m26822(C11669.m26817(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM13028 = strArr2;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM540715 = C24104.m53357(str5, ",", string);
                                } else {
                                    strM540715 = str5;
                                }
                            } else {
                                if (str5 == null) {
                                    str5 = strM13017;
                                }
                                strArrM13028 = C5792.m13028(strM540715);
                                if (strArrM13028.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM13028.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM13028[i7];
                                        String[] strArr3 = strArrM13028;
                                        if (2 != C11669.m26822(C11669.m26817(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM13028 = strArr3;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM540715 = C24104.m53357(str5, ",", string);
                                } else {
                                    strM540715 = str5;
                                }
                            }
                        }
                        strM54075 = m54075(strM31411, f77644, (String) null, map2);
                        if (strM54075 != null) {
                            String[] strArrSplit4 = strM54075.split("x", -1);
                            i9 = Integer.parseInt(strArrSplit4[0]);
                            i8 = Integer.parseInt(strArrSplit4[1]);
                            if (i9 > 0) {
                                i8 = -1;
                                i9 = -1;
                            } else {
                                i8 = -1;
                                i9 = -1;
                            }
                        } else {
                            i8 = -1;
                            i9 = -1;
                        }
                        strM54076 = m54075(strM31411, f77595, (String) null, map2);
                        if (strM54076 != null) {
                            f = Float.parseFloat(strM54076);
                        } else {
                            f = -1.0f;
                        }
                        String strM5407110 = m54075(strM31411, f77631, (String) null, map2);
                        String strM5407111 = m54075(strM31411, f77597, (String) null, map2);
                        String strM5407112 = m54075(strM31411, f77614, (String) null, map2);
                        String strM540721 = m54075(strM31411, f77643, (String) null, map2);
                        if (zStartsWith) {
                            uriM24199 = C10486.m24199(str8, m54076(strM31411, pattern2, map2));
                        } else {
                            if (c13780.m31410()) {
                                throw C10998.m25385("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM24199 = C10486.m24199(str8, m54074(c13780.m31411(), map2));
                        }
                        C3601 c3603 = new C3601();
                        c3603.m6699(arrayList6.size());
                        c3603.m6694("application/x-mpegURL");
                        c3603.m6677(strM540715);
                        c3603.m6700(i3);
                        int i23 = i6;
                        c3603.m6670(i23);
                        c3603.m6685(i9);
                        c3603.m6689(i8);
                        c3603.m6673(f);
                        c3603.m6686(i4);
                        arrayList6.add(new C15120(uriM24199, c3603.m6672(), strM5407110, strM5407111, strM5407112, strM540721));
                        map = map3;
                        arrayList5 = (ArrayList) map.get(uriM24199);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            map.put(uriM24199, arrayList5);
                        }
                        arrayList5.add(new C16461(i3, i23, strM5407110, strM5407111, strM5407112, strM540721));
                        z = zContains;
                    }
                    z2 = z3;
                }
                arrayList10 = arrayList14;
                arrayList9 = arrayList15;
                arrayList8 = arrayList24;
                arrayList13 = arrayList25;
                arrayList12 = arrayList12;
                arrayList7 = arrayList7;
                arrayList11 = arrayList11;
            }
            arrayList12 = arrayList12;
            z2 = z3;
            arrayList10 = arrayList14;
            arrayList9 = arrayList15;
            arrayList8 = arrayList24;
            arrayList13 = arrayList25;
            arrayList12 = arrayList12;
            arrayList7 = arrayList7;
            arrayList11 = arrayList11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:205:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:212:0x0608  */
    /* JADX WARN: Code duplicated, block: B:214:0x060c  */
    /* JADX WARN: Code duplicated, block: B:215:0x060f  */
    /* JADX WARN: Code duplicated, block: B:232:0x066d  */
    /* JADX WARN: Code duplicated, block: B:235:0x067d  */
    /* JADX WARN: Code duplicated, block: B:237:0x068f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0696  */
    /* JADX WARN: Code duplicated, block: B:241:0x069c  */
    /* JADX WARN: Code duplicated, block: B:247:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:251:0x06e2  */
    /* JADX WARN: Code duplicated, block: B:293:0x07bf A[PHI: r45
      0x07bf: PHI (r45v18 int) = (r45v14 int), (r45v15 int), (r45v16 int), (r45v19 int) binds: [B:290:0x07ba, B:286:0x07ad, B:282:0x07a0, B:280:0x0795] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:359:0x0909  */
    /* JADX WARN: Code duplicated, block: B:402:0x09b1 A[PHI: r58
      0x09b1: PHI (r58v11 java.util.regex.Matcher) = 
      (r58v1 java.util.regex.Matcher)
      (r58v2 java.util.regex.Matcher)
      (r58v3 java.util.regex.Matcher)
      (r58v4 java.util.regex.Matcher)
      (r58v5 java.util.regex.Matcher)
      (r58v6 java.util.regex.Matcher)
      (r58v7 java.util.regex.Matcher)
      (r58v8 java.util.regex.Matcher)
      (r58v9 java.util.regex.Matcher)
      (r58v12 java.util.regex.Matcher)
     binds: [B:399:0x09ac, B:395:0x099f, B:391:0x0992, B:387:0x0985, B:383:0x0978, B:379:0x096b, B:375:0x095e, B:371:0x094f, B:367:0x093f, B:365:0x0933] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static C7074 m54078(C14450 c14450, C7074 c7074, C13780 c13780, String str) throws C10998, C8415 {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList4;
        int i;
        String str2;
        AbstractC16192 abstractC16192;
        TreeMap treeMap2;
        String strM54075;
        String str3;
        String strM54076;
        int i2;
        String hexString;
        String str4;
        String str5;
        long j;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str6;
        String str7;
        String str8;
        Matcher matcher;
        byte b;
        C3050 c3050;
        int i3;
        byte b2;
        String hexString2;
        String str9;
        boolean z;
        String strM54077;
        long j2;
        C20366[] c20366Arr;
        String[] strArrSplit;
        boolean z2 = c14450.f34778;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C21827 c21827 = new C21827(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap3 = new TreeMap();
        String str10 = "";
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean zM54082 = false;
        c7074 = c7074;
        C14450 c14451 = c14450;
        boolean z4 = z2;
        ArrayList arrayList11 = arrayList8;
        C21827 c21828 = c21827;
        String strM54078 = "";
        long j3 = -1;
        C10427 c10427 = null;
        String str11 = null;
        C21037 c21037M54081 = null;
        C21037 c21037 = null;
        C23168 c23168 = null;
        String str12 = null;
        int i6 = 1;
        long j4 = -9223372036854775807L;
        long j5 = 0;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        long j8 = 0;
        boolean z5 = false;
        char c = 0;
        long j9 = 0;
        long j10 = 0;
        boolean z6 = false;
        int i7 = 0;
        boolean z7 = false;
        long j11 = 0;
        long jLongValue = 0;
        long j12 = 0;
        String str13 = null;
        long jM12990 = 0;
        while (c13780.m31410()) {
            String strM31411 = c13780.m31411();
            if (strM31411.startsWith("#EXT")) {
                arrayList10.add(strM31411);
            }
            if (strM31411.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM54079 = m54076(strM31411, f77594, map);
                if ("VOD".equals(strM54079)) {
                    i4 = 1;
                } else if ("EVENT".equals(strM54079)) {
                    i4 = 2;
                }
            } else if (strM31411.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strM31411.startsWith("#EXT-X-START")) {
                    i6 = i6;
                    long j13 = (long) (Double.parseDouble(m54076(strM31411, f77618, Collections.EMPTY_MAP)) * 1000000.0d);
                    zM54082 = m54082(f77602, strM31411);
                    j4 = j13;
                    linkedHashMap = linkedHashMap3;
                    arrayList10 = arrayList10;
                } else {
                    i6 = i6;
                    if (strM31411.startsWith("#EXT-X-SERVER-CONTROL")) {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        double dM54073 = m54073(strM31411, f77579, -9.223372036854776E18d);
                        long j14 = dM54073 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM54073 * 1000000.0d);
                        boolean zM54083 = m54082(f77637, strM31411);
                        double dM54074 = m54073(strM31411, f77617, -9.223372036854776E18d);
                        long j15 = dM54074 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM54074 * 1000000.0d);
                        double dM54075 = m54073(strM31411, f77636, -9.223372036854776E18d);
                        c21828 = new C21827(j14, zM54083, j15, dM54075 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM54075 * 1000000.0d), m54082(f77635, strM31411));
                    } else {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        if (strM31411.startsWith("#EXT-X-PART-INF")) {
                            j7 = (long) (Double.parseDouble(m54076(strM31411, f77638, Collections.EMPTY_MAP)) * 1000000.0d);
                        } else {
                            boolean zStartsWith = strM31411.startsWith("#EXT-X-MAP");
                            Pattern pattern = f77629;
                            linkedHashMap3 = linkedHashMap;
                            Pattern pattern2 = f77584;
                            if (zStartsWith) {
                                String strM540710 = m54076(strM31411, pattern2, map);
                                String strM540711 = m54075(strM31411, pattern, (String) null, map);
                                if (strM540711 != null) {
                                    String str14 = C5792.f14228;
                                    String[] strArrSplit2 = strM540711.split("@", -1);
                                    j3 = Long.parseLong(strArrSplit2[c]);
                                    if (strArrSplit2.length > 1) {
                                        j8 = Long.parseLong(strArrSplit2[1]);
                                    }
                                }
                                long j16 = j3;
                                long j17 = j16 == -1 ? 0L : j8;
                                if (str12 != null && str13 == null) {
                                    throw C10998.m25385("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                                }
                                C23168 c23169 = new C23168(strM540710, j17, j16, str12, str13);
                                if (j16 != -1) {
                                    j17 += j16;
                                }
                                j8 = j17;
                                arrayList10 = arrayList10;
                                c23168 = c23169;
                                j3 = -1;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                            } else {
                                map2 = map2;
                                C10427 c10428 = c10427;
                                if (strM31411.startsWith("#EXT-X-TARGETDURATION")) {
                                    j6 = ((long) Integer.parseInt(m54076(strM31411, f77596, Collections.EMPTY_MAP))) * 1000000;
                                } else if (strM31411.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                    j5 = Long.parseLong(m54076(strM31411, f77604, Collections.EMPTY_MAP));
                                    j10 = j5;
                                    treeMap3 = treeMap3;
                                    str11 = str11;
                                    arrayList10 = arrayList10;
                                    treeMap3 = treeMap3;
                                    map2 = map2;
                                    linkedHashMap3 = linkedHashMap3;
                                    i6 = i6;
                                    c10427 = c10428;
                                    c14451 = c14451;
                                } else if (strM31411.startsWith("#EXT-X-VERSION")) {
                                    i6 = Integer.parseInt(m54076(strM31411, f77634, Collections.EMPTY_MAP));
                                } else {
                                    if (strM31411.startsWith("#EXT-X-DEFINE")) {
                                        String strM540712 = m54075(strM31411, f77583, (String) null, map);
                                        if (strM540712 != null) {
                                            String str15 = (String) c14451.f41284.get(strM540712);
                                            if (str15 != null) {
                                                map.put(strM540712, str15);
                                            }
                                        } else {
                                            map.put(m54076(strM31411, f77590, map), m54076(strM31411, f77610, map));
                                        }
                                        str11 = str11;
                                        treeMap3 = treeMap3;
                                    } else if (strM31411.startsWith("#EXTINF")) {
                                        jLongValue = new BigDecimal(m54076(strM31411, f77606, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                        strM54078 = m54075(strM31411, f77625, str10, map);
                                    } else {
                                        if (strM31411.startsWith("#EXT-X-SKIP")) {
                                            int i8 = Integer.parseInt(m54076(strM31411, f77592, Collections.EMPTY_MAP));
                                            C23877.m52960(c7074 != null && arrayList7.isEmpty());
                                            String str16 = C5792.f14228;
                                            long j18 = c7074.f18434;
                                            AbstractC16192 abstractC16193 = c7074.f18427;
                                            int i9 = (int) (j5 - j18);
                                            int i10 = i8 + i9;
                                            if (i9 < 0 || i10 > abstractC16193.size()) {
                                                throw new C8415();
                                            }
                                            while (i9 < i10) {
                                                C23168 c231610 = (C23168) abstractC16193.get(i9);
                                                if (j5 != c7074.f18434) {
                                                    int i11 = (c7074.f18440 - i5) + c231610.f75741;
                                                    AbstractC16192 abstractC16194 = c231610.f72778;
                                                    ArrayList arrayList12 = new ArrayList();
                                                    long j19 = j11;
                                                    int i12 = 0;
                                                    while (i12 < abstractC16194.size()) {
                                                        C10427 c10429 = (C10427) abstractC16194.get(i12);
                                                        arrayList12.add(new C10427(c10429.f75749, c10429.f75742, c10429.f75740, i11, j19, c10429.f75746, c10429.f75745, c10429.f75739, c10429.f75748, c10429.f75747, c10429.f75744, c10429.f28832, c10429.f28831));
                                                        j19 += c10429.f75740;
                                                        i12++;
                                                        treeMap3 = treeMap3;
                                                        i10 = i10;
                                                        abstractC16193 = abstractC16193;
                                                        str11 = str11;
                                                    }
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC16192 = abstractC16193;
                                                    treeMap2 = treeMap3;
                                                    c231610 = new C23168(c231610.f75749, c231610.f75742, c231610.f72777, c231610.f75740, i11, j11, c231610.f75746, c231610.f75745, c231610.f75739, c231610.f75748, c231610.f75747, c231610.f75744, arrayList12);
                                                } else {
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC16192 = abstractC16193;
                                                    treeMap2 = treeMap3;
                                                }
                                                arrayList7.add(c231610);
                                                long j20 = c231610.f75740;
                                                String str17 = c231610.f75739;
                                                j11 += j20;
                                                long j21 = c231610.f75747;
                                                if (j21 != -1) {
                                                    j8 = c231610.f75748 + j21;
                                                }
                                                int i13 = c231610.f75741;
                                                C23168 c231611 = c231610.f75742;
                                                C21037 c21038 = c231610.f75746;
                                                String str18 = c231610.f75745;
                                                if (str17 == null || !str17.equals(Long.toHexString(j10))) {
                                                    str13 = str17;
                                                }
                                                j10++;
                                                i9++;
                                                c7074 = c7074;
                                                i7 = i13;
                                                c23168 = c231611;
                                                str12 = str18;
                                                c21037 = c21038;
                                                treeMap3 = treeMap2;
                                                i10 = i;
                                                abstractC16193 = abstractC16192;
                                                j9 = j11;
                                                str11 = str2;
                                            }
                                            c14451 = c14450;
                                            arrayList10 = arrayList10;
                                            map2 = map2;
                                            linkedHashMap3 = linkedHashMap3;
                                        } else {
                                            str11 = str11;
                                            treeMap3 = treeMap3;
                                            if (strM31411.startsWith("#EXT-X-KEY")) {
                                                String strM540713 = m54076(strM31411, f77586, map);
                                                String strM540714 = m54075(strM31411, f77630, "identity", map);
                                                if ("NONE".equals(strM540713)) {
                                                    treeMap3.clear();
                                                    str3 = null;
                                                    str11 = str11;
                                                } else {
                                                    strM54075 = m54075(strM31411, f77633, (String) null, map);
                                                    if ("identity".equals(strM540714)) {
                                                        if ("AES-128".equals(strM540713)) {
                                                            strM54076 = m54076(strM31411, pattern2, map);
                                                            str11 = str11;
                                                        } else {
                                                            str11 = str11;
                                                        }
                                                        c7074 = c7074;
                                                        str12 = strM54076;
                                                        str13 = strM54075;
                                                        c14451 = c14450;
                                                        arrayList10 = arrayList10;
                                                        treeMap3 = treeMap3;
                                                        map2 = map2;
                                                        linkedHashMap3 = linkedHashMap3;
                                                        i6 = i6;
                                                        c10427 = c10428;
                                                        c14451 = c14451;
                                                    } else {
                                                        str11 = str11 == null ? ("SAMPLE-AES-CENC".equals(strM540713) || "SAMPLE-AES-CTR".equals(strM540713)) ? "cenc" : "cbcs" : str11;
                                                        C20366 c20366M54080 = m54080(strM31411, strM540714, map);
                                                        if (c20366M54080 != null) {
                                                            treeMap3.put(strM540714, c20366M54080);
                                                            str3 = strM54075;
                                                        }
                                                    }
                                                    strM54076 = null;
                                                    c7074 = c7074;
                                                    str12 = strM54076;
                                                    str13 = strM54075;
                                                    c14451 = c14450;
                                                    arrayList10 = arrayList10;
                                                    treeMap3 = treeMap3;
                                                    map2 = map2;
                                                    linkedHashMap3 = linkedHashMap3;
                                                    i6 = i6;
                                                    c10427 = c10428;
                                                    c14451 = c14451;
                                                }
                                                c21037 = null;
                                                strM54075 = str3;
                                                strM54076 = null;
                                                c7074 = c7074;
                                                str12 = strM54076;
                                                str13 = strM54075;
                                                c14451 = c14450;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c10427 = c10428;
                                                c14451 = c14451;
                                            } else {
                                                if (strM31411.startsWith("#EXT-X-BYTERANGE")) {
                                                    String strM540715 = m54076(strM31411, f77624, map);
                                                    String str19 = C5792.f14228;
                                                    String[] strArrSplit3 = strM540715.split("@", -1);
                                                    j3 = Long.parseLong(strArrSplit3[c]);
                                                    if (strArrSplit3.length > 1) {
                                                        j8 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    if (strM31411.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                        i5 = Integer.parseInt(strM31411.substring(strM31411.indexOf(58) + 1));
                                                        z3 = true;
                                                    } else if (strM31411.equals("#EXT-X-DISCONTINUITY")) {
                                                        i7++;
                                                    } else {
                                                        if (strM31411.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                            if (jM12990 == 0) {
                                                                jM12990 = C5792.m12990(C5792.m13030(strM31411.substring(strM31411.indexOf(58) + 1))) - j11;
                                                            }
                                                        } else if (strM31411.equals("#EXT-X-GAP")) {
                                                            z6 = true;
                                                        } else if (strM31411.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                            z4 = true;
                                                        } else {
                                                            if (strM31411.equals("#EXT-X-ENDLIST")) {
                                                                z5 = true;
                                                            } else {
                                                                if (strM31411.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                                    long jM54083 = m54083(f77598, strM31411);
                                                                    Matcher matcher2 = f77642.matcher(strM31411);
                                                                    if (matcher2.find()) {
                                                                        String strGroup = matcher2.group(1);
                                                                        strGroup.getClass();
                                                                        i2 = Integer.parseInt(strGroup);
                                                                    } else {
                                                                        i2 = -1;
                                                                    }
                                                                    arrayList9.add(new C17131(Uri.parse(C10486.m24196(str, m54076(strM31411, pattern2, map))), jM54083, i2));
                                                                } else {
                                                                    if (!strM31411.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                                        str5 = str11;
                                                                        if (strM31411.startsWith("#EXT-X-PART")) {
                                                                            if (str12 == null) {
                                                                                hexString2 = null;
                                                                            } else {
                                                                                if (str13 != null) {
                                                                                    str9 = str13;
                                                                                } else {
                                                                                    hexString2 = Long.toHexString(j10);
                                                                                }
                                                                                String strM540716 = m54076(strM31411, pattern2, map);
                                                                                long j22 = (long) (Double.parseDouble(m54076(strM31411, f77619, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                                boolean zM54084 = m54082(f77609, strM31411);
                                                                                if (z4 || !arrayList11.isEmpty()) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                boolean z8 = zM54084 | z;
                                                                                boolean zM54085 = m54082(f77611, strM31411);
                                                                                strM54077 = m54075(strM31411, pattern, (String) null, map);
                                                                                if (strM54077 != null) {
                                                                                    String str20 = C5792.f14228;
                                                                                    strArrSplit = strM54077.split("@", -1);
                                                                                    j2 = Long.parseLong(strArrSplit[0]);
                                                                                    if (strArrSplit.length > 1) {
                                                                                        j12 = Long.parseLong(strArrSplit[1]);
                                                                                    }
                                                                                } else {
                                                                                    j2 = -1;
                                                                                }
                                                                                if (j2 == -1) {
                                                                                    j12 = 0;
                                                                                }
                                                                                if (c21037 == null && !treeMap3.isEmpty()) {
                                                                                    c20366Arr = (C20366[]) treeMap3.values().toArray(new C20366[0]);
                                                                                    C21037 c21039 = new C21037(str5, c20366Arr);
                                                                                    if (c21037M54081 == null) {
                                                                                        c21037M54081 = m54081(str5, c20366Arr);
                                                                                    }
                                                                                    c21037 = c21039;
                                                                                }
                                                                                arrayList5 = arrayList11;
                                                                                arrayList5.add(new C10427(strM540716, c23168, j22, i7, j9, c21037, str12, str9, j12, j2, zM54085, z8, false));
                                                                                j9 += j22;
                                                                                if (j2 != -1) {
                                                                                    j12 += j2;
                                                                                }
                                                                                c10427 = c10428;
                                                                            }
                                                                            str9 = hexString2;
                                                                            String strM540717 = m54076(strM31411, pattern2, map);
                                                                            long j23 = (long) (Double.parseDouble(m54076(strM31411, f77619, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                            boolean zM54086 = m54082(f77609, strM31411);
                                                                            if (z4) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            boolean z9 = zM54086 | z;
                                                                            boolean zM54087 = m54082(f77611, strM31411);
                                                                            strM54077 = m54075(strM31411, pattern, (String) null, map);
                                                                            if (strM54077 != null) {
                                                                                String str21 = C5792.f14228;
                                                                                strArrSplit = strM54077.split("@", -1);
                                                                                j2 = Long.parseLong(strArrSplit[0]);
                                                                                if (strArrSplit.length > 1) {
                                                                                    j12 = Long.parseLong(strArrSplit[1]);
                                                                                }
                                                                            } else {
                                                                                j2 = -1;
                                                                            }
                                                                            if (j2 == -1) {
                                                                                j12 = 0;
                                                                            }
                                                                            if (c21037 == null) {
                                                                                c20366Arr = (C20366[]) treeMap3.values().toArray(new C20366[0]);
                                                                                C21037 c210310 = new C21037(str5, c20366Arr);
                                                                                if (c21037M54081 == null) {
                                                                                    c21037M54081 = m54081(str5, c20366Arr);
                                                                                }
                                                                                c21037 = c210310;
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                            arrayList5.add(new C10427(strM540717, c23168, j23, i7, j9, c21037, str12, str9, j12, j2, zM54087, z9, false));
                                                                            j9 += j23;
                                                                            if (j2 != -1) {
                                                                                j12 += j2;
                                                                            }
                                                                            c10427 = c10428;
                                                                        } else {
                                                                            ArrayList arrayList13 = arrayList11;
                                                                            if (strM31411.startsWith("#EXT-X-DATERANGE") && m54075(strM31411, f77601, str10, map).equals("com.apple.hls.interstitial")) {
                                                                                String strM540718 = m54076(strM31411, f77599, map);
                                                                                String strM540719 = m54075(strM31411, f77632, (String) null, map);
                                                                                Uri uri = strM540719 != null ? Uri.parse(strM540719) : null;
                                                                                String strM540720 = m54075(strM31411, f77626, (String) null, map);
                                                                                Uri uri2 = strM540720 != null ? Uri.parse(strM540720) : null;
                                                                                String strM540721 = m54075(strM31411, f77616, (String) null, map);
                                                                                long jM12991 = strM540721 != null ? C5792.m12990(C5792.m13030(strM540721)) : -9223372036854775807L;
                                                                                String strM540722 = m54075(strM31411, f77615, (String) null, map);
                                                                                long jM12992 = strM540722 != null ? C5792.m12990(C5792.m13030(strM540722)) : -9223372036854775807L;
                                                                                ArrayList arrayList14 = new ArrayList();
                                                                                String strM540723 = m54075(strM31411, f77591, (String) null, map);
                                                                                if (strM540723 != null) {
                                                                                    String str22 = C5792.f14228;
                                                                                    String[] strArrSplit4 = strM540723.split(",", -1);
                                                                                    int length = strArrSplit4.length;
                                                                                    int i14 = 0;
                                                                                    while (i14 < length) {
                                                                                        String[] strArr = strArrSplit4;
                                                                                        String strTrim = strArrSplit4[i14].trim();
                                                                                        strTrim.getClass();
                                                                                        switch (strTrim.hashCode()) {
                                                                                            case 79491:
                                                                                                i3 = length;
                                                                                                if (!strTrim.equals("PRE")) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 0;
                                                                                                }
                                                                                                break;
                                                                                            case 2430593:
                                                                                                i3 = length;
                                                                                                if (!strTrim.equals("ONCE")) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 1;
                                                                                                }
                                                                                                break;
                                                                                            case 2461856:
                                                                                                i3 = length;
                                                                                                if (!strTrim.equals("POST")) {
                                                                                                    b2 = -1;
                                                                                                } else {
                                                                                                    b2 = 2;
                                                                                                }
                                                                                                break;
                                                                                            default:
                                                                                                i3 = length;
                                                                                                b2 = -1;
                                                                                                break;
                                                                                        }
                                                                                        switch (b2) {
                                                                                            case 0:
                                                                                            case 1:
                                                                                            case 2:
                                                                                                arrayList14.add(strTrim);
                                                                                                break;
                                                                                        }
                                                                                        i14++;
                                                                                        length = i3;
                                                                                        strArrSplit4 = strArr;
                                                                                    }
                                                                                }
                                                                                arrayList6 = arrayList7;
                                                                                double dM54076 = m54073(strM31411, f77649, -1.0d);
                                                                                long j24 = dM54076 >= 0.0d ? (long) (dM54076 * 1000000.0d) : -9223372036854775807L;
                                                                                str11 = str5;
                                                                                double dM54077 = m54073(strM31411, f77580, -1.0d);
                                                                                long j25 = dM54077 >= 0.0d ? (long) (dM54077 * 1000000.0d) : -9223372036854775807L;
                                                                                boolean zM54088 = m54082(f77613, strM31411);
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                double dM54078 = m54073(strM31411, f77640, Double.MIN_VALUE);
                                                                                long j26 = dM54078 != Double.MIN_VALUE ? (long) (dM54078 * 1000000.0d) : -9223372036854775807L;
                                                                                double dM54079 = m54073(strM31411, f77582, -1.0d);
                                                                                long j27 = dM54079 >= 0.0d ? (long) (dM54079 * 1000000.0d) : -9223372036854775807L;
                                                                                ArrayList arrayList15 = new ArrayList();
                                                                                arrayList4 = arrayList13;
                                                                                treeMap = treeMap3;
                                                                                String strM540724 = m54075(strM31411, f77588, (String) null, map);
                                                                                if (strM540724 != null) {
                                                                                    String str23 = C5792.f14228;
                                                                                    String[] strArrSplit5 = strM540724.split(",", -1);
                                                                                    int length2 = strArrSplit5.length;
                                                                                    int i15 = 0;
                                                                                    while (i15 < length2) {
                                                                                        String strTrim2 = strArrSplit5[i15].trim();
                                                                                        strTrim2.getClass();
                                                                                        String[] strArr2 = strArrSplit5;
                                                                                        if (strTrim2.equals("IN") || strTrim2.equals("OUT")) {
                                                                                            arrayList15.add(strTrim2);
                                                                                        }
                                                                                        i15++;
                                                                                        strArrSplit5 = strArr2;
                                                                                    }
                                                                                }
                                                                                ArrayList arrayList16 = new ArrayList();
                                                                                String strM540725 = m54075(strM31411, f77646, (String) null, map);
                                                                                if (strM540725 != null) {
                                                                                    String str24 = C5792.f14228;
                                                                                    String[] strArrSplit6 = strM540725.split(",", -1);
                                                                                    int length3 = strArrSplit6.length;
                                                                                    int i16 = 0;
                                                                                    while (i16 < length3) {
                                                                                        String strTrim3 = strArrSplit6[i16].trim();
                                                                                        strTrim3.getClass();
                                                                                        String[] strArr3 = strArrSplit6;
                                                                                        if (strTrim3.equals("JUMP") || strTrim3.equals("SKIP")) {
                                                                                            arrayList16.add(strTrim3);
                                                                                        }
                                                                                        i16++;
                                                                                        strArrSplit6 = strArr3;
                                                                                    }
                                                                                }
                                                                                String strM540726 = m54075(strM31411, f77639, (String) null, map);
                                                                                Boolean boolValueOf = strM540726 != null ? Boolean.valueOf(!strM540726.equals("NO")) : null;
                                                                                String strM540727 = m54075(strM31411, f77612, (String) null, map);
                                                                                if (strM540727 != null) {
                                                                                    str7 = "RANGE";
                                                                                    if (!strM540727.equals("RANGE")) {
                                                                                        str7 = "POINT";
                                                                                        if (!strM540727.equals("POINT")) {
                                                                                            str7 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str7 = null;
                                                                                }
                                                                                String strM540728 = m54075(strM31411, f77648, (String) null, map);
                                                                                if (strM540728 != null) {
                                                                                    str8 = "PRIMARY";
                                                                                    if (!strM540728.equals("PRIMARY")) {
                                                                                        str8 = "HIGHLIGHT";
                                                                                        if (!strM540728.equals("HIGHLIGHT")) {
                                                                                            str8 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str8 = null;
                                                                                }
                                                                                ArrayList arrayList17 = new ArrayList();
                                                                                String str25 = str8;
                                                                                String strSubstring = strM31411.substring(17);
                                                                                Matcher matcher3 = f77622.matcher(strSubstring);
                                                                                while (matcher3.find()) {
                                                                                    String str26 = str7;
                                                                                    String strGroup2 = matcher3.group();
                                                                                    strGroup2.getClass();
                                                                                    switch (strGroup2.hashCode()) {
                                                                                        case -2136701954:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-SNAP=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 0;
                                                                                            }
                                                                                            break;
                                                                                        case -1843050726:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-CONTENT-MAY-VARY=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 1;
                                                                                            }
                                                                                            break;
                                                                                        case -148960310:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-PLAYOUT-LIMIT=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 2;
                                                                                            }
                                                                                            break;
                                                                                        case -36345757:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-TIMELINE-STYLE=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 3;
                                                                                            }
                                                                                            break;
                                                                                        case 397239341:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-ASSET-LIST=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 4;
                                                                                            }
                                                                                            break;
                                                                                        case 850193465:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-TIMELINE-OCCUPIES=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 5;
                                                                                            }
                                                                                            break;
                                                                                        case 1472528844:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-RESTRICT=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 6;
                                                                                            }
                                                                                            break;
                                                                                        case 1748487807:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-RESUME-OFFSET=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 7;
                                                                                            }
                                                                                            break;
                                                                                        case 1814205923:
                                                                                            matcher = matcher3;
                                                                                            if (!strGroup2.equals("X-ASSET-URI=")) {
                                                                                                b = -1;
                                                                                            } else {
                                                                                                b = 8;
                                                                                            }
                                                                                            break;
                                                                                        default:
                                                                                            matcher = matcher3;
                                                                                            b = -1;
                                                                                            break;
                                                                                    }
                                                                                    switch (b) {
                                                                                        case 0:
                                                                                        case 1:
                                                                                        case 2:
                                                                                        case 3:
                                                                                        case 4:
                                                                                        case 5:
                                                                                        case 6:
                                                                                        case 7:
                                                                                        case 8:
                                                                                            arrayList14 = arrayList14;
                                                                                            j25 = j25;
                                                                                            break;
                                                                                        default:
                                                                                            String strM38720 = C17073.m38720(1, 0, strGroup2);
                                                                                            String strM40053 = C17588.m40053(strM38720, "=");
                                                                                            int length4 = strM40053.length() + strSubstring.indexOf(strM40053);
                                                                                            String strSubstring2 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                            if (strSubstring2.startsWith("\"")) {
                                                                                                c3050 = new C3050(0, strM38720, m54076(strSubstring, Pattern.compile(strM38720 + "=\"((?:.|\f)+?)\""), map));
                                                                                            } else if (strSubstring2.equals("0x") || strSubstring2.equals("0X")) {
                                                                                                c3050 = new C3050(1, strM38720, m54076(strSubstring, Pattern.compile(strM38720 + "=(0[xX][A-F0-9]+)"), map));
                                                                                            } else {
                                                                                                c3050 = new C3050(strM38720, Double.parseDouble(m54076(strSubstring, Pattern.compile(strM38720 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                                            }
                                                                                            arrayList17.add(c3050);
                                                                                            break;
                                                                                    }
                                                                                    arrayList14 = arrayList14;
                                                                                    str7 = str26;
                                                                                    matcher3 = matcher;
                                                                                    boolValueOf = boolValueOf;
                                                                                    arrayList16 = arrayList16;
                                                                                    j25 = j25;
                                                                                }
                                                                                ArrayList arrayList18 = arrayList16;
                                                                                Boolean bool = boolValueOf;
                                                                                ArrayList arrayList19 = arrayList14;
                                                                                long j28 = j25;
                                                                                String str27 = str7;
                                                                                linkedHashMap2 = linkedHashMap3;
                                                                                C7745 c7745 = linkedHashMap2.containsKey(strM540718) ? (C7745) linkedHashMap2.get(strM540718) : new C7745(strM540718);
                                                                                c7745.m17887(uri);
                                                                                c7745.m17881(uri2);
                                                                                c7745.m17890(jM12991);
                                                                                c7745.m17886(jM12992);
                                                                                c7745.m17880(j24);
                                                                                c7745.m17891(j28);
                                                                                c7745.m17889(arrayList19);
                                                                                c7745.m17885(zM54088);
                                                                                c7745.m17893(j26);
                                                                                c7745.m17894(j27);
                                                                                c7745.m17895(arrayList15);
                                                                                c7745.m17892(arrayList18);
                                                                                c7745.m17884(arrayList17);
                                                                                c7745.m17882(bool);
                                                                                c7745.m17883(str27);
                                                                                c7745.m17888(str25);
                                                                                linkedHashMap2.put(strM540718, c7745);
                                                                            } else {
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                str11 = str5;
                                                                                treeMap = treeMap3;
                                                                                arrayList4 = arrayList13;
                                                                                str10 = str10;
                                                                                arrayList6 = arrayList7;
                                                                                linkedHashMap2 = linkedHashMap3;
                                                                                if (!strM31411.startsWith("#")) {
                                                                                    String hexString3 = str12 == null ? null : str13 != null ? str13 : Long.toHexString(j10);
                                                                                    long j29 = j10 + 1;
                                                                                    String strM54074 = m54074(strM31411, map);
                                                                                    map2 = map2;
                                                                                    C23168 c231612 = (C23168) map2.get(strM54074);
                                                                                    if (j3 == -1) {
                                                                                        j8 = 0;
                                                                                    } else if (z7 && c23168 == null && c231612 == null) {
                                                                                        c231612 = new C23168(strM54074, 0L, j8, null, null);
                                                                                        map2.put(strM54074, c231612);
                                                                                    }
                                                                                    if (c21037 != null || treeMap.isEmpty()) {
                                                                                        str6 = str11;
                                                                                    } else {
                                                                                        C20366[] c20366Arr2 = (C20366[]) treeMap.values().toArray(new C20366[0]);
                                                                                        str6 = str11;
                                                                                        C21037 c210311 = new C21037(str6, c20366Arr2);
                                                                                        if (c21037M54081 == null) {
                                                                                            c21037M54081 = m54081(str6, c20366Arr2);
                                                                                        }
                                                                                        c21037 = c210311;
                                                                                    }
                                                                                    arrayList6.add(new C23168(strM54074, c23168 != null ? c23168 : c231612, strM54078, jLongValue, i7, j11, c21037, str12, hexString3, j8, j3, z6, arrayList4));
                                                                                    j11 += jLongValue;
                                                                                    arrayList11 = new ArrayList();
                                                                                    if (j3 != -1) {
                                                                                        j8 += j3;
                                                                                    }
                                                                                    c = 0;
                                                                                    z6 = false;
                                                                                    c14451 = c14450;
                                                                                    arrayList7 = arrayList6;
                                                                                    j10 = j29;
                                                                                    str11 = str6;
                                                                                    j3 = -1;
                                                                                    treeMap3 = treeMap;
                                                                                    str10 = str10;
                                                                                    strM54078 = str10;
                                                                                    arrayList10 = arrayList;
                                                                                    arrayList9 = arrayList2;
                                                                                    j9 = j11;
                                                                                    jLongValue = 0;
                                                                                    linkedHashMap3 = linkedHashMap2;
                                                                                }
                                                                            }
                                                                            arrayList3 = arrayList6;
                                                                        }
                                                                    } else if (c10428 == null && "PART".equals(m54076(strM31411, f77623, map))) {
                                                                        String strM540729 = m54076(strM31411, pattern2, map);
                                                                        long jM54084 = m54083(f77589, strM31411);
                                                                        long jM54085 = m54083(f77585, strM31411);
                                                                        if (str12 == null) {
                                                                            hexString = null;
                                                                        } else {
                                                                            if (str13 != null) {
                                                                                str4 = str13;
                                                                            } else {
                                                                                hexString = Long.toHexString(j10);
                                                                            }
                                                                            if (c21037 == null || treeMap3.isEmpty()) {
                                                                                str5 = str11;
                                                                            } else {
                                                                                C20366[] c20366Arr3 = (C20366[]) treeMap3.values().toArray(new C20366[0]);
                                                                                str5 = str11;
                                                                                C21037 c210312 = new C21037(str5, c20366Arr3);
                                                                                if (c21037M54081 == null) {
                                                                                    c21037M54081 = m54081(str5, c20366Arr3);
                                                                                }
                                                                                c21037 = c210312;
                                                                            }
                                                                            if (jM54084 == -1 && jM54085 == -1) {
                                                                                c10427 = c10428;
                                                                            } else {
                                                                                if (jM54084 != -1) {
                                                                                    j = jM54084;
                                                                                } else {
                                                                                    j = 0;
                                                                                }
                                                                                c10427 = new C10427(strM540729, c23168, 0L, i7, j9, c21037, str12, str4, j, jM54085, false, false, true);
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                        }
                                                                        str4 = hexString;
                                                                        if (c21037 == null) {
                                                                            str5 = str11;
                                                                        } else {
                                                                            str5 = str11;
                                                                        }
                                                                        if (jM54084 == -1) {
                                                                            if (jM54084 != -1) {
                                                                                j = jM54084;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c10427 = new C10427(strM540729, c23168, 0L, i7, j9, c21037, str12, str4, j, jM54085, false, false, true);
                                                                        } else {
                                                                            if (jM54084 != -1) {
                                                                                j = jM54084;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c10427 = new C10427(strM540729, c23168, 0L, i7, j9, c21037, str12, str4, j, jM54085, false, false, true);
                                                                        }
                                                                        arrayList5 = arrayList11;
                                                                    }
                                                                    c = 0;
                                                                    str11 = str5;
                                                                    arrayList11 = arrayList5;
                                                                }
                                                                arrayList = arrayList10;
                                                                arrayList2 = arrayList9;
                                                                treeMap = treeMap3;
                                                                str10 = str10;
                                                                arrayList3 = arrayList7;
                                                                linkedHashMap2 = linkedHashMap3;
                                                                arrayList4 = arrayList11;
                                                            }
                                                            c14451 = c14450;
                                                        }
                                                        c = 0;
                                                        c14451 = c14450;
                                                        arrayList7 = arrayList3;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        str11 = str11;
                                                        arrayList11 = arrayList4;
                                                        treeMap3 = treeMap;
                                                        str10 = str10;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList2;
                                                        i6 = i6;
                                                        c10427 = c10428;
                                                        c7074 = c7074;
                                                    }
                                                    c10427 = c10428;
                                                    str11 = str11;
                                                    c14451 = c14450;
                                                }
                                                c14451 = c14450;
                                                c7074 = c7074;
                                                str11 = str11;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c10427 = c10428;
                                                c14451 = c14451;
                                            }
                                        }
                                        c10427 = c10428;
                                    }
                                    arrayList = arrayList10;
                                    arrayList2 = arrayList9;
                                    treeMap = treeMap3;
                                    str10 = str10;
                                    arrayList3 = arrayList7;
                                    linkedHashMap2 = linkedHashMap3;
                                    arrayList4 = arrayList11;
                                    c = 0;
                                    c14451 = c14450;
                                    arrayList7 = arrayList3;
                                    linkedHashMap3 = linkedHashMap2;
                                    str11 = str11;
                                    arrayList11 = arrayList4;
                                    treeMap3 = treeMap;
                                    str10 = str10;
                                    arrayList10 = arrayList;
                                    arrayList9 = arrayList2;
                                    i6 = i6;
                                    c10427 = c10428;
                                    c7074 = c7074;
                                }
                                treeMap3 = treeMap3;
                                str11 = str11;
                                arrayList10 = arrayList10;
                                treeMap3 = treeMap3;
                                map2 = map2;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                                c10427 = c10428;
                                c14451 = c14451;
                            }
                        }
                    }
                }
                arrayList10 = arrayList10;
                linkedHashMap3 = linkedHashMap;
                i6 = i6;
            }
        }
        int i17 = i6;
        C10427 c104210 = c10427;
        ArrayList arrayList20 = arrayList9;
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        ArrayList arrayList21 = arrayList10;
        ArrayList arrayList22 = arrayList7;
        ArrayList arrayList23 = arrayList11;
        HashMap map3 = new HashMap();
        int i18 = 0;
        while (i18 < arrayList20.size()) {
            ArrayList arrayList24 = arrayList20;
            C17131 c17131 = (C17131) arrayList24.get(i18);
            long size = c17131.f50597;
            if (size == -1) {
                size = (j5 + ((long) arrayList22.size())) - (arrayList23.isEmpty() ? 1L : 0L);
            }
            int size2 = c17131.f50598;
            if (size2 == -1 && j7 != -9223372036854775807L) {
                size2 = (arrayList23.isEmpty() ? ((C23168) C10810.m24926(arrayList22)).f72778 : arrayList23).size() - 1;
            }
            Uri uri3 = c17131.f50599;
            map3.put(uri3, new C17131(uri3, size, size2));
            i18++;
            arrayList20 = arrayList24;
        }
        if (c104210 != null) {
            arrayList23.add(c104210);
        }
        ArrayList arrayList25 = new ArrayList();
        Iterator it = linkedHashMap4.values().iterator();
        while (it.hasNext()) {
            C3721 c3721M17879 = ((C7745) it.next()).m17879();
            if (c3721M17879 != null) {
                arrayList25.add(c3721M17879);
            }
        }
        return new C7074(i4, str, arrayList21, j4, zM54082, jM12990, z3, i5, j5, i17, j6, j7, z4, z5, jM12990 != 0, c21037M54081, arrayList22, arrayList23, c21828, map3, arrayList25);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21037 m54081(String str, C20366[] c20366Arr) {
        C20366[] c20366Arr2 = new C20366[c20366Arr.length];
        for (int i = 0; i < c20366Arr.length; i++) {
            C20366 c20366 = c20366Arr[i];
            c20366Arr2[i] = new C20366(c20366.f62957, c20366.f62959, c20366.f62958, null);
        }
        return new C21037(str, c20366Arr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20366 m54080(String str, String str2, HashMap map) throws C10998 {
        String strM54075 = m54075(str, f77620, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f77584;
        if (zEquals) {
            String strM54076 = m54076(str, pattern, map);
            return new C20366(C25059.f79955, null, "video/mp4", Base64.decode(strM54076.substring(strM54076.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C25059.f79955;
            String str3 = C5792.f14228;
            return new C20366(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM54075)) {
            return null;
        }
        String strM54077 = m54076(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM54077.substring(strM54077.indexOf(44)), 0);
        UUID uuid2 = C25059.f79954;
        return new C20366(uuid2, null, "video/mp4", C12585.m28991(uuid2, null, bArrDecode));
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m54083(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54076(String str, Pattern pattern, Map map) throws C10998 {
        String strM54075 = m54075(str, pattern, (String) null, map);
        if (strM54075 != null) {
            return strM54075;
        }
        throw C10998.m25385("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54075(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m54074(str2, map);
    }

    /* JADX INFO: renamed from: ֫ */
    public static double m54073(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m54074(String str, Map map) {
        Matcher matcher = f77628.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m54082(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Pattern m54077(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }
}
