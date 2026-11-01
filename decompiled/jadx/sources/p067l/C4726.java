package p067l;

import com.alipay.sdk.p010m.p058y.C0249l;
import com.tencent.p062mm.opensdk.modelmsg.WXMediaMessage;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import org.bouncycastle.crypto.engines.ThreefishEngine;

/* JADX INFO: renamed from: l.ۖۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: P7DJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4726 extends AbstractC13599 {

    /* JADX INFO: renamed from: ֡ۧ */
    public int f10696;

    /* JADX INFO: renamed from: ֨ۧ */
    public C8254 f10697;

    /* JADX INFO: renamed from: ۖۧ */
    public ArrayList f10698;

    /* JADX INFO: renamed from: ۘۧ */
    public C9419 f10699;

    /* JADX INFO: renamed from: ۚۧ */
    public int f10700;

    /* JADX INFO: renamed from: ۜۧ */
    public ArrayList f10701;

    /* JADX INFO: renamed from: ۠ۧ */
    public ArrayList f10702;

    /* JADX INFO: renamed from: ۡۧ */
    public final HashMap f10703;

    /* JADX INFO: renamed from: ۢۧ */
    public boolean f10704;

    /* JADX INFO: renamed from: ܶۧ */
    public ArrayList f10705;

    /* JADX INFO: renamed from: ܺۧ */
    public int f10706;

    /* JADX INFO: renamed from: ᩴۧ */
    public C9419 f10707;

    /* JADX INFO: renamed from: ᩵ۧ */
    public C9419 f10708;

    /* JADX INFO: renamed from: ᩷ۧ */
    public byte[] f10709;

    /* JADX INFO: renamed from: ᩻ۧ */
    public int f10710;

    @Override // p067l.AbstractC13599
    /* JADX INFO: renamed from: ֫ */
    public final void mo10015(List... listArr) {
        throw null;
    }

    public C4726(C19003 c19003) {
        super(c19003);
        this.f10703 = new HashMap();
        this.f10701 = new ArrayList(0);
        this.f10702 = new ArrayList(0);
        this.f10704 = true;
        if (c19003.f32284) {
            this.f10706 = 7;
            this.f10710 = 7;
        } else {
            this.f10706 = 7;
            this.f10710 = 7 - m26683();
        }
    }

    /* JADX INFO: renamed from: ۚ */
    private int m10008(int i) {
        if (i >= 0) {
            byte[] bArr = this.f10709;
            if (i < bArr.length) {
                return bArr[i];
            }
        }
        throw new IndexOutOfBoundsException(this.f38257.m48081("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ۠ */
    private int m10009(int i) {
        if (i >= 0) {
            byte[] bArr = this.f10709;
            if (i < bArr.length) {
                return bArr[i] & 255;
            }
        }
        throw new IndexOutOfBoundsException(this.f38257.m48081("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ֨ */
    private int m10006(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f10709;
            if (i2 < bArr.length) {
                return (bArr[i] << 8) | (bArr[i2] & 255);
            }
        }
        throw new IndexOutOfBoundsException(this.f38257.m48081("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    /* JADX INFO: renamed from: ܶ */
    private int m10011(int i) {
        if (i >= 0) {
            int i2 = i + 1;
            byte[] bArr = this.f10709;
            if (i2 < bArr.length) {
                return ((bArr[i] << 8) | (bArr[i2] & 255)) & 65535;
            }
        }
        throw new IndexOutOfBoundsException(this.f38257.m48081("The index {0} is out of range for the code array of the method.", Integer.valueOf(i)));
    }

    private int getInt(int i) {
        return (m10006(i + 2) & 65535) | (m10006(i) << 16);
    }

    /* JADX INFO: renamed from: ۡ */
    public final C20305 m10016(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f10703;
        C20305 c20305 = (C20305) map.get(numValueOf);
        if (c20305 != null) {
            return c20305;
        }
        C19003 c19003 = (C19003) this.f38259;
        C20305 c20306 = new C20305(c19003);
        c20306.f62725 = (short) 0;
        c20306.f62726 = false;
        c20306.f62728 = (C22161) c19003.f38259;
        c20306.m26661(this);
        c20306.m26678(1);
        map.put(numValueOf, c20306);
        return c20306;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10014(int i, DataInputStream dataInputStream) {
        C14959 c14959;
        boolean z;
        C9419 c9419;
        this.f10700 = dataInputStream.readUnsignedShort();
        this.f10696 = dataInputStream.readUnsignedShort();
        int i2 = dataInputStream.readInt();
        int i3 = 2;
        this.f38257.m48090("CodeAttr:  CodeLength=%d FullLength=%d max_stack=%d max_locals=%d", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.f10700), Integer.valueOf(this.f10696));
        byte[] bArr = new byte[i2];
        this.f10709 = bArr;
        dataInputStream.read(bArr, 0, i2);
        int unsignedShort = dataInputStream.readUnsignedShort();
        this.f38257.m48090("CodeAttr:  TrapTable[%d]", Integer.valueOf(unsignedShort));
        this.f10702 = new ArrayList(unsignedShort);
        for (int i4 = 0; i4 < unsignedShort; i4++) {
            ArrayList arrayList = this.f10702;
            C24347 c24347 = new C24347();
            c24347.f77118 = i4;
            c24347.f77117 = dataInputStream.readUnsignedShort();
            c24347.f77115 = dataInputStream.readUnsignedShort();
            c24347.f77116 = dataInputStream.readUnsignedShort();
            c24347.f77114 = dataInputStream.readUnsignedShort();
            arrayList.add(c24347);
        }
        int unsignedShort2 = dataInputStream.readUnsignedShort();
        this.f38257.m48090("CodeAttr: add.attr: %d", Integer.valueOf(unsignedShort2));
        int i5 = 0;
        while (i5 < unsignedShort2) {
            int unsignedShort3 = dataInputStream.readUnsignedShort();
            AbstractC5396 abstractC5396M27975 = this.f38266.m27975(unsignedShort3);
            if (abstractC5396M27975 != null && abstractC5396M27975.f12856 == EnumC14113.CONSTANT_UTF8) {
                String strM27987 = this.f38266.m27987(unsignedShort3, new C8466(7));
                this.f38257.m48090(C21466.m48631("CodeAttr:  attr: ", strM27987), new Object[0]);
                final EnumC6799 enumC6799M15517 = EnumC6799.m15517(strM27987);
                switch (C17465.f52211[enumC6799M15517.ordinal()]) {
                    case 1:
                    case 2:
                        final int i6 = dataInputStream.readInt();
                        final int unsignedShort4 = dataInputStream.readUnsignedShort();
                        this.f10697 = new C8254(enumC6799M15517, this, unsignedShort4);
                        this.f10704 = true;
                        this.f38257.m48074(new Supplier() { // from class: l.ۡۧ֨
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return String.format("CodeAttr:  %s: attrLength=%d num=%d", enumC6799M15517.name(), Integer.valueOf(i6), Integer.valueOf(unsignedShort4));
                            }
                        });
                        int i7 = 0;
                        int i8 = 0;
                        boolean z2 = false;
                        int i9 = 0;
                        while (i7 < unsignedShort4) {
                            int i10 = C17465.f52211[enumC6799M15517.ordinal()];
                            if (i10 == 1) {
                                c14959 = new C14959(this, dataInputStream);
                            } else {
                                if (i10 != i3) {
                                    throw new IllegalStateException("Unexpected value: " + enumC6799M15517);
                                }
                                if (!this.f10704) {
                                    z = false;
                                } else if (i7 == 0 || ((Boolean) this.f10697.f21858.get(i7 - 1)).booleanValue()) {
                                    z = true;
                                } else {
                                    this.f10704 = false;
                                    z = false;
                                }
                                c14959 = new C14959(z, i8, this, dataInputStream);
                            }
                            if (c14959.f42736 == EnumC24233.EARLY_LARVAL) {
                                c14959.f42731 = z2;
                                c14959.f42739 = i9;
                                this.f10697.m19045(c14959, true);
                                i9++;
                                z2 = true;
                            } else {
                                c14959.f42731 = z2;
                                c14959.f42739 = i9;
                                this.f10697.m19045(c14959, false);
                                i7++;
                                z2 = false;
                                i9 = 0;
                            }
                            i8 = c14959.f42737;
                            i3 = 2;
                        }
                        break;
                    case 3:
                        int i11 = dataInputStream.readInt();
                        int unsignedShort5 = dataInputStream.readUnsignedShort();
                        boolean z3 = this.f32295;
                        c9419 = z3 ? new C9419(this, C3540.class, unsignedShort5) : null;
                        AbstractC21279 abstractC21279 = this.f38257;
                        Integer numValueOf = Integer.valueOf(unsignedShort5);
                        Integer numValueOf2 = Integer.valueOf(i11);
                        Object[] objArr = new Object[i3];
                        objArr[0] = numValueOf;
                        objArr[1] = numValueOf2;
                        abstractC21279.m48090("CodeAttr:  LineNumberTable[%d] length=%d", objArr);
                        for (int i12 = 0; i12 < unsignedShort5; i12++) {
                            C19003 c19003 = (C19003) this.f38259;
                            C3540 c3540 = new C3540();
                            c3540.f7176 = dataInputStream.readShort();
                            c3540.f7174 = dataInputStream.readShort();
                            c3540.f32274 = c19003.f32274;
                            c3540.f7175 = C19768.m44906(c19003.f32284 ? 11 : 9, "%", "s %4d:  %7d");
                            if (z3) {
                                c9419.m21916(c3540);
                            }
                        }
                        this.f10699 = c9419;
                        break;
                    case 4:
                        int i13 = dataInputStream.readInt();
                        int unsignedShort6 = dataInputStream.readUnsignedShort();
                        boolean z4 = this.f32299;
                        c9419 = z4 ? new C9419(this, C22987.class, unsignedShort6) : null;
                        AbstractC21279 abstractC212710 = this.f38257;
                        Integer numValueOf3 = Integer.valueOf(unsignedShort6);
                        Integer numValueOf4 = Integer.valueOf(i13);
                        Object[] objArr2 = new Object[i3];
                        objArr2[0] = numValueOf3;
                        objArr2[1] = numValueOf4;
                        abstractC212710.m48090("CodeAttr:  LocalVariableTable[%d] length=%d", objArr2);
                        for (int i14 = 0; i14 < unsignedShort6; i14++) {
                            C22987 c22987 = new C22987(dataInputStream, (C19003) this.f38259, EnumC16818.f49607.m38127());
                            if (z4) {
                                c9419.m21916(c22987);
                            }
                        }
                        this.f10707 = c9419;
                        break;
                    case 5:
                        int i15 = dataInputStream.readInt();
                        int unsignedShort7 = dataInputStream.readUnsignedShort();
                        boolean z5 = this.f32281;
                        c9419 = z5 ? new C9419(this, C23657.class, unsignedShort7) : null;
                        AbstractC21279 abstractC212711 = this.f38257;
                        Integer numValueOf5 = Integer.valueOf(unsignedShort7);
                        Integer numValueOf6 = Integer.valueOf(i15);
                        Object[] objArr3 = new Object[i3];
                        objArr3[0] = numValueOf5;
                        objArr3[1] = numValueOf6;
                        abstractC212711.m48090("CodeAttr:  LocalVariableTypeTable[%d] length=%d", objArr3);
                        for (int i16 = 0; i16 < unsignedShort7; i16++) {
                            C23657 c23657 = new C23657(dataInputStream, (C19003) this.f38259, EnumC16818.f49655.m38127());
                            if (z5) {
                                c9419.m21916(c23657);
                            }
                        }
                        this.f10708 = c9419;
                        break;
                    case 6:
                    case 7:
                        boolean z6 = enumC6799M15517 == EnumC6799.f17646;
                        int i17 = dataInputStream.readInt();
                        short s = dataInputStream.readShort();
                        ArrayList arrayList2 = new ArrayList(s);
                        AbstractC21279 abstractC212712 = this.f38257;
                        String str = z6 ? "Inv" : "V";
                        Integer numValueOf7 = Integer.valueOf(i17);
                        Integer numValueOf8 = Integer.valueOf(s);
                        Object[] objArr4 = new Object[3];
                        objArr4[0] = str;
                        objArr4[1] = numValueOf7;
                        objArr4[i3] = numValueOf8;
                        abstractC212712.m48090("CodeAttr:   Runtime%sisibleTypeAnnotation: attrLength=%d num= %d", objArr4);
                        for (int i18 = 0; i18 < s; i18++) {
                            C9595 c9595 = new C9595((C19003) this.f38259, z6);
                            c9595.mo19750(dataInputStream);
                            arrayList2.add(c9595);
                        }
                        if (z6) {
                            this.f10698 = arrayList2;
                        } else {
                            this.f10705 = arrayList2;
                        }
                        break;
                    default:
                        C22576 c22576 = new C22576(this.f38257, enumC6799M15517);
                        c22576.m50604(unsignedShort3, dataInputStream.readInt(), dataInputStream);
                        this.f10701.add(c22576);
                        break;
                }
            }
            i5++;
            i3 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0724  */
    /* JADX WARN: Code duplicated, block: B:225:0x0846  */
    /* JADX WARN: Code duplicated, block: B:226:0x086b  */
    /* JADX WARN: Instruction removed from duplicated block: B:189:0x0724, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0846, please report this as an issue */
    /* JADX INFO: renamed from: ᩻ */
    private int m10013(int i, int i2) {
        int iM10011;
        boolean z;
        int i3;
        String str;
        String str2;
        String str3;
        boolean z2;
        String str4;
        String str5;
        boolean z3;
        int iM10009 = m10009(i);
        EnumC17134 enumC17134M52911 = C23841.m52911(Integer.valueOf(iM10009));
        boolean z4 = this.f32293;
        if (enumC17134M52911 == null) {
            this.f32274.mo4344(m26671(18, "bytecode"));
            StringBuilder sb = new StringBuilder();
            sb.append(z4 ? C24630.m54287(iM10009) : Integer.valueOf(iM10009));
            sb.append(C0249l.f1196b);
            m26676(sb.toString());
            return 1;
        }
        int[] iArr = C17465.f52212;
        switch (iArr[enumC17134M52911.ordinal()]) {
            case 23:
                ArrayList arrayListM10012 = m10012(i, 1);
                if (arrayListM10012.size() != 1) {
                    m10007(enumC17134M52911.m38774(), arrayListM10012, i2);
                    return 1;
                }
                EnumC17134 enumC17134M52912 = C23841.m52911(Integer.valueOf((iM10009 << 8) + m10009(i + 1)));
                if (enumC17134M52912 == null) {
                    this.f32274.mo4344(m26671(18, EnumC17134.f50602.m38779()));
                    m26676(enumC17134M52911.m38777() + C0249l.f1196b);
                    return 1;
                }
                String strM38779 = enumC17134M52912.m38779();
                if (enumC17134M52912 == EnumC17134.f50696) {
                    ArrayList arrayListM10013 = m10012(i, 5);
                    if (arrayListM10013.size() != 5) {
                        m10007(enumC17134M52911.m38774(), arrayListM10013, i2);
                        return 6;
                    }
                    m26668(m26671(18, strM38779));
                    m26680("%d, %d;", Integer.valueOf(m10011(i + 2)), Integer.valueOf(m10011(i + 4)));
                    return 6;
                }
                ArrayList arrayListM10014 = m10012(i, 3);
                if (arrayListM10014.size() != 3) {
                    m10007(enumC17134M52911.m38774(), arrayListM10014, i2);
                    return 4;
                }
                this.f32274.mo4344(m26671(18, strM38779));
                m26680("%d;", Integer.valueOf(m10011(i + 2)));
                return 4;
            case 24:
            case 25:
                ArrayList arrayListM10015 = m10012(i, 1);
                if (arrayListM10015.size() != 1) {
                    m10007(enumC17134M52911.m38774(), arrayListM10015, i2);
                    return 2;
                }
                int iM100010 = m10009(i + 1);
                EnumC17134 enumC17134M52913 = C23841.m52911(Integer.valueOf((iM10009 << 8) + iM100010));
                if (enumC17134M52913 != null) {
                    m26676(enumC17134M52913.m38779() + C0249l.f1196b);
                    return 2;
                }
                this.f32274.mo4344(m26671(18, enumC17134M52911.m38779()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z4 ? C24630.m54287(iM100010) : Integer.valueOf(iM100010));
                sb2.append(C0249l.f1196b);
                m26676(sb2.toString());
                return 2;
            default:
                if (enumC17134M52911.m38779() == null) {
                    this.f32274.mo4344(m26671(18, "bytecode"));
                    m26676(enumC17134M52911 + C0249l.f1196b);
                    return 1;
                }
                if (!enumC17134M52911.m38778()) {
                    this.f32274.mo4344(m26671(18, "bytecode"));
                    m26676(enumC17134M52911 + C0249l.f1196b);
                    return 1;
                }
                String strM387710 = enumC17134M52911.m38779();
                int i4 = iArr[enumC17134M52911.ordinal()];
                String str6 = "BOGUS;";
                boolean z5 = this.f32292;
                boolean z6 = this.f32275;
                switch (i4) {
                    case 1:
                        int i5 = (i + 4) & (-4);
                        try {
                            int i6 = getInt(i5);
                            int i7 = getInt(i5 + 4);
                            int i8 = getInt(i5 + 8);
                            str2 = "BOGUS;";
                            int i9 = i8 - i7;
                            try {
                                str = strM387710;
                                try {
                                    m26675(this.f32298, m26671(17, strM387710) + " { ");
                                    m26676((!z6 || z5) ? "" : " // " + i7 + " to " + i8);
                                    for (int i10 = 0; i10 <= i9; i10++) {
                                        try {
                                            this.f32274.mo4344(m26677(i2, m26671(9, String.format("%2d: ", Integer.valueOf(i10 + i7)))));
                                            m26676(((C19003) this.f38259).m26682() + (getInt((i10 * 4) + i5 + 12) + i) + C0249l.f1196b);
                                        } catch (IndexOutOfBoundsException e) {
                                            e = e;
                                            str3 = " };";
                                            z2 = false;
                                            if (z2) {
                                                m26676(str + " { ");
                                                m26679(m26677(i2, str2));
                                                m26676(m26677(i2, str3));
                                            } else {
                                                this.f32274.mo4349(str2);
                                                m26676(m26677(i2, str3));
                                            }
                                            this.f38257.m48073(e);
                                            return 1;
                                        }
                                    }
                                    this.f32274.mo4344(m26677(i2, m26671(15 - m26683(), "default: " + ((C19003) this.f38259).m26682() + (i6 + i))));
                                    str3 = " };";
                                    try {
                                        m26676(str3);
                                        return (i9 * 4) + (i5 - i) + 16;
                                    } catch (IndexOutOfBoundsException e2) {
                                        e = e2;
                                        z2 = false;
                                        if (z2) {
                                            m26676(str + " { ");
                                            m26679(m26677(i2, str2));
                                            m26676(m26677(i2, str3));
                                        } else {
                                            this.f32274.mo4349(str2);
                                            m26676(m26677(i2, str3));
                                        }
                                        this.f38257.m48073(e);
                                        return 1;
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    e = e3;
                                    str3 = " };";
                                    z2 = true;
                                    if (z2) {
                                        m26676(str + " { ");
                                        m26679(m26677(i2, str2));
                                        m26676(m26677(i2, str3));
                                    } else {
                                        this.f32274.mo4349(str2);
                                        m26676(m26677(i2, str3));
                                    }
                                    this.f38257.m48073(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                e = e4;
                                str = strM387710;
                            }
                        } catch (IndexOutOfBoundsException e5) {
                            e = e5;
                            str = strM387710;
                            str2 = "BOGUS;";
                            str3 = " };";
                        }
                        break;
                    case 2:
                        int i11 = (i + 4) & (-4);
                        try {
                            int i12 = getInt(i11);
                            int i13 = getInt(i11 + 4);
                            m26675(this.f32298, m26671(17, strM387710) + " { ");
                            m26676((!z6 || z5) ? "" : " // " + i13);
                            try {
                                C8537[] c8537ArrM10010 = m10010(i11, i13);
                                int iMax = Math.max(9, C23573.stream(c8537ArrM10010).mapToInt(new C11432()).max().orElse(0) + 2);
                                int i14 = 0;
                                while (i14 < i13) {
                                    str4 = str6;
                                    try {
                                        this.f32274.mo4344(m26677(i2, m26671(iMax, String.format("%2d:", c8537ArrM10010[i14].f22916))));
                                        m26676(((C19003) this.f38259).m26682() + (((Integer) c8537ArrM10010[i14].f22917).intValue() + i) + C0249l.f1196b);
                                        i14++;
                                        str6 = str4;
                                    } catch (IndexOutOfBoundsException e6) {
                                        e = e6;
                                        str5 = " };";
                                        z3 = false;
                                        if (z3) {
                                            m26676(strM387710 + " { ");
                                        }
                                        m26679(m26677(i2, str4));
                                        m26676(m26677(i2, str5));
                                        this.f38257.m48073(e);
                                        return 1;
                                    }
                                }
                                str4 = str6;
                                this.f32274.mo4344(m26677(i2, m26671(15 - m26683(), m26671(iMax, "default: ") + ((C19003) this.f38259).m26682() + (i12 + i))));
                                str5 = " };";
                                try {
                                    m26676(str5);
                                    return C21466.m48630(i13, 1, 8, i11 - i);
                                } catch (IndexOutOfBoundsException e7) {
                                    e = e7;
                                    z3 = false;
                                    if (z3) {
                                        m26676(strM387710 + " { ");
                                    }
                                    m26679(m26677(i2, str4));
                                    m26676(m26677(i2, str5));
                                    this.f38257.m48073(e);
                                    return 1;
                                }
                            } catch (IndexOutOfBoundsException e8) {
                                e = e8;
                                str4 = str6;
                            }
                        } catch (IndexOutOfBoundsException e9) {
                            e = e9;
                            str4 = "BOGUS;";
                            str5 = " };";
                            z3 = true;
                        }
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                        ArrayList arrayListM10016 = m10012(i, 2);
                        if (arrayListM10016.size() != 2) {
                            m10007(enumC17134M52911.m38774(), arrayListM10016, i2);
                            return 3;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26676(((C19003) this.f38259).m26682() + (i + m10006(i + 1)) + C0249l.f1196b);
                        return 3;
                    case 21:
                    case 22:
                        ArrayList arrayListM10017 = m10012(i, 4);
                        if (arrayListM10017.size() != 4) {
                            m10007(enumC17134M52911.m38774(), arrayListM10017, i2);
                            return 5;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26676(((C19003) this.f38259).m26682() + (i + getInt(i + 1)) + C0249l.f1196b);
                        return 5;
                    case 23:
                    case 24:
                    case 25:
                    default:
                        m26676(strM387710 + C0249l.f1196b);
                        return 1;
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        ArrayList arrayListM10018 = m10012(i, 1);
                        if (arrayListM10018.size() != 1) {
                            m10007(enumC17134M52911.m38774(), arrayListM10018, i2);
                            return 2;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26676(m10009(i + 1) + C0249l.f1196b);
                        return 2;
                    case 37:
                        ArrayList arrayListM10019 = m10012(i, 2);
                        if (arrayListM10019.size() != 2) {
                            m10007(enumC17134M52911.m38774(), arrayListM10019, i2);
                            return 3;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26680("%d, %d;", Integer.valueOf(m10009(i + 1)), Integer.valueOf(m10008(i + 2)));
                        return 3;
                    case 38:
                        ArrayList arrayListM100110 = m10012(i, 1);
                        if (arrayListM100110.size() != 1) {
                            m10007(enumC17134M52911.m38774(), arrayListM100110, i2);
                            return 2;
                        }
                        int iM100011 = m10009(i + 1);
                        EnumC4040 enumC4040M44278 = C19463.m44278(iM100011);
                        if (enumC4040M44278 == null) {
                            this.f32274.mo4344(m26671(18, strM387710));
                            m26676("BOGUS TYPE: " + C24630.m54288(8, iM100011) + C0249l.f1196b);
                            return 2;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26676(enumC4040M44278.m8093() + C0249l.f1196b);
                        return 2;
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                        try {
                            new HashMap();
                            EnumC17134 enumC17134 = EnumC17134.f50880;
                            Map map = AbstractC11588.f32273;
                            if (enumC17134M52911 == enumC17134) {
                                z = true;
                                iM10011 = m10009(i + 1);
                                i3 = 2;
                            } else if (enumC17134M52911 == EnumC17134.f50827) {
                                map = AbstractC11588.f32272;
                                iM10011 = m10011(i + 1);
                                z = true;
                                i3 = 5;
                            } else {
                                iM10011 = m10011(i + 1);
                                z = true;
                                i3 = 3;
                            }
                            this.f38266.m27981(z);
                            if (!z6) {
                                m26668(m26671(18, strM387710));
                                m26676(m26659(this.f38266.m27983(iM10011), i2 + 18, "", map) + C0249l.f1196b);
                            } else if (z5) {
                                m26676(String.format("%s #%d;", m26671(17, strM387710), Integer.valueOf(iM10011)));
                            } else {
                                m26675(this.f32298, String.format("%s #%d;", m26671(17, strM387710), Integer.valueOf(iM10011)));
                                m26668(" // ");
                                m26676(m26659(this.f38266.m27983(iM10011), this.f32298 + i2, " // ", map));
                            }
                            this.f38266.m27981(false);
                            return i3;
                        } catch (IndexOutOfBoundsException e10) {
                            if (!z6) {
                                this.f32274.mo4344(m26671(18, strM387710));
                                m26676("BOGUS;");
                            } else if (z5) {
                                m26676(m26671(17, strM387710) + " BOGUS;");
                            } else {
                                m26675(this.f32298, C17588.m40053(m26671(17, strM387710), " BOGUS;"));
                                m26676(" // " + e10.getMessage());
                            }
                            this.f38257.m48073(e10);
                            return 1;
                        }
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                        ArrayList arrayListM100111 = m10012(i, 2);
                        if (arrayListM100111.size() != 2) {
                            m10007(enumC17134M52911.m38774(), arrayListM100111, i2);
                            return 3;
                        }
                        int iM10012 = m10011(i + 1);
                        if (!z6) {
                            m26668(m26671(18, strM387710));
                            m26676(this.f38266.m27983(iM10012) + C0249l.f1196b);
                            return 3;
                        }
                        if (z5) {
                            m26676(String.format("%s #%d;", m26671(17, strM387710), Integer.valueOf(iM10012)));
                            return 3;
                        }
                        m26675(this.f32298, String.format("%s #%d;", m26671(17, strM387710), Integer.valueOf(iM10012)));
                        m26676(" // " + this.f38266.m27983(iM10012));
                        return 3;
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                        int i15 = enumC17134M52911 == EnumC17134.f50709 ? 3 : 4;
                        ArrayList arrayListM100112 = m10012(i, i15);
                        if (arrayListM100112.size() == i15) {
                            int iM10013 = m10011(i + 1);
                            int iM100012 = m10009(i + 3);
                            if (!z6) {
                                m26668(m26671(18, strM387710));
                                m26680("%s, %d;", this.f38266.m27983(iM10013), Integer.valueOf(iM100012));
                            } else if (z5) {
                                m26676(String.format("%s #%d, %d;", m26671(17, strM387710), Integer.valueOf(iM10013), Integer.valueOf(iM100012)));
                            } else {
                                m26675(this.f32298, String.format("%s #%d, %d;", m26671(17, strM387710), Integer.valueOf(iM10013), Integer.valueOf(iM100012)));
                                m26676(" // " + this.f38266.m27983(iM10013));
                            }
                        } else {
                            m10007(enumC17134M52911.m38774(), arrayListM100112, i2);
                        }
                        return i15 + 1;
                    case 56:
                        ArrayList arrayListM100113 = m10012(i, 2);
                        if (arrayListM100113.size() != 2) {
                            m10007(enumC17134M52911.m38774(), arrayListM100113, i2);
                            return 3;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26676(m10006(i + 1) + C0249l.f1196b);
                        return 3;
                    case 57:
                        ArrayList arrayListM100114 = m10012(i, 1);
                        if (arrayListM100114.size() != 1) {
                            m10007(enumC17134M52911.m38774(), arrayListM100114, i2);
                            return 2;
                        }
                        this.f32274.mo4344(m26671(18, strM387710));
                        m26676(m10008(i + 1) + C0249l.f1196b);
                        return 2;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m10007(byte b, ArrayList arrayList, int i) {
        this.f32274.mo4344(m26671(18, EnumC17134.f50602.m38779()));
        StringBuilder sb = new StringBuilder();
        int i2 = C24630.f77971;
        int i3 = 2;
        while (i3 > 0 && (b >> ((i3 - 1) * 4)) == 0) {
            i3--;
        }
        sb.append(C24630.m54288(i3, b));
        sb.append(C0249l.f1196b);
        m26676(sb.toString());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byte bByteValue = ((Byte) it.next()).byteValue();
            this.f32274.mo4344(m26666(i, " "));
            this.f32274.mo4344(m26671(18, EnumC17134.f50602.m38779()));
            StringBuilder sb2 = new StringBuilder();
            int i4 = 2;
            while (i4 > 0 && (bByteValue >> ((i4 - 1) * 4)) == 0) {
                i4--;
            }
            sb2.append(C24630.m54288(i4, bByteValue));
            sb2.append(C0249l.f1196b);
            m26676(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private ArrayList m10012(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int length = this.f10709.length;
        for (int i3 = 1; i3 <= i2 && i + i3 < length; i3++) {
            arrayList.add(Byte.valueOf(this.f10709[i3]));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ܳ */
    private C8537[] m10010(int i, int i2) {
        try {
            C8537[] c8537Arr = new C8537[i2];
            for (int i3 = 1; i3 <= i2; i3++) {
                int i4 = i3 * 8;
                c8537Arr[i3 - 1] = new C8537(Integer.valueOf(getInt(i + i4)), Integer.valueOf(getInt(i + 4 + i4)));
            }
            return c8537Arr;
        } catch (NegativeArraySizeException unused) {
            throw new IndexOutOfBoundsException(this.f38257.m48081("The index {0} is out of range for the code array of the method.", Integer.valueOf(i2)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    @Override // p067l.AbstractC11588, p067l.InterfaceC18983
    /* JADX INFO: renamed from: ۧ */
    public final void mo5334() {
        int iM48630;
        C9419 c9419 = this.f10699;
        if (c9419 != null) {
            for (C3540 c3540 : c9419.f25709) {
                m10016(c3540.f7176).f62725 = c3540.f7174;
            }
        }
        C8254 c8254 = this.f10697;
        HashMap map = this.f10703;
        if (c8254 != null && !this.f32296) {
            boolean z = true;
            ArrayList arrayList = null;
            for (int i = 0; i < this.f10697.f25709.size(); i++) {
                C14959 c14959 = (C14959) ((AbstractC11588) this.f10697.f25709.get(i));
                if (((Boolean) this.f10697.f21858.get(i)).booleanValue()) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c14959);
                } else {
                    C20305 c20305M10016 = m10016(c14959.f42737);
                    c20305M10016.f62732 = c14959;
                    c20305M10016.f62733 = arrayList;
                    z = false;
                    arrayList = null;
                }
            }
            if (arrayList != null) {
                (z ? (C20305) map.get(Collections.min(map.keySet())) : (C20305) map.get(Collections.max(map.keySet()))).f62733 = arrayList;
            }
        }
        if (!((C19003) this.f38259).f32284) {
            int i2 = 0;
            while (i2 < this.f10709.length) {
                EnumC17134 enumC17134M52911 = C23841.m52911(Integer.valueOf(m10009(i2)));
                if (enumC17134M52911 != null) {
                    switch (C17465.f52212[enumC17134M52911.ordinal()]) {
                        case 1:
                            int i3 = (i2 + 4) & (-4);
                            try {
                                int i4 = getInt(i3);
                                int i5 = getInt(i3 + 8) - getInt(i3 + 4);
                                for (int i6 = 0; i6 <= i5; i6++) {
                                    m10016(getInt((i6 * 4) + i3 + 12) + i2).f62726 = true;
                                }
                                m10016(i4 + i2).f62726 = true;
                                iM48630 = (i3 - i2) + 16 + (i5 * 4);
                            } catch (IndexOutOfBoundsException e) {
                                this.f38257.m48073(e);
                                m10016(i2).f62726 = true;
                                iM48630 = 1;
                            }
                            break;
                        case 2:
                            int i7 = (i2 + 4) & (-4);
                            try {
                                int i8 = getInt(i7);
                                int i9 = i7 + 4;
                                int i10 = getInt(i9);
                                for (int i11 = 1; i11 <= i10; i11++) {
                                    m10016(getInt((i11 * 8) + i9) + i2).f62726 = true;
                                }
                                m10016(i8 + i2).f62726 = true;
                                iM48630 = C21466.m48630(i10, 1, 8, i7 - i2);
                            } catch (IndexOutOfBoundsException e2) {
                                this.f38257.m48073(e2);
                                m10016(i2).f62726 = true;
                                iM48630 = 1;
                            }
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                            try {
                                m10016(m10006(i2 + 1) + i2).f62726 = true;
                                iM48630 = 3;
                            } catch (IndexOutOfBoundsException e3) {
                                this.f38257.m48073(e3);
                                m10016(i2).f62726 = true;
                                iM48630 = 1;
                            }
                            break;
                        case 21:
                        case 22:
                            m10016(getInt(i2 + 1) + i2).f62726 = true;
                            iM48630 = 5;
                            break;
                        case 23:
                        case 24:
                        case 25:
                            enumC17134M52911 = C23841.m52911(Integer.valueOf((enumC17134M52911.m38775().intValue() << 8) + m10009(i2 + 1)));
                            if (enumC17134M52911 != null || (iM48630 = enumC17134M52911.m38780()) == 0) {
                                iM48630 = 1;
                            }
                            break;
                        default:
                            if (enumC17134M52911 != null) {
                                iM48630 = 1;
                            } else {
                                iM48630 = 1;
                            }
                            break;
                    }
                } else {
                    try {
                        m10016(i2).f62726 = true;
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        iM48630 = 1;
                    }
                    iM48630 = 1;
                }
                i2 += iM48630;
            }
        }
        for (C24347 c24347 : this.f10702) {
            C20305 c20305M10017 = m10016(c24347.f77117);
            if (c20305M10017.f62723 == null) {
                c20305M10017.f62723 = new ArrayList(4);
            }
            c20305M10017.f62723.add(c24347);
            C20305 c20305M10018 = m10016(c24347.f77115);
            if (c20305M10018.f62734 == null) {
                c20305M10018.f62734 = new ArrayList(4);
            }
            c20305M10018.f62734.add(c24347);
            C20305 c20305M10019 = m10016(c24347.f77116);
            if (c20305M10019.f62731 == null) {
                c20305M10019.f62731 = new ArrayList(4);
            }
            c20305M10019.f62731.add(c24347);
        }
        C9419 c94110 = this.f10707;
        if (c94110 != null) {
            for (C22987 c22987 : c94110.f25709) {
                C20305 c20305M100110 = m10016(c22987.f50141);
                if (c20305M100110.f62724 == null) {
                    c20305M100110.f62724 = new ArrayList(4);
                }
                c20305M100110.f62724.add(c22987);
                C20305 c20305M100111 = m10016(c22987.f50141 + c22987.f50140);
                if (c20305M100111.f62729 == null) {
                    c20305M100111.f62729 = new ArrayList(4);
                }
                c20305M100111.f62729.add(c22987);
            }
        }
        C9419 c94111 = this.f10708;
        if (c94111 != null) {
            for (C23657 c23657 : c94111.f25709) {
                C20305 c20305M100112 = m10016(c23657.f50141);
                if (c20305M100112.f62727 == null) {
                    c20305M100112.f62727 = new ArrayList(4);
                }
                c20305M100112.f62727.add(c23657);
                C20305 c20305M100113 = m10016(c23657.f50141 + c23657.f50140);
                if (c20305M100113.f62730 == null) {
                    c20305M100113.f62730 = new ArrayList(4);
                }
                c20305M100113.f62730.add(c23657);
            }
        }
        m26678(1);
        m26673("%s %d  %s %d", EnumC16818.f49689.m38127(), Integer.valueOf(this.f10700), EnumC16818.f49726.m38127(), Integer.valueOf(this.f10696));
        m26667(1);
        ((C19003) this.f38259).m43150();
        m26679("{");
        C20305 c20305 = (C20305) map.get(0);
        int i12 = this.f32298;
        int i13 = this.f10706;
        this.f32298 = (i12 - i13) - m26670();
        int iM10013 = 0;
        while (iM10013 < this.f10709.length) {
            int i14 = this.f10710;
            if (c20305 != null) {
                m26678(1);
                c20305.f32298 = this.f32298;
                c20305.m45859(i14);
                m26667(1);
            }
            if (((C19003) this.f38259).f32284) {
                m26678(1);
                m26672(m26671(i13, String.format("%2d:", Integer.valueOf(iM10013))));
            } else {
                m26672(m26671(i13, (c20305 == null || !c20305.f62726) ? " " : ((C19003) this.f38259).m26682() + iM10013 + ":"));
                m26678(1);
            }
            if (c20305 != null && c20305.m45857(i14)) {
                m26668(m26677(i14, ""));
            }
            iM10013 += m10013(iM10013, m26670() + i14);
            c20305 = (C20305) map.get(Integer.valueOf(iM10013));
            if (c20305 != null) {
                c20305.m45858(i14);
                m26667(1);
            }
            m26667(1);
        }
        if (c20305 != null && c20305.f62732 != null && c20305.f62726) {
            C19003 c19003 = (C19003) this.f38259;
            if (c19003.f32284) {
                m26678(1);
                m26672(m26671(0, String.format("%2d:", Integer.valueOf(this.f10709.length))));
                m26667(1);
            } else {
                m26669(m26671(this.f10709.length, String.format("%s%d:", c19003.m26682(), Integer.valueOf(this.f10709.length))), 0);
            }
        }
        List[] listArr = {this.f10705, this.f10698};
        boolean z2 = true;
        for (int i15 = 0; i15 < 2; i15++) {
            List list = listArr[i15];
            if (list != null) {
                if (z2) {
                    this.f32274.mo4349("");
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((C8493) it.next()).mo5334();
                    m26681();
                    z2 = false;
                }
            }
        }
        C9419[] c9419Arr = {this.f10699, this.f10707, this.f10708, this.f10697};
        for (int i16 = 0; i16 < 4; i16++) {
            C9419 c94112 = c9419Arr[i16];
            if (c94112 != null && c94112.mo6310()) {
                c94112.f32298 = this.f32298;
                c94112.mo5334();
            }
        }
        m26679(C0249l.f1198d);
    }
}
