.class public final synthetic Ll/ۜ֡ܳ;
.super Ljava/lang/Object;
.source "P98B"

# interfaces
.implements Ll/۠ۜ᩵;
.implements Ll/۟ۜܳ;


# instance fields
.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜ֡ܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ۜ֡ܳ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۤۢܳ;)V
    .locals 5

    .line 2
    iget-object v0, p0, Ll/ۜ֡ܳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 6
    iget-object v1, p0, Ll/ۜ֡ܳ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/ۖۢܳ;

    .line 47
    invoke-virtual {p1}, Ll/ۤۢܳ;->֫()V

    .line 48
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v2

    invoke-virtual {v0}, Ll/ܽۢܳ;->۠()Ll/ᩳۜܳ;

    move-result-object v3

    new-instance v4, Ll/᩷֡ܳ;

    invoke-direct {v4, p1, v1, v0}, Ll/᩷֡ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v0, v3, v4}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/۟ۜܳ;)V

    return-void
.end method

.method public ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ۜ֡ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/᩹ᩴᩳ;

    iget-object v1, p0, Ll/ۜ֡ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    check-cast p1, Ljava/lang/Void;

    invoke-static {v0, v1, p2}, Ll/᩹ᩴᩳ;->֫(Ll/᩹ᩴᩳ;Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    return-void
.end method
