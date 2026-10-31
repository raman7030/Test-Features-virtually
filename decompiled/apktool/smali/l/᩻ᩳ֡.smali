.class public final Ll/᩻ᩳ֡;
.super Ljava/lang/Object;
.source "J4DP"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ljava/util/logging/Logger;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 40
    const-class v0, Ll/᩻ᩳ֡;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ll/᩻ᩳ֡;->ۧ:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;)Ll/֨ᩳ֡;
    .locals 2

    .line 125
    new-instance v0, Ll/ܶᩳ֡;

    .line 69
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    if-eqz p0, :cond_0

    .line 132
    new-instance v1, Ll/ᩳᩳ֡;

    invoke-direct {v1, v0, p0}, Ll/ᩳᩳ֡;-><init>(Ll/ܶᩳ֡;Ljava/io/InputStream;)V

    return-object v1

    .line 129
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "in == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫()Ll/ۚᩳ֡;
    .locals 1

    .line 199
    new-instance v0, Ll/ܿᩳ֡;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    return-object v0
.end method

.method public static ֫(Ljava/io/File;)Ll/ۚᩳ֡;
    .locals 2

    if-eqz p0, :cond_0

    .line 187
    new-instance v0, Ljava/io/FileOutputStream;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V

    .line 65
    new-instance p0, Ll/ܶᩳ֡;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v1, Ll/ܽᩳ֡;

    invoke-direct {v1, p0, v0}, Ll/ܽᩳ֡;-><init>(Ll/ܶᩳ֡;Ljava/io/OutputStream;)V

    return-object v1

    .line 186
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "file == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/net/Socket;)Ll/ۚᩳ֡;
    .locals 2

    if-eqz p0, :cond_2

    .line 117
    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 230
    new-instance v0, Ll/ܳᩳ֡;

    invoke-direct {v0, p0}, Ll/ܳᩳ֡;-><init>(Ljava/net/Socket;)V

    .line 119
    invoke-virtual {p0}, Ljava/net/Socket;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 72
    new-instance v1, Ll/ܽᩳ֡;

    invoke-direct {v1, v0, p0}, Ll/ܽᩳ֡;-><init>(Ll/ܶᩳ֡;Ljava/io/OutputStream;)V

    .line 160
    new-instance p0, Ll/᩸ܽ֡;

    invoke-direct {p0, v0, v1}, Ll/᩸ܽ֡;-><init>(Ll/ۙܽ֡;Ll/ۚᩳ֡;)V

    return-object p0

    .line 69
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "out == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 117
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s output stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 116
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/֨ᩳ֡;)Ll/ۛܽ֡;
    .locals 1

    .line 51
    new-instance v0, Ll/ۘᩳ֡;

    invoke-direct {v0, p0}, Ll/ۘᩳ֡;-><init>(Ll/֨ᩳ֡;)V

    return-object v0
.end method

.method public static ֫(Ll/ۚᩳ֡;)Ll/ۤܽ֡;
    .locals 1

    .line 60
    new-instance v0, Ll/ܺᩳ֡;

    invoke-direct {v0, p0}, Ll/ܺᩳ֡;-><init>(Ll/ۚᩳ֡;)V

    return-object v0
.end method

.method public static ۧ(Ljava/net/Socket;)Ll/֨ᩳ֡;
    .locals 2

    if-eqz p0, :cond_2

    .line 223
    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 230
    new-instance v0, Ll/ܳᩳ֡;

    invoke-direct {v0, p0}, Ll/ܳᩳ֡;-><init>(Ljava/net/Socket;)V

    .line 225
    invoke-virtual {p0}, Ljava/net/Socket;->getInputStream()Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 132
    new-instance v1, Ll/ᩳᩳ֡;

    invoke-direct {v1, v0, p0}, Ll/ᩳᩳ֡;-><init>(Ll/ܶᩳ֡;Ljava/io/InputStream;)V

    .line 232
    new-instance p0, Ll/᩹ܽ֡;

    invoke-direct {p0, v0, v1}, Ll/᩹ܽ֡;-><init>(Ll/ۙܽ֡;Ll/֨ᩳ֡;)V

    return-object p0

    .line 129
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "in == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 223
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "socket\'s input stream == null"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 222
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "socket == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ljava/io/File;)Ll/ۚᩳ֡;
    .locals 2

    if-eqz p0, :cond_0

    .line 181
    new-instance v0, Ljava/io/FileOutputStream;

    invoke-direct {v0, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 65
    new-instance p0, Ll/ܶᩳ֡;

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    new-instance v1, Ll/ܽᩳ֡;

    invoke-direct {v1, p0, v0}, Ll/ܽᩳ֡;-><init>(Ll/ܶᩳ֡;Ljava/io/OutputStream;)V

    return-object v1

    .line 180
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "file == null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
