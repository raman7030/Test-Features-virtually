.class public final Ll/ۧ۬ۚ;
.super Ljava/io/FilterInputStream;
.source "K7EM"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:I


# direct methods
.method public constructor <init>(Ljava/io/FileInputStream;)V
    .locals 0

    .line 117
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final read()I
    .locals 2

    .line 134
    invoke-super {p0}, Ljava/io/FilterInputStream;->read()I

    move-result v0

    .line 135
    iget v1, p0, Ll/ۧ۬ۚ;->᩸:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Ll/ۧ۬ۚ;->᩸:I

    return v0
.end method

.method public final read([BII)I
    .locals 0

    .line 126
    invoke-super {p0, p1, p2, p3}, Ljava/io/FilterInputStream;->read([BII)I

    move-result p1

    if-lez p1, :cond_0

    .line 128
    iget p2, p0, Ll/ۧ۬ۚ;->᩸:I

    add-int/2addr p2, p1

    iput p2, p0, Ll/ۧ۬ۚ;->᩸:I

    :cond_0
    return p1
.end method

.method public final size()I
    .locals 1

    .line 121
    iget v0, p0, Ll/ۧ۬ۚ;->᩸:I

    return v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
