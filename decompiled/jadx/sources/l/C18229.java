package l;

import java.io.IOException;
import java.io.StringWriter;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F2DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18229 extends AbstractC11446 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f56643;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f56644;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f56645;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashSet f56646;

    public C18229(Map map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.f56644 = new HashMap();
        this.f56646 = new HashSet();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            this.f56644.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
            this.f56646.add(Character.valueOf(((CharSequence) entry.getKey()).charAt(0)));
            int length = ((CharSequence) entry.getKey()).length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f56645 = i;
        this.f56643 = i2;
    }

    @Override // l.AbstractC11446
    /* JADX INFO: renamed from: ֫ */
    public final int mo16274(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (!this.f56646.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f56643;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f56645) {
            String str = (String) this.f56644.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                stringWriter.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
