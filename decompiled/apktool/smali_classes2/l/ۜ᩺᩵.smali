.class public final Ll/ۜ᩺᩵;
.super Ljava/io/Writer;
.source "0B6H"


# instance fields
.field public final ᩸:Ljava/io/PrintStream;


# direct methods
.method public constructor <init>(Ljava/io/PrintStream;)V
    .locals 0

    .line 96
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 97
    iput-object p1, p0, Ll/ۜ᩺᩵;->᩸:Ljava/io/PrintStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۜ᩺᩵;->᩸:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/io/PrintStream;->close()V

    return-void
.end method

.method public final flush()V
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۜ᩺᩵;->᩸:Ljava/io/PrintStream;

    invoke-virtual {v0}, Ljava/io/PrintStream;->flush()V

    return-void
.end method

.method public final write([CII)V
    .locals 2

    .line 112
    iget-object v0, p0, Ll/ۜ᩺᩵;->᩸:Ljava/io/PrintStream;

    if-nez p2, :cond_0

    array-length v1, p1

    if-ne p3, v1, :cond_0

    .line 113
    invoke-virtual {v0, p1}, Ljava/io/PrintStream;->print([C)V

    return-void

    .line 115
    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, p1, p2, p3}, Ljava/lang/String;-><init>([CII)V

    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->print(Ljava/lang/String;)V

    return-void
.end method
