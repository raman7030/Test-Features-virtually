.class public final Ll/ۖ۠ۖ;
.super Ljava/lang/Object;
.source "74MB"


# static fields
.field public static final ֫:Ljava/nio/charset/Charset;

.field public static final ۧ:Ljava/nio/charset/Charset;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 34
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ۖ۠ۖ;->֫:Ljava/nio/charset/Charset;

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "SJIS"

    .line 39
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v1
    :try_end_0
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    .line 44
    :goto_0
    sput-object v1, Ll/ۖ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    :try_start_1
    const-string v1, "GB2312"

    .line 50
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;
    :try_end_1
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    const-string v1, "EUC_JP"

    .line 61
    invoke-static {v1}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0
    :try_end_2
    .catch Ljava/nio/charset/UnsupportedCharsetException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    nop

    .line 68
    :goto_1
    sget-object v1, Ll/ۖ۠ۖ;->ۧ:Ljava/nio/charset/Charset;

    if-eqz v1, :cond_0

    sget-object v2, Ll/ۖ۠ۖ;->֫:Ljava/nio/charset/Charset;

    .line 69
    invoke-virtual {v1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    if-eqz v0, :cond_1

    sget-object v1, Ll/ۖ۠ۖ;->֫:Ljava/nio/charset/Charset;

    .line 70
    invoke-virtual {v0, v1}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method
