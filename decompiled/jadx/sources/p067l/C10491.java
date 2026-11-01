package p067l;

import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۡ֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: U410 */
/* JADX INFO: loaded from: classes3.dex */
public class C10491 implements InterfaceC6502 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f29046;

    /* JADX INFO: renamed from: ۧ */
    public HashMap f29047;

    /* JADX INFO: renamed from: ܽ */
    public EnumSet f29048;

    public C10491(Set set) {
        this.f29047 = new HashMap();
        this.f29048 = EnumSet.copyOf((Collection) set);
        m24235(EnumC21255.DEPTH, -1);
        m24235(EnumC21255.LENGTH, -1);
        this.f29046 = true;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b3 A[Catch: NumberFormatException -> 0x00bf, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00bf, blocks: (B:29:0x008f, B:35:0x0098, B:37:0x00a0, B:38:0x00ab, B:40:0x00b3), top: B:50:0x008f }] */
    public C10491(C13565 c13565, EnumSet enumSet) {
        this(enumSet);
        String strM30872 = c13565.m30872("diags.showSource");
        if (strM30872 != null) {
            if (strM30872.equals("true")) {
                m24236(EnumC23266.SOURCE, true);
            } else if (strM30872.equals("false")) {
                m24236(EnumC23266.SOURCE, false);
            }
        }
        String strM30873 = c13565.m30872("diags.formatterOptions");
        if (strM30873 != null) {
            List listAsList = Arrays.asList(strM30873.split(","));
            if (listAsList.contains(ClassTransform.SHORT)) {
                m24236(EnumC23266.DETAILS, false);
                m24236(EnumC23266.SUBDIAGNOSTICS, false);
            }
            if (listAsList.contains("source")) {
                m24236(EnumC23266.SOURCE, true);
            }
            if (listAsList.contains("-source")) {
                m24236(EnumC23266.SOURCE, false);
            }
        }
        String strM30874 = c13565.m30872("diags.multilinePolicy");
        if (strM30874 != null) {
            if (strM30874.equals("disabled")) {
                m24236(EnumC23266.SUBDIAGNOSTICS, false);
            } else if (strM30874.startsWith("limit:")) {
                String[] strArrSplit = strM30874.substring(6).split(":");
                try {
                    int length = strArrSplit.length;
                    if (length == 1) {
                        if (!strArrSplit[0].equals("*")) {
                            m24235(EnumC21255.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    } else if (length == 2) {
                        if (!strArrSplit[1].equals("*")) {
                            m24235(EnumC21255.DEPTH, Integer.parseInt(strArrSplit[1]));
                        }
                        if (!strArrSplit[0].equals("*")) {
                            m24235(EnumC21255.LENGTH, Integer.parseInt(strArrSplit[0]));
                        }
                    }
                } catch (NumberFormatException unused) {
                    m24235(EnumC21255.DEPTH, -1);
                    m24235(EnumC21255.LENGTH, -1);
                }
            }
        }
        String strM30875 = c13565.m30872("diags.showCaret");
        if (strM30875 == null || !strM30875.equals("false")) {
            this.f29046 = true;
        } else {
            this.f29046 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24235(EnumC21255 enumC21255, int i) {
        if (i < -1) {
            i = -1;
        }
        this.f29047.put(enumC21255, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24236(EnumC23266 enumC23266, boolean z) {
        if (z) {
            this.f29048.add(enumC23266);
        } else {
            this.f29048.remove(enumC23266);
        }
    }
}
