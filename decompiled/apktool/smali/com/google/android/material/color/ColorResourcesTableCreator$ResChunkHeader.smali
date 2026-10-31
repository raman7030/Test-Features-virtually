.class public Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;
.super Ljava/lang/Object;
.source "ColorResourcesTableCreator.java"


# instance fields
.field public final chunkSize:I

.field public final headerSize:S

.field public final type:S


# direct methods
.method public constructor <init>(SSI)V
    .locals 0

    .line 179
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 180
    iput-short p1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->type:S

    .line 181
    iput-short p2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->headerSize:S

    .line 182
    iput p3, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->chunkSize:I

    return-void
.end method


# virtual methods
.method public writeTo(Ljava/io/ByteArrayOutputStream;)V
    .locals 1

    .line 186
    iget-short v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->type:S

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$600(S)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 187
    iget-short v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->headerSize:S

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$600(S)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 188
    iget v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResChunkHeader;->chunkSize:I

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
