.class public final Ll/ܽܺ֡;
.super Ljava/io/Writer;
.source "Q2RQ"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = -0x209fdc77c8b2a69L


# instance fields
.field public final ᩸:Ljava/lang/StringBuilder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 46
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    return-void
.end method

.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 0

    .line 66
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 67
    iput-object p1, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final append(C)Ljava/io/Writer;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(C)Ljava/lang/Appendable;
    .locals 1

    .line 78
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    return-object p0
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

    .line 140
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final write(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 165
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method

.method public final write([CII)V
    .locals 1

    if-eqz p1, :cond_0

    .line 153
    iget-object v0, p0, Ll/ܽܺ֡;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    :cond_0
    return-void
.end method
