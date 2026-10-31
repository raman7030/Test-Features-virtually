package l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public class C14866 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7811();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13455 f45349;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f45350;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m35270(List list) {
        C14866 c14866;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                    c14866 = new C14866(C13455.m32478(C9223.m23664(mediaItem)), C9223.m23665(mediaItem));
                } else {
                    c14866 = null;
                }
                arrayList.add(c14866);
            }
        }
    }

    public C14866(C13455 c13455, int i) {
        if (c13455 == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(c13455.m32479())) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f45350 = i;
        this.f45349 = c13455;
    }

    public C14866(Parcel parcel) {
        this.f45350 = parcel.readInt();
        this.f45349 = (C13455) C13455.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45350);
        this.f45349.writeToParcel(parcel, i);
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f45350 + ", mDescription=" + this.f45349 + '}';
    }
}
