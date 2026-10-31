package l;

import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public class C8676 extends AbstractC6138 {

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public String f26458;

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۠ */
    public final C11813 mo2779() {
        return C23777.f76965;
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo2778() {
        return C4925.m14306(R.string.MT_Protector, m11517("saveAsPath"), m11556("title"));
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2782() {
        mo11546(m11556("title"));
        m11555(R.string.MT_Protector);
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۢ */
    public final C17222 mo2780() throws Throwable {
        C18090 c18090;
        Throwable th;
        C18090 c18091;
        Throwable th2;
        AbstractC15440 abstractC15440M11515 = m11515("inputPath1");
        AbstractC15440 abstractC15440M11516 = m11515("inputPath2");
        C18090 c18092 = new C18090(abstractC15440M11515);
        try {
            try {
                C18090 c18093 = new C18090(abstractC15440M11516);
                try {
                    HashMap map = new HashMap(c18092.m42207());
                    HashMap map2 = new HashMap(c18093.m42207());
                    C14561 c14561M42196 = c18092.m42196();
                    C14561 c14561M42197 = c18093.m42196();
                    Iterator it = c18092.m42210().iterator();
                    while (true) {
                        String str = "Comparing encrypted files is not supported";
                        if (it.hasNext()) {
                            try {
                                C3545 c3545 = (C3545) it.next();
                                if (!c3545.isDirectory()) {
                                    if (c3545.m10808()) {
                                        c18090 = c18092;
                                        throw new IOException("Comparing encrypted files is not supported");
                                    }
                                    c18090 = c18092;
                                    C14561 c14561 = c14561M42196;
                                    try {
                                        map.put(c3545.getName(), new C6559(c3545.getName(), c3545.getSize(), new C23492(c3545), c14561M42196, c3545));
                                        c18092 = c18090;
                                        c14561M42196 = c14561;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                    th2 = th;
                                    c18091 = c18093;
                                    try {
                                        c18091.close();
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c18090 = c18092;
                            }
                        } else {
                            c18090 = c18092;
                            try {
                                Iterator it2 = c18093.m42210().iterator();
                                while (it2.hasNext()) {
                                    C3545 c3546 = (C3545) it2.next();
                                    if (!c3546.isDirectory()) {
                                        if (c3546.m10808()) {
                                            throw new IOException(str);
                                        }
                                        Iterator it3 = it2;
                                        c18091 = c18093;
                                        C14561 c14562 = c14561M42197;
                                        C14561 c14563 = c14561M42197;
                                        String str2 = str;
                                        try {
                                            map2.put(c3546.getName(), new C20671(c3546.getName(), c3546.getSize(), new C23492(c3546), c14562, c3546));
                                            str = str2;
                                            c18093 = c18091;
                                            it2 = it3;
                                            c14561M42197 = c14563;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                        th2 = th;
                                        c18091.close();
                                        throw th2;
                                    }
                                }
                                C18090 c18094 = c18093;
                                this.f26458 = C8198.m21696(abstractC15440M11515.mo23554(), abstractC15440M11516.mo23554(), map, map2, new C9382(this));
                                c18094.close();
                                c18090.close();
                                return m11545();
                            } catch (Throwable th7) {
                                th = th7;
                                c18091 = c18093;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c18090 = c18092;
                }
            } catch (Throwable th9) {
                th = th9;
                th = th;
                try {
                    c18090.close();
                    throw th;
                } catch (Throwable th10) {
                    th.addSuppressed(th10);
                    throw th;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            c18090 = c18092;
            th = th;
            c18090.close();
            throw th;
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ֫ */
    public final void mo2777(Main main, C16560 c16560, C16560 c16561, C17222 c17222) {
        if (c17222.m40526()) {
            if (this.f26458.isEmpty()) {
                C21374.m48463(R.string.MT_Protector);
                return;
            }
            String str = this.f26458;
            String strM11556 = m11556("title");
            String strM11557 = m11556("saveAsPath");
            int i = C7017.f21654;
            ActivityC14946.m35399(main, str, strM11556, strM11557, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // l.AbstractC3817
    /* JADX INFO: renamed from: ۧ */
    public final void mo2781(C17222 c17222) {
        C15528.m36596();
    }
}
