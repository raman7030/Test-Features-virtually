.class public final Ll/᩵֨ܳ;
.super Ll/۬ۗܿ;
.source "Z1XC"


# instance fields
.field public final synthetic ۟:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Ll/ܽۢܳ;)V
    .locals 0

    .line 19
    iput-object p2, p0, Ll/᩵֨ܳ;->۟:Ll/ܽۢܳ;

    const p2, 0x104000b

    invoke-direct {p0, p1, p2}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ۘ()V
    .locals 0

    return-void
.end method

.method public final ᩴ()V
    .locals 3

    .line 22
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    const-string v1, "/"

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 26
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, p0, Ll/᩵֨ܳ;->۟:Ll/ܽۢܳ;

    if-nez v1, :cond_1

    invoke-virtual {v2}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܽ᩷ܳ;->ۧ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 27
    invoke-static {v0}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 28
    invoke-virtual {v2, v1}, Ll/ܽۢܳ;->ᩳ(Ljava/lang/String;)V

    .line 29
    invoke-static {v0}, Ll/ۢۤۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    const/4 v1, 0x0

    .line 31
    invoke-virtual {v2, v0, v1}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;Z)V

    .line 32
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
