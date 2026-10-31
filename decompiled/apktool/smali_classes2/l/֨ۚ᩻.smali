.class public final Ll/֨ۚ᩻;
.super Ljava/lang/Object;
.source "VA36"

# interfaces
.implements Ll/ܺۜ᩻;


# instance fields
.field public final synthetic ֫:Ll/۠ۚ᩻;


# direct methods
.method public constructor <init>(Ll/۠ۚ᩻;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۚ᩻;->֫:Ll/۠ۚ᩻;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 58
    invoke-static {p1}, Ll/ܽ᩷ܳ;->᩻(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 59
    iget-object v0, p0, Ll/֨ۚ᩻;->֫:Ll/۠ۚ᩻;

    invoke-static {v0}, Ll/۠ۚ᩻;->֫(Ll/۠ۚ᩻;)Ll/ۤ᩹ۘ;

    move-result-object v1

    invoke-static {v0, p1}, Ll/۠ۚ᩻;->֫(Ll/۠ۚ᩻;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ۤ᩹ۘ;->ᩳ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    const-wide/16 v2, 0x1

    .line 60
    invoke-interface {v1, v2, v3}, Ll/ܿ᩺ᩴ;->skip(J)Ll/ܿ᩺ᩴ;

    move-result-object v1

    .line 61
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v2

    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 62
    invoke-static {v0}, Ll/۠ۚ᩻;->ۧ(Ll/۠ۚ᩻;)Ljava/lang/Boolean;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    .line 64
    :try_start_0
    invoke-static {v0, v1, p1}, Ll/۠ۚ᩻;->֫(Ll/۠ۚ᩻;Ljava/util/List;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-object v1
.end method

.method public final ֫(Ljava/lang/Object;)Z
    .locals 0

    .line 54
    check-cast p1, Ll/۠᩹ۘ;

    .line 79
    invoke-virtual {p1}, Ll/۠᩹ۘ;->ᩳ()Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 54
    check-cast p1, Ll/۠᩹ۘ;

    .line 74
    invoke-virtual {p1}, Ll/۠᩹ۘ;->ܽ()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
