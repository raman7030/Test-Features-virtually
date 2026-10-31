package l;

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
public final class C19811 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final String f63966;

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public static final String f63967;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final String f63968;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final String f63969;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String f63970;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String f63971;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final String f63972;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String f63973;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final String f63974;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String f63975;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String f63976;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String f63977;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String f63978;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final String f63979;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public static final String f63980;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static final String f63981;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final String f63982;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f63983;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final String f63984;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String f63985;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f63986;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f63987;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f63988;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f63989;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f63990;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f63991;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final CharSequence f63992;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f63993;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f63994;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment f63995;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Layout.Alignment f63996;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f63997;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f63998;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f63999;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f64000;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f64001;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f64002;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f64003;

    static {
        C21927 c21927 = new C21927();
        c21927.m49389("");
        c21927.m49383();
        String str = C3603.f11424;
        f63975 = Integer.toString(0, 36);
        f63983 = Integer.toString(17, 36);
        f63985 = Integer.toString(1, 36);
        f63968 = Integer.toString(2, 36);
        f63979 = Integer.toString(3, 36);
        f63966 = Integer.toString(18, 36);
        f63984 = Integer.toString(4, 36);
        f63969 = Integer.toString(5, 36);
        f63982 = Integer.toString(6, 36);
        f63977 = Integer.toString(7, 36);
        f63976 = Integer.toString(8, 36);
        f63971 = Integer.toString(9, 36);
        f63978 = Integer.toString(10, 36);
        f63970 = Integer.toString(11, 36);
        f63972 = Integer.toString(12, 36);
        f63974 = Integer.toString(13, 36);
        f63980 = Integer.toString(14, 36);
        f63967 = Integer.toString(15, 36);
        f63973 = Integer.toString(16, 36);
        f63981 = Integer.toString(19, 36);
    }

    public C19811(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z, int i5, int i6, float f6, int i7) {
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            C22632.m50631(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f63992 = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f63992 = charSequence.toString();
        } else {
            this.f63992 = null;
        }
        this.f63996 = alignment;
        this.f63995 = alignment2;
        this.f63987 = bitmap;
        this.f63997 = f;
        this.f63998 = i;
        this.f63999 = i2;
        this.f64003 = f2;
        this.f63991 = i3;
        this.f63993 = f4;
        this.f63994 = f5;
        this.f63986 = z;
        this.f64001 = i5;
        this.f63989 = i4;
        this.f63988 = f3;
        this.f64000 = i6;
        this.f64002 = f6;
        this.f63990 = i7;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21927 m45556() {
        return new C21927(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19811.class != obj.getClass()) {
            return false;
        }
        C19811 c19811 = (C19811) obj;
        Bitmap bitmap = c19811.f63987;
        if (!TextUtils.equals(this.f63992, c19811.f63992) || this.f63996 != c19811.f63996 || this.f63995 != c19811.f63995) {
            return false;
        }
        Bitmap bitmap2 = this.f63987;
        if (bitmap2 == null) {
            if (bitmap != null) {
                return false;
            }
        } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
            return false;
        }
        return this.f63997 == c19811.f63997 && this.f63998 == c19811.f63998 && this.f63999 == c19811.f63999 && this.f64003 == c19811.f64003 && this.f63991 == c19811.f63991 && this.f63993 == c19811.f63993 && this.f63994 == c19811.f63994 && this.f63986 == c19811.f63986 && this.f64001 == c19811.f64001 && this.f63989 == c19811.f63989 && this.f63988 == c19811.f63988 && this.f64000 == c19811.f64000 && this.f64002 == c19811.f64002 && this.f63990 == c19811.f63990;
    }

    public final int hashCode() {
        return C11003.hash(this.f63992, this.f63996, this.f63995, this.f63987, Float.valueOf(this.f63997), Integer.valueOf(this.f63998), Integer.valueOf(this.f63999), Float.valueOf(this.f64003), Integer.valueOf(this.f63991), Float.valueOf(this.f63993), Float.valueOf(this.f63994), Boolean.valueOf(this.f63986), Integer.valueOf(this.f64001), Integer.valueOf(this.f63989), Float.valueOf(this.f63988), Integer.valueOf(this.f64000), Float.valueOf(this.f64002), Integer.valueOf(this.f63990));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Bundle m45557() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f63992;
        if (charSequence != null) {
            bundle.putCharSequence(f63975, charSequence);
            if (charSequence instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListM8801 = C2877.m8801((Spanned) charSequence);
                if (!arrayListM8801.isEmpty()) {
                    bundle.putParcelableArrayList(f63983, arrayListM8801);
                }
            }
        }
        bundle.putSerializable(f63985, this.f63996);
        bundle.putSerializable(f63968, this.f63995);
        bundle.putFloat(f63984, this.f63997);
        bundle.putInt(f63969, this.f63998);
        bundle.putInt(f63982, this.f63999);
        bundle.putFloat(f63977, this.f64003);
        bundle.putInt(f63976, this.f63991);
        bundle.putInt(f63971, this.f63989);
        bundle.putFloat(f63978, this.f63988);
        bundle.putFloat(f63970, this.f63993);
        bundle.putFloat(f63972, this.f63994);
        bundle.putBoolean(f63980, this.f63986);
        bundle.putInt(f63974, this.f64001);
        bundle.putInt(f63967, this.f64000);
        bundle.putFloat(f63973, this.f64002);
        bundle.putInt(f63981, this.f63990);
        Bitmap bitmap = this.f63987;
        if (bitmap != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C22632.m50634(bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f63966, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19811 m45555(Bundle bundle) {
        C21927 c21927 = new C21927();
        CharSequence charSequence = bundle.getCharSequence(f63975);
        if (charSequence != null) {
            c21927.m49389(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f63983);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    C2877.m8802((Bundle) it.next(), spannableStringValueOf);
                }
                c21927.m49389(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f63985);
        if (alignment != null) {
            c21927.m49394(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f63968);
        if (alignment2 != null) {
            c21927.m49388(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f63979);
        if (bitmap != null) {
            c21927.m49387(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f63966);
            if (byteArray != null) {
                c21927.m49387(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f63984;
        if (bundle.containsKey(str)) {
            String str2 = f63969;
            if (bundle.containsKey(str2)) {
                c21927.m49385(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f63982;
        if (bundle.containsKey(str3)) {
            c21927.m49386(bundle.getInt(str3));
        }
        String str4 = f63977;
        if (bundle.containsKey(str4)) {
            c21927.m49391(bundle.getFloat(str4));
        }
        String str5 = f63976;
        if (bundle.containsKey(str5)) {
            c21927.m49393(bundle.getInt(str5));
        }
        String str6 = f63978;
        if (bundle.containsKey(str6)) {
            String str7 = f63971;
            if (bundle.containsKey(str7)) {
                c21927.m49392(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f63970;
        if (bundle.containsKey(str8)) {
            c21927.m49401(bundle.getFloat(str8));
        }
        String str9 = f63972;
        if (bundle.containsKey(str9)) {
            c21927.m49384(bundle.getFloat(str9));
        }
        String str10 = f63974;
        if (bundle.containsKey(str10)) {
            c21927.m49402(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f63980, false)) {
            c21927.m49390();
        }
        String str11 = f63967;
        if (bundle.containsKey(str11)) {
            c21927.m49397(bundle.getInt(str11));
        }
        String str12 = f63973;
        if (bundle.containsKey(str12)) {
            c21927.m49396(bundle.getFloat(str12));
        }
        String str13 = f63981;
        if (bundle.containsKey(str13)) {
            c21927.m49399(bundle.getInt(str13));
        }
        return c21927.m49383();
    }
}
