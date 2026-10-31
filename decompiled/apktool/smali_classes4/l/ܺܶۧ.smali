.class public final Ll/ܺܶۧ;
.super Ll/֫᩸ۧ;
.source "522K"


# instance fields
.field public ۫֫:J


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;J)V
    .locals 5

    .line 37
    invoke-direct {p0, p1}, Ll/֫᩸ۧ;-><init>(Landroid/content/Context;)V

    .line 47
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ۧ֫()V

    .line 48
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ܰ()V

    .line 49
    invoke-virtual {p0}, Ll/֫᩸ۧ;->ܽ֫()V

    const/16 p1, 0x3e7

    .line 51
    invoke-virtual {p0, p1}, Ll/֫᩸ۧ;->ᩳ(I)V

    .line 61
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 63
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫᩸ۧ;

    .line 64
    invoke-virtual {v1}, Ll/֫᩸ۧ;->۠()Ljava/lang/CharSequence;

    move-result-object v2

    .line 65
    instance-of v3, v1, Ll/ۗ᩸ۧ;

    if-eqz v3, :cond_1

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    .line 66
    move-object v4, v1

    check-cast v4, Ll/ۗ᩸ۧ;

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    :cond_1
    invoke-virtual {v1}, Ll/֫᩸ۧ;->getParent()Ll/ۗ᩸ۧ;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    if-eqz v3, :cond_0

    .line 70
    check-cast v1, Ll/ۗ᩸ۧ;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 74
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    if-nez v0, :cond_3

    move-object v0, v2

    goto :goto_0

    .line 78
    :cond_3
    invoke-virtual {p0}, Ll/֫᩸ۧ;->֫()Landroid/content/Context;

    move-result-object v1

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v2, v3, v0

    const v0, 0x7f120a04

    invoke-virtual {v1, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 83
    :cond_4
    invoke-virtual {p0, v0}, Ll/֫᩸ۧ;->֫(Ljava/lang/CharSequence;)V

    const-wide/32 p1, 0xf4240

    add-long/2addr p3, p1

    .line 43
    iput-wide p3, p0, Ll/ܺܶۧ;->۫֫:J

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩷᩹ۧ;)V
    .locals 1

    .line 88
    invoke-super {p0, p1}, Ll/֫᩸ۧ;->֫(Ll/᩷᩹ۧ;)V

    const/4 v0, 0x0

    .line 89
    invoke-virtual {p1, v0}, Ll/᩷᩹ۧ;->֫(Z)V

    return-void
.end method

.method public final ᩻()J
    .locals 2

    .line 94
    iget-wide v0, p0, Ll/ܺܶۧ;->۫֫:J

    return-wide v0
.end method
