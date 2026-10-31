.class public final synthetic Ll/ᩳ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ۗ:Ljava/lang/Runnable;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۬:Ll/֫᩶ܳ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/ܽ᩶ܳ;

.field public final synthetic ᩹:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Ll/ܽ᩶ܳ;Ljava/lang/Runnable;Ll/֡ۚۢ;Ljava/lang/String;Ljava/lang/Runnable;Ll/֫᩶ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩳ᩹ܳ;->᩸:Ll/ܽ᩶ܳ;

    iput-object p2, p0, Ll/ᩳ᩹ܳ;->᩹:Ljava/lang/Runnable;

    iput-object p3, p0, Ll/ᩳ᩹ܳ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/ᩳ᩹ܳ;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/ᩳ᩹ܳ;->ۗ:Ljava/lang/Runnable;

    iput-object p6, p0, Ll/ᩳ᩹ܳ;->۬:Ll/֫᩶ܳ;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 7

    .line 0
    iget-object v4, p0, Ll/ᩳ᩹ܳ;->ۗ:Ljava/lang/Runnable;

    iget-object v5, p0, Ll/ᩳ᩹ܳ;->۬:Ll/֫᩶ܳ;

    iget-object v0, p0, Ll/ᩳ᩹ܳ;->᩸:Ll/ܽ᩶ܳ;

    iget-object v1, p0, Ll/ᩳ᩹ܳ;->᩹:Ljava/lang/Runnable;

    iget-object v2, p0, Ll/ᩳ᩹ܳ;->᩶:Ll/֡ۚۢ;

    iget-object v3, p0, Ll/ᩳ᩹ܳ;->ۙ:Ljava/lang/String;

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Ll/ܽ᩶ܳ;->֫(Ll/ܽ᩶ܳ;Ljava/lang/Runnable;Ll/֡ۚۢ;Ljava/lang/String;Ljava/lang/Runnable;Ll/֫᩶ܳ;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
