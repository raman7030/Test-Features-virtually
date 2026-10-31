.class public final Ll/۫ܰ;
.super Ljava/lang/Object;
.source "XAMH"


# instance fields
.field public final ֫:Ll/۬ܰ;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 122
    new-instance v0, Ll/ۖۨ;

    invoke-direct {v0, p2}, Ll/ۖۨ;-><init>(Landroid/view/View;)V

    .line 124
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_0

    .line 125
    new-instance p2, Ll/ۗܰ;

    invoke-direct {p2, p1, v0}, Ll/ۗܰ;-><init>(Landroid/view/Window;Ll/ۖۨ;)V

    iput-object p2, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    return-void

    :cond_0
    const/16 v1, 0x1a

    if-lt p2, v1, :cond_1

    .line 127
    new-instance p2, Ll/ۙܰ;

    .line 566
    invoke-direct {p2, p1, v0}, Ll/᩹ܰ;-><init>(Landroid/view/Window;Ll/ۖۨ;)V

    .line 127
    iput-object p2, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    return-void

    :cond_1
    const/16 v1, 0x17

    if-lt p2, v1, :cond_2

    .line 129
    new-instance p2, Ll/᩶ܰ;

    .line 566
    invoke-direct {p2, p1, v0}, Ll/᩹ܰ;-><init>(Landroid/view/Window;Ll/ۖۨ;)V

    .line 129
    iput-object p2, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    return-void

    .line 131
    :cond_2
    new-instance p2, Ll/᩹ܰ;

    invoke-direct {p2, p1, v0}, Ll/᩹ܰ;-><init>(Landroid/view/Window;Ll/ۖۨ;)V

    iput-object p2, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    new-instance v0, Ll/ۗܰ;

    new-instance v1, Ll/ۖۨ;

    invoke-direct {v1, p1}, Ll/ۖۨ;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, v1}, Ll/ۗܰ;-><init>(Landroid/view/WindowInsetsController;Ll/ۖۨ;)V

    iput-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    return-void
.end method

.method public static ֫(Landroid/view/WindowInsetsController;)Ll/۫ܰ;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 151
    new-instance v0, Ll/۫ܰ;

    invoke-direct {v0, p0}, Ll/۫ܰ;-><init>(Landroid/view/WindowInsetsController;)V

    return-object v0
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    .line 189
    iget-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    invoke-virtual {v0, p1}, Ll/۬ܰ;->֫(I)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 257
    iget-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    invoke-virtual {v0, p1}, Ll/۬ܰ;->֫(Z)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 208
    iget-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    invoke-virtual {v0}, Ll/۬ܰ;->֫()Z

    move-result v0

    return v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 310
    iget-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    invoke-virtual {v0, p1}, Ll/۬ܰ;->ۧ(I)V

    return-void
.end method

.method public final ۧ(Z)V
    .locals 1

    .line 223
    iget-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    invoke-virtual {v0, p1}, Ll/۬ܰ;->ۧ(Z)V

    return-void
.end method

.method public final ܽ(I)V
    .locals 1

    .line 175
    iget-object v0, p0, Ll/۫ܰ;->֫:Ll/۬ܰ;

    invoke-virtual {v0, p1}, Ll/۬ܰ;->ܽ(I)V

    return-void
.end method
