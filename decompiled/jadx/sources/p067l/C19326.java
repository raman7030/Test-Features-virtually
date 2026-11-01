package p067l;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩳۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28FF */
/* JADX INFO: loaded from: classes5.dex */
public class C19326 extends ArrayList implements InterfaceC11495 {

    /* JADX INFO: renamed from: ᩸ */
    public int f57707;

    /* JADX INFO: renamed from: ᩹ */
    public Boolean f57708;

    /* JADX INFO: renamed from: ᩶ */
    public final HashMap f57706 = new HashMap();

    /* JADX INFO: renamed from: ۙ */
    public final C17441 f57705 = new C17441();

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f57704 = null;

    /* JADX INFO: renamed from: ۢ */
    public boolean mo32634() {
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo44062(int i, int i2) {
    }

    public C19326(int i, List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19370 interfaceC19370 = (InterfaceC19370) it.next();
            String path = interfaceC19370.getPath();
            Uri uriBuild = new Uri.Builder().scheme("mt_media").path(path).build();
            C23718 c23718 = new C23718();
            c23718.m52736(uriBuild);
            c23718.m52737(interfaceC19370);
            c23718.m52738(interfaceC19370.mo39151());
            C13010 c13010M52735 = c23718.m52735();
            this.f57706.put(path, c13010M52735);
            add(c13010M52735);
        }
        this.f57707 = i;
    }

    @Override // p067l.InterfaceC11495
    /* JADX INFO: renamed from: ᩷ */
    public final void mo18262() {
        int iM28313;
        m44059();
        int i = this.f57707;
        C17441 c17441 = this.f57705;
        if (c17441.isEmpty()) {
            iM28313 = i - 1;
            if (iM28313 < 0) {
                iM28313 = size() - 1;
            }
        } else {
            iM28313 = c17441.m28313();
        }
        m44063(iM28313);
        mo44062(i, iM28313);
    }

    @Override // p067l.InterfaceC11495
    /* JADX INFO: renamed from: ۜ */
    public final void mo18257() {
        int iIntValue;
        m44059();
        if (size() == 1) {
            return;
        }
        int i = this.f57707;
        int size = size();
        C17441 c17441 = this.f57705;
        int i2 = 0;
        if (c17441.isEmpty() || c17441.getInt(c17441.size() - 1) != i) {
            c17441.add(i);
            if (c17441.size() > 100) {
                c17441.mo5829(0);
            }
        }
        if (mo32634()) {
            ArrayList arrayList = this.f57704;
            if (arrayList == null) {
                this.f57704 = new ArrayList(size - 1);
                for (int i3 = 0; i3 < size; i3++) {
                    if (i3 != i) {
                        this.f57704.add(Integer.valueOf(i3));
                    }
                }
                Collections.shuffle(this.f57704);
            } else if (arrayList.isEmpty()) {
                for (int i4 = 0; i4 < size; i4++) {
                    this.f57704.add(Integer.valueOf(i4));
                }
                Collections.shuffle(this.f57704);
                if (((Integer) this.f57704.get(0)).intValue() == i) {
                    this.f57704.remove(0);
                    this.f57704.add(Integer.valueOf(i));
                }
            }
            iIntValue = ((Integer) this.f57704.get(0)).intValue();
            this.f57704.remove(0);
        } else {
            iIntValue = i + 1;
            if (iIntValue < size) {
            }
            m44063(i2);
            mo44062(i, i2);
        }
        i2 = iIntValue;
        m44063(i2);
        mo44062(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m44061(int i) {
        m44059();
        int i2 = this.f57707;
        if (i != i2) {
            C17441 c17441 = this.f57705;
            if (c17441.isEmpty() || c17441.getInt(c17441.size() - 1) != i2) {
                c17441.add(i2);
                if (c17441.size() > 100) {
                    c17441.mo5829(0);
                }
            }
            this.f57704 = null;
            m44063(i);
            mo44062(i2, i);
        }
    }

    @Override // p067l.InterfaceC11495
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo18260() {
        m44059();
        if (mo32634()) {
            ArrayList arrayList = this.f57704;
            if (arrayList == null || !arrayList.isEmpty()) {
                return false;
            }
        } else if (this.f57707 != size() - 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۡ */
    private void m44059() {
        boolean zMo32634 = mo32634();
        Boolean bool = this.f57708;
        if (bool == null || bool.booleanValue() != zMo32634) {
            this.f57704 = null;
            this.f57708 = Boolean.valueOf(zMo32634);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC11495
    /* JADX INFO: renamed from: ܳ */
    public final C13010 mo18258() {
        return (C13010) get(this.f57707);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p067l.InterfaceC11495
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC19370 mo18259() {
        return m44058((C13010) get(this.f57707));
    }

    @Override // p067l.InterfaceC11495
    /* JADX INFO: renamed from: ᩳ */
    public final int mo18261() {
        return this.f57707;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m44063(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException();
        }
        this.f57707 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13010 m44060(String str) {
        return (C13010) this.f57706.get(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC19370 m44058(C13010 c13010) {
        C13660 c13660 = c13010.f36611;
        C12826.requireNonNull(c13660);
        Object obj = c13660.f38432;
        C12826.requireNonNull(obj);
        return (InterfaceC19370) obj;
    }
}
