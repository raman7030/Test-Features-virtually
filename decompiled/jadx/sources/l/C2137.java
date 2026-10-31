package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.֫᩺ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes3.dex */
public class C2137 extends AbstractC22366 {

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC15440 f7101;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final C17222 mo3144(Exception exc) {
        if (!mo1526()) {
            return C17222.m40517(exc);
        }
        return C17222.m40521();
    }

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
        OutputStream outputStreamM17794;
        String[] strArr;
        boolean z;
        C22142 c22142;
        this.f7101 = m11515("output");
        String[] strArrM11558 = m11558("ARG_PATHS");
        EnumC6434 enumC6434 = EnumC6434.values()[m11548("format")];
        int iM11548 = m11548("level");
        boolean zM11552 = m11552("deleteSources");
        boolean zM11553 = m11552("replaceExisting");
        C1764 c1764M52845 = C24009.m52845((AbstractC3817) this, strArrM11558, true);
        ArrayList arrayList = c1764M52845.f6117;
        if (mo1526()) {
            return C17222.m40521();
        }
        if (enumC6434.f19900 && arrayList.size() != 1) {
            throw new RuntimeException("Expected to be a single file, but file size = " + arrayList.size());
        }
        C22142 c22142M49744 = C22142.m49744(this.f7101, zM11553);
        AbstractC15440 abstractC15440M49751 = c22142M49744.m49751();
        if (enumC6434.f19900) {
            C7469 c7469 = (C7469) arrayList.get(0);
            mo11546(C4925.m14327(R.string.MT_Protector));
            CharSequence charSequence = c7469.f22995;
            AbstractC15440 abstractC15440 = c7469.f22994;
            mo11520(charSequence);
            try {
                OutputStream outputStreamM17795 = enumC6434.m17794(abstractC15440M49751.mo23555(false), iM11548, abstractC15440.mo23127());
                try {
                    abstractC15440.m36495(outputStreamM17795, new C13798(this, c7469));
                    if (outputStreamM17795 != null) {
                        outputStreamM17795.close();
                    }
                    strArr = strArrM11558;
                    z = zM11552;
                    c22142 = c22142M49744;
                } catch (Throwable th) {
                    if (outputStreamM17795 == null) {
                        throw th;
                    }
                    try {
                        outputStreamM17795.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e) {
                abstractC15440M49751.mo27929();
                throw e;
            }
        } else {
            EnumC6434 enumC6435 = enumC6434.f19902;
            try {
                if (enumC6435 == null) {
                    outputStreamM17794 = abstractC15440M49751.m36525();
                } else {
                    outputStreamM17794 = enumC6435.m17794(abstractC15440M49751.mo23555(false), iM11548, -1L);
                }
                C21820 c21820 = new C21820(outputStreamM17794);
                try {
                    c21820.m49188();
                    c21820.m49186();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C7469 c74610 = (C7469) it.next();
                        if (mo1526()) {
                            break;
                        }
                        c1764M52845.m5895();
                        boolean z2 = c74610.f23002;
                        long j = c74610.f23003;
                        String str = c74610.f22999;
                        long j2 = c74610.f22997;
                        String str2 = c74610.f22995;
                        Iterator it2 = it;
                        boolean z3 = c74610.f23001;
                        String[] strArr2 = strArrM11558;
                        if (z2) {
                            C1358 c1358 = new C1358(z3 ? (byte) 50 : (byte) 53, str2 + "/");
                            c1358.m4737(C4529.fromMillis(j2));
                            if (c74610.f23000) {
                                c1358.m4732(c74610.f23004 | 16384);
                                c1358.m4763(c74610.f22996);
                                c1358.m4734(c74610.f22998);
                            }
                            if (z3) {
                                c1358.m4752(str);
                            }
                            c21820.m49185(c1358);
                            c21820.m49187();
                        } else {
                            AbstractC15440 abstractC15441 = c74610.f22994;
                            mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c1764M52845.m5889() + "/" + c1764M52845.m5894() + MotionUtils.EASING_TYPE_FORMAT_END);
                            mo11520(str2);
                            C1358 c1359 = new C1358(z3 ? (byte) 50 : UTF8.S_P3A, str2);
                            c1359.m4751(z3 ? 0L : j);
                            c1359.m4737(C4529.fromMillis(j2));
                            if (c74610.f23000) {
                                c1359.m4732(c74610.f23004 | 32768);
                                c1359.m4763(c74610.f22996);
                                c1359.m4734(c74610.f22998);
                            }
                            if (z3) {
                                c1359.m4752(str);
                            }
                            c21820.m49185(c1359);
                            if (!z3) {
                                abstractC15441.m36495(c21820, new C7449(this, c1764M52845));
                            }
                            c21820.m49187();
                            c1764M52845.m5890(j);
                        }
                        it = it2;
                        strArrM11558 = strArr2;
                        zM11552 = zM11552;
                        c22142M49744 = c22142M49744;
                    }
                    strArr = strArrM11558;
                    z = zM11552;
                    c22142 = c22142M49744;
                    c21820.close();
                } catch (Throwable th3) {
                    try {
                        c21820.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
            } catch (Exception e2) {
                abstractC15440M49751.mo27929();
                throw e2;
            }
        }
        if (mo1526()) {
            abstractC15440M49751.mo27929();
            return C17222.m40521();
        }
        List listM49750 = c22142.m49750(Collections.singletonList(abstractC15440M49751), EnumC21437.NONE);
        if (mo1526()) {
            return C17222.m40521();
        }
        if (z) {
            C24009.m52848(this, strArr, listM49750, c1764M52845.m5894());
        }
        return C17222.m40520();
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        boolean zM11552 = m11552("compressToAnother");
        C24009.m52849(c17222, zM11552, zM11552 ? m11525(c16561) : m11542(c16560), c16560, c16561, Collections.singletonList(this.f7101.getName()));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
