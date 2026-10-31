.class public final Ll/ۤۘ;
.super Landroid/content/ContextWrapper;
.source "5504"


# static fields
.field public static final ֫:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static ֫(Landroid/content/Context;)V
    .locals 1

    .line 77
    instance-of v0, p0, Ll/ۤۘ;

    if-nez v0, :cond_0

    .line 78
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    instance-of v0, v0, Ll/ۨۘ;

    if-nez v0, :cond_0

    .line 79
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 84
    sget p0, Ll/۠ᩴ;->֫:I

    :cond_0
    return-void
.end method
