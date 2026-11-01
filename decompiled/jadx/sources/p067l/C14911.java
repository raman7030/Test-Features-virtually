package p067l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.۬ܶܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: MB7O */
/* JADX INFO: loaded from: classes4.dex */
public class C14911 extends AbstractC5520 {

    /* JADX INFO: renamed from: ᩵֫ */
    public static final /* synthetic */ int f42524 = 0;

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f42525;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f42528;

    /* JADX INFO: renamed from: ᩴ֫ */
    public AbstractC17043 f42529;

    /* JADX INFO: renamed from: ۡ֫ */
    public AtomicInteger f42527 = new AtomicInteger();

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC17043 f42526 = C17853.f53286.m38685();

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۠ */
    public final C13596 mo5124() {
        return C24966.f79717;
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۘ֫ */
    public final CharSequence mo5123() {
        return C7050.m16203(R.string.MT_Protector, m13453("saveAsPath"), C7050.m16224(R.string.MT_Protector));
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ᩷ */
    public final void mo5127() {
        m13472(R.string.MT_Protector);
        m13491(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public final C18736 mo5125() {
        AbstractC17043 abstractC17043 = this.f42526;
        AbstractC17043 abstractC17043M13451 = m13451("saveAsPath");
        AbstractC17043 abstractC17043M13452 = m13451("inputPath1");
        AbstractC17043 abstractC17043M13453 = m13451("inputPath2");
        AbstractC17043 abstractC17043M38685 = C17853.f53278.m38685();
        this.f42529 = abstractC17043M38685;
        C10844 c10844 = new C10844(abstractC17043M38685);
        try {
            c10844.m24992(0);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c10844.m24981());
            mo13456(C7050.m16203(R.string.MT_Protector, abstractC17043M13452.getName()));
            AbstractC17043 abstractC17043M32723 = C14241.m32723(abstractC17043M13452);
            for (C6773 c6773 : C14149.m32614(abstractC17043M32723, abstractC17043)) {
                c10844.m24986("a/" + c6773.m15454());
                c6773.m15455(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo3924()) {
                    break;
                }
            }
            abstractC17043.mo25503();
            if (abstractC17043M32723 != abstractC17043M13452) {
                abstractC17043M32723.mo29990();
            }
            if (mo3924()) {
                C18736 c18736M42768 = C18736.m42768();
                c10844.close();
                return c18736M42768;
            }
            System.gc();
            mo13456(C7050.m16203(R.string.MT_Protector, abstractC17043M13453.getName()));
            AbstractC17043 abstractC17043M32724 = C14241.m32723(abstractC17043M13453);
            for (C6773 c6774 : C14149.m32614(abstractC17043M32724, abstractC17043)) {
                c10844.m24986("b/" + c6774.m15454());
                c6774.m15455(bufferedOutputStream);
                bufferedOutputStream.flush();
                if (mo3924()) {
                    break;
                }
            }
            abstractC17043.mo25503();
            if (abstractC17043M32724 != abstractC17043M13453) {
                abstractC17043M32724.mo29990();
            }
            if (mo3924()) {
                C18736 c18736M42769 = C18736.m42768();
                c10844.close();
                return c18736M42769;
            }
            c10844.close();
            m13491(R.string.MT_Protector);
            HashMap map = new HashMap();
            this.f42525 = C17853.f53278.m38684(abstractC17043M13451.getName());
            C19561 c19561 = new C19561(this.f42529);
            try {
                C10844 c10845 = new C10844(this.f42525);
                try {
                    for (C5738 c5738 : c19561.m44469()) {
                        String name = c5738.getName();
                        if (name.startsWith("a/")) {
                            ((C6865) C15525.computeIfAbsent(map, name.substring(2), new C5524())).f17847 = c5738;
                        } else if (name.startsWith("b/")) {
                            ((C6865) C15525.computeIfAbsent(map, name.substring(2), new C5524())).f17848 = c5738;
                        }
                    }
                    C22739 c22739 = new C22739();
                    c22739.m50886("type", "arsc");
                    c22739.m50886("file1", abstractC17043M13452.mo25505());
                    c22739.m50886("file2", abstractC17043M13453.mo25505());
                    c22739.m50886("versionCode", (Object) 26101061);
                    c10845.m24986("info.json");
                    c10845.write(c22739.mo16897().getBytes(Charset.defaultCharset()));
                    for (Map.Entry entry : map.entrySet()) {
                        if (mo3924()) {
                            C18736 c18736M427610 = C18736.m42768();
                            c10845.close();
                            c19561.close();
                            return c18736M427610;
                        }
                        String str = (String) entry.getKey();
                        C6865 c6865 = (C6865) entry.getValue();
                        C5738 c5739 = c6865.f17847;
                        AtomicInteger atomicInteger = this.f42527;
                        if (c5739 != null && c6865.f17848 == null) {
                            c10845.m24986("a/" + str);
                            c10845.m24985(c19561.m44448(c6865.f17847));
                            atomicInteger.incrementAndGet();
                        } else if (c5739 == null && c6865.f17848 != null) {
                            c10845.m24986("b/" + str);
                            c10845.m24985(c19561.m44448(c6865.f17848));
                            atomicInteger.incrementAndGet();
                        } else if (!Arrays.equals(c19561.m44452(c5739, (C20689) null), c19561.m44452(c6865.f17848, (C20689) null))) {
                            c10845.m24986("a/" + str);
                            c10845.m24985(c19561.m44448(c6865.f17847));
                            c10845.m24986("b/" + str);
                            c10845.m24985(c19561.m44448(c6865.f17848));
                            atomicInteger.incrementAndGet();
                        }
                        try {
                            c19561.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    }
                    c10845.close();
                    c19561.close();
                    return C18736.m42767();
                } catch (Throwable th2) {
                    try {
                        c10845.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                c19561.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                c10844.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        this.f42528 = true;
        m34118(main, c18736);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m34118(ContextWrapper contextWrapper, C18736 c18736) {
        if (c18736.m42773()) {
            if (this.f42527.get() == 0) {
                this.f42525.mo25503();
                C22682.m50799(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC23283.class);
                intent.setData(this.f42525.m38680());
                intent.putExtra("savedAsPath", m13492("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043;
        if (!this.f42528) {
            m34118(C7050.m16232(), c18736);
        }
        if (!c18736.m42773() && (abstractC17043 = this.f42525) != null) {
            abstractC17043.mo25503();
        }
        AbstractC17043 abstractC17044 = this.f42529;
        if (abstractC17044 != null) {
            abstractC17044.mo25503();
        }
        this.f42526.mo25503();
        C17127.m38756();
    }
}
