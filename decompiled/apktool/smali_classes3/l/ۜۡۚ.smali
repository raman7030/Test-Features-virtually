.class public final Ll/ۜۡۚ;
.super Ljava/lang/Object;
.source "C5XG"

# interfaces
.implements Ll/ܽܶܺ;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۡۚ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 339
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜۡۚ;->᩸:Ll/᩵ۡۚ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 339
    check-cast p1, Ll/֡֫ۚ;

    .line 350
    new-instance v0, Ll/᩹ۢۚ;

    iget-object v1, p0, Ll/ۜۡۚ;->᩸:Ll/᩵ۡۚ;

    iget-object v2, v1, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    .line 351
    invoke-interface {p1}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v2

    .line 352
    iget-boolean v3, v1, Ll/᩵ۡۚ;->ۘ֫:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v3, v1, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v3, Ll/ܰۢۚ;

    invoke-interface {p1}, Ll/֡֫ۚ;->getName()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {v3, v5}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v4

    .line 352
    :goto_0
    iget-object v1, v1, Ll/᩸ۜۚ;->ܿ:Ll/ۜۜۚ;

    check-cast v1, Ll/ۡ᩷ۚ;

    .line 353
    invoke-interface {p1}, Ll/֡֫ۚ;->getAnnotations()Ljava/util/Set;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/ۡ᩷ۚ;->֫(Ljava/util/Set;)Ll/ۜ᩷ۚ;

    move-result-object p1

    invoke-direct {v0, v2, v4, p1}, Ll/᩹ۢۚ;-><init>(Ll/᩻ۡۚ;Ll/۟ۢۚ;Ll/ۜ᩷ۚ;)V

    return-object v0
.end method
