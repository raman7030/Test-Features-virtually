.class public final Ll/֡ܳ֫;
.super Ljava/lang/Object;
.source "RB93"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/graphics/Rect;

.field public final synthetic ᩹:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/ܺ᩷֫;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 561
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/֡ܳ֫;->᩹:Landroid/view/View;

    iput-object p3, p0, Ll/֡ܳ֫;->᩸:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 564
    iget-object v0, p0, Ll/֡ܳ֫;->᩹:Landroid/view/View;

    iget-object v1, p0, Ll/֡ܳ֫;->᩸:Landroid/graphics/Rect;

    invoke-static {v1, v0}, Ll/ܺ᩷֫;->֫(Landroid/graphics/Rect;Landroid/view/View;)V

    return-void
.end method
