package l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۙۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4417 extends AbstractDialogInterfaceOnClickListenerC12849 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C2978 f14127;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21282 f14128;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C8650 f14129;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C2978 f14130;

    public C4417(AbstractActivityC3346 abstractActivityC3346, String str, C14293 c14293, boolean z, C8650 c8650) {
        super(abstractActivityC3346, -1);
        this.f14129 = c8650;
        m31258(R.string.MT_Protector);
        m31270();
        m31274(true);
        m31252(false);
        m31243();
        m31245(C11266.m27878(6.0f));
        m31269();
        m31287(8);
        m31261(R.string.MT_Protector);
        m31265("Referer: https://example.com/\nCookie: session=value\nX-Custom-Header: value");
        m31244();
        m31250((CharSequence) c14293.m34078());
        m31284();
        m31247(R.string.MT_Protector, new ViewOnClickListenerC20186(1, this), (ViewOnLongClickListenerC23553) null);
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4417.m13143(this.f60543, view);
            }
        });
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֡ۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f1405.m13144("Referer", (String) null);
            }
        });
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC13129(1, this));
        viewM10216.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۚۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4417.m13140(this.f16042, view);
            }
        });
        C2978 c2978 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        this.f14127 = c2978;
        c2978.setChecked(c14293.m34077());
        C2978 c2979 = (C2978) viewM10216.findViewById(R.id.MT_Protector);
        this.f14130 = c2979;
        boolean z2 = str.length() <= 2000 && C10062.m25250(str) == EnumC12178.VALID;
        c2979.setEnabled(z2);
        c2979.setChecked(z2 && z);
        m31286().addView(viewM10216);
        m31286().setVisibility(0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13139(C4417 c4417) {
        c4417.m31250("");
        c4417.m31251((String) null);
        c4417.m13142(0, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m13140(final C4417 c4417, View view) {
        C21282 c21282 = c4417.f14128;
        if (c21282 != null) {
            c21282.m48299();
        }
        C21282 c21283 = new C21282(c4417.m31271(), view, 0);
        c4417.f14128 = c21283;
        c21283.m48301(new C22056(c4417));
        String[] strArr = {"Origin", "Authorization", "Accept", "Accept-Language"};
        for (int i = 0; i < 4; i++) {
            final String str = strArr[i];
            c21283.m48304().add(str).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.֨ۙۜ
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f3451.m13144(str, (String) null);
                    return true;
                }
            });
        }
        c21283.m48305();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m13143(final C4417 c4417, View view) {
        C21282 c21282 = c4417.f14128;
        if (c21282 != null) {
            c21282.m48299();
        }
        C21282 c21283 = new C21282(c4417.m31271(), view, 0);
        c4417.f14128 = c21283;
        c21283.m48301(new C22056(c4417));
        c21283.m48304().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.۠ۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f24567.m13144("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
                return true;
            }
        });
        c21283.m48304().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ܶۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f45753.m13144("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                return true;
            }
        });
        c21283.m48304().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩸ۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f68789.m13144("User-Agent", (String) null);
                return true;
            }
        });
        c21283.m48305();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m13141(C4417 c4417, C21282 c21282) {
        if (c4417.f14128 == c21282) {
            c4417.f14128 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13144(String str, String str2) {
        String strM31260 = m31260();
        int i = 0;
        while (i <= strM31260.length()) {
            int iIndexOf = strM31260.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM31260.length();
            }
            int iIndexOf2 = strM31260.indexOf(58, i);
            if (iIndexOf2 >= i && iIndexOf2 < iIndexOf && str.equalsIgnoreCase(strM31260.substring(i, iIndexOf2).trim())) {
                int i2 = iIndexOf2 + 1;
                while (i2 < iIndexOf && (strM31260.charAt(i2) == ' ' || strM31260.charAt(i2) == '\t')) {
                    i2++;
                }
                if (iIndexOf > i2 && strM31260.charAt(iIndexOf - 1) == '\r') {
                    iIndexOf--;
                }
                if (str2 != null) {
                    m31267().replace(i2, iIndexOf, str2);
                    iIndexOf = str2.length() + i2;
                }
                m13142(i2, iIndexOf);
                return;
            }
            if (iIndexOf == strM31260.length()) {
                break;
            } else {
                i = iIndexOf + 1;
            }
        }
        InterfaceC7785 interfaceC7785M31267 = m31267();
        if (!strM31260.isEmpty() && C7416.m19937(1, strM31260) != '\n') {
            interfaceC7785M31267.append('\n');
        }
        interfaceC7785M31267.append((CharSequence) str).append(": ");
        int length = interfaceC7785M31267.length();
        if (str2 != null) {
            interfaceC7785M31267.append((CharSequence) str2);
        }
        m13142(length, interfaceC7785M31267.length());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m13142(int i, int i2) {
        m31246(i, i2);
        C10235 c10235 = (C10235) m31278().m1433(R.id.MT_Protector);
        if (c10235 != null) {
            c10235.requestFocus();
            C4925.m14329(c10235);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849
    /* JADX INFO: renamed from: ᩴ */
    public final void mo2170() {
        int i;
        try {
            this.f14129.accept(C14293.m34076(m31260(), this.f14127.isChecked()), Boolean.valueOf(this.f14130.isChecked()));
            m31262();
        } catch (C17822 e) {
            int i2 = C19940.f64597[e.m41762().ordinal()];
            if (i2 == 1) {
                i = R.string.MT_Protector;
            } else if (i2 == 2) {
                i = R.string.MT_Protector;
            } else if (i2 == 3) {
                i = R.string.MT_Protector;
            } else if (i2 == 4) {
                i = R.string.MT_Protector;
            } else {
                if (i2 != 5) {
                    throw new IncompatibleClassChangeError();
                }
                i = R.string.MT_Protector;
            }
            int length = 0;
            m31251(m31271().getString(R.string.MT_Protector, Integer.valueOf(e.m41761()), m31271().getString(i)));
            String strM31260 = m31260();
            for (int i3 = 1; i3 < e.m41761(); i3++) {
                int iIndexOf = strM31260.indexOf(10, length);
                length = iIndexOf < 0 ? strM31260.length() : iIndexOf + 1;
            }
            int iIndexOf2 = strM31260.indexOf(10, length);
            if (iIndexOf2 < 0) {
                iIndexOf2 = strM31260.length();
            }
            m13142(length, iIndexOf2);
        }
    }

    @Override // l.AbstractDialogInterfaceOnClickListenerC12849, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C21282 c21282 = this.f14128;
        if (c21282 != null) {
            c21282.m48299();
        }
    }
}
