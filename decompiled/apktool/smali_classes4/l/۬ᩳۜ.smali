.class public final Ll/۬ᩳۜ;
.super Ll/ܳܳܽ;
.source "S776"


# instance fields
.field public final ᩳ:Ll/ܺᩳۜ;


# direct methods
.method public constructor <init>(Ll/ۢ᩻ܽ;Ll/ܺᩳۜ;)V
    .locals 0

    .line 1018
    invoke-direct {p0, p1}, Ll/ܳܳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    .line 1019
    iput-object p2, p0, Ll/۬ᩳۜ;->ᩳ:Ll/ܺᩳۜ;

    return-void
.end method


# virtual methods
.method public final ۧ(II)Ljava/lang/String;
    .locals 2

    ushr-int/lit8 v0, p2, 0x18

    and-int/lit16 v0, v0, 0xff

    .line 1025
    iget-object v1, p0, Ll/۬ᩳۜ;->ᩳ:Ll/ܺᩳۜ;

    iget-boolean v1, v1, Ll/ܺᩳۜ;->֫:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 1026
    invoke-static {p2}, Ll/ܰᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 1028
    :cond_0
    invoke-super {p0, p1, p2}, Ll/ܳܳܽ;->ۧ(II)Ljava/lang/String;

    move-result-object p1

    .line 1029
    invoke-static {p1}, Ll/ܰᩳۜ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p2}, Ll/ܰᩳۜ;->֫(I)Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1
.end method
