.class public interface abstract Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.super Ljava/lang/Object;
.source "PluginMenuItem.java"


# virtual methods
.method public abstract getGroupId()Ljava/lang/String;
.end method

.method public abstract getIcon()Landroid/graphics/drawable/Drawable;
.end method

.method public abstract getIconTintList()Landroid/content/res/ColorStateList;
.end method

.method public abstract getItemId()Ljava/lang/String;
.end method

.method public abstract getSubMenu()Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
.end method

.method public abstract getTitle()Ljava/lang/CharSequence;
.end method

.method public abstract hasSubMenu()Z
.end method

.method public abstract isCheckable()Z
.end method

.method public abstract isChecked()Z
.end method

.method public abstract isEnabled()Z
.end method

.method public abstract isVisible()Z
.end method

.method public abstract setCheckable(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setChecked(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setEnabled(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setIcon(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setIconTintList(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setVisible(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method
