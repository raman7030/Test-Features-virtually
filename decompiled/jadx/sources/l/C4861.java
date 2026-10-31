package l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA04 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4861 extends AbstractC13306 implements InterfaceC6482 {

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC21795[] f15363;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public int f15364;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public byte[] f15365;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public int f15366;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public int[] f15367;

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ۧ */
    public final int mo6634(int i, byte[] bArr) {
        return 0;
    }

    public C4861(InterfaceC1023 interfaceC1023, int i) {
        super(interfaceC1023, 0);
        this.f15365 = new byte[16];
        this.f15364 = i;
        interfaceC1023.getClass();
        this.f15366 |= 1;
        C13722 c13722 = (C13722) interfaceC1023;
        Set setM48656 = EnumC21485.m48656(EnumC21485.m48654(EnumC21485.SMB202, c13722.m32981()), c13722.m32972());
        this.f15367 = new int[setM48656.size()];
        Iterator it = setM48656.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f15367[i2] = ((EnumC21485) it.next()).m48658();
            i2++;
        }
        if (c13722.m32972().m48659(EnumC21485.SMB210)) {
            byte[] bArrM32977 = c13722.m32977();
            byte[] bArr = this.f15365;
            System.arraycopy(bArrM32977, 0, bArr, 0, bArr.length);
        }
        LinkedList linkedList = new LinkedList();
        if (c13722.m32972() != null && c13722.m32972().m48659(EnumC21485.SMB311)) {
            byte[] bArr2 = new byte[32];
            c13722.m32991().nextBytes(bArr2);
            linkedList.add(new C20384(bArr2, new int[]{1}));
        }
        this.f15363 = (InterfaceC21795[]) linkedList.toArray(new InterfaceC21795[linkedList.size()]);
    }

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final int m14178() {
        return this.f15364;
    }

    @Override // l.InterfaceC6482
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean mo14179() {
        return (this.f15364 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public final int m14177() {
        return this.f15366;
    }

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public final int[] m14181() {
        return this.f15367;
    }

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m14180() {
        return this.f15365;
    }

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC21795[] m14176() {
        return this.f15363;
    }

    @Override // l.AbstractC13306
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC12601 mo6638(InterfaceC18663 interfaceC18663) {
        return new C3450(interfaceC18663.mo27540());
    }

    @Override // l.InterfaceC7578
    public final int size() {
        int length = this.f15367.length * 2;
        int i = length % 8;
        int i2 = i - 4;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = i + 4;
            }
            length = (length + 8) - i2;
        }
        int iM10428 = length + 100;
        InterfaceC21795[] interfaceC21795Arr = this.f15363;
        if (interfaceC21795Arr != null) {
            for (InterfaceC21795 interfaceC21795 : interfaceC21795Arr) {
                iM10428 += AbstractC3429.m10428(interfaceC21795.size()) + 8;
            }
        }
        return AbstractC3429.m10428(iM10428);
    }

    @Override // l.AbstractC3429
    /* JADX INFO: renamed from: ᩳ */
    public final int mo6639(int i, byte[] bArr) {
        C1480.m5122(36L, i, bArr);
        int[] iArr = this.f15367;
        C1480.m5122(iArr.length, i + 2, bArr);
        C1480.m5122(this.f15364, i + 4, bArr);
        C1480.m5122(0L, i + 6, bArr);
        C1480.m5124(this.f15366, i + 8, bArr);
        System.arraycopy(this.f15365, 0, bArr, i + 12, 16);
        int i2 = i + 28;
        InterfaceC21795[] interfaceC21795Arr = this.f15363;
        if (interfaceC21795Arr == null || interfaceC21795Arr.length == 0) {
            C1480.m5126(0L, i2, bArr);
            i2 = 0;
        } else {
            C1480.m5122(interfaceC21795Arr.length, i + 32, bArr);
            C1480.m5122(0L, i + 34, bArr);
        }
        int i3 = i + 36;
        for (int i4 : iArr) {
            C1480.m5122(i4, i3, bArr);
            i3 += 2;
        }
        int iM10468 = i3 + m10468(i3);
        if (interfaceC21795Arr != null && interfaceC21795Arr.length != 0) {
            C1480.m5124(iM10468 - m10453(), i2, bArr);
            for (InterfaceC21795 interfaceC21795 : interfaceC21795Arr) {
                C1480.m5122(interfaceC21795.mo36537(), iM10468, bArr);
                int i5 = iM10468 + 2;
                C1480.m5124(0L, iM10468 + 4, bArr);
                int i6 = iM10468 + 8;
                int iM10428 = AbstractC3429.m10428(interfaceC21795.mo9010(i6, bArr));
                C1480.m5122(iM10428, i5, bArr);
                iM10468 = i6 + iM10428;
            }
        }
        return iM10468 - i;
    }
}
