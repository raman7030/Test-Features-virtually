.class public Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;
.super Ljava/lang/Object;
.source "ColorResourcesTableCreator.java"


# static fields
.field public static final DATA_TYPE_AARRGGBB:B = 0x1ct

.field public static final ENTRY_SIZE:S = 0x8s

.field public static final FLAG_PUBLIC:S = 0x2s

.field public static final SIZE:I = 0x10

.field public static final VALUE_SIZE:S = 0x8s


# instance fields
.field public final data:I

.field public final keyStringIndex:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 526
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 527
    iput p1, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;->keyStringIndex:I

    .line 528
    iput p2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;->data:I

    return-void
.end method


# virtual methods
.method public writeTo(Ljava/io/ByteArrayOutputStream;)V
    .locals 3

    const/16 v0, 0x8

    .line 532
    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$600(S)[B

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    const/4 v1, 0x2

    .line 533
    invoke-static {v1}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$600(S)[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 534
    iget v2, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;->keyStringIndex:I

    invoke-static {v2}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write([B)V

    .line 535
    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$600(S)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    new-array v0, v1, [B

    .line 536
    fill-array-data v0, :array_0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    .line 537
    iget v0, p0, Lcom/google/android/material/color/ColorResourcesTableCreator$ResEntry;->data:I

    invoke-static {v0}, Lcom/google/android/material/color/ColorResourcesTableCreator;->access$500(I)[B

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write([B)V

    return-void

    nop

    :array_0
    .array-data 1
        0x0t
        0x1ct
    .end array-data
.end method
