.class public final Ll/ܽۡۘ;
.super Ljava/io/IOException;
.source "77VL"


# instance fields
.field public final ᩸:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 35
    invoke-static {p1, p2}, Ll/ܽۡۘ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 36
    iput p1, p0, Ll/ܽۡۘ;->᩸:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 1

    const/4 v0, 0x4

    .line 40
    invoke-static {v0, p1}, Ll/ܽۡۘ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    iput v0, p0, Ll/ܽۡۘ;->᩸:I

    return-void
.end method

.method public static ֫(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 45
    invoke-static {p0}, Ll/ۧۡۘ;->֫(I)[Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, " (UNKNOW SFTP ERROR CODE)"

    .line 0
    invoke-static {p1, p0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, " ("

    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const/4 v0, 0x0

    .line 48
    aget-object v0, p0, v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ": "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    aget-object p0, p0, v0

    const-string v0, ")"

    .line 0
    invoke-static {p1, p0, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method
