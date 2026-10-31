package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܿ᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes5.dex */
public class C17659 extends AbstractC22366 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public List f54027 = new ArrayList();

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76958;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("output"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        m11536(R.string.MT_Protector);
        mo11520("...");
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Exception {
        AbstractC15440 abstractC15440;
        Throwable th;
        AbstractC15440 abstractC15440M11515 = m11515("output");
        String[] strArrM11558 = m11558("ARG_PATHS");
        String strM11556 = m11556("password");
        int iM11548 = m11548("level");
        boolean zM11552 = m11552("deleteSources");
        long jM11527 = m11527("splitSize");
        boolean zM11553 = m11552("replaceExisting");
        C1764 c1764M52845 = C24009.m52845((AbstractC3817) this, strArrM11558, false);
        ArrayList<C7469> arrayList = c1764M52845.f6117;
        if (mo1526()) {
            return C17222.m40521();
        }
        C22142 c22142M49744 = C22142.m49744(abstractC15440M11515, zM11553 || jM11527 != -1);
        AbstractC15440 abstractC15440M49751 = c22142M49744.m49751();
        ArrayList arrayList2 = new ArrayList();
        if (jM11527 == -1) {
            arrayList2.add(abstractC15440M49751);
        }
        try {
            C8918 c8918 = jM11527 == -1 ? new C8918(abstractC15440M49751) : new C8918(abstractC15440M49751, jM11527, new C4627(arrayList2));
            try {
                c8918.m23026(strM11556);
                boolean zM47042 = AbstractC20546.m47042(iM11548, c8918);
                C15313 c15313 = new C15313();
                if (zM47042) {
                    try {
                        for (C7469 c7469 : arrayList) {
                            if (!c7469.f23002 && c7469.f22995.equals("AndroidManifest.xml")) {
                                try {
                                    C15206 c15206M35971 = C15206.m35971(c7469.f22994);
                                    c15313.f46967 = C22263.m49982(c15206M35971);
                                    c15313.f46966 = C22263.m49984(c15206M35971);
                                    break;
                                } catch (Exception unused) {
                                    c15313.f46967 = false;
                                    c15313.f46966 = false;
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        abstractC15440 = abstractC15440M49751;
                        try {
                            try {
                                c8918.close();
                                throw th;
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                                throw th;
                            }
                        } catch (Exception e) {
                            e = e;
                            C24009.m52846(arrayList2);
                            abstractC15440.mo27929();
                            throw e;
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C7469 c74610 = (C7469) it.next();
                    if (mo1526()) {
                        break;
                    }
                    c1764M52845.m5895();
                    boolean z = c74610.f23002;
                    long j = c74610.f23003;
                    it = it;
                    abstractC15440M49751 = abstractC15440M49751;
                    long j2 = c74610.f22997;
                    strArrM11558 = strArrM11558;
                    String str = c74610.f22995;
                    zM11552 = zM11552;
                    if (z) {
                        try {
                            C3545 c3545 = new C3545(str + "/");
                            c3545.setTime(j2);
                            c8918.m23013(c3545);
                        } catch (Throwable th4) {
                            th = th4;
                            abstractC15440 = abstractC15440M49751;
                            c8918.close();
                            throw th;
                        }
                    } else {
                        AbstractC15440 abstractC15441 = c74610.f22994;
                        if (zM47042) {
                            c8918.m23018(C21665.m48934(str, c15313));
                        }
                        StringBuilder sb = new StringBuilder();
                        boolean z2 = zM47042;
                        sb.append(C4925.m14327(R.string.MT_Protector));
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_START);
                        sb.append(c1764M52845.m5889());
                        sb.append("/");
                        sb.append(c1764M52845.m5894());
                        sb.append(MotionUtils.EASING_TYPE_FORMAT_END);
                        mo11546(sb.toString());
                        mo11520(str);
                        C3545 c3546 = new C3545(str);
                        c3546.m10805(j);
                        c3546.setTime(j2);
                        c8918.m23013(c3546);
                        abstractC15441.m36495(c8918.m23007(), new C18365(this, c1764M52845));
                        c1764M52845.m5890(j);
                        zM47042 = z2;
                    }
                }
                String[] strArr = strArrM11558;
                boolean z3 = zM11552;
                AbstractC15440 abstractC15442 = abstractC15440M49751;
                try {
                    c8918.close();
                    if (mo1526()) {
                        C24009.m52846(arrayList2);
                        abstractC15442.mo27929();
                        return C17222.m40521();
                    }
                    if (jM11527 != -1) {
                        if (arrayList2.isEmpty() || !abstractC15442.mo23120()) {
                            C24009.m52846(arrayList2);
                            abstractC15442.mo27929();
                            throw new IOException(C4153.m12552(abstractC15442, new StringBuilder("Unable to finalize ZIP split output: ")));
                        }
                        arrayList2.set(arrayList2.size() - 1, abstractC15442);
                    }
                    this.f54027 = c22142M49744.m49750(arrayList2, jM11527 == -1 ? EnumC21437.NONE : EnumC21437.ZIP);
                    if (mo1526()) {
                        return C17222.m40521();
                    }
                    if (z3) {
                        C24009.m52848(this, strArr, this.f54027, c1764M52845.m5894());
                    }
                    return C17222.m40520();
                } catch (Exception e2) {
                    e = e2;
                    abstractC15440 = abstractC15442;
                    C24009.m52846(arrayList2);
                    abstractC15440.mo27929();
                    throw e;
                }
            } catch (Throwable th5) {
                abstractC15440 = abstractC15440M49751;
                th = th5;
            }
        } catch (Exception e3) {
            e = e3;
            abstractC15440 = abstractC15440M49751;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        boolean zM11552 = m11552("compressToAnother");
        C24009.m52849(c17222, zM11552, zM11552 ? m11525(c16561) : m11542(c16560), c16560, c16561, C24009.m52844(this.f54027));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
