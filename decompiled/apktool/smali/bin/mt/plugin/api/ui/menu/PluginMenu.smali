.class public interface abstract Lbin/mt/plugin/api/ui/menu/PluginMenu;
.super Ljava/lang/Object;
.source "PluginMenu.java"


# virtual methods
.method public abstract add(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract add(Ljava/lang/String;Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract add(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract addSubMenu(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
.end method

.method public abstract addSubMenu(Ljava/lang/String;Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
.end method

.method public abstract addSubMenu(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
.end method

.method public abstract clear()V
.end method

.method public abstract findItem(Ljava/lang/String;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract getItem(I)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
.end method

.method public abstract setGroupCheckable(Ljava/lang/String;ZZ)V
.end method

.method public abstract setGroupDividerEnabled(Z)V
.end method

.method public abstract setGroupEnabled(Ljava/lang/String;Z)V
.end method

.method public abstract setGroupVisible(Ljava/lang/String;Z)V
.end method

.method public abstract size()I
.end method
