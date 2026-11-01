package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۡۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C12B */
/* JADX INFO: loaded from: classes4.dex */
public class C10614 extends AbstractC8202 {

    /* JADX INFO: renamed from: ܺ֫ */
    public String f29383;

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79717;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("saveAsPath"), m13492("title"));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        mo13482(m13492("title"));
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() throws Throwable {
        C19561 c19561;
        Throwable th;
        C19561 c19562;
        Throwable th2;
        AbstractC17043 abstractC17043M13451 = m13451("inputPath1");
        AbstractC17043 abstractC17043M13452 = m13451("inputPath2");
        C19561 c19563 = new C19561(abstractC17043M13451);
        try {
            try {
                C19561 c19564 = new C19561(abstractC17043M13452);
                try {
                    HashMap map = new HashMap(c19563.m44466());
                    HashMap map2 = new HashMap(c19564.m44466());
                    C16207 c16207M44455 = c19563.m44455();
                    C16207 c16207M44456 = c19564.m44455();
                    Iterator it = c19563.m44469().iterator();
                    while (true) {
                        String str = "Comparing encrypted files is not supported";
                        if (it.hasNext()) {
                            try {
                                C5738 c5738 = (C5738) it.next();
                                if (!c5738.isDirectory()) {
                                    if (c5738.m12789()) {
                                        c19561 = c19563;
                                        throw new IOException("Comparing encrypted files is not supported");
                                    }
                                    c19561 = c19563;
                                    C16207 c16207 = c16207M44455;
                                    try {
                                        map.put(c5738.getName(), new C8602(c5738.getName(), c5738.getSize(), new C24695(c5738), c16207M44455, c5738));
                                        c19563 = c19561;
                                        c16207M44455 = c16207;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                    th2 = th;
                                    c19562 = c19564;
                                    try {
                                        c19562.close();
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c19561 = c19563;
                            }
                        } else {
                            c19561 = c19563;
                            try {
                                Iterator it2 = c19564.m44469().iterator();
                                while (it2.hasNext()) {
                                    C5738 c5739 = (C5738) it2.next();
                                    if (!c5739.isDirectory()) {
                                        if (c5739.m12789()) {
                                            throw new IOException(str);
                                        }
                                        Iterator it3 = it2;
                                        c19562 = c19564;
                                        C16207 c16208 = c16207M44456;
                                        C16207 c16209 = c16207M44456;
                                        String str2 = str;
                                        try {
                                            map2.put(c5739.getName(), new C22014(c5739.getName(), c5739.getSize(), new C24695(c5739), c16208, c5739));
                                            str = str2;
                                            c19564 = c19562;
                                            it2 = it3;
                                            c16207M44456 = c16209;
                                        } catch (Throwable th6) {
                                            th = th6;
                                        }
                                        th2 = th;
                                        c19562.close();
                                        throw th2;
                                    }
                                }
                                C19561 c19565 = c19564;
                                this.f29383 = C10160.m23665(abstractC17043M13451.mo25505(), abstractC17043M13452.mo25505(), map, map2, new C11285(this));
                                c19565.close();
                                c19561.close();
                                return m13481();
                            } catch (Throwable th7) {
                                th = th7;
                                c19562 = c19564;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    c19561 = c19563;
                }
            } catch (Throwable th9) {
                th = th9;
                th = th;
                try {
                    c19561.close();
                    throw th;
                } catch (Throwable th10) {
                    th.addSuppressed(th10);
                    throw th;
                }
            }
        } catch (Throwable th11) {
            th = th11;
            c19561 = c19563;
            th = th;
            c19561.close();
            throw th;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        if (c18736.m42773()) {
            if (this.f29383.isEmpty()) {
                C22682.m50799(R.string.MT_Protector);
                return;
            }
            String str = this.f29383;
            String strM13492 = m13492("title");
            String strM13493 = m13492("saveAsPath");
            int i = C9038.f24535;
            ActivityC16573.m37551(main, str, strM13492, strM13493, "syntax:INTERNAL:".concat("FolderComparison"));
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
