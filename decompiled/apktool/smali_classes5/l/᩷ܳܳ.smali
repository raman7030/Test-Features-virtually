.class public final Ll/᩷ܳܳ;
.super Ljava/lang/Object;
.source "27BS"

# interfaces
.implements Ll/᩹ܳܳ;


# instance fields
.field public final ֫:Ljava/io/File;

.field public final ۧ:Ljava/io/FileOutputStream;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 2

    .line 391
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "NanoHTTPD-"

    const-string v1, ""

    .line 392
    invoke-static {v0, v1, p1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    move-result-object p1

    iput-object p1, p0, Ll/᩷ܳܳ;->֫:Ljava/io/File;

    .line 393
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    iput-object v0, p0, Ll/᩷ܳܳ;->ۧ:Ljava/io/FileOutputStream;

    return-void
.end method


# virtual methods
.method public final delete()V
    .locals 4

    .line 398
    iget-object v0, p0, Ll/᩷ܳܳ;->ۧ:Ljava/io/FileOutputStream;

    invoke-static {v0}, Ll/ۙܳܳ;->֫(Ljava/lang/Object;)V

    .line 399
    iget-object v0, p0, Ll/᩷ܳܳ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    .line 400
    :cond_0
    new-instance v1, Ljava/lang/Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "could not delete temporary file: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 406
    iget-object v0, p0, Ll/᩷ܳܳ;->֫:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
