.class public final Ll/ۜ֫֡;
.super Ljava/lang/RuntimeException;
.source "S4DD"


# instance fields
.field public ᩸:Ljava/io/IOException;

.field public ᩹:Ljava/io/IOException;


# direct methods
.method public constructor <init>(Ljava/io/IOException;)V
    .locals 0

    .line 31
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 32
    iput-object p1, p0, Ll/ۜ֫֡;->᩸:Ljava/io/IOException;

    .line 33
    iput-object p1, p0, Ll/ۜ֫֡;->᩹:Ljava/io/IOException;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/io/IOException;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ۜ֫֡;->᩸:Ljava/io/IOException;

    return-object v0
.end method

.method public final ֫(Ljava/io/IOException;)V
    .locals 1

    .line 45
    iget-object v0, p0, Ll/ۜ֫֡;->᩸:Ljava/io/IOException;

    invoke-static {v0, p1}, Ll/᩶۟᩵;->֫(Ljava/lang/Throwable;Ljava/io/IOException;)V

    .line 46
    iput-object p1, p0, Ll/ۜ֫֡;->᩹:Ljava/io/IOException;

    return-void
.end method

.method public final ۧ()Ljava/io/IOException;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ۜ֫֡;->᩹:Ljava/io/IOException;

    return-object v0
.end method
