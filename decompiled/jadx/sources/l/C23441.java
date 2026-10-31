package l;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes.dex */
public final class C23441 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public MediaBrowserService.Result f75255;

    public C23441(MediaBrowserService.Result result) {
        this.f75255 = result;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51897(Object obj) {
        boolean z = obj instanceof List;
        MediaBrowserService.Result result = this.f75255;
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
