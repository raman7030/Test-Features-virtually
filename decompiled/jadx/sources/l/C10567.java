package l;

import android.text.Editable;
import android.text.InputFilter;
import android.text.Selection;
import java.lang.reflect.Array;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤ᩸ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: CB2D */
/* JADX INFO: loaded from: classes4.dex */
public class C10567 implements InterfaceC20445, AutoCloseable {

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public static final InputFilter[] f31701 = new InputFilter[0];

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public boolean f31702;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f31703;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputFilter[] f31704;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f31705;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f31706;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C18077 f31707;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C23721 f31708;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public volatile int f31709;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC0897 f31710;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C10776 f31711;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.ReadLock f31712;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C11978 f31713;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock.WriteLock f31714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C2827 f31715;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile boolean f31716;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31717;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f31718;

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        append(charSequence);
        return this;
    }

    @Override // android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        insert(i, charSequence);
        return this;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0897 m26561() {
        return this.f31710;
    }

    public C10567() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f31705 = reentrantReadWriteLock;
        this.f31712 = reentrantReadWriteLock.readLock();
        this.f31714 = reentrantReadWriteLock.writeLock();
        this.f31710 = new C13388(this);
        this.f31704 = f31701;
        C11999.m29337(0, 0, 0);
        this.f31708 = null;
        C2827 c2827 = new C2827("");
        this.f31715 = c2827;
        c2827.m8725(new C9883(0, 0, "", 0, 0), null);
        this.f31713 = new C11978(this, "", 0);
    }

    public C10567(C23721 c23721) {
        this(c23721, null);
    }

    public C10567(C23721 c23721, CharSequence charSequence) {
        C11978 c11978;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f31705 = reentrantReadWriteLock;
        this.f31712 = reentrantReadWriteLock.readLock();
        this.f31714 = reentrantReadWriteLock.writeLock();
        this.f31710 = new C13388(this);
        this.f31704 = f31701;
        this.f31708 = c23721;
        this.f31715 = null;
        if (charSequence == null) {
            c11978 = new C11978(this, null, 0);
        } else {
            c11978 = new C11978(this, charSequence, charSequence.length());
        }
        this.f31713 = c11978;
        C5089 c5089M52359 = c23721.m52359();
        this.f31702 = true;
        try {
            if (c5089M52359.m14642() >= 0) {
                setSpan(Selection.SELECTION_START, c5089M52359.m14642(), c5089M52359.m14642(), 34);
            }
            if (c5089M52359.m14640() >= 0) {
                setSpan(Selection.SELECTION_END, c5089M52359.m14640(), c5089M52359.m14640(), 34);
            }
        } finally {
            this.f31702 = false;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12704 m26565() {
        m26546();
        C23721 c23721 = this.f31708;
        return c23721 == null ? this.f31715.m8724() : c23721.m52357();
    }

    @Override // l.InterfaceC20445
    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public final C7744 mo26556() {
        return m26544(false);
    }

    @Override // l.InterfaceC20445
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C7744 mo26562() {
        return m26544(true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private C7744 m26544(boolean z) {
        C23721 c23721;
        this.f31712.lock();
        try {
            if (this.f31718 != 0) {
                throw new IllegalStateException("Text replacement is not published");
            }
            m26546();
            C12704 c12704M26565 = (!z || (c23721 = this.f31708) == null) ? m26565() : c23721.m52367();
            int i = this.f31709;
            this.f31712.unlock();
            return C7744.m20754(c12704M26565, i);
        } catch (Throwable th) {
            this.f31712.unlock();
            throw th;
        }
    }

    @Override // l.InterfaceC20445
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo26553(C7744 c7744) {
        C12704 c12704M20764 = c7744 == null ? null : c7744.m20764();
        boolean z = false;
        if (c12704M20764 == null) {
            return false;
        }
        this.f31712.lock();
        try {
            if (!this.f31716 && this.f31718 == 0 && c7744.m20767() == this.f31709) {
                C23721 c23721 = this.f31708;
                if (c23721 == null) {
                    if (this.f31715.m8726(c12704M20764)) {
                        z = true;
                    }
                } else if (c23721.m52346(c12704M20764)) {
                    z = true;
                }
            }
            return z;
        } finally {
            this.f31712.unlock();
        }
    }

    /* JADX INFO: renamed from: ۤ֫ */
    public EnumC16665 mo1599() {
        return m26545(false);
    }

    /* JADX INFO: renamed from: ۗ֫ */
    public EnumC16665 mo1597() {
        return m26545(true);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26560(Runnable runnable) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            m26546();
            C23721 c23721 = this.f31708;
            if (c23721 == null) {
                throw new IllegalStateException("History requires a text session");
            }
            int i = this.f31703;
            if (i != 0 || this.f31706 != 0) {
                throw new IllegalStateException("Cannot group history during text callbacks");
            }
            this.f31703 = i + 1;
            try {
                m26555();
                c23721.m52335(runnable);
                this.f31703--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f31703--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۬ */
    public int mo13049() {
        return hashCode();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private EnumC16665 m26545(boolean z) {
        EnumC16665 enumC16665M52333;
        this.f31714.lock();
        try {
            if (this.f31716) {
                enumC16665M52333 = EnumC16665.UNAVAILABLE;
            } else {
                m26546();
                if (this.f31708 == null) {
                    throw new IllegalStateException("History requires a text session");
                }
                int i = this.f31703;
                if (i != 0 || this.f31706 != 0) {
                    throw new IllegalStateException("Cannot replay history during text callbacks");
                }
                this.f31703 = i + 1;
                try {
                    m26555();
                    enumC16665M52333 = this.f31708.m52333(z, new C12683(this));
                    this.f31703--;
                } catch (Throwable th) {
                    this.f31703--;
                    throw th;
                }
            }
            this.f31714.unlock();
            return enumC16665M52333;
        } catch (Throwable th2) {
            this.f31714.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo13046(boolean z) {
        close();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26551(C23721 c23721) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            m26546();
            if (this.f31708 != c23721) {
                throw new IllegalArgumentException("Text batch belongs to another session");
            }
            if (this.f31706 != 0 || this.f31703 != 0) {
                throw new IllegalStateException("Cannot publish text load during callbacks");
            }
            writeLock.unlock();
        } catch (Throwable th) {
            writeLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public C5131 mo13045(C18495 c18495) {
        return c18495.m42996(this.f31710);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26554(C23721 c23721, C0149 c0149, char[] cArr, int i, C5131 c5131, int i2) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            m26551(c23721);
            return this.f31708.m52345(this.f31710, c0149, cArr, i, c5131, i2);
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26550(C18077 c18077) {
        int length = length();
        C18077 c18078 = this.f31707;
        this.f31707 = c18077;
        this.f31706++;
        try {
            this.f31713.m29278(length, length, (CharSequence) CharBuffer.wrap(c18077.m42138(), 0, c18077.m42139()), 0, c18077.m42139(), true);
            this.f31713.getClass();
        } finally {
            this.f31707 = c18078;
            this.f31706--;
        }
    }

    @Override // l.InterfaceC20445
    public final void setSelection(int i) {
        setSelection(i, i);
    }

    @Override // l.InterfaceC20445
    public final void setSelection(int i, int i2) {
        this.f31714.lock();
        try {
            if (!this.f31716) {
                Selection.setSelection(this, Math.min(i, length()), Math.min(i2, length()));
            }
        } finally {
            this.f31714.unlock();
        }
    }

    @Override // android.text.Editable
    public C10567 replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        m26540(i, i2, charSequence, i3, i4, (C10776) null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m26540(int i, int i2, CharSequence charSequence, int i3, int i4, C10776 c10776) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        if (this.f31716) {
            return;
        }
        int length = charSequence.length();
        if (this.f31716) {
            return;
        }
        if (i3 < 0 || i4 < i3 || i4 > length) {
            StringBuilder sbM46682 = C20361.m46682("start = ", i3, ", end = ", ", length = ", i4);
            sbM46682.append(length);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
        CharSequence charSequence2 = charSequence;
        int i5 = i3;
        int length2 = i4;
        for (InputFilter inputFilter : this.f31704) {
            if (this.f31716) {
                return;
            }
            CharSequence charSequenceFilter = inputFilter.filter(charSequence2, i5, length2, this, i, i2);
            if (this.f31716) {
                return;
            }
            if (charSequenceFilter != null) {
                charSequence2 = charSequenceFilter;
                length2 = charSequenceFilter.length();
                i5 = 0;
            }
        }
        writeLock.lock();
        try {
            if (!m26543()) {
                writeLock.unlock();
                return;
            }
            m26555();
            C11999.m29337(i, i2, length());
            C11999.m29338(length(), i2 - i, length2 - i5);
            this.f31706++;
            C10776 c10777 = this.f31711;
            C18077 c18077 = this.f31707;
            this.f31711 = c10776;
            this.f31707 = null;
            try {
                this.f31713.m29278(i, i2, charSequence2, i5, length2, false);
                this.f31713.getClass();
                this.f31711 = c10777;
                this.f31707 = c18077;
                this.f31706--;
                writeLock.unlock();
            } catch (Throwable th) {
                this.f31711 = c10777;
                this.f31707 = c18077;
                this.f31706--;
                throw th;
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    @Override // l.InterfaceC20445
    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public final int mo26548() {
        return this.f31709;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m26564() {
        if (this.f31705.isWriteLockedByCurrentThread()) {
            return (this.f31706 == 0 && this.f31703 == 0) ? false : true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [l.ۗ᩸ᩳ] */
    /* JADX WARN: Type inference failed for: r8v0, types: [l.ۙ᩸ᩳ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26549(final int i, final int i2, final CharSequence charSequence, final int i3, final int i4) {
        this.f31718++;
        if (i != i2 || i3 != i4) {
            try {
                this.f31709++;
            } finally {
                this.f31718--;
            }
        }
        C23721 c23721 = this.f31708;
        if (c23721 == 0) {
            C2827 c2827 = this.f31715;
            c2827.getClass();
            c2827.m8725(new C9883(i, i2, charSequence, i3, i4), null);
        } else {
            C18077 c18077 = this.f31707;
            if (c18077 != null) {
                c23721.m52342(c18077);
            } else {
                C10776 c10776 = this.f31711;
                if (c10776 != null) {
                    c23721.m52340(c10776, (C4922) new Consumer() { // from class: l.ۙ᩸ᩳ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C16231) obj).m38194(i, i2, charSequence, i3, i4);
                        }
                    });
                } else {
                    c23721.m52339((C3511) new Consumer() { // from class: l.ۗ᩸ᩳ
                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return C23517.$default$andThen(this, consumer);
                        }

                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            ((C16231) obj).m38194(i, i2, charSequence, i3, i4);
                        }
                    });
                }
            }
        }
    }

    @Override // android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return replace(i, i, charSequence, i2, i3);
    }

    @Override // android.text.Editable
    public final Editable delete(int i, int i2) {
        return replace(i, i2, "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26558(int i) {
        replace(0, i, "");
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final void append(CharSequence charSequence) {
        insert(length(), charSequence);
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        int length = length();
        replace(length, length, charSequence, i, i2);
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        insert(length(), (CharSequence) String.valueOf(c));
        return this;
    }

    @Override // android.text.Editable
    public final void clear() {
        m26558(length());
    }

    @Override // android.text.Editable
    public final void setFilters(InputFilter[] inputFilterArr) {
        this.f31714.lock();
        try {
            if (!this.f31716) {
                if (inputFilterArr == null) {
                    throw new IllegalArgumentException();
                }
                this.f31704 = inputFilterArr;
            }
            this.f31714.unlock();
        } catch (Throwable th) {
            this.f31714.unlock();
            throw th;
        }
    }

    @Override // android.text.Editable
    public final InputFilter[] getFilters() {
        return this.f31704;
    }

    @Override // android.text.GetChars
    public final void getChars(int i, int i2, char[] cArr, int i3) {
        ReentrantReadWriteLock.ReadLock readLock = this.f31712;
        readLock.lock();
        try {
            m26541(i, i2, cArr, i3);
        } finally {
            readLock.unlock();
        }
    }

    @Override // l.InterfaceC20445
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo26559(int i, int i2, char[] cArr, int i3) {
        m26541(i, i2, cArr, i3);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m26541(int i, int i2, char[] cArr, int i3) {
        C12704 c12704M26547 = m26547();
        try {
            if (c12704M26547 != null) {
                c12704M26547.getChars(i, i2, cArr, i3);
            } else {
                int i4 = i2 - i;
                if (i < 0 || i2 < i || i3 < 0 || i4 > cArr.length - i3) {
                    throw new IndexOutOfBoundsException("Invalid character copy range");
                }
                Arrays.fill(cArr, i3, i4 + i3, (char) 0);
            }
            if (c12704M26547 != null) {
                c12704M26547.close();
            }
        } catch (Throwable th) {
            if (c12704M26547 != null) {
                try {
                    c12704M26547.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        try {
            if (this.f31716) {
                return (char) 0;
            }
            C23721 c23721 = this.f31708;
            if (c23721 == null) {
                C11999 c11999M8723 = this.f31715.m8723(i);
                C21605 c21605 = c11999M8723.f35930;
                try {
                    return c11999M8723.m29340(i);
                } finally {
                    if (c21605 != null) {
                        c21605.m48812();
                    }
                }
            }
            return c23721.m52330(i);
        } catch (C2121 e) {
            if (this.f31716) {
                return (char) 0;
            }
            throw e;
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        try {
            if (this.f31716) {
                return this.f31717;
            }
            C23721 c23721 = this.f31708;
            return c23721 == null ? this.f31715.length() : c23721.length();
        } catch (C2121 e) {
            if (!this.f31716) {
                throw e;
            }
            return this.f31717;
        }
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        char[] cArr = new char[i2 - i];
        getChars(i, i2, cArr, 0);
        return new String(cArr);
    }

    @Override // l.InterfaceC20445
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String mo26557(int i, int i2) {
        return ((String) subSequence(i, i2)).toString();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        C12704 c12704M26547 = m26547();
        try {
            String str = c12704M26547 == null ? new String(new char[this.f31717]) : c12704M26547.toString();
            if (c12704M26547 != null) {
                c12704M26547.close();
            }
            return str;
        } catch (Throwable th) {
            if (c12704M26547 != null) {
                try {
                    c12704M26547.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // android.text.Editable
    public final void clearSpans() {
        C11978 c11978 = this.f31713;
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            if (m26543()) {
                c11978.m29277();
                m26555();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        C11978 c11978 = this.f31713;
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            if (m26543()) {
                c11978.m29279(obj, i, i2, i3);
                m26555();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        C11978 c11978 = this.f31713;
        ReentrantReadWriteLock.WriteLock writeLock = this.f31714;
        writeLock.lock();
        try {
            if (m26543()) {
                c11978.m29284(obj);
                m26555();
            }
        } finally {
            writeLock.unlock();
        }
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        Object[] objArrM29280;
        this.f31712.lock();
        try {
            if (this.f31716) {
                if (cls == null) {
                    cls = Object.class;
                }
                objArrM29280 = (Object[]) Array.newInstance((Class<?>) cls, 0);
            } else {
                objArrM29280 = this.f31713.m29280(i, i2, cls);
            }
            return objArrM29280;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        this.f31712.lock();
        try {
            if (!this.f31716) {
                return this.f31713.m29283(obj);
            }
            return -1;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        this.f31712.lock();
        try {
            if (!this.f31716) {
                return this.f31713.m29276(obj);
            }
            return -1;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        this.f31712.lock();
        try {
            if (!this.f31716) {
                return this.f31713.m29282(obj);
            }
            return 0;
        } finally {
            this.f31712.unlock();
        }
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        this.f31712.lock();
        try {
            return this.f31716 ? i2 : this.f31713.m29281(i, i2, cls);
        } finally {
            this.f31712.unlock();
        }
    }

    public final boolean equals(Object obj) {
        char cM48115;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C10567 c10567 = (C10567) obj;
                C12704 c12704M26547 = m26547();
                try {
                    C12704 c12704M26548 = c10567.m26547();
                    try {
                        int length = c12704M26547 == null ? this.f31717 : c12704M26547.length();
                        if (length != (c12704M26548 == null ? c10567.f31717 : c12704M26548.length())) {
                            if (c12704M26548 != null) {
                                c12704M26548.close();
                            }
                            if (c12704M26547 != null) {
                                c12704M26547.close();
                                return false;
                            }
                        } else {
                            C21172 c21172Mo27940 = null;
                            C21172 c21172Mo27941 = c12704M26547 == null ? null : c12704M26547.mo27940(0);
                            if (c12704M26548 != null) {
                                try {
                                    c21172Mo27940 = c12704M26548.mo27940(0);
                                } catch (Throwable th) {
                                    if (c21172Mo27941 != null) {
                                        try {
                                            c21172Mo27941.close();
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                    }
                                    throw th;
                                }
                            }
                            if (c21172Mo27941 == null && c21172Mo27940 == null) {
                                if (c21172Mo27940 != null) {
                                    c21172Mo27940.close();
                                }
                                if (c21172Mo27941 != null) {
                                    c21172Mo27941.close();
                                }
                                if (c12704M26548 != null) {
                                    c12704M26548.close();
                                }
                                if (c12704M26547 != null) {
                                    c12704M26547.close();
                                    return true;
                                }
                            } else {
                                for (int i = 0; i < length; i++) {
                                    char cM48116 = c21172Mo27941 == null ? (char) 0 : c21172Mo27941.m48115();
                                    if (c21172Mo27940 == null) {
                                        cM48115 = 0;
                                    } else {
                                        try {
                                            cM48115 = c21172Mo27940.m48115();
                                        } catch (Throwable th3) {
                                            if (c21172Mo27940 != null) {
                                                try {
                                                    c21172Mo27940.close();
                                                } catch (Throwable th4) {
                                                    th3.addSuppressed(th4);
                                                }
                                            }
                                            throw th3;
                                        }
                                    }
                                    if (cM48116 != cM48115) {
                                        if (c21172Mo27940 != null) {
                                            c21172Mo27940.close();
                                        }
                                        if (c21172Mo27941 != null) {
                                            c21172Mo27941.close();
                                        }
                                        if (c12704M26548 != null) {
                                            c12704M26548.close();
                                        }
                                        if (c12704M26547 != null) {
                                            c12704M26547.close();
                                            return false;
                                        }
                                    }
                                }
                                if (c21172Mo27940 != null) {
                                    c21172Mo27940.close();
                                }
                                if (c21172Mo27941 != null) {
                                    c21172Mo27941.close();
                                }
                                if (c12704M26548 != null) {
                                    c12704M26548.close();
                                }
                                if (c12704M26547 != null) {
                                    c12704M26547.close();
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        if (c12704M26548 != null) {
                            try {
                                c12704M26548.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                        }
                        throw th5;
                    }
                } catch (Throwable th7) {
                    if (c12704M26547 != null) {
                        try {
                            c12704M26547.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                    }
                    throw th7;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C12704 c12704M26547 = m26547();
        int iM48115 = 0;
        if (c12704M26547 == null) {
            if (c12704M26547 != null) {
                c12704M26547.close();
            }
            return 0;
        }
        try {
            C21172 c21172Mo27940 = c12704M26547.mo27940(0);
            while (c21172Mo27940.m48114()) {
                try {
                    iM48115 = (iM48115 * 31) + c21172Mo27940.m48115();
                } catch (Throwable th) {
                    try {
                        c21172Mo27940.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            c21172Mo27940.close();
            c12704M26547.close();
            return iM48115;
        } catch (Throwable th3) {
            try {
                c12704M26547.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public final C21856 m26563() {
        return new C21856(this, -1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m26555() {
        C23721 c23721 = this.f31708;
        if (c23721 == null || this.f31702) {
            return;
        }
        c23721.m52334(Selection.getSelectionStart(this), Selection.getSelectionEnd(this));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m26543() {
        if (this.f31716) {
            return false;
        }
        C23721 c23721 = this.f31708;
        if (c23721 == null || this.f31702) {
            return true;
        }
        c23721.m52347();
        return true;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private C12704 m26547() {
        if (this.f31716) {
            return null;
        }
        try {
            return m26565();
        } catch (C2121 e) {
            if (this.f31716) {
                return null;
            }
            throw e;
        }
    }

    @Override // android.text.Editable
    public final void insert(int i, CharSequence charSequence) {
        if (this.f31716) {
            return;
        }
        replace(i, i, charSequence, 0, charSequence.length());
    }

    @Override // android.text.Editable
    public final C10567 replace(int i, int i2, CharSequence charSequence) {
        return this.f31716 ? this : replace(i, i2, charSequence, 0, charSequence.length());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m26552() {
        return this.f31716;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m26546() {
        if (this.f31716) {
            throw new C2121("Editable is closed");
        }
    }

    public void close() {
        this.f31714.lock();
        try {
            if (!this.f31716) {
                if (this.f31706 != 0 || this.f31703 != 0) {
                    throw new IllegalStateException("Cannot close during editable replacement");
                }
                C23721 c23721 = this.f31708;
                this.f31717 = c23721 == null ? this.f31715.length() : c23721.length();
                this.f31716 = true;
                C2827 c2827 = this.f31715;
                if (c2827 != null) {
                    c2827.close();
                }
            }
            this.f31714.unlock();
        } catch (Throwable th) {
            this.f31714.unlock();
            throw th;
        }
    }
}
