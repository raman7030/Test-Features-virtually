package p067l;

import android.text.style.BackgroundColorSpan;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩶ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes4.dex */
public final class C21579 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֫֫ */
    public final ViewOnLongClickListenerC22920 f68037;

    /* JADX INFO: renamed from: ۗ */
    public final ViewOnLongClickListenerC22920 f68038;

    /* JADX INFO: renamed from: ۙ */
    public final ViewOnClickListenerC7497 f68039;

    /* JADX INFO: renamed from: ۛ */
    public final ViewOnLongClickListenerC22920 f68040;

    /* JADX INFO: renamed from: ۟ */
    public final ViewOnLongClickListenerC22920 f68041;

    /* JADX INFO: renamed from: ۤ */
    public final ViewOnLongClickListenerC22920 f68042;

    /* JADX INFO: renamed from: ۨ */
    public final ViewOnLongClickListenerC22920 f68043;

    /* JADX INFO: renamed from: ۫ */
    public final ViewOnLongClickListenerC22920 f68044;

    /* JADX INFO: renamed from: ۬ */
    public final CompoundButton f68045;

    /* JADX INFO: renamed from: ܰ */
    public final ViewOnLongClickListenerC22920 f68046;

    /* JADX INFO: renamed from: ᩶ */
    public final ViewOnLongClickListenerC22920 f68047;

    /* JADX INFO: renamed from: ᩸ */
    public BackgroundColorSpan f68048 = new BackgroundColorSpan(1627389951 & C23223.f72969);

    /* JADX INFO: renamed from: ᩹ */
    public final TextView f68049;

    /* JADX INFO: renamed from: ᩺ */
    public final ViewOnLongClickListenerC22920 f68050;

    public C21579(ViewOnClickListenerC7497 viewOnClickListenerC7497) {
        this.f68039 = viewOnClickListenerC7497;
        CompoundButton compoundButton = (CompoundButton) viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        this.f68045 = compoundButton;
        this.f68049 = (TextView) viewOnClickListenerC7497.m12277(R.id.MT_Protector);
        this.f68044 = new ViewOnLongClickListenerC22920(this, 1, R.id.MT_Protector);
        this.f68050 = new ViewOnLongClickListenerC22920(this, 1, R.id.MT_Protector);
        this.f68043 = new ViewOnLongClickListenerC22920(this, 2, R.id.MT_Protector);
        this.f68037 = new ViewOnLongClickListenerC22920(this, 2, R.id.MT_Protector);
        this.f68042 = new ViewOnLongClickListenerC22920(this, 4, R.id.MT_Protector);
        this.f68046 = new ViewOnLongClickListenerC22920(this, 4, R.id.MT_Protector);
        this.f68040 = new ViewOnLongClickListenerC22920(this, 8, R.id.MT_Protector);
        this.f68041 = new ViewOnLongClickListenerC22920(this, 8, R.id.MT_Protector);
        this.f68038 = new ViewOnLongClickListenerC22920(this, 4, R.id.MT_Protector);
        this.f68047 = new ViewOnLongClickListenerC22920(this, 8, R.id.MT_Protector);
        compoundButton.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48772() {
        int iMin;
        byte[] bArr;
        this.f68049.setText("");
        this.f68044.m51194(0);
        this.f68050.m51194(0);
        this.f68043.m51194(0);
        this.f68037.m51194(0);
        this.f68042.m51194(0);
        this.f68046.m51194(0);
        this.f68040.m51194(0);
        this.f68041.m51194(0);
        this.f68038.m51194(0);
        this.f68047.m51194(0);
        C8838 c8838 = this.f68039.f19629;
        C19644 c19644M29476 = c8838.f23986.m29476();
        try {
            synchronized (c19644M29476) {
                int length = c19644M29476.length();
                int iMax = Math.max(0, Math.min(c8838.f23986.m29480(), length));
                long jMin = length;
                if (c8838.f23986.m29468()) {
                    jMin = Math.min(jMin, ((long) c8838.f23986.m29466()) + 1);
                }
                iMin = (int) Math.min(8L, Math.max(0L, jMin - ((long) iMax)));
                bArr = new byte[iMin];
                c19644M29476.m44653(iMax, iMin, bArr);
            }
            if (iMin > 0) {
                StringBuilder sb = new StringBuilder(iMin * 3);
                for (int i = 0; i < iMin; i++) {
                    sb.append(String.format("%02X ", Integer.valueOf(bArr[i] & 255)));
                }
                sb.deleteCharAt(sb.length() - 1);
                this.f68049.setText(sb.toString());
            }
            if (this.f68044.m51194(iMin)) {
                this.f68044.m51193(String.valueOf((int) ((byte) this.f68044.m51192(bArr))));
            }
            if (this.f68050.m51194(iMin)) {
                this.f68050.m51193(String.valueOf(this.f68050.m51192(bArr)));
            }
            if (this.f68043.m51194(iMin)) {
                this.f68043.m51193(String.valueOf((int) ((short) this.f68043.m51192(bArr))));
            }
            if (this.f68037.m51194(iMin)) {
                this.f68037.m51193(String.valueOf(this.f68037.m51192(bArr)));
            }
            if (this.f68042.m51194(iMin)) {
                this.f68042.m51193(String.valueOf((int) this.f68042.m51192(bArr)));
            }
            if (this.f68046.m51194(iMin)) {
                this.f68046.m51193(String.valueOf(this.f68046.m51192(bArr)));
            }
            if (this.f68040.m51194(iMin)) {
                this.f68040.m51193(String.valueOf(this.f68040.m51192(bArr)));
            }
            if (this.f68041.m51194(iMin)) {
                ViewOnLongClickListenerC22920 viewOnLongClickListenerC22920 = this.f68041;
                int i2 = viewOnLongClickListenerC22920.f72119;
                byte[] bArr2 = new byte[i2];
                if (viewOnLongClickListenerC22920.f72117.f68045.isChecked()) {
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                } else {
                    for (int i3 = 1; i3 <= i2; i3++) {
                        bArr2[i3 - 1] = bArr[i2 - i3];
                    }
                }
                viewOnLongClickListenerC22920.m51193(new BigInteger(1, bArr2).toString());
            }
            if (this.f68038.m51194(iMin)) {
                this.f68038.m51193(Float.toString(Float.intBitsToFloat((int) this.f68038.m51192(bArr))));
            }
            if (this.f68047.m51194(iMin)) {
                this.f68047.m51193(Double.toString(Double.longBitsToDouble(this.f68047.m51192(bArr))));
            }
        } catch (IOException e) {
            this.f68039.m17295(e);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m48772();
    }
}
