.class public final synthetic Ll/᩺֡ܳ;
.super Ljava/lang/Object;
.source "698T"

# interfaces
.implements Ll/۟ۜܳ;
.implements Ll/ۙ۫ۡ;


# instance fields
.field public final synthetic ۙ:Ljava/lang/Object;

.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:Ljava/lang/Object;

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺֡ܳ;->᩸:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩺֡ܳ;->᩹:Ljava/lang/Object;

    iput-object p3, p0, Ll/᩺֡ܳ;->᩶:Ljava/lang/Object;

    iput-object p4, p0, Ll/᩺֡ܳ;->ۙ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ֫()Landroid/graphics/Bitmap;
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩺֡ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/ᩳۜ᩻;

    iget-object v1, p0, Ll/᩺֡ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ᩳۜܳ;

    iget-object v2, p0, Ll/᩺֡ܳ;->᩶:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Ll/᩺֡ܳ;->ۙ:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v0, v1, v2, v3}, Ll/ᩳۜ᩻;->֫(Ll/ᩳۜ᩻;Ll/ᩳۜܳ;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/atomic/AtomicReference;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/ۤۢܳ;)V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩺֡ܳ;->᩸:Ljava/lang/Object;

    check-cast v0, Ll/۟֡ܳ;

    iget-object v1, p0, Ll/᩺֡ܳ;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/ۤۢܳ;

    iget-object v2, p0, Ll/᩺֡ܳ;->᩶:Ljava/lang/Object;

    check-cast v2, Ll/ۖۢܳ;

    iget-object v3, p0, Ll/᩺֡ܳ;->ۙ:Ljava/lang/Object;

    check-cast v3, Ll/ܽۢܳ;

    invoke-static {v0, v1, v2, v3, p1}, Ll/۟֡ܳ;->֫(Ll/۟֡ܳ;Ll/ۤۢܳ;Ll/ۖۢܳ;Ll/ܽۢܳ;Ll/ۤۢܳ;)V

    return-void
.end method
