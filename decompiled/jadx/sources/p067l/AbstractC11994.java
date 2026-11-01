package p067l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۤۜܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11994 {

    /* JADX INFO: renamed from: ֫ */
    public final int f33445;

    /* JADX INFO: renamed from: ۧ */
    public ArrayList f33446;

    /* JADX INFO: renamed from: ܽ */
    public final int f33447;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7575(C18107 c18107);

    /* JADX INFO: renamed from: ۧ */
    public boolean mo21944(C18107 c18107) {
        return true;
    }

    /* JADX INFO: renamed from: ܳ */
    public boolean mo11888() {
        return true;
    }

    /* JADX INFO: renamed from: ܿ */
    public boolean mo27428() {
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public boolean mo27429() {
        return false;
    }

    public AbstractC11994(int i, int i2) {
        this.f33447 = i;
        this.f33445 = i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m27427() {
        return this.f33447;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m27424() {
        return this.f33445;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27425(AbstractC11994 abstractC11994) {
        if (this.f33446 == null) {
            this.f33446 = new ArrayList();
        }
        this.f33446.add(abstractC11994);
    }

    /* JADX INFO: renamed from: ۧ */
    public final List m27426() {
        ArrayList arrayList = this.f33446;
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }
}
