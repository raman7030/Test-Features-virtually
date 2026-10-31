package l;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.o;

/* JADX INFO: renamed from: l.ۘ֨ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z17V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3612 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractActivityC3346 f11445;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f11446;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean f11447;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CheckBox f11448;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f11449;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final CheckBox f11450;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean[] f11451;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final CheckBox[] f11452;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final TextView f11453;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final DialogInterfaceC0206 f11454;

    public C3612(Main main, int i, boolean z, boolean z2, final Runnable runnable) {
        this.f11445 = main;
        int i2 = i & 4095;
        this.f11446 = i2;
        this.f11449 = z;
        this.f11447 = z2;
        this.f11451 = C10881.m27181(i2);
        View viewM10216 = main.m10216(R.layout.MT_Protector);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        this.f11453 = textView;
        textView.setTypeface(Typeface.MONOSPACE);
        int i3 = 2;
        textView.setOnClickListener(new ViewOnClickListenerC16718(i3, this));
        ViewOnClickListenerC15566 viewOnClickListenerC15566 = new ViewOnClickListenerC15566(i3, this);
        int[] iArr = {R.id.MT_Protector, R.id.checkBox2, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.MT_Protector, R.id.checkBox10, R.id.checkBox11, R.id.checkBox12};
        this.f11452 = new CheckBox[12];
        for (int i4 = 0; i4 < 12; i4++) {
            CheckBox checkBox = (CheckBox) viewM10216.findViewById(iArr[i4]);
            checkBox.setChecked(this.f11451[i4]);
            checkBox.setTag(Integer.valueOf(i4));
            checkBox.setOnClickListener(viewOnClickListenerC15566);
            this.f11452[i4] = checkBox;
        }
        CheckBox checkBox2 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f11448 = checkBox2;
        CheckBox checkBox3 = (CheckBox) viewM10216.findViewById(R.id.MT_Protector);
        this.f11450 = checkBox3;
        if (!z) {
            checkBox2.setVisibility(8);
            checkBox3.setVisibility(8);
        }
        if (!z2) {
            viewM10216.findViewById(R.id.MT_Protector).setVisibility(8);
        }
        C19258 c19258BuildDialog = main.buildDialog();
        c19258BuildDialog.m44421(viewM10216);
        DialogInterfaceC0206 dialogInterfaceC0206M44415 = c19258BuildDialog.m44415();
        this.f11454 = dialogInterfaceC0206M44415;
        dialogInterfaceC0206M44415.m1434(-1, C4925.m14327(R.string.MT_Protector), new DialogInterface.OnClickListener() { // from class: l.ܺ֨ܳ
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                runnable.run();
            }
        });
        dialogInterfaceC0206M44415.m1434(-2, C4925.m14327(R.string.MT_Protector), null);
        m11078();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11076(C3612 c3612, View view) {
        CheckBox checkBox = (CheckBox) view;
        c3612.f11451[((Integer) checkBox.getTag()).intValue()] = checkBox.isChecked();
        c3612.m11078();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11075(C3612 c3612) {
        String octalString = Integer.toOctalString(c3612.m11081());
        while (true) {
            if (octalString.length() >= 3) {
                break;
            } else {
                octalString = "0".concat(octalString);
            }
        }
        C2201 c2201 = new C2201(c3612, c3612.f11445);
        c2201.m31258(R.string.MT_Protector);
        c2201.m31250((CharSequence) octalString);
        c2201.m31268(c3612.f11447 ? 4 : 3);
        c2201.m31276(o.a.b);
        c2201.m31244();
        c2201.m31279(6);
        c2201.m31281();
        c2201.m31266(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m11081() {
        boolean[] zArr = this.f11451;
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
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m11078() {
        int iM11081 = m11081();
        String octalString = Integer.toOctalString(iM11081);
        while (octalString.length() < 3) {
            octalString = "0".concat(octalString);
        }
        String str = C10881.m27180(iM11081) + MotionUtils.EASING_TYPE_FORMAT_START;
        SpannableString spannableString = new SpannableString(C22870.m50967(str, octalString, MotionUtils.EASING_TYPE_FORMAT_END));
        spannableString.setSpan(new UnderlineSpan(), str.length(), spannableString.length() - 1, 0);
        this.f11453.setText(spannableString);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m11085() {
        return this.f11446 != m11081() || m11082() || m11083();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m11082() {
        return this.f11449 && this.f11448.isChecked();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m11083() {
        return this.f11449 && this.f11450.isChecked();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m11084() {
        DialogInterfaceC0206 dialogInterfaceC0206 = this.f11454;
        dialogInterfaceC0206.m1449();
        if (this.f11449) {
            C8960.m23097(dialogInterfaceC0206);
        }
    }
}
