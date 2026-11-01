package p067l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78L3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5209 {
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m11175(long j, List list) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C21196) it.next()).m47868());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C0655am.f2278aF, arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
