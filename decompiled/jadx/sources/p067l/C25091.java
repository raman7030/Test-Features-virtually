package p067l;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.system.Os;
import com.google.android.material.motion.MotionUtils;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.᩻᩵ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBJN */
/* JADX INFO: loaded from: classes.dex */
public final class C25091 {

    /* JADX INFO: renamed from: ֫ */
    public static final Pattern f80050 = Pattern.compile("^/mnt/user/(\\d+)/emulated/(\\d+)");

    /* JADX INFO: renamed from: ۧ */
    public static final C0977 f80051 = new C0977();

    /* JADX WARN: Code duplicated, block: B:109:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:112:0x0213  */
    /* JADX WARN: Code duplicated, block: B:114:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x023d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0245  */
    /* JADX WARN: Code duplicated, block: B:122:0x025d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:135:0x00ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x01c9 A[EDGE_INSN: B:144:0x01c9->B:100:0x01c9 BREAK  A[LOOP:0: B:64:0x0104->B:147:0x0104], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x01a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x006a A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #5 {all -> 0x007a, blocks: (B:7:0x001f, B:9:0x003b, B:11:0x0047, B:13:0x0055, B:14:0x006a), top: B:141:0x001f, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0076 A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #6 {Exception -> 0x0086, blocks: (B:6:0x0015, B:16:0x0072, B:17:0x0076, B:25:0x0085, B:24:0x0082, B:21:0x007d, B:7:0x001f, B:9:0x003b, B:11:0x0047, B:13:0x0055, B:14:0x006a), top: B:142:0x0015, inners: #0, #5 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092  */
    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3 A[Catch: all -> 0x0266, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7 A[Catch: all -> 0x0266, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d3 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d8 A[Catch: all -> 0x0266, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00f4 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:66:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x0125 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:70:0x012e A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0136 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0142 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x014a A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0156 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x015e A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0163 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x016b A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0176 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0179 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0181 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:88:0x018c A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:89:0x018f A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0197 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x01a2 A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab A[Catch: Exception -> 0x01d1, all -> 0x0266, TryCatch #3 {, blocks: (B:35:0x009a, B:39:0x00a3, B:41:0x00ad, B:45:0x00b7, B:51:0x00c3, B:56:0x00d8, B:59:0x00e8, B:63:0x00f7, B:64:0x0104, B:67:0x010c, B:69:0x0125, B:98:0x01ab, B:99:0x01bf, B:70:0x012e, B:72:0x0136, B:73:0x0142, B:75:0x014a, B:76:0x0156, B:78:0x015e, B:79:0x0163, B:81:0x016b, B:83:0x0176, B:84:0x0179, B:86:0x0181, B:88:0x018c, B:89:0x018f, B:91:0x0197, B:93:0x01a2, B:100:0x01c9, B:58:0x00e2), top: B:137:0x009a }] */
    /* JADX WARN: Instruction removed from duplicated block: B:111:0x01ff, please report this as an issue */
    /* JADX INFO: renamed from: ֫ */
    public static String m55069(Uri uri) {
        String str;
        String authority;
        C16373 c16373;
        PackageInfo packageInfoM16201;
        ProviderInfo providerInfoResolveContentProvider;
        XmlResourceParser xmlResourceParserLoadXmlMetaData;
        C16373 c16374;
        int next;
        String name;
        String attributeValue;
        String attributeValue2;
        boolean z;
        File[] externalMediaDirs;
        File externalStorageDirectory;
        File[] externalCacheDirs;
        File[] externalFilesDirs;
        String absolutePath;
        String strDecode;
        File parentFile;
        File file;
        File canonicalFile;
        if (!uri.getPath().startsWith("/qauxv/tmp/")) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = C7050.m16233().openFileDescriptor(uri, "r");
                try {
                    str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                    if (str.startsWith("/mnt/user/")) {
                        Matcher matcher = f80050.matcher(str);
                        if (matcher.find() && matcher.group(1).equals(matcher.group(2))) {
                            str = "/storage" + str.substring(matcher.end(1));
                        } else {
                            if (str.startsWith("/")) {
                                parcelFileDescriptorOpenFileDescriptor.close();
                                str = null;
                            }
                            if (str != null) {
                                if (str.startsWith("/memfd:")) {
                                    return null;
                                }
                                return m55070(str);
                            }
                            synchronized (C25091.class) {
                                authority = uri.getAuthority();
                                if (authority != null) {
                                    c16373 = (C16373) f80051.getOrDefault(authority, null);
                                    if (c16373 != null) {
                                        try {
                                            packageInfoM16201 = C7050.m16201(c16373.f48113);
                                        } catch (PackageManager.NameNotFoundException unused) {
                                            packageInfoM16201 = null;
                                        }
                                        if (packageInfoM16201 != null || c16373.f48112 < packageInfoM16201.lastUpdateTime) {
                                        }
                                    } else {
                                        packageInfoM16201 = null;
                                    }
                                    providerInfoResolveContentProvider = C7050.m16217().resolveContentProvider(uri.getAuthority(), 128);
                                    if (providerInfoResolveContentProvider != null) {
                                        if (packageInfoM16201 == null && packageInfoM16201.packageName.equals(providerInfoResolveContentProvider.packageName)) {
                                            xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(C7050.m16217(), "android.support.FILE_PROVIDER_PATHS");
                                            if (xmlResourceParserLoadXmlMetaData == null) {
                                                c16374 = new C16373();
                                                c16374.f48113 = packageInfoM16201.packageName;
                                                c16374.f48112 = packageInfoM16201.lastUpdateTime;
                                                while (true) {
                                                    next = xmlResourceParserLoadXmlMetaData.next();
                                                    if (next != 1) {
                                                        break;
                                                        break;
                                                    }
                                                    if (next == 2) {
                                                        name = xmlResourceParserLoadXmlMetaData.getName();
                                                        attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                                        attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                                                        z = false;
                                                        if ("root-path".equals(name)) {
                                                            externalStorageDirectory = new File("/");
                                                        } else if ("files-path".equals(name)) {
                                                            externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "files");
                                                        } else if ("cache-path".equals(name)) {
                                                            externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "cache");
                                                        } else if ("external-path".equals(name)) {
                                                            externalStorageDirectory = Environment.getExternalStorageDirectory();
                                                        } else if ("external-files-path".equals(name)) {
                                                            externalFilesDirs = C7050.m16232().getExternalFilesDirs(null);
                                                            if (externalFilesDirs.length > 0) {
                                                                externalStorageDirectory = externalFilesDirs[0];
                                                                z = true;
                                                            } else {
                                                                externalStorageDirectory = null;
                                                            }
                                                        } else if ("external-cache-path".equals(name)) {
                                                            externalCacheDirs = C7050.m16232().getExternalCacheDirs();
                                                            if (externalCacheDirs.length > 0) {
                                                                externalStorageDirectory = externalCacheDirs[0];
                                                                z = true;
                                                            } else {
                                                                externalStorageDirectory = null;
                                                            }
                                                        } else {
                                                            if ("external-media-path".equals(name)) {
                                                                externalMediaDirs = C7050.m16232().getExternalMediaDirs();
                                                                if (externalMediaDirs.length > 0) {
                                                                    externalStorageDirectory = externalMediaDirs[0];
                                                                    z = true;
                                                                }
                                                            }
                                                            externalStorageDirectory = null;
                                                        }
                                                        if (externalStorageDirectory == null) {
                                                            if (z) {
                                                                externalStorageDirectory = new File(externalStorageDirectory.getPath().replace(C7050.m16234(), providerInfoResolveContentProvider.packageName));
                                                            }
                                                            c16374.put(attributeValue, new File(externalStorageDirectory, attributeValue2));
                                                        }
                                                    }
                                                }
                                                f80051.put(authority, c16374);
                                                c16373 = c16374;
                                            }
                                        } else {
                                            try {
                                                packageInfoM16201 = C7050.m16201(providerInfoResolveContentProvider.packageName);
                                                xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(C7050.m16217(), "android.support.FILE_PROVIDER_PATHS");
                                                if (xmlResourceParserLoadXmlMetaData == null) {
                                                    try {
                                                        c16374 = new C16373();
                                                        c16374.f48113 = packageInfoM16201.packageName;
                                                        c16374.f48112 = packageInfoM16201.lastUpdateTime;
                                                        while (true) {
                                                            next = xmlResourceParserLoadXmlMetaData.next();
                                                            if (next != 1) {
                                                                break;
                                                            }
                                                            if (next == 2) {
                                                                name = xmlResourceParserLoadXmlMetaData.getName();
                                                                attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                                                attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                                                                z = false;
                                                                if ("root-path".equals(name)) {
                                                                    externalStorageDirectory = new File("/");
                                                                } else if ("files-path".equals(name)) {
                                                                    externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "files");
                                                                } else if ("cache-path".equals(name)) {
                                                                    externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "cache");
                                                                } else if ("external-path".equals(name)) {
                                                                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                                                                } else if ("external-files-path".equals(name)) {
                                                                    externalFilesDirs = C7050.m16232().getExternalFilesDirs(null);
                                                                    if (externalFilesDirs.length > 0) {
                                                                        externalStorageDirectory = externalFilesDirs[0];
                                                                        z = true;
                                                                    } else {
                                                                        externalStorageDirectory = null;
                                                                    }
                                                                } else if ("external-cache-path".equals(name)) {
                                                                    externalCacheDirs = C7050.m16232().getExternalCacheDirs();
                                                                    if (externalCacheDirs.length > 0) {
                                                                        externalStorageDirectory = externalCacheDirs[0];
                                                                        z = true;
                                                                    } else {
                                                                        externalStorageDirectory = null;
                                                                    }
                                                                } else {
                                                                    if ("external-media-path".equals(name)) {
                                                                        externalMediaDirs = C7050.m16232().getExternalMediaDirs();
                                                                        if (externalMediaDirs.length > 0) {
                                                                            externalStorageDirectory = externalMediaDirs[0];
                                                                            z = true;
                                                                        }
                                                                    }
                                                                    externalStorageDirectory = null;
                                                                }
                                                                if (externalStorageDirectory == null) {
                                                                    if (z) {
                                                                        externalStorageDirectory = new File(externalStorageDirectory.getPath().replace(C7050.m16234(), providerInfoResolveContentProvider.packageName));
                                                                    }
                                                                    c16374.put(attributeValue, new File(externalStorageDirectory, attributeValue2));
                                                                }
                                                            }
                                                        }
                                                        f80051.put(authority, c16374);
                                                        c16373 = c16374;
                                                    } catch (Exception unused2) {
                                                        c16373 = null;
                                                    }
                                                }
                                            } catch (PackageManager.NameNotFoundException unused3) {
                                            }
                                        }
                                    }
                                }
                                c16373 = null;
                            }
                            if (c16373 == null) {
                                absolutePath = null;
                            } else {
                                String encodedPath = uri.getEncodedPath();
                                C12826.requireNonNull(encodedPath);
                                int iIndexOf = encodedPath.indexOf(47, 1);
                                String strDecode2 = Uri.decode(encodedPath.substring(1, iIndexOf));
                                strDecode = Uri.decode(encodedPath.substring(iIndexOf + 1));
                                parentFile = (File) c16373.getOrDefault(strDecode2, null);
                                if (parentFile == null) {
                                    System.err.println("Unable to find configured root for " + uri);
                                } else {
                                    if (parentFile.getPath().endsWith("/.")) {
                                        parentFile = parentFile.getParentFile();
                                        C12826.requireNonNull(parentFile);
                                    }
                                    file = new File(parentFile, strDecode);
                                    try {
                                        canonicalFile = file.getCanonicalFile();
                                        if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                            absolutePath = canonicalFile.getAbsolutePath();
                                        } else {
                                            System.err.println("Resolved path jumped beyond configured root");
                                        }
                                    } catch (IOException unused4) {
                                        System.err.println("Failed to resolve canonical path for " + file);
                                    }
                                }
                                absolutePath = null;
                            }
                            if (absolutePath != null) {
                                return m55070(absolutePath);
                            }
                        }
                    } else {
                        if (str.startsWith("/")) {
                            parcelFileDescriptorOpenFileDescriptor.close();
                            str = null;
                        }
                        if (str != null) {
                            if (str.startsWith("/memfd:")) {
                                return null;
                            }
                            return m55070(str);
                        }
                        synchronized (C25091.class) {
                            authority = uri.getAuthority();
                            if (authority != null) {
                                c16373 = (C16373) f80051.getOrDefault(authority, null);
                                if (c16373 != null) {
                                    packageInfoM16201 = C7050.m16201(c16373.f48113);
                                    if (packageInfoM16201 != null) {
                                    }
                                    if (c16373 == null) {
                                        absolutePath = null;
                                    } else {
                                        String encodedPath2 = uri.getEncodedPath();
                                        C12826.requireNonNull(encodedPath2);
                                        int iIndexOf2 = encodedPath2.indexOf(47, 1);
                                        String strDecode3 = Uri.decode(encodedPath2.substring(1, iIndexOf2));
                                        strDecode = Uri.decode(encodedPath2.substring(iIndexOf2 + 1));
                                        parentFile = (File) c16373.getOrDefault(strDecode3, null);
                                        if (parentFile == null) {
                                            System.err.println("Unable to find configured root for " + uri);
                                        } else {
                                            if (parentFile.getPath().endsWith("/.")) {
                                                parentFile = parentFile.getParentFile();
                                                C12826.requireNonNull(parentFile);
                                            }
                                            file = new File(parentFile, strDecode);
                                            canonicalFile = file.getCanonicalFile();
                                            if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                                System.err.println("Resolved path jumped beyond configured root");
                                            } else {
                                                absolutePath = canonicalFile.getAbsolutePath();
                                            }
                                        }
                                        absolutePath = null;
                                    }
                                    if (absolutePath != null) {
                                        return m55070(absolutePath);
                                    }
                                } else {
                                    packageInfoM16201 = null;
                                }
                                providerInfoResolveContentProvider = C7050.m16217().resolveContentProvider(uri.getAuthority(), 128);
                                if (providerInfoResolveContentProvider != null) {
                                    if (packageInfoM16201 == null) {
                                        packageInfoM16201 = C7050.m16201(providerInfoResolveContentProvider.packageName);
                                        xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(C7050.m16217(), "android.support.FILE_PROVIDER_PATHS");
                                        if (xmlResourceParserLoadXmlMetaData == null) {
                                            c16374 = new C16373();
                                            c16374.f48113 = packageInfoM16201.packageName;
                                            c16374.f48112 = packageInfoM16201.lastUpdateTime;
                                            while (true) {
                                                next = xmlResourceParserLoadXmlMetaData.next();
                                                if (next != 1) {
                                                    break;
                                                    break;
                                                }
                                                if (next == 2) {
                                                    name = xmlResourceParserLoadXmlMetaData.getName();
                                                    attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                                    attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                                                    z = false;
                                                    if ("root-path".equals(name)) {
                                                        externalStorageDirectory = new File("/");
                                                    } else if ("files-path".equals(name)) {
                                                        externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "files");
                                                    } else if ("cache-path".equals(name)) {
                                                        externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "cache");
                                                    } else if ("external-path".equals(name)) {
                                                        externalStorageDirectory = Environment.getExternalStorageDirectory();
                                                    } else if ("external-files-path".equals(name)) {
                                                        externalFilesDirs = C7050.m16232().getExternalFilesDirs(null);
                                                        if (externalFilesDirs.length > 0) {
                                                            externalStorageDirectory = externalFilesDirs[0];
                                                            z = true;
                                                        } else {
                                                            externalStorageDirectory = null;
                                                        }
                                                    } else if ("external-cache-path".equals(name)) {
                                                        externalCacheDirs = C7050.m16232().getExternalCacheDirs();
                                                        if (externalCacheDirs.length > 0) {
                                                            externalStorageDirectory = externalCacheDirs[0];
                                                            z = true;
                                                        } else {
                                                            externalStorageDirectory = null;
                                                        }
                                                    } else {
                                                        if ("external-media-path".equals(name)) {
                                                            externalMediaDirs = C7050.m16232().getExternalMediaDirs();
                                                            if (externalMediaDirs.length > 0) {
                                                                externalStorageDirectory = externalMediaDirs[0];
                                                                z = true;
                                                            }
                                                        }
                                                        externalStorageDirectory = null;
                                                    }
                                                    if (externalStorageDirectory == null) {
                                                        if (z) {
                                                            externalStorageDirectory = new File(externalStorageDirectory.getPath().replace(C7050.m16234(), providerInfoResolveContentProvider.packageName));
                                                        }
                                                        c16374.put(attributeValue, new File(externalStorageDirectory, attributeValue2));
                                                    }
                                                }
                                            }
                                            f80051.put(authority, c16374);
                                            c16373 = c16374;
                                            if (c16373 == null) {
                                                absolutePath = null;
                                            } else {
                                                String encodedPath3 = uri.getEncodedPath();
                                                C12826.requireNonNull(encodedPath3);
                                                int iIndexOf3 = encodedPath3.indexOf(47, 1);
                                                String strDecode4 = Uri.decode(encodedPath3.substring(1, iIndexOf3));
                                                strDecode = Uri.decode(encodedPath3.substring(iIndexOf3 + 1));
                                                parentFile = (File) c16373.getOrDefault(strDecode4, null);
                                                if (parentFile == null) {
                                                    System.err.println("Unable to find configured root for " + uri);
                                                } else {
                                                    if (parentFile.getPath().endsWith("/.")) {
                                                        parentFile = parentFile.getParentFile();
                                                        C12826.requireNonNull(parentFile);
                                                    }
                                                    file = new File(parentFile, strDecode);
                                                    canonicalFile = file.getCanonicalFile();
                                                    if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                                        System.err.println("Resolved path jumped beyond configured root");
                                                    } else {
                                                        absolutePath = canonicalFile.getAbsolutePath();
                                                    }
                                                }
                                                absolutePath = null;
                                            }
                                            if (absolutePath != null) {
                                                return m55070(absolutePath);
                                            }
                                        }
                                    } else {
                                        packageInfoM16201 = C7050.m16201(providerInfoResolveContentProvider.packageName);
                                        xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(C7050.m16217(), "android.support.FILE_PROVIDER_PATHS");
                                        if (xmlResourceParserLoadXmlMetaData == null) {
                                            c16374 = new C16373();
                                            c16374.f48113 = packageInfoM16201.packageName;
                                            c16374.f48112 = packageInfoM16201.lastUpdateTime;
                                            while (true) {
                                                next = xmlResourceParserLoadXmlMetaData.next();
                                                if (next != 1) {
                                                    break;
                                                    break;
                                                }
                                                if (next == 2) {
                                                    name = xmlResourceParserLoadXmlMetaData.getName();
                                                    attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                                    attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                                                    z = false;
                                                    if ("root-path".equals(name)) {
                                                        externalStorageDirectory = new File("/");
                                                    } else if ("files-path".equals(name)) {
                                                        externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "files");
                                                    } else if ("cache-path".equals(name)) {
                                                        externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "cache");
                                                    } else if ("external-path".equals(name)) {
                                                        externalStorageDirectory = Environment.getExternalStorageDirectory();
                                                    } else if ("external-files-path".equals(name)) {
                                                        externalFilesDirs = C7050.m16232().getExternalFilesDirs(null);
                                                        if (externalFilesDirs.length > 0) {
                                                            externalStorageDirectory = externalFilesDirs[0];
                                                            z = true;
                                                        } else {
                                                            externalStorageDirectory = null;
                                                        }
                                                    } else if ("external-cache-path".equals(name)) {
                                                        externalCacheDirs = C7050.m16232().getExternalCacheDirs();
                                                        if (externalCacheDirs.length > 0) {
                                                            externalStorageDirectory = externalCacheDirs[0];
                                                            z = true;
                                                        } else {
                                                            externalStorageDirectory = null;
                                                        }
                                                    } else {
                                                        if ("external-media-path".equals(name)) {
                                                            externalMediaDirs = C7050.m16232().getExternalMediaDirs();
                                                            if (externalMediaDirs.length > 0) {
                                                                externalStorageDirectory = externalMediaDirs[0];
                                                                z = true;
                                                            }
                                                        }
                                                        externalStorageDirectory = null;
                                                    }
                                                    if (externalStorageDirectory == null) {
                                                        if (z) {
                                                            externalStorageDirectory = new File(externalStorageDirectory.getPath().replace(C7050.m16234(), providerInfoResolveContentProvider.packageName));
                                                        }
                                                        c16374.put(attributeValue, new File(externalStorageDirectory, attributeValue2));
                                                    }
                                                }
                                            }
                                            f80051.put(authority, c16374);
                                            c16373 = c16374;
                                            if (c16373 == null) {
                                                absolutePath = null;
                                            } else {
                                                String encodedPath4 = uri.getEncodedPath();
                                                C12826.requireNonNull(encodedPath4);
                                                int iIndexOf4 = encodedPath4.indexOf(47, 1);
                                                String strDecode5 = Uri.decode(encodedPath4.substring(1, iIndexOf4));
                                                strDecode = Uri.decode(encodedPath4.substring(iIndexOf4 + 1));
                                                parentFile = (File) c16373.getOrDefault(strDecode5, null);
                                                if (parentFile == null) {
                                                    System.err.println("Unable to find configured root for " + uri);
                                                } else {
                                                    if (parentFile.getPath().endsWith("/.")) {
                                                        parentFile = parentFile.getParentFile();
                                                        C12826.requireNonNull(parentFile);
                                                    }
                                                    file = new File(parentFile, strDecode);
                                                    canonicalFile = file.getCanonicalFile();
                                                    if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                                        System.err.println("Resolved path jumped beyond configured root");
                                                    } else {
                                                        absolutePath = canonicalFile.getAbsolutePath();
                                                    }
                                                }
                                                absolutePath = null;
                                            }
                                            if (absolutePath != null) {
                                                return m55070(absolutePath);
                                            }
                                        }
                                    }
                                }
                            }
                            c16373 = null;
                            if (c16373 == null) {
                                absolutePath = null;
                            } else {
                                String encodedPath5 = uri.getEncodedPath();
                                C12826.requireNonNull(encodedPath5);
                                int iIndexOf5 = encodedPath5.indexOf(47, 1);
                                String strDecode6 = Uri.decode(encodedPath5.substring(1, iIndexOf5));
                                strDecode = Uri.decode(encodedPath5.substring(iIndexOf5 + 1));
                                parentFile = (File) c16373.getOrDefault(strDecode6, null);
                                if (parentFile == null) {
                                    System.err.println("Unable to find configured root for " + uri);
                                } else {
                                    if (parentFile.getPath().endsWith("/.")) {
                                        parentFile = parentFile.getParentFile();
                                        C12826.requireNonNull(parentFile);
                                    }
                                    file = new File(parentFile, strDecode);
                                    canonicalFile = file.getCanonicalFile();
                                    if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                        System.err.println("Resolved path jumped beyond configured root");
                                    } else {
                                        absolutePath = canonicalFile.getAbsolutePath();
                                    }
                                }
                                absolutePath = null;
                            }
                            if (absolutePath != null) {
                                return m55070(absolutePath);
                            }
                        }
                    }
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            }
            if (str != null) {
                if (str.startsWith("/memfd:")) {
                    return null;
                }
                return m55070(str);
            }
            synchronized (C25091.class) {
                authority = uri.getAuthority();
                if (authority != null) {
                    c16373 = (C16373) f80051.getOrDefault(authority, null);
                    if (c16373 != null) {
                        packageInfoM16201 = C7050.m16201(c16373.f48113);
                        if (packageInfoM16201 != null) {
                        }
                        if (c16373 == null) {
                            absolutePath = null;
                        } else {
                            String encodedPath6 = uri.getEncodedPath();
                            C12826.requireNonNull(encodedPath6);
                            int iIndexOf6 = encodedPath6.indexOf(47, 1);
                            String strDecode7 = Uri.decode(encodedPath6.substring(1, iIndexOf6));
                            strDecode = Uri.decode(encodedPath6.substring(iIndexOf6 + 1));
                            parentFile = (File) c16373.getOrDefault(strDecode7, null);
                            if (parentFile == null) {
                                System.err.println("Unable to find configured root for " + uri);
                            } else {
                                if (parentFile.getPath().endsWith("/.")) {
                                    parentFile = parentFile.getParentFile();
                                    C12826.requireNonNull(parentFile);
                                }
                                file = new File(parentFile, strDecode);
                                canonicalFile = file.getCanonicalFile();
                                if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                    System.err.println("Resolved path jumped beyond configured root");
                                } else {
                                    absolutePath = canonicalFile.getAbsolutePath();
                                }
                            }
                            absolutePath = null;
                        }
                        if (absolutePath != null) {
                            return m55070(absolutePath);
                        }
                    } else {
                        packageInfoM16201 = null;
                    }
                    providerInfoResolveContentProvider = C7050.m16217().resolveContentProvider(uri.getAuthority(), 128);
                    if (providerInfoResolveContentProvider != null) {
                        if (packageInfoM16201 == null) {
                            packageInfoM16201 = C7050.m16201(providerInfoResolveContentProvider.packageName);
                            xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(C7050.m16217(), "android.support.FILE_PROVIDER_PATHS");
                            if (xmlResourceParserLoadXmlMetaData == null) {
                                c16374 = new C16373();
                                c16374.f48113 = packageInfoM16201.packageName;
                                c16374.f48112 = packageInfoM16201.lastUpdateTime;
                                while (true) {
                                    next = xmlResourceParserLoadXmlMetaData.next();
                                    if (next != 1) {
                                        break;
                                        break;
                                    }
                                    if (next == 2) {
                                        name = xmlResourceParserLoadXmlMetaData.getName();
                                        attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                        attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                                        z = false;
                                        if ("root-path".equals(name)) {
                                            externalStorageDirectory = new File("/");
                                        } else if ("files-path".equals(name)) {
                                            externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "files");
                                        } else if ("cache-path".equals(name)) {
                                            externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "cache");
                                        } else if ("external-path".equals(name)) {
                                            externalStorageDirectory = Environment.getExternalStorageDirectory();
                                        } else if ("external-files-path".equals(name)) {
                                            externalFilesDirs = C7050.m16232().getExternalFilesDirs(null);
                                            if (externalFilesDirs.length > 0) {
                                                externalStorageDirectory = externalFilesDirs[0];
                                                z = true;
                                            } else {
                                                externalStorageDirectory = null;
                                            }
                                        } else if ("external-cache-path".equals(name)) {
                                            externalCacheDirs = C7050.m16232().getExternalCacheDirs();
                                            if (externalCacheDirs.length > 0) {
                                                externalStorageDirectory = externalCacheDirs[0];
                                                z = true;
                                            } else {
                                                externalStorageDirectory = null;
                                            }
                                        } else {
                                            if ("external-media-path".equals(name)) {
                                                externalMediaDirs = C7050.m16232().getExternalMediaDirs();
                                                if (externalMediaDirs.length > 0) {
                                                    externalStorageDirectory = externalMediaDirs[0];
                                                    z = true;
                                                }
                                            }
                                            externalStorageDirectory = null;
                                        }
                                        if (externalStorageDirectory == null) {
                                            if (z) {
                                                externalStorageDirectory = new File(externalStorageDirectory.getPath().replace(C7050.m16234(), providerInfoResolveContentProvider.packageName));
                                            }
                                            c16374.put(attributeValue, new File(externalStorageDirectory, attributeValue2));
                                        }
                                    }
                                }
                                f80051.put(authority, c16374);
                                c16373 = c16374;
                                if (c16373 == null) {
                                    absolutePath = null;
                                } else {
                                    String encodedPath7 = uri.getEncodedPath();
                                    C12826.requireNonNull(encodedPath7);
                                    int iIndexOf7 = encodedPath7.indexOf(47, 1);
                                    String strDecode8 = Uri.decode(encodedPath7.substring(1, iIndexOf7));
                                    strDecode = Uri.decode(encodedPath7.substring(iIndexOf7 + 1));
                                    parentFile = (File) c16373.getOrDefault(strDecode8, null);
                                    if (parentFile == null) {
                                        System.err.println("Unable to find configured root for " + uri);
                                    } else {
                                        if (parentFile.getPath().endsWith("/.")) {
                                            parentFile = parentFile.getParentFile();
                                            C12826.requireNonNull(parentFile);
                                        }
                                        file = new File(parentFile, strDecode);
                                        canonicalFile = file.getCanonicalFile();
                                        if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                            System.err.println("Resolved path jumped beyond configured root");
                                        } else {
                                            absolutePath = canonicalFile.getAbsolutePath();
                                        }
                                    }
                                    absolutePath = null;
                                }
                                if (absolutePath != null) {
                                    return m55070(absolutePath);
                                }
                            }
                        } else {
                            packageInfoM16201 = C7050.m16201(providerInfoResolveContentProvider.packageName);
                            xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(C7050.m16217(), "android.support.FILE_PROVIDER_PATHS");
                            if (xmlResourceParserLoadXmlMetaData == null) {
                                c16374 = new C16373();
                                c16374.f48113 = packageInfoM16201.packageName;
                                c16374.f48112 = packageInfoM16201.lastUpdateTime;
                                while (true) {
                                    next = xmlResourceParserLoadXmlMetaData.next();
                                    if (next != 1) {
                                        break;
                                        break;
                                    }
                                    if (next == 2) {
                                        name = xmlResourceParserLoadXmlMetaData.getName();
                                        attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                                        attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, MotionUtils.EASING_TYPE_PATH);
                                        z = false;
                                        if ("root-path".equals(name)) {
                                            externalStorageDirectory = new File("/");
                                        } else if ("files-path".equals(name)) {
                                            externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "files");
                                        } else if ("cache-path".equals(name)) {
                                            externalStorageDirectory = new File(providerInfoResolveContentProvider.applicationInfo.dataDir, "cache");
                                        } else if ("external-path".equals(name)) {
                                            externalStorageDirectory = Environment.getExternalStorageDirectory();
                                        } else if ("external-files-path".equals(name)) {
                                            externalFilesDirs = C7050.m16232().getExternalFilesDirs(null);
                                            if (externalFilesDirs.length > 0) {
                                                externalStorageDirectory = externalFilesDirs[0];
                                                z = true;
                                            } else {
                                                externalStorageDirectory = null;
                                            }
                                        } else if ("external-cache-path".equals(name)) {
                                            externalCacheDirs = C7050.m16232().getExternalCacheDirs();
                                            if (externalCacheDirs.length > 0) {
                                                externalStorageDirectory = externalCacheDirs[0];
                                                z = true;
                                            } else {
                                                externalStorageDirectory = null;
                                            }
                                        } else {
                                            if ("external-media-path".equals(name)) {
                                                externalMediaDirs = C7050.m16232().getExternalMediaDirs();
                                                if (externalMediaDirs.length > 0) {
                                                    externalStorageDirectory = externalMediaDirs[0];
                                                    z = true;
                                                }
                                            }
                                            externalStorageDirectory = null;
                                        }
                                        if (externalStorageDirectory == null) {
                                            if (z) {
                                                externalStorageDirectory = new File(externalStorageDirectory.getPath().replace(C7050.m16234(), providerInfoResolveContentProvider.packageName));
                                            }
                                            c16374.put(attributeValue, new File(externalStorageDirectory, attributeValue2));
                                        }
                                    }
                                }
                                f80051.put(authority, c16374);
                                c16373 = c16374;
                                if (c16373 == null) {
                                    absolutePath = null;
                                } else {
                                    String encodedPath8 = uri.getEncodedPath();
                                    C12826.requireNonNull(encodedPath8);
                                    int iIndexOf8 = encodedPath8.indexOf(47, 1);
                                    String strDecode9 = Uri.decode(encodedPath8.substring(1, iIndexOf8));
                                    strDecode = Uri.decode(encodedPath8.substring(iIndexOf8 + 1));
                                    parentFile = (File) c16373.getOrDefault(strDecode9, null);
                                    if (parentFile == null) {
                                        System.err.println("Unable to find configured root for " + uri);
                                    } else {
                                        if (parentFile.getPath().endsWith("/.")) {
                                            parentFile = parentFile.getParentFile();
                                            C12826.requireNonNull(parentFile);
                                        }
                                        file = new File(parentFile, strDecode);
                                        canonicalFile = file.getCanonicalFile();
                                        if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                                            System.err.println("Resolved path jumped beyond configured root");
                                        } else {
                                            absolutePath = canonicalFile.getAbsolutePath();
                                        }
                                    }
                                    absolutePath = null;
                                }
                                if (absolutePath != null) {
                                    return m55070(absolutePath);
                                }
                            }
                        }
                    }
                }
                c16373 = null;
                if (c16373 == null) {
                    absolutePath = null;
                } else {
                    String encodedPath9 = uri.getEncodedPath();
                    C12826.requireNonNull(encodedPath9);
                    int iIndexOf9 = encodedPath9.indexOf(47, 1);
                    String strDecode10 = Uri.decode(encodedPath9.substring(1, iIndexOf9));
                    strDecode = Uri.decode(encodedPath9.substring(iIndexOf9 + 1));
                    parentFile = (File) c16373.getOrDefault(strDecode10, null);
                    if (parentFile == null) {
                        System.err.println("Unable to find configured root for " + uri);
                    } else {
                        if (parentFile.getPath().endsWith("/.")) {
                            parentFile = parentFile.getParentFile();
                            C12826.requireNonNull(parentFile);
                        }
                        file = new File(parentFile, strDecode);
                        canonicalFile = file.getCanonicalFile();
                        if (canonicalFile.getPath().startsWith(parentFile.getPath())) {
                            System.err.println("Resolved path jumped beyond configured root");
                        } else {
                            absolutePath = canonicalFile.getAbsolutePath();
                        }
                    }
                    absolutePath = null;
                }
                if (absolutePath != null) {
                    return m55070(absolutePath);
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m55070(String str) {
        String strM42102;
        if (!C18524.m42129() || str.indexOf("\u200bAndroid") < 0 || (strM42102 = C18524.m42102(str)) == null || (!strM42102.equals("\u200bAndroid") && !strM42102.startsWith("\u200bAndroid/"))) {
            return str;
        }
        int length = str.length() - strM42102.length();
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, length));
        sb.append(AnalyticsConstants.SDK_TYPE);
        return C21459.m48621(length + 8, str, sb);
    }
}
