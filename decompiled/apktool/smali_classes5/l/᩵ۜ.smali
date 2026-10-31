.class public final Ll/᩵ۜ;
.super Ljava/lang/Object;
.source "E50U"

# interfaces
.implements Ll/ۖۖ;


# instance fields
.field public final synthetic ᩸:Ll/ۚۜ;


# direct methods
.method public constructor <init>(Ll/ۚۜ;)V
    .locals 0

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۜ;->᩸:Ll/ۚۜ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗۜ;Landroid/view/MenuItem;)V
    .locals 0

    .line 142
    iget-object p2, p0, Ll/᩵ۜ;->᩸:Ll/ۚۜ;

    iget-object p2, p2, Ll/ۚۜ;->ۢ֫:Landroid/os/Handler;

    invoke-virtual {p2, p1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ll/ۗۜ;Ll/ۛۜ;)V
    .locals 7

    .line 149
    iget-object v0, p0, Ll/᩵ۜ;->᩸:Ll/ۚۜ;

    iget-object v1, v0, Ll/ۚۜ;->ۢ֫:Landroid/os/Handler;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 153
    iget-object v0, v0, Ll/ۚۜ;->ۜ֫:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    :goto_0
    const/4 v5, -0x1

    if-ge v4, v3, :cond_1

    .line 154
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֡ۜ;

    iget-object v6, v6, Ll/֡ۜ;->֫:Ll/ۗۜ;

    if-ne p1, v6, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v4, -0x1

    :goto_1
    if-ne v4, v5, :cond_2

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 166
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v4, v3, :cond_3

    .line 167
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ll/֡ۜ;

    .line 172
    :cond_3
    new-instance v0, Ll/ᩴۜ;

    invoke-direct {v0, p0, v2, p2, p1}, Ll/ᩴۜ;-><init>(Ll/᩵ۜ;Ll/֡ۜ;Ll/ۛۜ;Ll/ۗۜ;)V

    .line 191
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0xc8

    add-long/2addr v2, v4

    .line 192
    invoke-virtual {v1, v0, p1, v2, v3}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;Ljava/lang/Object;J)Z

    return-void
.end method
