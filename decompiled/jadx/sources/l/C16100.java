package l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.ܺᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KG */
/* JADX INFO: loaded from: classes5.dex */
public final class C16100 extends AbstractC4930 implements Handler.Callback {

    /* JADX INFO: renamed from: ֡֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9046 f49598;

    /* JADX INFO: renamed from: ֨֫, reason: not valid java name and contains not printable characters */
    public boolean f49599;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public long f49600;

    /* JADX INFO: renamed from: ۘ֫, reason: not valid java name and contains not printable characters */
    public AbstractC17533 f49601;

    /* JADX INFO: renamed from: ۚ֫, reason: not valid java name and contains not printable characters */
    public final Handler f49602;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public InterfaceC17512 f49603;

    /* JADX INFO: renamed from: ۠֫, reason: not valid java name and contains not printable characters */
    public C8353 f49604;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public final C3002 f49605;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public long f49606;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public final C4400 f49607;

    /* JADX INFO: renamed from: ܶ֫, reason: not valid java name and contains not printable characters */
    public AbstractC17533 f49608;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public boolean f49609;

    /* JADX INFO: renamed from: ᩴ֫, reason: not valid java name and contains not printable characters */
    public int f49610;

    /* JADX INFO: renamed from: ᩵֫, reason: not valid java name and contains not printable characters */
    public C18239 f49611;

    /* JADX INFO: renamed from: ᩶֫, reason: not valid java name and contains not printable characters */
    public boolean f49612;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public int f49613;

    /* JADX INFO: renamed from: ᩸֫, reason: not valid java name and contains not printable characters */
    public InterfaceC7222 f49614;

    /* JADX INFO: renamed from: ᩹֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9752 f49615;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C21843 f49616;

    @Override // l.InterfaceC1837, l.InterfaceC18065
    public final String getName() {
        return "TextRenderer";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16100(InterfaceC9046 interfaceC9046, Looper looper) {
        super(3);
        InterfaceC9752 interfaceC9752 = InterfaceC9752.f29520;
        this.f49598 = interfaceC9046;
        this.f49602 = looper == null ? null : new Handler(looper, this);
        this.f49615 = interfaceC9752;
        this.f49607 = new C4400();
        this.f49616 = new C21843(1, 0);
        this.f49605 = new C3002();
        this.f49606 = -9223372036854775807L;
        this.f49600 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37992(long j) {
        C22632.m50634(mo6100());
        this.f49606 = j;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo14359(C8353[] c8353Arr, long j, long j2, C15894 c15894) {
        InterfaceC17512 c6929;
        C8353 c8353 = c8353Arr[0];
        this.f49604 = c8353;
        if (!C11003.equals(c8353.f25614, "application/x-media3-cues")) {
            m37987();
            if (this.f49614 != null) {
                this.f49613 = 1;
                return;
            }
            this.f49612 = true;
            C8353 c8354 = this.f49604;
            c8354.getClass();
            InterfaceC7222 interfaceC7222M47870 = ((C21041) this.f49615).m47870(c8354);
            this.f49614 = interfaceC7222M47870;
            interfaceC7222M47870.mo4864(m14371());
            return;
        }
        if (this.f49604.f25611 == 1) {
            c6929 = new C23862();
        } else {
            c6929 = new C6929();
        }
        this.f49603 = c6929;
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ֫ */
    public final void mo13451(long j, boolean z) {
        this.f49600 = j;
        InterfaceC17512 interfaceC17512 = this.f49603;
        if (interfaceC17512 != null) {
            interfaceC17512.clear();
        }
        m37988();
        this.f49609 = false;
        this.f49599 = false;
        this.f49606 = -9223372036854775807L;
        C8353 c8353 = this.f49604;
        if (c8353 == null || C11003.equals(c8353.f25614, "application/x-media3-cues")) {
            return;
        }
        if (this.f49613 == 0) {
            m37991();
            InterfaceC7222 interfaceC7222 = this.f49614;
            interfaceC7222.getClass();
            interfaceC7222.flush();
            interfaceC7222.mo4864(m14371());
            return;
        }
        m37991();
        InterfaceC7222 interfaceC7223 = this.f49614;
        interfaceC7223.getClass();
        interfaceC7223.mo12();
        this.f49614 = null;
        this.f49613 = 0;
        this.f49612 = true;
        C8353 c8354 = this.f49604;
        c8354.getClass();
        InterfaceC7222 interfaceC7222M47870 = ((C21041) this.f49615).m47870(c8354);
        this.f49614 = interfaceC7222M47870;
        interfaceC7222M47870.mo4864(m14371());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:103:0x0263 A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0271 A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0288 A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0295 A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:116:0x029a A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:119:0x029f A[Catch: ֫ᩴۧ -> 0x02c3, TryCatch #0 {֫ᩴۧ -> 0x02c3, blocks: (B:99:0x025b, B:101:0x025f, B:103:0x0263, B:106:0x0271, B:107:0x0273, B:109:0x0277, B:111:0x0288, B:113:0x028f, B:115:0x0295, B:120:0x02b0, B:122:0x02b4, B:116:0x029a, B:119:0x029f), top: B:130:0x025b }] */
    /* JADX WARN: Code duplicated, block: B:130:0x025b A[EXC_TOP_SPLITTER, LOOP:2: B:130:0x025b->B:144:0x025b, LOOP_START, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x029e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x02b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x025b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0187  */
    /* JADX WARN: Code duplicated, block: B:59:0x018b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0194 A[LOOP:1: B:60:0x0190->B:62:0x0194, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:91:0x0231  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:95:0x024d  */
    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ֫ */
    public final void mo6088(long j, long j2) {
        boolean z;
        AbstractC17533 abstractC17533;
        StringBuilder sb;
        C18239 c18239;
        int iM14355;
        C8353 c8353;
        int iMo4659;
        long jMo4660;
        C4288 c4288;
        AbstractC17533 abstractC17534;
        long jM37989;
        if (mo6100()) {
            long j3 = this.f49606;
            if (j3 != -9223372036854775807L && j >= j3) {
                m37991();
                this.f49599 = true;
            }
        }
        if (this.f49599) {
            return;
        }
        C8353 c8354 = this.f49604;
        c8354.getClass();
        boolean zEquals = C11003.equals(c8354.f25614, "application/x-media3-cues");
        InterfaceC9046 interfaceC9046 = this.f49598;
        Handler handler = this.f49602;
        C3002 c3002 = this.f49605;
        boolean zMo18737 = false;
        zMo18737 = false;
        zMo18737 = false;
        if (zEquals) {
            this.f49603.getClass();
            if (!this.f49609) {
                C21843 c21843 = this.f49616;
                if (m14355(c3002, c21843, 0) == -4) {
                    if (c21843.m12697()) {
                        this.f49609 = true;
                    } else {
                        c21843.m49229();
                        ByteBuffer byteBuffer = c21843.f69995;
                        byteBuffer.getClass();
                        long j4 = c21843.f69997;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f49607.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(am.aF);
                        parcelableArrayList.getClass();
                        int i = AbstractC14545.f44556;
                        C1846 c1846 = new C1846();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            c1846.m16264(C19811.m45555(bundle2));
                        }
                        C12866 c12866 = new C12866(j4, bundle.getLong("d"), c1846.m6131());
                        c21843.mo7();
                        zMo18737 = this.f49603.mo18737(c12866, j);
                    }
                }
            }
            long jMo18739 = this.f49603.mo18739(this.f49600);
            if (jMo18739 == Long.MIN_VALUE && this.f49609 && !zMo18737) {
                this.f49599 = true;
            }
            if (jMo18739 != Long.MIN_VALUE && jMo18739 <= j) {
                zMo18737 = true;
            }
            if (zMo18737) {
                AbstractC14545 abstractC14545Mo18736 = this.f49603.mo18736(j);
                long jMo18738 = this.f49603.mo18738(j);
                m37990(jMo18738);
                C4288 c4289 = new C4288(abstractC14545Mo18736);
                if (handler != null) {
                    handler.obtainMessage(1, c4289).sendToTarget();
                } else {
                    interfaceC9046.mo23343(c4289.f13839);
                    interfaceC9046.mo23344(c4289);
                }
                this.f49603.mo18740(jMo18738);
            }
            this.f49600 = j;
            return;
        }
        m37987();
        this.f49600 = j;
        AbstractC17533 abstractC17535 = this.f49601;
        InterfaceC9752 interfaceC9752 = this.f49615;
        if (abstractC17535 != null) {
            if (getState() != 2) {
                return;
            }
            if (this.f49608 != null) {
                jM37989 = m37989();
                z = false;
                while (jM37989 <= j) {
                    this.f49610++;
                    jM37989 = m37989();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC17533 = this.f49601;
            if (abstractC17533 != null) {
                if (abstractC17533.m12697()) {
                    if (!z) {
                        if (this.f49613 == 2) {
                            m37991();
                            InterfaceC7222 interfaceC7222 = this.f49614;
                            interfaceC7222.getClass();
                            interfaceC7222.mo12();
                            this.f49614 = null;
                            this.f49613 = 0;
                            this.f49612 = true;
                            C8353 c8355 = this.f49604;
                            c8355.getClass();
                            InterfaceC7222 interfaceC7222M47870 = ((C21041) interfaceC9752).m47870(c8355);
                            this.f49614 = interfaceC7222M47870;
                            interfaceC7222M47870.mo4864(m14371());
                        } else {
                            m37991();
                            this.f49599 = true;
                        }
                    }
                } else if (abstractC17533.f65926 <= j) {
                    abstractC17534 = this.f49608;
                    if (abstractC17534 != null) {
                        abstractC17534.mo8();
                    }
                    this.f49610 = abstractC17533.mo4659(j);
                    this.f49608 = abstractC17533;
                    this.f49601 = null;
                    z = true;
                }
            }
            if (z) {
                this.f49608.getClass();
                iMo4659 = this.f49608.mo4659(j);
                if (iMo4659 != 0) {
                    jMo4660 = this.f49608.f65926;
                } else {
                    jMo4660 = this.f49608.f65926;
                }
                m37990(jMo4660);
                c4288 = new C4288(this.f49608.mo4661(j));
                if (handler != null) {
                    handler.obtainMessage(1, c4288).sendToTarget();
                } else {
                    interfaceC9046.mo23343(c4288.f13839);
                    interfaceC9046.mo23344(c4288);
                }
            }
            if (this.f49613 == 2) {
                return;
            }
            while (!this.f49609) {
                c18239 = this.f49611;
                if (c18239 == null) {
                    InterfaceC7222 interfaceC7223 = this.f49614;
                    interfaceC7223.getClass();
                    c18239 = (C18239) interfaceC7223.mo4865();
                    if (c18239 == null) {
                        return;
                    } else {
                        this.f49611 = c18239;
                    }
                }
                if (this.f49613 == 1) {
                    c18239.m12693(4);
                    InterfaceC7222 interfaceC7224 = this.f49614;
                    interfaceC7224.getClass();
                    interfaceC7224.mo4862(c18239);
                    this.f49611 = null;
                    this.f49613 = 2;
                    return;
                }
                iM14355 = m14355(c3002, c18239, 0);
                if (iM14355 == -4) {
                    if (c18239.m12697()) {
                        this.f49609 = true;
                        this.f49612 = false;
                    } else {
                        c8353 = c3002.f9455;
                        if (c8353 == null) {
                            return;
                        }
                        c18239.f56684 = c8353.f25620;
                        c18239.m49229();
                        this.f49612 &= !c18239.m12690();
                    }
                    if (!this.f49612) {
                        InterfaceC7222 interfaceC7225 = this.f49614;
                        interfaceC7225.getClass();
                        interfaceC7225.mo4862(c18239);
                        this.f49611 = null;
                    }
                } else if (iM14355 == -3) {
                    return;
                }
            }
            return;
        }
        InterfaceC7222 interfaceC7226 = this.f49614;
        interfaceC7226.getClass();
        interfaceC7226.mo14072(j);
        try {
            InterfaceC7222 interfaceC7227 = this.f49614;
            interfaceC7227.getClass();
            this.f49601 = (AbstractC17533) interfaceC7227.mo4863();
            if (getState() != 2) {
                return;
            }
            if (this.f49608 != null) {
                jM37989 = m37989();
                z = false;
                while (jM37989 <= j) {
                    this.f49610++;
                    jM37989 = m37989();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC17533 = this.f49601;
            if (abstractC17533 != null) {
                if (abstractC17533.m12697()) {
                    if (!z && m37989() == C13132.FOREVER_NS) {
                        if (this.f49613 == 2) {
                            m37991();
                            InterfaceC7222 interfaceC7228 = this.f49614;
                            interfaceC7228.getClass();
                            interfaceC7228.mo12();
                            this.f49614 = null;
                            this.f49613 = 0;
                            this.f49612 = true;
                            C8353 c8356 = this.f49604;
                            c8356.getClass();
                            InterfaceC7222 interfaceC7222M47871 = ((C21041) interfaceC9752).m47870(c8356);
                            this.f49614 = interfaceC7222M47871;
                            interfaceC7222M47871.mo4864(m14371());
                        } else {
                            m37991();
                            this.f49599 = true;
                        }
                    }
                } else if (abstractC17533.f65926 <= j) {
                    abstractC17534 = this.f49608;
                    if (abstractC17534 != null) {
                        abstractC17534.mo8();
                    }
                    this.f49610 = abstractC17533.mo4659(j);
                    this.f49608 = abstractC17533;
                    this.f49601 = null;
                    z = true;
                }
            }
            if (z) {
                this.f49608.getClass();
                iMo4659 = this.f49608.mo4659(j);
                if (iMo4659 != 0 || this.f49608.mo4658() == 0) {
                    jMo4660 = this.f49608.f65926;
                } else if (iMo4659 == -1) {
                    AbstractC17533 abstractC17536 = this.f49608;
                    jMo4660 = abstractC17536.mo4660(abstractC17536.mo4658() - 1);
                } else {
                    jMo4660 = this.f49608.mo4660(iMo4659 - 1);
                }
                m37990(jMo4660);
                c4288 = new C4288(this.f49608.mo4661(j));
                if (handler != null) {
                    handler.obtainMessage(1, c4288).sendToTarget();
                } else {
                    interfaceC9046.mo23343(c4288.f13839);
                    interfaceC9046.mo23344(c4288);
                }
            }
            if (this.f49613 == 2) {
                return;
            }
            while (!this.f49609) {
                try {
                    c18239 = this.f49611;
                    if (c18239 == null) {
                        InterfaceC7222 interfaceC7229 = this.f49614;
                        interfaceC7229.getClass();
                        c18239 = (C18239) interfaceC7229.mo4865();
                        if (c18239 == null) {
                            return;
                        } else {
                            this.f49611 = c18239;
                        }
                    }
                    if (this.f49613 == 1) {
                        c18239.m12693(4);
                        InterfaceC7222 interfaceC72210 = this.f49614;
                        interfaceC72210.getClass();
                        interfaceC72210.mo4862(c18239);
                        this.f49611 = null;
                        this.f49613 = 2;
                        return;
                    }
                    iM14355 = m14355(c3002, c18239, 0);
                    if (iM14355 == -4) {
                        if (c18239.m12697()) {
                            this.f49609 = true;
                            this.f49612 = false;
                        } else {
                            c8353 = c3002.f9455;
                            if (c8353 == null) {
                                return;
                            }
                            c18239.f56684 = c8353.f25620;
                            c18239.m49229();
                            this.f49612 &= !c18239.m12690();
                        }
                        if (!this.f49612) {
                            InterfaceC7222 interfaceC72211 = this.f49614;
                            interfaceC72211.getClass();
                            interfaceC72211.mo4862(c18239);
                            this.f49611 = null;
                        }
                    } else if (iM14355 == -3) {
                        return;
                    }
                } catch (C2011 e) {
                    e = e;
                    sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
                }
            }
            return;
        } catch (C2011 e2) {
            e = e2;
            sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
        }
        sb.append(this.f49604);
        C19956.m46034(sb.toString(), e);
        m37988();
        m37991();
        InterfaceC7222 interfaceC72212 = this.f49614;
        interfaceC72212.getClass();
        interfaceC72212.mo12();
        this.f49614 = null;
        this.f49613 = 0;
        this.f49612 = true;
        C8353 c8357 = this.f49604;
        c8357.getClass();
        InterfaceC7222 interfaceC7222M47872 = ((C21041) interfaceC9752).m47870(c8357);
        this.f49614 = interfaceC7222M47872;
        interfaceC7222M47872.mo4864(m14371());
    }

    @Override // l.AbstractC4930
    /* JADX INFO: renamed from: ۤ */
    public final void mo13464() {
        this.f49604 = null;
        this.f49606 = -9223372036854775807L;
        m37988();
        this.f49600 = -9223372036854775807L;
        if (this.f49614 != null) {
            m37991();
            InterfaceC7222 interfaceC7222 = this.f49614;
            interfaceC7222.getClass();
            interfaceC7222.mo12();
            this.f49614 = null;
            this.f49613 = 0;
        }
    }

    @Override // l.AbstractC4930, l.InterfaceC1837
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo6098() {
        return this.f49599;
    }

    @Override // l.InterfaceC1837
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6101() {
        C8353 c8353 = this.f49604;
        if (c8353 != null) {
            if (C11003.equals(c8353.f25614, "application/x-media3-cues")) {
                InterfaceC17512 interfaceC17512 = this.f49603;
                interfaceC17512.getClass();
                if (interfaceC17512.mo18739(this.f49600) == Long.MIN_VALUE) {
                    try {
                        mo6096();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (!this.f49599) {
                    if (this.f49609) {
                        AbstractC17533 abstractC17533 = this.f49608;
                        long j = this.f49600;
                        if (abstractC17533 == null || abstractC17533.mo4658() <= 0 || abstractC17533.mo4660(abstractC17533.mo4658() - 1) <= j) {
                            AbstractC17533 abstractC17534 = this.f49601;
                            long j2 = this.f49600;
                            if ((abstractC17534 == null || abstractC17534.mo4658() <= 0 || abstractC17534.mo4660(abstractC17534.mo4658() - 1) <= j2) && this.f49611 != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    private void m37991() {
        this.f49611 = null;
        this.f49610 = -1;
        AbstractC17533 abstractC17533 = this.f49608;
        if (abstractC17533 != null) {
            abstractC17533.mo8();
            this.f49608 = null;
        }
        AbstractC17533 abstractC17534 = this.f49601;
        if (abstractC17534 != null) {
            abstractC17534.mo8();
            this.f49601 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    private long m37989() {
        if (this.f49610 == -1) {
            return C13132.FOREVER_NS;
        }
        this.f49608.getClass();
        return this.f49610 >= this.f49608.mo4658() ? C13132.FOREVER_NS : this.f49608.mo4660(this.f49610);
    }

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    private void m37988() {
        AbstractC14545 abstractC14545Of = AbstractC14545.of();
        m37990(this.f49600);
        C4288 c4288 = new C4288(abstractC14545Of);
        Handler handler = this.f49602;
        if (handler != null) {
            handler.obtainMessage(1, c4288).sendToTarget();
            return;
        }
        AbstractC14545 abstractC14545 = c4288.f13839;
        InterfaceC9046 interfaceC9046 = this.f49598;
        interfaceC9046.mo23343(abstractC14545);
        interfaceC9046.mo23344(c4288);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C4288 c4288 = (C4288) message.obj;
            AbstractC14545 abstractC14545 = c4288.f13839;
            InterfaceC9046 interfaceC9046 = this.f49598;
            interfaceC9046.mo23343(abstractC14545);
            interfaceC9046.mo23344(c4288);
            return true;
        }
        throw new IllegalStateException();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m37990(long j) {
        C22632.m50634(j != -9223372036854775807L);
        return j - m14360();
    }

    @RequiresNonNull({"streamFormat"})
    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m37987() {
        C22632.m50633("Legacy decoding is disabled, can't handle " + this.f49604.f25614 + " samples (expected application/x-media3-cues).", C11003.equals(this.f49604.f25614, "application/cea-608") || C11003.equals(this.f49604.f25614, "application/x-mp4-cea-608") || C11003.equals(this.f49604.f25614, "application/cea-708"));
    }

    @Override // l.InterfaceC18065
    /* JADX INFO: renamed from: ֫ */
    public final int mo16568(C8353 c8353) {
        if (C11003.equals(c8353.f25614, "application/x-media3-cues") || ((C21041) this.f49615).m47871(c8353)) {
            return C11010.m27348(c8353.f25632 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C9786.m24809(c8353.f25614) ? C11010.m27348(1, 0, 0, 0) : C11010.m27348(0, 0, 0, 0);
    }
}
