.class public Ll/᩷ܿ֫;
.super Ljava/lang/Object;
.source "S3IR"


# instance fields
.field public ֫:Ljava/nio/ByteBuffer;

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    invoke-static {}, Ll/ۢܿ֫;->֫()V

    return-void
.end method


# virtual methods
.method public final ֫(I)I
    .locals 2

    .line 53
    iget v0, p0, Ll/᩷ܿ֫;->ܽ:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    iget v1, p0, Ll/᩷ܿ֫;->ᩳ:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ljava/nio/ByteBuffer;I)V
    .locals 0

    .line 298
    iput-object p1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    if-eqz p1, :cond_0

    .line 300
    iput p2, p0, Ll/᩷ܿ֫;->ۧ:I

    .line 301
    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    sub-int/2addr p2, p1

    iput p2, p0, Ll/᩷ܿ֫;->ᩳ:I

    .line 302
    iget-object p1, p0, Ll/᩷ܿ֫;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    iput p1, p0, Ll/᩷ܿ֫;->ܽ:I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 304
    iput p1, p0, Ll/᩷ܿ֫;->ۧ:I

    .line 305
    iput p1, p0, Ll/᩷ܿ֫;->ᩳ:I

    .line 306
    iput p1, p0, Ll/᩷ܿ֫;->ܽ:I

    return-void
.end method
