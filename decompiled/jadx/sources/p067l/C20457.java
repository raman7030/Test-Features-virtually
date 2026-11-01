package p067l;

import android.content.ContextWrapper;
import android.content.Intent;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ᩴ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1PO */
/* JADX INFO: loaded from: classes.dex */
public class C20457 extends AbstractC8202 {

    /* JADX INFO: renamed from: ֡֫ */
    public C13081 f63182;

    /* JADX INFO: renamed from: ֨֫ */
    public C19561 f63183;

    /* JADX INFO: renamed from: ۖ֫ */
    public AbstractC17043 f63184;

    /* JADX INFO: renamed from: ۘ֫ */
    public boolean f63185;

    /* JADX INFO: renamed from: ۚ֫ */
    public C19561 f63186;

    /* JADX INFO: renamed from: ۠֫ */
    public C10844 f63187;

    /* JADX INFO: renamed from: ᩴ֫ */
    public AbstractC17043 f63189;

    /* JADX INFO: renamed from: ܺ֫ */
    public AtomicInteger f63188 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩵֫ */
    public C2582 f63190 = new C2582(C19110.f57020 * 2);

    static {
        ApplicationC14266.m56479(141);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۢ */
    public native C18736 mo5125();

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

    /* JADX INFO: renamed from: ֫ */
    public static void m46148(final C20457 c20457, final BufferedOutputStream bufferedOutputStream, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C13571 c13571, C9727 c9727) throws Throwable {
        boolean z6;
        AtomicInteger atomicInteger = c20457.f63188;
        final String str = c13571.f38173;
        C18444 c18444 = c13571.f38170;
        C9952 c9952 = c18444.f55155;
        if (c9952 != null && c18444.f55156 == null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C13220 c13220M46152 = c20457.m46152(c18444.f55155);
                c9727.m22732(new InterfaceC15761() { // from class: l.ۡ᩸ܽ
                    @Override // p067l.InterfaceC15761
                    public final void run() {
                        C20457.m46151(this.f30644, str, bufferedOutputStream, c13220M46152);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                C19115 c19115 = (C19115) c18444.f55155.f27561.m33481();
                c19115.m43426();
                try {
                    if (C21128.m47751(c18444.f55155)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                    c19115.m43427();
                }
            }
        }
        if (c9952 == null && c18444.f55156 != null) {
            if (!z5 || !str.matches(".*/R\\$[a-z]+")) {
                final C13220 c13220M46153 = c20457.m46152(c18444.f55156);
                c9727.m22732(new InterfaceC15761() { // from class: l.ܺ᩸ܽ
                    @Override // p067l.InterfaceC15761
                    public final void run() {
                        C20457.m46149(this.f53074, str, bufferedOutputStream, c13220M46153);
                    }
                });
                atomicInteger.incrementAndGet();
                return;
            } else {
                C19115 c19116 = (C19115) c18444.f55156.f27561.m33481();
                c19116.m43426();
                try {
                    if (C21128.m47751(c18444.f55156)) {
                        System.out.println("Skip R class: ".concat(str));
                    }
                    return;
                } finally {
                    c19116.m43427();
                }
            }
        }
        c20457.mo13456(str);
        C14645 c14645 = c18444.f55155.f27561;
        C14645 c14646 = c18444.f55156.f27561;
        C19115 c19117 = (C19115) c14645.m33481();
        C19115 c19118 = (C19115) c14646.m33481();
        boolean z7 = false;
        try {
            c19117.m43426();
            z6 = true;
            try {
                c19118.m43426();
                try {
                    if (!c18444.f55155.m23262(c18444.f55156, z, z2, z3, z4, z5)) {
                        if (z5 && C21128.m47751(c18444.f55155) && C21128.m47751(c18444.f55156)) {
                            System.out.println("Skip R class: " + str);
                            c19118.m43427();
                            c19117.m43427();
                            return;
                        }
                        final C13220 c13220M46154 = c20457.m46152(c18444.f55155);
                        final C13220 c13220M46155 = c20457.m46152(c18444.f55156);
                        if (c13220M46154.equals(c13220M46155)) {
                            c20457.m46147(c13220M46154);
                            c20457.m46147(c13220M46155);
                            c19118.m43427();
                            c19117.m43427();
                            return;
                        }
                        c9727.m22732(new InterfaceC15761() { // from class: l.ۖ᩸ܽ
                            @Override // p067l.InterfaceC15761
                            public final void run() {
                                C20457.m46150(this.f11560, str, bufferedOutputStream, c13220M46154, c13220M46155);
                            }
                        });
                        atomicInteger.incrementAndGet();
                    }
                    c19118.m43427();
                    c19117.m43427();
                } catch (Throwable th) {
                    th = th;
                    z7 = true;
                    if (z7) {
                        c19118.m43427();
                    }
                    if (z6) {
                        c19117.m43427();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            z6 = false;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m46151(C20457 c20457, String str, BufferedOutputStream bufferedOutputStream, C13220 c13220) {
        try {
            c20457.f63187.m24986("a/" + str);
            C7855.m18155(bufferedOutputStream, c13220);
            bufferedOutputStream.flush();
        } finally {
            c20457.m46147(c13220);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46149(C20457 c20457, String str, BufferedOutputStream bufferedOutputStream, C13220 c13220) {
        try {
            c20457.f63187.m24986("b/" + str);
            C7855.m18155(bufferedOutputStream, c13220);
            bufferedOutputStream.flush();
        } finally {
            c20457.m46147(c13220);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m46150(C20457 c20457, String str, BufferedOutputStream bufferedOutputStream, C13220 c13220, C13220 c13221) {
        try {
            c20457.f63187.m24986("a/" + str);
            C7855.m18155(bufferedOutputStream, c13220);
            bufferedOutputStream.flush();
            c20457.f63187.m24986("b/" + str);
            C7855.m18155(bufferedOutputStream, c13221);
            bufferedOutputStream.flush();
        } finally {
            c20457.m46147(c13220);
            c20457.m46147(c13221);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13220 m46152(C9952 c9952) {
        C2582 c2582 = this.f63190;
        C23616 c23616 = this.f63182.get();
        C14645 c14645 = c9952.f27561;
        C19115 c19115 = (C19115) c14645.m33481();
        c23616.f75161 = c14645.mo29499().f27379;
        c19115.m43426();
        try {
            try {
                C13220 c13220 = (C13220) c2582.m3892();
                if (c13220 == null) {
                    c13220 = new C13220();
                } else {
                    c13220.m30229(0);
                }
                C22946.m51262(new C6375(new C23948(c13220)), c9952, c23616);
                return c13220;
            } finally {
                c19115.m43427();
            }
        } catch (IOException | Error | RuntimeException e) {
            C13220 c13221 = (C13220) c2582.m3892();
            if (c13221 == null) {
                c13221 = new C13220();
            } else {
                c13221.m30229(0);
            }
            c13221.m30230(C6112.m13907(e));
            c19115.m43427();
            return c13221;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46147(C13220 c13220) {
        this.f63190.m3890(c13220);
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ֫ */
    public final void mo5122(Main main, C18107 c18107, C18107 c18108, C18736 c18736) {
        this.f63185 = true;
        m46146(main, c18736);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46146(ContextWrapper contextWrapper, C18736 c18736) {
        C10844 c10844 = this.f63187;
        if (c10844 != null) {
            C2700.m4192(c10844);
            this.f63187 = null;
        }
        if (c18736.m42773()) {
            if (this.f63188.get() == 0) {
                this.f63189.mo25503();
                C22682.m50799(R.string.MT_Protector);
            } else {
                Intent intent = new Intent(contextWrapper, (Class<?>) ActivityC23283.class);
                intent.setData(this.f63189.m38680());
                intent.putExtra("savedAsPath", m13492("saveAsPath"));
                contextWrapper.startActivity(intent);
            }
        }
    }

    @Override // p067l.AbstractC5996
    /* JADX INFO: renamed from: ۧ */
    public final void mo5126(C18736 c18736) {
        AbstractC17043 abstractC17043;
        if (!this.f63185) {
            m46146(C7050.m16232(), c18736);
        }
        C2700.m4192(this.f63186);
        C2700.m4192(this.f63183);
        C10844 c10844 = this.f63187;
        if (c10844 != null) {
            C2700.m4192(c10844);
        }
        if (!c18736.m42773() && (abstractC17043 = this.f63189) != null) {
            abstractC17043.mo25503();
        }
        AbstractC17043 abstractC17044 = this.f63184;
        if (abstractC17044 != null) {
            abstractC17044.mo25503();
        }
        C17127.m38756();
    }
}
