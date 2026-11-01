package p067l;

import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩵֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J57U */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC20574 implements View.OnClickListener {

    /* JADX INFO: renamed from: ֫֫ */
    public boolean f63588;

    /* JADX INFO: renamed from: ۗ */
    public boolean f63589;

    /* JADX INFO: renamed from: ۙ */
    public ViewOnClickListenerC7497 f63590;

    /* JADX INFO: renamed from: ۛ */
    public View f63591;

    /* JADX INFO: renamed from: ۟ */
    public View f63592;

    /* JADX INFO: renamed from: ۤ */
    public C11186 f63593;

    /* JADX INFO: renamed from: ۨ */
    public boolean f63594;

    /* JADX INFO: renamed from: ۫ */
    public boolean f63595;

    /* JADX INFO: renamed from: ۬ */
    public C21915 f63596;

    /* JADX INFO: renamed from: ܰ */
    public C11186 f63597;

    /* JADX INFO: renamed from: ᩶ */
    public View f63598;

    /* JADX INFO: renamed from: ᩸ */
    public volatile C19903 f63599;

    /* JADX INFO: renamed from: ᩹ */
    public View f63600;

    /* JADX INFO: renamed from: ᩺ */
    public View f63601;

    /* JADX INFO: renamed from: ֫ */
    public final void m46528(boolean z) {
        View view = this.f63601;
        this.f63595 = z;
        if (z) {
            if (this.f63594) {
                this.f63594 = false;
                this.f63591.setVisibility(8);
                view.setRotationX(0.0f);
            }
            view.setVisibility(8);
            return;
        }
        view.setVisibility(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static ViewOnClickListenerC20574 m46516(ViewOnClickListenerC7497 viewOnClickListenerC7497) {
        ViewOnClickListenerC20574 viewOnClickListenerC20574 = new ViewOnClickListenerC20574();
        viewOnClickListenerC20574.f63588 = false;
        viewOnClickListenerC20574.f63594 = false;
        viewOnClickListenerC20574.f63589 = true;
        viewOnClickListenerC20574.f63590 = viewOnClickListenerC7497;
        viewOnClickListenerC20574.f63592 = viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        viewOnClickListenerC20574.f63591 = viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        viewOnClickListenerC7497.m12277(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC20574);
        viewOnClickListenerC7497.m12277(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC20574);
        View viewM12277 = viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        viewOnClickListenerC20574.f63600 = viewM12277;
        viewM12277.setOnClickListener(viewOnClickListenerC20574);
        View viewM12278 = viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        viewOnClickListenerC20574.f63598 = viewM12278;
        viewM12278.setOnClickListener(viewOnClickListenerC20574);
        viewOnClickListenerC7497.m12277(R.id.MT_Protector).setOnClickListener(viewOnClickListenerC20574);
        View viewM12279 = viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        viewOnClickListenerC20574.f63601 = viewM12279;
        viewM12279.setOnClickListener(viewOnClickListenerC20574);
        viewOnClickListenerC20574.f63601 = ((ViewGroup) viewM12279).getChildAt(1);
        viewOnClickListenerC20574.f63597 = new C11186(true, (C7179) viewOnClickListenerC7497.m12277(R.id.MT_Protector), (TextView) viewOnClickListenerC7497.m12277(R.id.MT_Protector), (Spinner) viewOnClickListenerC7497.m12277(R.id.MT_Protector), (CheckBox) viewOnClickListenerC7497.m12277(R.id.MT_Protector));
        viewOnClickListenerC20574.f63593 = new C11186(false, (C7179) viewOnClickListenerC7497.m12277(R.id.MT_Protector), (TextView) viewOnClickListenerC7497.m12277(R.id.MT_Protector), (Spinner) viewOnClickListenerC7497.m12277(R.id.MT_Protector), (CheckBox) viewOnClickListenerC7497.m12277(R.id.MT_Protector));
        return viewOnClickListenerC20574;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m46532() {
        return this.f63599 != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46527() {
        C19903 c19903 = this.f63599;
        if (c19903 != null) {
            c19903.cancel();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46529() {
        View view = this.f63598;
        View view2 = this.f63600;
        C11186 c11186 = this.f63597;
        if (c11186.f31058 || c11186.f31053) {
            m46530();
            return;
        }
        if (!this.f63594 || this.f63593.f31053) {
            view2.setEnabled(false);
            view.setEnabled(false);
        } else {
            view2.setEnabled(true);
            view.setEnabled(true);
        }
        if (this.f63588) {
            return;
        }
        this.f63590.m17309();
        this.f63592.setVisibility(0);
        this.f63588 = true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46530() {
        if (this.f63588) {
            this.f63592.setVisibility(8);
            this.f63588 = false;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m46531() {
        return this.f63588;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.f63601;
        View view3 = this.f63591;
        C11186 c11186 = this.f63593;
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f63590;
        if (m46532()) {
            return;
        }
        int id = view.getId();
        if ((id == R.id.MT_Protector || id == R.id.MT_Protector) && viewOnClickListenerC7497.f19629.m20440()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        if (id == R.id.MT_Protector) {
            m46526();
            return;
        }
        if (id == R.id.MT_Protector) {
            m46525();
            return;
        }
        if (id == R.id.MT_Protector) {
            C8838 c8838 = viewOnClickListenerC7497.f19629;
            C21915 c21915 = this.f63596;
            if (c21915 != null) {
                C12862 c12862 = c8838.f23986;
                if (c21915.m49453(c12862.m29476(), c12862.m29480(), c12862.m29466(), c12862.m29468())) {
                    c11186.m25810();
                    if (c8838.m20434(c11186.f31060)) {
                        if (this.f63589) {
                            m46525();
                            return;
                        } else {
                            m46526();
                            return;
                        }
                    }
                    return;
                }
            }
            if (this.f63589) {
                m46525();
                return;
            } else {
                m46526();
                return;
            }
        }
        if (id != R.id.MT_Protector) {
            if (id == R.id.MT_Protector) {
                m46530();
                return;
            }
            if (id != R.id.MT_Protector || this.f63595) {
                return;
            }
            if (this.f63594) {
                this.f63594 = false;
                view3.setVisibility(8);
                view2.setRotationX(0.0f);
                return;
            } else {
                this.f63594 = true;
                view3.setVisibility(0);
                view2.setRotationX(180.0f);
                return;
            }
        }
        C11186 c11187 = this.f63597;
        c11187.m25810();
        c11186.m25810();
        C8838 c8839 = viewOnClickListenerC7497.f19629;
        C19644 c19644M29476 = c8839.f23986.m29476();
        byte[] bArr = c11187.f31060;
        byte[] bArr2 = c11186.f31060;
        if (bArr == null || bArr.length == 0) {
            this.f63596 = null;
            return;
        }
        final C19903 c19903 = new C19903();
        final C4480 c4480 = new C4480(this, c8839, c19644M29476);
        C18225 c18225M20421 = c8839.m20421(new Runnable() { // from class: l.᩺۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                c19903.cancel();
            }
        }, new Runnable() { // from class: l.ܰ۟ܿ
            @Override // java.lang.Runnable
            public final void run() {
                c4480.m9484();
            }
        });
        if (c18225M20421 == null) {
            C22682.m50793(R.string.MT_Protector);
        } else {
            new C8503(this, c19903, c19644M29476, c18225M20421, c4480, bArr, bArr2, c8839).m22250();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m46526() {
        this.f63589 = false;
        C11186 c11186 = this.f63597;
        c11186.m25810();
        C8838 c8838 = this.f63590.f19629;
        C12862 c12862 = c8838.f23986;
        C19644 c19644M29476 = c12862.m29476();
        byte[] bArr = c11186.f31060;
        if (bArr == null || bArr.length == 0) {
            this.f63596 = null;
            return;
        }
        this.f63596 = null;
        new C12527(this, new C19903(), c19644M29476, bArr, !c12862.m29468() ? c12862.m29480() : ((long) c12862.m29480()) - 1, c8838).m22250();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m46525() {
        long jM29466;
        this.f63589 = true;
        C11186 c11186 = this.f63597;
        c11186.m25810();
        C8838 c8838 = this.f63590.f19629;
        C12862 c12862 = c8838.f23986;
        C19644 c19644M29476 = c12862.m29476();
        byte[] bArr = c11186.f31060;
        if (bArr == null || bArr.length == 0) {
            this.f63596 = null;
            return;
        }
        this.f63596 = null;
        if (!c12862.m29468()) {
            jM29466 = c12862.m29480();
        } else {
            jM29466 = ((long) c12862.m29466()) + 1;
        }
        new C18561(this, new C19903(), c19644M29476, bArr, m46513(jM29466, false), c8838).m22250();
    }

    /* JADX INFO: renamed from: ֫ */
    public static C10515 m46515(C19644 c19644, C17631 c17631, byte[] bArr, byte[] bArr2, C24596 c24596) {
        C12826.requireNonNull(c19644, "document");
        C12826.requireNonNull(bArr, "pattern");
        if (bArr.length == 0) {
            return new C10515(0L, 0, false);
        }
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(c24596);
        C12939 c12939M44640 = c19644.m44640(c17631);
        try {
            if (bArr.length > c17631.length()) {
                C10515 c10515 = new C10515(0L, 0, false);
                c12939M44640.close();
                return c10515;
            }
            C17219 c17219 = new C17219(c12939M44640.m29658(bArr.length, bArr3), c17631.length(), bArr, bArr3, interfaceC18588M40721);
            try {
                c17631.m40154(c17219, c17631.length());
                if (interfaceC18588M40721.mo3924()) {
                    C10515 c10515M24250 = C10515.m24250();
                    c12939M44640.close();
                    return c10515M24250;
                }
                try {
                    C10515 c10515Finish = c17219.finish();
                    if (interfaceC18588M40721.mo3924()) {
                        C10515 c10515M24251 = C10515.m24250();
                        c12939M44640.close();
                        return c10515M24251;
                    }
                    if (c10515Finish.f29089 != 0) {
                        int i = c10515Finish.f29090;
                        c12939M44640.m29663(i, i);
                        if (!c12939M44640.m29662(interfaceC18588M40721)) {
                            C10515 c10515M24252 = C10515.m24250();
                            c12939M44640.close();
                            return c10515M24252;
                        }
                    }
                    c12939M44640.close();
                    return c10515Finish;
                } catch (C25008 unused) {
                    C10515 c10515M24253 = C10515.m24250();
                    c12939M44640.close();
                    return c10515M24253;
                }
            } catch (C5821 unused2) {
                C10515 c10515M24254 = C10515.m24250();
                c12939M44640.close();
                return c10515M24254;
            }
        } catch (Throwable th) {
            try {
                c12939M44640.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46519(ViewOnClickListenerC20574 viewOnClickListenerC20574, C19903 c19903) {
        if (viewOnClickListenerC20574.f63599 != null) {
            throw new IllegalStateException("Another search task is active");
        }
        viewOnClickListenerC20574.f63599 = c19903;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m46524(ViewOnClickListenerC20574 viewOnClickListenerC20574, C19903 c19903) {
        if (viewOnClickListenerC20574.f63599 == c19903) {
            viewOnClickListenerC20574.f63599 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public boolean m46521(C19644 c19644) {
        ViewOnClickListenerC7497 viewOnClickListenerC7497 = this.f63590;
        return (viewOnClickListenerC7497.isFinishing() || viewOnClickListenerC7497.isDestroyed() || viewOnClickListenerC7497.f19629.f23986.m29476() != c19644) ? false : true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46523(ViewOnClickListenerC20574 viewOnClickListenerC20574, C19644 c19644, C17631 c17631) {
        return c17631 != null && viewOnClickListenerC20574.m46521(c19644) && c19644.m44646() == c17631.m40153();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46518(ViewOnClickListenerC20574 viewOnClickListenerC20574, C8838 c8838, C19644 c19644, Exception exc) {
        if (viewOnClickListenerC20574.m46521(c19644)) {
            if (exc instanceof C9174) {
                C22682.m50793(R.string.MT_Protector);
            } else if (!(exc instanceof IOException)) {
                viewOnClickListenerC20574.f63590.m12259(exc, (DialogInterface.OnDismissListener) null);
            } else {
                c8838.m20428((IOException) exc);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46517(C18302 c18302) {
        if (c18302 != null) {
            c18302.close();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m46513(long j, boolean z) {
        if (j < (z ? -1L : 0L) || j > 2147483647L) {
            throw new IndexOutOfBoundsException(C17588.m40051(j, "Search offset="));
        }
        return (int) j;
    }
}
