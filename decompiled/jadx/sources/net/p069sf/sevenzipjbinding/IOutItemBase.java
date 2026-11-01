package net.p069sf.sevenzipjbinding;

/* JADX INFO: loaded from: classes.dex */
public interface IOutItemBase {
    ArchiveFormat getArchiveFormat();

    Long getDataSize();

    int getIndex();

    IOutArchive getOutArchive();

    Boolean getUpdateIsNewData();

    Boolean getUpdateIsNewProperties();

    Integer getUpdateOldArchiveItemIndex();

    void setDataSize(Long l2);

    void setUpdateIsNewData(Boolean bool);

    void setUpdateIsNewProperties(Boolean bool);

    void setUpdateOldArchiveItemIndex(Integer num);
}
