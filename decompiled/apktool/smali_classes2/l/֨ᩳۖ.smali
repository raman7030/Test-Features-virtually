.class public final Ll/֨ᩳۖ;
.super Ll/۠ᩳۖ;
.source "GAZW"


# instance fields
.field public final synthetic ֫:Ll/۠ᩳۖ;


# direct methods
.method public constructor <init>(Ll/۠ᩳۖ;)V
    .locals 0

    .line 298
    iput-object p1, p0, Ll/֨ᩳۖ;->֫:Ll/۠ᩳۖ;

    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NullSafeTypeAdapter["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/֨ᩳۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 2

    .line 310
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 311
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 314
    :cond_0
    iget-object v0, p0, Ll/֨ᩳۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    .line 302
    invoke-virtual {p1}, Ll/᩻ۜۖ;->ۘ()Ll/᩻ۜۖ;

    return-void

    .line 304
    :cond_0
    iget-object v0, p0, Ll/֨ᩳۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
