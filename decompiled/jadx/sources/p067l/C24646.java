package p067l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class C24646 {

    /* JADX INFO: renamed from: ֫ */
    public MediaBrowserService.Result f78003;

    public C24646(MediaBrowserService.Result result) {
        this.f78003 = result;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54298(Object obj) {
        boolean z = obj instanceof List;
        MediaBrowserService.Result result = this.f78003;
        if (z) {
            List<Parcel> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            result.sendResult(arrayList);
            return;
        }
        if (obj instanceof Parcel) {
            Parcel parcel2 = (Parcel) obj;
            parcel2.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
            return;
        }
        result.sendResult(null);
    }
}
