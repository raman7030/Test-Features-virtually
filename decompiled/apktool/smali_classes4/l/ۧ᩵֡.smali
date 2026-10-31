.class public final Ll/ۧ᩵֡;
.super Ljava/lang/Object;
.source "F6M7"

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

    .line 16
    iput-object p1, p0, Ll/ۧ᩵֡;->֫:Ll/᩶֨֡;

    .line 17
    invoke-interface {p1}, Ll/᩶֨֡;->֫()Ll/ۨ֨֡;

    move-result-object p1

    iput-object p1, p0, Ll/ۧ᩵֡;->ۧ:Ll/ۨ֨֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;)V
    .locals 5

    .line 22
    instance-of v0, p1, Ll/ܰᩴ֡;

    if-eqz v0, :cond_1

    .line 23
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    const-string v1, "type"

    const-string v2, "checkbox"

    .line 24
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "disabled"

    const-string v2, ""

    .line 25
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    move-object v1, p1

    check-cast v1, Ll/ܰᩴ֡;

    invoke-virtual {v1}, Ll/ܰᩴ֡;->᩷()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "checked"

    .line 27
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    :cond_0
    iget-object v1, p0, Ll/ۧ᩵֡;->֫:Ll/᩶֨֡;

    const-string v2, "input"

    invoke-interface {v1, p1, v2, v0}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;Ljava/lang/String;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    const/4 v3, 0x0

    .line 33
    iget-object v4, p0, Ll/ۧ᩵֡;->ۧ:Ll/ۨ֨֡;

    invoke-virtual {v4, v2, v0, v3}, Ll/ۨ֨֡;->֫(Ljava/lang/String;Ljava/util/Map;Z)V

    const-string v0, " "

    .line 31
    invoke-virtual {v4, v0}, Ll/ۨ֨֡;->ᩳ(Ljava/lang/String;)V

    .line 37
    invoke-virtual {p1}, Ll/֡ۚ֡;->֫()Ll/֡ۚ֡;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 39
    invoke-virtual {p1}, Ll/֡ۚ֡;->ܽ()Ll/֡ۚ֡;

    move-result-object v0

    .line 40
    invoke-interface {v1, p1}, Ll/᩶֨֡;->֫(Ll/֡ۚ֡;)V

    move-object p1, v0

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۧ()Ljava/util/Set;
    .locals 4

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    .line 0
    const-class v3, Ll/ܰᩴ֡;

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
