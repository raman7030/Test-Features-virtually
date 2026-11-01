package p067l;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩺ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes.dex */
public class C24164 {

    /* JADX INFO: renamed from: ֡ */
    public static final AtomicInteger f76625 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩵ */
    public static final Handler f76626 = new HandlerC13436(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֫ */
    public final Button f76627;

    /* JADX INFO: renamed from: ۜ */
    public final ProgressBar f76630;

    /* JADX INFO: renamed from: ۡ */
    public final TextView f76631;

    /* JADX INFO: renamed from: ۢ */
    public final TextView f76632;

    /* JADX INFO: renamed from: ۧ */
    public boolean f76633;

    /* JADX INFO: renamed from: ܽ */
    public final DialogInterfaceC2564 f76636;

    /* JADX INFO: renamed from: ܿ */
    public final TextView f76637;

    /* JADX INFO: renamed from: ᩷ */
    public final ProgressBar f76640;

    /* JADX INFO: renamed from: ᩻ */
    public Runnable f76641;

    /* JADX INFO: renamed from: ᩴ */
    public AtomicReference f76639 = new AtomicReference();

    /* JADX INFO: renamed from: ܺ */
    public AtomicReference f76635 = new AtomicReference();

    /* JADX INFO: renamed from: ۖ */
    public AtomicInteger f76628 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ۘ */
    public AtomicInteger f76629 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ܳ */
    public final WeakReference f76634 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩳ */
    public final int f76638 = f76625.incrementAndGet();

    public C24164(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.setKeepScreenOn(true);
        this.f76631 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f76637 = textView;
        this.f76630 = (ProgressBar) viewM12252.findViewById(R.id.MT_Protector);
        this.f76640 = (ProgressBar) viewM12252.findViewById(R.id.MT_Protector);
        this.f76632 = (TextView) viewM12252.findViewById(R.id.textView);
        this.f76627 = (Button) viewM12252.findViewById(R.id.MT_Protector);
        if (this instanceof C23298) {
            textView.setVisibility(0);
        }
        int i = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46722(false);
        this.f76636 = c20671.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public C24164 mo51878(Runnable runnable) {
        this.f76633 = false;
        this.f76641 = runnable;
        this.f76636.m3850(new DialogInterfaceOnKeyListenerC14106(this));
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m53439() {
        this.f76636.m3850((DialogInterface.OnKeyListener) null);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m53435() {
        if (this.f76633) {
            return;
        }
        this.f76633 = true;
        Runnable runnable = this.f76641;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m53444() {
        return this.f76633;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m53433() {
        return this.f76636.m3855();
    }

    /* JADX INFO: renamed from: ۡ */
    public C24164 mo51883() {
        this.f76636.m3862();
        return this;
    }

    /* JADX INFO: renamed from: ܽ */
    public void m53440(int i) {
        m53437(C7050.m16230(i));
    }

    /* JADX INFO: renamed from: ۧ */
    public void m53437(CharSequence charSequence) {
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f76639;
        if (zM29347) {
            atomicReference.set(null);
            this.f76631.setText(m53427(charSequence));
        } else {
            atomicReference.set(charSequence);
            m53443();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void m53429(int i) {
        m53431(C7050.m16230(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public void m53431(CharSequence charSequence) {
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f76635;
        if (!zM29347) {
            if (charSequence == null) {
                charSequence = "";
            }
            atomicReference.set(charSequence);
            m53443();
            return;
        }
        atomicReference.set(null);
        CharSequence charSequenceM53427 = m53427(charSequence);
        TextView textView = this.f76637;
        textView.setText(charSequenceM53427);
        int i = ((this instanceof C23298) || !TextUtils.isEmpty(charSequence)) ? 0 : 8;
        if (textView.getVisibility() != i) {
            textView.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void m53430(long j, long j2) {
        if (j2 == 0) {
            m53436(0);
        } else {
            m53436((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public void m53436(int i) {
        ProgressBar progressBar = this.f76630;
        if (progressBar.getProgress() != i) {
            boolean zM29347 = C12799.m29347();
            AtomicInteger atomicInteger = this.f76628;
            if (zM29347) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m53443();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C24164 mo51877(View.OnClickListener onClickListener) {
        Button button = this.f76627;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(onClickListener);
        return this;
    }

    /* JADX INFO: renamed from: ֫ */
    public void m53432(final boolean z) {
        if (C12799.m29347()) {
            this.f76630.setIndeterminate(z);
        } else {
            C7050.m16212(new Runnable() { // from class: l.۬ۤܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42117.f76630.setIndeterminate(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m53442() {
        f76626.removeMessages(this.f76638);
        if (C12799.m29347()) {
            boolean zM53426 = m53426();
            DialogInterfaceC2564 dialogInterfaceC2564 = this.f76636;
            if (zM53426) {
                C12826.requireNonNull(dialogInterfaceC2564);
                C7050.m16213(new RunnableC22099(3, dialogInterfaceC2564), 50L);
                return;
            } else {
                dialogInterfaceC2564.dismiss();
                return;
            }
        }
        C7050.m16212(new RunnableC23549(1, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m53424(C24164 c24164) {
        DialogInterfaceC2564 dialogInterfaceC2564 = c24164.f76636;
        if (c24164.m53426()) {
            C12826.requireNonNull(dialogInterfaceC2564);
            C7050.m16213(new RunnableC22099(3, dialogInterfaceC2564), 50L);
        } else {
            dialogInterfaceC2564.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final TextView m53438() {
        return this.f76637;
    }

    /* JADX INFO: renamed from: ܿ */
    public final DialogInterfaceC2564 m53441() {
        return this.f76636;
    }

    /* JADX INFO: renamed from: ۢ */
    public final InterfaceC10630 m53434() {
        return new C12095(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC14797 m53428() {
        return new C8071(this);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m53443() {
        Handler handler = f76626;
        int i = this.f76638;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f76634), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ */
    public boolean m53426() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f76639.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f76635.getAndSet(null);
        int andSet = this.f76628.getAndSet(-1);
        int andSet2 = this.f76629.getAndSet(-1);
        int i = 0;
        if (charSequence != null) {
            this.f76631.setText(m53427(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            CharSequence charSequenceM53427 = m53427(charSequence2);
            TextView textView = this.f76637;
            textView.setText(charSequenceM53427);
            if (!(this instanceof C23298) && TextUtils.isEmpty(charSequence2)) {
                i = 8;
            }
            if (textView.getVisibility() != i) {
                textView.setVisibility(i);
            }
            z = true;
        }
        if (andSet != -1) {
            this.f76630.setProgress(andSet);
            z = true;
        }
        if (andSet2 == -1) {
            return z;
        }
        this.f76640.setProgress(andSet2);
        return true;
    }

    /* JADX INFO: renamed from: ܽ */
    public static CharSequence m53427(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() <= 500) ? charSequence : charSequence.subSequence(0, 500);
    }
}
