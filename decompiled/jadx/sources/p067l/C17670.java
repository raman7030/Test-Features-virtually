package p067l;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import com.umeng.analytics.pro.C0655am;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.checkerframework.dataflow.qual.SideEffectFree;

/* JADX INFO: renamed from: l.ܺᩳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KG */
/* JADX INFO: loaded from: classes5.dex */
public final class C17670 extends AbstractC7054 implements Handler.Callback {

    /* JADX INFO: renamed from: ֡֫ */
    public final InterfaceC10966 f52761;

    /* JADX INFO: renamed from: ֨֫ */
    public boolean f52762;

    /* JADX INFO: renamed from: ۖ֫ */
    public long f52763;

    /* JADX INFO: renamed from: ۘ֫ */
    public AbstractC19032 f52764;

    /* JADX INFO: renamed from: ۚ֫ */
    public final Handler f52765;

    /* JADX INFO: renamed from: ۜ֫ */
    public InterfaceC19012 f52766;

    /* JADX INFO: renamed from: ۠֫ */
    public C10307 f52767;

    /* JADX INFO: renamed from: ۡ֫ */
    public final C5221 f52768;

    /* JADX INFO: renamed from: ۢ֫ */
    public long f52769;

    /* JADX INFO: renamed from: ܳ֫ */
    public final C6550 f52770;

    /* JADX INFO: renamed from: ܶ֫ */
    public AbstractC19032 f52771;

    /* JADX INFO: renamed from: ܺ֫ */
    public boolean f52772;

    /* JADX INFO: renamed from: ᩴ֫ */
    public int f52773;

    /* JADX INFO: renamed from: ᩵֫ */
    public C19703 f52774;

    /* JADX INFO: renamed from: ᩶֫ */
    public boolean f52775;

    /* JADX INFO: renamed from: ᩷֫ */
    public int f52776;

    /* JADX INFO: renamed from: ᩸֫ */
    public InterfaceC9232 f52777;

    /* JADX INFO: renamed from: ᩹֫ */
    public final InterfaceC11637 f52778;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C23128 f52779;

    @Override // p067l.InterfaceC4114, p067l.InterfaceC19537
    public final String getName() {
        return "TextRenderer";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17670(InterfaceC10966 interfaceC10966, Looper looper) {
        super(3);
        InterfaceC11637 interfaceC11637 = InterfaceC11637.f32471;
        this.f52761 = interfaceC10966;
        this.f52765 = looper == null ? null : new Handler(looper, this);
        this.f52778 = interfaceC11637;
        this.f52770 = new C6550();
        this.f52779 = new C23128(1, 0);
        this.f52768 = new C5221();
        this.f52769 = -9223372036854775807L;
        this.f52763 = -9223372036854775807L;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m40183(long j) {
        C23877.m52960(mo8298());
        this.f52769 = j;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo16256(C10307[] c10307Arr, long j, long j2, C17474 c17474) {
        InterfaceC19012 c8954;
        C10307 c10307 = c10307Arr[0];
        this.f52767 = c10307;
        if (!C12826.equals(c10307.f28528, "application/x-media3-cues")) {
            m40178();
            if (this.f52777 != null) {
                this.f52776 = 1;
                return;
            }
            this.f52775 = true;
            C10307 c10308 = this.f52767;
            c10308.getClass();
            InterfaceC9232 interfaceC9232M50200 = ((C22366) this.f52778).m50200(c10308);
            this.f52777 = interfaceC9232M50200;
            interfaceC9232M50200.mo7102(m16268());
            return;
        }
        if (this.f52767.f28525 == 1) {
            c8954 = new C25047();
        } else {
            c8954 = new C8954();
        }
        this.f52766 = c8954;
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ֫ */
    public final void mo15339(long j, boolean z) {
        this.f52763 = j;
        InterfaceC19012 interfaceC19012 = this.f52766;
        if (interfaceC19012 != null) {
            interfaceC19012.clear();
        }
        m40179();
        this.f52772 = false;
        this.f52762 = false;
        this.f52769 = -9223372036854775807L;
        C10307 c10307 = this.f52767;
        if (c10307 == null || C12826.equals(c10307.f28528, "application/x-media3-cues")) {
            return;
        }
        if (this.f52776 == 0) {
            m40182();
            InterfaceC9232 interfaceC9232 = this.f52777;
            interfaceC9232.getClass();
            interfaceC9232.flush();
            interfaceC9232.mo7102(m16268());
            return;
        }
        m40182();
        InterfaceC9232 interfaceC9233 = this.f52777;
        interfaceC9233.getClass();
        interfaceC9233.mo12();
        this.f52777 = null;
        this.f52776 = 0;
        this.f52775 = true;
        C10307 c10308 = this.f52767;
        c10308.getClass();
        InterfaceC9232 interfaceC9232M50200 = ((C22366) this.f52778).m50200(c10308);
        this.f52777 = interfaceC9232M50200;
        interfaceC9232M50200.mo7102(m16268());
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
    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ֫ */
    public final void mo8286(long j, long j2) {
        boolean z;
        AbstractC19032 abstractC19032;
        StringBuilder sb;
        C19703 c19703;
        int iM16252;
        C10307 c10307;
        int iMo6891;
        long jMo6892;
        C6443 c6443;
        AbstractC19032 abstractC19033;
        long jM40180;
        if (mo8298()) {
            long j3 = this.f52769;
            if (j3 != -9223372036854775807L && j >= j3) {
                m40182();
                this.f52762 = true;
            }
        }
        if (this.f52762) {
            return;
        }
        C10307 c10308 = this.f52767;
        c10308.getClass();
        boolean zEquals = C12826.equals(c10308.f28528, "application/x-media3-cues");
        InterfaceC10966 interfaceC10966 = this.f52761;
        Handler handler = this.f52765;
        C5221 c5221 = this.f52768;
        boolean zMo20687 = false;
        zMo20687 = false;
        zMo20687 = false;
        if (zEquals) {
            this.f52766.getClass();
            if (!this.f52772) {
                C23128 c23128 = this.f52779;
                if (m16252(c5221, c23128, 0) == -4) {
                    if (c23128.m14573()) {
                        this.f52772 = true;
                    } else {
                        c23128.m51580();
                        ByteBuffer byteBuffer = c23128.f72704;
                        byteBuffer.getClass();
                        long j4 = c23128.f72706;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f52770.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C0655am.f2278aF);
                        parcelableArrayList.getClass();
                        int i = AbstractC16192.f47662;
                        C4123 c4123 = new C4123();
                        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i2);
                            bundle2.getClass();
                            c4123.m18184(C21196.m47866(bundle2));
                        }
                        C14596 c14596 = new C14596(j4, bundle.getLong("d"), c4123.m8329());
                        c23128.mo7();
                        zMo20687 = this.f52766.mo20687(c14596, j);
                    }
                }
            }
            long jMo20689 = this.f52766.mo20689(this.f52763);
            if (jMo20689 == Long.MIN_VALUE && this.f52772 && !zMo20687) {
                this.f52762 = true;
            }
            if (jMo20689 != Long.MIN_VALUE && jMo20689 <= j) {
                zMo20687 = true;
            }
            if (zMo20687) {
                AbstractC16192 abstractC16192Mo20686 = this.f52766.mo20686(j);
                long jMo20688 = this.f52766.mo20688(j);
                m40181(jMo20688);
                C6443 c6444 = new C6443(abstractC16192Mo20686);
                if (handler != null) {
                    handler.obtainMessage(1, c6444).sendToTarget();
                } else {
                    interfaceC10966.mo25288(c6444.f16655);
                    interfaceC10966.mo25289(c6444);
                }
                this.f52766.mo20690(jMo20688);
            }
            this.f52763 = j;
            return;
        }
        m40178();
        this.f52763 = j;
        AbstractC19032 abstractC19034 = this.f52764;
        InterfaceC11637 interfaceC11637 = this.f52778;
        if (abstractC19034 != null) {
            if (getState() != 2) {
                return;
            }
            if (this.f52771 != null) {
                jM40180 = m40180();
                z = false;
                while (jM40180 <= j) {
                    this.f52773++;
                    jM40180 = m40180();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC19032 = this.f52764;
            if (abstractC19032 != null) {
                if (abstractC19032.m14573()) {
                    if (!z) {
                        if (this.f52776 == 2) {
                            m40182();
                            InterfaceC9232 interfaceC9232 = this.f52777;
                            interfaceC9232.getClass();
                            interfaceC9232.mo12();
                            this.f52777 = null;
                            this.f52776 = 0;
                            this.f52775 = true;
                            C10307 c10309 = this.f52767;
                            c10309.getClass();
                            InterfaceC9232 interfaceC9232M50200 = ((C22366) interfaceC11637).m50200(c10309);
                            this.f52777 = interfaceC9232M50200;
                            interfaceC9232M50200.mo7102(m16268());
                        } else {
                            m40182();
                            this.f52762 = true;
                        }
                    }
                } else if (abstractC19032.f68601 <= j) {
                    abstractC19033 = this.f52771;
                    if (abstractC19033 != null) {
                        abstractC19033.mo8();
                    }
                    this.f52773 = abstractC19032.mo6891(j);
                    this.f52771 = abstractC19032;
                    this.f52764 = null;
                    z = true;
                }
            }
            if (z) {
                this.f52771.getClass();
                iMo6891 = this.f52771.mo6891(j);
                if (iMo6891 != 0) {
                    jMo6892 = this.f52771.f68601;
                } else {
                    jMo6892 = this.f52771.f68601;
                }
                m40181(jMo6892);
                c6443 = new C6443(this.f52771.mo6893(j));
                if (handler != null) {
                    handler.obtainMessage(1, c6443).sendToTarget();
                } else {
                    interfaceC10966.mo25288(c6443.f16655);
                    interfaceC10966.mo25289(c6443);
                }
            }
            if (this.f52776 == 2) {
                return;
            }
            while (!this.f52772) {
                c19703 = this.f52774;
                if (c19703 == null) {
                    InterfaceC9232 interfaceC9233 = this.f52777;
                    interfaceC9233.getClass();
                    c19703 = (C19703) interfaceC9233.mo7103();
                    if (c19703 == null) {
                        return;
                    } else {
                        this.f52774 = c19703;
                    }
                }
                if (this.f52776 == 1) {
                    c19703.m14569(4);
                    InterfaceC9232 interfaceC9234 = this.f52777;
                    interfaceC9234.getClass();
                    interfaceC9234.mo7100(c19703);
                    this.f52774 = null;
                    this.f52776 = 2;
                    return;
                }
                iM16252 = m16252(c5221, c19703, 0);
                if (iM16252 == -4) {
                    if (c19703.m14573()) {
                        this.f52772 = true;
                        this.f52775 = false;
                    } else {
                        c10307 = c5221.f12253;
                        if (c10307 == null) {
                            return;
                        }
                        c19703.f59902 = c10307.f28534;
                        c19703.m51580();
                        this.f52775 &= !c19703.m14566();
                    }
                    if (!this.f52775) {
                        InterfaceC9232 interfaceC9235 = this.f52777;
                        interfaceC9235.getClass();
                        interfaceC9235.mo7100(c19703);
                        this.f52774 = null;
                    }
                } else if (iM16252 == -3) {
                    return;
                }
            }
            return;
        }
        InterfaceC9232 interfaceC9236 = this.f52777;
        interfaceC9236.getClass();
        interfaceC9236.mo15952(j);
        try {
            InterfaceC9232 interfaceC9237 = this.f52777;
            interfaceC9237.getClass();
            this.f52764 = (AbstractC19032) interfaceC9237.mo7101();
            if (getState() != 2) {
                return;
            }
            if (this.f52771 != null) {
                jM40180 = m40180();
                z = false;
                while (jM40180 <= j) {
                    this.f52773++;
                    jM40180 = m40180();
                    z = true;
                }
            } else {
                z = false;
            }
            abstractC19032 = this.f52764;
            if (abstractC19032 != null) {
                if (abstractC19032.m14573()) {
                    if (!z && m40180() == C14849.FOREVER_NS) {
                        if (this.f52776 == 2) {
                            m40182();
                            InterfaceC9232 interfaceC9238 = this.f52777;
                            interfaceC9238.getClass();
                            interfaceC9238.mo12();
                            this.f52777 = null;
                            this.f52776 = 0;
                            this.f52775 = true;
                            C10307 c103010 = this.f52767;
                            c103010.getClass();
                            InterfaceC9232 interfaceC9232M50201 = ((C22366) interfaceC11637).m50200(c103010);
                            this.f52777 = interfaceC9232M50201;
                            interfaceC9232M50201.mo7102(m16268());
                        } else {
                            m40182();
                            this.f52762 = true;
                        }
                    }
                } else if (abstractC19032.f68601 <= j) {
                    abstractC19033 = this.f52771;
                    if (abstractC19033 != null) {
                        abstractC19033.mo8();
                    }
                    this.f52773 = abstractC19032.mo6891(j);
                    this.f52771 = abstractC19032;
                    this.f52764 = null;
                    z = true;
                }
            }
            if (z) {
                this.f52771.getClass();
                iMo6891 = this.f52771.mo6891(j);
                if (iMo6891 != 0 || this.f52771.mo6890() == 0) {
                    jMo6892 = this.f52771.f68601;
                } else if (iMo6891 == -1) {
                    AbstractC19032 abstractC19035 = this.f52771;
                    jMo6892 = abstractC19035.mo6892(abstractC19035.mo6890() - 1);
                } else {
                    jMo6892 = this.f52771.mo6892(iMo6891 - 1);
                }
                m40181(jMo6892);
                c6443 = new C6443(this.f52771.mo6893(j));
                if (handler != null) {
                    handler.obtainMessage(1, c6443).sendToTarget();
                } else {
                    interfaceC10966.mo25288(c6443.f16655);
                    interfaceC10966.mo25289(c6443);
                }
            }
            if (this.f52776 == 2) {
                return;
            }
            while (!this.f52772) {
                try {
                    c19703 = this.f52774;
                    if (c19703 == null) {
                        InterfaceC9232 interfaceC9239 = this.f52777;
                        interfaceC9239.getClass();
                        c19703 = (C19703) interfaceC9239.mo7103();
                        if (c19703 == null) {
                            return;
                        } else {
                            this.f52774 = c19703;
                        }
                    }
                    if (this.f52776 == 1) {
                        c19703.m14569(4);
                        InterfaceC9232 interfaceC92310 = this.f52777;
                        interfaceC92310.getClass();
                        interfaceC92310.mo7100(c19703);
                        this.f52774 = null;
                        this.f52776 = 2;
                        return;
                    }
                    iM16252 = m16252(c5221, c19703, 0);
                    if (iM16252 == -4) {
                        if (c19703.m14573()) {
                            this.f52772 = true;
                            this.f52775 = false;
                        } else {
                            c10307 = c5221.f12253;
                            if (c10307 == null) {
                                return;
                            }
                            c19703.f59902 = c10307.f28534;
                            c19703.m51580();
                            this.f52775 &= !c19703.m14566();
                        }
                        if (!this.f52775) {
                            InterfaceC9232 interfaceC92311 = this.f52777;
                            interfaceC92311.getClass();
                            interfaceC92311.mo7100(c19703);
                            this.f52774 = null;
                        }
                    } else if (iM16252 == -3) {
                        return;
                    }
                } catch (C4280 e) {
                    e = e;
                    sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
                }
            }
            return;
        } catch (C4280 e2) {
            e = e2;
            sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
        }
        sb.append(this.f52767);
        C21334.m48348(sb.toString(), e);
        m40179();
        m40182();
        InterfaceC9232 interfaceC92312 = this.f52777;
        interfaceC92312.getClass();
        interfaceC92312.mo12();
        this.f52777 = null;
        this.f52776 = 0;
        this.f52775 = true;
        C10307 c103011 = this.f52767;
        c103011.getClass();
        InterfaceC9232 interfaceC9232M50202 = ((C22366) interfaceC11637).m50200(c103011);
        this.f52777 = interfaceC9232M50202;
        interfaceC9232M50202.mo7102(m16268());
    }

    @Override // p067l.AbstractC7054
    /* JADX INFO: renamed from: ۤ */
    public final void mo15352() {
        this.f52767 = null;
        this.f52769 = -9223372036854775807L;
        m40179();
        this.f52763 = -9223372036854775807L;
        if (this.f52777 != null) {
            m40182();
            InterfaceC9232 interfaceC9232 = this.f52777;
            interfaceC9232.getClass();
            interfaceC9232.mo12();
            this.f52777 = null;
            this.f52776 = 0;
        }
    }

    @Override // p067l.AbstractC7054, p067l.InterfaceC4114
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8296() {
        return this.f52762;
    }

    @Override // p067l.InterfaceC4114
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8299() {
        C10307 c10307 = this.f52767;
        if (c10307 != null) {
            if (C12826.equals(c10307.f28528, "application/x-media3-cues")) {
                InterfaceC19012 interfaceC19012 = this.f52766;
                interfaceC19012.getClass();
                if (interfaceC19012.mo20689(this.f52763) == Long.MIN_VALUE) {
                    try {
                        mo8294();
                        return true;
                    } catch (IOException unused) {
                        return false;
                    }
                }
            } else {
                if (!this.f52762) {
                    if (this.f52772) {
                        AbstractC19032 abstractC19032 = this.f52771;
                        long j = this.f52763;
                        if (abstractC19032 == null || abstractC19032.mo6890() <= 0 || abstractC19032.mo6892(abstractC19032.mo6890() - 1) <= j) {
                            AbstractC19032 abstractC19033 = this.f52764;
                            long j2 = this.f52763;
                            if ((abstractC19033 == null || abstractC19033.mo6890() <= 0 || abstractC19033.mo6892(abstractC19033.mo6890() - 1) <= j2) && this.f52774 != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    private void m40182() {
        this.f52774 = null;
        this.f52773 = -1;
        AbstractC19032 abstractC19032 = this.f52771;
        if (abstractC19032 != null) {
            abstractC19032.mo8();
            this.f52771 = null;
        }
        AbstractC19032 abstractC19033 = this.f52764;
        if (abstractC19033 != null) {
            abstractC19033.mo8();
            this.f52764 = null;
        }
    }

    /* JADX INFO: renamed from: ܽ֫ */
    private long m40180() {
        if (this.f52773 == -1) {
            return C14849.FOREVER_NS;
        }
        this.f52771.getClass();
        return this.f52773 >= this.f52771.mo6890() ? C14849.FOREVER_NS : this.f52771.mo6892(this.f52773);
    }

    /* JADX INFO: renamed from: ۧ֫ */
    private void m40179() {
        AbstractC16192 abstractC16192M36872of = AbstractC16192.m36872of();
        m40181(this.f52763);
        C6443 c6443 = new C6443(abstractC16192M36872of);
        Handler handler = this.f52765;
        if (handler != null) {
            handler.obtainMessage(1, c6443).sendToTarget();
            return;
        }
        AbstractC16192 abstractC16192 = c6443.f16655;
        InterfaceC10966 interfaceC10966 = this.f52761;
        interfaceC10966.mo25288(abstractC16192);
        interfaceC10966.mo25289(c6443);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            C6443 c6443 = (C6443) message.obj;
            AbstractC16192 abstractC16192 = c6443.f16655;
            InterfaceC10966 interfaceC10966 = this.f52761;
            interfaceC10966.mo25288(abstractC16192);
            interfaceC10966.mo25289(c6443);
            return true;
        }
        throw new IllegalStateException();
    }

    @SideEffectFree
    /* JADX INFO: renamed from: ᩳ */
    private long m40181(long j) {
        C23877.m52960(j != -9223372036854775807L);
        return j - m16257();
    }

    @RequiresNonNull({"streamFormat"})
    /* JADX INFO: renamed from: ֫֫ */
    private void m40178() {
        C23877.m52959("Legacy decoding is disabled, can't handle " + this.f52767.f28528 + " samples (expected application/x-media3-cues).", C12826.equals(this.f52767.f28528, "application/cea-608") || C12826.equals(this.f52767.f28528, "application/x-mp4-cea-608") || C12826.equals(this.f52767.f28528, "application/cea-708"));
    }

    @Override // p067l.InterfaceC19537
    /* JADX INFO: renamed from: ֫ */
    public final int mo18494(C10307 c10307) {
        if (C12826.equals(c10307.f28528, "application/x-media3-cues") || ((C22366) this.f52778).m50201(c10307)) {
            return C12832.m29410(c10307.f28546 == 0 ? 4 : 2, 0, 0, 0);
        }
        return C11669.m26824(c10307.f28528) ? C12832.m29410(1, 0, 0, 0) : C12832.m29410(0, 0, 0, 0);
    }
}
