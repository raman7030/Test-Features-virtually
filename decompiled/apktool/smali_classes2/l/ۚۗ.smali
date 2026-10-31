.class public final Ll/ۚۗ;
.super Ljava/lang/Object;
.source "Z4TG"


# instance fields
.field public final ֫:Landroid/content/res/Configuration;

.field public final ۧ:I

.field public final ܽ:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 357
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 358
    iput-object p1, p0, Ll/ۚۗ;->ܽ:Landroid/content/res/ColorStateList;

    .line 359
    iput-object p2, p0, Ll/ۚۗ;->֫:Landroid/content/res/Configuration;

    if-nez p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    .line 360
    :cond_0
    invoke-virtual {p3}, Landroid/content/res/Resources$Theme;->hashCode()I

    move-result p1

    :goto_0
    iput p1, p0, Ll/ۚۗ;->ۧ:I

    return-void
.end method
