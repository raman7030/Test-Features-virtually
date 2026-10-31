package l;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ܺ᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: L1RG */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnClickListenerC16225 implements View.OnClickListener {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f49953;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f49954;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0640 f49955;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f49956;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f49957;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f49958;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f49959;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewOnClickListenerC16225(AbstractActivityC3346 abstractActivityC3346, InterfaceC9171 interfaceC9171) {
        this.f49958 = abstractActivityC3346;
        this.f49956 = (AbstractActivityC3346) interfaceC9171;
        this.f49955 = (C0640) abstractActivityC3346.m10241(R.id.MT_Protector);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        abstractActivityC3346.m10241(R.id.MT_Protector).setOnClickListener(this);
        View viewM10241 = abstractActivityC3346.m10241(R.id.MT_Protector);
        viewM10241.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(viewM10241);
        View viewM10242 = abstractActivityC3346.m10241(R.id.MT_Protector);
        viewM10242.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(viewM10242);
        View viewM10243 = abstractActivityC3346.m10241(R.id.MT_Protector);
        viewM10243.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(viewM10243);
        View viewM10244 = abstractActivityC3346.m10241(R.id.MT_Protector);
        viewM10244.setOnClickListener(this);
        ViewOnTouchListenerC9877.m24971(viewM10244);
        this.f49957 = ((TextView) viewM10244).getTextColors().getDefaultColor();
        this.f49954 = C21238.m48210(abstractActivityC3346.getTheme(), R.attr.MT_Protector);
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
            int i2 = this.f49957;
            int i3 = this.f49954;
            if (id == R.id.MT_Protector) {
                boolean z = this.f49953;
                this.f49953 = !z;
                if (!z) {
                    ApplicationC20075.m46265(false);
                }
                TextView textView = (TextView) view;
                if (this.f49953) {
                    i2 = i3;
                }
                textView.setTextColor(i2);
            } else if (id == R.id.MT_Protector) {
                boolean z2 = this.f49959;
                this.f49959 = !z2;
                if (!z2) {
                    ApplicationC20075.m46265(false);
                }
                TextView textView2 = (TextView) view;
                if (this.f49959) {
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
                ?? r3 = this.f49956;
                if (id == R.id.MT_Protector) {
                    r3.mo20746(view);
                    return;
                } else if (id == R.id.MT_Protector) {
                    r3.mo20747();
                    return;
                }
            }
            i = 0;
        }
        if (i != 0) {
            KeyEvent keyEvent = new KeyEvent(0, i);
            C0640 c0640 = this.f49955;
            c0640.dispatchKeyEvent(keyEvent);
            c0640.dispatchKeyEvent(new KeyEvent(1, i));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m38185() {
        if (!this.f49953) {
            return false;
        }
        this.f49953 = false;
        ((TextView) this.f49958.m10241(R.id.MT_Protector)).setTextColor(this.f49957);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m38184() {
        if (!this.f49959) {
            return false;
        }
        this.f49959 = false;
        ((TextView) this.f49958.m10241(R.id.MT_Protector)).setTextColor(this.f49957);
        return true;
    }
}
