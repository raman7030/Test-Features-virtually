package l;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13455 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C9929();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Uri f40180;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bitmap f40181;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final CharSequence f40182;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final CharSequence f40183;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Uri f40184;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String f40185;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Bundle f40186;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final CharSequence f40187;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public MediaDescription f40188;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C13455(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f40185 = str;
        this.f40182 = charSequence;
        this.f40183 = charSequence2;
        this.f40187 = charSequence3;
        this.f40181 = bitmap;
        this.f40180 = uri;
        this.f40186 = bundle;
        this.f40184 = uri2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m32479() {
        return this.f40185;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM16008 = this.f40188;
        if (mediaDescriptionM16008 == null) {
            MediaDescription.Builder builderM16007 = C5695.m16007();
            C5695.m16014(builderM16007, this.f40185);
            C5695.m16027(builderM16007, this.f40182);
            C5695.m16022(builderM16007, this.f40183);
            C5695.m16013(builderM16007, this.f40187);
            C5695.m16010(builderM16007, this.f40181);
            C5695.m16011(builderM16007, this.f40180);
            Bundle bundle2 = this.f40186;
            Uri uri = this.f40184;
            if (i2 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                C5695.m16012(builderM16007, bundle);
            } else {
                C5695.m16012(builderM16007, bundle2);
            }
            if (i2 >= 23) {
                C11340.m28017(builderM16007, uri);
            }
            mediaDescriptionM16008 = C5695.m16008(builderM16007);
            this.f40188 = mediaDescriptionM16008;
        }
        mediaDescriptionM16008.writeToParcel(parcel, i);
    }

    public final String toString() {
        return ((Object) this.f40182) + ", " + ((Object) this.f40183) + ", " + ((Object) this.f40187);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13455 m32478(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C22628 c22628 = new C22628();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c22628.m50623(C5695.m16029(mediaDescription));
        c22628.m50626(C5695.m16036(mediaDescription));
        c22628.m50625(C5695.m16024(mediaDescription));
        c22628.m50622(C5695.m16009(mediaDescription));
        c22628.m50619(C5695.m16026(mediaDescription));
        c22628.m50620(C5695.m16031(mediaDescription));
        Bundle bundleM16021 = C5695.m16021(mediaDescription);
        if (bundleM16021 != null) {
            C23645.m52135(bundleM16021);
            try {
                bundleM16021.isEmpty();
            } catch (BadParcelableException unused) {
                bundleM16021 = null;
            }
        }
        Uri uri = bundleM16021 != null ? (Uri) bundleM16021.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleM16021;
        } else if (!bundleM16021.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM16021.size() != 2) {
            bundleM16021.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM16021.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM16021;
        }
        c22628.m50621(bundle);
        if (uri != null) {
            c22628.m50624(uri);
        } else if (i >= 23) {
            c22628.m50624(C11340.m28016(mediaDescription));
        }
        C13455 c13455M50618 = c22628.m50618();
        c13455M50618.f40188 = mediaDescription;
        return c13455M50618;
    }
}
