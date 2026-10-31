.class public interface abstract Lbin/mt/plugin/api/ui/PluginCompoundButton;
.super Ljava/lang/Object;
.source "PluginCompoundButton.java"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginButton;


# virtual methods
.method public abstract getStyle()Lbin/mt/plugin/api/ui/PluginButton$Style;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract isChecked()Z
.end method

.method public abstract setChecked(Z)V
.end method

.method public abstract setOnCheckedChangeListener(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V
.end method
