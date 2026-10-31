.class public final Ll/᩺ܰ֫;
.super Ljava/lang/Object;
.source "D8R3"


# instance fields
.field public final ֫:Ll/ܿ۟֫;

.field public final ۧ:Landroid/media/MediaCrypto;

.field public final ܳ:Landroid/view/Surface;

.field public final ܽ:Ll/۠ᩴ֫;

.field public final ܿ:Landroid/media/MediaFormat;

.field public final ᩳ:Ll/ۨܰ֫;


# direct methods
.method public constructor <init>(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/view/Surface;Landroid/media/MediaCrypto;Ll/ۨܰ֫;)V
    .locals 0

    .line 114
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    iput-object p1, p0, Ll/᩺ܰ֫;->֫:Ll/ܿ۟֫;

    .line 116
    iput-object p2, p0, Ll/᩺ܰ֫;->ܿ:Landroid/media/MediaFormat;

    .line 117
    iput-object p3, p0, Ll/᩺ܰ֫;->ܽ:Ll/۠ᩴ֫;

    .line 118
    iput-object p4, p0, Ll/᩺ܰ֫;->ܳ:Landroid/view/Surface;

    .line 119
    iput-object p5, p0, Ll/᩺ܰ֫;->ۧ:Landroid/media/MediaCrypto;

    .line 120
    iput-object p6, p0, Ll/᩺ܰ֫;->ᩳ:Ll/ۨܰ֫;

    return-void
.end method

.method public static ֫(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/media/MediaCrypto;Ll/ۨܰ֫;)Ll/᩺ܰ֫;
    .locals 8

    .line 62
    new-instance v7, Ll/᩺ܰ֫;

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Ll/᩺ܰ֫;-><init>(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/view/Surface;Landroid/media/MediaCrypto;Ll/ۨܰ֫;)V

    return-object v7
.end method

.method public static ֫(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/view/Surface;Landroid/media/MediaCrypto;)Ll/᩺ܰ֫;
    .locals 8

    .line 82
    new-instance v7, Ll/᩺ܰ֫;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v6}, Ll/᩺ܰ֫;-><init>(Ll/ܿ۟֫;Landroid/media/MediaFormat;Ll/۠ᩴ֫;Landroid/view/Surface;Landroid/media/MediaCrypto;Ll/ۨܰ֫;)V

    return-object v7
.end method
