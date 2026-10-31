.class public final Ll/ۢ᩸ۜ;
.super Ljava/lang/Object;
.source "H74N"


# static fields
.field public static final ܽ:Ll/ۢ᩸ۜ;

.field public static final ᩳ:Ll/ۢ᩸ۜ;


# instance fields
.field public final ֫:Landroid/graphics/Bitmap;

.field public final ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 50
    new-instance v0, Ll/ۢ᩸ۜ;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ll/ۢ᩸ۜ;-><init>(Landroid/graphics/Bitmap;Z)V

    sput-object v0, Ll/ۢ᩸ۜ;->ܽ:Ll/ۢ᩸ۜ;

    .line 51
    new-instance v0, Ll/ۢ᩸ۜ;

    const/4 v1, 0x1

    invoke-direct {v0, v2, v1}, Ll/ۢ᩸ۜ;-><init>(Landroid/graphics/Bitmap;Z)V

    sput-object v0, Ll/ۢ᩸ۜ;->ᩳ:Ll/ۢ᩸ۜ;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-direct {p0, p1, v0}, Ll/ۢ᩸ۜ;-><init>(Landroid/graphics/Bitmap;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Z)V
    .locals 0

    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    iput-object p1, p0, Ll/ۢ᩸ۜ;->֫:Landroid/graphics/Bitmap;

    .line 58
    iput-boolean p2, p0, Ll/ۢ᩸ۜ;->ۧ:Z

    return-void
.end method

.method public static bridge synthetic ܽ()Ll/ۢ᩸ۜ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۢ᩸ۜ;->ܽ:Ll/ۢ᩸ۜ;

    return-object v0
.end method

.method public static bridge synthetic ᩳ()Ll/ۢ᩸ۜ;
    .locals 1

    .line 0
    sget-object v0, Ll/ۢ᩸ۜ;->ᩳ:Ll/ۢ᩸ۜ;

    return-object v0
.end method


# virtual methods
.method public final ֫()Landroid/graphics/Bitmap;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/ۢ᩸ۜ;->֫:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final ۧ()Z
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۢ᩸ۜ;->֫:Landroid/graphics/Bitmap;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۢ᩸ۜ;->ۧ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
