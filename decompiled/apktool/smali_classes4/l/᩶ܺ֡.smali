.class public final Ll/᩶ܺ֡;
.super Ljava/lang/Object;
.source "C650"


# static fields
.field public static final ֫:Ljava/util/Properties;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    const-string v0, "/systemType.properties"

    .line 379
    sget v1, Ll/ۙܺ֡;->ۧ֫:I

    const/4 v1, 0x0

    .line 459
    :try_start_0
    const-class v2, Ll/ۙܺ֡;

    invoke-virtual {v2, v0}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v0, :cond_0

    .line 461
    :try_start_1
    new-instance v2, Ljava/util/Properties;

    invoke-direct {v2}, Ljava/util/Properties;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 462
    :try_start_2
    invoke-virtual {v2, v0}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v2

    goto :goto_2

    :catchall_0
    move-exception v1

    goto :goto_0

    :catchall_1
    move-exception v2

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    .line 459
    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-object v1, v2

    goto :goto_3

    :cond_0
    :goto_2
    if-eqz v0, :cond_1

    .line 464
    :try_start_5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 379
    :catch_1
    :cond_1
    :goto_3
    sput-object v1, Ll/᩶ܺ֡;->֫:Ljava/util/Properties;

    return-void
.end method
