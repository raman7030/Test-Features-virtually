.class public final synthetic Ll/᩸ܰۚ;
.super Ljava/lang/Object;
.source "64JA"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic ᩸:Ll/ۨܰۚ;


# direct methods
.method public synthetic constructor <init>(Ll/ۨܰۚ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܰۚ;->᩸:Ll/ۨܰۚ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 2
    check-cast p1, Ll/ܺۤۚ;

    .line 2433
    iget-object v0, p0, Ll/᩸ܰۚ;->᩸:Ll/ۨܰۚ;

    iget-object v0, v0, Ll/ۨܰۚ;->᩻:Ll/ܰ۫ۚ;

    iget-object v0, v0, Ll/ܰ۫ۚ;->ᩴ:Ll/᩺۫ۚ;

    sget-object v1, Ll/ۨ۫ۚ;->᩶:Ll/ۨ۫ۚ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    iget-object v0, v0, Ll/᩺۫ۚ;->֫:Ll/ۜۗۚ;

    iput-object p1, v0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    return-void
.end method

.method public synthetic andThen(Ljava/util/function/Consumer;)Ljava/util/function/Consumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩻ۛᩴ;->$default$andThen(Ljava/util/function/Consumer;Ljava/util/function/Consumer;)Ljava/util/function/Consumer;

    move-result-object p1

    return-object p1
.end method
