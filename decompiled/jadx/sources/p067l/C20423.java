package p067l;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: l.ᩴ᩶᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V8BV */
/* JADX INFO: loaded from: classes4.dex */
public final class C20423 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC6341 f63101;

    /* JADX INFO: renamed from: ۧ */
    public C16861 f63102;

    /* JADX INFO: renamed from: ܽ */
    public boolean f63103;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC15599 f63104;

    /* JADX INFO: renamed from: ֫ */
    public final void m46105(AbstractC17043 abstractC17043, AbstractC15599 abstractC15599, String[] strArr, InterfaceC6341 interfaceC6341) {
        this.f63104 = abstractC15599;
        this.f63101 = interfaceC6341;
        boolean z = false;
        if (strArr.length == 1 && !strArr[0].endsWith("/")) {
            z = true;
        }
        this.f63103 = z;
        C16861 c16861M38379 = C16861.m38379(new C11706(interfaceC6341));
        this.f63102 = c16861M38379;
        c16861M38379.m38401(strArr, abstractC15599);
        C10844 c10844 = new C10844(abstractC17043);
        try {
            c10844.m24992(36);
            if (abstractC15599.mo9723()) {
                m46102(c10844);
            } else {
                Iterator it = this.f63102.m38409().iterator();
                while (it.hasNext()) {
                    m46103(c10844, (AbstractC3451) it.next());
                }
            }
            c10844.close();
        } catch (Throwable th) {
            try {
                c10844.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m46101(C5738 c5738, AbstractC3451 abstractC3451) {
        C17136 c17136 = new C17136();
        if (abstractC3451.m6150()) {
            c17136.m38795(abstractC3451.m6147());
        }
        C19727 c19727M6145 = abstractC3451.m6145();
        if (c19727M6145 != null) {
            c17136.m38794(Integer.valueOf(c19727M6145.f60012));
        }
        c5738.m12756(c17136);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46103(C10844 c10844, AbstractC3451 abstractC3451) throws IOException {
        if (this.f63101.mo3924()) {
            return;
        }
        this.f63102.m50045();
        InterfaceC6341 interfaceC6341 = this.f63101;
        this.f63102.m50044();
        this.f63102.getClass();
        interfaceC6341.mo14502(abstractC3451);
        if (!this.f63103) {
            this.f63101.getClass();
            this.f63101.setProgress(this.f63102.m50042());
        }
        if (abstractC3451.m6129()) {
            C5738 c5738 = new C5738(abstractC3451.m6141() + "/");
            c5738.setTime(abstractC3451.m6128());
            m46101(c5738, abstractC3451);
            c10844.m24987(c5738);
        } else {
            C5738 c5739 = new C5738(abstractC3451.m6141());
            c5739.setTime(abstractC3451.m6128());
            m46101(c5739, abstractC3451);
            c10844.m24987(c5739);
            InterfaceC19370 interfaceC19370M35470 = this.f63104.m35470(abstractC3451.m6151());
            if (abstractC3451.m6150()) {
                this.f63101.getClass();
            } else if (!this.f63103) {
                InputStream inputStreamMo9707 = this.f63104.mo9707((AbstractActivityC5549) null, interfaceC19370M35470);
                try {
                    if (inputStreamMo9707 == null) {
                        this.f63101.mo14501();
                        if (inputStreamMo9707 != null) {
                            inputStreamMo9707.close();
                            return;
                        }
                        return;
                    }
                    C15841.m35957(inputStreamMo9707, c10844.m24981(), ((C17278) interfaceC19370M35470).getSize(), new C11035(this));
                    inputStreamMo9707.close();
                } catch (Throwable th) {
                    if (inputStreamMo9707 != null) {
                        try {
                            inputStreamMo9707.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } else {
                C20810 c20810Mo30393 = this.f63104.mo30393(interfaceC19370M35470);
                try {
                    if (c20810Mo30393 == null) {
                        this.f63101.mo14501();
                        if (c20810Mo30393 != null) {
                            c20810Mo30393.close();
                            return;
                        }
                        return;
                    }
                    C20689 c20689M46980 = c20810Mo30393.m46980();
                    InterfaceC6341 interfaceC6342 = this.f63101;
                    C12826.requireNonNull(interfaceC6342);
                    c20689M46980.m46753(new C8347(interfaceC6342));
                    OutputStream outputStreamM24981 = c10844.m24981();
                    final InterfaceC6341 interfaceC6343 = this.f63101;
                    C12826.requireNonNull(interfaceC6343);
                    C15841.m35957(c20810Mo30393, outputStreamM24981, -1L, new InterfaceC7717() { // from class: l.᩷᩶᩻
                        @Override // p067l.InterfaceC7717
                        /* JADX INFO: renamed from: ᩷֫ */
                        public final /* synthetic */ void mo4048() {
                            throw null;
                        }

                        @Override // p067l.InterfaceC18588
                        /* JADX INFO: renamed from: ᩻ */
                        public final boolean mo3924() {
                            return interfaceC6343.mo3924();
                        }
                    });
                    c20810Mo30393.close();
                } catch (Throwable th3) {
                    if (c20810Mo30393 != null) {
                        try {
                            c20810Mo30393.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            this.f63102.m50038(abstractC3451.mo4363().m6154());
        }
        if (!this.f63101.mo3924() && abstractC3451.m6129()) {
            Iterator it = abstractC3451.mo4359().m4364().iterator();
            while (it.hasNext()) {
                m46103(c10844, (AbstractC3451) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m46102(C10844 c10844) throws IOException {
        HashMap map = new HashMap();
        ArrayList<C2780> arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList(this.f63102.m38409());
        while (!linkedList.isEmpty()) {
            AbstractC3451 abstractC3451 = (AbstractC3451) linkedList.removeFirst();
            if (abstractC3451.m6129()) {
                arrayList.add(abstractC3451.mo4359());
                linkedList.addAll(0, abstractC3451.mo4359().m4364());
            } else {
                map.put(this.f63104.m35470(abstractC3451.m6151()), abstractC3451.mo4363());
            }
        }
        for (C2780 c2780 : arrayList) {
            this.f63102.m50045();
            InterfaceC6341 interfaceC6341 = this.f63101;
            this.f63102.m50044();
            this.f63102.getClass();
            interfaceC6341.mo14502(c2780);
            C5738 c5738 = new C5738(c2780.m6141() + "/");
            c5738.setTime(c2780.m6128());
            m46101(c5738, c2780);
            c10844.m24987(c5738);
            if (this.f63101.mo3924()) {
                return;
            }
        }
        IOException[] iOExceptionArr = {null};
        this.f63104.mo9711(map.keySet(), new C5000(this, map, c10844, iOExceptionArr));
        IOException iOException = iOExceptionArr[0];
        if (iOException != null) {
            throw iOException;
        }
    }
}
