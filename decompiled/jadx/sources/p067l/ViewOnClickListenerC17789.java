package p067l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.p000mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܺ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC17789 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ */
    public boolean f53123;

    /* JADX INFO: renamed from: ۙ */
    public int f53124;

    /* JADX INFO: renamed from: ۫ */
    public C2977 f53125;

    /* JADX INFO: renamed from: ۬ */
    public AbstractActivityC5549 f53126;

    /* JADX INFO: renamed from: ᩶ */
    public int f53127;

    /* JADX INFO: renamed from: ᩸ */
    public AbstractActivityC5549 f53128;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f53129;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC17789(AbstractActivityC5549 abstractActivityC5549, InterfaceC11085 interfaceC11085) {
        this.f53128 = abstractActivityC5549;
        this.f53126 = (AbstractActivityC5549) interfaceC11085;
        this.f53125 = (C2977) abstractActivityC5549.m12277(R.id.MT_Protector);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC5549.m12277(R.id.MT_Protector).setOnClickListener(this);
        View viewM12277 = abstractActivityC5549.m12277(R.id.MT_Protector);
        viewM12277.setOnClickListener(this);
        ViewOnTouchListenerC11756.m26986(viewM12277);
        View viewM12278 = abstractActivityC5549.m12277(R.id.MT_Protector);
        viewM12278.setOnClickListener(this);
        ViewOnTouchListenerC11756.m26986(viewM12278);
        View viewM12279 = abstractActivityC5549.m12277(R.id.MT_Protector);
        viewM12279.setOnClickListener(this);
        ViewOnTouchListenerC11756.m26986(viewM12279);
        View viewM122710 = abstractActivityC5549.m12277(R.id.MT_Protector);
        viewM122710.setOnClickListener(this);
        ViewOnTouchListenerC11756.m26986(viewM122710);
        this.f53127 = ((TextView) viewM122710).getTextColors().getDefaultColor();
        this.f53124 = C22553.m50541(abstractActivityC5549.getTheme(), R.attr.MT_Protector);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ۗܺ᩷, l.ۡ᩹ۢ] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.MT_Protector) {
            i = UMErrorCode.E_UM_BE_CREATE_FAILED;
        } else if (id == R.id.MT_Protector) {
            i = 61;
        } else {
            int i2 = this.f53127;
            int i3 = this.f53124;
            if (id == R.id.MT_Protector) {
                boolean z = this.f53123;
                this.f53123 = !z;
                if (!z) {
                    ApplicationC21448.m48581(false);
                }
                TextView textView = (TextView) view;
                if (this.f53123) {
                    i2 = i3;
                }
                textView.setTextColor(i2);
            } else if (id == R.id.MT_Protector) {
                boolean z2 = this.f53129;
                this.f53129 = !z2;
                if (!z2) {
                    ApplicationC21448.m48581(false);
                }
                TextView textView2 = (TextView) view;
                if (this.f53129) {
                    i2 = i3;
                }
                textView2.setTextColor(i2);
            } else if (id == R.id.MT_Protector) {
                i = 19;
            } else if (id == R.id.MT_Protector) {
                i = 20;
            } else if (id == R.id.MT_Protector) {
                i = 21;
            } else if (id == R.id.MT_Protector) {
                i = 22;
            } else if (id == R.id.MT_Protector) {
                i = 122;
            } else if (id == R.id.MT_Protector) {
                i = 123;
            } else if (id == R.id.MT_Protector) {
                i = 92;
            } else if (id == R.id.MT_Protector) {
                i = 93;
            } else {
                ?? r3 = this.f53126;
                if (id == R.id.MT_Protector) {
                    r3.mo22726(view);
                    return;
                } else if (id == R.id.MT_Protector) {
                    r3.mo22727();
                    return;
                }
            }
            i = 0;
        }
        if (i != 0) {
            KeyEvent keyEvent = new KeyEvent(0, i);
            C2977 c2977 = this.f53125;
            c2977.dispatchKeyEvent(keyEvent);
            c2977.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m40397() {
        if (!this.f53123) {
            return false;
        }
        this.f53123 = false;
        ((TextView) this.f53128.m12277(R.id.MT_Protector)).setTextColor(this.f53127);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40396() {
        if (!this.f53129) {
            return false;
        }
        this.f53129 = false;
        ((TextView) this.f53128.m12277(R.id.MT_Protector)).setTextColor(this.f53127);
        return true;
    }
}
