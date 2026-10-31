package l;

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
public final class C23295 implements InterfaceC15995 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C12712 f74906;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4951 f74907;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74860 = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74886 = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74852 = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74869 = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Pattern f74898 = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74858 = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74848 = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74876 = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Pattern f74900 = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74863 = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74899 = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74850 = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74851 = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74874 = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Pattern f74904 = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74893 = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74889 = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74849 = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f74834 = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f74892 = m51681("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74847 = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74872 = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74891 = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74890 = m51681("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74859 = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74861 = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74880 = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74853 = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74897 = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74873 = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74879 = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74884 = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74844 = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74840 = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74841 = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74885 = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74875 = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74839 = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74888 = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74855 = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74878 = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74905 = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74845 = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Pattern f74902 = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Pattern f74836 = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74882 = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Pattern f74896 = m51681("AUTOSELECT");

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74842 = m51681("DEFAULT");

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74862 = m51681("FORCED");

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74864 = m51681("INDEPENDENT");

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74866 = m51681("GAP");

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74857 = m51681("PRECISE");

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74865 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74838 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final Pattern f74854 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final Pattern f74856 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74871 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74846 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Pattern f74870 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74835 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74868 = m51681("END-ON-NEXT");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74887 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74881 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74895 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74837 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74843 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74901 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final Pattern f74894 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74867 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final Pattern f74903 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74883 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Pattern f74877 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    @Override // l.InterfaceC15995
    /* JADX INFO: renamed from: ֫ */
    public final /* bridge */ /* synthetic */ Object mo33873(Uri uri, C20038 c20038) {
        return m51688(uri, (InputStream) c20038);
    }

    public C23295() {
        this(C12712.f38252, null);
    }

    public C23295(C12712 c12712, C4951 c4951) {
        this.f74906 = c12712;
        this.f74907 = c4951;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003f A[Catch: all -> 0x0103, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0048 A[Catch: all -> 0x0103, LOOP:2: B:17:0x003c->B:22:0x0048, LOOP_END, TryCatch #0 {all -> 0x0103, blocks: (B:3:0x000f, B:5:0x0018, B:7:0x0020, B:10:0x0029, B:31:0x0068, B:33:0x006e, B:36:0x0079, B:38:0x0081, B:41:0x0095, B:43:0x009d, B:45:0x00a5, B:47:0x00ad, B:49:0x00b5, B:51:0x00bd, B:53:0x00c5, B:55:0x00cd, B:58:0x00d6, B:59:0x00da, B:64:0x00fc, B:65:0x0102, B:13:0x0030, B:15:0x0036, B:19:0x003f, B:22:0x0048, B:24:0x0051, B:26:0x0057, B:28:0x005d, B:29:0x0062), top: B:69:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:88:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0047 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC10596 m51688(Uri uri, InputStream inputStream) throws C9080 {
        int i;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            int i2 = bufferedReader.read();
            boolean zM11055 = false;
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
                            zM11055 = C3603.m11055(i2);
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
                        while (i2 != -1 && Character.isWhitespace(i2) && !C3603.m11055(i2)) {
                            i2 = bufferedReader.read();
                        }
                        zM11055 = C3603.m11055(i2);
                        break;
                    }
                }
            }
            if (!zM11055) {
                throw C9080.m23438("Input does not start with the #EXTM3U header.");
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line != null) {
                    String strTrim = line.trim();
                    if (!strTrim.isEmpty()) {
                        if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                            arrayDeque.add(strTrim);
                            C12712 c12712M51683 = m51683(new C12007(arrayDeque, bufferedReader), uri.toString());
                            C3603.m11024(bufferedReader);
                            return c12712M51683;
                        }
                        if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                            arrayDeque.add(strTrim);
                        }
                        arrayDeque.add(strTrim);
                        C4951 c4951M51682 = m51682(this.f74906, this.f74907, new C12007(arrayDeque, bufferedReader), uri.toString());
                        C3603.m11024(bufferedReader);
                        return c4951M51682;
                    }
                } else {
                    C3603.m11024(bufferedReader);
                    throw C9080.m23438("Failed to parse the playlist, could not identify any tags.");
                }
            }
        } catch (Throwable th) {
            C3603.m11024(bufferedReader);
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12712 m51683(C12007 c12007, String str) throws IOException {
        ?? r7;
        String str2;
        int i;
        String str3;
        Pattern pattern;
        ArrayList arrayList;
        ArrayList arrayList2;
        C13417 c13417;
        String strM24802;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        String str4;
        C8353 c8353M4440;
        C13417 c13418;
        String strM24803;
        C13417 c13419;
        int i3;
        int i4;
        String str5;
        int i5;
        String str6;
        String strM11041;
        int i6;
        String[] strArrM11052;
        String string;
        StringBuilder sb;
        int length;
        int i7;
        String str7;
        String strM51679;
        int i8;
        int i9;
        String strM516710;
        float f;
        Uri uriM22231;
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
            boolean zM29352 = c12007.m29352();
            String str9 = "application/x-mpegURL";
            Pattern pattern2 = f74839;
            boolean z3 = z2;
            ArrayList arrayList14 = arrayList10;
            Pattern pattern3 = f74845;
            ArrayList arrayList15 = arrayList9;
            String str10 = ",";
            if (!zM29352) {
                ArrayList arrayList16 = arrayList11;
                ArrayList arrayList17 = arrayList7;
                ArrayList arrayList18 = arrayList8;
                ArrayList arrayList19 = arrayList13;
                ArrayList arrayList20 = arrayList12;
                ArrayList arrayList21 = new ArrayList();
                HashSet hashSet = new HashSet();
                int i10 = 0;
                while (i10 < arrayList6.size()) {
                    C13417 c134110 = (C13417) arrayList6.get(i10);
                    Uri uri = c134110.f40105;
                    C8353 c8353 = c134110.f40104;
                    if (hashSet.add(uri)) {
                        C22632.m50634(c8353.f25612 == null);
                        ArrayList arrayList22 = (ArrayList) map.get(c134110.f40105);
                        arrayList22.getClass();
                        C23896 c23896 = new C23896(new C24001(null, null, arrayList22));
                        C1297 c1297M21948 = c8353.m21948();
                        c1297M21948.m4449(c23896);
                        arrayList21.add(new C13417(c134110.f40105, c1297M21948.m4440(), c134110.f40103, c134110.f40101, c134110.f40106, c134110.f40102));
                    }
                    i10++;
                    hashSet = hashSet;
                    z = z;
                    map = map;
                }
                boolean z4 = z;
                int i11 = 0;
                ArrayList arrayList23 = null;
                C8353 c8354 = null;
                while (i11 < arrayList16.size()) {
                    String str11 = (String) arrayList16.get(i11);
                    String strM51680 = m51680(str11, f74902, map2);
                    String strM51681 = m51680(str11, pattern3, map2);
                    C1297 c1297 = new C1297();
                    Pattern pattern4 = pattern3;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strM51680);
                    C8353 c8355 = c8354;
                    sb2.append(":");
                    sb2.append(strM51681);
                    c1297.m4469(sb2.toString());
                    c1297.m4473(strM51681);
                    c1297.m4462(str9);
                    boolean zM51686 = m51686(f74842, str11);
                    if (m51686(f74862, str11)) {
                        r7 = zM51686;
                        r7 = (zM51686 ? 1 : 0) | 2;
                    }
                    r7 = zM51686;
                    int i12 = r7;
                    if (m51686(f74896, str11)) {
                        i12 = (r7 == true ? 1 : 0) | 4;
                    }
                    c1297.m4466(i12);
                    String strM516711 = m51679(str11, f74836, (String) null, map2);
                    if (TextUtils.isEmpty(strM516711)) {
                        i = 0;
                        str2 = str10;
                    } else {
                        String str12 = C3603.f11424;
                        String[] strArrSplit = strM516711.split(str10, -1);
                        int i13 = C3603.m11029("public.accessibility.describes-video", strArrSplit) ? 512 : 0;
                        str2 = str10;
                        if (C3603.m11029("public.accessibility.transcribes-spoken-dialog", strArrSplit)) {
                            i13 |= 4096;
                        }
                        int i14 = C3603.m11029("public.accessibility.describes-music-and-sound", strArrSplit) ? i13 | 1024 : i13;
                        i = C3603.m11029("public.easy-to-read", strArrSplit) ? i14 | 8192 : i14;
                    }
                    c1297.m4454(i);
                    c1297.m4471(m51679(str11, f74905, (String) null, map2));
                    String strM516712 = m51679(str11, pattern2, (String) null, map2);
                    Uri uriM22232 = strM516712 == null ? null : C8542.m22231(str8, strM516712);
                    C23896 c23897 = new C23896(new C24001(strM51680, strM51681, Collections.EMPTY_LIST));
                    switch (m51680(str11, f74855, map2)) {
                        case "SUBTITLES":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList6.size()) {
                                    c13417 = (C13417) arrayList6.get(i15);
                                    if (!strM51680.equals(c13417.f40106)) {
                                        i15++;
                                    }
                                } else {
                                    c13417 = null;
                                }
                            }
                            if (c13417 != null) {
                                String strM11042 = C3603.m11041(3, c13417.f40104.f25619);
                                c1297.m4445(strM11042);
                                strM24802 = C9786.m24802(strM11042);
                            } else {
                                strM24802 = null;
                            }
                            if (strM24802 == null) {
                                strM24802 = "text/vtt";
                            }
                            c1297.m4465(strM24802);
                            c1297.m4449(c23897);
                            if (uriM22232 != null) {
                                C3540 c3540 = new C3540(uriM22232, c1297.m4440(), strM51681);
                                arrayList3 = arrayList15;
                                arrayList3.add(c3540);
                            } else {
                                arrayList3 = arrayList15;
                                C19956.m46037("EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            c8353M4440 = c8355;
                            break;
                        case "CLOSED-CAPTIONS":
                            str3 = str9;
                            pattern = pattern2;
                            arrayList4 = arrayList18;
                            arrayList2 = arrayList17;
                            String strM51682 = m51680(str11, f74882, map2);
                            if (strM51682.startsWith("CC")) {
                                i2 = Integer.parseInt(strM51682.substring(2));
                                str4 = "application/cea-608";
                            } else {
                                i2 = Integer.parseInt(strM51682.substring(7));
                                str4 = "application/cea-708";
                            }
                            if (arrayList23 == null) {
                                arrayList23 = new ArrayList();
                            }
                            c1297.m4465(str4);
                            c1297.m4442(i2);
                            arrayList23.add(c1297.m4440());
                            c8353M4440 = c8355;
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            break;
                        case "AUDIO":
                            arrayList2 = arrayList17;
                            int i16 = 0;
                            str3 = str9;
                            while (true) {
                                if (i16 < arrayList6.size()) {
                                    c13418 = (C13417) arrayList6.get(i16);
                                    pattern = pattern2;
                                    if (!strM51680.equals(c13418.f40101)) {
                                        i16++;
                                        pattern2 = pattern;
                                    }
                                } else {
                                    pattern = pattern2;
                                    c13418 = null;
                                }
                            }
                            if (c13418 != null) {
                                String strM11043 = C3603.m11041(1, c13418.f40104.f25619);
                                c1297.m4445(strM11043);
                                strM24803 = C9786.m24802(strM11043);
                            } else {
                                strM24803 = null;
                            }
                            String strM516713 = m51679(str11, f74848, (String) null, map2);
                            if (strM516713 != null) {
                                String str13 = C3603.f11424;
                                c1297.m4472(Integer.parseInt(strM516713.split("/", 2)[0]));
                                if ("audio/eac3".equals(strM24803) && strM516713.endsWith("/JOC")) {
                                    c1297.m4445("ec+3");
                                    strM24803 = "audio/eac3-joc";
                                }
                            }
                            c1297.m4465(strM24803);
                            if (uriM22232 == null) {
                                arrayList4 = arrayList18;
                                if (c13418 != null) {
                                    c8353M4440 = c1297.m4440();
                                    arrayList = arrayList4;
                                    arrayList3 = arrayList15;
                                }
                                break;
                            } else {
                                c1297.m4449(c23897);
                                C3540 c3541 = new C3540(uriM22232, c1297.m4440(), strM51681);
                                arrayList4 = arrayList18;
                                arrayList4.add(c3541);
                            }
                            arrayList = arrayList4;
                            arrayList3 = arrayList15;
                            c8353M4440 = c8355;
                            break;
                        case "VIDEO":
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList6.size()) {
                                    c13419 = (C13417) arrayList6.get(i17);
                                    if (!strM51680.equals(c13419.f40103)) {
                                        i17++;
                                    }
                                } else {
                                    c13419 = null;
                                }
                            }
                            if (c13419 != null) {
                                C8353 c8356 = c13419.f40104;
                                String strM11044 = C3603.m11041(2, c8356.f25619);
                                c1297.m4445(strM11044);
                                c1297.m4465(C9786.m24802(strM11044));
                                c1297.m4453(c8356.f25633);
                                c1297.m4457(c8356.f25609);
                                c1297.m4441(c8356.f25596);
                            }
                            if (uriM22232 != null) {
                                c1297.m4449(c23897);
                                arrayList2 = arrayList17;
                                arrayList2.add(new C3540(uriM22232, c1297.m4440(), strM51681));
                                str3 = str9;
                                pattern = pattern2;
                                arrayList3 = arrayList15;
                                arrayList = arrayList18;
                            }
                            c8353M4440 = c8355;
                        default:
                            str3 = str9;
                            pattern = pattern2;
                            arrayList3 = arrayList15;
                            arrayList = arrayList18;
                            arrayList2 = arrayList17;
                            c8353M4440 = c8355;
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
                    c8354 = c8353M4440;
                    str8 = str;
                }
                return new C12712(str, arrayList19, arrayList21, arrayList17, arrayList18, arrayList15, arrayList14, c8354, z4 ? Collections.EMPTY_LIST : arrayList23, z3, map2, arrayList20);
            }
            String strM29353 = c12007.m29353();
            ArrayList arrayList24 = arrayList8;
            if (strM29353.startsWith("#EXT")) {
                arrayList13.add(strM29353);
            }
            boolean zStartsWith = strM29353.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            ArrayList arrayList25 = arrayList13;
            if (strM29353.startsWith("#EXT-X-DEFINE")) {
                map2.put(m51680(strM29353, pattern3, map2), m51680(strM29353, f74865, map2));
            } else {
                if (strM29353.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    z2 = true;
                    arrayList11 = arrayList11;
                    arrayList7 = arrayList7;
                    arrayList12 = arrayList12;
                } else if (strM29353.startsWith("#EXT-X-MEDIA")) {
                    arrayList11.add(strM29353);
                } else if (strM29353.startsWith("#EXT-X-SESSION-KEY")) {
                    C18937 c18937M51684 = m51684(strM29353, m51679(strM29353, f74885, "identity", map2), map2);
                    if (c18937M51684 != null) {
                        String strM51683 = m51680(strM29353, f74841, map2);
                        arrayList12.add(new C19643(("SAMPLE-AES-CENC".equals(strM51683) || "SAMPLE-AES-CTR".equals(strM51683)) ? "cenc" : "cbcs", c18937M51684));
                    }
                } else {
                    if (strM29353.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                        boolean zContains = z | strM29353.contains("CLOSED-CAPTIONS=NONE");
                        int i18 = zStartsWith ? 16384 : 0;
                        int i19 = Integer.parseInt(m51680(strM29353, f74858, Collections.EMPTY_MAP));
                        Matcher matcher = f74860.matcher(strM29353);
                        if (matcher.find()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            i3 = Integer.parseInt(strGroup);
                        } else {
                            i3 = -1;
                        }
                        String strM516714 = m51679(strM29353, f74876, (String) null, map2);
                        String strM516715 = m51679(strM29353, f74900, (String) null, map2);
                        HashMap map3 = map;
                        String strM516716 = m51679(strM29353, f74863, (String) null, map2);
                        if (strM516716 != null) {
                            String str14 = C3603.f11424;
                            i4 = i18;
                            String[] strArrSplit2 = strM516716.split(",", 2)[0].split("/", -1);
                            str5 = strArrSplit2[0];
                            if (strArrSplit2.length > 1) {
                                str6 = strArrSplit2[1];
                                i5 = 2;
                            }
                            strM11041 = C3603.m11041(i5, strM516715);
                            int i20 = C9786.f29598;
                            if (strM11041 == null) {
                                i6 = i19;
                            } else {
                                if (strM11041.startsWith("dvhe")) {
                                    i6 = i19;
                                } else {
                                    i6 = i19;
                                    if (!strM11041.startsWith("dvh1") || (str5 != null && ((str5.startsWith("dvhe") && strM11041.startsWith("hev1")) || ((str5.startsWith("dvh1") && strM11041.startsWith("hvc1")) || ((str5.startsWith("dvav") && strM11041.startsWith("avc3")) || ((str5.startsWith("dva1") && strM11041.startsWith("avc1")) || (str5.startsWith("dav1") && strM11041.startsWith("av01")))))))) {
                                    }
                                }
                                if (str5 != null || (strM516714 != null && str6 != null && ((!strM516714.equals("PQ") || str6.equals("db1p")) && ((!strM516714.equals("SDR") || str6.equals("db2g")) && (!strM516714.equals("HLG") || str6.startsWith("db4")))))) {
                                    if (str5 == null) {
                                        str5 = strM11041;
                                    }
                                    strArrM11052 = C3603.m11052(strM516715);
                                    if (strArrM11052.length == 0) {
                                        string = null;
                                    } else {
                                        sb = new StringBuilder();
                                        length = strArrM11052.length;
                                        i7 = 0;
                                        while (i7 < length) {
                                            str7 = strArrM11052[i7];
                                            String[] strArr = strArrM11052;
                                            if (2 != C9786.m24807(C9786.m24802(str7))) {
                                                if (sb.length() > 0) {
                                                    sb.append(",");
                                                }
                                                sb.append(str7);
                                            }
                                            i7++;
                                            strArrM11052 = strArr;
                                        }
                                        if (sb.length() > 0) {
                                            string = sb.toString();
                                        } else {
                                            string = null;
                                        }
                                    }
                                    if (string != null) {
                                        strM516715 = C22870.m50967(str5, ",", string);
                                    } else {
                                        strM516715 = str5;
                                    }
                                }
                            }
                            strM51679 = m51679(strM29353, f74899, (String) null, map2);
                            if (strM51679 != null) {
                                String[] strArrSplit3 = strM51679.split("x", -1);
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
                            strM516710 = m51679(strM29353, f74850, (String) null, map2);
                            if (strM516710 != null) {
                                f = Float.parseFloat(strM516710);
                            } else {
                                f = -1.0f;
                            }
                            String strM516717 = m51679(strM29353, f74886, (String) null, map2);
                            String strM516718 = m51679(strM29353, f74852, (String) null, map2);
                            String strM516719 = m51679(strM29353, f74869, (String) null, map2);
                            String strM516720 = m51679(strM29353, f74898, (String) null, map2);
                            if (zStartsWith) {
                                uriM22231 = C8542.m22231(str8, m51680(strM29353, pattern2, map2));
                            } else {
                                if (c12007.m29352()) {
                                    throw C9080.m23438("#EXT-X-STREAM-INF must be followed by another line");
                                }
                                uriM22231 = C8542.m22231(str8, m51678(c12007.m29353(), map2));
                            }
                            C1297 c1298 = new C1297();
                            c1298.m4467(arrayList6.size());
                            c1298.m4462("application/x-mpegURL");
                            c1298.m4445(strM516715);
                            c1298.m4468(i3);
                            int i21 = i6;
                            c1298.m4438(i21);
                            c1298.m4453(i9);
                            c1298.m4457(i8);
                            c1298.m4441(f);
                            c1298.m4454(i4);
                            arrayList6.add(new C13417(uriM22231, c1298.m4440(), strM516717, strM516718, strM516719, strM516720));
                            map = map3;
                            arrayList5 = (ArrayList) map.get(uriM22231);
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                                map.put(uriM22231, arrayList5);
                            }
                            arrayList5.add(new C14828(i3, i21, strM516717, strM516718, strM516719, strM516720));
                            z = zContains;
                        } else {
                            i4 = i18;
                            str5 = null;
                        }
                        i5 = 2;
                        str6 = null;
                        strM11041 = C3603.m11041(i5, strM516715);
                        int i22 = C9786.f29598;
                        if (strM11041 == null) {
                            i6 = i19;
                        } else {
                            if (strM11041.startsWith("dvhe")) {
                                i6 = i19;
                                if (!strM11041.startsWith("dvh1")) {
                                }
                            } else {
                                i6 = i19;
                            }
                            if (str5 != null) {
                                if (str5 == null) {
                                    str5 = strM11041;
                                }
                                strArrM11052 = C3603.m11052(strM516715);
                                if (strArrM11052.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM11052.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM11052[i7];
                                        String[] strArr2 = strArrM11052;
                                        if (2 != C9786.m24807(C9786.m24802(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM11052 = strArr2;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM516715 = C22870.m50967(str5, ",", string);
                                } else {
                                    strM516715 = str5;
                                }
                            } else {
                                if (str5 == null) {
                                    str5 = strM11041;
                                }
                                strArrM11052 = C3603.m11052(strM516715);
                                if (strArrM11052.length == 0) {
                                    string = null;
                                } else {
                                    sb = new StringBuilder();
                                    length = strArrM11052.length;
                                    i7 = 0;
                                    while (i7 < length) {
                                        str7 = strArrM11052[i7];
                                        String[] strArr3 = strArrM11052;
                                        if (2 != C9786.m24807(C9786.m24802(str7))) {
                                            if (sb.length() > 0) {
                                                sb.append(",");
                                            }
                                            sb.append(str7);
                                        }
                                        i7++;
                                        strArrM11052 = strArr3;
                                    }
                                    if (sb.length() > 0) {
                                        string = sb.toString();
                                    } else {
                                        string = null;
                                    }
                                }
                                if (string != null) {
                                    strM516715 = C22870.m50967(str5, ",", string);
                                } else {
                                    strM516715 = str5;
                                }
                            }
                        }
                        strM51679 = m51679(strM29353, f74899, (String) null, map2);
                        if (strM51679 != null) {
                            String[] strArrSplit4 = strM51679.split("x", -1);
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
                        strM516710 = m51679(strM29353, f74850, (String) null, map2);
                        if (strM516710 != null) {
                            f = Float.parseFloat(strM516710);
                        } else {
                            f = -1.0f;
                        }
                        String strM5167110 = m51679(strM29353, f74886, (String) null, map2);
                        String strM5167111 = m51679(strM29353, f74852, (String) null, map2);
                        String strM5167112 = m51679(strM29353, f74869, (String) null, map2);
                        String strM516721 = m51679(strM29353, f74898, (String) null, map2);
                        if (zStartsWith) {
                            uriM22231 = C8542.m22231(str8, m51680(strM29353, pattern2, map2));
                        } else {
                            if (c12007.m29352()) {
                                throw C9080.m23438("#EXT-X-STREAM-INF must be followed by another line");
                            }
                            uriM22231 = C8542.m22231(str8, m51678(c12007.m29353(), map2));
                        }
                        C1297 c1299 = new C1297();
                        c1299.m4467(arrayList6.size());
                        c1299.m4462("application/x-mpegURL");
                        c1299.m4445(strM516715);
                        c1299.m4468(i3);
                        int i23 = i6;
                        c1299.m4438(i23);
                        c1299.m4453(i9);
                        c1299.m4457(i8);
                        c1299.m4441(f);
                        c1299.m4454(i4);
                        arrayList6.add(new C13417(uriM22231, c1299.m4440(), strM5167110, strM5167111, strM5167112, strM516721));
                        map = map3;
                        arrayList5 = (ArrayList) map.get(uriM22231);
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                            map.put(uriM22231, arrayList5);
                        }
                        arrayList5.add(new C14828(i3, i23, strM5167110, strM5167111, strM5167112, strM516721));
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
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C4951 m51682(C12712 c12712, C4951 c4951, C12007 c12007, String str) throws C9080, C6362 {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeMap treeMap;
        ArrayList arrayList3;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayList4;
        int i;
        String str2;
        AbstractC14545 abstractC14545;
        TreeMap treeMap2;
        String strM51679;
        String str3;
        String strM51680;
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
        C0717 c0717;
        int i3;
        byte b2;
        String hexString2;
        String str9;
        boolean z;
        String strM516710;
        long j2;
        C18937[] c18937Arr;
        String[] strArrSplit;
        boolean z2 = c12712.f31807;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C20474 c20474 = new C20474(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap3 = new TreeMap();
        String str10 = "";
        int i4 = 0;
        boolean z3 = false;
        int i5 = 0;
        boolean zM51686 = false;
        c4951 = c4951;
        C12712 c12713 = c12712;
        boolean z4 = z2;
        ArrayList arrayList11 = arrayList8;
        C20474 c20475 = c20474;
        String strM516711 = "";
        long j3 = -1;
        C8479 c8479 = null;
        String str11 = null;
        C19643 c19643M51685 = null;
        C19643 c19643 = null;
        C21885 c21885 = null;
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
        long jM11014 = 0;
        while (c12007.m29352()) {
            String strM29353 = c12007.m29353();
            if (strM29353.startsWith("#EXT")) {
                arrayList10.add(strM29353);
            }
            if (strM29353.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                String strM51681 = m51680(strM29353, f74849, map);
                if ("VOD".equals(strM51681)) {
                    i4 = 1;
                } else if ("EVENT".equals(strM51681)) {
                    i4 = 2;
                }
            } else if (strM29353.equals("#EXT-X-I-FRAMES-ONLY")) {
                z7 = true;
            } else {
                if (strM29353.startsWith("#EXT-X-START")) {
                    i6 = i6;
                    long j13 = (long) (Double.parseDouble(m51680(strM29353, f74873, Collections.EMPTY_MAP)) * 1000000.0d);
                    zM51686 = m51686(f74857, strM29353);
                    j4 = j13;
                    linkedHashMap = linkedHashMap3;
                    arrayList10 = arrayList10;
                } else {
                    i6 = i6;
                    if (strM29353.startsWith("#EXT-X-SERVER-CONTROL")) {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        double dM51677 = m51677(strM29353, f74834, -9.223372036854776E18d);
                        long j14 = dM51677 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM51677 * 1000000.0d);
                        boolean zM51687 = m51686(f74892, strM29353);
                        double dM51678 = m51677(strM29353, f74872, -9.223372036854776E18d);
                        long j15 = dM51678 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM51678 * 1000000.0d);
                        double dM51679 = m51677(strM29353, f74891, -9.223372036854776E18d);
                        c20475 = new C20474(j14, zM51687, j15, dM51679 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dM51679 * 1000000.0d), m51686(f74890, strM29353));
                    } else {
                        linkedHashMap = linkedHashMap3;
                        arrayList10 = arrayList10;
                        if (strM29353.startsWith("#EXT-X-PART-INF")) {
                            j7 = (long) (Double.parseDouble(m51680(strM29353, f74893, Collections.EMPTY_MAP)) * 1000000.0d);
                        } else {
                            boolean zStartsWith = strM29353.startsWith("#EXT-X-MAP");
                            Pattern pattern = f74884;
                            linkedHashMap3 = linkedHashMap;
                            Pattern pattern2 = f74839;
                            if (zStartsWith) {
                                String strM51682 = m51680(strM29353, pattern2, map);
                                String strM516712 = m51679(strM29353, pattern, (String) null, map);
                                if (strM516712 != null) {
                                    String str14 = C3603.f11424;
                                    String[] strArrSplit2 = strM516712.split("@", -1);
                                    j3 = Long.parseLong(strArrSplit2[c]);
                                    if (strArrSplit2.length > 1) {
                                        j8 = Long.parseLong(strArrSplit2[1]);
                                    }
                                }
                                long j16 = j3;
                                long j17 = j16 == -1 ? 0L : j8;
                                if (str12 != null && str13 == null) {
                                    throw C9080.m23438("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
                                }
                                C21885 c21886 = new C21885(strM51682, j17, j16, str12, str13);
                                if (j16 != -1) {
                                    j17 += j16;
                                }
                                j8 = j17;
                                arrayList10 = arrayList10;
                                c21885 = c21886;
                                j3 = -1;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                            } else {
                                map2 = map2;
                                C8479 c84710 = c8479;
                                if (strM29353.startsWith("#EXT-X-TARGETDURATION")) {
                                    j6 = ((long) Integer.parseInt(m51680(strM29353, f74851, Collections.EMPTY_MAP))) * 1000000;
                                } else if (strM29353.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                                    j5 = Long.parseLong(m51680(strM29353, f74859, Collections.EMPTY_MAP));
                                    j10 = j5;
                                    treeMap3 = treeMap3;
                                    str11 = str11;
                                    arrayList10 = arrayList10;
                                    treeMap3 = treeMap3;
                                    map2 = map2;
                                    linkedHashMap3 = linkedHashMap3;
                                    i6 = i6;
                                    c8479 = c84710;
                                    c12713 = c12713;
                                } else if (strM29353.startsWith("#EXT-X-VERSION")) {
                                    i6 = Integer.parseInt(m51680(strM29353, f74889, Collections.EMPTY_MAP));
                                } else {
                                    if (strM29353.startsWith("#EXT-X-DEFINE")) {
                                        String strM516713 = m51679(strM29353, f74838, (String) null, map);
                                        if (strM516713 != null) {
                                            String str15 = (String) c12713.f38255.get(strM516713);
                                            if (str15 != null) {
                                                map.put(strM516713, str15);
                                            }
                                        } else {
                                            map.put(m51680(strM29353, f74845, map), m51680(strM29353, f74865, map));
                                        }
                                        str11 = str11;
                                        treeMap3 = treeMap3;
                                    } else if (strM29353.startsWith("#EXTINF")) {
                                        jLongValue = new BigDecimal(m51680(strM29353, f74861, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
                                        strM516711 = m51679(strM29353, f74880, str10, map);
                                    } else {
                                        if (strM29353.startsWith("#EXT-X-SKIP")) {
                                            int i8 = Integer.parseInt(m51680(strM29353, f74847, Collections.EMPTY_MAP));
                                            C22632.m50634(c4951 != null && arrayList7.isEmpty());
                                            String str16 = C3603.f11424;
                                            long j18 = c4951.f15600;
                                            AbstractC14545 abstractC14546 = c4951.f15593;
                                            int i9 = (int) (j5 - j18);
                                            int i10 = i8 + i9;
                                            if (i9 < 0 || i10 > abstractC14546.size()) {
                                                throw new C6362();
                                            }
                                            while (i9 < i10) {
                                                C21885 c21887 = (C21885) abstractC14546.get(i9);
                                                if (j5 != c4951.f15600) {
                                                    int i11 = (c4951.f15606 - i5) + c21887.f73014;
                                                    AbstractC14545 abstractC14547 = c21887.f70066;
                                                    ArrayList arrayList12 = new ArrayList();
                                                    long j19 = j11;
                                                    int i12 = 0;
                                                    while (i12 < abstractC14547.size()) {
                                                        C8479 c84711 = (C8479) abstractC14547.get(i12);
                                                        arrayList12.add(new C8479(c84711.f73022, c84711.f73015, c84711.f73013, i11, j19, c84711.f73019, c84711.f73018, c84711.f73012, c84711.f73021, c84711.f73020, c84711.f73017, c84711.f25917, c84711.f25916));
                                                        j19 += c84711.f73013;
                                                        i12++;
                                                        treeMap3 = treeMap3;
                                                        i10 = i10;
                                                        abstractC14546 = abstractC14546;
                                                        str11 = str11;
                                                    }
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC14545 = abstractC14546;
                                                    treeMap2 = treeMap3;
                                                    c21887 = new C21885(c21887.f73022, c21887.f73015, c21887.f70065, c21887.f73013, i11, j11, c21887.f73019, c21887.f73018, c21887.f73012, c21887.f73021, c21887.f73020, c21887.f73017, arrayList12);
                                                } else {
                                                    i = i10;
                                                    str2 = str11;
                                                    abstractC14545 = abstractC14546;
                                                    treeMap2 = treeMap3;
                                                }
                                                arrayList7.add(c21887);
                                                long j20 = c21887.f73013;
                                                String str17 = c21887.f73012;
                                                j11 += j20;
                                                long j21 = c21887.f73020;
                                                if (j21 != -1) {
                                                    j8 = c21887.f73021 + j21;
                                                }
                                                int i13 = c21887.f73014;
                                                C21885 c21888 = c21887.f73015;
                                                C19643 c19644 = c21887.f73019;
                                                String str18 = c21887.f73018;
                                                if (str17 == null || !str17.equals(Long.toHexString(j10))) {
                                                    str13 = str17;
                                                }
                                                j10++;
                                                i9++;
                                                c4951 = c4951;
                                                i7 = i13;
                                                c21885 = c21888;
                                                str12 = str18;
                                                c19643 = c19644;
                                                treeMap3 = treeMap2;
                                                i10 = i;
                                                abstractC14546 = abstractC14545;
                                                j9 = j11;
                                                str11 = str2;
                                            }
                                            c12713 = c12712;
                                            arrayList10 = arrayList10;
                                            map2 = map2;
                                            linkedHashMap3 = linkedHashMap3;
                                        } else {
                                            str11 = str11;
                                            treeMap3 = treeMap3;
                                            if (strM29353.startsWith("#EXT-X-KEY")) {
                                                String strM51683 = m51680(strM29353, f74841, map);
                                                String strM516714 = m51679(strM29353, f74885, "identity", map);
                                                if ("NONE".equals(strM51683)) {
                                                    treeMap3.clear();
                                                    str3 = null;
                                                    str11 = str11;
                                                } else {
                                                    strM51679 = m51679(strM29353, f74888, (String) null, map);
                                                    if ("identity".equals(strM516714)) {
                                                        if ("AES-128".equals(strM51683)) {
                                                            strM51680 = m51680(strM29353, pattern2, map);
                                                            str11 = str11;
                                                        } else {
                                                            str11 = str11;
                                                        }
                                                        c4951 = c4951;
                                                        str12 = strM51680;
                                                        str13 = strM51679;
                                                        c12713 = c12712;
                                                        arrayList10 = arrayList10;
                                                        treeMap3 = treeMap3;
                                                        map2 = map2;
                                                        linkedHashMap3 = linkedHashMap3;
                                                        i6 = i6;
                                                        c8479 = c84710;
                                                        c12713 = c12713;
                                                    } else {
                                                        str11 = str11 == null ? ("SAMPLE-AES-CENC".equals(strM51683) || "SAMPLE-AES-CTR".equals(strM51683)) ? "cenc" : "cbcs" : str11;
                                                        C18937 c18937M51684 = m51684(strM29353, strM516714, map);
                                                        if (c18937M51684 != null) {
                                                            treeMap3.put(strM516714, c18937M51684);
                                                            str3 = strM51679;
                                                        }
                                                    }
                                                    strM51680 = null;
                                                    c4951 = c4951;
                                                    str12 = strM51680;
                                                    str13 = strM51679;
                                                    c12713 = c12712;
                                                    arrayList10 = arrayList10;
                                                    treeMap3 = treeMap3;
                                                    map2 = map2;
                                                    linkedHashMap3 = linkedHashMap3;
                                                    i6 = i6;
                                                    c8479 = c84710;
                                                    c12713 = c12713;
                                                }
                                                c19643 = null;
                                                strM51679 = str3;
                                                strM51680 = null;
                                                c4951 = c4951;
                                                str12 = strM51680;
                                                str13 = strM51679;
                                                c12713 = c12712;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c8479 = c84710;
                                                c12713 = c12713;
                                            } else {
                                                if (strM29353.startsWith("#EXT-X-BYTERANGE")) {
                                                    String strM51684 = m51680(strM29353, f74879, map);
                                                    String str19 = C3603.f11424;
                                                    String[] strArrSplit3 = strM51684.split("@", -1);
                                                    j3 = Long.parseLong(strArrSplit3[c]);
                                                    if (strArrSplit3.length > 1) {
                                                        j8 = Long.parseLong(strArrSplit3[1]);
                                                    }
                                                } else {
                                                    if (strM29353.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                                                        i5 = Integer.parseInt(strM29353.substring(strM29353.indexOf(58) + 1));
                                                        z3 = true;
                                                    } else if (strM29353.equals("#EXT-X-DISCONTINUITY")) {
                                                        i7++;
                                                    } else {
                                                        if (strM29353.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                                                            if (jM11014 == 0) {
                                                                jM11014 = C3603.m11014(C3603.m11054(strM29353.substring(strM29353.indexOf(58) + 1))) - j11;
                                                            }
                                                        } else if (strM29353.equals("#EXT-X-GAP")) {
                                                            z6 = true;
                                                        } else if (strM29353.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                                                            z4 = true;
                                                        } else {
                                                            if (strM29353.equals("#EXT-X-ENDLIST")) {
                                                                z5 = true;
                                                            } else {
                                                                if (strM29353.startsWith("#EXT-X-RENDITION-REPORT")) {
                                                                    long jM51687 = m51687(f74853, strM29353);
                                                                    Matcher matcher2 = f74897.matcher(strM29353);
                                                                    if (matcher2.find()) {
                                                                        String strGroup = matcher2.group(1);
                                                                        strGroup.getClass();
                                                                        i2 = Integer.parseInt(strGroup);
                                                                    } else {
                                                                        i2 = -1;
                                                                    }
                                                                    arrayList9.add(new C15533(Uri.parse(C8542.m22228(str, m51680(strM29353, pattern2, map))), jM51687, i2));
                                                                } else {
                                                                    if (!strM29353.startsWith("#EXT-X-PRELOAD-HINT")) {
                                                                        str5 = str11;
                                                                        if (strM29353.startsWith("#EXT-X-PART")) {
                                                                            if (str12 == null) {
                                                                                hexString2 = null;
                                                                            } else {
                                                                                if (str13 != null) {
                                                                                    str9 = str13;
                                                                                } else {
                                                                                    hexString2 = Long.toHexString(j10);
                                                                                }
                                                                                String strM51685 = m51680(strM29353, pattern2, map);
                                                                                long j22 = (long) (Double.parseDouble(m51680(strM29353, f74874, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                                boolean zM51688 = m51686(f74864, strM29353);
                                                                                if (z4 || !arrayList11.isEmpty()) {
                                                                                    z = false;
                                                                                } else {
                                                                                    z = true;
                                                                                }
                                                                                boolean z8 = zM51688 | z;
                                                                                boolean zM51689 = m51686(f74866, strM29353);
                                                                                strM516710 = m51679(strM29353, pattern, (String) null, map);
                                                                                if (strM516710 != null) {
                                                                                    String str20 = C3603.f11424;
                                                                                    strArrSplit = strM516710.split("@", -1);
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
                                                                                if (c19643 == null && !treeMap3.isEmpty()) {
                                                                                    c18937Arr = (C18937[]) treeMap3.values().toArray(new C18937[0]);
                                                                                    C19643 c19645 = new C19643(str5, c18937Arr);
                                                                                    if (c19643M51685 == null) {
                                                                                        c19643M51685 = m51685(str5, c18937Arr);
                                                                                    }
                                                                                    c19643 = c19645;
                                                                                }
                                                                                arrayList5 = arrayList11;
                                                                                arrayList5.add(new C8479(strM51685, c21885, j22, i7, j9, c19643, str12, str9, j12, j2, zM51689, z8, false));
                                                                                j9 += j22;
                                                                                if (j2 != -1) {
                                                                                    j12 += j2;
                                                                                }
                                                                                c8479 = c84710;
                                                                            }
                                                                            str9 = hexString2;
                                                                            String strM51686 = m51680(strM29353, pattern2, map);
                                                                            long j23 = (long) (Double.parseDouble(m51680(strM29353, f74874, Collections.EMPTY_MAP)) * 1000000.0d);
                                                                            boolean zM516810 = m51686(f74864, strM29353);
                                                                            if (z4) {
                                                                                z = false;
                                                                            } else {
                                                                                z = false;
                                                                            }
                                                                            boolean z9 = zM516810 | z;
                                                                            boolean zM516811 = m51686(f74866, strM29353);
                                                                            strM516710 = m51679(strM29353, pattern, (String) null, map);
                                                                            if (strM516710 != null) {
                                                                                String str21 = C3603.f11424;
                                                                                strArrSplit = strM516710.split("@", -1);
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
                                                                            if (c19643 == null) {
                                                                                c18937Arr = (C18937[]) treeMap3.values().toArray(new C18937[0]);
                                                                                C19643 c19646 = new C19643(str5, c18937Arr);
                                                                                if (c19643M51685 == null) {
                                                                                    c19643M51685 = m51685(str5, c18937Arr);
                                                                                }
                                                                                c19643 = c19646;
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                            arrayList5.add(new C8479(strM51686, c21885, j23, i7, j9, c19643, str12, str9, j12, j2, zM516811, z9, false));
                                                                            j9 += j23;
                                                                            if (j2 != -1) {
                                                                                j12 += j2;
                                                                            }
                                                                            c8479 = c84710;
                                                                        } else {
                                                                            ArrayList arrayList13 = arrayList11;
                                                                            if (strM29353.startsWith("#EXT-X-DATERANGE") && m51679(strM29353, f74856, str10, map).equals("com.apple.hls.interstitial")) {
                                                                                String strM51687 = m51680(strM29353, f74854, map);
                                                                                String strM516715 = m51679(strM29353, f74887, (String) null, map);
                                                                                Uri uri = strM516715 != null ? Uri.parse(strM516715) : null;
                                                                                String strM516716 = m51679(strM29353, f74881, (String) null, map);
                                                                                Uri uri2 = strM516716 != null ? Uri.parse(strM516716) : null;
                                                                                String strM516717 = m51679(strM29353, f74871, (String) null, map);
                                                                                long jM11015 = strM516717 != null ? C3603.m11014(C3603.m11054(strM516717)) : -9223372036854775807L;
                                                                                String strM516718 = m51679(strM29353, f74870, (String) null, map);
                                                                                long jM11016 = strM516718 != null ? C3603.m11014(C3603.m11054(strM516718)) : -9223372036854775807L;
                                                                                ArrayList arrayList14 = new ArrayList();
                                                                                String strM516719 = m51679(strM29353, f74846, (String) null, map);
                                                                                if (strM516719 != null) {
                                                                                    String str22 = C3603.f11424;
                                                                                    String[] strArrSplit4 = strM516719.split(",", -1);
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
                                                                                double dM516710 = m51677(strM29353, f74904, -1.0d);
                                                                                long j24 = dM516710 >= 0.0d ? (long) (dM516710 * 1000000.0d) : -9223372036854775807L;
                                                                                str11 = str5;
                                                                                double dM516711 = m51677(strM29353, f74835, -1.0d);
                                                                                long j25 = dM516711 >= 0.0d ? (long) (dM516711 * 1000000.0d) : -9223372036854775807L;
                                                                                boolean zM516812 = m51686(f74868, strM29353);
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                double dM516712 = m51677(strM29353, f74895, Double.MIN_VALUE);
                                                                                long j26 = dM516712 != Double.MIN_VALUE ? (long) (dM516712 * 1000000.0d) : -9223372036854775807L;
                                                                                double dM516713 = m51677(strM29353, f74837, -1.0d);
                                                                                long j27 = dM516713 >= 0.0d ? (long) (dM516713 * 1000000.0d) : -9223372036854775807L;
                                                                                ArrayList arrayList15 = new ArrayList();
                                                                                arrayList4 = arrayList13;
                                                                                treeMap = treeMap3;
                                                                                String strM516720 = m51679(strM29353, f74843, (String) null, map);
                                                                                if (strM516720 != null) {
                                                                                    String str23 = C3603.f11424;
                                                                                    String[] strArrSplit5 = strM516720.split(",", -1);
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
                                                                                String strM516721 = m51679(strM29353, f74901, (String) null, map);
                                                                                if (strM516721 != null) {
                                                                                    String str24 = C3603.f11424;
                                                                                    String[] strArrSplit6 = strM516721.split(",", -1);
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
                                                                                String strM516722 = m51679(strM29353, f74894, (String) null, map);
                                                                                Boolean boolValueOf = strM516722 != null ? Boolean.valueOf(!strM516722.equals("NO")) : null;
                                                                                String strM516723 = m51679(strM29353, f74867, (String) null, map);
                                                                                if (strM516723 != null) {
                                                                                    str7 = "RANGE";
                                                                                    if (!strM516723.equals("RANGE")) {
                                                                                        str7 = "POINT";
                                                                                        if (!strM516723.equals("POINT")) {
                                                                                            str7 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str7 = null;
                                                                                }
                                                                                String strM516724 = m51679(strM29353, f74903, (String) null, map);
                                                                                if (strM516724 != null) {
                                                                                    str8 = "PRIMARY";
                                                                                    if (!strM516724.equals("PRIMARY")) {
                                                                                        str8 = "HIGHLIGHT";
                                                                                        if (!strM516724.equals("HIGHLIGHT")) {
                                                                                            str8 = null;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    str8 = null;
                                                                                }
                                                                                ArrayList arrayList17 = new ArrayList();
                                                                                String str25 = str8;
                                                                                String strSubstring = strM29353.substring(17);
                                                                                Matcher matcher3 = f74877.matcher(strSubstring);
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
                                                                                            String strM36561 = C15472.m36561(1, 0, strGroup2);
                                                                                            String strM37867 = C16014.m37867(strM36561, "=");
                                                                                            int length4 = strM37867.length() + strSubstring.indexOf(strM37867);
                                                                                            String strSubstring2 = strSubstring.substring(length4, (strSubstring.length() == length4 + 1 ? 1 : 2) + length4);
                                                                                            if (strSubstring2.startsWith("\"")) {
                                                                                                c0717 = new C0717(0, strM36561, m51680(strSubstring, Pattern.compile(strM36561 + "=\"((?:.|\f)+?)\""), map));
                                                                                            } else if (strSubstring2.equals("0x") || strSubstring2.equals("0X")) {
                                                                                                c0717 = new C0717(1, strM36561, m51680(strSubstring, Pattern.compile(strM36561 + "=(0[xX][A-F0-9]+)"), map));
                                                                                            } else {
                                                                                                c0717 = new C0717(strM36561, Double.parseDouble(m51680(strSubstring, Pattern.compile(strM36561 + "=([\\d\\.]+)\\b"), Collections.EMPTY_MAP)));
                                                                                            }
                                                                                            arrayList17.add(c0717);
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
                                                                                C5657 c5657 = linkedHashMap2.containsKey(strM51687) ? (C5657) linkedHashMap2.get(strM51687) : new C5657(strM51687);
                                                                                c5657.m15958(uri);
                                                                                c5657.m15952(uri2);
                                                                                c5657.m15961(jM11015);
                                                                                c5657.m15957(jM11016);
                                                                                c5657.m15951(j24);
                                                                                c5657.m15962(j28);
                                                                                c5657.m15960(arrayList19);
                                                                                c5657.m15956(zM516812);
                                                                                c5657.m15964(j26);
                                                                                c5657.m15965(j27);
                                                                                c5657.m15966(arrayList15);
                                                                                c5657.m15963(arrayList18);
                                                                                c5657.m15955(arrayList17);
                                                                                c5657.m15953(bool);
                                                                                c5657.m15954(str27);
                                                                                c5657.m15959(str25);
                                                                                linkedHashMap2.put(strM51687, c5657);
                                                                            } else {
                                                                                arrayList = arrayList10;
                                                                                arrayList2 = arrayList9;
                                                                                str11 = str5;
                                                                                treeMap = treeMap3;
                                                                                arrayList4 = arrayList13;
                                                                                str10 = str10;
                                                                                arrayList6 = arrayList7;
                                                                                linkedHashMap2 = linkedHashMap3;
                                                                                if (!strM29353.startsWith("#")) {
                                                                                    String hexString3 = str12 == null ? null : str13 != null ? str13 : Long.toHexString(j10);
                                                                                    long j29 = j10 + 1;
                                                                                    String strM51678 = m51678(strM29353, map);
                                                                                    map2 = map2;
                                                                                    C21885 c21889 = (C21885) map2.get(strM51678);
                                                                                    if (j3 == -1) {
                                                                                        j8 = 0;
                                                                                    } else if (z7 && c21885 == null && c21889 == null) {
                                                                                        c21889 = new C21885(strM51678, 0L, j8, null, null);
                                                                                        map2.put(strM51678, c21889);
                                                                                    }
                                                                                    if (c19643 != null || treeMap.isEmpty()) {
                                                                                        str6 = str11;
                                                                                    } else {
                                                                                        C18937[] c18937Arr2 = (C18937[]) treeMap.values().toArray(new C18937[0]);
                                                                                        str6 = str11;
                                                                                        C19643 c19647 = new C19643(str6, c18937Arr2);
                                                                                        if (c19643M51685 == null) {
                                                                                            c19643M51685 = m51685(str6, c18937Arr2);
                                                                                        }
                                                                                        c19643 = c19647;
                                                                                    }
                                                                                    arrayList6.add(new C21885(strM51678, c21885 != null ? c21885 : c21889, strM516711, jLongValue, i7, j11, c19643, str12, hexString3, j8, j3, z6, arrayList4));
                                                                                    j11 += jLongValue;
                                                                                    arrayList11 = new ArrayList();
                                                                                    if (j3 != -1) {
                                                                                        j8 += j3;
                                                                                    }
                                                                                    c = 0;
                                                                                    z6 = false;
                                                                                    c12713 = c12712;
                                                                                    arrayList7 = arrayList6;
                                                                                    j10 = j29;
                                                                                    str11 = str6;
                                                                                    j3 = -1;
                                                                                    treeMap3 = treeMap;
                                                                                    str10 = str10;
                                                                                    strM516711 = str10;
                                                                                    arrayList10 = arrayList;
                                                                                    arrayList9 = arrayList2;
                                                                                    j9 = j11;
                                                                                    jLongValue = 0;
                                                                                    linkedHashMap3 = linkedHashMap2;
                                                                                }
                                                                            }
                                                                            arrayList3 = arrayList6;
                                                                        }
                                                                    } else if (c84710 == null && "PART".equals(m51680(strM29353, f74878, map))) {
                                                                        String strM51688 = m51680(strM29353, pattern2, map);
                                                                        long jM51688 = m51687(f74844, strM29353);
                                                                        long jM51689 = m51687(f74840, strM29353);
                                                                        if (str12 == null) {
                                                                            hexString = null;
                                                                        } else {
                                                                            if (str13 != null) {
                                                                                str4 = str13;
                                                                            } else {
                                                                                hexString = Long.toHexString(j10);
                                                                            }
                                                                            if (c19643 == null || treeMap3.isEmpty()) {
                                                                                str5 = str11;
                                                                            } else {
                                                                                C18937[] c18937Arr3 = (C18937[]) treeMap3.values().toArray(new C18937[0]);
                                                                                str5 = str11;
                                                                                C19643 c19648 = new C19643(str5, c18937Arr3);
                                                                                if (c19643M51685 == null) {
                                                                                    c19643M51685 = m51685(str5, c18937Arr3);
                                                                                }
                                                                                c19643 = c19648;
                                                                            }
                                                                            if (jM51688 == -1 && jM51689 == -1) {
                                                                                c8479 = c84710;
                                                                            } else {
                                                                                if (jM51688 != -1) {
                                                                                    j = jM51688;
                                                                                } else {
                                                                                    j = 0;
                                                                                }
                                                                                c8479 = new C8479(strM51688, c21885, 0L, i7, j9, c19643, str12, str4, j, jM51689, false, false, true);
                                                                            }
                                                                            arrayList5 = arrayList11;
                                                                        }
                                                                        str4 = hexString;
                                                                        if (c19643 == null) {
                                                                            str5 = str11;
                                                                        } else {
                                                                            str5 = str11;
                                                                        }
                                                                        if (jM51688 == -1) {
                                                                            if (jM51688 != -1) {
                                                                                j = jM51688;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c8479 = new C8479(strM51688, c21885, 0L, i7, j9, c19643, str12, str4, j, jM51689, false, false, true);
                                                                        } else {
                                                                            if (jM51688 != -1) {
                                                                                j = jM51688;
                                                                            } else {
                                                                                j = 0;
                                                                            }
                                                                            c8479 = new C8479(strM51688, c21885, 0L, i7, j9, c19643, str12, str4, j, jM51689, false, false, true);
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
                                                            c12713 = c12712;
                                                        }
                                                        c = 0;
                                                        c12713 = c12712;
                                                        arrayList7 = arrayList3;
                                                        linkedHashMap3 = linkedHashMap2;
                                                        str11 = str11;
                                                        arrayList11 = arrayList4;
                                                        treeMap3 = treeMap;
                                                        str10 = str10;
                                                        arrayList10 = arrayList;
                                                        arrayList9 = arrayList2;
                                                        i6 = i6;
                                                        c8479 = c84710;
                                                        c4951 = c4951;
                                                    }
                                                    c8479 = c84710;
                                                    str11 = str11;
                                                    c12713 = c12712;
                                                }
                                                c12713 = c12712;
                                                c4951 = c4951;
                                                str11 = str11;
                                                arrayList10 = arrayList10;
                                                treeMap3 = treeMap3;
                                                map2 = map2;
                                                linkedHashMap3 = linkedHashMap3;
                                                i6 = i6;
                                                c8479 = c84710;
                                                c12713 = c12713;
                                            }
                                        }
                                        c8479 = c84710;
                                    }
                                    arrayList = arrayList10;
                                    arrayList2 = arrayList9;
                                    treeMap = treeMap3;
                                    str10 = str10;
                                    arrayList3 = arrayList7;
                                    linkedHashMap2 = linkedHashMap3;
                                    arrayList4 = arrayList11;
                                    c = 0;
                                    c12713 = c12712;
                                    arrayList7 = arrayList3;
                                    linkedHashMap3 = linkedHashMap2;
                                    str11 = str11;
                                    arrayList11 = arrayList4;
                                    treeMap3 = treeMap;
                                    str10 = str10;
                                    arrayList10 = arrayList;
                                    arrayList9 = arrayList2;
                                    i6 = i6;
                                    c8479 = c84710;
                                    c4951 = c4951;
                                }
                                treeMap3 = treeMap3;
                                str11 = str11;
                                arrayList10 = arrayList10;
                                treeMap3 = treeMap3;
                                map2 = map2;
                                linkedHashMap3 = linkedHashMap3;
                                i6 = i6;
                                c8479 = c84710;
                                c12713 = c12713;
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
        C8479 c84712 = c8479;
        ArrayList arrayList20 = arrayList9;
        LinkedHashMap linkedHashMap4 = linkedHashMap3;
        ArrayList arrayList21 = arrayList10;
        ArrayList arrayList22 = arrayList7;
        ArrayList arrayList23 = arrayList11;
        HashMap map3 = new HashMap();
        int i18 = 0;
        while (i18 < arrayList20.size()) {
            ArrayList arrayList24 = arrayList20;
            C15533 c15533 = (C15533) arrayList24.get(i18);
            long size = c15533.f47465;
            if (size == -1) {
                size = (j5 + ((long) arrayList22.size())) - (arrayList23.isEmpty() ? 1L : 0L);
            }
            int size2 = c15533.f47466;
            if (size2 == -1 && j7 != -9223372036854775807L) {
                size2 = (arrayList23.isEmpty() ? ((C21885) C8882.m22955(arrayList22)).f70066 : arrayList23).size() - 1;
            }
            Uri uri3 = c15533.f47467;
            map3.put(uri3, new C15533(uri3, size, size2));
            i18++;
            arrayList20 = arrayList24;
        }
        if (c84712 != null) {
            arrayList23.add(c84712);
        }
        ArrayList arrayList25 = new ArrayList();
        Iterator it = linkedHashMap4.values().iterator();
        while (it.hasNext()) {
            C1423 c1423M15950 = ((C5657) it.next()).m15950();
            if (c1423M15950 != null) {
                arrayList25.add(c1423M15950);
            }
        }
        return new C4951(i4, str, arrayList21, j4, zM51686, jM11014, z3, i5, j5, i17, j6, j7, z4, z5, jM11014 != 0, c19643M51685, arrayList22, arrayList23, c20475, map3, arrayList25);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19643 m51685(String str, C18937[] c18937Arr) {
        C18937[] c18937Arr2 = new C18937[c18937Arr.length];
        for (int i = 0; i < c18937Arr.length; i++) {
            C18937 c18937 = c18937Arr[i];
            c18937Arr2[i] = new C18937(c18937.f59726, c18937.f59728, c18937.f59727, null);
        }
        return new C19643(str, c18937Arr2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18937 m51684(String str, String str2, HashMap map) throws C9080 {
        String strM51679 = m51679(str, f74875, "1", map);
        boolean zEquals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f74839;
        if (zEquals) {
            String strM51680 = m51680(str, pattern, map);
            return new C18937(C23875.f77203, null, "video/mp4", Base64.decode(strM51680.substring(strM51680.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = C23875.f77203;
            String str3 = C3603.f11424;
            return new C18937(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strM51679)) {
            return null;
        }
        String strM51681 = m51680(str, pattern, map);
        byte[] bArrDecode = Base64.decode(strM51681.substring(strM51681.indexOf(44)), 0);
        UUID uuid2 = C23875.f77202;
        return new C18937(uuid2, null, "video/mp4", C10750.m26947(uuid2, null, bArrDecode));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m51687(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return -1L;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51680(String str, Pattern pattern, Map map) throws C9080 {
        String strM51679 = m51679(str, pattern, (String) null, map);
        if (strM51679 != null) {
            return strM51679;
        }
        throw C9080.m23438("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51679(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : m51678(str2, map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m51677(String str, Pattern pattern, double d) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m51678(String str, Map map) {
        Matcher matcher = f74883.matcher(str);
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m51686(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return "YES".equals(matcher.group(1));
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Pattern m51681(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }
}
