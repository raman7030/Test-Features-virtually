package p067l;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۚᩴ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R7TL */
/* JADX INFO: loaded from: classes2.dex */
public final class C7642 {

    /* JADX INFO: renamed from: ֫ */
    public C9383 f19996;

    public C7642(C3940 c3940) {
        this.f19996 = c3940.m47808();
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
    /* JADX INFO: renamed from: ֫ */
    public final C2947 m17605() {
        int iHashCode;
        C23189 c23189 = (C23189) this.f19996.m21842("exec");
        c23189.m51660();
        c23189.mo24167(0);
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c23189.m47804()));
            C2947 c2947 = new C2947();
            c2947.f5136 = false;
            c2947.f5137 = new HashMap();
            c2947.f5135 = new HashMap();
            String str = "";
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return c2947;
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
                                        m17603(line, c2947);
                                    }
                                } else if (str.equals("SYSTEM_TYPE")) {
                                    c2947.f5136 = "Darwin".equals(line.trim());
                                }
                            } else if (str.equals("USER_LIST")) {
                                m17604(line, c2947);
                            }
                        }
                    } else if (line.equals("===SYSTEM_TYPE===")) {
                        str = "SYSTEM_TYPE";
                    } else {
                        iHashCode = str.hashCode();
                        if (iHashCode != -1139530606) {
                            if (iHashCode != 647389002) {
                                if (iHashCode != 1796900478) {
                                    m17603(line, c2947);
                                }
                            } else if (str.equals("SYSTEM_TYPE")) {
                                c2947.f5136 = "Darwin".equals(line.trim());
                            }
                        } else if (str.equals("USER_LIST")) {
                            m17604(line, c2947);
                        }
                    }
                } else if (line.equals("===GROUP_LIST===")) {
                    str = "GROUP_LIST";
                } else {
                    iHashCode = str.hashCode();
                    if (iHashCode != -1139530606) {
                        if (iHashCode != 647389002) {
                            if (iHashCode != 1796900478) {
                                m17603(line, c2947);
                            }
                        } else if (str.equals("SYSTEM_TYPE")) {
                            c2947.f5136 = "Darwin".equals(line.trim());
                        }
                    } else if (str.equals("USER_LIST")) {
                        m17604(line, c2947);
                    }
                }
            }
        } finally {
            c23189.m47801();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m17604(String str, C2947 c2947) {
        String strTrim = str.trim();
        if (strTrim.isEmpty() || strTrim.startsWith("#")) {
            return;
        }
        try {
            boolean z = c2947.f5136;
            HashMap map = c2947.f5137;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m17603(String str, C2947 c2947) {
        if (str.trim().isEmpty()) {
            return;
        }
        try {
            boolean z = c2947.f5136;
            HashMap map = c2947.f5135;
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
