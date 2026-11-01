package p067l;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 675F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5023 extends C24288 {

    /* JADX INFO: renamed from: ۫ */
    public static final Pattern f11505 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: ۤ */
    public static final Pattern f11504 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: ۛ */
    public static final Pattern f11503 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: ֫ */
    public static File m10689(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, C17520.m39893(sb, j2, ".v3.exo"));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX INFO: renamed from: ֫ */
    public static C5023 m10690(File file, long j, long j2, C19104 c19104) {
        File file2;
        long j3;
        String strGroup;
        File fileM10689;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = f11504.matcher(name2);
            if (matcher.matches()) {
                String strGroup2 = matcher.group(1);
                strGroup2.getClass();
                strGroup = C5792.m13022(strGroup2);
            } else {
                matcher = f11505.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileM10689 = null;
            } else {
                File parentFile = file.getParentFile();
                C23877.m52958(parentFile);
                int i = c19104.m43410(strGroup).f9744;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileM10689 = m10689(parentFile, i, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileM10689)) {
                    fileM10689 = null;
                }
            }
            if (fileM10689 != null) {
                file2 = fileM10689;
                name = fileM10689.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher2 = f11503.matcher(name);
        if (matcher2.matches()) {
            String strGroup5 = matcher2.group(1);
            strGroup5.getClass();
            String strM43405 = c19104.m43405(Integer.parseInt(strGroup5));
            if (strM43405 != null) {
                long length = j == -1 ? file2.length() : j;
                if (length != 0) {
                    String strGroup6 = matcher2.group(2);
                    strGroup6.getClass();
                    long j5 = Long.parseLong(strGroup6);
                    if (j2 == -9223372036854775807L) {
                        String strGroup7 = matcher2.group(3);
                        strGroup7.getClass();
                        j3 = Long.parseLong(strGroup7);
                    } else {
                        j3 = j2;
                    }
                    return new C5023(strM43405, j5, length, j3, file2);
                }
            }
        }
        return null;
    }
}
