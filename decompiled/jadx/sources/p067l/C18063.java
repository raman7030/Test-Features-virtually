package p067l;

import java.io.Closeable;
import java.io.FileWriter;
import java.io.IOException;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Stack;

/* JADX INFO: renamed from: l.ܽ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G3L1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18063 extends AbstractC19405 implements Closeable, InterfaceC8453 {

    /* JADX INFO: renamed from: ۗ */
    public Stack f53923;

    /* JADX INFO: renamed from: ۙ */
    public LinkedHashMap f53924;

    /* JADX INFO: renamed from: ᩶ */
    public EnumSet f53925;

    /* JADX INFO: renamed from: ᩹ */
    public String f53926;

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo9173() {
        return true;
    }

    public C18063(C5127 c5127) {
        c5127.m10908(AbstractC19405.f57951, this);
        this.f53923 = new Stack();
        this.f53924 = new LinkedHashMap();
        String[] strArrSplit = C13565.m30871(c5127).m30872("debug.completionDeps").split(",");
        for (String str : strArrSplit) {
            if (str.startsWith("file=")) {
                this.f53926 = str.substring(5);
            }
        }
        this.f53925 = EnumC15184.m34621(strArrSplit);
        C6684 c6684M15204 = C6684.m15204(c5127);
        C4848 c4848 = c6684M15204.f17290;
        c4848.getClass();
        c6684M15204.f17290 = new C4848(this, c4848);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m41119(C5127 c5127) {
        c5127.m10909(AbstractC19405.f57951, (InterfaceC21221) new C7809());
    }

    @Override // p067l.AbstractC19405
    /* JADX INFO: renamed from: ֫ */
    public final void mo27130(C15828 c15828, EnumC13844 enumC13844) {
        C23902 c23902 = new C23902(c15828);
        LinkedHashMap linkedHashMap = this.f53924;
        AbstractC3982 abstractC3982 = (AbstractC3982) linkedHashMap.get(c15828);
        if (abstractC3982 == null) {
            linkedHashMap.put(c15828, c23902);
            abstractC3982 = c23902;
        }
        Stack stack = this.f53923;
        if (!stack.isEmpty()) {
            List list = (List) ((AbstractC3982) stack.peek()).f8665.get(enumC13844);
            if (!list.contains(abstractC3982)) {
                list.add(abstractC3982);
            }
        }
        stack.push(abstractC3982);
        if (c23902 == abstractC3982) {
            c15828.f20410 = this;
        }
    }

    @Override // p067l.AbstractC19405
    /* JADX INFO: renamed from: ֫ */
    public final void mo27129() {
        this.f53923.pop();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        EnumC15184 enumC15184 = EnumC15184.REDUNDANT;
        EnumSet enumSet = this.f53925;
        boolean zContains = enumSet.contains(enumC15184);
        LinkedHashMap linkedHashMap = this.f53924;
        if (!zContains) {
            new C12700().m45456(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC15184.CLASS)) {
            new C9150(this, EnumC13174.SOURCE).m45456(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC15184.SOURCE)) {
            new C9150(this, EnumC13174.CLASS).m45456(linkedHashMap.values(), (StringBuilder) null);
        }
        String str = this.f53926;
        if (str != null) {
            FileWriter fileWriter = new FileWriter(str);
            try {
                fileWriter.append((CharSequence) C7335.m16928(linkedHashMap.values(), "CompletionDeps", ""));
                fileWriter.close();
            } catch (Throwable th) {
                try {
                    fileWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        mo27130((C15828) abstractC7783, EnumC13844.OTHER);
        mo27129();
        abstractC7783.f20410 = this;
    }
}
