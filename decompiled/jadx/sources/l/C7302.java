package l;

import android.widget.Filter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: N155 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7302 extends Filter {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2072 f22412;

    public C7302(C2072 c2072) {
        this.f22412 = c2072;
    }

    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (this.f22412.f6909 == null) {
            synchronized (this.f22412.f6913) {
                this.f22412.f6909 = new ArrayList(this.f22412.f6910);
            }
        }
        if (charSequence == null || charSequence.length() == 0) {
            synchronized (this.f22412.f6913) {
                arrayList = new ArrayList(this.f22412.f6909);
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
            return filterResults;
        }
        String lowerCase = charSequence.toString().toLowerCase();
        synchronized (this.f22412.f6913) {
            arrayList2 = new ArrayList(this.f22412.f6909);
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
        C2072 c2072 = this.f22412;
        c2072.f6910 = list;
        if (filterResults.count > 0) {
            c2072.notifyDataSetChanged();
        } else {
            c2072.notifyDataSetInvalidated();
        }
    }
}
