package l;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: l.֫ۢۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9SC */
/* JADX INFO: loaded from: classes2.dex */
public final class C1742 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Set f6019;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C23239 f6022;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ListView f6023;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final ArrayList f6021 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static int f6020 = -1;

    static {
        HashSet hashSet = new HashSet();
        for (EnumC0841 enumC0841 : EnumC0841.values()) {
            hashSet.add(enumC0841.f3315);
        }
        f6019 = C20195.unmodifiableSet(hashSet);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m5819(C12392 c12392) {
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        int iM30444 = c12392.m30444();
        int iLastIndexOf = TextUtils.lastIndexOf(interfaceC7785M30436, '\n', iM30444 - 1) + 1;
        int iIndexOf = TextUtils.indexOf((CharSequence) interfaceC7785M30436, '\n', iM30444);
        if (iIndexOf == -1) {
            iIndexOf = interfaceC7785M30436.length();
        }
        String strTrim = interfaceC7785M30436.subSequence(iLastIndexOf, iIndexOf).toString().trim();
        int iIndexOf2 = strTrim.indexOf(32);
        if (iIndexOf2 != -1) {
            strTrim = strTrim.substring(0, iIndexOf2);
        }
        if (f6019.contains(strTrim)) {
            return strTrim;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0081  */
    public C1742(AbstractActivityC3346 abstractActivityC3346, String str) {
        int i;
        int i2;
        synchronized (C1742.class) {
            Locale locale = C4925.m14335().getResources().getConfiguration().locale;
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
            if (f6020 != i2) {
                f6021.clear();
                try {
                    InputStream inputStreamOpen = C4925.m14325().open("8");
                    try {
                        C12951 c12951 = new C12951(C0349.m1795(inputStreamOpen, 0));
                        for (int i3 = 0; i3 < i2; i3++) {
                            c12951.skipBytes(c12951.readInt());
                        }
                        byte[] bArrM31496 = c12951.m31496();
                        for (int i4 = 0; i4 < bArrM31496.length; i4++) {
                            bArrM31496[i4] = (byte) ((~bArrM31496[i4]) ^ (i4 * i4));
                        }
                        for (String str2 : new String(bArrM31496, Charset.defaultCharset()).split("\n\n")) {
                            int iIndexOf = str2.indexOf(10);
                            f6021.add(new C7717(str2.substring(0, iIndexOf).trim(), str2.substring(iIndexOf + 1).trim()));
                        }
                        f6020 = i2;
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
        View viewM10216 = abstractActivityC3346.m10216(R.layout.MT_Protector);
        C23592 c23592 = (C23592) viewM10216.findViewById(R.id.searchView);
        TextView textView = (TextView) viewM10216.findViewById(R.id.MT_Protector);
        ListView listView = (ListView) viewM10216.findViewById(R.id.MT_Protector);
        this.f6023 = listView;
        C23239 c23239 = new C23239(this);
        this.f6022 = c23239;
        listView.setAdapter((ListAdapter) c23239);
        listView.setFastScrollEnabled(true);
        C4915.m14284(listView);
        textView.setText(R.string.MT_Protector);
        c23592.m52055(new C11951(this, textView));
        if (!TextUtils.isEmpty(str)) {
            c23592.m52058(false);
            c23592.m52054(str);
            listView.requestFocus();
        }
        int i5 = DialogInterfaceC0206.f1451;
        C19258 c19258 = new C19258(abstractActivityC3346);
        c19258.m44421(viewM10216);
        c19258.m44442(R.string.MT_Protector, null);
        DialogInterfaceC0206 dialogInterfaceC0206M44438 = c19258.m44438();
        if (abstractActivityC3346 instanceof ActivityC21817) {
            dialogInterfaceC0206M44438.m1436(new DialogInterfaceOnDismissListenerC10790(abstractActivityC3346, i));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m5818(String str, CharSequence charSequence, int i) {
        int iM24606 = C9679.m24606(str, charSequence, 0);
        if (iM24606 == -1) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        do {
            spannableString.setSpan(new StyleSpan(1), iM24606, str.length() + iM24606, 33);
            spannableString.setSpan(new ForegroundColorSpan(i), iM24606, str.length() + iM24606, 33);
            iM24606 = C9679.m24606(str, charSequence, str.length() + iM24606);
        } while (iM24606 != -1);
        return spannableString;
    }
}
