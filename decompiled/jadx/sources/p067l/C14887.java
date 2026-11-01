package p067l;

import bin.p000mt.plus.R;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;

/* JADX INFO: renamed from: l.۬ܳۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C14887 extends AbstractC9542 {

    /* JADX INFO: renamed from: ۜ */
    public final /* synthetic */ String f42460;

    /* JADX INFO: renamed from: ۢ */
    public final /* synthetic */ int f42461;

    /* JADX INFO: renamed from: ܳ */
    public C24164 f42462;

    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ HashSet f42463;

    /* JADX INFO: renamed from: ᩻ */
    public final /* synthetic */ ViewOnClickListenerC9523 f42464;

    public C14887(ViewOnClickListenerC9523 viewOnClickListenerC9523, int i, HashSet hashSet, String str) {
        this.f42464 = viewOnClickListenerC9523;
        this.f42461 = i;
        this.f42463 = hashSet;
        this.f42460 = str;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ۧ */
    public final void mo3404() {
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f42464;
        viewOnClickListenerC9523.f26081.m32112();
        C24164 c24164 = new C24164((AbstractActivityC5549) viewOnClickListenerC9523.requireActivity());
        c24164.m53440(R.string.MT_Protector);
        c24164.mo51878((Runnable) null);
        c24164.mo51883();
        this.f42462 = c24164;
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ܿ */
    public final void mo3405() throws C3924 {
        ViewOnClickListenerC9523 viewOnClickListenerC9523 = this.f42464;
        String str = this.f42460;
        HashSet<String> hashSet = this.f42463;
        int i = this.f42461;
        if (i == 0) {
            C20689 c20689 = new C20689(hashSet.size());
            C24164 c24164 = this.f42462;
            C12826.requireNonNull(c24164);
            c20689.m46753(new C24793(c24164));
            C10844 c10844 = new C10844(str);
            try {
                C15230 c15230 = new C15230(new BufferedOutputStream(c10844.m24981()));
                C23948 c23948 = new C23948();
                for (String str2 : hashSet) {
                    if (!this.f42462.m53444()) {
                        c20689.m46754(1);
                        c10844.m24986(str2 + ".smali");
                        C14121 c14121 = viewOnClickListenerC9523.f26081;
                        c23948.m53044();
                        c14121.m32090(str2, c23948);
                        c15230.append((CharSequence) c23948.m53043());
                        c15230.flush();
                    } else {
                        c10844.close();
                        return;
                    }
                }
                c10844.close();
                return;
            } catch (Throwable th) {
                try {
                    c10844.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i == 1) {
            C20689 c206810 = new C20689(hashSet.size());
            C24164 c24165 = this.f42462;
            C12826.requireNonNull(c24165);
            c206810.m46753(new C24793(c24165));
            C20765 c20765M47281 = null;
            for (String str3 : hashSet) {
                if (this.f42462.m53444()) {
                    return;
                }
                c206810.m46754(1);
                InterfaceC15206 interfaceC15206M32127 = viewOnClickListenerC9523.f26081.m32127(str3);
                C12826.requireNonNull(interfaceC15206M32127);
                if (c20765M47281 == null) {
                    c20765M47281 = interfaceC15206M32127.mo33761().m47281();
                }
                c20765M47281.m46900((InterfaceC10509) interfaceC15206M32127.mo33757());
                if (c20765M47281.m50872()) {
                    throw new C3924(R.string.MT_Protector);
                }
            }
            if (c20765M47281 != null) {
                c20765M47281.m50870(new C3329(C18524.m42109(str, new String[0])));
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        C20689 c206811 = new C20689(hashSet.size());
        C24164 c24166 = this.f42462;
        C12826.requireNonNull(c24166);
        c206811.m46753(new C24793(c24166));
        C22776 c22776 = new C22776();
        C10844 c10845 = new C10844(str);
        try {
            for (String str4 : hashSet) {
                if (!this.f42462.m53444()) {
                    c206811.m46754(1);
                    InterfaceC15206 interfaceC15206M32128 = viewOnClickListenerC9523.f26081.m32127(str4);
                    C12826.requireNonNull(interfaceC15206M32128);
                    C20765 c20765M47282 = interfaceC15206M32128.mo33761().m47281();
                    c20765M47282.m46900((InterfaceC10509) interfaceC15206M32128.mo33757());
                    c22776.m50960();
                    c20765M47282.m50870(c22776);
                    byte[] bArrM12158 = C5514.m12155(ByteBuffer.wrap(c22776.m50959(), 0, c22776.m50962())).m12158();
                    c10845.m24986(str4 + ".class");
                    c10845.write(bArrM12158);
                } else {
                    c10845.close();
                    return;
                }
            }
            c10845.close();
        } catch (Throwable th3) {
            try {
                c10845.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3402() {
        if (this.f42462.m53444()) {
            C22682.m50793(R.string.MT_Protector);
            C18524.m42109(this.f42460, new String[0]).mo25503();
            return;
        }
        C22682.m50793(R.string.MT_Protector);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ֫ */
    public final void mo3403(Exception exc) {
        this.f42464.f26075.m13320((Throwable) exc);
    }

    @Override // p067l.AbstractC9542
    /* JADX INFO: renamed from: ᩳ */
    public final void mo3406() {
        this.f42464.f26081.m32122();
        this.f42462.m53442();
    }
}
