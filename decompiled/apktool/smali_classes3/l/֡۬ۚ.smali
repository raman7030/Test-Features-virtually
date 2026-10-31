.class public final Ll/֡۬ۚ;
.super Ll/ۘ۬ۚ;
.source "C8OA"


# instance fields
.field public ܽ:Ljava/lang/StringBuilder;

.field public final ᩳ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Ll/ۘ۬ۚ;-><init>()V

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֡۬ۚ;->ᩳ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 51
    iget-object v0, p0, Ll/֡۬ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ᩴۚܳ;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Ll/ᩴۚܳ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 52
    invoke-static {}, Ljava/lang/System;->lineSeparator()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ll/᩺ۨᩴ;->joining(Ljava/lang/CharSequence;)Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()Ljava/io/DataOutputStream;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 93
    iget-object v0, p0, Ll/֡۬ۚ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ll/ܽ۫ᩴ;Ll/᩶ۗۚ;)V
    .locals 0

    .line 59
    iput-object p1, p0, Ll/ۘ۬ۚ;->ۧ:Ljava/lang/String;

    .line 63
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Ll/֡۬ۚ;->ܽ:Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "string"

    return-object v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 5

    .line 54
    iget-object v0, p0, Ll/ۘ۬ۚ;->ۧ:Ljava/lang/String;

    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "; then "

    const-string v3, " was started."

    const-string v4, "Ended with a different class: "

    .line 0
    invoke-static {v4, p1, v2, v0, v3}, Ll/᩶ۢۢ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 70
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 74
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/֡۬ۚ;->ܽ:Ljava/lang/StringBuilder;

    if-eqz v0, :cond_2

    .line 75
    new-instance v1, Ll/᩵۬ۚ;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, p1, v0}, Ll/᩵۬ۚ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ll/֡۬ۚ;->ᩳ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    :cond_2
    invoke-super {p0, p1}, Ll/ۘ۬ۚ;->ۧ(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 78
    iput-object p1, p0, Ll/֡۬ۚ;->ܽ:Ljava/lang/StringBuilder;

    return-void
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/֡۬ۚ;->ᩳ:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 88
    iget-object v0, p0, Ll/֡۬ۚ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\n"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
