.class public abstract Ll/۬᩺;
.super Ljava/lang/Object;
.source "R9NW"


# static fields
.field public static final DISPATCH_MODE_CONTINUE_ON_SUBTREE:I = 0x1

.field public static final DISPATCH_MODE_STOP:I


# instance fields
.field public mDispachedInsets:Landroid/view/WindowInsets;

.field public final mDispatchMode:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 372
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 373
    iput p1, p0, Ll/۬᩺;->mDispatchMode:I

    return-void
.end method


# virtual methods
.method public final getDispatchMode()I
    .locals 1

    .line 397
    iget v0, p0, Ll/۬᩺;->mDispatchMode:I

    return v0
.end method

.method public onEnd(Ll/ܿܰ;)V
    .locals 0

    return-void
.end method

.method public onPrepare(Ll/ܿܰ;)V
    .locals 0

    return-void
.end method

.method public abstract onProgress(Ll/᩸ܰ;Ljava/util/List;)Ll/᩸ܰ;
.end method

.method public onStart(Ll/ܿܰ;Ll/ۗ᩺;)Ll/ۗ᩺;
    .locals 0

    return-object p2
.end method
