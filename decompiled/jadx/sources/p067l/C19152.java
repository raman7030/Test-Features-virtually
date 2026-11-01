package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public class C19152 extends AbstractC23625 {

    /* JADX INFO: renamed from: ۘ֫ */
    public List f57220 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("output"));
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
        AbstractC17043 abstractC17043;
        Throwable th;
        AbstractC17043 abstractC17043M13451 = m13451("output");
        String[] strArrM13494 = m13494("ARG_PATHS");
        String strM13492 = m13492("password");
        int iM13484 = m13484("level");
        boolean zM13488 = m13488("deleteSources");
        long jM13463 = m13463("splitSize");
        boolean zM13489 = m13488("replaceExisting");
        C4045 c4045M55251 = C25187.m55251((AbstractC5996) this, strArrM13494, false);
        ArrayList<C9467> arrayList = c4045M55251.f8893;
        if (mo3924()) {
            return C18736.m42768();
        }
        C23412 c23412M52082 = C23412.m52082(abstractC17043M13451, zM13489 || jM13463 != -1);
        AbstractC17043 abstractC17043M52089 = c23412M52082.m52089();
        ArrayList arrayList2 = new ArrayList();
        if (jM13463 == -1) {
            arrayList2.add(abstractC17043M52089);
        }
        try {
            C10844 c10844 = jM13463 == -1 ? new C10844(abstractC17043M52089) : new C10844(abstractC17043M52089, jM13463, new C6766(arrayList2));
            try {
                c10844.m25000(strM13492);
                boolean zM49365 = AbstractC21895.m49365(iM13484, c10844);
                C16922 c16922 = new C16922();
                if (zM49365) {
                    try {
                        for (C9467 c9467 : arrayList) {
                            if (!c9467.f25915 && c9467.f25908.equals("AndroidManifest.xml")) {
                                try {
                                    C16820 c16820M38131 = C16820.m38131(c9467.f25907);
                                    c16922.f50093 = C23527.m52310(c16820M38131);
                                    c16922.f50092 = C23527.m52312(c16820M38131);
                                    break;
                                } catch (Exception unused) {
                                    c16922.f50093 = false;
                                    c16922.f50092 = false;
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC17043 = abstractC17043M52089;
                        try {
                            try {
                                c10844.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            C25187.m55252(arrayList2);
                            abstractC17043.mo29990();
                            throw e;
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C9467 c9468 = (C9467) it.next();
                    if (mo3924()) {
                        break;
                    }
                    c4045M55251.m8105();
                    boolean z = c9468.f25915;
                    long j = c9468.f25916;
                    it = it;
                    abstractC17043M52089 = abstractC17043M52089;
                    long j2 = c9468.f25910;
                    strArrM13494 = strArrM13494;
                    String str = c9468.f25908;
                    zM13488 = zM13488;
                    if (z) {
                        try {
                            C5738 c5738 = new C5738(str + "/");
                            c5738.setTime(j2);
                            c10844.m24987(c5738);
                        } catch (Throwable th4) {
                            th = th4;
                            abstractC17043 = abstractC17043M52089;
                            c10844.close();
                            throw th;
                        }
                    } else {
                        AbstractC17043 abstractC17044 = c9468.f25907;
                        if (zM49365) {
                            c10844.m24992(C22959.m51283(str, c16922));
                        }
                        StringBuilder sb = new StringBuilder();
                        boolean z2 = zM49365;
                        sb.append(C7050.m16224(R.string.MT_Protector));
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                        sb.append(c4045M55251.m8099());
                        sb.append("/");
                        sb.append(c4045M55251.m8104());
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        mo13482(sb.toString());
                        mo13456(str);
                        C5738 c5739 = new C5738(str);
                        c5739.m12786(j);
                        c5739.setTime(j2);
                        c10844.m24987(c5739);
                        abstractC17044.m38653(c10844.m24981(), new C19823(this, c4045M55251));
                        c4045M55251.m8100(j);
                        zM49365 = z2;
                    }
                }
                String[] strArr = strArrM13494;
                boolean z3 = zM13488;
                AbstractC17043 abstractC17045 = abstractC17043M52089;
                try {
                    c10844.close();
                    if (mo3924()) {
                        C25187.m55252(arrayList2);
                        abstractC17045.mo29990();
                        return C18736.m42768();
                    }
                    if (jM13463 != -1) {
                        if (arrayList2.isEmpty() || !abstractC17045.mo25094()) {
                            C25187.m55252(arrayList2);
                            abstractC17045.mo29990();
                            throw new IOException(C6316.m14442(abstractC17045, new StringBuilder("Unable to finalize ZIP split output: ")));
                        }
                        arrayList2.set(arrayList2.size() - 1, abstractC17045);
                    }
                    this.f57220 = c23412M52082.m52088(arrayList2, jM13463 == -1 ? EnumC22742.NONE : EnumC22742.ZIP);
                    if (mo3924()) {
                        return C18736.m42768();
                    }
                    if (z3) {
                        C25187.m55254(this, strArr, this.f57220, c4045M55251.m8104());
                    }
                    return C18736.m42767();
                } catch (Exception e2) {
                    e = e2;
                    abstractC17043 = abstractC17045;
                    C25187.m55252(arrayList2);
                    abstractC17043.mo29990();
                    throw e;
                }
            } catch (Throwable th5) {
                abstractC17043 = abstractC17043M52089;
                th = th5;
            }
        } catch (Exception e3) {
            e = e3;
            abstractC17043 = abstractC17043M52089;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        boolean zM13488 = m13488("compressToAnother");
        C25187.m55255(c18736, zM13488, zM13488 ? m13461(c18108) : m13478(c18107), c18107, c18108, C25187.m55250(this.f57220));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
