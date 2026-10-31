.class public final Ll/ۨۗۘ;
.super Ll/᩺ۗۘ;
.source "G90S"


# instance fields
.field public final synthetic ᩸:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 0

    .line 429
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 370
    iput-object p1, p0, Ll/ۨۗۘ;->᩸:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 373
    iget-object p1, p0, Ll/ۨۗۘ;->᩸:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
