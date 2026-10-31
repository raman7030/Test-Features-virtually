package l;

import android.text.style.BackgroundColorSpan;
import android.widget.CompoundButton;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩶ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95HF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20213 implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65391;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65392;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ViewOnClickListenerC5396 f65393;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65394;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65395;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65396;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65397;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65398;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CompoundButton f65399;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65400;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65401;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public BackgroundColorSpan f65402 = new BackgroundColorSpan(1627389951 & C21943.f70257);

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final TextView f65403;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final ViewOnLongClickListenerC21624 f65404;

    public C20213(ViewOnClickListenerC5396 viewOnClickListenerC5396) {
        this.f65393 = viewOnClickListenerC5396;
        CompoundButton compoundButton = (CompoundButton) viewOnClickListenerC5396.m10241(R.id.MT_Protector);
        this.f65399 = compoundButton;
        this.f65403 = (TextView) viewOnClickListenerC5396.m10241(R.id.MT_Protector);
        this.f65398 = new ViewOnLongClickListenerC21624(this, 1, R.id.MT_Protector);
        this.f65404 = new ViewOnLongClickListenerC21624(this, 1, R.id.MT_Protector);
        this.f65397 = new ViewOnLongClickListenerC21624(this, 2, R.id.MT_Protector);
        this.f65391 = new ViewOnLongClickListenerC21624(this, 2, R.id.MT_Protector);
        this.f65396 = new ViewOnLongClickListenerC21624(this, 4, R.id.MT_Protector);
        this.f65400 = new ViewOnLongClickListenerC21624(this, 4, R.id.MT_Protector);
        this.f65394 = new ViewOnLongClickListenerC21624(this, 8, R.id.MT_Protector);
        this.f65395 = new ViewOnLongClickListenerC21624(this, 8, R.id.MT_Protector);
        this.f65392 = new ViewOnLongClickListenerC21624(this, 4, R.id.MT_Protector);
        this.f65401 = new ViewOnLongClickListenerC21624(this, 8, R.id.MT_Protector);
        compoundButton.setOnCheckedChangeListener(this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m46453() {
        int iMin;
        byte[] bArr;
        this.f65403.setText("");
        this.f65398.m48846(0);
        this.f65404.m48846(0);
        this.f65397.m48846(0);
        this.f65391.m48846(0);
        this.f65396.m48846(0);
        this.f65400.m48846(0);
        this.f65394.m48846(0);
        this.f65395.m48846(0);
        this.f65392.m48846(0);
        this.f65401.m48846(0);
        C6807 c6807 = this.f65393.f16793;
        C18177 c18177M27414 = c6807.f21109.m27414();
        try {
            synchronized (c18177M27414) {
                int length = c18177M27414.length();
                int iMax = Math.max(0, Math.min(c6807.f21109.m27418(), length));
                long jMin = length;
                if (c6807.f21109.m27406()) {
                    jMin = Math.min(jMin, ((long) c6807.f21109.m27404()) + 1);
                }
                iMin = (int) Math.min(8L, Math.max(0L, jMin - ((long) iMax)));
                bArr = new byte[iMin];
                c18177M27414.m42392(iMax, iMin, bArr);
            }
            if (iMin > 0) {
                StringBuilder sb = new StringBuilder(iMin * 3);
                for (int i = 0; i < iMin; i++) {
                    sb.append(String.format("%02X ", Integer.valueOf(bArr[i] & 255)));
                }
                sb.deleteCharAt(sb.length() - 1);
                this.f65403.setText(sb.toString());
            }
            if (this.f65398.m48846(iMin)) {
                this.f65398.m48845(String.valueOf((int) ((byte) this.f65398.m48844(bArr))));
            }
            if (this.f65404.m48846(iMin)) {
                this.f65404.m48845(String.valueOf(this.f65404.m48844(bArr)));
            }
            if (this.f65397.m48846(iMin)) {
                this.f65397.m48845(String.valueOf((int) ((short) this.f65397.m48844(bArr))));
            }
            if (this.f65391.m48846(iMin)) {
                this.f65391.m48845(String.valueOf(this.f65391.m48844(bArr)));
            }
            if (this.f65396.m48846(iMin)) {
                this.f65396.m48845(String.valueOf((int) this.f65396.m48844(bArr)));
            }
            if (this.f65400.m48846(iMin)) {
                this.f65400.m48845(String.valueOf(this.f65400.m48844(bArr)));
            }
            if (this.f65394.m48846(iMin)) {
                this.f65394.m48845(String.valueOf(this.f65394.m48844(bArr)));
            }
            if (this.f65395.m48846(iMin)) {
                ViewOnLongClickListenerC21624 viewOnLongClickListenerC21624 = this.f65395;
                int i2 = viewOnLongClickListenerC21624.f69416;
                byte[] bArr2 = new byte[i2];
                if (viewOnLongClickListenerC21624.f69414.f65399.isChecked()) {
                    System.arraycopy(bArr, 0, bArr2, 0, i2);
                } else {
                    for (int i3 = 1; i3 <= i2; i3++) {
                        bArr2[i3 - 1] = bArr[i2 - i3];
                    }
                }
                viewOnLongClickListenerC21624.m48845(new BigInteger(1, bArr2).toString());
            }
            if (this.f65392.m48846(iMin)) {
                this.f65392.m48845(Float.toString(Float.intBitsToFloat((int) this.f65392.m48844(bArr))));
            }
            if (this.f65401.m48846(iMin)) {
                this.f65401.m48845(Double.toString(Double.longBitsToDouble(this.f65401.m48844(bArr))));
            }
        } catch (IOException e) {
            this.f65393.m15384(e);
        }
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        m46453();
    }
}
