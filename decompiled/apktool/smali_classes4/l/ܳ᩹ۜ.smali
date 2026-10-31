.class public final synthetic Ll/ܳ᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Ll/۬ۤ;


# instance fields
.field public final synthetic ֫:Ll/᩷᩶ۜ;

.field public final synthetic ۧ:Z

.field public final synthetic ܽ:Ll/ܿ᩸;

.field public final synthetic ܿ:Ll/ۗܺ᩷;

.field public final synthetic ᩳ:Ll/֡ۚۢ;


# direct methods
.method public synthetic constructor <init>(Ll/᩷᩶ۜ;ZLl/ܿ᩸;Ll/֡ۚۢ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܳ᩹ۜ;->֫:Ll/᩷᩶ۜ;

    iput-boolean p2, p0, Ll/ܳ᩹ۜ;->ۧ:Z

    iput-object p3, p0, Ll/ܳ᩹ۜ;->ܽ:Ll/ܿ᩸;

    iput-object p4, p0, Ll/ܳ᩹ۜ;->ᩳ:Ll/֡ۚۢ;

    iput-object p5, p0, Ll/ܳ᩹ۜ;->ܿ:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 4

    .line 2
    check-cast p1, Landroid/content/res/Configuration;

    .line 249
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result p1

    iget-boolean v0, p0, Ll/ܳ᩹ۜ;->ۧ:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 253
    :cond_0
    new-instance p1, Ll/᩸᩹ۜ;

    iget-object v1, p0, Ll/ܳ᩹ۜ;->֫:Ll/᩷᩶ۜ;

    iget-object v2, p0, Ll/ܳ᩹ۜ;->ᩳ:Ll/֡ۚۢ;

    iget-object v3, p0, Ll/ܳ᩹ۜ;->ܿ:Ll/ۗܺ᩷;

    invoke-direct {p1, v1, v2, v0, v3}, Ll/᩸᩹ۜ;-><init>(Ll/᩷᩶ۜ;Ll/֡ۚۢ;ZLl/ۗܺ᩷;)V

    iget-object v0, p0, Ll/ܳ᩹ۜ;->ܽ:Ll/ܿ᩸;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
