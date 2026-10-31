.class public final Ll/ۤ֨᩵;
.super Ljava/lang/Object;
.source "S4VX"


# static fields
.field public static final ֫:Ljava/nio/charset/Charset;

.field public static final ۧ:Ljava/nio/charset/Charset;

.field public static final ܽ:Ll/֫᩻֨;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 36
    const-class v0, Ll/ۤ֨᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ۤ֨᩵;->ܽ:Ll/֫᩻֨;

    const-string v0, "UTF-16LE"

    .line 38
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ۤ֨᩵;->ۧ:Ljava/nio/charset/Charset;

    const-string v0, "US-ASCII"

    .line 39
    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Ll/ۤ֨᩵;->֫:Ljava/nio/charset/Charset;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(II[B)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    add-int v1, p0, v0

    .line 154
    aget-byte v1, p2, v1

    if-eqz v1, :cond_1

    add-int/lit8 v0, v0, 0x1

    if-gt v0, p1, :cond_0

    goto :goto_0

    .line 157
    :cond_0
    new-instance p0, Ll/۬ۡ᩵;

    const-string p1, "zero termination not found"

    .line 58
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 157
    throw p0

    :cond_1
    return v0
.end method

.method public static ֫([BIILl/֨ۡ᩵;)Ljava/lang/String;
    .locals 2

    .line 139
    :try_start_0
    new-instance v0, Ljava/lang/String;

    move-object v1, p3

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->۬()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, p2, v1}, Ljava/lang/String;-><init>([BIILjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    .line 141
    new-instance p1, Ll/۬ۡ᩵;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Unsupported OEM encoding "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p3, Ll/ܰۡ᩵;

    invoke-virtual {p3}, Ll/ܰۡ᩵;->۬()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 50
    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    throw p1
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    .line 58
    :cond_0
    sget-object v0, Ll/ۤ֨᩵;->֫:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ll/֨ۡ᩵;)[B
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    .line 90
    :cond_0
    :try_start_0
    move-object v0, p1

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->۬()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 92
    new-instance v0, Ll/۬ۡ᩵;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unsupported OEM encoding "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    check-cast p1, Ll/ܰۡ᩵;

    invoke-virtual {p1}, Ll/ܰۡ᩵;->۬()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 50
    invoke-direct {v0, p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    throw v0
.end method

.method public static ۧ(II[B)I
    .locals 4

    const/4 v0, 0x0

    :cond_0
    add-int v1, p0, v0

    .line 116
    aget-byte v2, p2, v1

    if-nez v2, :cond_2

    add-int/lit8 v1, v1, 0x1

    aget-byte v1, p2, v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    :goto_0
    add-int/lit8 v0, v0, 0x2

    if-le v0, p1, :cond_0

    .line 119
    sget-object v1, Ll/ۤ֨᩵;->ܽ:Ll/֫᩻֨;

    invoke-interface {v1}, Ll/֫᩻֨;->֫()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 120
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to find string termination with max length "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ll/֫᩻֨;->ᩳ(Ljava/lang/String;)V

    .line 121
    invoke-static {p2, p0, v0}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p0

    invoke-interface {v1, p0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 123
    :cond_3
    new-instance p0, Ll/۬ۡ᩵;

    const-string p1, "zero termination not found"

    .line 58
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 123
    throw p0
.end method

.method public static ۧ(Ljava/lang/String;)[B
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [B

    return-object p0

    .line 58
    :cond_0
    sget-object v0, Ll/ۤ֨᩵;->ۧ:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ܽ(II[B)Ljava/lang/String;
    .locals 2

    .line 104
    new-instance v0, Ljava/lang/String;

    sget-object v1, Ll/ۤ֨᩵;->ۧ:Ljava/nio/charset/Charset;

    invoke-direct {v0, p2, p0, p1, v1}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    return-object v0
.end method
