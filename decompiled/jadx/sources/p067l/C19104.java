package p067l;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܿ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z754 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19104 {

    /* JADX INFO: renamed from: ܳ */
    public InterfaceC19775 f56994;

    /* JADX INFO: renamed from: ᩳ */
    public InterfaceC19775 f56997;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f56993 = new HashMap();

    /* JADX INFO: renamed from: ֫ */
    public final SparseArray f56992 = new SparseArray();

    /* JADX INFO: renamed from: ܿ */
    public final SparseBooleanArray f56996 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ܽ */
    public final SparseBooleanArray f56995 = new SparseBooleanArray();

    public C19104(C22083 c22083, File file) {
        C13070 c13070 = new C13070(c22083);
        C18433 c18433 = new C18433(new File(file, "cached_content_index.exi"));
        this.f56994 = c13070;
        this.f56997 = c18433;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43408(long j) {
        InterfaceC19775 interfaceC19775;
        InterfaceC19775 interfaceC19776 = this.f56994;
        interfaceC19776.mo29928(j);
        InterfaceC19775 interfaceC19777 = this.f56997;
        if (interfaceC19777 != null) {
            interfaceC19777.mo29928(j);
        }
        boolean zMo29933 = interfaceC19776.mo29933();
        SparseArray sparseArray = this.f56992;
        HashMap map = this.f56993;
        if (!zMo29933 && (interfaceC19775 = this.f56997) != null && interfaceC19775.mo29933()) {
            this.f56997.mo29930(map, sparseArray);
            interfaceC19776.mo29934(map);
        } else {
            interfaceC19776.mo29930(map, sparseArray);
        }
        InterfaceC19775 interfaceC19778 = this.f56997;
        if (interfaceC19778 != null) {
            interfaceC19778.delete();
            this.f56997 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43412() {
        this.f56994.mo29929(this.f56993);
        SparseBooleanArray sparseBooleanArray = this.f56996;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f56992.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f56995.clear();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C4352 m43410(String str) {
        HashMap map = this.f56993;
        C4352 c4352 = (C4352) map.get(str);
        if (c4352 != null) {
            return c4352;
        }
        SparseArray sparseArray = this.f56992;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C4352 c4353 = new C4352(iKeyAt, str, C9046.f24551);
        map.put(str, c4353);
        sparseArray.put(iKeyAt, str);
        this.f56995.put(iKeyAt, true);
        this.f56994.mo29931(c4353);
        return c4353;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C4352 m43407(String str) {
        return (C4352) this.f56993.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Collection m43406() {
        return C21562.unmodifiableCollection(this.f56993.values());
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m43405(int i) {
        return (String) this.f56992.get(i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m43413(String str) {
        HashMap map = this.f56993;
        C4352 c4352 = (C4352) map.get(str);
        if (c4352 != null && c4352.m8992() && c4352.m8994()) {
            map.remove(str);
            int i = c4352.f9744;
            SparseBooleanArray sparseBooleanArray = this.f56995;
            boolean z = sparseBooleanArray.get(i);
            this.f56994.mo29932(c4352, z);
            SparseArray sparseArray = this.f56992;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f56996.put(i, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m43411() {
        AbstractC21520 it = AbstractC8146.copyOf((Collection) this.f56993.keySet()).iterator();
        while (it.hasNext()) {
            m43413((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m43409(String str, C25139 c25139) {
        C4352 c4352M43410 = m43410(str);
        if (c4352M43410.m8989(c25139)) {
            this.f56994.mo29931(c4352M43410);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C9046 m43403(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(C20778.m46922(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = C5792.f14227;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new C9046(map);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m43404(C9046 c9046, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setM20951 = c9046.m20951();
        dataOutputStream.writeInt(setM20951.size());
        for (Map.Entry entry : setM20951) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }
}
