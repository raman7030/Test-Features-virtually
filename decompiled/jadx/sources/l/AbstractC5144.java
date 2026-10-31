package l;

import java.io.IOException;
import java.io.StringWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۚۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5144 implements InterfaceC13206, Cloneable, InterfaceC3109 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final ExecutorService f16083 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final AtomicInteger f16084 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f16085;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f16086;

    @Override // l.InterfaceC13206
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo986(InterfaceC12501 interfaceC12501, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo988(AbstractC0204 abstractC0204);

    @Override // l.InterfaceC3109
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC5144 mo9482() {
        return this;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public abstract EnumC18550 mo989();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m14709(EnumC18550 enumC18550) {
        return enumC18550 == mo989();
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C21372(stringWriter, false).m48445(this, 0);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC3109
    /* JADX INFO: renamed from: ۨ */
    public final int mo9483() {
        return C7260.m19455(this);
    }

    @Override // l.InterfaceC3109
    /* JADX INFO: renamed from: ֨ */
    public final int mo9480() {
        return this.f16085;
    }

    @Override // l.InterfaceC3109
    /* JADX INFO: renamed from: ֫ */
    public final int mo9481(InterfaceC2029 interfaceC2029) {
        return C7260.m19431(this, interfaceC2029);
    }

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public static boolean m14708() {
        return (f16084.incrementAndGet() & 63) == 0 && new Throwable().getStackTrace().length > 500;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m14707(RunnableC14897 runnableC14897) {
        try {
            f16083.submit(runnableC14897).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m14706(final C22077 c22077) {
        try {
            return f16083.submit(new Callable() { // from class: l.ۧ᩵۠
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c22077.get();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
