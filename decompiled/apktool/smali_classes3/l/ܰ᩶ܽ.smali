.class public final synthetic Ll/ܰ᩶ܽ;
.super Ljava/lang/Object;
.source "28VT"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Landroid/widget/TextView;

.field public final synthetic ۙ:Landroid/widget/TextView;

.field public final synthetic ۬:Landroid/widget/TextView;

.field public final synthetic ᩶:Landroid/widget/TextView;

.field public final synthetic ᩸:Ll/֨۫ܽ;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ll/֨۫ܽ;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩶ܽ;->᩸:Ll/֨۫ܽ;

    iput-object p2, p0, Ll/ܰ᩶ܽ;->᩹:Landroid/widget/TextView;

    iput-object p3, p0, Ll/ܰ᩶ܽ;->᩶:Landroid/widget/TextView;

    iput-object p4, p0, Ll/ܰ᩶ܽ;->ۙ:Landroid/widget/TextView;

    iput-object p5, p0, Ll/ܰ᩶ܽ;->ۗ:Landroid/widget/TextView;

    iput-object p6, p0, Ll/ܰ᩶ܽ;->۬:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 2
    sget v0, Ll/᩹ۙܽ;->᩵ۧ:I

    .line 709
    iget-object v1, p0, Ll/ܰ᩶ܽ;->᩸:Ll/֨۫ܽ;

    iget-object v2, p0, Ll/ܰ᩶ܽ;->᩹:Landroid/widget/TextView;

    iget-object v3, p0, Ll/ܰ᩶ܽ;->᩶:Landroid/widget/TextView;

    iget-object v4, p0, Ll/ܰ᩶ܽ;->ۙ:Landroid/widget/TextView;

    iget-object v5, p0, Ll/ܰ᩶ܽ;->ۗ:Landroid/widget/TextView;

    iget-object v6, p0, Ll/ܰ᩶ܽ;->۬:Landroid/widget/TextView;

    invoke-virtual/range {v1 .. v6}, Ll/֨۫ܽ;->֫(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    return-void
.end method
