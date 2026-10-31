.class public final synthetic Ll/᩵ۗ֫;
.super Ljava/lang/Object;
.source "98TD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩸ۗ֫;

.field public final synthetic ᩹:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۗ֫;Landroid/util/Pair;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۗ֫;->᩸:Ll/᩸ۗ֫;

    iput-object p2, p0, Ll/᩵ۗ֫;->᩹:Landroid/util/Pair;

    iput p3, p0, Ll/᩵ۗ֫;->᩶:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 687
    iget-object v0, p0, Ll/᩵ۗ֫;->᩸:Ll/᩸ۗ֫;

    iget-object v0, v0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {v0}, Ll/ۗۗ֫;->ܽ(Ll/ۗۗ֫;)Ll/᩵۬֫;

    move-result-object v0

    iget-object v1, p0, Ll/᩵ۗ֫;->᩹:Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    .line 688
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ll/ܺۧۧ;

    .line 687
    iget v3, p0, Ll/᩵ۗ֫;->᩶:I

    invoke-interface {v0, v2, v1, v3}, Ll/᩸ۛ֫;->֫(ILl/ܺۧۧ;I)V

    return-void
.end method
