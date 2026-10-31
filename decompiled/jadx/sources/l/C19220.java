package l;

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
public final class C19220 extends AbstractC8636 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60521;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f60522;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f60523;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C0225 f60518 = new C0225(10000);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C0225 f60520 = new C0225(10000);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C0225 f60519 = new C0225();

    @Override // l.AbstractC8636
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo3218() {
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m44342() {
        f60518.m1478();
        f60520.m1478();
    }

    public C19220() {
        ArrayList arrayList = (ArrayList) f60518.m1479();
        this.f60522 = arrayList == null ? new ArrayList(1) : arrayList;
        ArrayList arrayList2 = (ArrayList) f60520.m1479();
        this.f60521 = arrayList2 == null ? new ArrayList(1) : arrayList2;
    }

    @Override // l.AbstractC8636
    /* JADX INFO: renamed from: ֫ */
    public final void mo3217(C12951 c12951, SparseArray sparseArray) throws IOException {
        AbstractC8636 c0874;
        String str = (String) sparseArray.get(c12951.m31493());
        C11003.requireNonNull(str);
        this.f60523 = str;
        this.f26371 = c12951.m31493();
        this.f26369 = c12951.m31493();
        this.f26372 = c12951.m31493();
        this.f26370 = c12951.m31493();
        int iM31493 = c12951.m31493();
        int iM31494 = c12951.m31493();
        ArrayList arrayList = this.f60522;
        arrayList.clear();
        ArrayList arrayList2 = this.f60521;
        arrayList2.clear();
        arrayList.ensureCapacity(iM31493);
        for (int i = 0; i < iM31493; i++) {
            C18514 c18514 = new C18514();
            String str2 = (String) sparseArray.get(c12951.m31493());
            C11003.requireNonNull(str2);
            c18514.f57373 = str2;
            String str3 = (String) sparseArray.get(c12951.m31493());
            C11003.requireNonNull(str3);
            c18514.f57377 = str3;
            c18514.f57380 = c12951.m31493();
            c18514.f57376 = c12951.m31493();
            c18514.f57379 = c12951.m31493();
            c18514.f57378 = c12951.m31493();
            c18514.f57381 = c12951.m31493();
            c18514.f57382 = c12951.m31493();
            c18514.f57375 = c12951.m31493();
            c18514.f57374 = c12951.m31493();
            arrayList.add(c18514);
        }
        arrayList2.ensureCapacity(iM31494);
        for (int i2 = 0; i2 < iM31494; i2++) {
            int i3 = c12951.readByte() & 255;
            if (i3 == 15) {
                c0874 = new C19220();
            } else if (i3 == 240) {
                c0874 = new C0874();
            } else {
                throw new IOException();
            }
            c0874.mo3217(c12951, sparseArray);
            arrayList2.add(c0874);
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final void m44349() {
        ArrayList arrayList = this.f60521;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC8636 abstractC8636 = (AbstractC8636) arrayList.get(i);
            if (abstractC8636.mo3218()) {
                abstractC8636.m22400().m44349();
            }
        }
        ArrayList arrayList2 = this.f60522;
        arrayList2.clear();
        f60518.m1477(arrayList2);
        arrayList.clear();
        f60520.m1477(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19220 m44340(String str, boolean z) {
        return m44339(new StringReader(str), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19220 m44339(Reader reader, boolean z) {
        C7184 c7184 = new C7184();
        c7184.m19219(reader);
        C5108 c5108M14654 = C5108.m14654(c7184, z);
        if (c5108M14654.isEmpty()) {
            return new C19220();
        }
        return (C19220) c5108M14654.get(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19220 m44341(C12951 c12951) throws IOException {
        SparseArray sparseArray = new SparseArray();
        if (c12951.m31500() == -2106358635) {
            C22124.m49722((InterfaceC20008) c12951, -2106358635);
            int iM31493 = c12951.m31493();
            for (int i = 0; i < iM31493; i++) {
                sparseArray.put(i, c12951.m31506());
            }
            C22124.m49722((InterfaceC20008) c12951, -2106358635);
        } else {
            C22124.m49722((InterfaceC20008) c12951, -2106358634);
            int iM31494 = c12951.m31493();
            for (int i2 = 0; i2 < iM31494; i2++) {
                sparseArray.put(i2, c12951.m31504());
            }
            C22124.m49722((InterfaceC20008) c12951, -2106358634);
        }
        C19220 c19220 = new C19220();
        byte b = c12951.readByte();
        if (b != 15) {
            throw new IOException(String.format("Expected: 0x%02x, got: 0x%02x", (byte) 15, Byte.valueOf(b)));
        }
        c19220.mo3217(c12951, sparseArray);
        return c19220;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44344(C10130 c10130) {
        HashMap map = new HashMap();
        C0225 c0225 = f60519;
        C10130 c10131 = (C10130) c0225.m1479();
        if (c10131 == null) {
            c10131 = new C10130();
        } else {
            c10131.m25440();
        }
        c10131.writeByte(15);
        mo3216(c10131, map);
        c10130.writeInt(-2106358634);
        c10130.m25441(map.size());
        int size = map.size();
        String[] strArr = new String[size];
        for (Map.Entry entry : map.entrySet()) {
            strArr[((Integer) entry.getValue()).intValue()] = (String) entry.getKey();
        }
        for (int i = 0; i < size; i++) {
            c10130.m25423((CharSequence) strArr[i]);
        }
        c10130.writeInt(-2106358634);
        c10130.write(c10131.m25438(), 0, c10131.size());
        c0225.m1477(c10131);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m44350() {
        return this.f60523;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList m44351() {
        return this.f60522;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList m44345() {
        return this.f60521;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Iterator m44337(C19220 c19220) {
        int i = 0;
        return C5378.stream(c19220.f60521).filter(new C15690(i)).map(new C2286(i)).iterator();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Iterator m44338(C19220 c19220, final String str) {
        int i = 0;
        return C5378.stream(c19220.f60521).filter(new C15690(i)).map(new C2286(i)).filter(new Predicate() { // from class: l.ۘۘܽ
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C19285.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo4928negate() {
                return C19285.$default$negate(this);
            }

            public /* synthetic */ Predicate or(Predicate predicate) {
                return C19285.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((C19220) obj).f60523.equals(str);
            }
        }).iterator();
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m44346() {
        ArrayList arrayList = this.f60521;
        return arrayList.isEmpty() || (arrayList.size() == 1 && !((AbstractC8636) arrayList.get(0)).mo3218());
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C0874 m44347() throws C1580 {
        ArrayList arrayList = this.f60521;
        if (arrayList.isEmpty()) {
            C0874 c0874 = new C0874();
            c0874.f3437 = "";
            c0874.f26371 = this.f26371;
            return c0874;
        }
        AbstractC8636 abstractC8636 = (AbstractC8636) arrayList.get(0);
        if (arrayList.size() != 1 || abstractC8636.mo3218()) {
            throw new C1580("Expected text", abstractC8636);
        }
        if (abstractC8636.mo3218()) {
            throw new UnsupportedOperationException();
        }
        return (C0874) abstractC8636;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C18514 m44343(String str) {
        ArrayList arrayList = this.f60522;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C18514 c18514 = (C18514) arrayList.get(i);
            if (c18514.f57373.equals(str)) {
                return c18514;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18514 m44348(String str) throws C1580 {
        C18514 c18514M44343 = m44343(str);
        if (c18514M44343 != null) {
            return c18514M44343;
        }
        throw new C1580("Attribute required: ".concat(str), this);
    }

    public final String toString() {
        return "XmlNode{name='" + this.f60523 + "', line=" + this.f26371 + ", column=" + this.f26369 + ", startPosition=" + this.f26372 + ", endPosition=" + this.f26370 + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C19220.class == obj.getClass()) {
            C19220 c19220 = (C19220) obj;
            if (!this.f60522.equals(c19220.f60522) || !this.f60521.equals(c19220.f60521)) {
                return false;
            }
            String str = this.f60523;
            String str2 = c19220.f60523;
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
        int iHashCode = (this.f60521.hashCode() + (this.f60522.hashCode() * 31)) * 31;
        String str = this.f60523;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // l.AbstractC8636
    /* JADX INFO: renamed from: ֫ */
    public final void mo3216(C10130 c10130, HashMap map) {
        AbstractC8636.m22399(c10130, map, this.f60523);
        c10130.m25441(this.f26371);
        c10130.m25441(this.f26369);
        c10130.m25441(this.f26372);
        c10130.m25441(this.f26370);
        ArrayList arrayList = this.f60522;
        c10130.m25441(arrayList.size());
        ArrayList arrayList2 = this.f60521;
        c10130.m25441(arrayList2.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C18514 c18514 = (C18514) arrayList.get(i);
            AbstractC8636.m22399(c10130, map, c18514.f57373);
            AbstractC8636.m22399(c10130, map, c18514.f57377);
            c10130.m25441(c18514.f57380);
            c10130.m25441(c18514.f57376);
            c10130.m25441(c18514.f57379);
            c10130.m25441(c18514.f57378);
            c10130.m25441(c18514.f57381);
            c10130.m25441(c18514.f57382);
            c10130.m25441(c18514.f57375);
            c10130.m25441(c18514.f57374);
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC8636 abstractC8636 = (AbstractC8636) arrayList2.get(i2);
            c10130.writeByte(abstractC8636.mo3218() ? 15 : 240);
            abstractC8636.mo3216(c10130, map);
        }
    }
}
