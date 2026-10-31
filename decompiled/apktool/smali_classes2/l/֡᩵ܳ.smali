.class public Ll/֡᩵ܳ;
.super Ljava/lang/Object;
.source "715M"


# instance fields
.field public ֫:Z

.field public ۧ:Z

.field public final ܽ:[Landroid/view/View;


# direct methods
.method public varargs constructor <init>([Landroid/view/View;)V
    .locals 0

    .line 1265
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1266
    iput-object p1, p0, Ll/֡᩵ܳ;->ܽ:[Landroid/view/View;

    return-void
.end method


# virtual methods
.method public setAlpha(F)V
    .locals 4
    .annotation build Ll/ۙᩳ;
    .end annotation

    .line 1271
    iget-object v0, p0, Ll/֡᩵ܳ;->ܽ:[Landroid/view/View;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 1272
    invoke-virtual {v3, p1}, Landroid/view/View;->setAlpha(F)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    cmpl-float p1, p1, v0

    if-nez p1, :cond_2

    .line 1275
    iget-boolean p1, p0, Ll/֡᩵ܳ;->֫:Z

    if-eqz p1, :cond_1

    const/16 p1, 0x8

    .line 1276
    invoke-virtual {p0, p1}, Ll/֡᩵ܳ;->֫(I)V

    return-void

    .line 1277
    :cond_1
    iget-boolean p1, p0, Ll/֡᩵ܳ;->ۧ:Z

    if-eqz p1, :cond_2

    const/4 p1, 0x4

    .line 1278
    invoke-virtual {p0, p1}, Ll/֡᩵ܳ;->֫(I)V

    :cond_2
    return-void
.end method

.method public final ֫(I)V
    .locals 4

    .line 1284
    iget-object v0, p0, Ll/֡᩵ܳ;->ܽ:[Landroid/view/View;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 1285
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
