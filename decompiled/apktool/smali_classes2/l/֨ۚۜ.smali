.class public final Ll/֨ۚۜ;
.super Ljava/lang/Object;
.source "B75R"


# instance fields
.field public ֫:Ll/ܰۗۜ;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 772
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 775
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/֨ۚۜ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method private ۧ(Ljava/lang/Throwable;)V
    .locals 2

    .line 808
    iget-object v0, p0, Ll/֨ۚۜ;->ܽ:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    if-eq v0, p1, :cond_0

    .line 809
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 811
    :cond_0
    iget-object v0, p0, Ll/֨ۚۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eq v1, p1, :cond_1

    .line 813
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Z)Ljava/lang/Throwable;
    .locals 4

    .line 788
    iget-object v0, p0, Ll/֨ۚۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Throwable;

    .line 789
    invoke-static {v2}, Ll/ۙۚۜ;->֫(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v3

    check-cast v3, Ljava/lang/Error;

    if-eqz v3, :cond_1

    .line 791
    invoke-direct {p0, v3}, Ll/֨ۚۜ;->ۧ(Ljava/lang/Throwable;)V

    return-object v3

    .line 793
    :cond_1
    invoke-static {v2}, Ll/ۙۚۜ;->ۧ(Ljava/lang/Throwable;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 794
    invoke-direct {p0, v2}, Ll/֨ۚۜ;->ۧ(Ljava/lang/Throwable;)V

    return-object v2

    .line 797
    :cond_2
    iget-object v1, p0, Ll/֨ۚۜ;->ܽ:Ljava/lang/Throwable;

    if-eqz v1, :cond_3

    .line 798
    invoke-direct {p0, v1}, Ll/֨ۚۜ;->ۧ(Ljava/lang/Throwable;)V

    return-object v1

    :cond_3
    if-nez p1, :cond_4

    .line 800
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_4

    const/4 p1, 0x0

    .line 801
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Throwable;

    invoke-direct {p0, p1}, Ll/֨ۚۜ;->ۧ(Ljava/lang/Throwable;)V

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/lang/Throwable;)V
    .locals 1

    .line 778
    iget-object v0, p0, Ll/֨ۚۜ;->ܽ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    .line 779
    iput-object p1, p0, Ll/֨ۚۜ;->ܽ:Ljava/lang/Throwable;

    return-void

    :cond_0
    if-eq v0, p1, :cond_1

    .line 781
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
