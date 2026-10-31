.class public final Ll/ܽۨܳ;
.super Ljava/util/zip/GZIPOutputStream;
.source "F8CE"


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    const/high16 v0, 0x10000

    .line 59
    invoke-direct {p0, p1, v0}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;I)V

    .line 61
    iget-object p1, p0, Ljava/util/zip/GZIPOutputStream;->def:Ljava/util/zip/Deflater;

    invoke-static {}, Ll/ᩳۨܳ;->֫()[I

    move-result-object v0

    aget p2, v0, p2

    invoke-virtual {p1, p2}, Ljava/util/zip/Deflater;->setLevel(I)V

    return-void
.end method
