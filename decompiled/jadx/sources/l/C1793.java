package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֫ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 65FC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1793 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final List f6190;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C14401 f6191;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9555 f6192;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public TextView[] f6193;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C16560 f6194;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f6189 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f6188 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5967(C1793 c1793, MenuItem menuItem) {
        List list = c1793.f6190;
        C16560 c16560 = c1793.f6194;
        if (menuItem.getItemId() == R.string.MT_Protector) {
            new C23396(c16560, list).m51844(new RunnableC1000(1, c1793));
        } else if (menuItem.getItemId() == R.string.MT_Protector) {
            new C14929(c16560, list).m35378(new RunnableC1000(1, c1793));
        } else {
            new C8580(c16560, list).m22294(new RunnableC1000(1, c1793));
        }
    }

    public C1793(C16560 c16560, List list) {
        this.f6194 = c16560;
        this.f6190 = list;
        C14401 c14401 = new C14401(c16560.m39056());
        c14401.m34420();
        c14401.m34413();
        this.f6191 = c14401;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5975() {
        this.f6191.m34418();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5979(InterfaceC17889 interfaceC17889) {
        boolean z;
        String path;
        if (interfaceC17889.isDirectory() || !(interfaceC17889 instanceof C9555)) {
            throw new IllegalArgumentException();
        }
        C9555 c9555 = (C9555) interfaceC17889;
        this.f6192 = c9555;
        AbstractC15440 abstractC15440Mo24433 = c9555.mo24433();
        C14401 c14401 = this.f6191;
        c14401.m34407(c9555);
        c14401.m34401(c9555.mo36978() ? R.string.MT_Protector : R.string.MT_Protector);
        long size = c9555.getSize();
        final long jMo36979 = c9555.mo36979();
        if (jMo36979 != -1 && size != jMo36979) {
            c14401.m34395(R.string.MT_Protector, new C5729(1, size)).m19153(8);
            c14401.m34395(R.string.MT_Protector, new InterfaceC1702() { // from class: l.۬֫᩻
                @Override // l.InterfaceC1702
                /* JADX INFO: renamed from: ֫ */
                public final void mo5714(TextView textView) {
                    C15935.m37713(textView, jMo36979);
                }
            });
            c14401.m34411(c9555.getTime()).m19153(8);
        } else {
            c14401.m34415(size);
            c14401.m34411(c9555.getTime());
        }
        final ArrayList arrayList = new ArrayList(2);
        if (C9555.m24427(c9555.mo24428())) {
            if (abstractC15440Mo24433.mo35196()) {
                this.f6188 = false;
            } else {
                try {
                    if (abstractC15440Mo24433 instanceof C11893) {
                        path = ((C11893) abstractC15440Mo24433).m29018();
                    } else {
                        path = c9555.getPath();
                    }
                    c9555.m24429(new C16477(C20402.m46724(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f6188 = false;
                    z = false;
                }
                this.f6189 = abstractC15440Mo24433.mo27912();
            }
            z = false;
            this.f6189 = abstractC15440Mo24433.mo27912();
        } else {
            z = true;
        }
        if (z) {
            final C16477 c16477Mo24428 = c9555.mo24428();
            c14401.m34399(new InterfaceC17224() { // from class: l.ۨ֫᩻
                @Override // l.InterfaceC17224
                /* JADX INFO: renamed from: ֫ */
                public final void mo7075(TextView textView, Button button) {
                    textView.setText(c16477Mo24428.m38841());
                    arrayList.add(button);
                }
            }).m41938(6);
            c14401.m34398(new InterfaceC16518() { // from class: l.᩺֫᩻
                @Override // l.InterfaceC16518
                /* JADX INFO: renamed from: ֫ */
                public final void mo12661(TextView textView, TextView textView2, Button button) {
                    C16477 c16477 = c16477Mo24428;
                    textView.setText(c16477.m38837());
                    textView2.setText(c16477.m38833());
                    arrayList.add(button);
                }
            }).m27175();
        }
        if (c9555.mo36978()) {
            c14401.m34397(c9555.mo36977(), new ViewOnClickListenerC3868(2, this)).m19153(6);
            this.f6189 = false;
            this.f6188 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        if (c9555.m24430()) {
            c14401.m34417();
            c14401.m34408();
            C6058.m16907(c14401.m34409(), this.f6194, c9555);
        } else {
            c14401.m34408();
        }
        if (this.f6188 && abstractC15440Mo24433.mo36530()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m5970(true);
            return;
        }
        m5970(false);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5980(InterfaceC17889 interfaceC17889) {
        boolean z;
        String path;
        if (interfaceC17889.mo36969() || !(interfaceC17889 instanceof C9555)) {
            throw new IllegalArgumentException();
        }
        C9555 c9555 = (C9555) interfaceC17889;
        this.f6192 = c9555;
        AbstractC15440 abstractC15440Mo24433 = c9555.mo24433();
        C14401 c14401 = this.f6191;
        c14401.m34407(c9555);
        c14401.m34401(c9555.mo36978() ? R.string.MT_Protector : R.string.MT_Protector);
        c14401.m34415(0L);
        c14401.m34411(c9555.getTime());
        final ArrayList arrayList = new ArrayList(2);
        if (c9555.m24435()) {
            this.f6188 = false;
            this.f6189 = false;
            z = false;
        } else if (C9555.m24427(c9555.mo24428())) {
            if (abstractC15440Mo24433.mo35196()) {
                this.f6188 = false;
            } else {
                try {
                    if (abstractC15440Mo24433 instanceof C11893) {
                        path = ((C11893) abstractC15440Mo24433).m29018();
                    } else {
                        path = c9555.getPath();
                    }
                    c9555.m24429(new C16477(C20402.m46724(path)));
                    z = true;
                } catch (IOException unused) {
                    this.f6188 = false;
                    z = false;
                }
                this.f6189 = abstractC15440Mo24433.mo27912();
            }
            z = false;
            this.f6189 = abstractC15440Mo24433.mo27912();
        } else {
            z = true;
        }
        if (z) {
            final C16477 c16477Mo24428 = c9555.mo24428();
            c14401.m34399(new InterfaceC17224() { // from class: l.ܰ֫᩻
                @Override // l.InterfaceC17224
                /* JADX INFO: renamed from: ֫ */
                public final void mo7075(TextView textView, Button button) {
                    textView.setText(c16477Mo24428.m38841());
                    arrayList.add(button);
                }
            }).m41938(6);
            c14401.m34398(new InterfaceC16518() { // from class: l.۟֫᩻
                @Override // l.InterfaceC16518
                /* JADX INFO: renamed from: ֫ */
                public final void mo12661(TextView textView, TextView textView2, Button button) {
                    C16477 c16477 = c16477Mo24428;
                    textView.setText(c16477.m38837());
                    textView2.setText(c16477.m38833());
                    arrayList.add(button);
                }
            }).m27175();
        }
        if (c9555.mo36978()) {
            c14401.m34397(c9555.mo36977(), new ViewOnClickListenerC3868(2, this)).m19153(6);
            this.f6189 = false;
            this.f6188 = false;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(4);
            }
        }
        c14401.m34395(R.string.MT_Protector, new C11010(4)).m19153(8);
        c14401.m34395(R.string.MT_Protector, new C12662(3));
        c14401.m34419();
        c14401.m34408();
        if (this.f6188 && abstractC15440Mo24433.mo36530()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((View) it2.next()).setVisibility(4);
            }
            m5970(true);
            return;
        }
        m5970(false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5978(String str) {
        List list = this.f6190;
        C14401 c14401 = this.f6191;
        c14401.m34405(list);
        c14401.m34403(str, (View.OnLongClickListener) null);
        c14401.m34415(0L);
        c14401.m34395(R.string.MT_Protector, new C3200(8)).m19153(8);
        c14401.m34395(R.string.MT_Protector, new C18307());
        c14401.m34419();
        c14401.m34408();
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        if (abstractC15440M39866.mo23126() && !(abstractC15440M39866 instanceof C13198)) {
            this.f6188 = false;
            this.f6189 = false;
        }
        m5970(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m5970(final boolean z) {
        boolean z2 = this.f6189;
        C14401 c14401 = this.f6191;
        if (z2) {
            c14401.m34406(new InterfaceC13041() { // from class: l.᩸֫᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C7140 c7140 = (C7140) obj;
                    ViewOnClickListenerC14813.m35217(c7140.m19154());
                    c7140.m19154().setOnClickListener(new ViewOnClickListenerC9135(2, this.f68631));
                }
            });
        }
        if (this.f6188) {
            c14401.m34416(new InterfaceC13041() { // from class: l.᩹֫᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C17930 c17930 = (C17930) obj;
                    C19890.m45741(c17930.m41940());
                    ViewOnClickListenerC2825 viewOnClickListenerC2825 = new ViewOnClickListenerC2825(1, this.f70392);
                    c17930.m41940().setOnClickListener(viewOnClickListenerC2825);
                    c17930.m41939().setOnClickListener(viewOnClickListenerC2825);
                }
            });
            c14401.m34412(new InterfaceC13041() { // from class: l.᩶֫᩻
                @Override // l.InterfaceC13041
                public final void accept(Object obj) {
                    C10875 c10875 = (C10875) obj;
                    final C1793 c1793 = this.f64160;
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.ۗ֫᩻
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            C1793.m5972(c1793);
                        }
                    };
                    C19890.m45741(c10875.m27172());
                    C19890.m45741(c10875.m27174());
                    c10875.m27172().setOnClickListener(onClickListener);
                    c10875.m27174().setOnClickListener(onClickListener);
                    c10875.m27173().setOnClickListener(onClickListener);
                }
            });
        }
        if (this.f6189 || (z && this.f6188)) {
            c14401.m34414().setOnClickListener(new View.OnClickListener() { // from class: l.ۙ֫᩻
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C1793.m5969(this.f13986, z, view);
                }
            });
        } else {
            c14401.m34414().setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5969(C1793 c1793, boolean z, View view) {
        C21282 c21282 = new C21282(view.getContext(), view, 0);
        C3060 c3060M48304 = c21282.m48304();
        if (c1793.f6189) {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        if (z && c1793.f6188) {
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
            c3060M48304.add(0, R.string.MT_Protector, 0, R.string.MT_Protector);
        }
        c21282.m48302((InterfaceC14930) new C21847(c1793));
        c21282.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m5966(C1793 c1793) {
        new C23396(c1793.f6194, c1793.f6190).m51844(new RunnableC1000(1, c1793));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m5974(C1793 c1793) {
        new C14929(c1793.f6194, c1793.f6190).m35378(new RunnableC1000(1, c1793));
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m5972(C1793 c1793) {
        new C8580(c1793.f6194, c1793.f6190).m22294(new RunnableC1000(1, c1793));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m5971(final C1793 c1793) {
        C14401 c14401 = c1793.f6191;
        if (c1793.f6192 != null) {
            if (c1793.f6189) {
                c14401.m34406(new InterfaceC13041() { // from class: l.۫֫᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ((C7140) obj).m19154().setText(C17283.m40576(this.f36181.f6192.getTime()));
                    }
                });
            }
            if (c1793.f6188) {
                final C16477 c16477Mo24428 = c1793.f6192.mo24428();
                c14401.m34416(new InterfaceC13041() { // from class: l.ۤ֫᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        ((C17930) obj).m41940().setText(c16477Mo24428.m38841());
                    }
                });
                c14401.m34412(new InterfaceC13041() { // from class: l.ۛ֫᩻
                    @Override // l.InterfaceC13041
                    public final void accept(Object obj) {
                        C10875 c10875 = (C10875) obj;
                        TextView textViewM27172 = c10875.m27172();
                        C16477 c16477 = c16477Mo24428;
                        textViewM27172.setText(c16477.m38837());
                        c10875.m27174().setText(c16477.m38833());
                    }
                });
            }
        }
        C12327.m29911(1000);
        C15528.m36596();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5977(DialogInterface.OnDismissListener onDismissListener) {
        this.f6191.m34402(onDismissListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m5976(int i, int i2, long j) {
        if (this.f6193 == null) {
            C14401 c14401 = this.f6191;
            this.f6193 = new TextView[]{c14401.m34410(R.string.MT_Protector).m19154(), c14401.m34410(R.string.MT_Protector).m19154(), c14401.m34410(R.string.MT_Protector).m19154()};
        }
        C15935.m37714(this.f6193[0], j);
        this.f6193[1].setText(String.valueOf(i));
        this.f6193[2].setText(String.valueOf(i2));
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m5973(C1793 c1793) {
        C16560 c16560 = c1793.f6194;
        AbstractC15440 abstractC15440Mo24433 = c1793.f6192.mo24433();
        String strMo27935 = abstractC15440Mo24433.mo27935();
        if (strMo27935 != null) {
            if (!strMo27935.startsWith("/")) {
                AbstractC15440 abstractC15440M36514 = abstractC15440Mo24433.m36514();
                while (true) {
                    if (abstractC15440M36514 != null) {
                        if (strMo27935.isEmpty() || strMo27935.equals(".")) {
                            strMo27935 = abstractC15440M36514.mo23554();
                            break;
                        }
                        if (strMo27935.equals("..")) {
                            strMo27935 = abstractC15440M36514.getParent();
                            break;
                        } else if (strMo27935.startsWith("./")) {
                            strMo27935 = strMo27935.substring(2);
                        } else if (strMo27935.startsWith("../")) {
                            strMo27935 = strMo27935.substring(3);
                            abstractC15440M36514 = abstractC15440M36514.m36536();
                        } else {
                            strMo27935 = abstractC15440M36514.m36526(strMo27935).mo23554();
                            break;
                        }
                    } else {
                        strMo27935 = abstractC15440Mo24433.mo23554();
                        break;
                    }
                }
            }
        } else {
            strMo27935 = null;
        }
        AbstractC15440 abstractC15440M39866 = strMo27935 != null ? C16999.m39866(strMo27935, new String[0]) : null;
        if (abstractC15440M39866 == null) {
            return;
        }
        c1793.f6191.m34400();
        if (abstractC15440M39866.mo23113()) {
            c16560.m39033(abstractC15440M39866.mo23554(), true);
            return;
        }
        String parent = abstractC15440M39866.getParent();
        if (parent != null) {
            c16560.m39053(abstractC15440M39866.getName());
            c16560.m39033(parent, true);
        } else {
            c16560.m39033(abstractC15440M39866.mo23554(), true);
        }
    }
}
