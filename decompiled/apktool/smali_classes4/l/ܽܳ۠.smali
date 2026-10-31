.class public final Ll/ܽܳ۠;
.super Ll/ۧܳ۠;
.source "K7QT"

# interfaces
.implements Ll/֫᩶۠;


# instance fields
.field public final ۗ:Ll/ۧܳ۠;

.field public final ۙ:Z

.field public final synthetic ۫:Ll/᩹ܳ۠;

.field public ۬:Ljava/util/Collection;

.field public final ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V
    .locals 0

    .line 998
    iput-object p1, p0, Ll/ܽܳ۠;->۫:Ll/᩹ܳ۠;

    invoke-direct {p0}, Ll/ۧܳ۠;-><init>()V

    .line 999
    iput-object p2, p0, Ll/ܽܳ۠;->ۗ:Ll/ۧܳ۠;

    .line 1000
    iput-object p3, p0, Ll/ܽܳ۠;->᩶:Ljava/lang/String;

    .line 1001
    iput-object p4, p0, Ll/ܽܳ۠;->᩹:Ljava/lang/String;

    .line 1002
    iput-object p5, p0, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    .line 1003
    iput-boolean p6, p0, Ll/ܽܳ۠;->ۙ:Z

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽܳ۠;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܳ۠;->᩹:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1008
    iget-object v0, p0, Ll/ܽܳ۠;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1054
    iget-object v0, p0, Ll/ܽܳ۠;->᩶:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 2

    .line 1034
    iget-object v0, p0, Ll/ܽܳ۠;->ۗ:Ll/ۧܳ۠;

    iget-object v1, p0, Ll/ܽܳ۠;->᩹:Ljava/lang/String;

    invoke-virtual {v0, p1, v1}, Ll/ۧܳ۠;->֫(Ljava/lang/Iterable;Ljava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 1

    .line 1039
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "not supported for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ܽܳ۠;->᩶:Ljava/lang/String;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Z
    .locals 2

    .line 170
    invoke-virtual {p0}, Ll/ܽܳ۠;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\\bMODULE\\b"

    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 0

    .line 1018
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 2

    .line 1049
    iget-object v0, p0, Ll/ܽܳ۠;->۫:Ll/᩹ܳ۠;

    iget-object v1, p0, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    invoke-static {v0, v1, p1}, Ll/᩹ܳ۠;->֫(Ll/᩹ܳ۠;Ljava/util/Collection;Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ()Z
    .locals 1

    .line 1013
    iget-boolean v0, p0, Ll/ܽܳ۠;->ۙ:Z

    return v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 1

    .line 1023
    iget-object v0, p0, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 1044
    iget-object v0, p0, Ll/ܽܳ۠;->᩹:Ljava/lang/String;

    return-object v0
.end method
