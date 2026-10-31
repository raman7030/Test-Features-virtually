.class public final Ll/ۚᩴ֡;
.super Ljava/lang/Object;
.source "I6LX"

# interfaces
.implements Ll/ۚ֨֡;


# instance fields
.field public final ֫:Ll/᩶֨֡;

.field public final ۧ:Ll/ۨ֨֡;


# direct methods
.method public constructor <init>(Ll/᩶֨֡;)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Ll/ۚᩴ֡;->֫:Ll/᩶֨֡;

    .line 15
    invoke-interface {p1}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object p1

    iput-object p1, p0, Ll/ۚᩴ֡;->ۧ:Ll/ۨ֨֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;)V
    .locals 5

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 20
    iget-object v1, p0, Ll/ۚᩴ֡;->֫:Ll/᩶֨֡;

    const-string v2, "del"

    invoke-interface {v1, p1, v2, v0}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    const/4 v3, 0x0

    .line 33
    iget-object v4, p0, Ll/ۚᩴ֡;->ۧ:Ll/ۨ֨֡;

    invoke-virtual {v4, v2, v0, v3}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    .line 27
    invoke-virtual {p1}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_0

    .line 29
    invoke-virtual {p1}, Ll/֡ۚ֡;->ܽ()Ll/֡ۚ֡;

    move-result-object v0

    .line 30
    invoke-interface {v1, p1}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;)V

    move-object p1, v0

    goto :goto_0

    :cond_0
    const-string p1, "/del"

    .line 23
    invoke-virtual {v4, p1}, Ll/ۨ֨֡;->ܽ(Ljava/lang/String;)V

    return-void
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 0
    const-class v3, Ll/ۘᩴ֡;

    aput-object v3, v1, v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3, v0}, Ljava/util/HashSet;-><init>(I)V

    aget-object v0, v1, v2

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v3}, Ll/᩶۬ᩴ;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "duplicate element: "

    invoke-static {v0, v2}, Ll/ۚ۬ۚ;->֫(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
