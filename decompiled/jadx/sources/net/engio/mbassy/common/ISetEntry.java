package net.engio.mbassy.common;

/* JADX INFO: loaded from: classes.dex */
public interface ISetEntry {
    void clear();

    Object getValue();

    ISetEntry next();

    void remove();
}
