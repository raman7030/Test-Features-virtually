.class public final Ll/ۖۚܳ;
.super Ll/֫ۜܳ;
.source "X20E"


# static fields
.field public static final ۗ:Ll/ۖۚܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 10
    new-instance v0, Ll/ۖۚܳ;

    const v1, 0x7f1205f0

    const v2, 0x7f080223

    .line 17
    invoke-direct {v0, v1, v2}, Ll/֫ۜܳ;-><init>(II)V

    .line 10
    sput-object v0, Ll/ۖۚܳ;->ۗ:Ll/ۖۚܳ;

    return-void
.end method

.method public static ᩻()Ll/ۖۚܳ;
    .locals 1

    .line 13
    sget-object v0, Ll/ۖۚܳ;->ۗ:Ll/ۖۚܳ;

    return-object v0
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 2

    .line 28
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object v0

    .line 29
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩳ()Ll/ܽ᩷ܳ;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ܽ᩷ܳ;->֫(Ll/ᩳۜܳ;)V

    .line 30
    invoke-interface {v0}, Ll/ᩳۜܳ;->ۤۧ()Ll/ۖ֨ܿ;

    move-result-object v1

    .line 31
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܿ()Ll/ܽۢܳ;

    move-result-object p1

    invoke-virtual {v1}, Ll/ۖ֨ܿ;->ܽ()Ll/۫֨ܿ;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {p1, v0, v1}, Ll/ۘ۠ܿ;->֫(Ll/ܽۢܳ;Ll/ᩳۜܳ;Z)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 2

    .line 22
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 23
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۡ()Ll/ᩳۜܳ;

    move-result-object p1

    invoke-interface {p1}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
