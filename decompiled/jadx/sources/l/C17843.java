package l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28FF */
/* JADX INFO: loaded from: classes5.dex */
public class C17843 extends ArrayList implements InterfaceC9603 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f54509;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Boolean f54510;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final HashMap f54508 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15859 f54507 = new C15859();

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f54506 = null;

    /* JADX INFO: renamed from: ۢ */
    public boolean mo30570() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void mo41816(int i, int i2) {
    }

    public C17843(int i, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            String path = interfaceC17889.getPath();
            Uri uriBuild = new Uri.Builder().scheme("mt_media").path(path).build();
            C22464 c22464 = new C22464();
            c22464.m50395(uriBuild);
            c22464.m50396(interfaceC17889);
            c22464.m50397(interfaceC17889.mo36985());
            C11197 c11197M50394 = c22464.m50394();
            this.f54508.put(path, c11197M50394);
            add(c11197M50394);
        }
        this.f54509 = i;
    }

    @Override // l.InterfaceC9603
    /* JADX INFO: renamed from: ᩷ */
    public final void mo16337() {
        int iM26284;
        m41813();
        int i = this.f54509;
        C15859 c15859 = this.f54507;
        if (c15859.isEmpty()) {
            iM26284 = i - 1;
            if (iM26284 < 0) {
                iM26284 = size() - 1;
            }
        } else {
            iM26284 = c15859.m26284();
        }
        m41817(iM26284);
        mo41816(i, iM26284);
    }

    @Override // l.InterfaceC9603
    /* JADX INFO: renamed from: ۜ */
    public final void mo16332() {
        int iIntValue;
        m41813();
        if (size() == 1) {
            return;
        }
        int i = this.f54509;
        int size = size();
        C15859 c15859 = this.f54507;
        int i2 = 0;
        if (c15859.isEmpty() || c15859.getInt(c15859.size() - 1) != i) {
            c15859.add(i);
            if (c15859.size() > 100) {
                c15859.mo3542(0);
            }
        }
        if (mo30570()) {
            ArrayList arrayList = this.f54506;
            if (arrayList == null) {
                this.f54506 = new ArrayList(size - 1);
                for (int i3 = 0; i3 < size; i3++) {
                    if (i3 != i) {
                        this.f54506.add(Integer.valueOf(i3));
                    }
                }
                Collections.shuffle(this.f54506);
            } else if (arrayList.isEmpty()) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.f54506.add(Integer.valueOf(i4));
                }
                Collections.shuffle(this.f54506);
                if (((Integer) this.f54506.get(0)).intValue() == i) {
                    this.f54506.remove(0);
                    this.f54506.add(Integer.valueOf(i));
                }
            }
            iIntValue = ((Integer) this.f54506.get(0)).intValue();
            this.f54506.remove(0);
        } else {
            iIntValue = i + 1;
            if (iIntValue < size) {
            }
            m41817(i2);
            mo41816(i, i2);
        }
        i2 = iIntValue;
        m41817(i2);
        mo41816(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m41815(int i) {
        m41813();
        int i2 = this.f54509;
        if (i != i2) {
            C15859 c15859 = this.f54507;
            if (c15859.isEmpty() || c15859.getInt(c15859.size() - 1) != i2) {
                c15859.add(i2);
                if (c15859.size() > 100) {
                    c15859.mo3542(0);
                }
            }
            this.f54506 = null;
            m41817(i);
            mo41816(i2, i);
        }
    }

    @Override // l.InterfaceC9603
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo16335() {
        m41813();
        if (mo30570()) {
            ArrayList arrayList = this.f54506;
            if (arrayList == null || !arrayList.isEmpty()) {
                return false;
            }
        } else if (this.f54509 != size() - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private void m41813() {
        boolean zMo30570 = mo30570();
        Boolean bool = this.f54510;
        if (bool == null || bool.booleanValue() != zMo30570) {
            this.f54506 = null;
            this.f54510 = Boolean.valueOf(zMo30570);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC9603
    /* JADX INFO: renamed from: ܳ */
    public final C11197 mo16333() {
        return (C11197) get(this.f54509);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.InterfaceC9603
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC17889 mo16334() {
        return m41812((C11197) get(this.f54509));
    }

    @Override // l.InterfaceC9603
    /* JADX INFO: renamed from: ᩳ */
    public final int mo16336() {
        return this.f54509;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m41817(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f54509 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11197 m41814(String str) {
        return (C11197) this.f54508.get(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC17889 m41812(C11197 c11197) {
        C11881 c11881 = c11197.f33612;
        C11003.requireNonNull(c11881);
        Object obj = c11881.f35422;
        C11003.requireNonNull(obj);
        return (InterfaceC17889) obj;
    }
}
