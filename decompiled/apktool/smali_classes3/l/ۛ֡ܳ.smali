.class public final synthetic Ll/ۛ֡ܳ;
.super Ljava/lang/Object;
.source "698T"

# interfaces
.implements Ll/۟ۜܳ;


# instance fields
.field public final synthetic ᩶:Ll/ۖۢܳ;

.field public final synthetic ᩸:Ll/۟֡ܳ;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۟֡ܳ;Ll/ܽۢܳ;Ll/ۖۢܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ֡ܳ;->᩸:Ll/۟֡ܳ;

    iput-object p2, p0, Ll/ۛ֡ܳ;->᩹:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ۛ֡ܳ;->᩶:Ll/ۖۢܳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۢܳ;)V
    .locals 6

    .line 63
    invoke-virtual {p1}, Ll/ۤۢܳ;->֫()V

    .line 64
    iget-object v0, p0, Ll/ۛ֡ܳ;->᩹:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v0}, Ll/ܽۢܳ;->۠()Ll/ᩳۜܳ;

    move-result-object v2

    new-instance v3, Ll/᩺֡ܳ;

    iget-object v4, p0, Ll/ۛ֡ܳ;->᩸:Ll/۟֡ܳ;

    iget-object v5, p0, Ll/ۛ֡ܳ;->᩶:Ll/ۖۢܳ;

    invoke-direct {v3, v4, p1, v5, v0}, Ll/᩺֡ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0, v2, v3}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/۟ۜܳ;)V

    return-void
.end method
