.class public final synthetic Ll/ۧ۠ᩳ;
.super Ljava/lang/Object;
.source "3B3L"

# interfaces
.implements Ll/۠ۜ᩵;


# instance fields
.field public final synthetic ۗ:Landroid/graphics/Point;

.field public final synthetic ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic ۬:Landroid/graphics/Point;

.field public final synthetic ᩶:Z

.field public final synthetic ᩸:Ll/᩹ܶᩳ;

.field public final synthetic ᩹:Ll/۫ۨᩳ;


# direct methods
.method public synthetic constructor <init>(Ll/᩹ܶᩳ;Ll/۫ۨᩳ;ZLjava/util/concurrent/atomic/AtomicBoolean;Landroid/graphics/Point;Landroid/graphics/Point;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iput-object p2, p0, Ll/ۧ۠ᩳ;->᩹:Ll/۫ۨᩳ;

    iput-boolean p3, p0, Ll/ۧ۠ᩳ;->᩶:Z

    iput-object p4, p0, Ll/ۧ۠ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p5, p0, Ll/ۧ۠ᩳ;->ۗ:Landroid/graphics/Point;

    iput-object p6, p0, Ll/ۧ۠ᩳ;->۬:Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 8

    .line 0
    iget-object v5, p0, Ll/ۧ۠ᩳ;->۬:Landroid/graphics/Point;

    move-object v6, p1

    check-cast v6, Ll/ۨ᩵ᩳ;

    iget-object v0, p0, Ll/ۧ۠ᩳ;->᩸:Ll/᩹ܶᩳ;

    iget-object v1, p0, Ll/ۧ۠ᩳ;->᩹:Ll/۫ۨᩳ;

    iget-boolean v2, p0, Ll/ۧ۠ᩳ;->᩶:Z

    iget-object v3, p0, Ll/ۧ۠ᩳ;->ۙ:Ljava/util/concurrent/atomic/AtomicBoolean;

    iget-object v4, p0, Ll/ۧ۠ᩳ;->ۗ:Landroid/graphics/Point;

    move-object v7, p2

    invoke-static/range {v0 .. v7}, Ll/᩹ܶᩳ;->֫(Ll/᩹ܶᩳ;Ll/۫ۨᩳ;ZLjava/util/concurrent/atomic/AtomicBoolean;Landroid/graphics/Point;Landroid/graphics/Point;Ll/ۨ᩵ᩳ;Ljava/lang/Throwable;)V

    return-void
.end method
