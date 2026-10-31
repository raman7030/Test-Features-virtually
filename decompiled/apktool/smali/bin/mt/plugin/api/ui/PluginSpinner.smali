.class public interface abstract Lbin/mt/plugin/api/ui/PluginSpinner;
.super Ljava/lang/Object;
.source "PluginSpinner.java"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginView;


# virtual methods
.method public abstract getCount()I
.end method

.method public abstract getItem(I)Ljava/lang/Object;
.end method

.method public abstract getSelectedItem()Ljava/lang/Object;
.end method

.method public abstract getSelection()I
.end method

.method public abstract setItems(Ljava/util/List;)V
.end method

.method public abstract setOnItemSelectedListener(Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)V
.end method

.method public abstract setSelection(I)V
.end method
