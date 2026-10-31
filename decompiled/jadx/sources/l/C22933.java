package l;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.mt.plus.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.᩺ۤܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: I4HH */
/* JADX INFO: loaded from: classes.dex */
public class C22933 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f73896 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Handler f73897 = new HandlerC11645(Looper.getMainLooper());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Button f73898;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ProgressBar f73901;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final TextView f73902;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextView f73903;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73904;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f73907;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextView f73908;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ProgressBar f73911;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Runnable f73912;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AtomicReference f73910 = new AtomicReference();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public AtomicReference f73906 = new AtomicReference();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f73899 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public AtomicInteger f73900 = new AtomicInteger(-1);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final WeakReference f73905 = new WeakReference(this);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f73909 = f73896.incrementAndGet();

    public C22933(AbstractActivityC3346 abstractActivityC3346) {
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        viewM10216.setKeepScreenOn(true);
        this.f73902 = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f73908 = textView;
        this.f73901 = (ProgressBar) viewM10216.findViewById(R.id.MT_Protector);
        this.f73911 = (ProgressBar) viewM10216.findViewById(R.id.MT_Protector);
        this.f73903 = (TextView) viewM10216.findViewById(R.id.textView);
        this.f73898 = (Button) viewM10216.findViewById(R.id.MT_Protector);
        if (this instanceof C22022) {
            textView.setVisibility(0);
        }
        int i = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44428(false);
        this.f73907 = c19258.m44415();
    }

    /* JADX INFO: renamed from: ֫ */
    public C22933 mo49542(Runnable runnable) {
        this.f73904 = false;
        this.f73912 = runnable;
        this.f73907.m1437(new DialogInterfaceOnKeyListenerC12350(this));
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m51048() {
        this.f73907.m1437((DialogInterface.OnKeyListener) null);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m51044() {
        if (this.f73904) {
            return;
        }
        this.f73904 = true;
        Runnable runnable = this.f73912;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m51053() {
        return this.f73904;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m51042() {
        return this.f73907.m1442();
    }

    /* JADX INFO: renamed from: ۡ */
    public C22933 mo49547() {
        this.f73907.m1449();
        return this;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m51049(int i) {
        m51046(C4925.m14333(i));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51046(CharSequence charSequence) {
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f73910;
        if (zM27285) {
            atomicReference.set(null);
            this.f73902.setText(m51036(charSequence));
        } else {
            atomicReference.set(charSequence);
            m51052();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51038(int i) {
        m51040(C4925.m14333(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51040(CharSequence charSequence) {
        boolean zM27285 = C10975.m27285();
        AtomicReference atomicReference = this.f73906;
        if (!zM27285) {
            if (charSequence == null) {
                charSequence = "";
            }
            atomicReference.set(charSequence);
            m51052();
            return;
        }
        atomicReference.set(null);
        CharSequence charSequenceM51036 = m51036(charSequence);
        TextView textView = this.f73908;
        textView.setText(charSequenceM51036);
        int i = ((this instanceof C22022) || !TextUtils.isEmpty(charSequence)) ? 0 : 8;
        if (textView.getVisibility() != i) {
            textView.setVisibility(i);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51039(long j, long j2) {
        if (j2 == 0) {
            m51045(0);
        } else {
            m51045((int) ((j * 100) / j2));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m51045(int i) {
        ProgressBar progressBar = this.f73901;
        if (progressBar.getProgress() != i) {
            boolean zM27285 = C10975.m27285();
            AtomicInteger atomicInteger = this.f73899;
            if (zM27285) {
                atomicInteger.set(-1);
                progressBar.setProgress(i);
            } else {
                atomicInteger.set(i);
                m51052();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C22933 mo49541(View.OnClickListener onClickListener) {
        Button button = this.f73898;
        button.setVisibility(0);
        button.setText(R.string.MT_Protector);
        button.setOnClickListener(onClickListener);
        return this;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m51041(final boolean z) {
        if (C10975.m27285()) {
            this.f73901.setIndeterminate(z);
        } else {
            C4925.m14315(new Runnable() { // from class: l.۬ۤܿ
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39073.f73901.setIndeterminate(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m51051() {
        f73897.removeMessages(this.f73909);
        if (C10975.m27285()) {
            boolean zM51035 = m51035();
            DialogInterfaceC0206 dialogInterfaceC0206 = this.f73907;
            if (zM51035) {
                C11003.requireNonNull(dialogInterfaceC0206);
                C4925.m14316(new RunnableC20760(3, dialogInterfaceC0206), 50L);
                return;
            } else {
                dialogInterfaceC0206.dismiss();
                return;
            }
        }
        C4925.m14315(new RunnableC22286(1, this));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m51033(C22933 c22933) {
        DialogInterfaceC0206 dialogInterfaceC0206 = c22933.f73907;
        if (c22933.m51035()) {
            C11003.requireNonNull(dialogInterfaceC0206);
            C4925.m14316(new RunnableC20760(3, dialogInterfaceC0206), 50L);
        } else {
            dialogInterfaceC0206.dismiss();
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final TextView m51047() {
        return this.f73908;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 m51050() {
        return this.f73907;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC8693 m51043() {
        return new C10234(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC13077 m51037() {
        return new C6000(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m51052() {
        Handler handler = f73897;
        int i = this.f73909;
        if (handler.hasMessages(i)) {
            return;
        }
        handler.sendMessageDelayed(handler.obtainMessage(i, this.f73905), 15L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean m51035() {
        boolean z;
        CharSequence charSequence = (CharSequence) this.f73910.getAndSet(null);
        CharSequence charSequence2 = (CharSequence) this.f73906.getAndSet(null);
        int andSet = this.f73899.getAndSet(-1);
        int andSet2 = this.f73900.getAndSet(-1);
        int i = 0;
        if (charSequence != null) {
            this.f73902.setText(m51036(charSequence));
            z = true;
        } else {
            z = false;
        }
        if (charSequence2 != null) {
            CharSequence charSequenceM51036 = m51036(charSequence2);
            TextView textView = this.f73908;
            textView.setText(charSequenceM51036);
            if (!(this instanceof C22022) && TextUtils.isEmpty(charSequence2)) {
                i = 8;
            }
            if (textView.getVisibility() != i) {
                textView.setVisibility(i);
            }
            z = true;
        }
        if (andSet != -1) {
            this.f73901.setProgress(andSet);
            z = true;
        }
        if (andSet2 == -1) {
            return z;
        }
        this.f73911.setProgress(andSet2);
        return true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static CharSequence m51036(CharSequence charSequence) {
        return (charSequence == null || charSequence.length() <= 500) ? charSequence : charSequence.subSequence(0, 500);
    }
}
