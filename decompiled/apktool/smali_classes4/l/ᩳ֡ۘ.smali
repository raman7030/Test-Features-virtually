.class public Ll/ᩳ֡ۘ;
.super Ljava/lang/Object;
.source "A1X9"


# instance fields
.field public ֫:Ll/᩹֡ۘ;

.field public ۧ:Landroid/view/animation/Interpolator;

.field public ܽ:Ljava/util/ArrayList;

.field public ᩳ:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, " "

    const/4 v1, 0x0

    .line 222
    :goto_0
    iget v2, p0, Ll/ᩳ֡ۘ;->ᩳ:I

    if-ge v1, v2, :cond_0

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 223
    iget-object v2, p0, Ll/ᩳ֡ۘ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܽ֡ۘ;

    invoke-virtual {v2}, Ll/ܽ֡ۘ;->ܽ()Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "  "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
