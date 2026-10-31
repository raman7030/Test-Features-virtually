package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ܳ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C3HZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14167 extends IllegalArgumentException {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String f42772 = C16990.class.getName();

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        super.fillInStackTrace();
        StackTraceElement[] stackTrace = getStackTrace();
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.getClassName().equals(f42772)) {
                arrayList.add(stackTraceElement);
            }
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        return this;
    }
}
