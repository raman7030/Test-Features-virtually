.class public Ll/ۨܳۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 517
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 2

    .line 523
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 524
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 527
    :cond_0
    new-instance v0, Ll/ܰᩳۖ;

    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ll/ܰᩳۖ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 517
    check-cast p2, Ll/ܰᩳۖ;

    .line 532
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->֫(Ljava/lang/Number;)V

    return-void
.end method
