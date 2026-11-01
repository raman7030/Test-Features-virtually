package net.p069sf.sevenzipjbinding;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public interface IOutItemGZip extends IOutItemBase {
    Date getPropertyLastModificationTime();

    String getPropertyPath();

    void setPropertyLastModificationTime(Date date);

    void setPropertyPath(String str);
}
