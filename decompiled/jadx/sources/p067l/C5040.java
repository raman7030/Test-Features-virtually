package p067l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۖ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 9981 */
/* JADX INFO: loaded from: classes3.dex */
public class C5040 extends C15128 {
    @Override // p067l.C15128, p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        HashSet hashSet;
        int length;
        C8392 c8392M31344;
        C8392 c8392M31345;
        int i = 0;
        try {
            C18736 c18736Mo5125 = super.mo5125();
            String[] strArrM13494 = m13494("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM13494.length;
            while (i < length) {
                String str = strArrM13494[i];
                if (str.startsWith("$RECYCLE.BIN$/") && (c8392M31345 = C13757.m31344(str.substring(14))) != null) {
                    hashSet.add(c8392M31345.m19553());
                }
            }
            return c18736Mo5125;
        } finally {
            String[] strArrM13495 = m13494("ARG_PATHS");
            hashSet = new HashSet();
            length = strArrM13495.length;
            while (i < length) {
                String str2 = strArrM13495[i];
                if (str2.startsWith("$RECYCLE.BIN$/") && (c8392M31344 = C13757.m31344(str2.substring(14))) != null) {
                    hashSet.add(c8392M31344.m19553());
                }
                i++;
            }
            C23219.m51751(hashSet);
        }
    }
}
