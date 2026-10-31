.class public interface abstract Lbin/mt/plugin/api/editor/TextEditorBaseMenu;
.super Ljava/lang/Object;
.source "TextEditorBaseMenu.java"


# virtual methods
.method public abstract checkVisible(Lbin/mt/plugin/api/editor/TextEditor;)Z
.end method

.method public abstract getContext()Lbin/mt/plugin/api/PluginContext;
.end method

.method public abstract icon()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract init(Lbin/mt/plugin/api/PluginContext;)V
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract name()Ljava/lang/String;
.end method

.method public abstract onMenuClick(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/editor/TextEditor;)V
.end method

.method public abstract onPluginButtonClick(Lbin/mt/plugin/api/ui/PluginUI;)V
.end method
