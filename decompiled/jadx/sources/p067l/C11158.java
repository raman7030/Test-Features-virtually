package p067l;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۢ֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9QE */
/* JADX INFO: loaded from: classes4.dex */
public final class C11158 implements InterfaceC10467 {

    /* JADX INFO: renamed from: ۙ */
    public static final C11158 f30968 = new C11158(new TreeMap());

    /* JADX INFO: renamed from: ᩶ */
    public static final C21887 f30969 = new C21887();

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f30970 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public final TreeMap f30971;

    @Override // p067l.InterfaceC17171, p067l.InterfaceC10029
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C11158(TreeMap treeMap, int i) {
        this(treeMap);
    }

    public C11158(TreeMap treeMap) {
        this.f30971 = treeMap;
    }

    @Override // p067l.InterfaceC10467
    public final InterfaceC11138 newBuilderForType() {
        return C15850.m35968();
    }

    @Override // p067l.InterfaceC10467
    public final InterfaceC11138 toBuilder() {
        C15850 c15850M35968 = C15850.m35968();
        c15850M35968.m35974(this);
        return c15850M35968;
    }

    /* JADX INFO: renamed from: ܽ */
    public static C11158 m25741() {
        return f30968;
    }

    @Override // p067l.InterfaceC17171, p067l.InterfaceC5773, p067l.InterfaceC10029
    public final InterfaceC10467 getDefaultInstanceForType() {
        return f30968;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11158) {
            return this.f30971.equals(((C11158) obj).f30971);
        }
        return false;
    }

    public final int hashCode() {
        TreeMap treeMap = this.f30971;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return treeMap.hashCode();
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m25742() {
        return (Map) this.f30971.clone();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m25745(int i) {
        return this.f30971.containsKey(Integer.valueOf(i));
    }

    @Override // p067l.InterfaceC10467
    public final void writeTo(AbstractC16402 abstractC16402) {
        for (Map.Entry entry : this.f30971.entrySet()) {
            ((C8475) entry.getValue()).m19730(((Integer) entry.getKey()).intValue(), abstractC16402);
        }
    }

    public final String toString() {
        int i = C13288.f37300;
        C11947.f33325.getClass();
        return C11947.m27344(this);
    }

    @Override // p067l.InterfaceC10467
    public final AbstractC7962 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC7962 abstractC7962 = AbstractC7962.f20935;
            C5280 c5280 = new C5280(serializedSize);
            writeTo(c5280.m11427());
            return c5280.m11426();
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a ByteString threw an IOException (should never happen).", e);
        }
    }

    @Override // p067l.InterfaceC10467
    public final byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            int i = AbstractC16402.f48200;
            C18414 c18414 = new C18414(bArr, serializedSize);
            writeTo(c18414);
            if (c18414.mo29874() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
        }
    }

    @Override // p067l.InterfaceC10467
    public final int getSerializedSize() {
        TreeMap treeMap = this.f30971;
        int iM19724 = 0;
        if (!treeMap.isEmpty()) {
            for (Map.Entry entry : treeMap.entrySet()) {
                iM19724 += ((C8475) entry.getValue()).m19724(((Integer) entry.getKey()).intValue());
            }
        }
        return iM19724;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25744(AbstractC16402 abstractC16402) {
        for (Map.Entry entry : this.f30971.entrySet()) {
            ((C8475) entry.getValue()).m19727(((Integer) entry.getKey()).intValue(), abstractC16402);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m25747(InterfaceC8672 interfaceC8672) {
        ((C25120) interfaceC8672).getClass();
        EnumC24765 enumC24765 = EnumC24765.ASCENDING;
        EnumC24765 enumC24766 = EnumC24765.DESCENDING;
        TreeMap treeMap = this.f30971;
        if (enumC24765 == enumC24766) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                ((C8475) entry.getValue()).m19726(((Integer) entry.getKey()).intValue(), interfaceC8672);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            ((C8475) entry2.getValue()).m19726(((Integer) entry2.getKey()).intValue(), interfaceC8672);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25743(InterfaceC8672 interfaceC8672) {
        ((C25120) interfaceC8672).getClass();
        EnumC24765 enumC24765 = EnumC24765.ASCENDING;
        EnumC24765 enumC24766 = EnumC24765.DESCENDING;
        TreeMap treeMap = this.f30971;
        if (enumC24765 == enumC24766) {
            for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
                C8475.m19714((C8475) entry.getValue(), ((Integer) entry.getKey()).intValue(), interfaceC8672);
            }
            return;
        }
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C8475.m19714((C8475) entry2.getValue(), ((Integer) entry2.getKey()).intValue(), interfaceC8672);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m25746() {
        int iM19728 = 0;
        for (Map.Entry entry : this.f30971.entrySet()) {
            iM19728 += ((C8475) entry.getValue()).m19728(((Integer) entry.getKey()).intValue());
        }
        return iM19728;
    }

    @Override // p067l.InterfaceC10467
    public final InterfaceC13820 getParserForType() {
        return f30969;
    }
}
