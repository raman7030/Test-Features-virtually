.class public final synthetic Ll/ۗ᩹ܳ;
.super Ljava/lang/Object;
.source "164Z"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Ll/۫᩹ܳ;

.field public final synthetic ᩹:Ll/ܶ᩹ܳ;


# direct methods
.method public synthetic constructor <init>(Ll/۫᩹ܳ;Ll/ܶ᩹ܳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩹ܳ;->᩸:Ll/۫᩹ܳ;

    iput-object p2, p0, Ll/ۗ᩹ܳ;->᩹:Ll/ܶ᩹ܳ;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 0
    iget-object p1, p0, Ll/ۗ᩹ܳ;->᩸:Ll/۫᩹ܳ;

    iget-object v0, p0, Ll/ۗ᩹ܳ;->᩹:Ll/ܶ᩹ܳ;

    invoke-static {p1, v0, p2}, Ll/۫᩹ܳ;->֫(Ll/۫᩹ܳ;Ll/ܶ᩹ܳ;Landroid/view/MotionEvent;)V

    const/4 p1, 0x0

    return p1
.end method
