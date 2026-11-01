package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩺ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: E29Y */
/* JADX INFO: loaded from: classes2.dex */
public class C24200 extends AbstractC23625 {

    /* JADX INFO: renamed from: ᩴ֫ */
    public String f76707 = "null";

    /* JADX INFO: renamed from: ۘ֫ */
    public ArrayList f76706 = new ArrayList();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final C18736 mo5458(Exception exc) {
        if (!mo3924()) {
            return C18736.m42764(exc);
        }
        return C18736.m42768();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79710;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, this.f76707);
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
        int i;
        int i2;
        AbstractC17043 abstractC17043M13451 = m13451("outputDir");
        String[] strArrM13494 = m13494("ARG_PATHS");
        int iM13484 = m13484("level");
        EnumC8483 enumC8483 = EnumC8483.values()[m13484("format")];
        boolean zM13488 = m13488("deleteSources");
        boolean z = true;
        C16469 c16469 = new C16469(this, strArrM13494, true);
        if (mo3924()) {
            return C18736.m42768();
        }
        int length = strArrM13494.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f76706;
            if (i4 >= length) {
                if (!mo3924() && zM13488) {
                    C25187.m55254(this, strArrM13494, arrayList, c16469.m37396());
                }
                return m13481();
            }
            AbstractC17043 abstractC17043M42109 = C18524.m42109(strArrM13494[i4], new String[i3]);
            if (enumC8483.f22772 && abstractC17043M42109.mo25087()) {
                throw new Exception(C6316.m14442(abstractC17043M42109, new StringBuilder("Can not compress directory: ")));
            }
            StringBuilder sbM17248 = C7470.m17248((abstractC17043M42109.mo25087() || enumC8483.f22772) ? abstractC17043M42109.getName() : abstractC17043M42109.m38675());
            sbM17248.append(enumC8483.f22771);
            AbstractC17043 abstractC17043M38650 = abstractC17043M13451.m38684(sbM17248.toString()).m38650(z);
            this.f76707 = abstractC17043M38650.getName();
            C4045 c4045M37393 = c16469.m37393(i4);
            if (enumC8483.f22772 && c4045M37393.f8893.size() != z) {
                throw new RuntimeException("Expected to be a single file, but file size = " + c4045M37393.f8893.size());
            }
            try {
                boolean z2 = enumC8483.f22772;
                String str = MotionUtils.EASING_TYPE_FORMAT_END;
                String str2 = MotionUtils.EASING_TYPE_FORMAT_START;
                String str3 = "/";
                if (z2) {
                    C9467 c9467 = (C9467) c4045M37393.f8893.get(0);
                    CharSequence charSequence = c9467.f25908;
                    AbstractC17043 abstractC17043 = c9467.f25907;
                    mo13456(charSequence);
                    c16469.m37397();
                    mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c16469.m37392() + "/" + c16469.m37396() + MotionUtils.EASING_TYPE_FORMAT_END);
                    OutputStream outputStreamM19741 = enumC8483.m19741(abstractC17043M38650.mo25506(false), iM13484, abstractC17043.mo25101());
                    try {
                        abstractC17043.m38653(outputStreamM19741, new C8107(this, c16469));
                        if (outputStreamM19741 != null) {
                            outputStreamM19741.close();
                        }
                        i = iM13484;
                        enumC8483 = enumC8483;
                        i2 = length;
                        i4 = i4;
                        arrayList = arrayList;
                    } catch (Throwable th) {
                        if (outputStreamM19741 == null) {
                            throw th;
                        }
                        try {
                            outputStreamM19741.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } else {
                    EnumC8483 enumC8484 = enumC8483.f22774;
                    C23106 c23106 = new C23106(enumC8484 == null ? abstractC17043M38650.m38683() : enumC8484.m19741(abstractC17043M38650.mo25506(false), iM13484, -1L));
                    try {
                        c23106.m51539();
                        c23106.m51537();
                        Iterator it = c4045M37393.f8893.iterator();
                        while (it.hasNext()) {
                            C9467 c9468 = (C9467) it.next();
                            if (mo3924()) {
                                break;
                            }
                            c16469.m37397();
                            mo13482(C7050.m16224(R.string.MT_Protector) + str2 + c16469.m37392() + str3 + c16469.m37396() + str);
                            boolean z3 = c9468.f25915;
                            String str4 = c9468.f25912;
                            long j = c9468.f25910;
                            Iterator it2 = it;
                            String str5 = c9468.f25908;
                            int i5 = iM13484;
                            boolean z4 = c9468.f25914;
                            if (z3) {
                                C3659 c3659 = new C3659(z4 ? (byte) 50 : (byte) 53, str5 + str3);
                                c3659.m6975(C6673.fromMillis(j));
                                if (c9468.f25913) {
                                    c3659.m6970(c9468.f25917 | 16384);
                                    c3659.m7001(c9468.f25909);
                                    c3659.m6972(c9468.f25911);
                                }
                                if (z4) {
                                    c3659.m6990(str4);
                                }
                                c23106.m51536(c3659);
                                c23106.m51538();
                                str2 = str2;
                                str3 = str3;
                            } else {
                                length = length;
                                AbstractC17043 abstractC17044 = c9468.f25907;
                                mo13456(str5);
                                C3659 c36510 = new C3659(z4 ? (byte) 50 : UTF8.S_P3A, str5);
                                c36510.m6989(z4 ? 0L : c9468.f25916);
                                c36510.m6975(C6673.fromMillis(j));
                                if (c9468.f25913) {
                                    c36510.m6970(c9468.f25917 | 32768);
                                    c36510.m7001(c9468.f25909);
                                    c36510.m6972(c9468.f25911);
                                }
                                if (z4) {
                                    c36510.m6990(str4);
                                }
                                c23106.m51536(c36510);
                                if (!z4) {
                                    abstractC17044.m38653(c23106, new C13472(this, c16469));
                                }
                                c23106.m51538();
                            }
                            str3 = str3;
                            str = str;
                            it = it2;
                            iM13484 = i5;
                            length = length;
                            str2 = str2;
                        }
                        i = iM13484;
                        i2 = length;
                        c23106.close();
                    } catch (Throwable th3) {
                        try {
                            c23106.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                }
                if (mo3924()) {
                    abstractC17043M38650.mo29990();
                    return C18736.m42768();
                }
                arrayList.add(abstractC17043M38650);
                i4++;
                z = true;
                i3 = 0;
                abstractC17043M13451 = abstractC17043M13451;
                enumC8483 = enumC8483;
                iM13484 = i;
                length = i2;
            } catch (Exception e) {
                abstractC17043M38650.mo29990();
                throw e;
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        boolean zM13488 = m13488("compressToAnother");
        C25187.m55255(c18736, zM13488, zM13488 ? m13461(c18108) : m13478(c18107), c18107, c18108, C25187.m55250((List) this.f76706));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
