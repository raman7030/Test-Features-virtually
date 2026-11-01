package p067l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes.dex */
public class C25188 extends AbstractC22507 {

    /* JADX INFO: renamed from: ۧ */
    public static final C5523 f80563 = C5523.m12194();

    /* JADX INFO: renamed from: ֫ */
    public final CharSequence f80564;

    public C25188(CharSequence charSequence) {
        charSequence.getClass();
        this.f80564 = charSequence;
    }

    @Override // p067l.AbstractC22507
    /* JADX INFO: renamed from: ֫ */
    public final String mo50468() {
        return this.f80564.toString();
    }

    @Override // p067l.AbstractC22507
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC16192 mo50469() {
        return AbstractC16192.m36881(new C16470(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r1
      0x001f: PHI (r1v2 java.lang.CharSequence) = (r1v9 java.lang.CharSequence), (r1v10 java.lang.CharSequence) binds: [B:3:0x0012, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("CharSource.wrap(");
        CharSequence charSequence = this.f80564;
        charSequence.getClass();
        int length = charSequence.length();
        CharSequence charSequence2 = charSequence;
        if (length <= 30) {
            string2 = charSequence.toString();
            if (string2.length() > 30) {
                string = string2;
                charSequence2 = string2;
                StringBuilder sb2 = new StringBuilder(30);
                sb2.append(charSequence2, 0, 27);
                sb2.append("...");
                string = sb2.toString();
            }
        } else {
            string = string2;
            charSequence2 = string2;
            StringBuilder sb3 = new StringBuilder(30);
            sb3.append(charSequence2, 0, 27);
            sb3.append("...");
            string = sb3.toString();
        }
        string = string2;
        charSequence2 = string2;
        return C10965.m25286(sb, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
