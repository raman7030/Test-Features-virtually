.class public final synthetic Ll/ۗܰۜ;
.super Ljava/lang/Object;
.source "I6M7"

# interfaces
.implements Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;


# instance fields
.field public final synthetic ֫:I

.field public final synthetic ۧ:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ll/ۗܰۜ;->֫:I

    iput p2, p0, Ll/ۗܰۜ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final onHeaderDecoded(Landroid/graphics/ImageDecoder;Landroid/graphics/ImageDecoder$ImageInfo;Landroid/graphics/ImageDecoder$Source;)V
    .locals 0

    .line 0
    iget p2, p0, Ll/ۗܰۜ;->֫:I

    iget p3, p0, Ll/ۗܰۜ;->ۧ:I

    invoke-static {p2, p3, p1}, Ll/ۤܰۜ;->֫(IILandroid/graphics/ImageDecoder;)V

    return-void
.end method
