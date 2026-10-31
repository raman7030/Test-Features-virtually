package org.simpleframework.xml.transform;

import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class DateTransform implements Transform {
    public final DateFactory factory;

    public DateTransform(Class cls) {
        this.factory = new DateFactory(cls);
    }

    @Override // org.simpleframework.xml.transform.Transform
    public synchronized Date read(String str) {
        return this.factory.getInstance(Long.valueOf(DateType.getDate(str).getTime()));
    }

    @Override // org.simpleframework.xml.transform.Transform
    public synchronized String write(Date date) {
        return DateType.getText(date);
    }
}
