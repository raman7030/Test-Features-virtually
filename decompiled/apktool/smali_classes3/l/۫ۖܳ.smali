.class public final synthetic Ll/۫ۖܳ;
.super Ljava/lang/Object;
.source "J26J"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Ll/ۢۘܳ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۢۘܳ;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۫ۖܳ;->᩸:Ll/ۢۘܳ;

    iput p2, p0, Ll/۫ۖܳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    .line 0
    iget-object v0, p0, Ll/۫ۖܳ;->᩸:Ll/ۢۘܳ;

    iget v1, p0, Ll/۫ۖܳ;->᩹:I

    invoke-static {v0, v1, p1, p2}, Ll/ۢۘܳ;->֫(Ll/ۢۘܳ;ILandroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
