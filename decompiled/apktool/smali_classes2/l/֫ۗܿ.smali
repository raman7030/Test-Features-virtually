.class public final Ll/֫ۗܿ;
.super Ljava/lang/Object;
.source "014Q"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/util/ArrayList;

.field public final ᩳ:Ll/ܽۗܿ;


# direct methods
.method public constructor <init>(Ll/ܽۗܿ;)V
    .locals 1

    .line 474
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 470
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۗܿ;->֫:Ljava/util/ArrayList;

    .line 471
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    .line 472
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۗܿ;->ܽ:Ljava/util/ArrayList;

    .line 475
    iput-object p1, p0, Ll/֫ۗܿ;->ᩳ:Ll/ܽۗܿ;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 5

    .line 508
    :goto_0
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۙܿ;

    .line 17
    iget-object v0, v0, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 509
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_0

    .line 511
    :cond_0
    :goto_1
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v2, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v0

    .line 511
    check-cast v0, Ll/ۨۙܿ;

    .line 17
    iget-object v0, v0, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 512
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    .line 0
    invoke-static {v0, v2}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_1

    .line 514
    :cond_1
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ne v0, v2, :cond_2

    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۨۙܿ;

    iget-object v0, v0, Ll/ۨۙܿ;->֫:Ljava/lang/String;

    const-string v1, "nop"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 515
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void

    .line 517
    :cond_2
    iget-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 518
    new-instance v0, Ll/۟ۙܿ;

    iget-object v1, p0, Ll/֫ۗܿ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v3, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    iget-object v4, p0, Ll/֫ۗܿ;->ᩳ:Ll/ܽۗܿ;

    invoke-direct {v0, v4, v2, v3}, Ll/۟ۙܿ;-><init>(Ll/ܽۗܿ;ILjava/util/ArrayList;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 519
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/֫ۗܿ;->ۧ:Ljava/util/ArrayList;

    :cond_3
    return-void
.end method
