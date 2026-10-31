.class public final Ll/᩹ۧ;
.super Ljava/lang/Object;
.source "C9BS"


# static fields
.field public static final ֫:Ll/᩹ۧ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 2
    new-instance v0, Ll/᩹ۧ;

    .line 99
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 0
    sput-object v0, Ll/᩹ۧ;->֫:Ll/᩹ۧ;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/window/BackEvent;)F
    .locals 1

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    invoke-virtual {p1}, Landroid/window/BackEvent;->getProgress()F

    move-result p1

    return p1
.end method

.method public final ֫(FFFI)Landroid/window/BackEvent;
    .locals 1

    .line 103
    new-instance v0, Landroid/window/BackEvent;

    invoke-direct {v0, p1, p2, p3, p4}, Landroid/window/BackEvent;-><init>(FFFI)V

    return-object v0
.end method

.method public final ۧ(Landroid/window/BackEvent;)I
    .locals 1

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    invoke-virtual {p1}, Landroid/window/BackEvent;->getSwipeEdge()I

    move-result p1

    return p1
.end method

.method public final ܽ(Landroid/window/BackEvent;)F
    .locals 1

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    invoke-virtual {p1}, Landroid/window/BackEvent;->getTouchX()F

    move-result p1

    return p1
.end method

.method public final ᩳ(Landroid/window/BackEvent;)F
    .locals 1

    const-string v0, "backEvent"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    invoke-virtual {p1}, Landroid/window/BackEvent;->getTouchY()F

    move-result p1

    return p1
.end method
