package l;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.umeng.analytics.pro.am;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 78L3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2989 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m9124(long j, List list) {
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C19811) it.next()).m45557());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(am.aF, arrayList);
        bundle.putLong("d", j);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeBundle(bundle);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        return bArrMarshall;
    }
}
