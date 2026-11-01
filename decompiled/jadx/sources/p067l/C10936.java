package p067l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I62U */
/* JADX INFO: loaded from: classes3.dex */
public class C10936 {

    /* JADX INFO: renamed from: ֫ */
    public ArrayList f30309 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public int f30310 = 0;

    /* JADX INFO: renamed from: ܽ */
    public int f30311 = -1;

    /* JADX INFO: renamed from: ܿ */
    public Object mo25206() {
        Object objM25207 = m25207(0);
        int i = this.f30310 + 1;
        this.f30310 = i;
        ArrayList arrayList = this.f30309;
        if (i == arrayList.size()) {
            this.f30310 = 0;
            arrayList.clear();
        }
        return objM25207;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25205(InterfaceC23676 interfaceC23676) {
        this.f30309.add(interfaceC23676);
    }

    public int size() {
        return this.f30309.size() - this.f30310;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m25207(int i) {
        int i2 = this.f30310 + i;
        ArrayList arrayList = this.f30309;
        if (i2 >= arrayList.size()) {
            StringBuilder sbM34408 = C15033.m34408(i2, "queue index ", " > last index ");
            sbM34408.append(arrayList.size() - 1);
            throw new NoSuchElementException(sbM34408.toString());
        }
        if (i2 < 0) {
            throw new NoSuchElementException(C19768.m44906(i2, "queue index ", " < 0"));
        }
        if (i2 > this.f30311) {
            this.f30311 = i2;
        }
        return arrayList.get(i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            sb.append(m25207(i));
            i++;
            if (i < size) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
