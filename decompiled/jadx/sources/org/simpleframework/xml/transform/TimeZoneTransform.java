package org.simpleframework.xml.transform;

import java.util.TimeZone;
import p067l.C5468;

/* JADX INFO: loaded from: classes2.dex */
public class TimeZoneTransform implements Transform {
    @Override // org.simpleframework.xml.transform.Transform
    public TimeZone read(String str) {
        return C5468.getTimeZone(str);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public String write(TimeZone timeZone) {
        return timeZone.getID();
    }
}
