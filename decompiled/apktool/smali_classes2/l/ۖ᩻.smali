.class public final Ll/ۖ᩻;
.super Ljava/lang/Object;
.source "I9N6"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/۠᩻;


# direct methods
.method public constructor <init>(Ll/۠᩻;)V
    .locals 0

    .line 466
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩻;->᩸:Ll/۠᩻;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    const/4 v0, 0x1

    .line 469
    iget-object v1, p0, Ll/ۖ᩻;->᩸:Ll/۠᩻;

    invoke-virtual {v1, v0}, Ll/᩵᩻;->֫(Z)V

    .line 470
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->invalidateSelf()V

    return-void
.end method
