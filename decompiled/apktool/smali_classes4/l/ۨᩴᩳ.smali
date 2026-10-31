.class public final Ll/ۨᩴᩳ;
.super Ljava/io/FilterInputStream;
.source "A6S3"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/Closeable;)V
    .locals 0

    .line 57
    iput-object p2, p0, Ll/ۨᩴᩳ;->᩸:Ljava/io/Closeable;

    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۨᩴᩳ;->᩸:Ljava/io/Closeable;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final read([BII)I
    .locals 1

    .line 59
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
