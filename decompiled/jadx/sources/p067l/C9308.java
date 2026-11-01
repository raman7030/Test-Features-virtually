package p067l;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N155 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9308 extends Filter {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ C4338 f25303;

    public C9308(C4338 c4338) {
        this.f25303 = c4338;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (this.f25303.f9693 == null) {
            synchronized (this.f25303.f9697) {
                this.f25303.f9693 = new ArrayList(this.f25303.f9694);
            }
        }
        if (charSequence == null || charSequence.length() == 0) {
            synchronized (this.f25303.f9697) {
                arrayList = new ArrayList(this.f25303.f9693);
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        synchronized (this.f25303.f9697) {
            arrayList2 = new ArrayList(this.f25303.f9693);
        }
        int size = arrayList2.size();
        ArrayList arrayList3 = new ArrayList();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList2.get(i);
            String lowerCase2 = obj.toString().toLowerCase();
            if (lowerCase2.startsWith(lowerCase)) {
                arrayList3.add(obj);
            } else {
                for (String str : lowerCase2.split(" ")) {
                    if (str.startsWith(lowerCase)) {
                        arrayList3.add(obj);
                        break;
                    }
                }
            }
        }
        filterResults.values = arrayList3;
        filterResults.count = arrayList3.size();
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        List list = (List) filterResults.values;
        C4338 c4338 = this.f25303;
        c4338.f9694 = list;
        if (filterResults.count > 0) {
            c4338.notifyDataSetChanged();
        } else {
            c4338.notifyDataSetInvalidated();
        }
    }
}
