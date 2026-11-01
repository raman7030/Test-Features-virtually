package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ARJ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24266 {

    /* JADX INFO: renamed from: ᩻ */
    public static final List f76890 = C21562.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));

    /* JADX INFO: renamed from: ܽ */
    public C25117 f76894;

    /* JADX INFO: renamed from: ᩳ */
    public int f76896;

    /* JADX INFO: renamed from: ֫ */
    public C22926 f76891 = null;

    /* JADX INFO: renamed from: ܿ */
    public int f76895 = -1;

    /* JADX INFO: renamed from: ۧ */
    public boolean f76892 = false;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f76893 = new ArrayList(4);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo15093();

    public final int hashCode() {
        return this.f76895;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC24266) && this.f76895 == ((AbstractC24266) obj).f76895;
    }

    public final String toString() {
        return String.valueOf(this.f76895);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53603() {
        return this.f76893.size();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53605(AbstractC14664 abstractC14664) {
        ArrayList<AbstractC14664> arrayList = this.f76893;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.f76892 = abstractC14664.mo7776();
        } else if (this.f76892 != abstractC14664.mo7776()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f76895));
            this.f76892 = false;
        }
        for (AbstractC14664 abstractC14665 : arrayList) {
            if (abstractC14665.f41850.f76895 == abstractC14664.f41850.f76895) {
                if (abstractC14665.mo5684() != null && abstractC14664.mo5684() != null && abstractC14665.mo5684().equals(abstractC14664.mo5684())) {
                    return;
                }
                if (abstractC14665.mo7776() && abstractC14664.mo7776()) {
                    return;
                }
            }
        }
        arrayList.add(size, abstractC14664);
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC14664 m53604(int i) {
        return (AbstractC14664) this.f76893.get(i);
    }
}
