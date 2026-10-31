.class public final Ll/ᩴܿۖ;
.super Ljava/io/Writer;
.source "TUG"


# instance fields
.field public final ᩸:Ljava/lang/StringBuilder;

.field public final ᩹:Ll/ۘܿۖ;


# direct methods
.method public constructor <init>(Ljava/lang/StringBuilder;)V
    .locals 1

    .line 80
    invoke-direct {p0}, Ljava/io/Writer;-><init>()V

    .line 78
    new-instance v0, Ll/ۘܿۖ;

    .line 125
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object v0, p0, Ll/ᩴܿۖ;->᩹:Ll/ۘܿۖ;

    .line 81
    iput-object p1, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public final append(Ljava/lang/CharSequence;)Ljava/io/Writer;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/io/Writer;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/Appendable;

    return-object p0
.end method

.method public final append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;
    .locals 1

    .line 120
    iget-object v0, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

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

.method public final write(I)V
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    int-to-char p1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    return-void
.end method

.method public final write(Ljava/lang/String;II)V
    .locals 1

    .line 108
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    iget-object v0, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {v0, p1, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-void
.end method

.method public final write([CII)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ᩴܿۖ;->᩹:Ll/ۘܿۖ;

    invoke-virtual {v0, p1}, Ll/ۘܿۖ;->֫([C)V

    .line 88
    iget-object p1, p0, Ll/ᩴܿۖ;->᩸:Ljava/lang/StringBuilder;

    add-int/2addr p3, p2

    invoke-virtual {p1, v0, p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/Appendable;

    return-void
.end method
