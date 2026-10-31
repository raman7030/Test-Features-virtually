package l;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.ۖ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 675F */
/* JADX INFO: loaded from: classes2.dex */
public final class C2793 extends C23064 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Pattern f8711 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Pattern f8710 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final Pattern f8709 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static File m8629(File file, int i, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        return new File(file, C15942.m37718(sb, j2, ".v3.exo"));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0075  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C2793 m8630(File file, long j, long j2, C17609 c17609) {
        File file2;
        long j3;
        String strGroup;
        File fileM8629;
        String name = file.getName();
        if (!name.endsWith(".v3.exo")) {
            String name2 = file.getName();
            Matcher matcher = f8710.matcher(name2);
            if (matcher.matches()) {
                String strGroup2 = matcher.group(1);
                strGroup2.getClass();
                strGroup = C3603.m11046(strGroup2);
            } else {
                matcher = f8711.matcher(name2);
                if (matcher.matches()) {
                    strGroup = matcher.group(1);
                    strGroup.getClass();
                } else {
                    strGroup = null;
                }
            }
            if (strGroup == null) {
                fileM8629 = null;
            } else {
                File parentFile = file.getParentFile();
                C22632.m50632(parentFile);
                int i = c17609.m41164(strGroup).f6960;
                String strGroup3 = matcher.group(2);
                strGroup3.getClass();
                long j4 = Long.parseLong(strGroup3);
                String strGroup4 = matcher.group(3);
                strGroup4.getClass();
                fileM8629 = m8629(parentFile, i, j4, Long.parseLong(strGroup4));
                if (!file.renameTo(fileM8629)) {
                    fileM8629 = null;
                }
            }
            if (fileM8629 != null) {
                file2 = fileM8629;
                name = fileM8629.getName();
            }
            return null;
        }
        file2 = file;
        Matcher matcher2 = f8709.matcher(name);
        if (matcher2.matches()) {
            String strGroup5 = matcher2.group(1);
            strGroup5.getClass();
            String strM41159 = c17609.m41159(Integer.parseInt(strGroup5));
            if (strM41159 != null) {
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
                    return new C2793(strM41159, j5, length, j3, file2);
                }
            }
        }
        return null;
    }
}
