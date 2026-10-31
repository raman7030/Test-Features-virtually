package l;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R7TL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5548 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7381 f17155;

    public C5548(C1654 c1654) {
        this.f17155 = c1654.m45497();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0087 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0036 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C0608 m15690() {
        int iHashCode;
        C21907 c21907 = (C21907) this.f17155.m19869("exec");
        c21907.m49307();
        c21907.mo22199(0);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c21907.m45493()));
            C0608 c0608 = new C0608();
            c0608.f2362 = false;
            c0608.f2363 = new HashMap();
            c0608.f2361 = new HashMap();
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return c0608;
                }
                int iHashCode2 = line.hashCode();
                if (iHashCode2 != -1095948318) {
                    if (iHashCode2 != -696260880) {
                        if (iHashCode2 == -60387352 && line.equals("===USER_LIST===")) {
                            str = "USER_LIST";
                        } else {
                            iHashCode = str.hashCode();
                            if (iHashCode != -1139530606) {
                                if (iHashCode != 647389002) {
                                    if (iHashCode != 1796900478 && str.equals("GROUP_LIST")) {
                                        m15688(line, c0608);
                                    }
                                } else if (str.equals("SYSTEM_TYPE")) {
                                    c0608.f2362 = "Darwin".equals(line.trim());
                                }
                            } else if (str.equals("USER_LIST")) {
                                m15689(line, c0608);
                            }
                        }
                    } else if (line.equals("===SYSTEM_TYPE===")) {
                        str = "SYSTEM_TYPE";
                    } else {
                        iHashCode = str.hashCode();
                        if (iHashCode != -1139530606) {
                            if (iHashCode != 647389002) {
                                if (iHashCode != 1796900478) {
                                    m15688(line, c0608);
                                }
                            } else if (str.equals("SYSTEM_TYPE")) {
                                c0608.f2362 = "Darwin".equals(line.trim());
                            }
                        } else if (str.equals("USER_LIST")) {
                            m15689(line, c0608);
                        }
                    }
                } else if (line.equals("===GROUP_LIST===")) {
                    str = "GROUP_LIST";
                } else {
                    iHashCode = str.hashCode();
                    if (iHashCode != -1139530606) {
                        if (iHashCode != 647389002) {
                            if (iHashCode != 1796900478) {
                                m15688(line, c0608);
                            }
                        } else if (str.equals("SYSTEM_TYPE")) {
                            c0608.f2362 = "Darwin".equals(line.trim());
                        }
                    } else if (str.equals("USER_LIST")) {
                        m15689(line, c0608);
                    }
                }
            }
        } finally {
            c21907.m45490();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m15689(String str, C0608 c0608) {
        String strTrim = str.trim();
        if (strTrim.isEmpty() || strTrim.startsWith("#")) {
            return;
        }
        try {
            boolean z = c0608.f2362;
            HashMap map = c0608.f2363;
            if (z) {
                String[] strArrSplit = str.trim().split("\\s+");
                if (strArrSplit.length >= 2) {
                    map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    return;
                }
                return;
            }
            String[] strArrSplit2 = str.split(":");
            if (strArrSplit2.length >= 3) {
                map.put(strArrSplit2[0], Integer.valueOf(Integer.parseInt(strArrSplit2[2])));
            }
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m15688(String str, C0608 c0608) {
        if (str.trim().isEmpty()) {
            return;
        }
        try {
            boolean z = c0608.f2362;
            HashMap map = c0608.f2361;
            if (z) {
                String[] strArrSplit = str.trim().split("\\s+");
                if (strArrSplit.length >= 2) {
                    map.put(strArrSplit[0], Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    return;
                }
                return;
            }
            String[] strArrSplit2 = str.split(":");
            if (strArrSplit2.length >= 3) {
                map.put(strArrSplit2[0], Integer.valueOf(Integer.parseInt(strArrSplit2[2])));
            }
        } catch (NumberFormatException unused) {
        }
    }
}
