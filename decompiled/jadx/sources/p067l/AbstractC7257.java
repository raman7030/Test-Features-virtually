package p067l;

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
public abstract class AbstractC7257 implements InterfaceC14919, Cloneable, InterfaceC5323 {

    /* JADX INFO: renamed from: ۙ */
    public static final ExecutorService f18922 = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: ᩶ */
    public static final AtomicInteger f18923 = new AtomicInteger();

    /* JADX INFO: renamed from: ᩸ */
    public int f18924;

    /* JADX INFO: renamed from: ᩹ */
    public AbstractC6462 f18925;

    @Override // p067l.InterfaceC14919
    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo3380(InterfaceC14249 interfaceC14249, Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo3382(AbstractC2562 abstractC2562);

    @Override // p067l.InterfaceC5323
    /* JADX INFO: renamed from: ۟ */
    public final AbstractC7257 mo11525() {
        return this;
    }

    /* JADX INFO: renamed from: ܽ֫ */
    public abstract EnumC19998 mo3383();

    /* JADX INFO: renamed from: ֫ */
    public final boolean m16617(EnumC19998 enumC19998) {
        return enumC19998 == mo3383();
    }

    public String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C22680(stringWriter, false).m50781(this, 0);
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

    @Override // p067l.InterfaceC5323
    /* JADX INFO: renamed from: ۨ */
    public final int mo11526() {
        return C9268.m21421(this);
    }

    @Override // p067l.InterfaceC5323
    /* JADX INFO: renamed from: ֨ */
    public final int mo11523() {
        return this.f18924;
    }

    @Override // p067l.InterfaceC5323
    /* JADX INFO: renamed from: ֫ */
    public final int mo11524(InterfaceC4297 interfaceC4297) {
        return C9268.m21397(this, interfaceC4297);
    }

    /* JADX INFO: renamed from: ᩳ֫ */
    public static boolean m16616() {
        return (f18923.incrementAndGet() & 63) == 0 && new Throwable().getStackTrace().length > 500;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m16615(RunnableC16526 runnableC16526) {
        try {
            f18922.submit(runnableC16526).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Object m16614(final C23350 c23350) {
        try {
            return f18922.submit(new Callable() { // from class: l.ۧ᩵۠
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return c23350.get();
                }
            }).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
