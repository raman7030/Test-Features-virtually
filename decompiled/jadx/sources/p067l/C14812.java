package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۬ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes4.dex */
public class C14812 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public String f42242 = "null";

    /* JADX INFO: renamed from: ۘ֫ */
    public ArrayList f42241 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, this.f42242);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        mo13456("...");
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Exception {
        ArrayList arrayList;
        AbstractC17043 abstractC17043M13451 = m13451("outputDir");
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("password");
        int iM13484 = m13484("level");
        boolean zM13488 = m13488("headerEncryption");
        boolean zM13489 = m13488("deleteSources");
        long jM13463 = m13463("splitSize");
        int length = strArrM13494.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.f42241;
            if (i < length) {
                StringBuilder sb = new StringBuilder();
                sb.append(C7050.m16224(R.string.MT_Protector));
                sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                int i3 = i + 1;
                sb.append(i3);
                sb.append("/");
                sb.append(length);
                sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                mo13482(sb.toString());
                m13477(i3, length);
                AbstractC17043 abstractC17043M42109 = C18524.m42109(strArrM13494[i], new String[0]);
                AbstractC17043 abstractC17043M38650 = abstractC17043M13451.m38684((abstractC17043M42109.mo25087() ? abstractC17043M42109.getName() : abstractC17043M42109.m38675()) + ".7z").m38650(true);
                this.f42242 = abstractC17043M38650.getName();
                C4045 c4045M55251 = C25187.m55251((AbstractC5996) this, new String[]{strArrM13494[i]}, false);
                int iM8104 = c4045M55251.m8104() + i2;
                if (mo3924()) {
                    return C18736.m42768();
                }
                C23611 c23611 = new C23611();
                c23611.f75147 = c4045M55251.f8893.size();
                c23611.f75145 = iM13484;
                c23611.f75146 = zM13488;
                ArrayList arrayList3 = new ArrayList();
                try {
                    AbstractC17043 abstractC17043 = abstractC17043M13451;
                    int i4 = iM13484;
                    boolean z = zM13488;
                    int i5 = length;
                    try {
                        C14893.m34098(c23611, new C5425(this, jM13463, abstractC17043M38650, arrayList3, strM13492, c4045M55251));
                        if (mo3924()) {
                            C25187.m55252(arrayList3);
                            return C18736.m42768();
                        }
                        arrayList2.addAll(arrayList3);
                        i = i3;
                        i2 = iM8104;
                        abstractC17043M13451 = abstractC17043;
                        iM13484 = i4;
                        zM13488 = z;
                        length = i5;
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList3;
                        C25187.m55252(arrayList);
                        throw e;
                    }
                } catch (Exception e2) {
                    e = e2;
                    arrayList = arrayList3;
                }
            } else {
                if (!mo3924() && zM13489) {
                    C25187.m55254(this, strArrM13494, arrayList2, i2);
                }
                return m13481();
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        boolean zM13488 = m13488("compressToAnother");
        C25187.m55255(c18736, zM13488, zM13488 ? m13461(c18108) : m13478(c18107), c18107, c18108, C25187.m55250((List) this.f42241));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
