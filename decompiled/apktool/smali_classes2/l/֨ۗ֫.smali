.class public final synthetic Ll/֨ۗ֫;
.super Ljava/lang/Object;
.source "98TD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ll/ۜۧۧ;

.field public final synthetic ᩶:Ll/ۧۧۧ;

.field public final synthetic ᩸:Ll/᩸ۗ֫;

.field public final synthetic ᩹:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۧۧۧ;Ll/ۜۧۧ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨ۗ֫;->᩸:Ll/᩸ۗ֫;

    iput-object p2, p0, Ll/֨ۗ֫;->᩹:Landroid/util/Pair;

    iput-object p3, p0, Ll/֨ۗ֫;->᩶:Ll/ۧۧۧ;

    iput-object p4, p0, Ll/֨ۗ֫;->ۙ:Ll/ۜۧۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 596
    iget-object v0, p0, Ll/֨ۗ֫;->᩸:Ll/᩸ۗ֫;

    iget-object v0, v0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {v0}, Ll/ۗۗ֫;->ܽ(Ll/ۗۗ֫;)Ll/᩵۬֫;

    move-result-object v0

    iget-object v1, p0, Ll/֨ۗ֫;->᩹:Landroid/util/Pair;

    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    .line 597
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ll/ܺۧۧ;

    .line 596
    iget-object v3, p0, Ll/֨ۗ֫;->᩶:Ll/ۧۧۧ;

    iget-object v4, p0, Ll/֨ۗ֫;->ۙ:Ll/ۜۧۧ;

    invoke-interface {v0, v2, v1, v3, v4}, Ll/ܶۧۧ;->ۧ(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;)V

    return-void
.end method
