.class public final synthetic Ll/۫᩹ۜ;
.super Ljava/lang/Object;
.source "K5ZN"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Landroid/widget/ImageView;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Landroid/widget/ImageView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫᩹ۜ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/۫᩹ۜ;->᩹:Landroid/widget/ImageView;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 359
    invoke-static {}, Ll/ᩳ᩹ۜ;->ۡ()I

    move-result p1

    .line 360
    new-instance v0, Ll/ۗۖ;

    iget-object v1, p0, Ll/۫᩹ۜ;->᩸:Ll/ۗܺ᩷;

    invoke-direct {v0, v1}, Ll/ۗۖ;-><init>(Landroid/content/Context;)V

    .line 361
    invoke-static {p1}, Ll/ᩳ᩹ۜ;->ܿ(I)I

    move-result p1

    iget-object v1, p0, Ll/۫᩹ۜ;->᩹:Landroid/widget/ImageView;

    invoke-virtual {v0, p1, v1}, Ll/ۗۖ;->֫(ILandroid/view/View;)V

    .line 38
    new-instance p1, Ll/᩺ۤᩳ;

    const/4 v1, 0x2

    invoke-direct {p1, v1, v0}, Ll/᩺ۤᩳ;-><init>(ILjava/lang/Object;)V

    const/16 v0, 0x5dc

    int-to-long v0, v0

    invoke-static {p1, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    const/4 p1, 0x1

    return p1
.end method
