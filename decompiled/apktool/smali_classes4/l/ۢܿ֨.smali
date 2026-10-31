.class public final Ll/ۢܿ֨;
.super Ll/ۢܽ֨;
.source "Q7CU"


# instance fields
.field public ۙ֫:Ljava/util/ArrayList;


# virtual methods
.method public final ۧ()V
    .locals 3

    .line 56
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v1, Ll/ܶۨۚ;->ۨܿ:Ll/ܶۨۚ;

    invoke-virtual {v1}, Ll/ܶۨۚ;->᩷()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " {"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 260
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(I)V

    .line 58
    iget-object v1, p0, Ll/ۢܿ֨;->ۙ֫:Ljava/util/ArrayList;

    new-instance v2, Ll/᩷ܿ֨;

    invoke-direct {v2, p0}, Ll/᩷ܿ֨;-><init>(Ll/ۢܿ֨;)V

    invoke-static {v1, v2}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    .line 264
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ۧ(I)V

    const-string v0, "}"

    .line 60
    invoke-virtual {p0, v0}, Ll/ۢܽ֨;->ᩳ(Ljava/lang/String;)V

    return-void
.end method
