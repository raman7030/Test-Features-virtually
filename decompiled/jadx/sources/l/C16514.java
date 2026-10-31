package l;

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
public final class C16514 extends AbstractC17926 implements Closeable, InterfaceC6403 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Stack f50744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public LinkedHashMap f50745;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public EnumSet f50746;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f50747;

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final boolean mo7078() {
        return true;
    }

    public C16514(C2903 c2903) {
        c2903.m8841(AbstractC17926.f54754, this);
        this.f50744 = new Stack();
        this.f50745 = new LinkedHashMap();
        String[] strArrSplit = C11781.m28823(c2903).m28824("debug.completionDeps").split(",");
        for (String str : strArrSplit) {
            if (str.startsWith("file=")) {
                this.f50747 = str.substring(5);
            }
        }
        this.f50746 = EnumC13485.m32519(strArrSplit);
        C4541 c4541M13316 = C4541.m13316(c2903);
        C2609 c2609 = c4541M13316.f14459;
        c2609.getClass();
        c4541M13316.f14459 = new C2609(this, c2609);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m38893(C2903 c2903) {
        c2903.m8842(AbstractC17926.f54754, (InterfaceC19837) new C5725());
    }

    @Override // l.AbstractC17926
    /* JADX INFO: renamed from: ֫ */
    public final void mo25113(C14163 c14163, EnumC12075 enumC12075) {
        C22658 c22658 = new C22658(c14163);
        LinkedHashMap linkedHashMap = this.f50745;
        AbstractC1698 abstractC1698 = (AbstractC1698) linkedHashMap.get(c14163);
        if (abstractC1698 == null) {
            linkedHashMap.put(c14163, c22658);
            abstractC1698 = c22658;
        }
        Stack stack = this.f50744;
        if (!stack.isEmpty()) {
            List list = (List) ((AbstractC1698) stack.peek()).f5886.get(enumC12075);
            if (!list.contains(abstractC1698)) {
                list.add(abstractC1698);
            }
        }
        stack.push(abstractC1698);
        if (c22658 == abstractC1698) {
            c14163.f17564 = this;
        }
    }

    @Override // l.AbstractC17926
    /* JADX INFO: renamed from: ֫ */
    public final void mo25112() {
        this.f50744.pop();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        EnumC13485 enumC13485 = EnumC13485.REDUNDANT;
        EnumSet enumSet = this.f50746;
        boolean zContains = enumSet.contains(enumC13485);
        LinkedHashMap linkedHashMap = this.f50745;
        if (!zContains) {
            new C10871().m43190(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC13485.CLASS)) {
            new C7136(this, EnumC11370.SOURCE).m43190(linkedHashMap.values(), (StringBuilder) null);
        }
        if (!enumSet.contains(EnumC13485.SOURCE)) {
            new C7136(this, EnumC11370.CLASS).m43190(linkedHashMap.values(), (StringBuilder) null);
        }
        String str = this.f50747;
        if (str != null) {
            FileWriter fileWriter = new FileWriter(str);
            try {
                fileWriter.append((CharSequence) C5226.m15018(linkedHashMap.values(), "CompletionDeps", ""));
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

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        mo25113((C14163) abstractC5698, EnumC12075.OTHER);
        mo25112();
        abstractC5698.f17564 = this;
    }
}
