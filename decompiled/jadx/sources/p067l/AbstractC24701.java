package p067l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.᩻ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89TZ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC24701 implements InterfaceC7365 {

    /* JADX INFO: renamed from: ۙ */
    public static final InterfaceC4410 f78190 = C13128.m30022(AbstractC24701.class);

    /* JADX INFO: renamed from: ᩶ */
    public final C14642 f78191;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC7365 f78192;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC12059 f78193 = m54346();

    /* JADX INFO: renamed from: ֫ */
    public abstract C14642 mo7737(InterfaceC15983 interfaceC15983);

    public AbstractC24701(C14642 c14642, InterfaceC7365 interfaceC7365) {
        this.f78191 = c14642;
        this.f78192 = interfaceC7365;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12059 m54347() {
        return this.f78191;
    }

    /* JADX INFO: renamed from: ܽ */
    private InterfaceC12059 m54346() {
        while (true) {
            InterfaceC7365 interfaceC7365 = this.f78192;
            if (!interfaceC7365.hasNext()) {
                return null;
            }
            try {
                return mo7737((InterfaceC15983) interfaceC7365.next());
            } catch (MalformedURLException e) {
                f78190.mo9186("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f78193 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC12059 interfaceC12059 = this.f78193;
        this.f78193 = m54346();
        return interfaceC12059;
    }

    @Override // p067l.InterfaceC7365, java.lang.AutoCloseable
    public final void close() {
        this.f78192.close();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f78192.remove();
    }
}
