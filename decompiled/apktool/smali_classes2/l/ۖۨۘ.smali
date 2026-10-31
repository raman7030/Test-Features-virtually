.class public final Ll/ۖۨۘ;
.super Ljava/lang/Object;
.source "F90M"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۘۨۘ;

.field public final synthetic ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ll/ۘۨۘ;Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۨۘ;->᩸:Ll/ۘۨۘ;

    iput-object p2, p0, Ll/ۖۨۘ;->᩹:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 142
    iget-object v0, p0, Ll/ۖۨۘ;->᩸:Ll/ۘۨۘ;

    iget-object v1, p0, Ll/ۖۨۘ;->᩹:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Ll/ۘۨۘ;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
