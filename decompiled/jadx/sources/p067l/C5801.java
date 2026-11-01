package p067l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.p000mt.plus.Main;
import bin.p000mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.C0719o;

/* JADX INFO: renamed from: l.ۘ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5801 {

    /* JADX INFO: renamed from: ֫ */
    public AbstractActivityC5549 f14249;

    /* JADX INFO: renamed from: ۜ */
    public final int f14250;

    /* JADX INFO: renamed from: ۢ */
    public final boolean f14251;

    /* JADX INFO: renamed from: ۧ */
    public final CheckBox f14252;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f14253;

    /* JADX INFO: renamed from: ܽ */
    public final CheckBox f14254;

    /* JADX INFO: renamed from: ܿ */
    public final boolean[] f14255;

    /* JADX INFO: renamed from: ᩳ */
    public final CheckBox[] f14256;

    /* JADX INFO: renamed from: ᩷ */
    public final TextView f14257;

    /* JADX INFO: renamed from: ᩻ */
    public final DialogInterfaceC2564 f14258;

    public C5801(Main main, int i, boolean z, boolean z2, final Runnable runnable) {
        this.f14249 = main;
        int i2 = i & 4095;
        this.f14250 = i2;
        this.f14253 = z;
        this.f14251 = z2;
        this.f14255 = C12710.m29226(i2);
        View viewM12252 = main.m12252(R.layout.MT_Protector);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        this.f14257 = textView;
        textView.setTypeface(Typeface.MONOSPACE);
        int i3 = 2;
        textView.setOnClickListener(new ViewOnClickListenerC18257(i3, this));
        ViewOnClickListenerC17163 viewOnClickListenerC17163 = new ViewOnClickListenerC17163(i3, this);
        int[] iArr = {R.id.MT_Protector, R.id.checkBox2, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.checkBox10, R.id.checkBox11, R.id.checkBox12};
        this.f14256 = new CheckBox[12];
        for (int i4 = 0; i4 < 12; i4++) {
            CheckBox checkBox = (CheckBox) viewM12252.findViewById(iArr[i4]);
            checkBox.setChecked(this.f14255[i4]);
            checkBox.setTag(Integer.valueOf(i4));
            checkBox.setOnClickListener(viewOnClickListenerC17163);
            this.f14256[i4] = checkBox;
        }
        CheckBox checkBox2 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f14252 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM12252.findViewById(R.id.MT_Protector);
        this.f14254 = checkBox3;
        if (!z) {
            checkBox2.setVisibility(8);
            checkBox3.setVisibility(8);
        }
        if (!z2) {
            viewM12252.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        C20671 c20671BuildDialog = main.buildDialog();
        c20671BuildDialog.m46715(viewM12252);
        DialogInterfaceC2564 dialogInterfaceC2564M46709 = c20671BuildDialog.m46709();
        this.f14258 = dialogInterfaceC2564M46709;
        dialogInterfaceC2564M46709.m3847(-1, C7050.m16224(R.string.MT_Protector), new DialogInterface.OnClickListener() { // from class: l.ܺ֨ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                runnable.run();
            }
        });
        dialogInterfaceC2564M46709.m3847(-2, C7050.m16224(R.string.MT_Protector), null);
        m13054();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13052(C5801 c5801, View view) {
        CheckBox checkBox = (CheckBox) view;
        c5801.f14255[((Integer) checkBox.getTag()).intValue()] = checkBox.isChecked();
        c5801.m13054();
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13051(C5801 c5801) {
        String octalString = Integer.toOctalString(c5801.m13057());
        while (true) {
            if (octalString.length() >= 3) {
                break;
            } else {
                octalString = "0".concat(octalString);
            }
        }
        C4460 c4460 = new C4460(c5801, c5801.f14249);
        c4460.m33344(R.string.MT_Protector);
        c4460.m33336((CharSequence) octalString);
        c4460.m33354(c5801.f14251 ? 4 : 3);
        c4460.m33362(C0719o.a.f2896b);
        c4460.m33330();
        c4460.m33365(6);
        c4460.m33367();
        c4460.m33352(true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m13057() {
        boolean[] zArr = this.f14255;
        int i = zArr[0] ? 256 : 0;
        if (zArr[1]) {
            i |= 128;
        }
        if (zArr[2]) {
            i |= 64;
        }
        if (zArr[3]) {
            i |= 32;
        }
        if (zArr[4]) {
            i |= 16;
        }
        if (zArr[5]) {
            i |= 8;
        }
        if (zArr[6]) {
            i |= 4;
        }
        if (zArr[7]) {
            i |= 2;
        }
        if (zArr[8]) {
            i |= 1;
        }
        if (zArr[9]) {
            i |= 2048;
        }
        if (zArr[10]) {
            i |= 1024;
        }
        return zArr[11] ? i | 512 : i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ */
    public void m13054() {
        int iM13057 = m13057();
        String octalString = Integer.toOctalString(iM13057);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        String str = C12710.m29225(iM13057) + MotionUtils.EASING_TYPE_FORMAT_START;
        SpannableString spannableString = new SpannableString(C24104.m53357(str, octalString, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new UnderlineSpan(), str.length(), spannableString.length() - 1, 0);
        this.f14257.setText(spannableString);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m13061() {
        return this.f14250 != m13057() || m13058() || m13059();
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m13058() {
        return this.f14253 && this.f14252.isChecked();
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m13059() {
        return this.f14253 && this.f14254.isChecked();
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m13060() {
        DialogInterfaceC2564 dialogInterfaceC2564 = this.f14258;
        dialogInterfaceC2564.m3862();
        if (this.f14253) {
            C10884.m25071(dialogInterfaceC2564);
        }
    }
}
