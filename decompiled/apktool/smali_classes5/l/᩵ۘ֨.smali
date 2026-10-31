.class public final synthetic Ll/᩵ۘ֨;
.super Ljava/lang/Object;
.source "P7M1"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ۛ֡֨;

    .line 370
    move-object v0, p1

    check-cast v0, Ll/ܳ֡֨;

    .line 371
    invoke-virtual {p1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v1

    iput-object v1, v0, Ll/ۛ֡֨;->۫:Ll/ۛ֡֨;

    .line 1176
    invoke-virtual {v1}, Ll/ۛ֡֨;->᩶()V

    .line 1177
    iget-object v1, v1, Ll/۠֡֨;->ۨ:Ll/ܰ᩵֨;

    .line 372
    invoke-virtual {v1, p1}, Ll/ܰ᩵֨;->ܿ(Ll/ۛ֡֨;)V

    .line 373
    invoke-virtual {p1}, Ll/ۛ֡֨;->۫()Ll/ۤܶ۠;

    move-result-object v1

    iput-object v1, v0, Ll/ܳ֡֨;->ܰ:Ll/ۤܶ۠;

    .line 374
    invoke-virtual {p1}, Ll/ۛ֡֨;->۫()Ll/ۤܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object p1

    iput-object p1, v0, Ll/ۛ֡֨;->۬:Ll/ۤܶ۠;

    .line 375
    invoke-virtual {v0}, Ll/ܳ֡֨;->᩺֫()V

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
