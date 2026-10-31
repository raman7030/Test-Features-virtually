.class public final Ll/᩵᩷ۘ;
.super Ljava/lang/Object;
.source "Z7Y5"


# instance fields
.field public ֫:Ljava/io/InputStream;

.field public ۧ:Ljava/io/OutputStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 115
    :try_start_0
    iget-object v0, p0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    if-eqz v0, :cond_0

    .line 116
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    const/4 v0, 0x0

    .line 117
    iput-object v0, p0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 121
    :catch_0
    invoke-virtual {p0}, Ll/᩵᩷ۘ;->ܽ()V

    return-void
.end method

.method public final ֫(II[B)V
    .locals 1

    .line 95
    :cond_0
    iget-object v0, p0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    invoke-virtual {v0, p3, p1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-ltz v0, :cond_1

    add-int/2addr p1, v0

    sub-int/2addr p2, v0

    if-gtz p2, :cond_0

    return-void

    .line 97
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "End of IO Stream Read"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ljava/io/InputStream;)V
    .locals 0

    .line 62
    iput-object p1, p0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    return-void
.end method

.method public final ֫(Ljava/io/OutputStream;)V
    .locals 0

    .line 44
    iput-object p1, p0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩵᩷ۘ;->֫:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    return v0
.end method

.method public final ܽ()V
    .locals 1

    .line 106
    :try_start_0
    iget-object v0, p0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;

    if-eqz v0, :cond_0

    .line 107
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    :cond_0
    const/4 v0, 0x0

    .line 108
    iput-object v0, p0, Ll/᩵᩷ۘ;->ۧ:Ljava/io/OutputStream;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
