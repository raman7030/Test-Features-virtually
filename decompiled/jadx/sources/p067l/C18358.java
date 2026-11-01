package p067l;

import java.io.Closeable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 83ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C18358 implements Closeable {

    /* JADX INFO: renamed from: ۗ */
    public final Map f54808;

    /* JADX INFO: renamed from: ۙ */
    public final Set f54809;

    /* JADX INFO: renamed from: ۛ */
    public final Set f54810;

    /* JADX INFO: renamed from: ۤ */
    public final LinkedHashSet f54811;

    /* JADX INFO: renamed from: ۨ */
    public C23623 f54812;

    /* JADX INFO: renamed from: ۫ */
    public Set f54813;

    /* JADX INFO: renamed from: ۬ */
    public Set f54814;

    /* JADX INFO: renamed from: ᩶ */
    public InterfaceC13035 f54815;

    /* JADX INFO: renamed from: ᩸ */
    public final LinkedHashSet f54816;

    /* JADX INFO: renamed from: ᩹ */
    public final LinkedHashSet f54817;

    /* JADX INFO: renamed from: ᩺ */
    public final Set f54818;

    public final String toString() {
        return "javac Filer";
    }

    public C18358(C5127 c5127) {
        this.f54815 = (InterfaceC13035) c5127.m10904(InterfaceC13035.class);
        C22602.m50653(c5127);
        this.f54812 = C23623.m52439(c5127);
        C5473.m12055(c5127);
        C8200.m18988(c5127);
        C22004.m49577(c5127);
        this.f54810 = C21562.synchronizedSet(new LinkedHashSet());
        this.f54809 = C21562.synchronizedSet(new LinkedHashSet());
        this.f54813 = C21562.synchronizedSet(new LinkedHashSet());
        this.f54814 = C21562.synchronizedSet(new LinkedHashSet());
        this.f54808 = C21562.synchronizedMap(new LinkedHashMap());
        this.f54818 = C21562.synchronizedSet(new LinkedHashSet());
        this.f54817 = new LinkedHashSet();
        this.f54816 = new LinkedHashSet();
        this.f54811 = new LinkedHashSet();
        C6953.m15930(c5127).m15935(EnumC21706.PROCESSING);
        C13565.m30871(c5127).m30873(EnumC2483.f3933);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m41798() {
        return (this.f54813.isEmpty() && this.f54808.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ */
    public final Set m41797() {
        return this.f54814;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Map m41794() {
        return this.f54808;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m41799() {
        Set set = this.f54818;
        if (set.isEmpty()) {
            return;
        }
        C12895 c12895 = C15675.f45417;
        this.f54812.m9354(new C12895("compiler", "proc.unclosed.type.files", set));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41795(Collection collection, Collection collection2) {
        this.f54810.addAll(collection);
        this.f54811.addAll(collection2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f54813.clear();
        this.f54814.clear();
        this.f54808.clear();
        this.f54811.clear();
        this.f54810.clear();
        this.f54809.clear();
        this.f54818.clear();
        this.f54817.clear();
        this.f54816.clear();
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m41796() {
        this.f54813.clear();
        this.f54814.clear();
        this.f54808.clear();
    }
}
