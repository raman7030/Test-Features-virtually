.class public final Ll/ܳۢۡ;
.super Ljava/lang/Object;
.source "J5HS"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final synthetic ֫:Ll/ۢۢۡ;


# direct methods
.method public constructor <init>(Ll/ۢۢۡ;)V
    .locals 0

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳۢۡ;->֫:Ll/ۢۢۡ;

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 3

    .line 138
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-object v2, p0, Ll/ܳۢۡ;->֫:Ll/ۢۢۡ;

    invoke-static {v2, v0, v1}, Ll/ۢۢۡ;->֫(Ll/ۢۢۡ;J)V

    .line 139
    invoke-static {v2}, Ll/ۢۢۡ;->ۧ(Ll/ۢۢۡ;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 140
    invoke-static {v2}, Ll/ۢۢۡ;->ۧ(Ll/ۢۢۡ;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/widget/AbsListView$OnScrollListener;->onScroll(Landroid/widget/AbsListView;III)V

    :cond_0
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 5

    .line 123
    iget-object v0, p0, Ll/ܳۢۡ;->֫:Ll/ۢۢۡ;

    if-eqz p2, :cond_0

    const/4 v1, 0x1

    .line 124
    invoke-static {v0, v1}, Ll/ۢۢۡ;->֫(Ll/ۢۢۡ;Z)V

    .line 125
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Ll/ۢۢۡ;->֫(Ll/ۢۢۡ;J)V

    goto :goto_0

    .line 127
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Ll/ۢۢۡ;->᩷֫:J

    .line 128
    invoke-static {v0}, Ll/ۢۢۡ;->֫(Ll/ۢۢۡ;)Ll/ۜۢۡ;

    move-result-object v1

    const-wide/16 v2, 0x5dc

    const/4 v4, 0x0

    invoke-virtual {v1, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 129
    invoke-static {v0, v4}, Ll/ۢۢۡ;->֫(Ll/ۢۢۡ;Z)V

    .line 131
    :goto_0
    invoke-static {v0}, Ll/ۢۢۡ;->ۧ(Ll/ۢۢۡ;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 132
    invoke-static {v0}, Ll/ۢۢۡ;->ۧ(Ll/ۢۢۡ;)Landroid/widget/AbsListView$OnScrollListener;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Landroid/widget/AbsListView$OnScrollListener;->onScrollStateChanged(Landroid/widget/AbsListView;I)V

    :cond_1
    return-void
.end method
