package l;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.ۡܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I62U */
/* JADX INFO: loaded from: classes3.dex */
public class C9015 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public ArrayList f27373 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f27374 = 0;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27375 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object mo23262() {
        Object objM23263 = m23263(0);
        int i = this.f27374 + 1;
        this.f27374 = i;
        ArrayList arrayList = this.f27373;
        if (i == arrayList.size()) {
            this.f27374 = 0;
            arrayList.clear();
        }
        return objM23263;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23261(InterfaceC22420 interfaceC22420) {
        this.f27373.add(interfaceC22420);
    }

    public int size() {
        return this.f27373.size() - this.f27374;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m23263(int i) {
        int i2 = this.f27374 + i;
        ArrayList arrayList = this.f27373;
        if (i2 >= arrayList.size()) {
            StringBuilder sbM32308 = C13325.m32308(i2, "queue index ", " > last index ");
            sbM32308.append(arrayList.size() - 1);
            throw new NoSuchElementException(sbM32308.toString());
        }
        if (i2 < 0) {
            throw new NoSuchElementException(C18307.m42645(i2, "queue index ", " < 0"));
        }
        if (i2 > this.f27375) {
            this.f27375 = i2;
        }
        return arrayList.get(i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            sb.append(m23263(i));
            i++;
            if (i < size) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
