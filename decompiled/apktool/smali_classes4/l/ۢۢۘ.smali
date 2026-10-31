.class public final Ll/ۢۢۘ;
.super Ll/ۡۢۘ;
.source "X7XP"


# direct methods
.method public constructor <init>(Ll/᩹᩷ۘ;)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, v0, v0}, Ll/ۡۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B)V

    return-void
.end method

.method public constructor <init>(Ll/᩹᩷ۘ;[B)V
    .locals 1

    const/4 v0, 0x0

    .line 40
    invoke-direct {p0, p1, p2, v0}, Ll/ۡۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B)V

    return-void
.end method

.method public static ֫(Ll/᩹᩷ۘ;Ll/ܺ᩻ۘ;)Ll/ᩳۢۘ;
    .locals 3

    const/4 v0, 0x4

    const-string v1, "invalid key format"

    .line 65
    invoke-virtual {p1, v0, v1}, Ll/ܺ᩻ۘ;->֫(ILjava/lang/String;)[[B

    move-result-object p1

    const/4 v0, 0x1

    .line 67
    aget-object v0, p1, v0

    const/4 v1, 0x2

    .line 68
    aget-object v1, p1, v1

    const/16 v2, 0x39

    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    .line 69
    new-instance v2, Ll/ۢۢۘ;

    .line 40
    invoke-direct {v2, p0, v0, v1}, Ll/ۡۢۘ;-><init>(Ll/᩹᩷ۘ;[B[B)V

    const/4 p0, 0x3

    .line 70
    aget-object p0, p1, p0

    invoke-static {p0}, Ll/᩵ۡۘ;->֫([B)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v2, Ll/ᩳۢۘ;->ۜ:Ljava/lang/String;

    const/4 p0, 0x0

    .line 71
    iput p0, v2, Ll/ᩳۢۘ;->ۡ:I

    return-object v2
.end method


# virtual methods
.method public final ܳ()Ljava/lang/String;
    .locals 1

    const-string v0, "Ed448"

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    const/16 v0, 0x39

    return v0
.end method

.method public final ᩻()Ljava/lang/String;
    .locals 1

    const-string v0, "ssh-ed448"

    return-object v0
.end method
