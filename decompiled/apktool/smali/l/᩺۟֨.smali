.class public final synthetic Ll/᩺۟֨;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ll/᩷ܽ۠;


# instance fields
.field public final synthetic ֫:Ll/᩹ܽ۠;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܽ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺۟֨;->֫:Ll/᩹ܽ۠;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֫ۤ֨;Ll/ۤܶ۠;)Ll/ۛ֡֨;
    .locals 5

    .line 2
    iget-object v0, p0, Ll/᩺۟֨;->֫:Ll/᩹ܽ۠;

    .line 2105
    iget-object v1, p1, Ll/֫ۤ֨;->۫:Ll/֨᩵۠;

    iget-object v1, v1, Ll/֨᩵۠;->۟:Ll/᩺᩵֨;

    .line 2106
    invoke-static {p2}, Ll/۬֨۠;->ܽ(Ll/ۤܶ۠;)Ll/ۤܶ۠;

    move-result-object v2

    new-instance v3, Ll/۟ۛ᩷;

    const/4 v4, 0x1

    invoke-direct {v3, v4, p2}, Ll/۟ۛ᩷;-><init>(ILjava/lang/CharSequence;)V

    invoke-virtual {v1, v2, v3}, Ll/۟᩵֨;->֫(Ll/ۤܶ۠;Ljava/util/function/Predicate;)Ll/ۛ֡֨;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 2111
    :try_start_0
    iget-object v2, v0, Ll/᩹ܽ۠;->֨:Ll/᩶ۘ֨;

    invoke-virtual {v1}, Ll/ۛ֡֨;->ܶ֫()Ll/۠֡֨;

    move-result-object v1

    iget-object v1, v1, Ll/۠֡֨;->᩺:Ll/֡֡֨;

    invoke-virtual {v2, v1, p2}, Ll/᩶ۘ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object p2

    .line 2113
    new-instance v1, Ll/᩵ۧ۠;

    const/4 v2, 0x1

    invoke-direct {v1, v0, p1, v2, p2}, Ll/᩵ۧ۠;-><init>(Ll/᩹ܽ۠;Ll/֫ۤ֨;ZLl/ۛ֡֨;)V
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
