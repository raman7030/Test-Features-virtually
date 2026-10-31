.class public interface abstract Lbin/mt/plugin/api/preference/PluginPreference$PreferenceScreen;
.super Ljava/lang/Object;
.source "PluginPreference.java"


# virtual methods
.method public abstract findHeader(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceHeader;
.end method

.method public abstract findPreference(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;
.end method

.method public abstract getSubtitle()Ljava/lang/CharSequence;
.end method

.method public abstract getTitle()Ljava/lang/CharSequence;
.end method

.method public abstract recreate()V
.end method

.method public abstract requireHeader(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceHeader;
.end method

.method public abstract requirePreference(Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$PreferenceItem;
.end method

.method public abstract setSubtitle(Ljava/lang/CharSequence;)V
.end method

.method public abstract setTitle(Ljava/lang/CharSequence;)V
.end method
