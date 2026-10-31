.class public final Ll/ܺۙۡ;
.super Ll/ۖ᩹ۢ;
.source "21V7"

# interfaces
.implements Ll/ۡ۬ۡ;
.implements Ll/ۖ۬ۡ;


# instance fields
.field public final ۧ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    .line 14
    invoke-direct {p0, v0}, Ll/ۖ᩹ۢ;-><init>(I)V

    .line 24
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ܺۙۡ;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ll/ۙۗۡ;)Ll/ۙۗۡ;
    .locals 1

    .line 102
    :goto_0
    invoke-virtual {p0}, Ll/ۙۗۡ;->֫()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 103
    invoke-virtual {p0}, Ll/ۙۗۡ;->֫()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll/ۙۗۡ;

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p0}, Ll/ۙۗۡ;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۙۗۡ;

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public static ۧ(Ll/۫ۗۡ;)Ll/ᩴ۬ۡ;
    .locals 1

    .line 119
    :goto_0
    invoke-interface {p0}, Ll/ᩴ۬ۡ;->֫()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 120
    invoke-interface {p0}, Ll/ᩴ۬ۡ;->֫()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Ll/ᩴ۬ۡ;

    if-eqz v0, :cond_0

    .line 121
    invoke-interface {p0}, Ll/ᩴ۬ۡ;->֫()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ᩴ۬ۡ;

    goto :goto_0

    :cond_0
    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/۫ۗۡ;)V
    .locals 4

    .line 45
    invoke-virtual {p1}, Ll/ۙۗۡ;->ᩳ()Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-virtual {p1}, Ll/ۙۗۡ;->ܽ()Ll/ܽۙۡ;

    move-result-object v1

    .line 50
    invoke-static {v0}, Ll/᩺ۤۡ;->ܽ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    .line 56
    :cond_0
    new-instance v2, Ll/ۚۙۡ;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v1, v3}, Ll/ۚۙۡ;-><init>(Ljava/lang/String;Ll/ܽۙۡ;Z)V

    .line 57
    iget-object v0, p0, Ll/ܺۙۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙۗۡ;

    if-nez v1, :cond_1

    .line 61
    invoke-static {p1}, Ll/ܺۙۡ;->֫(Ll/ۙۗۡ;)Ll/ۙۗۡ;

    move-result-object p1

    .line 64
    invoke-virtual {v0, v2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 79
    :cond_1
    invoke-static {p1}, Ll/ܺۙۡ;->֫(Ll/ۙۗۡ;)Ll/ۙۗۡ;

    move-result-object p1

    .line 80
    invoke-static {v1}, Ll/ܺۙۡ;->֫(Ll/ۙۗۡ;)Ll/ۙۗۡ;

    move-result-object v0

    .line 83
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 88
    invoke-virtual {v0, p1}, Ll/ۙۗۡ;->֫(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۧ(Ll/ۗۗۡ;)V
    .locals 6

    .line 31
    new-instance v5, Ll/᩻۬ۡ;

    new-instance v0, Ll/ܺ۬ۡ;

    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2, p0}, Ll/ܺ۬ۡ;-><init>(IILl/ۖ۬ۡ;)V

    invoke-direct {v5, v0}, Ll/᩻۬ۡ;-><init>(Ljava/lang/Object;)V

    const/4 v1, 0x1

    const/4 v2, 0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Ll/᩶ۗۡ;->֫(ZZZZLl/ۡ۬ۡ;)V

    .line 37
    iget-object p1, p0, Ll/ܺۙۡ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p1}, Ljava/util/HashMap;->clear()V

    return-void
.end method
