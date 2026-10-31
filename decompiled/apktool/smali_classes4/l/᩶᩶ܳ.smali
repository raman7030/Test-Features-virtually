.class public final synthetic Ll/᩶᩶ܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ܽۙܳ;

.field public final synthetic ᩹:Landroid/widget/BaseAdapter;


# direct methods
.method public synthetic constructor <init>(Ll/ܽۙܳ;Landroid/widget/BaseAdapter;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶᩶ܳ;->᩸:Ll/ܽۙܳ;

    iput-object p2, p0, Ll/᩶᩶ܳ;->᩹:Landroid/widget/BaseAdapter;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 2
    iget-object p1, p0, Ll/᩶᩶ܳ;->᩸:Ll/ܽۙܳ;

    .line 4
    iget-object p2, p0, Ll/᩶᩶ܳ;->᩹:Landroid/widget/BaseAdapter;

    move-object v0, p1

    .line 742
    monitor-enter v0

    .line 743
    :try_start_0
    iget-object p1, p1, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 744
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 745
    invoke-virtual {p2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void

    :catchall_0
    move-exception p1

    .line 744
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
