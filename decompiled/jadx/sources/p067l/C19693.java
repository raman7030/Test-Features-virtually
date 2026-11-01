package p067l;

import java.io.IOException;
import java.io.StringWriter;
import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳᩴ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F2DJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C19693 extends AbstractC13246 {

    /* JADX INFO: renamed from: ۧ */
    public final int f59862;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f59863;

    /* JADX INFO: renamed from: ܿ */
    public final int f59864;

    /* JADX INFO: renamed from: ᩳ */
    public final HashSet f59865;

    public C19693(Map map) {
        if (map == null) {
            throw new InvalidParameterException("lookupMap cannot be null");
        }
        this.f59863 = new HashMap();
        this.f59865 = new HashSet();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        for (Map.Entry entry : map.entrySet()) {
            this.f59863.put(((CharSequence) entry.getKey()).toString(), ((CharSequence) entry.getValue()).toString());
            this.f59865.add(Character.valueOf(((CharSequence) entry.getKey()).charAt(0)));
            int length = ((CharSequence) entry.getKey()).length();
            i = length < i ? length : i;
            if (length > i2) {
                i2 = length;
            }
        }
        this.f59864 = i;
        this.f59862 = i2;
    }

    @Override // p067l.AbstractC13246
    /* JADX INFO: renamed from: ֫ */
    public final int mo18199(CharSequence charSequence, int i, StringWriter stringWriter) throws IOException {
        if (!this.f59865.contains(Character.valueOf(charSequence.charAt(i)))) {
            return 0;
        }
        int length = this.f59862;
        if (i + length > charSequence.length()) {
            length = charSequence.length() - i;
        }
        while (length >= this.f59864) {
            String str = (String) this.f59863.get(charSequence.subSequence(i, i + length).toString());
            if (str != null) {
                stringWriter.write(str);
                return length;
            }
            length--;
        }
        return 0;
    }
}
