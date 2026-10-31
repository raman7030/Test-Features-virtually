package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩺ܳ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 4ARJ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23041 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final List f74148 = C20195.unmodifiableList(Arrays.asList("INVALID", "BASIC", "RULE_START", "BLOCK_START", "PLUS_BLOCK_START", "STAR_BLOCK_START", "TOKEN_START", "RULE_STOP", "BLOCK_END", "STAR_LOOP_BACK", "STAR_LOOP_ENTRY", "PLUS_LOOP_BACK", "LOOP_END"));

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23936 f74152;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f74154;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21631 f74149 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74153 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f74150 = false;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f74151 = new ArrayList(4);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo13211();

    public final int hashCode() {
        return this.f74153;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC23041) && this.f74153 == ((AbstractC23041) obj).f74153;
    }

    public final String toString() {
        return String.valueOf(this.f74153);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m51210() {
        return this.f74151.size();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m51212(AbstractC12938 abstractC12938) {
        ArrayList<AbstractC12938> arrayList = this.f74151;
        int size = arrayList.size();
        if (arrayList.isEmpty()) {
            this.f74150 = abstractC12938.mo5546();
        } else if (this.f74150 != abstractC12938.mo5546()) {
            System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", Integer.valueOf(this.f74153));
            this.f74150 = false;
        }
        for (AbstractC12938 abstractC12939 : arrayList) {
            if (abstractC12939.f38806.f74153 == abstractC12938.f38806.f74153) {
                if (abstractC12939.mo3365() != null && abstractC12938.mo3365() != null && abstractC12939.mo3365().equals(abstractC12938.mo3365())) {
                    return;
                }
                if (abstractC12939.mo5546() && abstractC12938.mo5546()) {
                    return;
                }
            }
        }
        arrayList.add(size, abstractC12938);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC12938 m51211(int i) {
        return (AbstractC12938) this.f74151.get(i);
    }
}
