.class public final Ll/֫۟ۡ;
.super Ljava/util/zip/DeflaterOutputStream;
.source "J4GT"


# virtual methods
.method public final close()V
    .locals 1

    .line 16
    invoke-super {p0}, Ljava/util/zip/DeflaterOutputStream;->close()V

    .line 17
    iget-object v0, p0, Ljava/util/zip/DeflaterOutputStream;->def:Ljava/util/zip/Deflater;

    invoke-virtual {v0}, Ljava/util/zip/Deflater;->end()V

    return-void
.end method
