.class public final Ll/ۤ᩵ۘ;
.super Ljava/lang/Object;
.source "U4XC"


# instance fields
.field public final ֫:Landroid/widget/AbsListView;


# direct methods
.method public constructor <init>(Landroid/widget/AbsListView;)V
    .locals 0

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Ll/ۤ᩵ۘ;->֫:Landroid/widget/AbsListView;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 50
    iget-object v0, p0, Ll/ۤ᩵ۘ;->֫:Landroid/widget/AbsListView;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getFirstVisiblePosition()I

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 55
    iget-object v0, p0, Ll/ۤ᩵ۘ;->֫:Landroid/widget/AbsListView;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getLastVisiblePosition()I

    move-result v0

    return v0
.end method

.method public final ܽ()Landroid/widget/AbsListView;
    .locals 1

    .line 39
    iget-object v0, p0, Ll/ۤ᩵ۘ;->֫:Landroid/widget/AbsListView;

    return-object v0
.end method
