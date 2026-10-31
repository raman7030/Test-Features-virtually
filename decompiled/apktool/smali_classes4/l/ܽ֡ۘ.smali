.class public abstract Ll/ܽ֡ۘ;
.super Ljava/lang/Object;
.source "21VS"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public ᩶:Landroid/view/animation/Interpolator;

.field public ᩸:F

.field public ᩹:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 38
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Ll/ܽ֡ۘ;->᩶:Landroid/view/animation/Interpolator;

    const/4 v0, 0x0

    .line 61
    iput-boolean v0, p0, Ll/ܽ֡ۘ;->᩹:Z

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 38
    invoke-virtual {p0}, Ll/ܽ֡ۘ;->clone()Ll/ܽ֡ۘ;

    move-result-object v0

    return-object v0
.end method

.method public abstract clone()Ll/ܽ֡ۘ;
.end method

.method public final ֫()Landroid/view/animation/Interpolator;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ܽ֡ۘ;->᩶:Landroid/view/animation/Interpolator;

    return-object v0
.end method

.method public final ֫(Landroid/view/animation/Interpolator;)V
    .locals 0

    .line 221
    iput-object p1, p0, Ll/ܽ֡ۘ;->᩶:Landroid/view/animation/Interpolator;

    return-void
.end method

.method public abstract ֫(Ljava/lang/Object;)V
.end method

.method public abstract ܽ()Ljava/lang/Float;
.end method
