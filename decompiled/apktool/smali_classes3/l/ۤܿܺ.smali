.class public abstract Ll/ۤܿܺ;
.super Ll/ۙܿܺ;
.source "CBJ0"


# virtual methods
.method public final ֫(Ll/ᩳᩴܺ;)V
    .locals 1

    .line 63
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v0

    invoke-virtual {v0, p1, p0}, Ll/ۨܿܺ;->֫(Ll/ᩳᩴܺ;Ll/ۤܿܺ;)V

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 55
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܿܺ;->֫()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)Ll/ۙܿܺ;
    .locals 1

    .line 71
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩷()Ll/᩶ۡܺ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩶ۡܺ;->ܿ(I)Ll/᩶ۡܺ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ۙܿܺ;->֫(Ll/᩶ۡܺ;)Ll/ۙܿܺ;

    move-result-object p1

    return-object p1
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 4

    .line 79
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬ܿܺ;->ۧ()Ll/ۨܿܺ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    invoke-virtual {p0}, Ll/ۙܿܺ;->᩻()Ll/۬ܿܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/۬ܿܺ;->ܽ()Ljava/lang/String;

    move-result-object v1

    .line 56
    invoke-virtual {v0, p0}, Ll/ۨܿܺ;->֫(Ll/ۤܿܺ;)Ljava/lang/String;

    move-result-object v2

    .line 57
    invoke-virtual {v0, p0}, Ll/ۨܿܺ;->ۧ(Ll/ۤܿܺ;)Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x64

    .line 0
    invoke-static {v3, v1}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 62
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-eqz v3, :cond_0

    const/16 v3, 0x20

    .line 63
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, " // "

    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
