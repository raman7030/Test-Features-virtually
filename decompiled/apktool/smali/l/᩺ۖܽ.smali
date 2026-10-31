.class public Ll/᩺ۖܽ;
.super Ljava/io/Writer;
.source "Q2RQ"


# instance fields
.field public final ᩸:Ll/ۨۖܽ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 13
    new-instance v0, Ll/ۨۖܽ;

    invoke-direct {v0}, Ll/ۨۖܽ;-><init>()V

    iput-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 16
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 17
    new-instance v0, Ll/ۨۖܽ;

    invoke-direct {v0, p1}, Ll/ۨۖܽ;-><init>(I)V

    iput-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    return-void
.end method

.method public constructor <init>(Ll/ۨۖܽ;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 21
    iput-object p1, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    return-void
.end method


# virtual methods
.method public append(C)Ljava/io/Writer;
    .locals 1

    .line 27
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->append(C)V

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;)Ll/ۨۖܽ;

    return-object p0
.end method

.method public append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;II)V

    return-object p0
.end method

.method public bridge synthetic append(C)Ljava/lang/Appendable;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Ll/᩺ۖܽ;->append(C)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 0

    .line 9
    invoke-virtual {p0, p1}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 0

    .line 9
    invoke-virtual {p0, p1, p2, p3}, Ll/᩺ۖܽ;->append(Ljava/lang/CharSequence;II)Ljava/io/Writer;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 0

    return-void
.end method

.method public final flush()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0}, Ll/ۨۖܽ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public write(I)V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->append(C)V

    return-void
.end method

.method public write(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 85
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->ۧ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public write(Ljava/lang/String;II)V
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    add-int/2addr p3, p2

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨۖܽ;->append(Ljava/lang/CharSequence;II)V

    return-void
.end method

.method public write([C)V
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0, p1}, Ll/ۨۖܽ;->֫([C)V

    return-void
.end method

.method public write([CII)V
    .locals 1

    if-eqz p1, :cond_0

    .line 92
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۨۖܽ;->֫([CII)V

    :cond_0
    return-void
.end method

.method public final ֫()Ll/ۨۖܽ;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    return-object v0
.end method

.method public final ܽ()V
    .locals 2

    .line 101
    iget-object v0, p0, Ll/᩺ۖܽ;->᩸:Ll/ۨۖܽ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۨۖܽ;->ۧ(I)V

    return-void
.end method
