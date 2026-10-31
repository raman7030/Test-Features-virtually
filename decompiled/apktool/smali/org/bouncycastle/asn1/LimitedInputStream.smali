.class public abstract Lorg/bouncycastle/asn1/LimitedInputStream;
.super Ljava/io/InputStream;

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final _in:Ljava/io/InputStream;

.field public _limit:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/LimitedInputStream;->_in:Ljava/io/InputStream;

    iput p2, p0, Lorg/bouncycastle/asn1/LimitedInputStream;->_limit:I

    return-void
.end method


# virtual methods
.method public getLimit()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/asn1/LimitedInputStream;->_limit:I

    return v0
.end method

.method public setParentEofDetect(Z)V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/LimitedInputStream;->_in:Ljava/io/InputStream;

    instance-of v1, v0, Lorg/bouncycastle/asn1/IndefiniteLengthInputStream;

    if-eqz v1, :cond_0

    check-cast v0, Lorg/bouncycastle/asn1/IndefiniteLengthInputStream;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/asn1/IndefiniteLengthInputStream;->setEofOn00(Z)V

    :cond_0
    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
