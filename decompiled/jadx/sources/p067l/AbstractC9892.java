package p067l;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: l.۠ۘ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9892 implements Iterator {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ C21293 f27422;

    /* JADX INFO: renamed from: ᩶ */
    public Object f27423;

    /* JADX INFO: renamed from: ᩸ */
    public C23304 f27424;

    /* JADX INFO: renamed from: ᩹ */
    public C23304 f27425;

    /* JADX INFO: renamed from: ֫ */
    public abstract C23304 mo23166();

    /* JADX INFO: renamed from: ֫ */
    public abstract C23304 mo23167(C23304 c23304);

    public AbstractC9892(C21293 c21293) {
        this.f27422 = c21293;
        c21293.f66961.lock();
        try {
            C23304 c23304Mo23166 = mo23166();
            this.f27425 = c23304Mo23166;
            this.f27423 = c23304Mo23166 == null ? null : c23304Mo23166.f73336;
        } finally {
            c21293.f66961.unlock();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f27425 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C23304 c23304Mo23167;
        Object obj;
        C23304 c23304 = this.f27425;
        if (c23304 == null) {
            throw new NoSuchElementException();
        }
        this.f27424 = c23304;
        Object obj2 = this.f27423;
        C21293 c21293 = this.f27422;
        c21293.f66961.lock();
        try {
            C23304 c23305 = this.f27425;
            while (true) {
                c23304Mo23167 = mo23167(c23305);
                obj = null;
                if (c23304Mo23167 != null) {
                    if (c23304Mo23167.f73336 != null) {
                        break;
                    }
                    if (c23304Mo23167 == c23305) {
                        c23304Mo23167 = mo23166();
                        break;
                    }
                    c23305 = c23304Mo23167;
                } else {
                    c23304Mo23167 = null;
                    break;
                }
            }
            this.f27425 = c23304Mo23167;
            if (c23304Mo23167 != null) {
                obj = c23304Mo23167.f73336;
            }
            this.f27423 = obj;
            return obj2;
        } finally {
            c21293.f66961.unlock();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C23304 c23304 = this.f27424;
        if (c23304 == null) {
            throw new IllegalStateException();
        }
        this.f27424 = null;
        C21293 c21293 = this.f27422;
        c21293.f66961.lock();
        try {
            if (c23304.f73336 != null) {
                c21293.m48122(c23304);
            }
        } finally {
            c21293.f66961.unlock();
        }
    }
}
