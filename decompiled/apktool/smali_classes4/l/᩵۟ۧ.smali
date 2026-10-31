.class public final Ll/᩵۟ۧ;
.super Ljava/lang/Object;
.source "J71Y"


# instance fields
.field public ֫:Ljava/lang/String;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 472
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "appassets.androidplatform.net"

    .line 474
    iput-object v0, p0, Ll/᩵۟ۧ;->֫:Ljava/lang/String;

    .line 477
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩵۟ۧ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final ֫()Ll/֨۟ۧ;
    .locals 6

    .line 528
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 529
    iget-object v1, p0, Ll/᩵۟ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۤۤ;

    .line 530
    iget-object v3, v2, Ll/ۤۤ;->֫:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    .line 531
    iget-object v2, v2, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast v2, Ll/֡۟ۧ;

    .line 532
    new-instance v4, Ll/ۚ۟ۧ;

    iget-object v5, p0, Ll/᩵۟ۧ;->֫:Ljava/lang/String;

    invoke-direct {v4, v5, v3, v2}, Ll/ۚ۟ۧ;-><init>(Ljava/lang/String;Ljava/lang/String;Ll/֡۟ۧ;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 534
    :cond_0
    new-instance v1, Ll/֨۟ۧ;

    invoke-direct {v1, v0}, Ll/֨۟ۧ;-><init>(Ljava/util/ArrayList;)V

    return-object v1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 487
    iput-object p1, p0, Ll/᩵۟ۧ;->֫:Ljava/lang/String;

    return-void
.end method

.method public final ֫(Ll/֡۟ۧ;)V
    .locals 2

    .line 84
    new-instance v0, Ll/ۤۤ;

    const-string v1, "/"

    invoke-direct {v0, v1, p1}, Ll/ۤۤ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 518
    iget-object p1, p0, Ll/᩵۟ۧ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
