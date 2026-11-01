package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3HZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C15832 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ᩸ */
    public static final String f45860 = C18515.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        super.fillInStackTrace();
        StackTraceElement[] stackTrace = getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(f45860)) {
                arrayList.add(stackTraceElement);
            }
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        return this;
    }
}
