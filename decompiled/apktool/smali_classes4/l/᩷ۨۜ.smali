.class public final synthetic Ll/᩷ۨۜ;
.super Ljava/lang/Object;
.source "46LQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Z

.field public final synthetic ᩶:Landroid/graphics/Bitmap;

.field public final synthetic ᩸:Ll/ۚۨۜ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/ۚۨۜ;ILandroid/graphics/Bitmap;IZ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩷ۨۜ;->᩸:Ll/ۚۨۜ;

    iput p2, p0, Ll/᩷ۨۜ;->᩹:I

    iput-object p3, p0, Ll/᩷ۨۜ;->᩶:Landroid/graphics/Bitmap;

    iput-boolean p5, p0, Ll/᩷ۨۜ;->ۙ:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩷ۨۜ;->᩶:Landroid/graphics/Bitmap;

    iget-boolean v1, p0, Ll/᩷ۨۜ;->ۙ:Z

    iget-object v2, p0, Ll/᩷ۨۜ;->᩸:Ll/ۚۨۜ;

    iget v3, p0, Ll/᩷ۨۜ;->᩹:I

    invoke-static {v2, v3, v0, v1}, Ll/ۚۨۜ;->֫(Ll/ۚۨۜ;ILandroid/graphics/Bitmap;Z)V

    return-void
.end method
