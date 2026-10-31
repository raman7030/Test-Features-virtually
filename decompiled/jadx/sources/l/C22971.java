package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩺ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes2.dex */
public class C22971 extends AbstractC22366 {

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public String f73976 = "null";

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f73975 = new ArrayList();

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
        return C4925.m14306(R.string.MT_Protector, this.f73976);
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
        int i;
        int i2;
        AbstractC15440 abstractC15440M11515 = m11515("outputDir");
        String[] strArrM11558 = m11558("ARG_PATHS");
        int iM11548 = m11548("level");
        EnumC6434 enumC6434 = EnumC6434.values()[m11548("format")];
        boolean zM11552 = m11552("deleteSources");
        boolean z = true;
        C14836 c14836 = new C14836(this, strArrM11558, true);
        if (mo1526()) {
            return C17222.m40521();
        }
        int length = strArrM11558.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f73975;
            if (i4 >= length) {
                if (!mo1526() && zM11552) {
                    C24009.m52848(this, strArrM11558, arrayList, c14836.m35241());
                }
                return m11545();
            }
            AbstractC15440 abstractC15440M39866 = C16999.m39866(strArrM11558[i4], new String[i3]);
            if (enumC6434.f19900 && abstractC15440M39866.mo23113()) {
                throw new Exception(C4153.m12552(abstractC15440M39866, new StringBuilder("Can not compress directory: ")));
            }
            StringBuilder sbM15339 = C5368.m15339((abstractC15440M39866.mo23113() || enumC6434.f19900) ? abstractC15440M39866.getName() : abstractC15440M39866.m36517());
            sbM15339.append(enumC6434.f19899);
            AbstractC15440 abstractC15440M36492 = abstractC15440M11515.m36526(sbM15339.toString()).m36492(z);
            this.f73976 = abstractC15440M36492.getName();
            C1764 c1764M35238 = c14836.m35238(i4);
            if (enumC6434.f19900 && c1764M35238.f6117.size() != z) {
                throw new RuntimeException("Expected to be a single file, but file size = " + c1764M35238.f6117.size());
            }
            try {
                boolean z2 = enumC6434.f19900;
                String str = MotionUtils.EASING_TYPE_FORMAT_END;
                String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
                String str3 = "/";
                if (z2) {
                    C7469 c7469 = (C7469) c1764M35238.f6117.get(0);
                    CharSequence charSequence = c7469.f22995;
                    AbstractC15440 abstractC15440 = c7469.f22994;
                    mo11520(charSequence);
                    c14836.m35242();
                    mo11546(C4925.m14327(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c14836.m35237() + "/" + c14836.m35241() + MotionUtils.EASING_TYPE_FORMAT_END);
                    OutputStream outputStreamM17794 = enumC6434.m17794(abstractC15440M36492.mo23555(false), iM11548, abstractC15440.mo23127());
                    try {
                        abstractC15440.m36495(outputStreamM17794, new C6038(this, c14836));
                        if (outputStreamM17794 != null) {
                            outputStreamM17794.close();
                        }
                        i = iM11548;
                        enumC6434 = enumC6434;
                        i2 = length;
                        i4 = i4;
                        arrayList = arrayList;
                    } catch (Throwable th) {
                        if (outputStreamM17794 == null) {
                            throw th;
                        }
                        try {
                            outputStreamM17794.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    EnumC6434 enumC6435 = enumC6434.f19902;
                    C21820 c21820 = new C21820(enumC6435 == null ? abstractC15440M36492.m36525() : enumC6435.m17794(abstractC15440M36492.mo23555(false), iM11548, -1L));
                    try {
                        c21820.m49188();
                        c21820.m49186();
                        Iterator it = c1764M35238.f6117.iterator();
                        while (it.hasNext()) {
                            C7469 c74610 = (C7469) it.next();
                            if (mo1526()) {
                                break;
                            }
                            c14836.m35242();
                            mo11546(C4925.m14327(R.string.MT_Protector) + str2 + c14836.m35237() + str3 + c14836.m35241() + str);
                            boolean z3 = c74610.f23002;
                            String str4 = c74610.f22999;
                            long j = c74610.f22997;
                            Iterator it2 = it;
                            String str5 = c74610.f22995;
                            int i5 = iM11548;
                            boolean z4 = c74610.f23001;
                            if (z3) {
                                C1358 c1358 = new C1358(z4 ? (byte) 50 : (byte) 53, str5 + str3);
                                c1358.m4737(C4529.fromMillis(j));
                                if (c74610.f23000) {
                                    c1358.m4732(c74610.f23004 | 16384);
                                    c1358.m4763(c74610.f22996);
                                    c1358.m4734(c74610.f22998);
                                }
                                if (z4) {
                                    c1358.m4752(str4);
                                }
                                c21820.m49185(c1358);
                                c21820.m49187();
                                str2 = str2;
                                str3 = str3;
                            } else {
                                length = length;
                                AbstractC15440 abstractC15441 = c74610.f22994;
                                mo11520(str5);
                                C1358 c1359 = new C1358(z4 ? (byte) 50 : UTF8.S_P3A, str5);
                                c1359.m4751(z4 ? 0L : c74610.f23003);
                                c1359.m4737(C4529.fromMillis(j));
                                if (c74610.f23000) {
                                    c1359.m4732(c74610.f23004 | 32768);
                                    c1359.m4763(c74610.f22996);
                                    c1359.m4734(c74610.f22998);
                                }
                                if (z4) {
                                    c1359.m4752(str4);
                                }
                                c21820.m49185(c1359);
                                if (!z4) {
                                    abstractC15441.m36495(c21820, new C11683(this, c14836));
                                }
                                c21820.m49187();
                            }
                            str3 = str3;
                            str = str;
                            it = it2;
                            iM11548 = i5;
                            length = length;
                            str2 = str2;
                        }
                        i = iM11548;
                        i2 = length;
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
                }
                if (mo1526()) {
                    abstractC15440M36492.mo27929();
                    return C17222.m40521();
                }
                arrayList.add(abstractC15440M36492);
                i4++;
                z = true;
                i3 = 0;
                abstractC15440M11515 = abstractC15440M11515;
                enumC6434 = enumC6434;
                iM11548 = i;
                length = i2;
            } catch (Exception e) {
                abstractC15440M36492.mo27929();
                throw e;
            }
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        boolean zM11552 = m11552("compressToAnother");
        C24009.m52849(c17222, zM11552, zM11552 ? m11525(c16561) : m11542(c16560), c16560, c16561, C24009.m52844((List) this.f73975));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
