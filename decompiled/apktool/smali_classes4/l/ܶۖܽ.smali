.class public final Ll/ܶۖܽ;
.super Ljava/io/FileInputStream;
.source "0941"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:Z


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 0

    .line 20
    invoke-direct {p0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Ll/ܶۖܽ;->᩸:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    .line 13
    iput-boolean p1, p0, Ll/ܶۖܽ;->᩸:Z

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 25
    iget-boolean v0, p0, Ll/ܶۖܽ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 29
    :cond_0
    :try_start_0
    invoke-super {p0}, Ljava/io/FileInputStream;->close()V

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Ll/ܶۖܽ;->᩸:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :goto_0
    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
