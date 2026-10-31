.class public Ll/۠ۧܺ;
.super Ljava/lang/RuntimeException;
.source "M5SW"


# instance fields
.field public ᩸:Ljava/lang/StringBuffer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    .line 80
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    .line 79
    :goto_0
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    instance-of p1, p2, Ll/۠ۧܺ;

    const/16 v0, 0xc8

    if-eqz p1, :cond_2

    .line 84
    check-cast p2, Ll/۠ۧܺ;

    iget-object p1, p2, Ll/۠ۧܺ;->᩸:Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p1

    .line 85
    new-instance p2, Ljava/lang/StringBuffer;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    invoke-direct {p2, v1}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object p2, p0, Ll/۠ۧܺ;->᩸:Ljava/lang/StringBuffer;

    .line 86
    invoke-virtual {p2, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    return-void

    .line 88
    :cond_2
    new-instance p1, Ljava/lang/StringBuffer;

    invoke-direct {p1, v0}, Ljava/lang/StringBuffer;-><init>(I)V

    iput-object p1, p0, Ll/۠ۧܺ;->᩸:Ljava/lang/StringBuffer;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;
    .locals 2

    .line 44
    instance-of v0, p1, Ll/۠ۧܺ;

    if-eqz v0, :cond_0

    .line 45
    check-cast p1, Ll/۠ۧܺ;

    goto :goto_0

    .line 47
    :cond_0
    new-instance v0, Ll/۠ۧܺ;

    const/4 v1, 0x0

    .line 69
    invoke-direct {v0, v1, p1}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    move-object p1, v0

    .line 50
    :goto_0
    invoke-virtual {p1, p0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final printStackTrace(Ljava/io/PrintStream;)V
    .locals 1

    .line 97
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->printStackTrace(Ljava/io/PrintStream;)V

    .line 98
    iget-object v0, p0, Ll/۠ۧܺ;->᩸:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    return-void
.end method

.method public final printStackTrace(Ljava/io/PrintWriter;)V
    .locals 1

    .line 106
    invoke-super {p0, p1}, Ljava/lang/RuntimeException;->printStackTrace(Ljava/io/PrintWriter;)V

    .line 107
    iget-object v0, p0, Ll/۠ۧܺ;->᩸:Ljava/lang/StringBuffer;

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/Object;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 120
    iget-object v0, p0, Ll/۠ۧܺ;->᩸:Ljava/lang/StringBuffer;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "\n"

    .line 121
    invoke-virtual {p1, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_0

    const/16 p1, 0xa

    .line 122
    invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :cond_0
    return-void

    .line 117
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "str == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
