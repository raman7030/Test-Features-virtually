package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩻᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D3VQ */
/* JADX INFO: loaded from: classes.dex */
public class C24010 extends AbstractC21189 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3319 f77811 = C3319.m10158();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final CharSequence f77812;

    public C24010(CharSequence charSequence) {
        charSequence.getClass();
        this.f77812 = charSequence;
    }

    @Override // l.AbstractC21189
    /* JADX INFO: renamed from: ֫ */
    public final String mo48138() {
        return this.f77812.toString();
    }

    @Override // l.AbstractC21189
    /* JADX INFO: renamed from: ۧ */
    public final AbstractC14545 mo48139() {
        return AbstractC14545.m34732(new C14837(this));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f A[PHI: r1
      0x001f: PHI (r1v2 java.lang.CharSequence) = (r1v9 java.lang.CharSequence), (r1v10 java.lang.CharSequence) binds: [B:3:0x0012, B:5:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    public final String toString() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder("CharSource.wrap(");
        CharSequence charSequence = this.f77812;
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
        return C9045.m23341(sb, string, MotionUtils.EASING_TYPE_FORMAT_END);
    }
}
