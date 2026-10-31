package l;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩸ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7TM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21708 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12392 f69662;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Executor f69663;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C18222 f69664;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69665;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f69666;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f69667;

    static {
        ApplicationC12518.m30701(EnumC17734.f54268);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C15356 mo10278(int i, CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public void mo10279(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo10280(C12392 c12392) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo10281(C12392 c12392, CharSequence charSequence);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final native void m49032(CharSequence charSequence, int i, int i2, int i3);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo10282(C12392 c12392, CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ۚܽܿ] */
    public AbstractC21708(Context context) {
        ExecutorService executorService = C1802.f6208;
        this.f69666 = new AtomicInteger();
        this.f69663 = executorService;
        C18222 c18222 = new C18222(context, 240);
        this.f69664 = c18222;
        c18222.m42454(new AdapterView.OnItemClickListener() { // from class: l.֡ܽܿ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AbstractC21708.m49029(this.f2208, i);
            }
        });
        c18222.m42456((C5480) new AdapterView.OnItemLongClickListener() { // from class: l.ۚܽܿ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return AbstractC21708.m49030(this.f17017, i);
            }
        });
        m49037();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49029(AbstractC21708 abstractC21708, int i) {
        abstractC21708.mo10281(abstractC21708.f69662, abstractC21708.f69664.m42452(i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m49030(AbstractC21708 abstractC21708, int i) {
        return abstractC21708.mo10282(abstractC21708.f69662, abstractC21708.f69664.m42452(i));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49037() {
        int i = ApplicationC20075.f65010.getInt("comp_max_lines", 3);
        if (i == this.f69667) {
            return;
        }
        C18222 c18222 = this.f69664;
        int iM42458 = c18222.m42458();
        this.f69667 = i;
        int i2 = (iM42458 / 4) + (i * iM42458);
        this.f69665 = i2;
        c18222.m42459(i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m49031() {
        return this.f69665;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49033(C12392 c12392) {
        this.f69662 = c12392;
        this.f69666.incrementAndGet();
        mo10280(c12392);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m49034() {
        C18222 c18222 = this.f69664;
        if (!c18222.m42462() || c18222.m42460() || !ApplicationC20075.f65010.getBoolean("comp_enter_accept", true)) {
            return false;
        }
        mo10281(this.f69662, c18222.m42452(0));
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49036(C12392 c12392) {
        if (this.f69662 == c12392) {
            this.f69662 = null;
            m49035();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49038() {
        C12392 c12392 = this.f69662;
        if (c12392 == null) {
            return;
        }
        boolean zM51454 = C23196.m51454();
        AtomicInteger atomicInteger = this.f69666;
        if (zM51454 && ApplicationC20075.f65008.getBoolean("cc", true)) {
            int iM30444 = c12392.m30444();
            if (iM30444 == c12392.m30448()) {
                InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
                atomicInteger.incrementAndGet();
                m49028((CharSequence) interfaceC7785M30436, iM30444, -1, false);
                return;
            } else {
                atomicInteger.incrementAndGet();
                m49035();
                return;
            }
        }
        atomicInteger.incrementAndGet();
        m49035();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m49028(CharSequence charSequence, int i, int i2, boolean z) {
        C12392 c12392 = this.f69662;
        if (c12392 == null) {
            return;
        }
        if (z && !c12392.m30460()) {
            m49035();
            return;
        }
        C7744 c7744Mo26556 = charSequence instanceof InterfaceC20445 ? ((InterfaceC20445) charSequence).mo26556() : null;
        if (c7744Mo26556 != null) {
            charSequence = c7744Mo26556;
        }
        try {
            C15356 c15356Mo10278 = mo10278(i, charSequence);
            if (c7744Mo26556 != null) {
                c7744Mo26556.close();
            }
            if (c15356Mo10278 == null || c15356Mo10278.isEmpty() || (i2 >= 0 && i2 < c15356Mo10278.m36394())) {
                m49035();
            } else {
                if (((C2405.f7666.intValue() ^ C4925.m14303().uid) ^ (-1913575638)) != 0) {
                    return;
                }
                m49037();
                C18222 c18222 = this.f69664;
                c18222.m42455(c15356Mo10278);
                c18222.m42457(this.f69662, i);
            }
        } catch (Throwable th) {
            if (c7744Mo26556 != null) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m49035() {
        this.f69664.m42453();
    }
}
