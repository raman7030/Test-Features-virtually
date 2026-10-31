.class public final synthetic Ll/ۗ᩶֨;
.super Ljava/lang/Object;
.source "F416"

# interfaces
.implements Ljava/util/function/Consumer;


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 2
    check-cast p1, Ll/᩷᩶֨;

    .line 186
    iget-object v0, p1, Ll/᩷᩶֨;->ۧ:Ll/ۚ᩶֨;

    iget-object p1, p1, Ll/᩷᩶֨;->֫:Ljava/util/HashMap;

    iput-object p1, v0, Ll/ۚ᩶֨;->֫:Ljava/util/HashMap;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
