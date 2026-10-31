package l;

import java.net.MalformedURLException;

/* JADX INFO: renamed from: l.᩻ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 89TZ */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC23498 implements InterfaceC5257 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f75443 = C11321.m27961(AbstractC23498.class);

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12914 f75444;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC5257 f75445;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public InterfaceC10196 f75446 = m51944();

    /* JADX INFO: renamed from: ֫ */
    public abstract C12914 mo5507(InterfaceC14325 interfaceC14325);

    public AbstractC23498(C12914 c12914, InterfaceC5257 interfaceC5257) {
        this.f75444 = c12914;
        this.f75445 = interfaceC5257;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10196 m51945() {
        return this.f75444;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private InterfaceC10196 m51944() {
        while (true) {
            InterfaceC5257 interfaceC5257 = this.f75445;
            if (!interfaceC5257.hasNext()) {
                return null;
            }
            try {
                return mo5507((InterfaceC14325) interfaceC5257.next());
            } catch (MalformedURLException e) {
                f75443.mo7091("Failed to create child URL", (Throwable) e);
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75446 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        InterfaceC10196 interfaceC10196 = this.f75446;
        this.f75446 = m51944();
        return interfaceC10196;
    }

    @Override // l.InterfaceC5257, java.lang.AutoCloseable
    public final void close() {
        this.f75445.close();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f75445.remove();
    }
}
