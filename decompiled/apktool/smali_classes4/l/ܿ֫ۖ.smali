.class public final Ll/ܿ֫ۖ;
.super Ll/ۚ֫ۖ;
.source "M7NB"


# instance fields
.field public ֫:Ljava/lang/Boolean;

.field public ۧ:Ljava/lang/Boolean;

.field public ܽ:Ll/֨֫ۖ;


# virtual methods
.method public final ֫(Ll/֨֫ۖ;)Ll/ۚ֫ۖ;
    .locals 1

    if-eqz p1, :cond_0

    .line 98
    iput-object p1, p0, Ll/ܿ֫ۖ;->ܽ:Ll/֨֫ۖ;

    return-object p0

    .line 96
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null style"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ll/۠֫ۖ;
    .locals 4

    .line 104
    iget-object v0, p0, Ll/ܿ֫ۖ;->֫:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/ܿ֫ۖ;->ۧ:Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/ܿ֫ۖ;->ܽ:Ll/֨֫ۖ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 119
    :cond_0
    new-instance v1, Ll/ܳ֫ۖ;

    .line 120
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v2, p0, Ll/ܿ֫ۖ;->ۧ:Ljava/lang/Boolean;

    .line 121
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Ll/ܿ֫ۖ;->ܽ:Ll/֨֫ۖ;

    invoke-direct {v1, v0, v2, v3}, Ll/ܳ֫ۖ;-><init>(ZZLl/֨֫ۖ;)V

    return-object v1

    .line 107
    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 108
    iget-object v1, p0, Ll/ܿ֫ۖ;->֫:Ljava/lang/Boolean;

    if-nez v1, :cond_2

    const-string v1, " formatJavadoc"

    .line 109
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    :cond_2
    iget-object v1, p0, Ll/ܿ֫ۖ;->ۧ:Ljava/lang/Boolean;

    if-nez v1, :cond_3

    const-string v1, " reorderModifiers"

    .line 112
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    :cond_3
    iget-object v1, p0, Ll/ܿ֫ۖ;->ܽ:Ll/֨֫ۖ;

    if-nez v1, :cond_4

    const-string v1, " style"

    .line 115
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Missing required properties:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۧ()Ll/ۚ֫ۖ;
    .locals 1

    .line 83
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/ܿ֫ۖ;->֫:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final ܽ()Ll/ۚ֫ۖ;
    .locals 1

    .line 89
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/ܿ֫ۖ;->ۧ:Ljava/lang/Boolean;

    return-object p0
.end method
