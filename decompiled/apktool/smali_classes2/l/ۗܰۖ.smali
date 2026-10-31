.class public final Ll/ۗܰۖ;
.super Ljava/io/InputStream;
.source "04CR"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public final synthetic ᩸:Ll/ۤܰۖ;


# direct methods
.method public constructor <init>(Ll/ۤܰۖ;)V
    .locals 0

    .line 757
    iput-object p1, p0, Ll/ۗܰۖ;->᩸:Ll/ۤܰۖ;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 790
    iget-object v0, p0, Ll/ۗܰۖ;->᩸:Ll/ۤܰۖ;

    invoke-virtual {v0}, Ll/ۤܰۖ;->ܽ()I

    move-result v0

    return v0
.end method

.method public final read()I
    .locals 2

    .line 761
    :try_start_0
    iget-object v0, p0, Ll/ۗܰۖ;->᩸:Ll/ۤܰۖ;

    invoke-virtual {v0}, Ll/ۤܰۖ;->ܿ()B

    move-result v0
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 v0, v0, 0xff

    return v0

    :catch_0
    move-exception v0

    .line 763
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final read([B)I
    .locals 2

    .line 770
    :try_start_0
    iget-object v0, p0, Ll/ۗܰۖ;->᩸:Ll/ۤܰۖ;

    .line 293
    array-length v1, p1

    invoke-virtual {v0, v1, p1}, Ll/ۤܰۖ;->ۧ(I[B)V

    .line 771
    array-length p1, p1
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 773
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final skip(J)J
    .locals 2

    .line 784
    iget-object v0, p0, Ll/ۗܰۖ;->᩸:Ll/ۤܰۖ;

    long-to-int v1, p1

    .line 156
    iput v1, v0, Ll/ۤܰۖ;->ܽ:I

    return-wide p1
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
