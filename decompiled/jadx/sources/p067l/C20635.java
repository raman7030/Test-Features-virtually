package p067l;

import android.util.SparseArray;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۘܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81EW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20635 extends AbstractC10576 {

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f63752;

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f63753;

    /* JADX INFO: renamed from: ᩻ */
    public String f63754;

    /* JADX INFO: renamed from: ۜ */
    public static final C2582 f63749 = new C2582(10000);

    /* JADX INFO: renamed from: ᩷ */
    public static final C2582 f63751 = new C2582(10000);

    /* JADX INFO: renamed from: ۢ */
    public static final C2582 f63750 = new C2582();

    @Override // p067l.AbstractC10576
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo5532() {
        return true;
    }

    /* JADX INFO: renamed from: ۖ */
    public static void m46636() {
        f63749.m3891();
        f63751.m3891();
    }

    public C20635() {
        ArrayList arrayList = (ArrayList) f63749.m3892();
        this.f63753 = arrayList == null ? new ArrayList(1) : arrayList;
        ArrayList arrayList2 = (ArrayList) f63751.m3892();
        this.f63752 = arrayList2 == null ? new ArrayList(1) : arrayList2;
    }

    @Override // p067l.AbstractC10576
    /* JADX INFO: renamed from: ֫ */
    public final void mo5531(C14677 c14677, SparseArray sparseArray) throws IOException {
        AbstractC10576 c3199;
        String str = (String) sparseArray.get(c14677.m33580());
        C12826.requireNonNull(str);
        this.f63754 = str;
        this.f29289 = c14677.m33580();
        this.f29287 = c14677.m33580();
        this.f29290 = c14677.m33580();
        this.f29288 = c14677.m33580();
        int iM33580 = c14677.m33580();
        int iM33581 = c14677.m33580();
        ArrayList arrayList = this.f63753;
        arrayList.clear();
        ArrayList arrayList2 = this.f63752;
        arrayList2.clear();
        arrayList.ensureCapacity(iM33580);
        for (int i = 0; i < iM33580; i++) {
            C19964 c19964 = new C19964();
            String str2 = (String) sparseArray.get(c14677.m33580());
            C12826.requireNonNull(str2);
            c19964.f60594 = str2;
            String str3 = (String) sparseArray.get(c14677.m33580());
            C12826.requireNonNull(str3);
            c19964.f60598 = str3;
            c19964.f60601 = c14677.m33580();
            c19964.f60597 = c14677.m33580();
            c19964.f60600 = c14677.m33580();
            c19964.f60599 = c14677.m33580();
            c19964.f60602 = c14677.m33580();
            c19964.f60603 = c14677.m33580();
            c19964.f60596 = c14677.m33580();
            c19964.f60595 = c14677.m33580();
            arrayList.add(c19964);
        }
        arrayList2.ensureCapacity(iM33581);
        for (int i2 = 0; i2 < iM33581; i2++) {
            int i3 = c14677.readByte() & 255;
            if (i3 == 15) {
                c3199 = new C20635();
            } else if (i3 == 240) {
                c3199 = new C3199();
            } else {
                throw new IOException();
            }
            c3199.mo5531(c14677, sparseArray);
            arrayList2.add(c3199);
        }
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m46643() {
        ArrayList arrayList = this.f63752;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC10576 abstractC10576 = (AbstractC10576) arrayList.get(i);
            if (abstractC10576.mo5532()) {
                abstractC10576.m24369().m46643();
            }
        }
        ArrayList arrayList2 = this.f63753;
        arrayList2.clear();
        f63749.m3890(arrayList2);
        arrayList.clear();
        f63751.m3890(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20635 m46634(String str, boolean z) {
        return m46633(new StringReader(str), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫ */
    public static C20635 m46633(Reader reader, boolean z) {
        C9196 c9196 = new C9196();
        c9196.m21166(reader);
        C7223 c7223M16562 = C7223.m16562(c9196, z);
        if (c7223M16562.isEmpty()) {
            return new C20635();
        }
        return (C20635) c7223M16562.get(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20635 m46635(C14677 c14677) throws IOException {
        SparseArray sparseArray = new SparseArray();
        if (c14677.m33587() == -2106358635) {
            C23395.m52060((InterfaceC21384) c14677, -2106358635);
            int iM33580 = c14677.m33580();
            for (int i = 0; i < iM33580; i++) {
                sparseArray.put(i, c14677.m33593());
            }
            C23395.m52060((InterfaceC21384) c14677, -2106358635);
        } else {
            C23395.m52060((InterfaceC21384) c14677, -2106358634);
            int iM33581 = c14677.m33580();
            for (int i2 = 0; i2 < iM33581; i2++) {
                sparseArray.put(i2, c14677.m33591());
            }
            C23395.m52060((InterfaceC21384) c14677, -2106358634);
        }
        C20635 c20635 = new C20635();
        byte b = c14677.readByte();
        if (b != 15) {
            throw new IOException(String.format("Expected: 0x%02x, got: 0x%02x", (byte) 15, Byte.valueOf(b)));
        }
        c20635.mo5531(c14677, sparseArray);
        return c20635;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46638(C11996 c11996) {
        HashMap map = new HashMap();
        C2582 c2582 = f63750;
        C11996 c11997 = (C11996) c2582.m3892();
        if (c11997 == null) {
            c11997 = new C11996();
        } else {
            c11997.m27460();
        }
        c11997.writeByte(15);
        mo5530(c11997, map);
        c11996.writeInt(-2106358634);
        c11996.m27461(map.size());
        int size = map.size();
        String[] strArr = new String[size];
        for (Map.Entry entry : map.entrySet()) {
            strArr[((Integer) entry.getValue()).intValue()] = (String) entry.getKey();
        }
        for (int i = 0; i < size; i++) {
            c11996.m27443((CharSequence) strArr[i]);
        }
        c11996.writeInt(-2106358634);
        c11996.write(c11997.m27458(), 0, c11997.size());
        c2582.m3890(c11997);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m46644() {
        return this.f63754;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList m46645() {
        return this.f63753;
    }

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList m46639() {
        return this.f63752;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Iterator m46631(C20635 c20635) {
        int i = 0;
        return C7480.stream(c20635.f63752).filter(new C17280(i)).map(new C4541(i)).iterator();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ Iterator m46632(C20635 c20635, final String str) {
        int i = 0;
        return C7480.stream(c20635.f63752).filter(new C17280(i)).map(new C4541(i)).filter(new Predicate() { // from class: l.ۘۘܽ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m13214or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C20635) obj).f63754.equals(str);
            }
        }).iterator();
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m46640() {
        ArrayList arrayList = this.f63752;
        return arrayList.isEmpty() || (arrayList.size() == 1 && !((AbstractC10576) arrayList.get(0)).mo5532());
    }

    /* JADX INFO: renamed from: ۢ */
    public final C3199 m46641() throws C3870 {
        ArrayList arrayList = this.f63752;
        if (arrayList.isEmpty()) {
            C3199 c3199 = new C3199();
            c3199.f6210 = "";
            c3199.f29289 = this.f29289;
            return c3199;
        }
        AbstractC10576 abstractC10576 = (AbstractC10576) arrayList.get(0);
        if (arrayList.size() != 1 || abstractC10576.mo5532()) {
            throw new C3870("Expected text", abstractC10576);
        }
        if (abstractC10576.mo5532()) {
            throw new UnsupportedOperationException();
        }
        return (C3199) abstractC10576;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C19964 m46637(String str) {
        ArrayList arrayList = this.f63753;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19964 c19964 = (C19964) arrayList.get(i);
            if (c19964.f60594.equals(str)) {
                return c19964;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19964 m46642(String str) throws C3870 {
        C19964 c19964M46637 = m46637(str);
        if (c19964M46637 != null) {
            return c19964M46637;
        }
        throw new C3870("Attribute required: ".concat(str), this);
    }

    public final String toString() {
        return "XmlNode{name='" + this.f63754 + "', line=" + this.f29289 + ", column=" + this.f29287 + ", startPosition=" + this.f29290 + ", endPosition=" + this.f29288 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C20635.class == obj.getClass()) {
            C20635 c20635 = (C20635) obj;
            if (!this.f63753.equals(c20635.f63753) || !this.f63752.equals(c20635.f63752)) {
                return false;
            }
            String str = this.f63754;
            String str2 = c20635.f63754;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f63752.hashCode() + (this.f63753.hashCode() * 31)) * 31;
        String str = this.f63754;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // p067l.AbstractC10576
    /* JADX INFO: renamed from: ֫ */
    public final void mo5530(C11996 c11996, HashMap map) {
        AbstractC10576.m24368(c11996, map, this.f63754);
        c11996.m27461(this.f29289);
        c11996.m27461(this.f29287);
        c11996.m27461(this.f29290);
        c11996.m27461(this.f29288);
        ArrayList arrayList = this.f63753;
        c11996.m27461(arrayList.size());
        ArrayList arrayList2 = this.f63752;
        c11996.m27461(arrayList2.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C19964 c19964 = (C19964) arrayList.get(i);
            AbstractC10576.m24368(c11996, map, c19964.f60594);
            AbstractC10576.m24368(c11996, map, c19964.f60598);
            c11996.m27461(c19964.f60601);
            c11996.m27461(c19964.f60597);
            c11996.m27461(c19964.f60600);
            c11996.m27461(c19964.f60599);
            c11996.m27461(c19964.f60602);
            c11996.m27461(c19964.f60603);
            c11996.m27461(c19964.f60596);
            c11996.m27461(c19964.f60595);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC10576 abstractC10576 = (AbstractC10576) arrayList2.get(i2);
            c11996.writeByte(abstractC10576.mo5532() ? 15 : 240);
            abstractC10576.mo5530(c11996, map);
        }
    }
}
