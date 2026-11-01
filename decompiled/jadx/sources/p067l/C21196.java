package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶֡֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78TZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C21196 {

    /* JADX INFO: renamed from: ֨ */
    public static final String f66603;

    /* JADX INFO: renamed from: ֫֫ */
    public static final String f66604;

    /* JADX INFO: renamed from: ۗ */
    public static final String f66605;

    /* JADX INFO: renamed from: ۙ */
    public static final String f66606;

    /* JADX INFO: renamed from: ۛ */
    public static final String f66607;

    /* JADX INFO: renamed from: ۟ */
    public static final String f66608;

    /* JADX INFO: renamed from: ۠ */
    public static final String f66609;

    /* JADX INFO: renamed from: ۤ */
    public static final String f66610;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final String f66611;

    /* JADX INFO: renamed from: ۨ */
    public static final String f66612;

    /* JADX INFO: renamed from: ۫ */
    public static final String f66613;

    /* JADX INFO: renamed from: ۬ */
    public static final String f66614;

    /* JADX INFO: renamed from: ܰ */
    public static final String f66615;

    /* JADX INFO: renamed from: ܶ */
    public static final String f66616;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final String f66617;

    /* JADX INFO: renamed from: ᩳ֫ */
    public static final String f66618;

    /* JADX INFO: renamed from: ᩶ */
    public static final String f66619;

    /* JADX INFO: renamed from: ᩸ */
    public static final String f66620;

    /* JADX INFO: renamed from: ᩹ */
    public static final String f66621;

    /* JADX INFO: renamed from: ᩺ */
    public static final String f66622;

    /* JADX INFO: renamed from: ֡ */
    public final boolean f66623;

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f66624;

    /* JADX INFO: renamed from: ۖ */
    public final float f66625;

    /* JADX INFO: renamed from: ۘ */
    public final int f66626;

    /* JADX INFO: renamed from: ۚ */
    public final int f66627;

    /* JADX INFO: renamed from: ۜ */
    public final int f66628;

    /* JADX INFO: renamed from: ۡ */
    public final CharSequence f66629;

    /* JADX INFO: renamed from: ۢ */
    public final float f66630;

    /* JADX INFO: renamed from: ۧ */
    public final float f66631;

    /* JADX INFO: renamed from: ܳ */
    public final Layout.Alignment f66632;

    /* JADX INFO: renamed from: ܺ */
    public final Layout.Alignment f66633;

    /* JADX INFO: renamed from: ܽ */
    public final float f66634;

    /* JADX INFO: renamed from: ܿ */
    public final int f66635;

    /* JADX INFO: renamed from: ᩳ */
    public final int f66636;

    /* JADX INFO: renamed from: ᩴ */
    public final int f66637;

    /* JADX INFO: renamed from: ᩵ */
    public final int f66638;

    /* JADX INFO: renamed from: ᩷ */
    public final float f66639;

    /* JADX INFO: renamed from: ᩻ */
    public final float f66640;

    static {
        C23207 c23207 = new C23207();
        c23207.m51726("");
        c23207.m51720();
        String str = C5792.f14228;
        f66612 = Integer.toString(0, 36);
        f66620 = Integer.toString(17, 36);
        f66622 = Integer.toString(1, 36);
        f66605 = Integer.toString(2, 36);
        f66616 = Integer.toString(3, 36);
        f66603 = Integer.toString(18, 36);
        f66621 = Integer.toString(4, 36);
        f66606 = Integer.toString(5, 36);
        f66619 = Integer.toString(6, 36);
        f66614 = Integer.toString(7, 36);
        f66613 = Integer.toString(8, 36);
        f66608 = Integer.toString(9, 36);
        f66615 = Integer.toString(10, 36);
        f66607 = Integer.toString(11, 36);
        f66609 = Integer.toString(12, 36);
        f66611 = Integer.toString(13, 36);
        f66617 = Integer.toString(14, 36);
        f66604 = Integer.toString(15, 36);
        f66610 = Integer.toString(16, 36);
        f66618 = Integer.toString(19, 36);
    }

    public C21196(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C23877.m52957(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f66629 = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f66629 = charSequence.toString();
        } else {
            this.f66629 = null;
        }
        this.f66633 = alignment;
        this.f66632 = alignment2;
        this.f66624 = bitmap;
        this.f66634 = f;
        this.f66635 = i;
        this.f66636 = i2;
        this.f66640 = f2;
        this.f66628 = i3;
        this.f66630 = f4;
        this.f66631 = f5;
        this.f66623 = z;
        this.f66638 = i5;
        this.f66626 = i4;
        this.f66625 = f3;
        this.f66637 = i6;
        this.f66639 = f6;
        this.f66627 = i7;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23207 m47867() {
        return new C23207(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C21196.class != obj.getClass()) {
            return false;
        }
        C21196 c21196 = (C21196) obj;
        Bitmap bitmap = c21196.f66624;
        if (!TextUtils.equals(this.f66629, c21196.f66629) || this.f66633 != c21196.f66633 || this.f66632 != c21196.f66632) {
            return false;
        }
        Bitmap bitmap2 = this.f66624;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f66634 == c21196.f66634 && this.f66635 == c21196.f66635 && this.f66636 == c21196.f66636 && this.f66640 == c21196.f66640 && this.f66628 == c21196.f66628 && this.f66630 == c21196.f66630 && this.f66631 == c21196.f66631 && this.f66623 == c21196.f66623 && this.f66638 == c21196.f66638 && this.f66626 == c21196.f66626 && this.f66625 == c21196.f66625 && this.f66637 == c21196.f66637 && this.f66639 == c21196.f66639 && this.f66627 == c21196.f66627;
    }

    public final int hashCode() {
        return C12826.hash(this.f66629, this.f66633, this.f66632, this.f66624, Float.valueOf(this.f66634), Integer.valueOf(this.f66635), Integer.valueOf(this.f66636), Float.valueOf(this.f66640), Integer.valueOf(this.f66628), Float.valueOf(this.f66630), Float.valueOf(this.f66631), Boolean.valueOf(this.f66623), Integer.valueOf(this.f66638), Integer.valueOf(this.f66626), Float.valueOf(this.f66625), Integer.valueOf(this.f66637), Float.valueOf(this.f66639), Integer.valueOf(this.f66627));
    }

    /* JADX INFO: renamed from: ۧ */
    public final Bundle m47868() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f66629;
        if (charSequence != null) {
            bundle.putCharSequence(f66612, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListM10868 = C5102.m10868((Spanned) charSequence);
                if (!arrayListM10868.isEmpty()) {
                    bundle.putParcelableArrayList(f66620, arrayListM10868);
                }
            }
        }
        bundle.putSerializable(f66622, this.f66633);
        bundle.putSerializable(f66605, this.f66632);
        bundle.putFloat(f66621, this.f66634);
        bundle.putInt(f66606, this.f66635);
        bundle.putInt(f66619, this.f66636);
        bundle.putFloat(f66614, this.f66640);
        bundle.putInt(f66613, this.f66628);
        bundle.putInt(f66608, this.f66626);
        bundle.putFloat(f66615, this.f66625);
        bundle.putFloat(f66607, this.f66630);
        bundle.putFloat(f66609, this.f66631);
        bundle.putBoolean(f66617, this.f66623);
        bundle.putInt(f66611, this.f66638);
        bundle.putInt(f66604, this.f66637);
        bundle.putFloat(f66610, this.f66639);
        bundle.putInt(f66618, this.f66627);
        Bitmap bitmap = this.f66624;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C23877.m52960(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f66603, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C21196 m47866(Bundle bundle) {
        C23207 c23207 = new C23207();
        CharSequence charSequence = bundle.getCharSequence(f66612);
        if (charSequence != null) {
            c23207.m51726(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f66620);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    C5102.m10869((Bundle) it.next(), spannableStringValueOf);
                }
                c23207.m51726(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f66622);
        if (alignment != null) {
            c23207.m51731(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f66605);
        if (alignment2 != null) {
            c23207.m51725(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f66616);
        if (bitmap != null) {
            c23207.m51724(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f66603);
            if (byteArray != null) {
                c23207.m51724(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f66621;
        if (bundle.containsKey(str)) {
            String str2 = f66606;
            if (bundle.containsKey(str2)) {
                c23207.m51722(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f66619;
        if (bundle.containsKey(str3)) {
            c23207.m51723(bundle.getInt(str3));
        }
        String str4 = f66614;
        if (bundle.containsKey(str4)) {
            c23207.m51728(bundle.getFloat(str4));
        }
        String str5 = f66613;
        if (bundle.containsKey(str5)) {
            c23207.m51730(bundle.getInt(str5));
        }
        String str6 = f66615;
        if (bundle.containsKey(str6)) {
            String str7 = f66608;
            if (bundle.containsKey(str7)) {
                c23207.m51729(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f66607;
        if (bundle.containsKey(str8)) {
            c23207.m51738(bundle.getFloat(str8));
        }
        String str9 = f66609;
        if (bundle.containsKey(str9)) {
            c23207.m51721(bundle.getFloat(str9));
        }
        String str10 = f66611;
        if (bundle.containsKey(str10)) {
            c23207.m51739(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f66617, false)) {
            c23207.m51727();
        }
        String str11 = f66604;
        if (bundle.containsKey(str11)) {
            c23207.m51734(bundle.getInt(str11));
        }
        String str12 = f66610;
        if (bundle.containsKey(str12)) {
            c23207.m51733(bundle.getFloat(str12));
        }
        String str13 = f66618;
        if (bundle.containsKey(str13)) {
            c23207.m51736(bundle.getInt(str13));
        }
        return c23207.m51720();
    }
}
