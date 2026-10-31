package l;

import android.text.Spannable;
import android.text.SpannableString;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import bin.mt.plugin.api.ui.PluginEditText;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.ۘۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q983 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3698 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f11665 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final long f11666;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f11667;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final long f11668;

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f11668 = timeUnit.toNanos(1500L);
        f11666 = timeUnit.toNanos(50L);
        f11667 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m11274(TextView textView, C23097 c23097, boolean z) {
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            Spannable spannable = (Spannable) text;
            if (z) {
                m11276(c23097, spannable);
            } else {
                m11271(spannable);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11276(C23097 c23097, Spannable spannable) {
        if (spannable.length() > 8192) {
            m11271(spannable);
            return;
        }
        C9302 c9302M11270 = m11270(c23097, spannable, f11668);
        if (c9302M11270 != null) {
            m11272(spannable, c9302M11270);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11271(Spannable spannable) {
        for (C2287 c2287 : (C2287[]) spannable.getSpans(0, spannable.length(), C2287.class)) {
            spannable.removeSpan(c2287);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m11270(C23097 c23097, CharSequence charSequence, long j) {
        if (charSequence instanceof InterfaceC20445) {
            C7744 c7744Mo26556 = ((InterfaceC20445) charSequence).mo26556();
            try {
                C9302 c9302M11270 = m11270(c23097, c7744Mo26556, j);
                c7744Mo26556.close();
                return c9302M11270;
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        C9343 c9343 = new C9343();
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C3158 c3158 = new C3158(c23097, charSequence, c9343);
        try {
            if (c3158.m9655(Integer.MAX_VALUE, j, (C23244) null) == EnumC4569.COMPLETED) {
                return c3158.m9673();
            }
        } catch (C8097 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9302 m11269(C23097 c23097, CharSequence charSequence, int i, long j) {
        if (charSequence instanceof InterfaceC20445) {
            C7744 c7744Mo26556 = ((InterfaceC20445) charSequence).mo26556();
            try {
                C9302 c9302M11269 = m11269(c23097, c7744Mo26556, i, j);
                c7744Mo26556.close();
                return c9302M11269;
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
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
        if (!c23097.m51276()) {
            return null;
        }
        C3158 c3158 = new C3158(c23097, charSequence, new C9343(), iMin);
        try {
            if (c3158.m9655(Integer.MAX_VALUE, j, (C23244) null) == EnumC4569.COMPLETED) {
                return c3158.m9673();
            }
        } catch (C8097 unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11272(Spannable spannable, C9302 c9302) {
        if (c9302.m23880() != spannable.length()) {
            throw new IllegalArgumentException("Syntax store and text lengths differ");
        }
        m11271(spannable);
        C17768 c17768 = new C17768();
        c17768.m41620(c9302);
        while (c17768.m41625()) {
            C21834 c21834M41624 = c17768.m41624();
            spannable.setSpan(new C2287(c21834M41624.m49205(), c21834M41624.m49207()), c17768.m41622(), c17768.m41619(), 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static CharSequence m11268(String str) {
        C23097 c23097M51264;
        C9302 c9302M11269;
        int iMin = Math.min(str.length(), 200);
        ?? Substring = str.substring(0, iMin);
        if (str.length() <= 8192) {
            C15068 c15068M18983 = C7017.m18983("INTERNAL:ArscTranslationItem");
            C23097 c23097 = null;
            if (c15068M18983 != null) {
                try {
                    WeakHashMap weakHashMap = f11667;
                    synchronized (weakHashMap) {
                        WeakReference weakReference = (WeakReference) weakHashMap.get(c15068M18983);
                        c23097M51264 = weakReference == null ? null : (C23097) weakReference.get();
                        if (c23097M51264 == null || !c23097M51264.m51272()) {
                            c23097M51264 = C23097.m51264(c15068M18983);
                            weakHashMap.put(c15068M18983, new WeakReference(c23097M51264));
                        }
                    }
                    c23097 = c23097M51264;
                } catch (RuntimeException unused) {
                }
            }
            if (c23097 != null && c23097.m51276() && (c9302M11269 = m11269(c23097, str, iMin, f11666)) != null) {
                Substring = Substring instanceof Spannable ? (Spannable) Substring : new SpannableString(Substring);
                m11272((Spannable) Substring, c9302M11269);
            }
        }
        return Substring;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11273(final EditText editText, CheckBox checkBox) {
        C23097 c23097M51264;
        Spannable spannable;
        C15068 c15068M18983 = C7017.m18983(PluginEditText.SYNTAX_REGEX);
        final C23097 c23097 = null;
        if (c15068M18983 != null) {
            try {
                WeakHashMap weakHashMap = f11667;
                synchronized (weakHashMap) {
                    WeakReference weakReference = (WeakReference) weakHashMap.get(c15068M18983);
                    c23097M51264 = weakReference == null ? null : (C23097) weakReference.get();
                    if (c23097M51264 == null || !c23097M51264.m51272()) {
                        c23097M51264 = C23097.m51264(c15068M18983);
                        weakHashMap.put(c15068M18983, new WeakReference(c23097M51264));
                    }
                }
                c23097 = c23097M51264;
            } catch (RuntimeException unused) {
            }
        }
        if (c23097 == null) {
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
            m11276(c23097, spannable);
        }
        editText.addTextChangedListener(new C15691(checkBox, c23097));
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۡۘܿ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    C3698.m11274(editText, c23097, z);
                }
            });
        }
    }
}
