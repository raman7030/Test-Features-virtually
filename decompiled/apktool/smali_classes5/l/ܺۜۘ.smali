.class public final Ll/ܺۜۘ;
.super Ll/ۢ᩷ۘ;
.source "C7ZA"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 29
    invoke-direct {p0}, Ll/ܽۢۘ;-><init>()V

    const-string v0, "sntrup761"

    .line 31
    iput-object v0, p0, Ll/ۢ᩷ۘ;->֡:Ljava/lang/String;

    const-string v0, "sha-512"

    .line 32
    iput-object v0, p0, Ll/ۢ᩷ۘ;->۠:Ljava/lang/String;

    const-string v0, "X25519"

    .line 33
    iput-object v0, p0, Ll/ۢ᩷ۘ;->ۘ:Ljava/lang/String;

    const/16 v0, 0x486

    .line 34
    iput v0, p0, Ll/ۢ᩷ۘ;->ۚ:I

    const/16 v0, 0x40f

    .line 35
    iput v0, p0, Ll/ۢ᩷ۘ;->᩵:I

    const/16 v0, 0x20

    .line 36
    iput v0, p0, Ll/ۢ᩷ۘ;->᩹:I

    return-void
.end method
