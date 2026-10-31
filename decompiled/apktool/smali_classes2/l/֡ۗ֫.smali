.class public final synthetic Ll/֡ۗ֫;
.super Ljava/lang/Object;
.source "98TD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ljava/io/IOException;

.field public final synthetic ۙ:Ll/ۜۧۧ;

.field public final synthetic ۬:Z

.field public final synthetic ᩶:Ll/ۧۧۧ;

.field public final synthetic ᩸:Ll/᩸ۗ֫;

.field public final synthetic ᩹:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Ll/᩸ۗ֫;Landroid/util/Pair;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֡ۗ֫;->᩸:Ll/᩸ۗ֫;

    iput-object p2, p0, Ll/֡ۗ֫;->᩹:Landroid/util/Pair;

    iput-object p3, p0, Ll/֡ۗ֫;->᩶:Ll/ۧۧۧ;

    iput-object p4, p0, Ll/֡ۗ֫;->ۙ:Ll/ۜۧۧ;

    iput-object p5, p0, Ll/֡ۗ֫;->ۗ:Ljava/io/IOException;

    iput-boolean p6, p0, Ll/֡ۗ֫;->۬:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 632
    iget-object v0, p0, Ll/֡ۗ֫;->᩸:Ll/᩸ۗ֫;

    iget-object v0, v0, Ll/᩸ۗ֫;->᩹:Ll/ۗۗ֫;

    invoke-static {v0}, Ll/ۗۗ֫;->ܽ(Ll/ۗۗ֫;)Ll/᩵۬֫;

    move-result-object v1

    iget-object v0, p0, Ll/֡ۗ֫;->᩹:Landroid/util/Pair;

    iget-object v2, v0, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    .line 633
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v0, v0, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ll/ܺۧۧ;

    .line 632
    iget-object v4, p0, Ll/֡ۗ֫;->᩶:Ll/ۧۧۧ;

    iget-object v5, p0, Ll/֡ۗ֫;->ۙ:Ll/ۜۧۧ;

    iget-object v6, p0, Ll/֡ۗ֫;->ۗ:Ljava/io/IOException;

    iget-boolean v7, p0, Ll/֡ۗ֫;->۬:Z

    invoke-interface/range {v1 .. v7}, Ll/ܶۧۧ;->֫(ILl/ܺۧۧ;Ll/ۧۧۧ;Ll/ۜۧۧ;Ljava/io/IOException;Z)V

    return-void
.end method
