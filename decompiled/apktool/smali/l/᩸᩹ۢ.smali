.class public final synthetic Ll/᩸᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Landroid/content/Intent;

.field public final synthetic ۙ:Ll/ܶ᩵ܿ;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/ۤ᩹ۢ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۤ᩹ۢ;IZLl/ܶ᩵ܿ;Landroid/content/Intent;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    iput p2, p0, Ll/᩸᩹ۢ;->᩹:I

    iput-boolean p3, p0, Ll/᩸᩹ۢ;->᩶:Z

    iput-object p4, p0, Ll/᩸᩹ۢ;->ۙ:Ll/ܶ᩵ܿ;

    iput-object p5, p0, Ll/᩸᩹ۢ;->ۗ:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 0
    iget-object v0, p0, Ll/᩸᩹ۢ;->ۙ:Ll/ܶ᩵ܿ;

    iget-object v1, p0, Ll/᩸᩹ۢ;->ۗ:Landroid/content/Intent;

    iget-object v2, p0, Ll/᩸᩹ۢ;->᩸:Ll/ۤ᩹ۢ;

    iget v3, p0, Ll/᩸᩹ۢ;->᩹:I

    iget-boolean v4, p0, Ll/᩸᩹ۢ;->᩶:Z

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۤ᩹ۢ;->֫(Ll/ۤ᩹ۢ;IZLl/ܶ᩵ܿ;Landroid/content/Intent;)V

    return-void
.end method
