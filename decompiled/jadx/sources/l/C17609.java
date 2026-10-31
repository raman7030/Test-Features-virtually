package l;

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
public final class C17609 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18315 f53800;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public InterfaceC18315 f53803;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f53799 = new HashMap();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final SparseArray f53798 = new SparseArray();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f53802 = new SparseBooleanArray();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final SparseBooleanArray f53801 = new SparseBooleanArray();

    public C17609(C20744 c20744, File file) {
        C11260 c11260 = new C11260(c20744);
        C16903 c16903 = new C16903(new File(file, "cached_content_index.exi"));
        this.f53800 = c11260;
        this.f53803 = c16903;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41162(long j) {
        InterfaceC18315 interfaceC18315;
        InterfaceC18315 interfaceC18316 = this.f53800;
        interfaceC18316.mo27867(j);
        InterfaceC18315 interfaceC18317 = this.f53803;
        if (interfaceC18317 != null) {
            interfaceC18317.mo27867(j);
        }
        boolean zMo27872 = interfaceC18316.mo27872();
        SparseArray sparseArray = this.f53798;
        HashMap map = this.f53799;
        if (!zMo27872 && (interfaceC18315 = this.f53803) != null && interfaceC18315.mo27872()) {
            this.f53803.mo27869(map, sparseArray);
            interfaceC18316.mo27873(map);
        } else {
            interfaceC18316.mo27869(map, sparseArray);
        }
        InterfaceC18315 interfaceC18318 = this.f53803;
        if (interfaceC18318 != null) {
            interfaceC18318.delete();
            this.f53803 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41166() {
        this.f53800.mo27868(this.f53799);
        SparseBooleanArray sparseBooleanArray = this.f53802;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            this.f53798.remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        this.f53801.clear();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C2087 m41164(String str) {
        HashMap map = this.f53799;
        C2087 c2087 = (C2087) map.get(str);
        if (c2087 != null) {
            return c2087;
        }
        SparseArray sparseArray = this.f53798;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        C2087 c2088 = new C2087(iKeyAt, str, C7026.f21670);
        map.put(str, c2088);
        sparseArray.put(iKeyAt, str);
        this.f53801.put(iKeyAt, true);
        this.f53800.mo27870(c2088);
        return c2088;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C2087 m41161(String str) {
        return (C2087) this.f53799.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Collection m41160() {
        return C20195.unmodifiableCollection(this.f53799.values());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m41159(int i) {
        return (String) this.f53798.get(i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m41167(String str) {
        HashMap map = this.f53799;
        C2087 c2087 = (C2087) map.get(str);
        if (c2087 != null && c2087.m6866() && c2087.m6868()) {
            map.remove(str);
            int i = c2087.f6960;
            SparseBooleanArray sparseBooleanArray = this.f53801;
            boolean z = sparseBooleanArray.get(i);
            this.f53800.mo27871(c2087, z);
            SparseArray sparseArray = this.f53798;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                this.f53802.put(i, true);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m41165() {
        AbstractC20151 it = AbstractC6079.copyOf((Collection) this.f53799.keySet()).iterator();
        while (it.hasNext()) {
            m41167((String) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41163(String str, C23959 c23959) {
        C2087 c2087M41164 = m41164(str);
        if (c2087M41164.m6863(c23959)) {
            this.f53800.mo27870(c2087M41164);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C7026 m41157(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                throw new IOException(C19370.m44628(i3, "Invalid value size: "));
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = C3603.f11423;
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
        return new C7026(map);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m41158(C7026 c7026, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setM18994 = c7026.m18994();
        dataOutputStream.writeInt(setM18994.size());
        for (Map.Entry entry : setM18994) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }
}
