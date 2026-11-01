package p067l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.p000mt.plus.R;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4024 {

    /* JADX INFO: renamed from: ܽ */
    public static final Set f8796;

    /* JADX INFO: renamed from: ֫ */
    public C24455 f8799;

    /* JADX INFO: renamed from: ۧ */
    public ListView f8800;

    /* JADX INFO: renamed from: ᩳ */
    public static final ArrayList f8798 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public static int f8797 = -1;

    static {
        HashSet hashSet = new HashSet();
        for (EnumC3167 enumC3167 : EnumC3167.values()) {
            hashSet.add(enumC3167.f6089);
        }
        f8796 = C21562.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m8029(C14146 c14146) {
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        int iM32508 = c14146.m32508();
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC9768M32500, '\n', iM32508 - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC9768M32500, '\n', iM32508);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC9768M32500.length();
        }
        String strTrim = interfaceC9768M32500.subSequence(iLastIndexOf, iIndexOf).toString().trim();
        int iIndexOf2 = strTrim.indexOf(32);
        if (iIndexOf2 != -1) {
            strTrim = strTrim.substring(0, iIndexOf2);
        }
        if (f8796.contains(strTrim)) {
            return strTrim;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    public C4024(AbstractActivityC5549 abstractActivityC5549, String str) {
        int i;
        int i2;
        synchronized (C4024.class) {
            Locale locale = C7050.m16232().getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            int iHashCode = language.hashCode();
            i = 1;
            if (iHashCode != 3139) {
                if (iHashCode != 3365) {
                    if (iHashCode != 3651) {
                        if (iHashCode != 3710) {
                            if (iHashCode != 3734) {
                                if (iHashCode == 3886 && language.equals("zh")) {
                                    i2 = "CN".equals(locale.getCountry()) ? 0 : 1;
                                } else {
                                    i2 = 2;
                                }
                            } else if (language.equals("uk")) {
                                i2 = 4;
                            } else {
                                i2 = 2;
                            }
                        } else if (language.equals("tr")) {
                            i2 = 6;
                        } else {
                            i2 = 2;
                        }
                    } else if (language.equals("ru")) {
                        i2 = 3;
                    } else {
                        i2 = 2;
                    }
                } else if (language.equals("in")) {
                    i2 = 5;
                } else {
                    i2 = 2;
                }
            } else if (language.equals("be")) {
                i2 = 7;
            } else {
                i2 = 2;
            }
            if (f8797 != i2) {
                f8798.clear();
                try {
                    InputStream inputStreamOpen = C7050.m16222().open("8");
                    try {
                        C14677 c14677 = new C14677(C2700.m4194(inputStreamOpen, 0));
                        for (int i3 = 0; i3 < i2; i3++) {
                            c14677.skipBytes(c14677.readInt());
                        }
                        byte[] bArrM33583 = c14677.m33583();
                        for (int i4 = 0; i4 < bArrM33583.length; i4++) {
                            bArrM33583[i4] = (byte) ((~bArrM33583[i4]) ^ (i4 * i4));
                        }
                        for (String str2 : new String(bArrM33583, Charset.defaultCharset()).split("\n\n")) {
                            int iIndexOf = str2.indexOf(10);
                            f8798.add(new C9703(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim()));
                        }
                        f8797 = i2;
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                    } catch (Throwable th) {
                        if (inputStreamOpen != null) {
                            try {
                                inputStreamOpen.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        View viewM12252 = abstractActivityC5549.m12252(R.layout.MT_Protector);
        C24790 c24790 = (C24790) viewM12252.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM12252.findViewById(R.id.MT_Protector);
        ListView listView = (ListView) viewM12252.findViewById(R.id.MT_Protector);
        this.f8800 = listView;
        C24455 c24455 = new C24455(this);
        this.f8799 = c24455;
        listView.setAdapter((ListAdapter) c24455);
        listView.setFastScrollEnabled(true);
        C7040.m16181(listView);
        textView.setText(R.string.MT_Protector);
        c24790.m54458(new C13727(this, textView));
        if (!TextUtils.isEmpty(str)) {
            c24790.m54461(false);
            c24790.m54457(str);
            listView.requestFocus();
        }
        int i5 = DialogInterfaceC2564.f4230;
        C20671 c20671 = new C20671(abstractActivityC5549);
        c20671.m46715(viewM12252);
        c20671.m46736(R.string.MT_Protector, null);
        DialogInterfaceC2564 dialogInterfaceC2564M46732 = c20671.m46732();
        if (abstractActivityC5549 instanceof ActivityC23104) {
            dialogInterfaceC2564M46732.m3849(new DialogInterfaceOnDismissListenerC12623(abstractActivityC5549, i));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m8028(String str, CharSequence charSequence, int i) {
        int iM26620 = C11567.m26620(str, charSequence, 0);
        if (iM26620 == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        do {
            spannableString.setSpan(new StyleSpan(1), iM26620, str.length() + iM26620, 33);
            spannableString.setSpan(new ForegroundColorSpan(i), iM26620, str.length() + iM26620, 33);
            iM26620 = C11567.m26620(str, charSequence, str.length() + iM26620);
        } while (iM26620 != -1);
        return spannableString;
    }
}
