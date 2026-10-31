.class public final Ll/ۤ᩶ۘ;
.super Ljava/lang/Object;
.source "3922"

# interfaces
.implements Ll/᩶᩶ۘ;


# instance fields
.field public ֫:Ll/᩹᩶ۘ;

.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 288
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۤ᩶ۘ;->ۧ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;)Ll/ۗ᩶ۘ;
    .locals 7

    .line 320
    iget-object v0, p0, Ll/ۤ᩶ۘ;->֫:Ll/᩹᩶ۘ;

    if-nez v0, :cond_0

    .line 322
    new-instance v0, Ll/ۜ᩶ۘ;

    .line 10
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    :cond_0
    move-object v6, v0

    .line 325
    new-instance v0, Ll/ۛ᩶ۘ;

    new-instance v4, Ll/ᩳۙۘ;

    invoke-direct {v4}, Ll/ᩳۙۘ;-><init>()V

    iget-object v1, p0, Ll/ۤ᩶ۘ;->ۧ:Ljava/util/HashMap;

    .line 329
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v5

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Ll/ۛ᩶ۘ;-><init>(Ll/ᩴ᩶ۘ;Ll/ܰ᩶ۘ;Ll/ᩳۙۘ;Ljava/util/Map;Ll/᩹᩶ۘ;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/Class;Ll/ۙ᩶ۘ;)Ll/᩶᩶ۘ;
    .locals 1

    .line 301
    iget-object v0, p0, Ll/ۤ᩶ۘ;->ۧ:Ljava/util/HashMap;

    .line 304
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final ֫(Ll/᩹᩶ۘ;)Ll/᩶᩶ۘ;
    .locals 0

    .line 312
    iput-object p1, p0, Ll/ۤ᩶ۘ;->֫:Ll/᩹᩶ۘ;

    return-object p0
.end method
