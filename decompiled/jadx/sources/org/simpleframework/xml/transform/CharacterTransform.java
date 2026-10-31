package org.simpleframework.xml.transform;

/* JADX INFO: loaded from: classes2.dex */
public class CharacterTransform implements Transform {
    @Override // org.simpleframework.xml.transform.Transform
    public Character read(String str) throws InvalidFormatException {
        if (str.length() != 1) {
            throw new InvalidFormatException("Cannot convert '%s' to a character", str);
        }
        return Character.valueOf(str.charAt(0));
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(Character ch) {
        return ch.toString();
    }
}
