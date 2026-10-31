package l;

import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۟ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB6H */
/* JADX INFO: loaded from: classes3.dex */
public final class C7408 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14401 f22786;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16560 f22787;

    public C7408(C16560 c16560) {
        this.f22787 = c16560;
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        this.f22786 = c14401;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19934(C10231 c10231) {
        C14401 c14401 = this.f22786;
        c14401.m34407(c10231);
        c14401.m34401(R.string.MT_Protector);
        if (c10231.getSize() == -1) {
            c14401.m34396(Math.max(c10231.m25859().m12072(), 0L)).m19153(8);
        } else {
            c14401.m34415(c10231.getSize()).m19153(8);
            c14401.m34396(Math.max(c10231.m25859().m12072(), 0L));
        }
        if (c10231.getTime() != -1) {
            c14401.m34411(c10231.getTime()).m19153(8);
        }
        Integer numM12077 = c10231.m25859().m12077();
        if (numM12077 != null) {
            c14401.m34394(R.string.MT_Protector, String.format("%08X", Long.valueOf(((long) numM12077.intValue()) & 4294967295L)));
        }
        c14401.m34417();
        c14401.m34408();
        C6058.m16907(c14401.m34409(), this.f22787, c10231);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m19935(final C10231 c10231) {
        C14401 c14401 = this.f22786;
        c14401.m34407(c10231);
        c14401.m34401(R.string.MT_Protector);
        if (c10231.getSize() == -1) {
            c14401.m34396(Math.max(c10231.m25859().m12072(), 0L)).m19153(8);
        } else {
            c14401.m34415(c10231.getSize()).m19153(8);
            c14401.m34396(Math.max(c10231.m25859().m12072(), 0L));
        }
        if (c10231.getTime() != -1) {
            c14401.m34411(c10231.getTime()).m19153(8);
        }
        c14401.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.ۨۤܳ
            @Override // l.InterfaceC1702
            /* JADX INFO: renamed from: ֫ */
            public final void mo5714(TextView textView) {
                C7408 c7408 = this.f34730;
                c7408.f22786.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.ܰۤܳ
                    @Override // l.InterfaceC1702
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo5714(TextView textView2) {
                        C11277.m27883(textView, textView2, c7408.f22787.m39044().mo6020(), Collections.singletonList(c10231));
                    }
                });
            }
        }).m19153(8);
        c14401.m34408();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19933(final List list) {
        C5168 c5168 = (C5168) this.f22787.m39044();
        C14401 c14401 = this.f22786;
        c14401.m34405(list);
        c14401.m34403(c5168.m39741(), (View.OnLongClickListener) null);
        Iterator it = list.iterator();
        long j = -1;
        long j2 = 0;
        while (it.hasNext()) {
            InterfaceC17889 interfaceC17889 = (InterfaceC17889) it.next();
            long size = interfaceC17889.getSize();
            if (size != -1) {
                if (j == -1) {
                    j = 0;
                }
                j += size;
            }
            long jM12072 = ((C10231) interfaceC17889).m25859().m12072();
            if (jM12072 != -1) {
                j2 += jM12072;
            }
        }
        if (j == -1) {
            c14401.m34396(j2).m19153(8);
        } else {
            c14401.m34415(j).m19153(8);
            c14401.m34396(j2);
        }
        c14401.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.ۛۤܳ
            @Override // l.InterfaceC1702
            /* JADX INFO: renamed from: ֫ */
            public final void mo5714(TextView textView) {
                C7408 c7408 = this.f18435;
                c7408.f22786.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.᩺ۤܳ
                    @Override // l.InterfaceC1702
                    /* JADX INFO: renamed from: ֫ */
                    public final void mo5714(TextView textView2) {
                        C11277.m27883(textView, textView2, c7408.f22787.m39044().mo6020(), list);
                    }
                }).m19153(8);
            }
        });
        c14401.m34408();
    }
}
