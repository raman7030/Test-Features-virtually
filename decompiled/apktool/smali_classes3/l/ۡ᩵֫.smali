.class public Ll/ۡ᩵֫;
.super Ljava/io/IOException;
.source "18OK"


# instance fields
.field public final ᩸:Z

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V
    .locals 0

    .line 107
    invoke-direct {p0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 108
    iput-boolean p3, p0, Ll/ۡ᩵֫;->᩸:Z

    .line 109
    iput p4, p0, Ll/ۡ᩵֫;->᩹:I

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۡ᩵֫;
    .locals 4

    .line 63
    new-instance v0, Ll/ۡ᩵֫;

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ۡ᩵֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/IllegalArgumentException;)Ll/ۡ᩵֫;
    .locals 3

    .line 37
    new-instance v0, Ll/ۡ᩵֫;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v1, v2}, Ll/ۡ᩵֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;
    .locals 2

    .line 50
    new-instance v0, Ll/ۡ᩵֫;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1, v1}, Ll/ۡ᩵֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ll/ۡ᩵֫;
    .locals 4

    .line 89
    new-instance v0, Ll/ۡ᩵֫;

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v0, p0, v3, v1, v2}, Ll/ۡ᩵֫;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ZI)V

    return-object v0
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 3

    .line 114
    invoke-super {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 115
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz v0, :cond_0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "{contentIsMalformed="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v0, p0, Ll/ۡ᩵֫;->᩸:Z

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", dataType="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۡ᩵֫;->᩹:I

    const-string v2, "}"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
