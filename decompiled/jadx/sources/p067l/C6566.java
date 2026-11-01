package p067l;

import android.content.DialogInterface;
import android.view.MenuItem;
import android.view.View;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۙۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6566 extends AbstractDialogInterfaceOnClickListenerC14580 {

    /* JADX INFO: renamed from: ֫֫ */
    public final C0990 f16943;

    /* JADX INFO: renamed from: ۟ */
    public C1898 f16944;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C10589 f16945;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C0990 f16946;

    public C6566(AbstractActivityC5549 abstractActivityC5549, String str, C15952 c15952, boolean z, C10589 c10589) {
        super(abstractActivityC5549, -1);
        this.f16945 = c10589;
        m33344(R.string.MT_Protector);
        m33356();
        m33360(true);
        m33338(false);
        m33329();
        m33331(C13076.m29939(6.0f));
        m33355();
        m33373(8);
        m33347(R.string.MT_Protector);
        m33351("Referer: https://example.com/\nCookie: session=value\nX-Custom-Header: value");
        m33330();
        m33336((CharSequence) c15952.m36211());
        m33370();
        m33333(R.string.MT_Protector, new ViewOnClickListenerC21553(1, this), (ViewOnLongClickListenerC24753) null);
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.᩵ۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6566.m15007(this.f63774, view);
            }
        });
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.֡ۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4179.m15008("Referer", (String) null);
            }
        });
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new ViewOnClickListenerC14846(1, this));
        viewM12252.findViewById(R.id.MT_Protector).setOnClickListener(new View.OnClickListener() { // from class: l.ۚۙۜ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C6566.m15004(this.f18876, view);
            }
        });
        C0990 c0990 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        this.f16943 = c0990;
        c0990.setChecked(c15952.m36210());
        C0990 c0991 = (C0990) viewM12252.findViewById(R.id.MT_Protector);
        this.f16946 = c0991;
        boolean z2 = str.length() <= 2000 && C11931.m27267(str) == EnumC13942.VALID;
        c0991.setEnabled(z2);
        c0991.setChecked(z2 && z);
        m33372().addView(viewM12252);
        m33372().setVisibility(0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15003(C6566 c6566) {
        c6566.m33336("");
        c6566.m33337((String) null);
        c6566.m15006(0, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m15004(final C6566 c6566, View view) {
        C1898 c1898 = c6566.f16944;
        if (c1898 != null) {
            c1898.m50633();
        }
        C1898 c1899 = new C1898(c6566.m33357(), view, 0);
        c6566.f16944 = c1899;
        c1899.m50635(new C23330(c6566));
        String[] strArr = {"Origin", "Authorization", "Accept", "Accept-Language"};
        for (int i = 0; i < 4; i++) {
            final String str = strArr[i];
            c1899.m50638().add(str).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.֨ۙۜ
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    this.f6224.m15008(str, (String) null);
                    return true;
                }
            });
        }
        c1899.m50639();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m15007(final C6566 c6566, View view) {
        C1898 c1898 = c6566.f16944;
        if (c1898 != null) {
            c1898.m50633();
        }
        C1898 c1899 = new C1898(c6566.m33357(), view, 0);
        c6566.f16944 = c1899;
        c1899.m50635(new C23330(c6566));
        c1899.m50638().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.۠ۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f27480.m15008("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Mobile Safari/537.36");
                return true;
            }
        });
        c1899.m50638().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ܶۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f48866.m15008("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                return true;
            }
        });
        c1899.m50638().add(R.string.MT_Protector).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.᩸ۙۜ
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                this.f71483.m15008("User-Agent", (String) null);
                return true;
            }
        });
        c1899.m50639();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m15005(C6566 c6566, C1898 c1898) {
        if (c6566.f16944 == c1898) {
            c6566.f16944 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15008(String str, String str2) {
        String strM33346 = m33346();
        int i = 0;
        while (i <= strM33346.length()) {
            int iIndexOf = strM33346.indexOf(10, i);
            if (iIndexOf < 0) {
                iIndexOf = strM33346.length();
            }
            int iIndexOf2 = strM33346.indexOf(58, i);
            if (iIndexOf2 >= i && iIndexOf2 < iIndexOf && str.equalsIgnoreCase(strM33346.substring(i, iIndexOf2).trim())) {
                int i2 = iIndexOf2 + 1;
                while (i2 < iIndexOf && (strM33346.charAt(i2) == ' ' || strM33346.charAt(i2) == '\t')) {
                    i2++;
                }
                if (iIndexOf > i2 && strM33346.charAt(iIndexOf - 1) == '\r') {
                    iIndexOf--;
                }
                if (str2 != null) {
                    m33353().replace(i2, iIndexOf, str2);
                    iIndexOf = str2.length() + i2;
                }
                m15006(i2, iIndexOf);
                return;
            }
            if (iIndexOf == strM33346.length()) {
                break;
            } else {
                i = iIndexOf + 1;
            }
        }
        InterfaceC9768 interfaceC9768M33353 = m33353();
        if (!strM33346.isEmpty() && C9417.m21911(1, strM33346) != '\n') {
            interfaceC9768M33353.append('\n');
        }
        interfaceC9768M33353.append((CharSequence) str).append(": ");
        int length = interfaceC9768M33353.length();
        if (str2 != null) {
            interfaceC9768M33353.append((CharSequence) str2);
        }
        m15006(length, interfaceC9768M33353.length());
    }

    /* JADX INFO: renamed from: ۧ */
    private void m15006(int i, int i2) {
        m33332(i, i2);
        C12096 c12096 = (C12096) m33364().m3846(R.id.MT_Protector);
        if (c12096 != null) {
            c12096.requestFocus();
            C7050.m16226(c12096);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580
    /* JADX INFO: renamed from: ᩴ */
    public final void mo4537() {
        int i;
        try {
            this.f16945.accept(C15952.m36209(m33346(), this.f16943.isChecked()), Boolean.valueOf(this.f16946.isChecked()));
            m33348();
        } catch (C19306 e) {
            int i2 = C21319.f67234[e.m44008().ordinal()];
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
            m33337(m33357().getString(R.string.MT_Protector, Integer.valueOf(e.m44007()), m33357().getString(i)));
            String strM33346 = m33346();
            for (int i3 = 1; i3 < e.m44007(); i3++) {
                int iIndexOf = strM33346.indexOf(10, length);
                length = iIndexOf < 0 ? strM33346.length() : iIndexOf + 1;
            }
            int iIndexOf2 = strM33346.indexOf(10, length);
            if (iIndexOf2 < 0) {
                iIndexOf2 = strM33346.length();
            }
            m15006(length, iIndexOf2);
        }
    }

    @Override // p067l.AbstractDialogInterfaceOnClickListenerC14580, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        C1898 c1898 = this.f16944;
        if (c1898 != null) {
            c1898.m50633();
        }
    }
}
