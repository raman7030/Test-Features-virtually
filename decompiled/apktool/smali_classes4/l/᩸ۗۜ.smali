.class public final synthetic Ll/᩸ۗۜ;
.super Ljava/lang/Object;
.source "M799"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Landroid/graphics/Bitmap;

.field public final synthetic ᩶:Ll/ۛۗۜ;

.field public final synthetic ᩸:Ll/᩺ۗۜ;

.field public final synthetic ᩹:Ll/ۨۗۜ;


# direct methods
.method public synthetic constructor <init>(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;Landroid/graphics/Bitmap;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۗۜ;->᩸:Ll/᩺ۗۜ;

    iput-object p2, p0, Ll/᩸ۗۜ;->᩹:Ll/ۨۗۜ;

    iput-object p3, p0, Ll/᩸ۗۜ;->᩶:Ll/ۛۗۜ;

    iput-object p4, p0, Ll/᩸ۗۜ;->ۙ:Landroid/graphics/Bitmap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 0
    iget-object v0, p0, Ll/᩸ۗۜ;->᩶:Ll/ۛۗۜ;

    iget-object v1, p0, Ll/᩸ۗۜ;->ۙ:Landroid/graphics/Bitmap;

    iget-object v2, p0, Ll/᩸ۗۜ;->᩸:Ll/᩺ۗۜ;

    iget-object v3, p0, Ll/᩸ۗۜ;->᩹:Ll/ۨۗۜ;

    invoke-static {v2, v3, v0, v1}, Ll/᩺ۗۜ;->֫(Ll/᩺ۗۜ;Ll/ۨۗۜ;Ll/ۛۗۜ;Landroid/graphics/Bitmap;)V

    return-void
.end method
