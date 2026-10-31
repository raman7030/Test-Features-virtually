.class public final Ll/֫ᩴܿ;
.super Ljava/lang/Object;
.source "DAPN"

# interfaces
.implements Ll/۠ᩴܿ;


# instance fields
.field public final ֫:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

.field public ۜ:Ljava/util/List;

.field public final ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

.field public ܳ:Ljava/lang/String;

.field public final ܽ:Ll/ᩳ۟ܽ;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/util/Set;

.field public ᩷:Ljava/util/List;

.field public final ᩻:Ll/ܽܳ᩷;


# direct methods
.method public constructor <init>(Ll/ܽܳ᩷;Lbin/mt/plugin/api/translation/TranslationEngine;)V
    .locals 3

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v0, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    .line 28
    iput-object v0, p0, Ll/֫ᩴܿ;->᩷:Ljava/util/List;

    .line 33
    iput-object p1, p0, Ll/֫ᩴܿ;->᩻:Ll/ܽܳ᩷;

    .line 34
    iput-object p2, p0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 35
    new-instance v0, Ll/ᩳ۟ܽ;

    invoke-direct {v0, p2}, Ll/ᩳ۟ܽ;-><init>(Lbin/mt/plugin/api/translation/TranslationEngine;)V

    iput-object v0, p0, Ll/֫ᩴܿ;->ܽ:Ll/ᩳ۟ܽ;

    .line 36
    invoke-virtual {p1}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object p1

    invoke-interface {p2}, Lbin/mt/plugin/api/translation/TranslationEngine;->name()Ljava/lang/String;

    move-result-object v0

    .line 182
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x7b

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x7d

    if-ne v1, v2, :cond_0

    .line 183
    check-cast p1, Ll/ۤ᩻᩷;

    invoke-virtual {p1, v0}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    move-object v0, p1

    .line 36
    :cond_0
    iput-object v0, p0, Ll/֫ᩴܿ;->ܳ:Ljava/lang/String;

    .line 37
    invoke-interface {p2}, Lbin/mt/plugin/api/translation/TranslationEngine;->getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object p1

    iput-object p1, p0, Ll/֫ᩴܿ;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    .line 39
    iget-boolean p1, p1, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->disableAutoHideLanguage:Z

    if-eqz p1, :cond_1

    .line 40
    sget-object p1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_1
    invoke-static {}, Ll/֫۟ܽ;->ۧ()Ljava/util/Set;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/֫ᩴܿ;->ᩳ:Ljava/util/Set;

    .line 41
    invoke-virtual {p0}, Ll/֫ᩴܿ;->ܿ()V

    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 2

    .line 190
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/֫ᩴܿ;->᩻:Ll/ܽܳ᩷;

    invoke-virtual {v1}, Ll/ܽܳ᩷;->ۖ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 196
    iget-object v0, p0, Ll/֫ᩴܿ;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(ILjava/lang/String;)I
    .locals 4

    .line 82
    iget-object v0, p0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    :try_start_0
    iget-object v1, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚᩴܿ;

    iget-object p1, p1, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    .line 84
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->loadTargetLanguages(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 85
    invoke-interface {v0, v2}, Lbin/mt/plugin/api/translation/TranslationEngine;->getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 86
    iget-object v3, p0, Ll/֫ᩴܿ;->ᩳ:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 87
    invoke-virtual {v2, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_1

    return v1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 94
    iget-object p2, p0, Ll/֫ᩴܿ;->᩻:Ll/ܽܳ᩷;

    invoke-virtual {p2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object p2

    check-cast p2, Ll/ۤ᩻᩷;

    invoke-virtual {p2, p1}, Ll/ۤ᩻᩷;->log(Ljava/lang/Throwable;)V

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final ֫(Ll/֨ᩴܿ;Ll/֨ᩴܿ;)Ll/۬ᩴܿ;
    .locals 1

    .line 101
    new-instance v0, Ll/۟ۘܿ;

    invoke-direct {v0, p0, p1, p2}, Ll/۟ۘܿ;-><init>(Ll/֫ᩴܿ;Ll/֨ᩴܿ;Ll/֨ᩴܿ;)V

    return-object v0
.end method

.method public final ֫()V
    .locals 7

    .line 143
    iget-object v0, p0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    iget-object v1, p0, Ll/֫ᩴܿ;->᩻:Ll/ܽܳ᩷;

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {v1}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v3

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->name()Ljava/lang/String;

    move-result-object v4

    .line 182
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    const/4 v6, 0x3

    if-lt v5, v6, :cond_0

    invoke-virtual {v4, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7d

    if-ne v5, v6, :cond_0

    .line 183
    check-cast v3, Ll/ۤ᩻᩷;

    invoke-virtual {v3, v4}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    move-object v4, v3

    .line 143
    :cond_0
    iput-object v4, p0, Ll/֫ᩴܿ;->ܳ:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    .line 145
    invoke-virtual {v1}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    check-cast v1, Ll/ۤ᩻᩷;

    invoke-virtual {v1, v3}, Ll/ۤ᩻᩷;->log(Ljava/lang/Throwable;)V

    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫ᩴܿ;->ܳ:Ljava/lang/String;

    .line 148
    :goto_0
    iget-object v0, p0, Ll/֫ᩴܿ;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v0, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->disableAutoHideLanguage:Z

    if-eqz v0, :cond_1

    .line 149
    sget-object v0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_1

    :cond_1
    invoke-static {}, Ll/֫۟ܽ;->ۧ()Ljava/util/Set;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Ll/֫ᩴܿ;->ᩳ:Ljava/util/Set;

    .line 150
    invoke-virtual {p0}, Ll/֫ᩴܿ;->ܿ()V

    .line 151
    iget-object v0, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 153
    iget-object v0, p0, Ll/֫ᩴܿ;->ܿ:Ljava/lang/String;

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 154
    :goto_2
    iget-object v1, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    .line 155
    iget-object v1, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۚᩴܿ;

    iget-object v1, v1, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    iget-object v3, p0, Ll/֫ᩴܿ;->ܿ:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v2, v0

    goto :goto_3

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 161
    :cond_3
    :goto_3
    invoke-virtual {p0, v2}, Ll/֫ᩴܿ;->֫(I)V

    :cond_4
    return-void
.end method

.method public final ֫(I)V
    .locals 5

    .line 62
    iget-object v0, p0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    iget-object v1, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۚᩴܿ;

    iget-object p1, p1, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    .line 63
    iput-object p1, p0, Ll/֫ᩴܿ;->ܿ:Ljava/lang/String;

    .line 64
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/֫ᩴܿ;->᩷:Ljava/util/List;

    .line 66
    :try_start_0
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->loadTargetLanguages(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 67
    invoke-interface {v0, v1}, Lbin/mt/plugin/api/translation/TranslationEngine;->getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 68
    iget-object v3, p0, Ll/֫ᩴܿ;->ᩳ:Ljava/util/Set;

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 69
    iget-object v3, p0, Ll/֫ᩴܿ;->᩷:Ljava/util/List;

    new-instance v4, Ll/ۚᩴܿ;

    invoke-direct {v4, v1, v2}, Ll/ۚᩴܿ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    .line 73
    iget-object v0, p0, Ll/֫ᩴܿ;->᩻:Ll/ܽܳ᩷;

    invoke-virtual {v0}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    check-cast v0, Ll/ۤ᩻᩷;

    invoke-virtual {v0, p1}, Ll/ۤ᩻᩷;->log(Ljava/lang/Throwable;)V

    .line 74
    iget-object p1, p0, Ll/֫ᩴܿ;->᩷:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ۧ()Z
    .locals 1

    .line 177
    iget-object v0, p0, Ll/֫ᩴܿ;->֫:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v0, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->targetLanguageMutable:Z

    return v0
.end method

.method public final ܽ()Ljava/util/List;
    .locals 1

    .line 172
    iget-object v0, p0, Ll/֫ᩴܿ;->᩷:Ljava/util/List;

    return-object v0
.end method

.method public final ܿ()V
    .locals 6

    .line 45
    iget-object v0, p0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    .line 47
    :try_start_0
    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->loadSourceLanguages()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 48
    invoke-interface {v0, v2}, Lbin/mt/plugin/api/translation/TranslationEngine;->getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 49
    iget-object v4, p0, Ll/֫ᩴܿ;->ᩳ:Ljava/util/Set;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 50
    iget-object v4, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    new-instance v5, Ll/ۚᩴܿ;

    invoke-direct {v5, v2, v3}, Ll/ۚᩴܿ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 54
    iget-object v1, p0, Ll/֫ᩴܿ;->᩻:Ll/ܽܳ᩷;

    invoke-virtual {v1}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object v1

    check-cast v1, Ll/ۤ᩻᩷;

    invoke-virtual {v1, v0}, Ll/ۤ᩻᩷;->log(Ljava/lang/Throwable;)V

    .line 55
    iget-object v0, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void
.end method

.method public final ᩳ()Ljava/util/List;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/֫ᩴܿ;->ۜ:Ljava/util/List;

    return-object v0
.end method
