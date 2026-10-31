.class public final synthetic Ll/ᩳۚܳ;
.super Ljava/lang/Object;
.source "C12B"

# interfaces
.implements Ll/۟ۜܳ;
.implements Ll/ۘ᩻ۜ;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩳۚܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/ᩳۚܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/ᩳۚܳ;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫(I)Ll/۬ۛ᩻;
    .locals 3

    .line 0
    iget-object v0, p0, Ll/ᩳۚܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ܿܳۜ;

    iget-object v1, p0, Ll/ᩳۚܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ۨ᩻ۜ;

    iget-object v2, p0, Ll/ᩳۚܳ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ܺۨ᩻;

    invoke-static {v0, v1, v2, p1}, Ll/ܿܳۜ;->֫(Ll/ܿܳۜ;Ll/ۨ᩻ۜ;Ll/ܺۨ᩻;I)Ll/۬ۛ᩻;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/ۤۢܳ;)V
    .locals 6

    .line 2
    iget-object v0, p0, Ll/ᩳۚܳ;->᩸:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܺۚܳ;

    .line 6
    iget-object v1, p0, Ll/ᩳۚܳ;->᩹:Ljava/lang/Object;

    .line 8
    check-cast v1, Ll/ܽۢܳ;

    .line 10
    iget-object v2, p0, Ll/ᩳۚܳ;->᩶:Ljava/lang/Object;

    .line 12
    check-cast v2, Ll/ۖۢܳ;

    .line 66
    invoke-virtual {p1}, Ll/ۤۢܳ;->֫()V

    .line 67
    invoke-virtual {v1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object v3

    invoke-virtual {v1}, Ll/ܽۢܳ;->۠()Ll/ᩳۜܳ;

    move-result-object v4

    new-instance v5, Ll/ܳۚܳ;

    invoke-direct {v5, v0, p1, v2, v1}, Ll/ܳۚܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v3, v1, v4, v5}, Ll/ܽ᩷ܳ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Ll/۟ۜܳ;)V

    return-void
.end method
