package l;

import com.alipay.sdk.m.y.l;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܶ֫' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.֡ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H7RN */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC0121 {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1125;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1126;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1127;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1128;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1129;

    /* JADX INFO: renamed from: ֫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1130;

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1131;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1132;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1133;

    /* JADX INFO: renamed from: ۖܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1134;

    /* JADX INFO: renamed from: ۗ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1135;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1136;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1137;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1138;

    /* JADX INFO: renamed from: ۘܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1139;

    /* JADX INFO: renamed from: ۙ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1140;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1141;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1142;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public static final String f1143 = "  ";

    /* JADX INFO: renamed from: ۛ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1144;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1145;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1146;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1147;

    /* JADX INFO: renamed from: ۜܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1148;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1149;

    /* JADX INFO: renamed from: ۟֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1150;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1151;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1152;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1153;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public static final int f1154 = 28;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1155;

    /* JADX INFO: renamed from: ۡܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1156;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1157;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1158;

    /* JADX INFO: renamed from: ۢܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1159;

    /* JADX INFO: renamed from: ۤ֫, reason: not valid java name and contains not printable characters */
    public static final String f1160 = "        ";

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1161;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1162;

    /* JADX INFO: renamed from: ۧۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1163;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1164;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0121[] f1165;

    /* JADX INFO: renamed from: ۨ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1166;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1167;

    /* JADX INFO: renamed from: ۫֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1168;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1169;

    /* JADX INFO: renamed from: ۬֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1170;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1171;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1172;

    /* JADX INFO: renamed from: ܰ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1173;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1174;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public static final String f1175 = "  %-28s %s";

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1176;

    /* JADX INFO: renamed from: ܳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1177;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1178;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1179;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1180;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1181;

    /* JADX INFO: renamed from: ܺܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1182;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1183;

    /* JADX INFO: renamed from: ܽۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1184;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1185;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1186;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1187;

    /* JADX INFO: renamed from: ܿܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1188;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1189;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1190;

    /* JADX INFO: renamed from: ᩳܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1191;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1192;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1193;

    /* JADX INFO: renamed from: ᩴܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1194;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1195;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1196;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1197;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1198;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public static final int f1199 = 80;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1200;

    /* JADX INFO: renamed from: ᩷ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1201;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1202;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1203;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1204;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1205;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1206;

    /* JADX INFO: renamed from: ᩺֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1207;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1208;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1209;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1210;

    /* JADX INFO: renamed from: ᩻ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC0121 f1211;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f1212;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f1213;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f1214;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String[] f1215;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final EnumC18467 f1216;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final EnumC3650 f1217;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC8589 f1218;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final EnumC9295 f1219;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f1220;

    public /* synthetic */ EnumC0121(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, int i2) {
        this(str, i, str2, str3, str4, enumC18467, enumC3650);
    }

    public /* synthetic */ EnumC0121(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295, int i2) {
        this(str, i, str2, str3, str4, enumC18467, enumC3650, enumC9295);
    }

    public /* synthetic */ EnumC0121(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650, int i2) {
        this(str, i, str2, str3, enumC18467, enumC3650);
    }

    public /* synthetic */ EnumC0121(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295, int i2) {
        this(str, i, str2, str3, enumC18467, enumC3650, enumC9295);
    }

    public static EnumC0121 valueOf(String str) {
        return (EnumC0121) Enum.valueOf(EnumC0121.class, str);
    }

    public static EnumC0121[] values() {
        return (EnumC0121[]) f1165.clone();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0121[] m1174() {
        return new EnumC0121[]{f1178, f1204, f1202, f1188, f1177, f1131, f1164, f1185, f1163, f1141, f1180, f1186, f1179, f1173, f1207, f1198, f1203, f1187, f1189, f1208, f1167, f1145, f1127, f1192, f1142, f1137, f1200, f1158, f1181, f1155, f1190, f1209, f1196, f1197, f1170, f1125, f1128, f1205, f1193, f1210, f1133, f1136, f1152, f1140, f1206, f1157, f1161, f1135, f1168, f1150, f1169, f1138, f1195, f1147, f1171, f1211, f1148, f1139, f1156, f1134, f1182, f1159, f1194, f1201, f1184, f1191, f1176, f1151, f1146, f1126, f1132, f1174, f1172, f1129, f1162, f1166, f1149, f1144, f1183, f1153, f1130};
    }

    static {
        EnumC18467 enumC18467 = EnumC18467.STANDARD;
        EnumC3650 enumC3650 = EnumC3650.BASIC;
        f1178 = new EnumC0121("G", 0, "-g", "opt.g", enumC18467, enumC3650);
        f1204 = new C8980(enumC18467, enumC3650);
        EnumC8589 enumC8589 = EnumC8589.ANYOF;
        f1202 = new EnumC0121("G_CUSTOM", 2, "-g:", "opt.g.lines.vars.source", enumC18467, enumC3650, enumC8589, "lines", "vars", "source");
        EnumC18467 enumC18468 = EnumC18467.EXTENDED;
        f1188 = new EnumC0121("XLINT", 3, "-Xlint", "opt.Xlint", enumC18468, enumC3650);
        f1177 = new EnumC0121("XLINT_CUSTOM", 4, "-Xlint:", "opt.arg.Xlint", "opt.Xlint.custom", enumC18468, enumC3650, enumC8589, m1155());
        f1131 = new EnumC0121("XDOCLINT", 5, "-Xdoclint", "opt.Xdoclint", enumC18468, enumC3650);
        f1164 = new C21680(enumC18468, enumC3650);
        f1185 = new C23090(enumC18468, enumC3650);
        f1163 = new C13917(enumC18467, enumC3650);
        f1141 = new EnumC0121("VERBOSE", 9, "-verbose", "opt.verbose", enumC18467, enumC3650);
        f1180 = new C7568(enumC18467, enumC3650);
        EnumC3650 enumC3651 = EnumC3650.FILEMANAGER;
        f1186 = new EnumC0121("CLASS_PATH", 11, "--class-path -classpath -cp", "opt.arg.path", "opt.classpath", enumC18467, enumC3651);
        f1179 = new EnumC0121("SOURCE_PATH", 12, "--source-path -sourcepath", "opt.arg.path", "opt.sourcepath", enumC18467, enumC3651);
        f1173 = new C17055(enumC18467, enumC3651);
        f1207 = new EnumC0121("MODULE_PATH", 14, "--module-path -p", "opt.arg.path", "opt.modulepath", enumC18467, enumC3651);
        f1198 = new EnumC0121("UPGRADE_MODULE_PATH", 15, "--upgrade-module-path", "opt.arg.path", "opt.upgrademodulepath", enumC18467, enumC3651);
        f1203 = new EnumC0121("SYSTEM", 16, "--system", "opt.arg.jdk", "opt.system", enumC18467, enumC3651);
        f1187 = new C23405(enumC18468, enumC3651);
        f1189 = new C6472(enumC18467, enumC3651);
        f1208 = new EnumC0121("XBOOTCLASSPATH_PREPEND", 19, "-Xbootclasspath/p:", "opt.arg.path", "opt.Xbootclasspath.p", enumC18468, enumC3651);
        f1167 = new EnumC0121("XBOOTCLASSPATH_APPEND", 20, "-Xbootclasspath/a:", "opt.arg.path", "opt.Xbootclasspath.a", enumC18468, enumC3651);
        f1145 = new C20584(enumC18468, enumC3651);
        f1127 = new EnumC0121("EXTDIRS", 22, "-extdirs", "opt.arg.dirs", "opt.extdirs", enumC18467, enumC3651);
        f1192 = new C7363(enumC18468, enumC3651);
        f1142 = new EnumC0121("ENDORSEDDIRS", 24, "-endorseddirs", "opt.arg.dirs", "opt.endorseddirs", enumC18467, enumC3651);
        f1137 = new C1924(enumC18468, enumC3651);
        EnumC8589 enumC85810 = EnumC8589.ONEOF;
        f1200 = new EnumC0121("PROC", 26, "-proc:", "opt.proc.none.only", enumC18467, enumC3650, enumC85810, "none", "only", "full");
        f1158 = new EnumC0121("PROCESSOR", 27, "-processor", "opt.arg.class.list", "opt.processor", enumC18467, enumC3650);
        f1181 = new EnumC0121("PROCESSOR_PATH", 28, "--processor-path -processorpath", "opt.arg.path", "opt.processorpath", enumC18467, enumC3651);
        f1155 = new EnumC0121("PROCESSOR_MODULE_PATH", 29, "--processor-module-path", "opt.arg.path", "opt.processormodulepath", enumC18467, enumC3651);
        f1190 = new EnumC0121("PARAMETERS", 30, "-parameters", "opt.parameters", enumC18467, enumC3650);
        f1209 = new EnumC0121("D", 31, "-d", "opt.arg.directory", "opt.d", enumC18467, enumC3651);
        f1196 = new EnumC0121("S", 32, "-s", "opt.arg.directory", "opt.sourceDest", enumC18467, enumC3651);
        f1197 = new EnumC0121("H", 33, "-h", "opt.arg.directory", "opt.headerDest", enumC18467, enumC3651);
        f1170 = new EnumC0121("IMPLICIT", 34, "-implicit:", "opt.implicit", enumC18467, enumC3650, enumC85810, "none", Name.LABEL);
        f1125 = new EnumC0121("ENCODING", 35, "-encoding", "opt.arg.encoding", "opt.encoding", enumC18467, enumC3651);
        f1128 = new C11097(enumC18467, enumC3650);
        f1205 = new C16740(enumC18467, enumC3650);
        f1193 = new C17446(enumC18467, enumC3650);
        f1210 = new EnumC0121("PREVIEW", 39, "--enable-preview", "opt.preview", enumC18467, enumC3650);
        f1133 = new C14623(enumC18467, enumC3650);
        EnumC3650 enumC3652 = EnumC3650.INFO;
        f1136 = new C23796(enumC18467, enumC3652);
        EnumC18467 enumC18469 = EnumC18467.HIDDEN;
        f1152 = new C6863(enumC18469, enumC3652);
        f1140 = new C20975(enumC18467, enumC3652);
        EnumC9295 enumC9295 = EnumC9295.ADJACENT;
        f1206 = new C9686(enumC18467, enumC3650, enumC9295);
        f1157 = new C16034(enumC18468, enumC3650);
        f1161 = new C2630(enumC18467, enumC3652);
        f1135 = new C4041(enumC18468, enumC3652);
        f1168 = new C18858(enumC18467, enumC3652, enumC9295);
        f1150 = new C19564(enumC18469, enumC3650);
        f1169 = new EnumC0121("WERROR", 50, "-Werror", "opt.Werror", enumC18467, enumC3650);
        f1138 = new EnumC0121("PROMPT", 51, "-prompt", null, enumC18469, enumC3650);
        f1195 = new EnumC0121("DOE", 52, "-doe", null, enumC18469, enumC3650);
        f1147 = new EnumC0121("PRINTSOURCE", 53, "-printsource", null, enumC18469, enumC3650);
        f1171 = new C0512(enumC18469, enumC3650);
        f1211 = new EnumC0121("XMAXERRS", 55, "-Xmaxerrs", "opt.arg.number", "opt.maxerrs", enumC18468, enumC3650);
        f1148 = new EnumC0121("XMAXWARNS", 56, "-Xmaxwarns", "opt.arg.number", "opt.maxwarns", enumC18468, enumC3650);
        f1139 = new C5452(enumC18468, enumC3652);
        f1156 = new EnumC0121("XPRINT", 58, "-Xprint", "opt.print", enumC18468, enumC3650);
        f1134 = new EnumC0121("XPRINTROUNDS", 59, "-XprintRounds", "opt.printRounds", enumC18468, enumC3650);
        f1182 = new EnumC0121("XPRINTPROCESSORINFO", 60, "-XprintProcessorInfo", "opt.printProcessorInfo", enumC18468, enumC3650);
        f1159 = new EnumC0121("XPREFER", 61, "-Xprefer:", "opt.prefer", enumC18468, enumC3650, enumC85810, "source", "newer");
        f1194 = new EnumC0121("XXUSERPATHSFIRST", 62, "-XXuserPathsFirst", "opt.userpathsfirst", enumC18469, enumC3650);
        f1201 = new EnumC0121("XPKGINFO", 63, "-Xpkginfo:", "opt.pkginfo", enumC18468, enumC3650, enumC85810, "always", "legacy", "nonempty");
        f1184 = new EnumC0121("O", 64, "-O", null, enumC18469, enumC3650);
        f1191 = new EnumC0121("XJCOV", 65, "-Xjcov", null, enumC18469, enumC3650);
        f1176 = new C1218(enumC18468, enumC3650);
        f1151 = new EnumC0121("XDIAGS", 67, "-Xdiags:", "opt.diags", enumC18468, enumC3650, enumC85810, "compact", "verbose");
        EnumC9295 enumC9296 = EnumC9295.REQUIRED;
        f1146 = new C8274(enumC18469, enumC3650, enumC9296);
        f1126 = new C15328(enumC18469, enumC3650, enumC9296);
        f1132 = new C22385(enumC18469, enumC3650, enumC9296);
        f1174 = new C20269(enumC18469, enumC3650);
        f1172 = new C4746(enumC18468, enumC3650);
        f1129 = new EnumC0121("ADD_OPENS", 73, "--add-opens", (String) null, (String) null, enumC18469, enumC3650);
        f1162 = new C3335(enumC18468, enumC3650);
        f1166 = new EnumC0121("MODULE", 75, "--module -m", "opt.arg.m", "opt.m", enumC18467, enumC3650);
        f1149 = new C13212(enumC18467, enumC3650);
        f1144 = new C12507(enumC18467, enumC3650);
        f1183 = new C10391(enumC18467, enumC3652, enumC9295);
        f1153 = new C6157(enumC18469, enumC3652);
        f1130 = new EnumC0121("MULTIRELEASE", 80, "--multi-release", "opt.arg.multi-release", "opt.multi-release", enumC18469, enumC3651);
        f1165 = m1174();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static EnumC0121 m1175(String str) {
        return m1159(str, EnumSet.allOf(EnumC0121.class));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC0121 m1159(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            EnumC0121 enumC0121 = (EnumC0121) it.next();
            if (enumC0121.mo1183(str)) {
                return enumC0121;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m1171(final C22364 c22364, final EnumC18467 enumC18467) {
        C5378.stream(m1176()).filter(new Predicate() { // from class: l.ۤۡ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC0121.m1173(enumC18467, (EnumC0121) obj);
            }
        }).sorted(new C11802()).forEach(new Consumer() { // from class: l.ۛۡ۠
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                ((EnumC0121) obj).mo1181(c22364);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }
        });
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m1173(EnumC18467 enumC18467, EnumC0121 enumC0121) {
        return enumC0121.f1216 == enumC18467;
    }

    public EnumC0121(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this(str, i, str2, null, str3, enumC18467, enumC3650, null, null, EnumC9295.NONE);
    }

    public EnumC0121(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295) {
        this(str, i, str2, null, str3, enumC18467, enumC3650, null, null, enumC9295);
    }

    public EnumC0121(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650) {
        this(str, i, str2, str3, str4, enumC18467, enumC3650, null, null, EnumC9295.REQUIRED);
    }

    public EnumC0121(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC9295 enumC9295) {
        this(str, i, str2, str3, str4, enumC18467, enumC3650, null, null, enumC9295);
    }

    public EnumC0121(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC8589 enumC8589, Set set) {
        this(str, i, str2, str3, str4, enumC18467, enumC3650, enumC8589, set, EnumC9295.REQUIRED);
    }

    public EnumC0121(String str, int i, String str2, String str3, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC8589 enumC8589, String... strArr) {
        this(str, i, str2, null, str3, enumC18467, enumC3650, enumC8589, new LinkedHashSet(Arrays.asList(strArr)), EnumC9295.REQUIRED);
    }

    public EnumC0121(String str, int i, String str2, String str3, String str4, EnumC18467 enumC18467, EnumC3650 enumC3650, EnumC8589 enumC8589, Set set, EnumC9295 enumC9295) {
        super(str, i);
        String[] strArrSplit = str2.trim().split("\\s+");
        this.f1215 = strArrSplit;
        C12171.m29642(strArrSplit.length >= 1);
        this.f1214 = strArrSplit[0];
        this.f1220 = str3;
        this.f1212 = str4;
        this.f1216 = enumC18467;
        this.f1217 = enumC3650;
        this.f1218 = enumC8589;
        this.f1213 = set;
        this.f1219 = enumC9295;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String m1188() {
        return this.f1214;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC18467 m1185() {
        return this.f1216;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC9295 m1177() {
        return this.f1219;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean mo1187() {
        return this.f1219 != EnumC9295.NONE;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean m1184() {
        return (m1177() != EnumC9295.REQUIRED || this.f1214.endsWith(":") || this.f1214.endsWith("=")) ? false : true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean mo1183(String str) {
        for (String str2 : this.f1215) {
            if (m1162(str, str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m1162(String str, String str2) {
        if (str2.startsWith("--")) {
            return str.equals(str2) || (mo1187() && str.startsWith(str2.concat("=")));
        }
        if (this.f1219 != EnumC9295.ADJACENT && !str2.endsWith(":") && !str2.endsWith("=")) {
            return str.equals(str2);
        }
        if (!str.startsWith(str2)) {
            return false;
        }
        if (this.f1213 != null) {
            String strSubstring = str.substring(str2.length());
            if (this.f1218 == EnumC8589.ONEOF) {
                return this.f1213.contains(strSubstring);
            }
            for (String str3 : strSubstring.split(",+")) {
                if (!this.f1213.contains(str3)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m1180(AbstractC0827 abstractC0827, String str, Iterator it) throws C2239 {
        String str2;
        String strSubstring;
        String strSubstring2;
        if (mo1187()) {
            int iM1168 = m1168(str);
            if (m1177() == EnumC9295.ADJACENT) {
                strSubstring = this.f1214;
                strSubstring2 = str.substring(strSubstring.length());
            } else {
                if (iM1168 > 0) {
                    strSubstring = str.substring(0, iM1168);
                    strSubstring2 = str.substring(iM1168 + 1);
                } else {
                    if (!it.hasNext()) {
                        String str3 = this.f1214;
                        C12281 c12281 = C6241.f19132;
                        throw abstractC0827.m3074(new C12281("compiler", "req.arg", str3));
                    }
                    str2 = (String) it.next();
                }
                mo1179(abstractC0827, str, str2);
                return;
            }
            String str4 = strSubstring;
            str2 = strSubstring2;
            str = str4;
            mo1179(abstractC0827, str, str2);
            return;
        }
        if ((this == f1140 || this == f1161 || this == f1135 || this == f1136 || this == f1152) && abstractC0827.mo3073(this) != null) {
            return;
        }
        mo1178(abstractC0827, str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1178(AbstractC0827 abstractC0827, String str) {
        if (this.f1219 == EnumC9295.NONE) {
            mo1179(abstractC0827, this.f1214, str);
        } else {
            mo1179(abstractC0827, this.f1214, str.substring(m1168(str) + 1));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1179(AbstractC0827 abstractC0827, String str, String str2) {
        Set set = this.f1213;
        if (set != null) {
            if (this.f1218 == EnumC8589.ONEOF) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    abstractC0827.mo3081(this.f1214 + ((String) it.next()));
                }
                String str3 = this.f1214 + str2;
                abstractC0827.mo3077(str3, str3);
                String str4 = this.f1214;
                abstractC0827.mo3077(str4.substring(0, str4.length() - 1), str2);
            } else {
                for (String str5 : str2.split(",+")) {
                    String str6 = this.f1214 + str5;
                    abstractC0827.mo3077(str6, str6);
                }
            }
        }
        abstractC0827.mo3077(this.f1214, str2);
        if (this.f1217 == EnumC3650.FILEMANAGER) {
            abstractC0827.mo3079(this, str2);
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Pattern mo1186() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m1168(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == ':' || cCharAt == '=') {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo1181(C22364 c22364) {
        m1182(c22364, c22364.m50109(EnumC15307.JAVAC, this.f1212, new Object[0]));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m1182(final C22364 c22364, String str) {
        String str2 = (String) C22311.stream(this.f1215).map(new Function() { // from class: l.ۨۡ۠
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo22274andThen(Function function) {
                return C20696.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.m1169(c22364, (String) obj);
            }

            @Override // java.util.function.Function
            public /* synthetic */ Function compose(Function function) {
                return C20696.$default$compose(this, function);
            }
        }).collect(C22976.joining(", "));
        if (str2.length() < 28 && !str.contains("\n") && str.length() + 31 <= 80) {
            c22364.m50115(EnumC21659.STDOUT, String.format(f1175, str2, str));
            return;
        }
        if (str2.length() <= 80) {
            c22364.m50115(EnumC21659.STDOUT, f1143.concat(str2));
        } else {
            for (String str3 : this.f1215) {
                c22364.m50115(EnumC21659.STDOUT, f1143 + m1169(str3, c22364));
            }
        }
        c22364.m50115(EnumC21659.STDOUT, f1160 + str.replace("\n", "\n        "));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public String m1169(String str, C22364 c22364) {
        StringBuilder sbM15339 = C5368.m15339(str);
        if (this.f1220 != null) {
            if (!str.matches(".*[=:]$") && this.f1219 != EnumC9295.ADJACENT) {
                sbM15339.append(" ");
            }
            sbM15339.append(c22364.m50109(EnumC15307.JAVAC, this.f1220, new Object[0]));
        } else if (this.f1213 != null) {
            if (!str.endsWith(":")) {
                sbM15339.append(" ");
            }
            String str2 = "{";
            for (String str3 : this.f1213) {
                sbM15339.append(str2);
                sbM15339.append(str3);
                str2 = ",";
            }
            sbM15339.append(l.d);
        }
        return sbM15339.toString();
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static Set m1155() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(ProviderConfigurationPermission.ALL_STR);
        for (EnumC20347 enumC20347 : EnumC20347.values()) {
            linkedHashSet.add(enumC20347.f65711);
            linkedHashSet.add("-" + enumC20347.f65711);
        }
        linkedHashSet.add("none");
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Set m1176() {
        return EnumSet.allOf(EnumC0121.class);
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Set m1154() {
        return m1158(EnumC3650.FILEMANAGER);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Set m1165() {
        return m1158(EnumC3650.BASIC);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Set m1158(final EnumC3650 enumC3650) {
        return (Set) C22311.stream(values()).filter(new Predicate() { // from class: l.᩺ۡ۠
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return EnumC0121.m1172(enumC3650, (EnumC0121) obj);
            }
        }).collect(C22976.toCollection(new C13712()));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ boolean m1172(EnumC3650 enumC3650, EnumC0121 enumC0121) {
        return enumC0121.f1217 == enumC3650;
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumSet m1166() {
        return EnumSet.noneOf(EnumC0121.class);
    }
}
