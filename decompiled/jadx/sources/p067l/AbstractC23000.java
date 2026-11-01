package p067l;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.᩸ܽܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7TM */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23000 {

    /* JADX INFO: renamed from: ֫ */
    public C14146 f72367;

    /* JADX INFO: renamed from: ۧ */
    public final Executor f72368;

    /* JADX INFO: renamed from: ܳ */
    public final C19687 f72369;

    /* JADX INFO: renamed from: ܽ */
    public int f72370;

    /* JADX INFO: renamed from: ܿ */
    public final AtomicInteger f72371;

    /* JADX INFO: renamed from: ᩳ */
    public int f72372;

    static {
        ApplicationC14266.m56479(EnumC19222.f57460);
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract C16963 mo12315(int i, CharSequence charSequence);

    /* JADX INFO: renamed from: ֫ */
    public void mo12316(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo12317(C14146 c14146) {
    }

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12318(C14146 c14146, CharSequence charSequence);

    /* JADX INFO: renamed from: ۧ */
    public final native void m51381(CharSequence charSequence, int i, int i2, int i3);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo12319(C14146 c14146, CharSequence charSequence) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.ۚܽܿ] */
    public AbstractC23000(Context context) {
        ExecutorService executorService = C4081.f8987;
        this.f72371 = new AtomicInteger();
        this.f72368 = executorService;
        C19687 c19687 = new C19687(context, 240);
        this.f72369 = c19687;
        c19687.m44715(new AdapterView.OnItemClickListener() { // from class: l.֡ܽܿ
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AbstractC23000.m51378(this.f4981, i);
            }
        });
        c19687.m44717((C7577) new AdapterView.OnItemLongClickListener() { // from class: l.ۚܽܿ
            @Override // android.widget.AdapterView.OnItemLongClickListener
            public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
                return AbstractC23000.m51379(this.f19858, i);
            }
        });
        m51386();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51378(AbstractC23000 abstractC23000, int i) {
        abstractC23000.mo12318(abstractC23000.f72367, abstractC23000.f72369.m44713(i));
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m51379(AbstractC23000 abstractC23000, int i) {
        return abstractC23000.mo12319(abstractC23000.f72367, abstractC23000.f72369.m44713(i));
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m51386() {
        int i = ApplicationC21448.f67650.getInt("comp_max_lines", 3);
        if (i == this.f72372) {
            return;
        }
        C19687 c19687 = this.f72369;
        int iM44719 = c19687.m44719();
        this.f72372 = i;
        int i2 = (iM44719 / 4) + (i * iM44719);
        this.f72370 = i2;
        c19687.m44720(i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m51380() {
        return this.f72370;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m51382(C14146 c14146) {
        this.f72367 = c14146;
        this.f72371.incrementAndGet();
        mo12317(c14146);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m51383() {
        C19687 c19687 = this.f72369;
        if (!c19687.m44723() || c19687.m44721() || !ApplicationC21448.f67650.getBoolean("comp_enter_accept", true)) {
            return false;
        }
        mo12318(this.f72367, c19687.m44713(0));
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51385(C14146 c14146) {
        if (this.f72367 == c14146) {
            this.f72367 = null;
            m51384();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m51387() {
        C14146 c14146 = this.f72367;
        if (c14146 == null) {
            return;
        }
        boolean zM53850 = C24414.m53850();
        AtomicInteger atomicInteger = this.f72371;
        if (zM53850 && ApplicationC21448.f67649.getBoolean("cc", true)) {
            int iM32508 = c14146.m32508();
            if (iM32508 == c14146.m32512()) {
                InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
                atomicInteger.incrementAndGet();
                m51377((CharSequence) interfaceC9768M32500, iM32508, -1, false);
                return;
            } else {
                atomicInteger.incrementAndGet();
                m51384();
                return;
            }
        }
        atomicInteger.incrementAndGet();
        m51384();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51377(CharSequence charSequence, int i, int i2, boolean z) {
        C14146 c14146 = this.f72367;
        if (c14146 == null) {
            return;
        }
        if (z && !c14146.m32524()) {
            m51384();
            return;
        }
        C9729 c9729Mo28589 = charSequence instanceof InterfaceC21800 ? ((InterfaceC21800) charSequence).mo28589() : null;
        if (c9729Mo28589 != null) {
            charSequence = c9729Mo28589;
        }
        try {
            C16963 c16963Mo12315 = mo12315(i, charSequence);
            if (c9729Mo28589 != null) {
                c9729Mo28589.close();
            }
            if (c16963Mo12315 == null || c16963Mo12315.isEmpty() || (i2 >= 0 && i2 < c16963Mo12315.m38552())) {
                m51384();
            } else {
                if (((C4654.f10457.intValue() ^ C7050.m16200().uid) ^ (-1913575638)) != 0) {
                    return;
                }
                m51386();
                C19687 c19687 = this.f72369;
                c19687.m44716(c16963Mo12315);
                c19687.m44718(this.f72367, i);
            }
        } catch (Throwable th) {
            if (c9729Mo28589 != null) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m51384() {
        this.f72369.m44714();
    }
}
