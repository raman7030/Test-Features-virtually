.class public abstract Ll/ܰܿ۠;
.super Ll/ۧܳ۠;
.source "K7QT"


# instance fields
.field public ֫:Z

.field public final ۧ:Ll/֫᩶۠;

.field public final ܽ:Ljava/util/EnumSet;


# direct methods
.method public varargs constructor <init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V
    .locals 0

    .line 531
    invoke-direct {p0}, Ll/ۧܳ۠;-><init>()V

    .line 532
    iput-object p1, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    .line 533
    array-length p1, p2

    if-nez p1, :cond_0

    .line 534
    const-class p1, Ll/֡ۖ۠;

    invoke-static {p1}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object p1

    goto :goto_0

    .line 535
    :cond_0
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/EnumSet;->copyOf(Ljava/util/Collection;)Ljava/util/EnumSet;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    return-void
.end method

.method public static ۧ(Ljava/lang/Iterable;)Ll/᩷۠ᩴ;
    .locals 1

    .line 545
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    .line 546
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 549
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 550
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-nez p0, :cond_0

    .line 553
    invoke-static {v0}, Ll/ܰܿ۠;->ܽ(Ll/᩷۠ᩴ;)V

    return-object v0

    .line 551
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "path too long for directory"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 547
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "empty path for directory"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ܽ(Ll/᩷۠ᩴ;)V
    .locals 2

    .line 558
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    new-array v1, v0, [Ll/ܳ۠ᩴ;

    .line 559
    invoke-static {p0, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_1

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 562
    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->isDirectory(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 563
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ": not a directory"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 560
    :cond_1
    new-instance v0, Ljava/io/FileNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ": does not exist"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 1

    .line 541
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "not supported for "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
