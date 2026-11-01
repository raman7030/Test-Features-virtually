package p067l;

import android.text.Spannable;
import android.text.SpannableString;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.p000mt.plugin.api.p002ui.PluginEditText;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۘۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5883 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f14467 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final long f14468;

    /* JADX INFO: renamed from: ܽ */
    public static final WeakHashMap f14469;

    /* JADX INFO: renamed from: ᩳ */
    public static final long f14470;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f14470 = timeUnit.toNanos(1500L);
        f14468 = timeUnit.toNanos(50L);
        f14469 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m13221(TextView textView, C24320 c24320, boolean z) {
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            if (z) {
                m13223(c24320, spannable);
            } else {
                m13218(spannable);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13223(C24320 c24320, Spannable spannable) {
        if (spannable.length() > 8192) {
            m13218(spannable);
            return;
        }
        C11209 c11209M13217 = m13217(c24320, spannable, f14470);
        if (c11209M13217 != null) {
            m13219(spannable, c11209M13217);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13218(Spannable spannable) {
        for (C4542 c4542 : (C4542[]) spannable.getSpans(0, spannable.length(), C4542.class)) {
            spannable.removeSpan(c4542);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11209 m13217(C24320 c24320, CharSequence charSequence, long j) {
        if (charSequence instanceof InterfaceC21800) {
            C9729 c9729Mo28589 = ((InterfaceC21800) charSequence).mo28589();
            try {
                C11209 c11209M13217 = m13217(c24320, c9729Mo28589, j);
                c9729Mo28589.close();
                return c11209M13217;
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C11248 c11248 = new C11248();
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C5370 c5370 = new C5370(c24320, charSequence, c11248);
        try {
            if (c5370.m11699(Integer.MAX_VALUE, j, (C24460) null) == EnumC6711.COMPLETED) {
                return c5370.m11717();
            }
        } catch (C10064 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11209 m13216(C24320 c24320, CharSequence charSequence, int i, long j) {
        if (charSequence instanceof InterfaceC21800) {
            C9729 c9729Mo28589 = ((InterfaceC21800) charSequence).mo28589();
            try {
                C11209 c11209M13216 = m13216(c24320, c9729Mo28589, i, j);
                c9729Mo28589.close();
                return c11209M13216;
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative syntax highlight prefix length");
        }
        int iMin = Math.min(charSequence.length(), i);
        if (!c24320.m53670()) {
            return null;
        }
        C5370 c5370 = new C5370(c24320, charSequence, new C11248(), iMin);
        try {
            if (c5370.m11699(Integer.MAX_VALUE, j, (C24460) null) == EnumC6711.COMPLETED) {
                return c5370.m11717();
            }
        } catch (C10064 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13219(Spannable spannable, C11209 c11209) {
        if (c11209.m25889() != spannable.length()) {
            throw new IllegalArgumentException("Syntax store and text lengths differ");
        }
        m13218(spannable);
        C19255 c19255 = new C19255();
        c19255.m43866(c11209);
        while (c19255.m43871()) {
            C23120 c23120M43870 = c19255.m43870();
            spannable.setSpan(new C4542(c23120M43870.m51556(), c23120M43870.m51558()), c19255.m43868(), c19255.m43865(), 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: ֫ */
    public static CharSequence m13215(String str) {
        C24320 c24320M53658;
        C11209 c11209M13216;
        int iMin = Math.min(str.length(), 200);
        ?? Substring = str.substring(0, iMin);
        if (str.length() <= 8192) {
            C16689 c16689M20940 = C9038.m20940("INTERNAL:ArscTranslationItem");
            C24320 c24320 = null;
            if (c16689M20940 != null) {
                try {
                    WeakHashMap weakHashMap = f14469;
                    synchronized (weakHashMap) {
                        WeakReference weakReference = (WeakReference) weakHashMap.get(c16689M20940);
                        c24320M53658 = weakReference == null ? null : (C24320) weakReference.get();
                        if (c24320M53658 == null || !c24320M53658.m53666()) {
                            c24320M53658 = C24320.m53658(c16689M20940);
                            weakHashMap.put(c16689M20940, new WeakReference(c24320M53658));
                        }
                    }
                    c24320 = c24320M53658;
                } catch (RuntimeException unused) {
                }
            }
            if (c24320 != null && c24320.m53670() && (c11209M13216 = m13216(c24320, str, iMin, f14468)) != null) {
                Substring = Substring instanceof Spannable ? (Spannable) Substring : new SpannableString(Substring);
                m13219((Spannable) Substring, c11209M13216);
            }
        }
        return Substring;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13220(final EditText editText, CheckBox checkBox) {
        C24320 c24320M53658;
        Spannable spannable;
        C16689 c16689M20940 = C9038.m20940(PluginEditText.SYNTAX_REGEX);
        final C24320 c24320 = null;
        if (c16689M20940 != null) {
            try {
                WeakHashMap weakHashMap = f14469;
                synchronized (weakHashMap) {
                    WeakReference weakReference = (WeakReference) weakHashMap.get(c16689M20940);
                    c24320M53658 = weakReference == null ? null : (C24320) weakReference.get();
                    if (c24320M53658 == null || !c24320M53658.m53666()) {
                        c24320M53658 = C24320.m53658(c16689M20940);
                        weakHashMap.put(c16689M20940, new WeakReference(c24320M53658));
                    }
                }
                c24320 = c24320M53658;
            } catch (RuntimeException unused) {
            }
        }
        if (c24320 == null) {
            return;
        }
        CharSequence text = editText.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            SpannableString spannableString = new SpannableString(text);
            editText.setText(spannableString);
            spannable = spannableString;
        }
        if (checkBox == null || checkBox.isChecked()) {
            m13223(c24320, spannable);
        }
        editText.addTextChangedListener(new C17281(checkBox, c24320));
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۡۘܿ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C5883.m13221(editText, c24320, z);
                }
            });
        }
    }
}
