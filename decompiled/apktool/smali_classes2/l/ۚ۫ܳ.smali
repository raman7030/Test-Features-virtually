.class public final synthetic Ll/ۚ۫ܳ;
.super Ljava/lang/Object;
.source "J4L7"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ᩳۜܳ;

.field public final synthetic ᩸:Landroid/widget/Button;

.field public final synthetic ᩹:Ll/ܽۢܳ;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ۫ܳ;->᩸:Landroid/widget/Button;

    iput-object p2, p0, Ll/ۚ۫ܳ;->᩹:Ll/ܽۢܳ;

    iput-object p3, p0, Ll/ۚ۫ܳ;->᩶:Ll/ᩳۜܳ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 0
    iget-object p1, p0, Ll/ۚ۫ܳ;->᩹:Ll/ܽۢܳ;

    iget-object v0, p0, Ll/ۚ۫ܳ;->᩶:Ll/ᩳۜܳ;

    iget-object v1, p0, Ll/ۚ۫ܳ;->᩸:Landroid/widget/Button;

    invoke-static {v1, p1, v0}, Ll/ۛ۫ܳ;->֫(Landroid/widget/Button;Ll/ܽۢܳ;Ll/ᩳۜܳ;)V

    const/4 p1, 0x1

    return p1
.end method
