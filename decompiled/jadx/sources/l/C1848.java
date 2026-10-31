package l;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֫۬ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 7AJG */
/* JADX INFO: loaded from: classes2.dex */
public final class C1848 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f6304 = new AtomicInteger();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Handler f6305 = new HandlerC7205(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final View f6306;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Button f6308;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final TextView f6309;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final TextView f6310;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final TextView f6311;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Runnable f6314;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final View f6315;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6316;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f6319;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f6320;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f6321;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f6322;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final TextView f6323;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final TextView f6324;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f6326;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final TextView f6329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public AtomicReference f6325 = new AtomicReference();

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public AtomicReference f6313 = new AtomicReference();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AtomicReference f6328 = new AtomicReference();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AtomicReference f6327 = new AtomicReference();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public AtomicReference f6307 = new AtomicReference();

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f6318 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final WeakReference f6312 = new WeakReference(this);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f6317 = f6304.incrementAndGet();

    public C1848(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        viewM10216.setKeepScreenOn(true);
        this.f6324 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f6326 = (TextView) viewM10216.findViewById(R.id.value1);
        this.f6321 = (TextView) viewM10216.findViewById(R.id.value2);
        this.f6311 = (TextView) viewM10216.findViewById(R.id.value3);
        this.f6310 = (TextView) viewM10216.findViewById(R.id.value4);
        this.f6323 = (TextView) viewM10216.findViewById(R.id.value5);
        this.f6309 = (TextView) viewM10216.findViewById(R.id.header4);
        this.f6322 = viewM10216.findViewById(R.id.MT_Protector);
        this.f6306 = viewM10216.findViewById(R.id.MT_Protector);
        this.f6319 = (ProgressBar) viewM10216.findViewById(R.id.MT_Protector);
        this.f6308 = (Button) viewM10216.findViewById(R.id.MT_Protector);
        this.f6329 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f6315 = viewM10216.findViewById(R.id.MT_Protector);
        C19258 c19258BuildDialog = abstractActivityC3346.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        c19258BuildDialog.m44428(false);
        this.f6320 = c19258BuildDialog.m44415();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6147(RunnableC1126 runnableC1126) {
        this.f6316 = false;
        this.f6314 = runnableC1126;
        this.f6320.m1437(new DialogInterfaceOnKeyListenerC13554(this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6143() {
        if (this.f6316) {
            return;
        }
        this.f6316 = true;
        Runnable runnable = this.f6314;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m6160() {
        return this.f6316;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6158(CharSequence charSequence) {
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f6325;
        if (zM27285) {
            atomicReference.set(null);
            this.f6324.setText(C22933.m51036(charSequence));
        } else {
            atomicReference.set(charSequence);
            m6157();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6152(CharSequence charSequence) {
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f6307;
        if (zM27285) {
            atomicReference.set(null);
            this.f6329.setText(C22933.m51036(charSequence));
        } else {
            atomicReference.set(charSequence);
            m6157();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6146(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f6322;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f6321.setText(C22933.m51036(charSequence));
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6154(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        View view = this.f6306;
        if (zIsEmpty) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            this.f6311.setText(C22933.m51036(charSequence));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6148(ViewOnClickListenerC19142 viewOnClickListenerC19142) {
        Button button = this.f6308;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(viewOnClickListenerC19142);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m6153() {
        this.f6320.m1449();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m6156(CharSequence charSequence) {
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f6313;
        if (zM27285) {
            atomicReference.set(null);
            this.f6326.setText(C22933.m51036(charSequence));
        } else {
            atomicReference.set(charSequence);
            m6157();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6150(final boolean z) {
        if (C10975.m27285()) {
            this.f6309.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
        } else {
            C4925.m14315(new Runnable() { // from class: l.᩺ۗܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f73428.f6309.setText(z ? R.string.MT_Protector : R.string.MT_Protector);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6139(C1848 c1848, boolean z) {
        View view = c1848.f6306;
        View view2 = c1848.f6322;
        View view3 = c1848.f6315;
        TextView textView = c1848.f6329;
        if (z) {
            textView.setVisibility(0);
            view3.setVisibility(8);
            view2.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        view3.setVisibility(0);
        view2.setVisibility(c1848.f6321.length() == 0 ? 8 : 0);
        view.setVisibility(c1848.f6311.length() == 0 ? 8 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6149(C20876 c20876) {
        String str;
        if (c20876.m47716() == 1) {
            str = c20876.m47707() + "/" + c20876.m47710();
        } else {
            str = c20876.m47711() + " (" + c20876.m47707() + "/" + c20876.m47710() + MotionUtils.EASING_TYPE_FORMAT_END;
        }
        m6159(str);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m6159(CharSequence charSequence) {
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f6327;
        if (zM27285) {
            atomicReference.set(null);
            this.f6310.setText(charSequence);
        } else {
            atomicReference.set(charSequence);
            m6157();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6145(long j) {
        String str = C22927.m51020(j) + "/s";
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f6328;
        if (zM27285) {
            atomicReference.set(null);
            this.f6323.setText(str);
        } else {
            atomicReference.set(str);
            m6157();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m6144(int i) {
        ProgressBar progressBar = this.f6319;
        if (progressBar.getProgress() != i) {
            boolean zM27285 = C10975.m27285();
            AtomicInteger atomicInteger = this.f6318;
            if (zM27285) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m6157();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m6151() {
        f6305.removeMessages(this.f6317);
        if (C10975.m27285()) {
            boolean zM6142 = m6142();
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f6320;
            if (zM6142) {
                C11003.requireNonNull(dialogInterfaceC0206);
                C4925.m14316(new RunnableC20760(3, dialogInterfaceC0206), 50L);
                return;
            } else {
                dialogInterfaceC0206.dismiss();
                return;
            }
        }
        C4925.m14315(new RunnableC9940(1, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m6137(C1848 c1848) {
        DialogInterfaceC0206 dialogInterfaceC0206 = c1848.f6320;
        if (c1848.m6142()) {
            C11003.requireNonNull(dialogInterfaceC0206);
            C4925.m14316(new RunnableC20760(3, dialogInterfaceC0206), 50L);
        } else {
            dialogInterfaceC0206.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m6155() {
        return this.f6320;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m6157() {
        Handler handler = f6305;
        int i = this.f6317;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f6312), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean m6142() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f6325.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f6313.getAndSet(null);
        CharSequence charSequence3 = (CharSequence) this.f6328.getAndSet(null);
        CharSequence charSequence4 = (CharSequence) this.f6327.getAndSet(null);
        CharSequence charSequence5 = (CharSequence) this.f6307.getAndSet(null);
        int andSet = this.f6318.getAndSet(-1);
        if (charSequence != null) {
            this.f6324.setText(C22933.m51036(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            this.f6326.setText(C22933.m51036(charSequence2));
            z = true;
        }
        if (charSequence3 != null) {
            this.f6323.setText(charSequence3);
            z = true;
        }
        if (charSequence4 != null) {
            this.f6310.setText(charSequence4);
            z = true;
        }
        if (charSequence5 != null) {
            this.f6329.setText(C22933.m51036(charSequence5));
            z = true;
        }
        if (andSet == -1) {
            return z;
        }
        this.f6319.setProgress(andSet);
        return true;
    }
}
