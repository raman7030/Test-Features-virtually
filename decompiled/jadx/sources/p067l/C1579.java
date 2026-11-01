package p067l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ܶ */
/* JADX INFO: compiled from: 95XT */
/* JADX INFO: loaded from: classes4.dex */
public class C1579 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1229();

    /* JADX INFO: renamed from: ᩸ */
    public final C1509 f48464;

    /* JADX INFO: renamed from: ᩹ */
    public final int f48465;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37423(List list) {
        C1579 c1579;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
                    c1579 = new C1579(C1509.m34580(C1299.m25663(mediaItem)), C1299.m25664(mediaItem));
                } else {
                    c1579 = null;
                }
                arrayList.add(c1579);
            }
        }
    }

    public C1579(C1509 c1509, int i) {
        if (c1509 == null) {
            throw new IllegalArgumentException("description cannot be null");
        }
        if (TextUtils.isEmpty(c1509.m34581())) {
            throw new IllegalArgumentException("description must have a non-empty media id");
        }
        this.f48465 = i;
        this.f48464 = c1509;
    }

    public C1579(Parcel parcel) {
        this.f48465 = parcel.readInt();
        this.f48464 = (C1509) C1509.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f48465);
        this.f48464.writeToParcel(parcel, i);
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f48465 + ", mDescription=" + this.f48464 + '}';
    }
}
