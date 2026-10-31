package l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7917 implements Iterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19913 f24507;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f24508;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C22029 f24509;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C22029 f24510;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C22029 mo21200();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C22029 mo21201(C22029 c22029);

    public AbstractC7917(C19913 c19913) {
        this.f24507 = c19913;
        c19913.f64323.lock();
        try {
            C22029 c22029Mo21200 = mo21200();
            this.f24510 = c22029Mo21200;
            this.f24508 = c22029Mo21200 == null ? null : c22029Mo21200.f70619;
        } finally {
            c19913.f64323.unlock();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f24510 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C22029 c22029Mo21201;
        Object obj;
        C22029 c22029 = this.f24510;
        if (c22029 == null) {
            throw new NoSuchElementException();
        }
        this.f24509 = c22029;
        Object obj2 = this.f24508;
        C19913 c19913 = this.f24507;
        c19913.f64323.lock();
        try {
            C22029 c220210 = this.f24510;
            while (true) {
                c22029Mo21201 = mo21201(c220210);
                obj = null;
                if (c22029Mo21201 != null) {
                    if (c22029Mo21201.f70619 != null) {
                        break;
                    }
                    if (c22029Mo21201 == c220210) {
                        c22029Mo21201 = mo21200();
                        break;
                    }
                    c220210 = c22029Mo21201;
                } else {
                    c22029Mo21201 = null;
                    break;
                }
            }
            this.f24510 = c22029Mo21201;
            if (c22029Mo21201 != null) {
                obj = c22029Mo21201.f70619;
            }
            this.f24508 = obj;
            return obj2;
        } finally {
            c19913.f64323.unlock();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C22029 c22029 = this.f24509;
        if (c22029 == null) {
            throw new IllegalStateException();
        }
        this.f24509 = null;
        C19913 c19913 = this.f24507;
        c19913.f64323.lock();
        try {
            if (c22029.f70619 != null) {
                c19913.m45810(c22029);
            }
        } finally {
            c19913.f64323.unlock();
        }
    }
}
