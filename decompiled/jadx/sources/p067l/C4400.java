package p067l;

import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
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
public class C4400 extends AbstractC23625 {

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC17043 f9887;

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
        OutputStream outputStreamM19741;
        String[] strArr;
        boolean z;
        C23412 c23412;
        this.f9887 = m13451("output");
        String[] strArrM13494 = m13494("ARG_PATHS");
        EnumC8483 enumC8483 = EnumC8483.values()[m13484("format")];
        int iM13484 = m13484("level");
        boolean zM13488 = m13488("deleteSources");
        boolean zM13489 = m13488("replaceExisting");
        C4045 c4045M55251 = C25187.m55251((AbstractC5996) this, strArrM13494, true);
        ArrayList arrayList = c4045M55251.f8893;
        if (mo3924()) {
            return C18736.m42768();
        }
        if (enumC8483.f22772 && arrayList.size() != 1) {
            throw new RuntimeException("Expected to be a single file, but file size = " + arrayList.size());
        }
        C23412 c23412M52082 = C23412.m52082(this.f9887, zM13489);
        AbstractC17043 abstractC17043M52089 = c23412M52082.m52089();
        if (enumC8483.f22772) {
            C9467 c9467 = (C9467) arrayList.get(0);
            mo13482(C7050.m16224(R.string.MT_Protector));
            CharSequence charSequence = c9467.f25908;
            AbstractC17043 abstractC17043 = c9467.f25907;
            mo13456(charSequence);
            try {
                OutputStream outputStreamM19742 = enumC8483.m19741(abstractC17043M52089.mo25506(false), iM13484, abstractC17043.mo25101());
                try {
                    abstractC17043.m38653(outputStreamM19742, new C15482(this, c9467));
                    if (outputStreamM19742 != null) {
                        outputStreamM19742.close();
                    }
                    strArr = strArrM13494;
                    z = zM13488;
                    c23412 = c23412M52082;
                } catch (Throwable th) {
                    if (outputStreamM19742 == null) {
                        throw th;
                    }
                    try {
                        outputStreamM19742.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (Exception e) {
                abstractC17043M52089.mo29990();
                throw e;
            }
        } else {
            EnumC8483 enumC8484 = enumC8483.f22774;
            try {
                if (enumC8484 == null) {
                    outputStreamM19741 = abstractC17043M52089.m38683();
                } else {
                    outputStreamM19741 = enumC8484.m19741(abstractC17043M52089.mo25506(false), iM13484, -1L);
                }
                C23106 c23106 = new C23106(outputStreamM19741);
                try {
                    c23106.m51539();
                    c23106.m51537();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C9467 c9468 = (C9467) it.next();
                        if (mo3924()) {
                            break;
                        }
                        c4045M55251.m8105();
                        boolean z2 = c9468.f25915;
                        long j = c9468.f25916;
                        String str = c9468.f25912;
                        long j2 = c9468.f25910;
                        String str2 = c9468.f25908;
                        Iterator it2 = it;
                        boolean z3 = c9468.f25914;
                        String[] strArr2 = strArrM13494;
                        if (z2) {
                            C3659 c3659 = new C3659(z3 ? (byte) 50 : (byte) 53, str2 + "/");
                            c3659.m6975(C6673.fromMillis(j2));
                            if (c9468.f25913) {
                                c3659.m6970(c9468.f25917 | 16384);
                                c3659.m7001(c9468.f25909);
                                c3659.m6972(c9468.f25911);
                            }
                            if (z3) {
                                c3659.m6990(str);
                            }
                            c23106.m51536(c3659);
                            c23106.m51538();
                        } else {
                            AbstractC17043 abstractC17044 = c9468.f25907;
                            mo13482(C7050.m16224(R.string.MT_Protector) + MotionUtils.EASING_TYPE_FORMAT_START + c4045M55251.m8099() + "/" + c4045M55251.m8104() + MotionUtils.EASING_TYPE_FORMAT_END);
                            mo13456(str2);
                            C3659 c36510 = new C3659(z3 ? (byte) 50 : UTF8.S_P3A, str2);
                            c36510.m6989(z3 ? 0L : j);
                            c36510.m6975(C6673.fromMillis(j2));
                            if (c9468.f25913) {
                                c36510.m6970(c9468.f25917 | 32768);
                                c36510.m7001(c9468.f25909);
                                c36510.m6972(c9468.f25911);
                            }
                            if (z3) {
                                c36510.m6990(str);
                            }
                            c23106.m51536(c36510);
                            if (!z3) {
                                abstractC17044.m38653(c23106, new C9448(this, c4045M55251));
                            }
                            c23106.m51538();
                            c4045M55251.m8100(j);
                        }
                        it = it2;
                        strArrM13494 = strArr2;
                        zM13488 = zM13488;
                        c23412M52082 = c23412M52082;
                    }
                    strArr = strArrM13494;
                    z = zM13488;
                    c23412 = c23412M52082;
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
            } catch (Exception e2) {
                abstractC17043M52089.mo29990();
                throw e2;
            }
        }
        if (mo3924()) {
            abstractC17043M52089.mo29990();
            return C18736.m42768();
        }
        List listM52088 = c23412.m52088(Collections.singletonList(abstractC17043M52089), EnumC22742.NONE);
        if (mo3924()) {
            return C18736.m42768();
        }
        if (z) {
            C25187.m55254(this, strArr, listM52088, c4045M55251.m8104());
        }
        return C18736.m42767();
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        boolean zM13488 = m13488("compressToAnother");
        C25187.m55255(c18736, zM13488, zM13488 ? m13461(c18108) : m13478(c18107), c18107, c18108, Collections.singletonList(this.f9887.getName()));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        C17127.m38756();
    }
}
