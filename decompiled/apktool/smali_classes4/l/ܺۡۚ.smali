.class public final Ll/ܺۡۚ;
.super Ljava/lang/Object;
.source "C5XG"

# interfaces
.implements Ll/ܽܶܺ;


# instance fields
.field public final synthetic ᩸:Ll/᩵ۡۚ;


# direct methods
.method public constructor <init>(Ll/᩵ۡۚ;)V
    .locals 0

    .line 702
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۡۚ;->᩸:Ll/᩵ۡۚ;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 702
    check-cast p1, Ll/ۢ֫ۚ;

    .line 713
    new-instance v0, Ll/ܿ᩷ۚ;

    iget-object v1, p0, Ll/ܺۡۚ;->᩸:Ll/᩵ۡۚ;

    iget-object v2, v1, Ll/᩸ۜۚ;->ᩳ֫:Ll/۟ۜۚ;

    check-cast v2, Ll/ܰۢۚ;

    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ܰۢۚ;->֫(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v2

    .line 714
    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object p1

    invoke-virtual {v1, p1}, Ll/᩵ۡۚ;->֫(Ll/ۤܽۚ;)Ll/ܰ᩷ۚ;

    move-result-object p1

    invoke-direct {v0, v2, p1}, Ll/ܿ᩷ۚ;-><init>(Ll/۟ۢۚ;Ll/ܰ᩷ۚ;)V

    return-object v0
.end method
