.class public final Ll/ۨ᩹ۘ;
.super Ljava/io/IOException;
.source "2A9M"


# static fields
.field public static final serialVersionUID:J = -0x361fbcd6e48551b4L


# instance fields
.field public ᩸:Ljava/lang/String;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 41
    iput p2, p0, Ll/ۨ᩹ۘ;->᩹:I

    .line 42
    iput-object p3, p0, Ll/ۨ᩹ۘ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getMessage()Ljava/lang/String;
    .locals 2

    .line 60
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-super {p0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ("

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ll/ۨ᩹ۘ;->᩹:I

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, p0, Ll/ۨ᩹ۘ;->᩸:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 55
    iget v0, p0, Ll/ۨ᩹ۘ;->᩹:I

    return v0
.end method
