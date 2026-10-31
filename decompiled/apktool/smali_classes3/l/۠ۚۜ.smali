.class public final Ll/۠ۚۜ;
.super Ljava/lang/Object;
.source "B75R"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Landroid/graphics/Bitmap;


# virtual methods
.method public final close()V
    .locals 2

    .line 844
    iget-object v0, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    .line 845
    iput-object v1, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    .line 846
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    .line 847
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method

.method public final take()Landroid/graphics/Bitmap;
    .locals 2

    .line 837
    iget-object v0, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    .line 838
    iput-object v1, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final ֫(Landroid/graphics/Bitmap;)V
    .locals 1

    .line 825
    iget-object v0, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    .line 828
    iput-object p1, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    return-void

    .line 826
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "MPEG-TS preview bitmap is already owned"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 832
    iget-object v0, p0, Ll/۠ۚۜ;->᩸:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
