package p067l;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: l.ܰ */
/* JADX INFO: compiled from: J622 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1509 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1334();

    /* JADX INFO: renamed from: ۗ */
    public final Uri f43250;

    /* JADX INFO: renamed from: ۙ */
    public final Bitmap f43251;

    /* JADX INFO: renamed from: ۛ */
    public final CharSequence f43252;

    /* JADX INFO: renamed from: ۤ */
    public final CharSequence f43253;

    /* JADX INFO: renamed from: ۫ */
    public final Uri f43254;

    /* JADX INFO: renamed from: ۬ */
    public final String f43255;

    /* JADX INFO: renamed from: ᩶ */
    public final Bundle f43256;

    /* JADX INFO: renamed from: ᩸ */
    public final CharSequence f43257;

    /* JADX INFO: renamed from: ᩹ */
    public MediaDescription f43258;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1509(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f43255 = str;
        this.f43252 = charSequence;
        this.f43253 = charSequence2;
        this.f43257 = charSequence3;
        this.f43251 = bitmap;
        this.f43250 = uri;
        this.f43256 = bundle;
        this.f43254 = uri2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m34581() {
        return this.f43255;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle;
        int i2 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescriptionM17942 = this.f43258;
        if (mediaDescriptionM17942 == null) {
            MediaDescription.Builder builderM17941 = C1124.m17941();
            C1124.m17948(builderM17941, this.f43255);
            C1124.m17953(builderM17941, this.f43252);
            C1124.m17950(builderM17941, this.f43253);
            C1124.m17947(builderM17941, this.f43257);
            C1124.m17944(builderM17941, this.f43251);
            C1124.m17945(builderM17941, this.f43250);
            Bundle bundle2 = this.f43256;
            Uri uri = this.f43254;
            if (i2 < 23 && uri != null) {
                if (bundle2 == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                } else {
                    bundle = new Bundle(bundle2);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
                C1124.m17946(builderM17941, bundle);
            } else {
                C1124.m17946(builderM17941, bundle2);
            }
            if (i2 >= 23) {
                C1404.m30076(builderM17941, uri);
            }
            mediaDescriptionM17942 = C1124.m17942(builderM17941);
            this.f43258 = mediaDescriptionM17942;
        }
        mediaDescriptionM17942.writeToParcel(parcel, i);
    }

    public final String toString() {
        return ((Object) this.f43252) + ", " + ((Object) this.f43253) + ", " + ((Object) this.f43257);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1509 m34580(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i = Build.VERSION.SDK_INT;
        C1964 c1964 = new C1964();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c1964.m52949(C1124.m17954(mediaDescription));
        c1964.m52952(C1124.m17956(mediaDescription));
        c1964.m52951(C1124.m17951(mediaDescription));
        c1964.m52948(C1124.m17943(mediaDescription));
        c1964.m52945(C1124.m17952(mediaDescription));
        c1964.m52946(C1124.m17955(mediaDescription));
        Bundle bundleM17949 = C1124.m17949(mediaDescription);
        if (bundleM17949 != null) {
            C2015.m54538(bundleM17949);
            try {
                bundleM17949.isEmpty();
            } catch (BadParcelableException unused) {
                bundleM17949 = null;
            }
        }
        Uri uri = bundleM17949 != null ? (Uri) bundleM17949.getParcelable("android.support.v4.media.description.MEDIA_URI") : null;
        if (uri == null) {
            bundle = bundleM17949;
        } else if (!bundleM17949.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleM17949.size() != 2) {
            bundleM17949.remove("android.support.v4.media.description.MEDIA_URI");
            bundleM17949.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleM17949;
        }
        c1964.m52947(bundle);
        if (uri != null) {
            c1964.m52950(uri);
        } else if (i >= 23) {
            c1964.m52950(C1404.m30075(mediaDescription));
        }
        C1509 c1509M52944 = c1964.m52944();
        c1509M52944.f43258 = mediaDescription;
        return c1509M52944;
    }
}
