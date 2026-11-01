package p067l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C4125 {

    /* JADX INFO: renamed from: ۗ */
    public static final AtomicInteger f9083 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ */
    public static final Handler f9084 = new HandlerC9216(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֡ */
    public final View f9085;

    /* JADX INFO: renamed from: ֫ */
    public final Button f9087;

    /* JADX INFO: renamed from: ۖ */
    public final TextView f9088;

    /* JADX INFO: renamed from: ۘ */
    public final TextView f9089;

    /* JADX INFO: renamed from: ۚ */
    public final TextView f9090;

    /* JADX INFO: renamed from: ۡ */
    public Runnable f9093;

    /* JADX INFO: renamed from: ۢ */
    public final View f9094;

    /* JADX INFO: renamed from: ۧ */
    public boolean f9095;

    /* JADX INFO: renamed from: ܺ */
    public final ProgressBar f9098;

    /* JADX INFO: renamed from: ܽ */
    public final DialogInterfaceC2564 f9099;

    /* JADX INFO: renamed from: ܿ */
    public final TextView f9100;

    /* JADX INFO: renamed from: ᩳ */
    public final View f9101;

    /* JADX INFO: renamed from: ᩴ */
    public final TextView f9102;

    /* JADX INFO: renamed from: ᩵ */
    public final TextView f9103;

    /* JADX INFO: renamed from: ᩷ */
    public final TextView f9105;

    /* JADX INFO: renamed from: ᩻ */
    public final TextView f9108;

    /* JADX INFO: renamed from: ᩶ */
    public AtomicReference f9104 = new AtomicReference();

    /* JADX INFO: renamed from: ۠ */
    public AtomicReference f9092 = new AtomicReference();

    /* JADX INFO: renamed from: ᩹ */
    public AtomicReference f9107 = new AtomicReference();

    /* JADX INFO: renamed from: ᩸ */
    public AtomicReference f9106 = new AtomicReference();

    /* JADX INFO: renamed from: ֨ */
    public AtomicReference f9086 = new AtomicReference();

    /* JADX INFO: renamed from: ܶ */
    public AtomicInteger f9097 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ۜ */
    public final WeakReference f9091 = new WeakReference(this);

    /* JADX INFO: renamed from: ܳ */
    public final int f9096 = f9083.incrementAndGet();

    public C4125(AbstractActivityC5549 abstractActivityC5549) {
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.setKeepScreenOn(true);
        this.f9103 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f9105 = (TextView) viewM12252.findViewById(R.id.value1);
        this.f9100 = (TextView) viewM12252.findViewById(R.id.value2);
        this.f9090 = (TextView) viewM12252.findViewById(R.id.value3);
        this.f9089 = (TextView) viewM12252.findViewById(R.id.value4);
        this.f9102 = (TextView) viewM12252.findViewById(R.id.value5);
        this.f9088 = (TextView) viewM12252.findViewById(R.id.header4);
        this.f9101 = viewM12252.findViewById(R.id.MT_Protector);
        this.f9085 = viewM12252.findViewById(R.id.MT_Protector);
        this.f9098 = (ProgressBar) viewM12252.findViewById(R.id.MT_Protector);
        this.f9087 = (Button) viewM12252.findViewById(R.id.MT_Protector);
        this.f9108 = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f9094 = viewM12252.findViewById(R.id.MT_Protector);
        C20671 c20671BuildDialog = abstractActivityC5549.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        c20671BuildDialog.m46722(false);
        this.f9099 = c20671BuildDialog.m46709();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8345(RunnableC3439 runnableC3439) {
        this.f9095 = false;
        this.f9093 = runnableC3439;
        this.f9099.m3850(new DialogInterfaceOnKeyListenerC15250(this));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8341() {
        if (this.f9095) {
            return;
        }
        this.f9095 = true;
        Runnable runnable = this.f9093;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m8358() {
        return this.f9095;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m8356(CharSequence charSequence) {
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f9104;
        if (zM29347) {
            atomicReference.set(null);
            this.f9103.setText(C24164.m53427(charSequence));
        } else {
            atomicReference.set(charSequence);
            m8355();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8350(CharSequence charSequence) {
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f9086;
        if (zM29347) {
            atomicReference.set(null);
            this.f9108.setText(C24164.m53427(charSequence));
        } else {
            atomicReference.set(charSequence);
            m8355();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8344(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f9101;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f9100.setText(C24164.m53427(charSequence));
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m8352(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f9085;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f9090.setText(C24164.m53427(charSequence));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8346(ViewOnClickListenerC20561 viewOnClickListenerC20561) {
        Button button = this.f9087;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(viewOnClickListenerC20561);
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m8351() {
        this.f9099.m3862();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m8354(CharSequence charSequence) {
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f9092;
        if (zM29347) {
            atomicReference.set(null);
            this.f9105.setText(C24164.m53427(charSequence));
        } else {
            atomicReference.set(charSequence);
            m8355();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8348(final boolean z) {
        if (C12799.m29347()) {
            this.f9088.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        } else {
            C7050.m16212(new Runnable() { // from class: l.᩺ۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76151.f9088.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static /* synthetic */ void m8337(C4125 c4125, boolean z) {
        View view = c4125.f9085;
        View view2 = c4125.f9101;
        View view3 = c4125.f9094;
        TextView textView = c4125.f9108;
        if (z) {
            textView.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        view3.setVisibility(0);
        view2.setVisibility(c4125.f9100.length() == 0 ? 8 : 0);
        view.setVisibility(c4125.f9090.length() == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8347(C22209 c22209) {
        String str;
        if (c22209.m50046() == 1) {
            str = c22209.m50037() + "/" + c22209.m50040();
        } else {
            str = c22209.m50041() + " (" + c22209.m50037() + "/" + c22209.m50040() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        m8357(str);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m8357(CharSequence charSequence) {
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f9106;
        if (zM29347) {
            atomicReference.set(null);
            this.f9089.setText(charSequence);
        } else {
            atomicReference.set(charSequence);
            m8355();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8343(long j) {
        String str = C24158.m53411(j) + "/s";
        boolean zM29347 = C12799.m29347();
        AtomicReference atomicReference = this.f9107;
        if (zM29347) {
            atomicReference.set(null);
            this.f9102.setText(str);
        } else {
            atomicReference.set(str);
            m8355();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m8342(int i) {
        ProgressBar progressBar = this.f9098;
        if (progressBar.getProgress() != i) {
            boolean zM29347 = C12799.m29347();
            AtomicInteger atomicInteger = this.f9097;
            if (zM29347) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m8355();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m8349() {
        f9084.removeMessages(this.f9096);
        if (C12799.m29347()) {
            boolean zM8340 = m8340();
            DialogInterfaceC2564 dialogInterfaceC2564 = this.f9099;
            if (zM8340) {
                C12826.requireNonNull(dialogInterfaceC2564);
                C7050.m16213(new RunnableC22099(3, dialogInterfaceC2564), 50L);
                return;
            } else {
                dialogInterfaceC2564.dismiss();
                return;
            }
        }
        C7050.m16212(new RunnableC11815(1, this));
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m8335(C4125 c4125) {
        DialogInterfaceC2564 dialogInterfaceC2564 = c4125.f9099;
        if (c4125.m8340()) {
            C12826.requireNonNull(dialogInterfaceC2564);
            C7050.m16213(new RunnableC22099(3, dialogInterfaceC2564), 50L);
        } else {
            dialogInterfaceC2564.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final DialogInterfaceC2564 m8353() {
        return this.f9099;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m8355() {
        Handler handler = f9084;
        int i = this.f9096;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f9091), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻ */
    public boolean m8340() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f9104.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f9092.getAndSet(null);
        CharSequence charSequence3 = (CharSequence) this.f9107.getAndSet(null);
        CharSequence charSequence4 = (CharSequence) this.f9106.getAndSet(null);
        CharSequence charSequence5 = (CharSequence) this.f9086.getAndSet(null);
        int andSet = this.f9097.getAndSet(-1);
        if (charSequence != null) {
            this.f9103.setText(C24164.m53427(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            this.f9105.setText(C24164.m53427(charSequence2));
            z = true;
        }
        if (charSequence3 != null) {
            this.f9102.setText(charSequence3);
            z = true;
        }
        if (charSequence4 != null) {
            this.f9089.setText(charSequence4);
            z = true;
        }
        if (charSequence5 != null) {
            this.f9108.setText(C24164.m53427(charSequence5));
            z = true;
        }
        if (andSet == -1) {
            return z;
        }
        this.f9098.setProgress(andSet);
        return true;
    }
}
