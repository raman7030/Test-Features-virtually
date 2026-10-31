.class public final Ll/۟ۘܿ;
.super Ljava/lang/Object;
.source "DAPN"

# interfaces
.implements Ll/۬ᩴܿ;


# instance fields
.field public final synthetic ֫:Ll/֫ᩴܿ;

.field public final synthetic ۧ:Ll/֨ᩴܿ;

.field public final synthetic ܽ:Ll/֨ᩴܿ;


# direct methods
.method public constructor <init>(Ll/֫ᩴܿ;Ll/֨ᩴܿ;Ll/֨ᩴܿ;)V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iput-object p2, p0, Ll/۟ۘܿ;->ۧ:Ll/֨ᩴܿ;

    iput-object p3, p0, Ll/۟ۘܿ;->ܽ:Ll/֨ᩴܿ;

    return-void
.end method


# virtual methods
.method public final afterFinish()V
    .locals 1

    .line 125
    iget-object v0, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v0, v0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->afterFinish()V

    return-void
.end method

.method public final beforeStart()V
    .locals 1

    .line 105
    iget-object v0, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v0, v0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->beforeStart()V

    return-void
.end method

.method public final getId()Ljava/lang/String;
    .locals 3

    .line 135
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v2, v1, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ۘܿ;->ۧ:Ll/֨ᩴܿ;

    iget-object v1, v1, Ll/֨ᩴܿ;->ۧ:Ll/ۚᩴܿ;

    iget-object v1, v1, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll/۟ۘܿ;->ܽ:Ll/֨ᩴܿ;

    iget-object v1, v1, Ll/֨ᩴܿ;->ۧ:Ll/ۚᩴܿ;

    iget-object v1, v1, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final onError(Ljava/lang/Exception;)Z
    .locals 1

    .line 130
    iget-object v0, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v0, v0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->onError(Ljava/lang/Exception;)Z

    move-result p1

    return p1
.end method

.method public final onFinish()V
    .locals 1

    .line 120
    iget-object v0, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v0, v0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->onFinish()V

    return-void
.end method

.method public final onStart()V
    .locals 1

    .line 110
    iget-object v0, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v0, v0, Ll/֫ᩴܿ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->onStart()V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 115
    iget-object v0, p0, Ll/۟ۘܿ;->֫:Ll/֫ᩴܿ;

    iget-object v0, v0, Ll/֫ᩴܿ;->ܽ:Ll/ᩳ۟ܽ;

    iget-object v1, p0, Ll/۟ۘܿ;->ۧ:Ll/֨ᩴܿ;

    iget-object v1, v1, Ll/֨ᩴܿ;->ۧ:Ll/ۚᩴܿ;

    iget-object v1, v1, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    iget-object v2, p0, Ll/۟ۘܿ;->ܽ:Ll/֨ᩴܿ;

    iget-object v2, v2, Ll/֨ᩴܿ;->ۧ:Ll/ۚᩴܿ;

    iget-object v2, v2, Ll/ۚᩴܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0, p1, v1, v2}, Ll/ᩳ۟ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
