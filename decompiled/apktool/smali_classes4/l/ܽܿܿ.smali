.class public final synthetic Ll/ܽܿܿ;
.super Ljava/lang/Object;
.source "4AWI"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ljava/util/List;

.field public final synthetic ۧ:Ll/᩻ܳܿ;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Ll/᩻ܳܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽܿܿ;->֫:Ljava/util/List;

    iput-object p2, p0, Ll/ܽܿܿ;->ۧ:Ll/᩻ܳܿ;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    .line 2
    check-cast p1, Ll/ܶܳܿ;

    .line 4
    sget v0, Ll/֡ܳܿ;->֨ۧ:I

    .line 566
    iget-object v0, p0, Ll/ܽܿܿ;->֫:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v2

    .line 566
    check-cast v2, Ll/ܶܳܿ;

    .line 62
    iget-object v3, v2, Ll/ܶܳܿ;->ۧ:Ll/ۧܿܿ;

    invoke-virtual {v3}, Ll/ۧܿܿ;->ܽ()I

    move-result v3

    const/16 v4, 0x16

    if-eq v3, v4, :cond_0

    iget-object v2, v2, Ll/ܶܳܿ;->֫:Ll/ۧܿܿ;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ll/ۧܿܿ;->ܽ()I

    move-result v2

    if-ne v2, v4, :cond_1

    .line 567
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v1

    goto :goto_0

    .line 569
    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    .line 571
    :goto_0
    invoke-interface {v0, v2, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 572
    iget-object p1, p0, Ll/ܽܿܿ;->ۧ:Ll/᩻ܳܿ;

    iget-object v0, p1, Ll/᩻ܳܿ;->֫:Ll/۟ܿܿ;

    invoke-virtual {v0, v2}, Ll/᩶ۗۧ;->notifyItemInserted(I)V

    .line 573
    iget-object p1, p1, Ll/᩻ܳܿ;->᩷:Ll/۬۬ۧ;

    invoke-virtual {p1, v2}, Ll/۬۬ۧ;->smoothScrollToPosition(I)V

    .line 574
    invoke-static {}, Ll/۠ܳܿ;->ܿ()V

    return-void
.end method
