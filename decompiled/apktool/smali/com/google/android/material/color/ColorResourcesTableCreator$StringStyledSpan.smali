.class public Lcom/google/android/material/color/ColorResourcesTableCreator$StringStyledSpan;
.super Ljava/lang/Object;
.source "ColorResourcesTableCreator.java"


# instance fields
.field public firstCharacterIndex:I

.field public lastCharacterIndex:I

.field public nameReference:I

.field public styleString:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 305
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$700(Lcom/google/android/material/color/ColorResourcesTableCreator$StringStyledSpan;)[B
    .locals 0

    .line 305
    iget-object p0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$StringStyledSpan;->styleString:[B

    return-object p0
.end method


# virtual methods
.method public writeTo(Ljava/io/ByteArrayOutputStream;)V
    .locals 1

    .line 313
    iget v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$StringStyledSpan;->nameReference:I

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 314
    iget v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$StringStyledSpan;->firstCharacterIndex:I

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 315
    iget v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$StringStyledSpan;->lastCharacterIndex:I

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method
