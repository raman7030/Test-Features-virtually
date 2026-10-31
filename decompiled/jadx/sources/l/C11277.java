package l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ۧ᩸᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11277 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14401 f33786;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final List f33787;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11793 f33788;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16560 f33789;

    public C11277(C16560 c16560, List list) {
        this.f33789 = c16560;
        this.f33787 = list;
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        this.f33786 = c14401;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27890(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.isDirectory() || !(interfaceC17889 instanceof C11793)) {
            throw new IllegalArgumentException();
        }
        C11793 c11793 = (C11793) interfaceC17889;
        this.f33788 = c11793;
        C14401 c14401 = this.f33786;
        c14401.m34407(c11793);
        c14401.m34401(c11793.mo36978() ? R.string.MT_Protector : R.string.MT_Protector);
        c14401.m34415(c11793.getSize());
        c14401.m34411(c11793.getTime());
        C16477 c16477Mo24428 = c11793.mo24428();
        if (c16477Mo24428 != null) {
            c14401.m34399(new C2144(c16477Mo24428)).m41938(6);
            String strM38837 = c16477Mo24428.m38837();
            String strM38833 = c16477Mo24428.m38833();
            if (!TextUtils.isEmpty(strM38837) || !TextUtils.isEmpty(strM38833)) {
                c14401.m34398(new C5030(strM38837, strM38833)).m27175();
            }
        }
        if (c11793.mo36978()) {
            c14401.m34397(c11793.mo36977(), (View.OnClickListener) null).m19153(6);
        }
        c14401.m34417();
        c14401.m34408();
        C6058.m16907(c14401.m34409(), this.f33789, c11793);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27891(InterfaceC17889 interfaceC17889) {
        if (interfaceC17889.mo36969() || !(interfaceC17889 instanceof C11793)) {
            throw new IllegalArgumentException();
        }
        C11793 c11793 = (C11793) interfaceC17889;
        this.f33788 = c11793;
        C14401 c14401 = this.f33786;
        c14401.m34407(c11793);
        c14401.m34401(c11793.mo36978() ? R.string.MT_Protector : R.string.MT_Protector);
        c14401.m34415(c11793.getSize());
        c14401.m34411(c11793.getTime());
        C16477 c16477Mo24428 = c11793.mo24428();
        if (c16477Mo24428 != null) {
            c14401.m34399(new C23595(c16477Mo24428)).m41938(6);
            String strM38837 = c16477Mo24428.m38837();
            String strM38833 = c16477Mo24428.m38833();
            if (!TextUtils.isEmpty(strM38837) || !TextUtils.isEmpty(strM38833)) {
                c14401.m34398(new C11374(strM38837, strM38833)).m27175();
            }
        }
        if (c11793.mo36978()) {
            c14401.m34397(c11793.mo36977(), (View.OnClickListener) null).m19153(6);
        }
        c14401.m34395(R.string.MT_Protector, new C8182(this)).m19153(8);
        c14401.m34408();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27889(String str) {
        C14401 c14401 = this.f33786;
        List list = this.f33787;
        c14401.m34405(list);
        c14401.m34403(str, new View.OnLongClickListener() { // from class: l.᩺ܶ᩻
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C11277.m27884(this.f74228);
                return true;
            }
        });
        Iterator it = list.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC17889) it.next()).getSize();
        }
        c14401.m34415(size);
        c14401.m34395(R.string.MT_Protector, new C2184(5, this)).m19153(8);
        c14401.m34408();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27883(final TextView textView, final TextView textView2, final AbstractC13921 abstractC13921, final List list) {
        textView.setText("...");
        textView2.setText("...");
        C1802.f6208.submit(new Runnable() { // from class: l.֫᩸᩻
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC13921 abstractC13922 = abstractC13921;
                C8817 c8817M22786 = C8817.m22786(300);
                LinkedList linkedList = new LinkedList(list);
                final int i = 0;
                final int i2 = 0;
                int i3 = 0;
                while (true) {
                    boolean zIsEmpty = linkedList.isEmpty();
                    final TextView textView3 = textView;
                    final TextView textView4 = textView2;
                    if (zIsEmpty) {
                        C4925.m14315(new Runnable() { // from class: l.۟ܶ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView3.setText(String.valueOf(i));
                                textView4.setText(String.valueOf(i2));
                            }
                        });
                        return;
                    }
                    i3++;
                    if ((i3 & 255) == 0 && c8817M22786.m22791()) {
                        C4925.m14315(new Runnable() { // from class: l.ܰܶ᩻
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView3.setText(String.valueOf(i));
                                textView4.setText(String.valueOf(i2));
                            }
                        });
                    }
                    InterfaceC17889 interfaceC17889 = (InterfaceC17889) linkedList.removeFirst();
                    if (interfaceC17889.mo36969()) {
                        i++;
                    } else {
                        i2++;
                        try {
                            linkedList.addAll(abstractC13922.mo7637(interfaceC17889.getPath(), true));
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27884(C11277 c11277) {
        C11793 c11793 = c11277.f33788;
        if (c11793 != null) {
            C4925.m14308(R.string.MT_Protector, c11793.getPath());
        }
    }
}
