package l;

import bin.mt.plus.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ܺۢܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15854 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public HashSet f48980;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16560 f48982;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6410 f48984;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f48985;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f48981 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f48983 = -1;

    public C15854(C16560 c16560) {
        this.f48982 = c16560;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m37542() {
        return this.f48985;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m37534() {
        if (this.f48985) {
            throw new IllegalStateException("Already in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
            if (!interfaceC17889.mo36981()) {
                interfaceC17889.setChecked(false);
            }
        }
        this.f48981 = 0;
        this.f48985 = true;
        this.f48983 = -1;
        m37524();
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m37540(int i) {
        if (this.f48985) {
            throw new IllegalStateException("Already in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
            if (!interfaceC17889.mo36981()) {
                interfaceC17889.setChecked(false);
            }
        }
        List listM39014 = c16560.m39014();
        if (i >= listM39014.size()) {
            return;
        }
        ((InterfaceC17889) listM39014.get(i)).setChecked(true);
        this.f48981 = 1;
        this.f48985 = true;
        this.f48983 = i;
        m37524();
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m37538() {
        return this.f48983 != -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37535() {
        this.f48983 = -1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m37537(int i) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        List listM39014 = c16560.m39014();
        int i2 = this.f48983;
        if (i2 == -1) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) listM39014.get(i);
            if (interfaceC17889.mo36981()) {
                return false;
            }
            if (!interfaceC17889.isChecked()) {
                interfaceC17889.setChecked(true);
                this.f48981++;
            }
            this.f48983 = i;
            c16560.m39057();
            this.f48980 = null;
            return false;
        }
        int iMax = Math.max(i, this.f48983);
        for (int iMin = Math.min(i, i2); iMin <= iMax; iMin++) {
            InterfaceC17889 interfaceC178810 = (InterfaceC17889) listM39014.get(iMin);
            if (!interfaceC178810.mo36981() && !interfaceC178810.isChecked()) {
                interfaceC178810.setChecked(true);
                this.f48981++;
            }
        }
        this.f48983 = -1;
        c16560.m39057();
        this.f48980 = null;
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37530(InterfaceC17889 interfaceC17889, boolean z) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        if (interfaceC17889.isChecked() == z) {
            return;
        }
        interfaceC17889.setChecked(z);
        if (z) {
            this.f48981++;
        } else {
            this.f48981--;
        }
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m37531(InterfaceC17889 interfaceC17889) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        boolean zIsChecked = interfaceC17889.isChecked();
        boolean z = !zIsChecked;
        interfaceC17889.setChecked(z);
        if (!zIsChecked) {
            this.f48981++;
        } else {
            this.f48981--;
        }
        this.f48983 = -1;
        c16560.m39057();
        this.f48980 = null;
        return z;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m37541() {
        if (this.f48985) {
            return this.f48981 > 0;
        }
        throw new IllegalStateException("No in selection mode");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m37539() {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        return this.f48981;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m37533() {
        this.f48981 = 0;
        this.f48983 = -1;
        C16560 c16560 = this.f48982;
        Iterator it = c16560.m39028().iterator();
        while (it.hasNext()) {
            if (((InterfaceC17889) it.next()).isChecked()) {
                this.f48981++;
            }
        }
        if (this.f48981 == 0) {
            if (this.f48985) {
                this.f48985 = false;
                m37524();
            }
        } else if (!this.f48985) {
            this.f48985 = true;
            m37524();
        }
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m37544() {
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        if (!this.f48985) {
            for (InterfaceC17889 interfaceC17889 : c16560.m39028()) {
                if (!interfaceC17889.mo36981()) {
                    interfaceC17889.setChecked(false);
                }
            }
            this.f48981 = 0;
        } else {
            HashSet hashSet = this.f48980;
            if (hashSet != null) {
                this.f48981 = 0;
                for (InterfaceC17889 interfaceC178810 : c16560.m39014()) {
                    if (!interfaceC178810.mo36981()) {
                        interfaceC178810.setChecked(hashSet.contains(interfaceC178810.getPath()));
                        if (interfaceC178810.isChecked()) {
                            this.f48981++;
                        }
                    }
                }
                if (this.f48981 == 0 && this.f48985) {
                    this.f48985 = false;
                    m37524();
                }
                this.f48980 = null;
                c16560.m39057();
                return;
            }
        }
        HashSet hashSet2 = this.f48981 > 0 ? new HashSet() : null;
        for (InterfaceC17889 interfaceC178811 : c16560.m39014()) {
            if (!interfaceC178811.mo36981()) {
                if (!interfaceC178811.isChecked()) {
                    interfaceC178811.setChecked(true);
                    this.f48981++;
                } else if (hashSet2 != null) {
                    hashSet2.add(interfaceC178811.getPath());
                }
            }
        }
        if (this.f48981 == 0) {
            if (this.f48985) {
                this.f48985 = false;
                m37524();
            }
        } else if (!this.f48985) {
            this.f48985 = true;
            m37524();
        }
        c16560.m39057();
        this.f48980 = hashSet2;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m37532() {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        for (InterfaceC17889 interfaceC17889 : c16560.m39014()) {
            if (!interfaceC17889.mo36981()) {
                if (interfaceC17889.isChecked()) {
                    interfaceC17889.setChecked(false);
                    this.f48981--;
                } else {
                    interfaceC17889.setChecked(true);
                    this.f48981++;
                }
            }
        }
        if (this.f48981 == 0) {
            this.f48985 = false;
            m37524();
        }
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m37543() {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        if (this.f48981 == 0) {
            return;
        }
        C18955 c18955 = new C18955();
        List<InterfaceC17889> listM39014 = c16560.m39014();
        for (InterfaceC17889 interfaceC17889 : listM39014) {
            if (interfaceC17889.isChecked()) {
                c18955.add(m37523(interfaceC17889));
            }
        }
        for (InterfaceC17889 interfaceC178810 : listM39014) {
            if (!interfaceC178810.mo36981() && !interfaceC178810.isChecked() && c18955.contains(m37523(interfaceC178810))) {
                interfaceC178810.setChecked(true);
                this.f48981++;
            }
        }
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37527(long j, long j2) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        for (InterfaceC17889 interfaceC17889 : c16560.m39014()) {
            if (!interfaceC17889.mo36981()) {
                if (!interfaceC17889.mo24437()) {
                    if (interfaceC17889.isChecked()) {
                        interfaceC17889.setChecked(false);
                        this.f48981--;
                    }
                } else {
                    long size = interfaceC17889.getSize();
                    if (j <= size && size < j2) {
                        if (!interfaceC17889.isChecked()) {
                            interfaceC17889.setChecked(true);
                            this.f48981++;
                        }
                    } else if (interfaceC17889.isChecked()) {
                        interfaceC17889.setChecked(false);
                        this.f48981--;
                    }
                }
            }
        }
        if (m37541()) {
            c16560.m39057();
            this.f48980 = null;
        } else {
            m37525();
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37529(InterfaceC7397 interfaceC7397) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        for (InterfaceC17889 interfaceC17889 : c16560.m39014()) {
            if (!interfaceC17889.mo36981()) {
                if (interfaceC7397.mo12795(interfaceC17889.getName())) {
                    if (!interfaceC17889.isChecked()) {
                        interfaceC17889.setChecked(true);
                        this.f48981++;
                    }
                } else if (interfaceC17889.isChecked()) {
                    interfaceC17889.setChecked(false);
                    this.f48981--;
                }
            }
        }
        if (m37541()) {
            c16560.m39057();
            this.f48980 = null;
        } else {
            m37525();
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m37536(long j, long j2) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        for (InterfaceC17889 interfaceC17889 : c16560.m39014()) {
            if (!interfaceC17889.mo36981()) {
                long time = interfaceC17889.getTime();
                if (j <= time && time < j2) {
                    if (!interfaceC17889.isChecked()) {
                        interfaceC17889.setChecked(true);
                        this.f48981++;
                    }
                } else if (interfaceC17889.isChecked()) {
                    interfaceC17889.setChecked(false);
                    this.f48981--;
                }
            }
        }
        if (m37541()) {
            c16560.m39057();
            this.f48980 = null;
        } else {
            m37525();
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37526(int i) {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        C16560 c16560 = this.f48982;
        if (c16560.m39039()) {
            throw new IllegalStateException("In paste mode");
        }
        this.f48983 = -1;
        if (this.f48981 == 0) {
            return;
        }
        C18955 c18955 = new C18955();
        List<InterfaceC17889> listM39014 = c16560.m39014();
        for (InterfaceC17889 interfaceC17889 : listM39014) {
            if (interfaceC17889.isChecked()) {
                long[] jArrM14949 = C5189.m14949(i, interfaceC17889.getTime());
                c18955.add(new C8800(jArrM14949[0], jArrM14949[1]));
            }
        }
        C8800[] c8800Arr = (C8800[]) c18955.toArray(new C8800[0]);
        for (InterfaceC17889 interfaceC178810 : listM39014) {
            if (!interfaceC178810.mo36981() && !interfaceC178810.isChecked()) {
                for (C8800 c8800 : c8800Arr) {
                    if (c8800.m22704(interfaceC178810.getTime())) {
                        interfaceC178810.setChecked(true);
                        this.f48981++;
                        break;
                    }
                }
            }
        }
        c16560.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37525() {
        if (!this.f48985) {
            throw new IllegalStateException("No in selection mode");
        }
        this.f48981 = 0;
        this.f48985 = false;
        this.f48983 = -1;
        m37524();
        this.f48982.m39057();
        this.f48980 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37528(C6410 c6410) {
        this.f48984 = c6410;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    private void m37524() {
        C6410 c6410 = this.f48984;
        if (c6410 != null) {
            C16560.m38969((C16560) c6410.f19821, (C9340) c6410.f19822);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m37523(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.isDirectory()) {
            return "/";
        }
        int iLastIndexOf = interfaceC17889.getName().lastIndexOf(46);
        return iLastIndexOf == -1 ? "." : interfaceC17889.getName().substring(iLastIndexOf + 1).toLowerCase();
    }
}
