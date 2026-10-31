.class public final Ll/᩷֨ۚ;
.super Ll/ۡ֨ۚ;
.source "U4HR"


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 323
    invoke-direct {p0}, Ll/ۡ֨ۚ;-><init>()V

    .line 324
    sget-object v0, Ll/ܺ֨ۚ;->۬:Ll/ܺ֨ۚ;

    iput-object v0, p0, Ll/ۖ֨ۚ;->ܽ:Ll/ܺ֨ۚ;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 198
    iget-object v0, p0, Ll/ۡ֨ۚ;->ۘ:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "[unset]"

    :goto_0
    const-string v1, "</"

    const-string v2, ">"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
