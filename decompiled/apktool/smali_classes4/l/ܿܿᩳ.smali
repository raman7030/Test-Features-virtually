.class public final Ll/ܿܿᩳ;
.super Ljava/lang/Object;
.source "FB7W"


# instance fields
.field public final ֫:Ljava/nio/ByteBuffer;

.field public final ۧ:Ljava/nio/ByteBuffer;

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;II)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput-object p1, p0, Ll/ܿܿᩳ;->֫:Ljava/nio/ByteBuffer;

    .line 38
    iput-object p2, p0, Ll/ܿܿᩳ;->ۧ:Ljava/nio/ByteBuffer;

    .line 39
    iput p3, p0, Ll/ܿܿᩳ;->ܽ:I

    .line 41
    iput p4, p0, Ll/ܿܿᩳ;->ᩳ:I

    return-void
.end method


# virtual methods
.method public final ֫()Ll/᩷ܿᩳ;
    .locals 2

    .line 87
    new-instance v0, Ll/᩷ܿᩳ;

    .line 80
    iget-object v1, p0, Ll/ܿܿᩳ;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 87
    invoke-direct {v0, v1}, Ll/᩷ܿᩳ;-><init>(Ljava/nio/ByteBuffer;)V

    return-object v0
.end method

.method public final ۧ()Ljava/nio/ByteBuffer;
    .locals 1

    .line 73
    iget-object v0, p0, Ll/ܿܿᩳ;->֫:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/nio/ByteBuffer;
    .locals 1

    .line 80
    iget-object v0, p0, Ll/ܿܿᩳ;->ۧ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()I
    .locals 1

    .line 66
    iget v0, p0, Ll/ܿܿᩳ;->ᩳ:I

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 49
    iget v0, p0, Ll/ܿܿᩳ;->ܽ:I

    return v0
.end method
