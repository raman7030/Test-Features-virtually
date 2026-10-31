.class public abstract Ll/ۢ֫ۧ;
.super Ljava/lang/Object;
.source "U8RB"

# interfaces
.implements Ll/ۘۧۧ;


# instance fields
.field public final ۗ:Ljava/util/ArrayList;

.field public ۙ:Landroid/os/Looper;

.field public ۫:Ll/ۙ᩵֫;

.field public ۬:Ll/ܰ۬֫;

.field public final ᩶:Ll/۠ۧۧ;

.field public final ᩸:Ll/ܶۛ֫;

.field public final ᩹:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/ۢ֫ۧ;->ۗ:Ljava/util/ArrayList;

    .line 53
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Ll/ۢ֫ۧ;->᩹:Ljava/util/HashSet;

    .line 54
    new-instance v0, Ll/۠ۧۧ;

    invoke-direct {v0}, Ll/۠ۧۧ;-><init>()V

    iput-object v0, p0, Ll/ۢ֫ۧ;->᩶:Ll/۠ۧۧ;

    .line 55
    new-instance v0, Ll/ܶۛ֫;

    invoke-direct {v0}, Ll/ܶۛ֫;-><init>()V

    iput-object v0, p0, Ll/ۢ֫ۧ;->᩸:Ll/ܶۛ֫;

    return-void
.end method


# virtual methods
.method public final ֫(ILl/ܺۧۧ;)Ll/ܶۛ֫;
    .locals 1

    .line 170
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {v0, p1, p2}, Ll/ܶۛ֫;->֫(ILl/ܺۧۧ;)Ll/ܶۛ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ܺۧۧ;)Ll/ܶۛ֫;
    .locals 2

    .line 156
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩸:Ll/ܶۛ֫;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/ܶۛ֫;->֫(ILl/ܺۧۧ;)Ll/ܶۛ֫;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Landroid/os/Handler;Ll/ܶۧۧ;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩶:Ll/۠ۧۧ;

    invoke-virtual {v0, p1, p2}, Ll/۠ۧۧ;->֫(Landroid/os/Handler;Ll/ܶۧۧ;)V

    return-void
.end method

.method public final ֫(Landroid/os/Handler;Ll/᩸ۛ֫;)V
    .locals 1

    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {v0, p1, p2}, Ll/ܶۛ֫;->֫(Landroid/os/Handler;Ll/᩸ۛ֫;)V

    return-void
.end method

.method public abstract ֫(Ll/֡ܶ֫;)V
.end method

.method public final ֫(Ll/ۖۧۧ;)V
    .locals 2

    .line 265
    iget-object v0, p0, Ll/ۢ֫ۧ;->ۙ:Landroid/os/Looper;

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩹:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    .line 267
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v1, :cond_0

    .line 269
    invoke-virtual {p0}, Ll/ۢ֫ۧ;->ܳ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۖۧۧ;Ll/֡ܶ֫;Ll/ܰ۬֫;)V
    .locals 2

    .line 247
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    .line 248
    iget-object v1, p0, Ll/ۢ֫ۧ;->ۙ:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Ll/᩺֡֫;->֫(Z)V

    .line 249
    iput-object p3, p0, Ll/ۢ֫ۧ;->۬:Ll/ܰ۬֫;

    .line 250
    iget-object p3, p0, Ll/ۢ֫ۧ;->۫:Ll/ۙ᩵֫;

    .line 251
    iget-object v1, p0, Ll/ۢ֫ۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 252
    iget-object v1, p0, Ll/ۢ֫ۧ;->ۙ:Landroid/os/Looper;

    if-nez v1, :cond_2

    .line 253
    iput-object v0, p0, Ll/ۢ֫ۧ;->ۙ:Landroid/os/Looper;

    .line 254
    iget-object p3, p0, Ll/ۢ֫ۧ;->᩹:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 255
    invoke-virtual {p0, p2}, Ll/ۢ֫ۧ;->֫(Ll/֡ܶ֫;)V

    return-void

    :cond_2
    if-eqz p3, :cond_3

    .line 257
    invoke-virtual {p0, p1}, Ll/ۢ֫ۧ;->֫(Ll/ۖۧۧ;)V

    .line 258
    invoke-interface {p1, p0, p3}, Ll/ۖۧۧ;->֫(Ll/ۢ֫ۧ;Ll/ۙ᩵֫;)V

    :cond_3
    return-void
.end method

.method public final ֫(Ll/ۙ᩵֫;)V
    .locals 2

    .line 88
    iput-object p1, p0, Ll/ۢ֫ۧ;->۫:Ll/ۙ᩵֫;

    .line 89
    iget-object v0, p0, Ll/ۢ֫ۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۧۧ;

    .line 90
    invoke-interface {v1, p0, p1}, Ll/ۖۧۧ;->֫(Ll/ۢ֫ۧ;Ll/ۙ᩵֫;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public synthetic ֫(Ll/ۧ᩵֫;)V
    .locals 0

    return-void
.end method

.method public final ֫(Ll/ܶۧۧ;)V
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩶:Ll/۠ۧۧ;

    invoke-virtual {v0, p1}, Ll/۠ۧۧ;->֫(Ll/ܶۧۧ;)V

    return-void
.end method

.method public final ֫(Ll/᩸ۛ֫;)V
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩸:Ll/ܶۛ֫;

    invoke-virtual {v0, p1}, Ll/ܶۛ֫;->֫(Ll/᩸ۛ֫;)V

    return-void
.end method

.method public final ۜ()Z
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩹:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ(ILl/ܺۧۧ;)Ll/۠ۧۧ;
    .locals 1

    .line 118
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩶:Ll/۠ۧۧ;

    invoke-virtual {v0, p1, p2}, Ll/۠ۧۧ;->֫(ILl/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ܺۧۧ;)Ll/۠ۧۧ;
    .locals 2

    .line 104
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩶:Ll/۠ۧۧ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Ll/۠ۧۧ;->֫(ILl/ܺۧۧ;)Ll/۠ۧۧ;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ(Ll/ۖۧۧ;)V
    .locals 1

    .line 286
    iget-object v0, p0, Ll/ۢ֫ۧ;->ۗ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 287
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    .line 288
    iput-object p1, p0, Ll/ۢ֫ۧ;->ۙ:Landroid/os/Looper;

    .line 289
    iput-object p1, p0, Ll/ۢ֫ۧ;->۫:Ll/ۙ᩵֫;

    .line 290
    iput-object p1, p0, Ll/ۢ֫ۧ;->۬:Ll/ܰ۬֫;

    .line 291
    iget-object p1, p0, Ll/ۢ֫ۧ;->᩹:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    .line 292
    invoke-virtual {p0}, Ll/ۢ֫ۧ;->᩷()V

    return-void

    .line 294
    :cond_0
    invoke-virtual {p0, p1}, Ll/ۢ֫ۧ;->ܽ(Ll/ۖۧۧ;)V

    return-void
.end method

.method public ܳ()V
    .locals 0

    return-void
.end method

.method public final ܽ(Ll/ۖۧۧ;)V
    .locals 2

    .line 276
    iget-object v0, p0, Ll/ۢ֫ۧ;->᩹:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v1

    .line 277
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-nez v1, :cond_0

    .line 278
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 279
    invoke-virtual {p0}, Ll/ۢ֫ۧ;->ܿ()V

    :cond_0
    return-void
.end method

.method public synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ܿ()V
    .locals 0

    return-void
.end method

.method public synthetic ᩳ()Ll/ۙ᩵֫;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public abstract ᩷()V
.end method

.method public final ᩻()Ll/ܰ۬֫;
    .locals 1

    .line 185
    iget-object v0, p0, Ll/ۢ֫ۧ;->۬:Ll/ܰ۬֫;

    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Ljava/lang/Object;)V

    return-object v0
.end method
