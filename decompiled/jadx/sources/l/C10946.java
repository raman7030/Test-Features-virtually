package l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C10946 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7149();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13455 f32971;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f32972;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C10946(C13455 c13455, long j) {
        if (c13455 == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f32971 = c13455;
        this.f32972 = j;
    }

    public C10946(Parcel parcel) {
        this.f32971 = (C13455) C13455.CREATOR.createFromParcel(parcel);
        this.f32972 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f32971.writeToParcel(parcel, i);
        parcel.writeLong(this.f32972);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27264(List list) {
        C10946 c10946;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    c10946 = new C10946(C13455.m32478(C1773.m5900(queueItem)), C1773.m5909(queueItem));
                } else {
                    c10946 = null;
                }
                arrayList.add(c10946);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f32971);
        sb.append(", Id=");
        return C15942.m37718(sb, this.f32972, " }");
    }
}
