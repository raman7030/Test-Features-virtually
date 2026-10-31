.class public final Ll/ۘۖ֨;
.super Ljava/lang/Object;
.source "P3JQ"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public ᩶:Ll/ۘۖ֨;

.field public ᩸:Ll/ܺۡ֨;

.field public ᩹:Ll/۬ܺ֨;


# direct methods
.method public constructor <init>(Ll/ۘۖ֨;Ll/۬ܺ֨;)V
    .locals 2

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    invoke-interface {p2}, Ll/۬ܺ֨;->֫()Ll/ۗܺ֨;

    move-result-object v0

    sget-object v1, Ll/ۗܺ֨;->ۜ֫:Ll/ۗܺ֨;

    if-ne v0, v1, :cond_0

    .line 108
    move-object p1, p2

    check-cast p1, Ll/ܺۡ֨;

    iput-object p1, p0, Ll/ۘۖ֨;->᩸:Ll/ܺۡ֨;

    const/4 p1, 0x0

    .line 109
    iput-object p1, p0, Ll/ۘۖ֨;->᩶:Ll/ۘۖ֨;

    goto :goto_0

    .line 112
    :cond_0
    iget-object v0, p1, Ll/ۘۖ֨;->᩸:Ll/ܺۡ֨;

    iput-object v0, p0, Ll/ۘۖ֨;->᩸:Ll/ܺۡ֨;

    .line 113
    iput-object p1, p0, Ll/ۘۖ֨;->᩶:Ll/ۘۖ֨;

    .line 115
    :goto_0
    iput-object p2, p0, Ll/ۘۖ֨;->᩹:Ll/۬ܺ֨;

    return-void
.end method

.method public static ֫(Ll/ܺۡ֨;Ll/ۚ᩵۠;)Ll/ۘۖ֨;
    .locals 2

    .line 50
    new-instance v0, Ll/ۘۖ֨;

    const/4 v1, 0x0

    .line 98
    invoke-direct {v0, v1, p0}, Ll/ۘۖ֨;-><init>(Ll/ۘۖ֨;Ll/۬ܺ֨;)V

    .line 130
    iget-object p0, v0, Ll/ۘۖ֨;->᩹:Ll/۬ܺ֨;

    if-ne p0, p1, :cond_0

    return-object v0

    .line 86
    :cond_0
    :try_start_0
    new-instance p0, Ll/ܺۖ֨;

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-virtual {p0, v0, p1}, Ll/ᩴۖ֨;->֫(Ll/ۘۖ֨;Ll/ۚ᩵۠;)V
    :try_end_0
    .catch Ll/ۖۖ֨; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    .line 88
    iget-object p0, p0, Ll/ۖۖ֨;->᩸:Ll/ۘۖ֨;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ۘۖ֨;)Ll/۬ܺ֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۖ֨;->᩹:Ll/۬ܺ֨;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۘۖ֨;)Ll/ۘۖ֨;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۘۖ֨;->᩶:Ll/ۘۖ֨;

    return-object p0
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 146
    new-instance v0, Ll/ۡۖ֨;

    invoke-direct {v0, p0}, Ll/ۡۖ֨;-><init>(Ll/ۘۖ֨;)V

    return-object v0
.end method

.method public final ۧ()Ll/ܺۡ֨;
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۘۖ֨;->᩸:Ll/ܺۡ֨;

    return-object v0
.end method

.method public final ܽ()Ll/۬ܺ֨;
    .locals 1

    .line 130
    iget-object v0, p0, Ll/ۘۖ֨;->᩹:Ll/۬ܺ֨;

    return-object v0
.end method
