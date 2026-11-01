package p067l;

import bin.p000mt.plus.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17436 {

    /* JADX INFO: renamed from: ֫ */
    public HashSet f52118;

    /* JADX INFO: renamed from: ܳ */
    public final C18107 f52120;

    /* JADX INFO: renamed from: ܿ */
    public C8460 f52122;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f52123;

    /* JADX INFO: renamed from: ۧ */
    public int f52119 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f52121 = -1;

    public C17436(C18107 c18107) {
        this.f52120 = c18107;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m39714() {
        return this.f52123;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m39706() {
        if (this.f52123) {
            throw new IllegalStateException("Already in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC19370 interfaceC19370 : c18107.m41254()) {
            if (!interfaceC19370.mo39147()) {
                interfaceC19370.setChecked(false);
            }
        }
        this.f52119 = 0;
        this.f52123 = true;
        this.f52121 = -1;
        m39696();
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m39712(int i) {
        if (this.f52123) {
            throw new IllegalStateException("Already in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC19370 interfaceC19370 : c18107.m41254()) {
            if (!interfaceC19370.mo39147()) {
                interfaceC19370.setChecked(false);
            }
        }
        List listM41240 = c18107.m41240();
        if (i >= listM41240.size()) {
            return;
        }
        ((InterfaceC19370) listM41240.get(i)).setChecked(true);
        this.f52119 = 1;
        this.f52123 = true;
        this.f52121 = i;
        m39696();
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m39710() {
        return this.f52121 != -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39707() {
        this.f52121 = -1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m39709(int i) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        List listM41240 = c18107.m41240();
        int i2 = this.f52121;
        if (i2 == -1) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) listM41240.get(i);
            if (interfaceC19370.mo39147()) {
                return false;
            }
            if (!interfaceC19370.isChecked()) {
                interfaceC19370.setChecked(true);
                this.f52119++;
            }
            this.f52121 = i;
            c18107.m41283();
            this.f52118 = null;
            return false;
        }
        int iMax = Math.max(i, this.f52121);
        for (int iMin = Math.min(i, i2); iMin <= iMax; iMin++) {
            InterfaceC19370 interfaceC19371 = (InterfaceC19370) listM41240.get(iMin);
            if (!interfaceC19371.mo39147() && !interfaceC19371.isChecked()) {
                interfaceC19371.setChecked(true);
                this.f52119++;
            }
        }
        this.f52121 = -1;
        c18107.m41283();
        this.f52118 = null;
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39702(InterfaceC19370 interfaceC19370, boolean z) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        if (interfaceC19370.isChecked() == z) {
            return;
        }
        interfaceC19370.setChecked(z);
        if (z) {
            this.f52119++;
        } else {
            this.f52119--;
        }
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m39703(InterfaceC19370 interfaceC19370) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        boolean zIsChecked = interfaceC19370.isChecked();
        boolean z = !zIsChecked;
        interfaceC19370.setChecked(z);
        if (!zIsChecked) {
            this.f52119++;
        } else {
            this.f52119--;
        }
        this.f52121 = -1;
        c18107.m41283();
        this.f52118 = null;
        return z;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m39713() {
        if (this.f52123) {
            return this.f52119 > 0;
        }
        throw new IllegalStateException("No in selection mode");
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m39711() {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        return this.f52119;
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m39705() {
        this.f52119 = 0;
        this.f52121 = -1;
        C18107 c18107 = this.f52120;
        Iterator it = c18107.m41254().iterator();
        while (it.hasNext()) {
            if (((InterfaceC19370) it.next()).isChecked()) {
                this.f52119++;
            }
        }
        if (this.f52119 == 0) {
            if (this.f52123) {
                this.f52123 = false;
                m39696();
            }
        } else if (!this.f52123) {
            this.f52123 = true;
            m39696();
        }
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m39716() {
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        if (!this.f52123) {
            for (InterfaceC19370 interfaceC19370 : c18107.m41254()) {
                if (!interfaceC19370.mo39147()) {
                    interfaceC19370.setChecked(false);
                }
            }
            this.f52119 = 0;
        } else {
            HashSet hashSet = this.f52118;
            if (hashSet != null) {
                this.f52119 = 0;
                for (InterfaceC19370 interfaceC19371 : c18107.m41240()) {
                    if (!interfaceC19371.mo39147()) {
                        interfaceC19371.setChecked(hashSet.contains(interfaceC19371.getPath()));
                        if (interfaceC19371.isChecked()) {
                            this.f52119++;
                        }
                    }
                }
                if (this.f52119 == 0 && this.f52123) {
                    this.f52123 = false;
                    m39696();
                }
                this.f52118 = null;
                c18107.m41283();
                return;
            }
        }
        HashSet hashSet2 = this.f52119 > 0 ? new HashSet() : null;
        for (InterfaceC19370 interfaceC19372 : c18107.m41240()) {
            if (!interfaceC19372.mo39147()) {
                if (!interfaceC19372.isChecked()) {
                    interfaceC19372.setChecked(true);
                    this.f52119++;
                } else if (hashSet2 != null) {
                    hashSet2.add(interfaceC19372.getPath());
                }
            }
        }
        if (this.f52119 == 0) {
            if (this.f52123) {
                this.f52123 = false;
                m39696();
            }
        } else if (!this.f52123) {
            this.f52123 = true;
            m39696();
        }
        c18107.m41283();
        this.f52118 = hashSet2;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m39704() {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        for (InterfaceC19370 interfaceC19370 : c18107.m41240()) {
            if (!interfaceC19370.mo39147()) {
                if (interfaceC19370.isChecked()) {
                    interfaceC19370.setChecked(false);
                    this.f52119--;
                } else {
                    interfaceC19370.setChecked(true);
                    this.f52119++;
                }
            }
        }
        if (this.f52119 == 0) {
            this.f52123 = false;
            m39696();
        }
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m39715() {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        if (this.f52119 == 0) {
            return;
        }
        C1782 c1782 = new C1782();
        List<InterfaceC19370> listM41240 = c18107.m41240();
        for (InterfaceC19370 interfaceC19370 : listM41240) {
            if (interfaceC19370.isChecked()) {
                c1782.add(m39695(interfaceC19370));
            }
        }
        for (InterfaceC19370 interfaceC19371 : listM41240) {
            if (!interfaceC19371.mo39147() && !interfaceC19371.isChecked() && c1782.contains(m39695(interfaceC19371))) {
                interfaceC19371.setChecked(true);
                this.f52119++;
            }
        }
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39699(long j, long j2) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        for (InterfaceC19370 interfaceC19370 : c18107.m41240()) {
            if (!interfaceC19370.mo39147()) {
                if (!interfaceC19370.mo26449()) {
                    if (interfaceC19370.isChecked()) {
                        interfaceC19370.setChecked(false);
                        this.f52119--;
                    }
                } else {
                    long size = interfaceC19370.getSize();
                    if (j <= size && size < j2) {
                        if (!interfaceC19370.isChecked()) {
                            interfaceC19370.setChecked(true);
                            this.f52119++;
                        }
                    } else if (interfaceC19370.isChecked()) {
                        interfaceC19370.setChecked(false);
                        this.f52119--;
                    }
                }
            }
        }
        if (m39713()) {
            c18107.m41283();
            this.f52118 = null;
        } else {
            m39697();
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39701(InterfaceC1209 interfaceC1209) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        for (InterfaceC19370 interfaceC19370 : c18107.m41240()) {
            if (!interfaceC19370.mo39147()) {
                if (interfaceC1209.mo14675(interfaceC19370.getName())) {
                    if (!interfaceC19370.isChecked()) {
                        interfaceC19370.setChecked(true);
                        this.f52119++;
                    }
                } else if (interfaceC19370.isChecked()) {
                    interfaceC19370.setChecked(false);
                    this.f52119--;
                }
            }
        }
        if (m39713()) {
            c18107.m41283();
            this.f52118 = null;
        } else {
            m39697();
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m39708(long j, long j2) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        for (InterfaceC19370 interfaceC19370 : c18107.m41240()) {
            if (!interfaceC19370.mo39147()) {
                long time = interfaceC19370.getTime();
                if (j <= time && time < j2) {
                    if (!interfaceC19370.isChecked()) {
                        interfaceC19370.setChecked(true);
                        this.f52119++;
                    }
                } else if (interfaceC19370.isChecked()) {
                    interfaceC19370.setChecked(false);
                    this.f52119--;
                }
            }
        }
        if (m39713()) {
            c18107.m41283();
            this.f52118 = null;
        } else {
            m39697();
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39698(int i) {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        C18107 c18107 = this.f52120;
        if (c18107.m41265()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f52121 = -1;
        if (this.f52119 == 0) {
            return;
        }
        C1782 c1782 = new C1782();
        List<InterfaceC19370> listM41240 = c18107.m41240();
        for (InterfaceC19370 interfaceC19370 : listM41240) {
            if (interfaceC19370.isChecked()) {
                long[] jArrM16859 = C7300.m16859(i, interfaceC19370.getTime());
                c1782.add(new C10732(jArrM16859[0], jArrM16859[1]));
            }
        }
        C10732[] c10732Arr = (C10732[]) c1782.toArray(new C10732[0]);
        for (InterfaceC19370 interfaceC19371 : listM41240) {
            if (!interfaceC19371.mo39147() && !interfaceC19371.isChecked()) {
                for (C10732 c10732 : c10732Arr) {
                    if (c10732.m24674(interfaceC19371.getTime())) {
                        interfaceC19371.setChecked(true);
                        this.f52119++;
                        break;
                    }
                }
            }
        }
        c18107.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39697() {
        if (!this.f52123) {
            throw new IllegalStateException("No in selection mode");
        }
        this.f52119 = 0;
        this.f52123 = false;
        this.f52121 = -1;
        m39696();
        this.f52120.m41283();
        this.f52118 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39700(C8460 c8460) {
        this.f52122 = c8460;
    }

    /* JADX INFO: renamed from: ܺ */
    private void m39696() {
        C8460 c8460 = this.f52122;
        if (c8460 != null) {
            C18107.m41195((C18107) c8460.f22693, (C11245) c8460.f22694);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m39695(InterfaceC19370 interfaceC19370) {
        if (interfaceC19370.isDirectory()) {
            return "/";
        }
        int iLastIndexOf = interfaceC19370.getName().lastIndexOf(46);
        return iLastIndexOf == -1 ? "." : interfaceC19370.getName().substring(iLastIndexOf + 1).toLowerCase();
    }
}
