package p067l;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧۧ */
/* JADX INFO: compiled from: U6BF */
/* JADX INFO: loaded from: classes3.dex */
public final class C1385 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1197();

    /* JADX INFO: renamed from: ᩸ */
    public final C1509 f35963;

    /* JADX INFO: renamed from: ᩹ */
    public final long f35964;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public C1385(C1509 c1509, long j) {
        if (c1509 == null) {
            throw new IllegalArgumentException("Description cannot be null");
        }
        if (j == -1) {
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }
        this.f35963 = c1509;
        this.f35964 = j;
    }

    public C1385(Parcel parcel) {
        this.f35963 = (C1509) C1509.CREATOR.createFromParcel(parcel);
        this.f35964 = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.f35963.writeToParcel(parcel, i);
        parcel.writeLong(this.f35964);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29324(List list) {
        C1385 c1385;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj : list) {
                if (obj != null) {
                    MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
                    c1385 = new C1385(C1509.m34580(C0930.m8111(queueItem)), C0930.m8113(queueItem));
                } else {
                    c1385 = null;
                }
                arrayList.add(c1385);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
        sb.append(this.f35963);
        sb.append(", Id=");
        return C17520.m39893(sb, this.f35964, " }");
    }
}
