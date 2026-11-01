package p067l;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: renamed from: l.ۙ᩵᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: FA04 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6989 extends AbstractC15015 implements InterfaceC8529 {

    /* JADX INFO: renamed from: ۖ֫ */
    public InterfaceC23083[] f18194;

    /* JADX INFO: renamed from: ۘ֫ */
    public int f18195;

    /* JADX INFO: renamed from: ۡ֫ */
    public byte[] f18196;

    /* JADX INFO: renamed from: ۢ֫ */
    public int f18197;

    /* JADX INFO: renamed from: ܺ֫ */
    public int[] f18198;

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ۧ */
    public final int mo8760(int i, byte[] bArr) {
        return 0;
    }

    public C6989(InterfaceC3341 interfaceC3341, int i) {
        super(interfaceC3341, 0);
        this.f18196 = new byte[16];
        this.f18195 = i;
        interfaceC3341.getClass();
        this.f18197 |= 1;
        C15410 c15410 = (C15410) interfaceC3341;
        Set setM50993 = EnumC22788.m50993(EnumC22788.m50991(EnumC22788.SMB202, c15410.m35095()), c15410.m35086());
        this.f18198 = new int[setM50993.size()];
        Iterator it = setM50993.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            this.f18198[i2] = ((EnumC22788) it.next()).m50995();
            i2++;
        }
        if (c15410.m35086().m50996(EnumC22788.SMB210)) {
            byte[] bArrM35091 = c15410.m35091();
            byte[] bArr = this.f18196;
            System.arraycopy(bArrM35091, 0, bArr, 0, bArr.length);
        }
        LinkedList linkedList = new LinkedList();
        if (c15410.m35086() != null && c15410.m35086().m50996(EnumC22788.SMB311)) {
            byte[] bArr2 = new byte[32];
            c15410.m35105().nextBytes(bArr2);
            linkedList.add(new C21742(bArr2, new int[]{1}));
        }
        this.f18194 = (InterfaceC23083[]) linkedList.toArray(new InterfaceC23083[linkedList.size()]);
    }

    /* JADX INFO: renamed from: ۚ֫ */
    public final int m16059() {
        return this.f18195;
    }

    @Override // p067l.InterfaceC8529
    /* JADX INFO: renamed from: ۠ */
    public final boolean mo16060() {
        return (this.f18195 & 2) != 0;
    }

    /* JADX INFO: renamed from: ۘ֫ */
    public final int m16058() {
        return this.f18197;
    }

    /* JADX INFO: renamed from: ᩵֫ */
    public final int[] m16062() {
        return this.f18198;
    }

    /* JADX INFO: renamed from: ᩴ֫ */
    public final byte[] m16061() {
        return this.f18196;
    }

    /* JADX INFO: renamed from: ֡֫ */
    public final InterfaceC23083[] m16057() {
        return this.f18194;
    }

    @Override // p067l.AbstractC15015
    /* JADX INFO: renamed from: ܽ */
    public final AbstractC14345 mo8764(InterfaceC20106 interfaceC20106) {
        return new C5648(interfaceC20106.mo29602());
    }

    @Override // p067l.InterfaceC9571
    public final int size() {
        int length = this.f18198.length * 2;
        int i = length % 8;
        int i2 = i - 4;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 = i + 4;
            }
            length = (length + 8) - i2;
        }
        int iM12467 = length + 100;
        InterfaceC23083[] interfaceC23083Arr = this.f18194;
        if (interfaceC23083Arr != null) {
            for (InterfaceC23083 interfaceC23083 : interfaceC23083Arr) {
                iM12467 += AbstractC5628.m12467(interfaceC23083.size()) + 8;
            }
        }
        return AbstractC5628.m12467(iM12467);
    }

    @Override // p067l.AbstractC5628
    /* JADX INFO: renamed from: ᩳ */
    public final int mo8765(int i, byte[] bArr) {
        C3775.m7364(36L, i, bArr);
        int[] iArr = this.f18198;
        C3775.m7364(iArr.length, i + 2, bArr);
        C3775.m7364(this.f18195, i + 4, bArr);
        C3775.m7364(0L, i + 6, bArr);
        C3775.m7366(this.f18197, i + 8, bArr);
        System.arraycopy(this.f18196, 0, bArr, i + 12, 16);
        int i2 = i + 28;
        InterfaceC23083[] interfaceC23083Arr = this.f18194;
        if (interfaceC23083Arr == null || interfaceC23083Arr.length == 0) {
            C3775.m7368(0L, i2, bArr);
            i2 = 0;
        } else {
            C3775.m7364(interfaceC23083Arr.length, i + 32, bArr);
            C3775.m7364(0L, i + 34, bArr);
        }
        int i3 = i + 36;
        for (int i4 : iArr) {
            C3775.m7364(i4, i3, bArr);
            i3 += 2;
        }
        int iM12507 = i3 + m12507(i3);
        if (interfaceC23083Arr != null && interfaceC23083Arr.length != 0) {
            C3775.m7366(iM12507 - m12492(), i2, bArr);
            for (InterfaceC23083 interfaceC23083 : interfaceC23083Arr) {
                C3775.m7364(interfaceC23083.mo38695(), iM12507, bArr);
                int i5 = iM12507 + 2;
                C3775.m7366(0L, iM12507 + 4, bArr);
                int i6 = iM12507 + 8;
                int iM12467 = AbstractC5628.m12467(interfaceC23083.mo11078(i6, bArr));
                C3775.m7364(iM12467, i5, bArr);
                iM12507 = i6 + iM12467;
            }
        }
        return iM12507 - i;
    }
}
