.class public interface abstract Lbin/mt/plugin/api/preference/PluginPreference$Builder;
.super Ljava/lang/Object;
.source "PluginPreference.java"


# virtual methods
.method public abstract addHeader(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
.end method

.method public abstract addHeader(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Header;
.end method

.method public abstract addInput(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Input;
.end method

.method public abstract addList(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$List;
.end method

.method public abstract addSwitch(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Switch;
.end method

.method public abstract addText(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
.end method

.method public abstract addText(Ljava/lang/CharSequence;Ljava/lang/String;)Lbin/mt/plugin/api/preference/PluginPreference$Text;
.end method

.method public abstract onCreated(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceScreenCreatedListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
.end method

.method public abstract onPreferenceChange(Lbin/mt/plugin/api/preference/PluginPreference$OnPreferenceChangeListener;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
.end method

.method public abstract setLocalString(Lbin/mt/plugin/api/LocalString;)V
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end method

.method public abstract subtitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
.end method

.method public abstract title(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/preference/PluginPreference$Builder;
.end method
