.class public final synthetic Ll/ۨۡۡ;
.super Ljava/lang/Object;
.source "53XL"

# interfaces
.implements Ll/۬۠ۜ;


# instance fields
.field public final synthetic ֫:Ll/ᩳܺۡ;

.field public final synthetic ۧ:Landroid/graphics/BitmapFactory$Options;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳܺۡ;Landroid/graphics/BitmapFactory$Options;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۡۡ;->֫:Ll/ᩳܺۡ;

    iput-object p2, p0, Ll/ۨۡۡ;->ۧ:Landroid/graphics/BitmapFactory$Options;

    return-void
.end method


# virtual methods
.method public final read()Landroid/graphics/BitmapFactory$Options;
    .locals 3

    const/4 v0, 0x1

    .line 73
    iget-object v1, p0, Ll/ۨۡۡ;->֫:Ll/ᩳܺۡ;

    invoke-virtual {v1, v0}, Ll/ᩳܺۡ;->֫(Z)Ljava/io/InputStream;

    move-result-object v0

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ۨۡۡ;->ۧ:Landroid/graphics/BitmapFactory$Options;

    invoke-static {v0, v1, v2}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    return-object v2
.end method
