package l;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: l.ۤᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 67L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10469 implements Iterator {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6235 f31417;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumC21101 f31419;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Set f31421 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Iterator f31418 = Arrays.asList(EnumC21101.MODULE_SOURCE_PATH, EnumC21101.UPGRADE_MODULE_PATH, EnumC21101.SYSTEM_MODULES, EnumC21101.MODULE_PATH).iterator();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Iterator f31420 = null;

    public C10469(C6235 c6235) {
        this.f31417 = c6235;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (this.f31421 == null) {
            while (true) {
                Iterator it = this.f31420;
                if (it == null || !it.hasNext()) {
                    Iterator it2 = this.f31418;
                    if (!it2.hasNext()) {
                        return false;
                    }
                    this.f31419 = (EnumC21101) it2.next();
                    try {
                        this.f31420 = this.f31417.f19097.mo1713(this.f31419).iterator();
                    } catch (IOException e) {
                        System.err.println("error listing module locations for " + this.f31419 + ": " + e);
                    }
                }
            }
            if (this.f31420.hasNext()) {
                this.f31421 = (Set) this.f31420.next();
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        hasNext();
        Set set = this.f31421;
        if (set != null) {
            this.f31421 = null;
            return set;
        }
        throw new NoSuchElementException();
    }
}
