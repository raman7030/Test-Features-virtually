package l;

import java.io.Closeable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 83ZS */
/* JADX INFO: loaded from: classes4.dex */
public final class C16824 implements Closeable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Map f51627;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Set f51628;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final Set f51629;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f51630;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C22364 f51631;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public Set f51632;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public Set f51633;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC11223 f51634;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f51635;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final LinkedHashSet f51636;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final Set f51637;

    public final String toString() {
        return "javac Filer";
    }

    public C16824(C2903 c2903) {
        this.f51634 = (InterfaceC11223) c2903.m8837(InterfaceC11223.class);
        C21290.m48319(c2903);
        this.f51631 = C22364.m50099(c2903);
        C3267.m10022(c2903);
        C6136.m17057(c2903);
        C20661.m47250(c2903);
        this.f51629 = C20195.synchronizedSet(new LinkedHashSet());
        this.f51628 = C20195.synchronizedSet(new LinkedHashSet());
        this.f51632 = C20195.synchronizedSet(new LinkedHashSet());
        this.f51633 = C20195.synchronizedSet(new LinkedHashSet());
        this.f51627 = C20195.synchronizedMap(new LinkedHashMap());
        this.f51637 = C20195.synchronizedSet(new LinkedHashSet());
        this.f51636 = new LinkedHashSet();
        this.f51635 = new LinkedHashSet();
        this.f51630 = new LinkedHashSet();
        C4824.m14050(c2903).m14055(EnumC20347.PROCESSING);
        C11781.m28823(c2903).m28825(EnumC0121.f1157);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m39562() {
        return (this.f51632.isEmpty() && this.f51627.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Set m39561() {
        return this.f51633;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m39558() {
        return this.f51627;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m39563() {
        Set set = this.f51637;
        if (set.isEmpty()) {
            return;
        }
        C11076 c11076 = C14001.f42334;
        this.f51631.m7275(new C11076("compiler", "proc.unclosed.type.files", set));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m39559(Collection collection, Collection collection2) {
        this.f51629.addAll(collection);
        this.f51630.addAll(collection2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f51632.clear();
        this.f51633.clear();
        this.f51627.clear();
        this.f51630.clear();
        this.f51629.clear();
        this.f51628.clear();
        this.f51637.clear();
        this.f51636.clear();
        this.f51635.clear();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m39560() {
        this.f51632.clear();
        this.f51633.clear();
        this.f51627.clear();
    }
}
