.class public final Ll/۫ᩳۜ;
.super Ll/ۤܳܽ;
.source "S776"


# instance fields
.field public final ܳ:Ll/᩹ܽۜ;

.field public final ᩻:Ll/ܺᩳۜ;


# direct methods
.method public constructor <init>(Ll/᩹ܽۜ;Ll/ܺᩳۜ;)V
    .locals 1

    .line 1042
    invoke-virtual {p1}, Ll/᩹ܽۜ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ۤܳܽ;-><init>(Ll/ۢ᩻ܽ;)V

    .line 1043
    iput-object p1, p0, Ll/۫ᩳۜ;->ܳ:Ll/᩹ܽۜ;

    .line 1044
    iput-object p2, p0, Ll/۫ᩳۜ;->᩻:Ll/ܺᩳۜ;

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/String;)I
    .locals 1

    .line 1059
    invoke-static {p2}, Ll/ܰᩳۜ;->ۧ(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1061
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1

    .line 1063
    :cond_0
    iget-object v0, p0, Ll/۫ᩳۜ;->᩻:Ll/ܺᩳۜ;

    iget-boolean v0, v0, Ll/ܺᩳۜ;->֫:Z

    if-eqz v0, :cond_1

    const-string v0, "android:"

    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 1066
    :cond_1
    iget-object v0, p0, Ll/۫ᩳۜ;->ܳ:Ll/᩹ܽۜ;

    invoke-virtual {v0, p1, p2}, Ll/᩹ܽۜ;->֫(ILjava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ֫(Ljava/lang/String;)I
    .locals 1

    .line 1054
    iget-object v0, p0, Ll/۫ᩳۜ;->ܳ:Ll/᩹ܽۜ;

    invoke-virtual {v0, p1}, Ll/᩹ܽۜ;->֫(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public final ۧ()Ll/ܿᩳܽ;
    .locals 1

    .line 1049
    iget-object v0, p0, Ll/۫ᩳۜ;->ܳ:Ll/᩹ܽۜ;

    invoke-virtual {v0}, Ll/᩹ܽۜ;->ۧ()Ll/ܿᩳܽ;

    move-result-object v0

    return-object v0
.end method
