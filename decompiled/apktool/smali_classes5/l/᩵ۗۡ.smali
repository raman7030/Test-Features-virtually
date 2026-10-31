.class public final Ll/᩵ۗۡ;
.super Ljava/lang/Object;
.source "R1V9"

# interfaces
.implements Ll/ۡ۬ۡ;


# instance fields
.field public final ֫:Ll/۟ۤ;

.field public final synthetic ۧ:Ll/֡ۗۡ;


# direct methods
.method public constructor <init>(Ll/֡ۗۡ;Ll/۟ۤ;)V
    .locals 0

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۗۡ;->ۧ:Ll/֡ۗۡ;

    .line 94
    iput-object p2, p0, Ll/᩵ۗۡ;->֫:Ll/۟ۤ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۗۡ;)V
    .locals 4

    .line 99
    iget-object v0, p0, Ll/᩵ۗۡ;->֫:Ll/۟ۤ;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/᩶ۗۡ;->ܳ()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x2f

    const/16 v3, 0x2e

    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/۟ۤ;->֫(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 102
    :cond_0
    invoke-static {p1}, Ll/۟᩶ۡ;->ܽ(Ll/ۗۗۡ;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    .line 106
    invoke-static {p1}, Ll/֡ۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 107
    iget-object v0, p0, Ll/᩵ۗۡ;->ۧ:Ll/֡ۗۡ;

    invoke-static {v0}, Ll/֡ۗۡ;->֫(Ll/֡ۗۡ;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Ll/֡ۗۡ;->ۧ(Ll/֡ۗۡ;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/TreeSet;

    invoke-virtual {v1, p1}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    .line 109
    :cond_1
    invoke-static {v0}, Ll/֡ۗۡ;->ܽ(Ll/֡ۗۡ;)Ll/ۚۗۡ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۚۗۡ;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 110
    invoke-static {v0}, Ll/֡ۗۡ;->ۧ(Ll/֡ۗۡ;)Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/TreeSet;

    invoke-virtual {v0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    return-void

    .line 112
    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v0}, Ll/֡ۗۡ;->֫(Ll/֡ۗۡ;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 113
    invoke-static {v0}, Ll/֡ۗۡ;->֫(Ll/֡ۗۡ;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 114
    invoke-static {p1}, Ll/֡ۗۡ;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_1
    return-void

    .line 104
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1
.end method
