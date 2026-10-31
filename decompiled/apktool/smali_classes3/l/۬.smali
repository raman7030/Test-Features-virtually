.class public abstract Ll/۬;
.super Ljava/lang/Object;
.source "95XT"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 733
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 734
    new-instance v0, Landroid/os/Binder;

    invoke-direct {v0}, Landroid/os/Binder;-><init>()V

    .line 735
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 736
    new-instance v0, Ll/ۗ;

    invoke-direct {v0, p0}, Ll/ۗ;-><init>(Ll/۬;)V

    return-void

    .line 738
    :cond_0
    new-instance v0, Ll/ۙ;

    invoke-direct {v0, p0}, Ll/ۙ;-><init>(Ll/۬;)V

    return-void
.end method
