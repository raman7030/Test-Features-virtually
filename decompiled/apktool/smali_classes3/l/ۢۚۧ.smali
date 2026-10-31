.class public final Ll/ۢۚۧ;
.super Ljava/lang/Object;
.source "H8MM"

# interfaces
.implements Ll/ᩳۚۧ;


# instance fields
.field public final ֫:Ll/ܽ֨֫;

.field public final synthetic ۧ:Ll/ܺۚۧ;


# direct methods
.method public constructor <init>(Ll/ܺۚۧ;)V
    .locals 2

    .line 631
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۚۧ;->ۧ:Ll/ܺۚۧ;

    .line 632
    new-instance p1, Ll/ܽ֨֫;

    const/4 v0, 0x4

    new-array v1, v0, [B

    .line 48
    invoke-direct {p1, v1, v0}, Ll/ܽ֨֫;-><init>([BI)V

    .line 632
    iput-object p1, p0, Ll/ۢۚۧ;->֫:Ll/ܽ֨֫;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۢ֨֫;Ll/᩸᩷ۧ;Ll/᩵ۚۧ;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ᩳ֨֫;)V
    .locals 9

    .line 645
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    .line 651
    :cond_0
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    and-int/lit16 v0, v0, 0x80

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x6

    .line 658
    invoke-virtual {p1, v0}, Ll/ᩳ֨֫;->ܳ(I)V

    .line 660
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/4 v1, 0x4

    div-int/2addr v0, v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 661
    :goto_0
    iget-object v4, p0, Ll/ۢۚۧ;->ۧ:Ll/ܺۚۧ;

    if-ge v3, v0, :cond_4

    .line 217
    iget-object v5, p0, Ll/ۢۚۧ;->֫:Ll/ܽ֨֫;

    iget-object v6, v5, Ll/ܽ֨֫;->ᩳ:[B

    invoke-virtual {p1, v2, v1, v6}, Ll/ᩳ֨֫;->֫(II[B)V

    .line 218
    invoke-virtual {v5, v2}, Ll/ܽ֨֫;->ᩳ(I)V

    const/16 v6, 0x10

    .line 663
    invoke-virtual {v5, v6}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v6

    const/4 v7, 0x3

    .line 664
    invoke-virtual {v5, v7}, Ll/ܽ֨֫;->ܿ(I)V

    const/16 v7, 0xd

    if-nez v6, :cond_2

    .line 666
    invoke-virtual {v5, v7}, Ll/ܽ֨֫;->ܿ(I)V

    goto :goto_1

    .line 668
    :cond_2
    invoke-virtual {v5, v7}, Ll/ܽ֨֫;->ۧ(I)I

    move-result v5

    .line 669
    invoke-static {v4}, Ll/ܺۚۧ;->ۢ(Ll/ܺۚۧ;)Landroid/util/SparseArray;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_3

    .line 670
    invoke-static {v4}, Ll/ܺۚۧ;->ۢ(Ll/ܺۚۧ;)Landroid/util/SparseArray;

    move-result-object v6

    new-instance v7, Ll/ܿۚۧ;

    new-instance v8, Ll/ۡۚۧ;

    invoke-direct {v8, v4, v5}, Ll/ۡۚۧ;-><init>(Ll/ܺۚۧ;I)V

    invoke-direct {v7, v8}, Ll/ܿۚۧ;-><init>(Ll/ᩳۚۧ;)V

    invoke-virtual {v6, v5, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 671
    invoke-static {v4}, Ll/ܺۚۧ;->ܿ(Ll/ܺۚۧ;)I

    move-result v5

    add-int/lit8 v5, v5, 0x1

    invoke-static {v4, v5}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;I)V

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 675
    :cond_4
    invoke-static {v4}, Ll/ܺۚۧ;->ۧ(Ll/ܺۚۧ;)I

    move-result p1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    .line 676
    invoke-static {v4}, Ll/ܺۚۧ;->ۢ(Ll/ܺۚۧ;)Landroid/util/SparseArray;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/util/SparseArray;->remove(I)V

    :cond_5
    :goto_2
    return-void
.end method
